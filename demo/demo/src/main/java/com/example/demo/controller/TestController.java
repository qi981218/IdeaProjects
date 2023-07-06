package com.example.demo.controller;

import com.example.demo.model.DemoUser;
import com.example.demo.service.DemoUserService;
import com.example.demo.util.R;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.junit.Test;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author admin
 */
@RestController
@Slf4j
@RequestMapping("test")
@RequiredArgsConstructor
public class TestController {
    private final DemoUserService demoUserService;

}
