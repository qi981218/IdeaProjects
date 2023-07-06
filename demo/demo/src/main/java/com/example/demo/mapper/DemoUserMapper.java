package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.DemoUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author admin
 */
@Mapper
public interface DemoUserMapper extends BaseMapper<DemoUser> {

}