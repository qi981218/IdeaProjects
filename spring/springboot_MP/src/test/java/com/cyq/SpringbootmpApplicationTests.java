package com.cyq;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cyq.entity.TbBrand;
import com.cyq.mapper.TbBrandMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootmpApplicationTests {
	@Autowired
	TbBrandMapper tbBrandMapper;

	@Test
	void contextLoads() {
		//当前页，每页个数  limit 2,5
		IPage<TbBrand> page=new Page<>(2,5);
		tbBrandMapper.selectPage(page,null);
	}

}
