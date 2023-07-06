package cn.itcast.controller;

import cn.itcast.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users", produces = "text/html;charset=utf-8")
public class UserController {


    @GetMapping
    public String findAll(){
        //User user = new User("你好","我好");

        return "你好";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable int id){
        //User user = new User("你好","我好");
        System.out.println("findById走了");
        return "你好";
    }
}
