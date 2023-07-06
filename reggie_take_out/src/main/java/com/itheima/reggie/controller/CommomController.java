package com.itheima.reggie.controller;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.itheima.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

/**
 * 文件上传和下载
 */
@RestController
@RequestMapping("/common")
@Slf4j
public class CommomController {

    @Value("${reggie.path}")
    private String path;

    @PostMapping("/upload")
    public R<String> upload(MultipartFile file) {

        //获取文件后缀名 .jpg/.png....   file.getOriginalFilename():abc.jpg
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        log.info("文件后缀名:{}", suffix);
        //使用UUID重新生成文件名
        String fileName = UUID.randomUUID().toString() + suffix;

        String millisecond = IdWorker.getMillisecond();//根据时间生成id的雪花算法
        Long idWorkerId = IdWorker.getId();//雪花算法

        System.out.println(millisecond + "-----------------------------");
        System.out.println(idWorkerId + "-----------------------------");

        log.info("重新生成的文件名:{}", fileName);
        //创建一个目录对象
        File dir = new File(path);
        log.info("目录:{}", dir);
        //判断目录是否存在  不存在则删除
        if (!dir.exists()) {
            //目录不存在，需要创建
            dir.mkdir();
        }
        //将临时文件转存到指定位置
        try {
            file.transferTo(new File(path + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return R.success(fileName);
    }

    @GetMapping("/download")
    public void download(String name, HttpServletResponse response) {

        try {
            //输入流，通过输入流读取文件内容
            FileInputStream fileInputStream = new FileInputStream(new File(path + name));
            //输出流，通过输出流将文件写回浏览器
            ServletOutputStream outputStream = response.getOutputStream();

            response.setContentType("image/jpeg");

            int len = 0;//读到哪了
            byte[] bytes = new byte[1024];

            while ((len = fileInputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
                outputStream.flush();
            }

            //关闭资源
            outputStream.close();
            fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
