package com.example.demo.service.iml;

import com.example.demo.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.model.DemoUser;
import com.example.demo.mapper.DemoUserMapper;
import com.example.demo.service.DemoUserService;

import java.util.List;

@Service
public class DemoUserServiceImpl extends ServiceImpl<DemoUserMapper, DemoUser> implements DemoUserService{
    @Autowired
    DemoUserMapper demoUserMapper;
}
