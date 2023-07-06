package demo4;

import javax.swing.*;
import java.awt.*;

/**
 * @Author 陈亚琪
 * @Date 2022/7/10 14:02
 */
public class Frame extends JFrame {
    public Frame() {
        //窗体初始化
        initFrame();
        //绘制窗体
        paintView();
        //设置窗体可见
        this.setVisible(true);

    }

    public void paintView() {
        //创建按钮
        JButton jb = new JButton("点击");
        jb.setBounds(0, 0, 100, 100);//设置按钮位置和宽高
        this.add(jb);//添加按钮
    }

    public void initFrame() {
        this.setTitle("给按钮添加事件");//标题
        this.setSize(400, 300);//大小
        this.setDefaultCloseOperation(3);//设置窗体关闭时，程序也关闭
        this.setLocationRelativeTo(null);//居中
        this.setAlwaysOnTop(true);//置顶
        this.setLayout(null);//取消默认布局

    }

}
