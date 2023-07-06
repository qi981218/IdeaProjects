package com.itheima.mapper;

import com.itheima.entity.TbBrand;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 陈亚琪
 * @date 2022年08月12日 19:44
 * @version: 1.0
 */
public interface TbBrandMapper {
//    //使用注解配置映射
//    @Results(id = "map", value = {
//            @Result(property = "brandName", column = "brand_name"),
//            @Result(property = "companyName", column = "company_name")
//    })


    //查询所有信息
    @Select("select * from tb_brand")
    List<TbBrand> all();


    //添加数据
//    @ResultMap("map")
    @Insert("insert into tb_brand (brand_name, company_name,description, status) values" +
            " (#{brandName}, #{companyName},#{description},#{status})")
    //返回添加的主键
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int addTbBrand(TbBrand tbBrand);

    //删除单条数据
    @Delete("delete from tb_brand where id=#{id} ")
    int deleteServlet(int id);

    //修改状态
    @Update("update tb_brand set status=#{status} where id=#{id}")
    int updateStatusServlet(@Param("id") int id, @Param("status") int status);

    //查询要修改的信息
//    @ResultMap("map")
    @Select("select * from tb_brand where id=#{id}")
    TbBrand updateSelectServlet(int id);

    //修改页面
//    @ResultMap("map")
    int updateTbBrandServlet(TbBrand tbBrand);

    int deleteByIds(@Param("ids") int[] ids);

    //查询总条数
    int totalAll(TbBrand tbBrand);


    //   动态分页加条件查询
    List<TbBrand> pagingQuery(@Param("start") int start, @Param("pageSize") int pageSize, @Param("tbBrand") TbBrand tbBrand);
}
