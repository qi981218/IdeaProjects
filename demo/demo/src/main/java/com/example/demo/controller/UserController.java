package com.example.demo.controller;

import com.example.demo.model.DemoUser;
import com.example.demo.service.DemoUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author admin
 */
@RestController
@Slf4j
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final DemoUserService demoUserService;

    //查询所有数据
    @GetMapping
    public List<DemoUser> test(MultipartFile[] files){
      //  OSSClient ossClient = new OSSClient("http://oss-cn-shenzhen.aliyuncs.com", "LTAI5tFSCdmQzoLBMX3f1zZT", "v7h03ZKNMUwewWNKk01bs4GyMUW1aA");//地域节点,

      //  ossClient.putObject()
        return  demoUserService.list(null);
    }

    //删除单条数据
    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable int id){
        return demoUserService.removeById(id);
    }

    //添加数据
    @PutMapping
    public boolean add(@RequestBody DemoUser user){
        return demoUserService.save(user);
    }

    //修改数据
    @PatchMapping
    public boolean update(@RequestBody DemoUser user){
        return demoUserService.updateById(user);
    }

//    @PostMapping("add")
//    public R<Boolean> add(DemoUser user) {
////        int row = demoUserService.add(user);
////        if (row > 0) {
////            return R.ok();
////        } else {
//            return R.fail();
////        }
//
//    }
}
