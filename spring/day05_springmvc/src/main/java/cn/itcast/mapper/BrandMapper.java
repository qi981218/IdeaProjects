package cn.itcast.mapper;

import cn.itcast.pojo.Brand;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {

    @Select("select * from tb_brand")
    List<Brand> findAll();

    @Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    int add(Brand brand);

    @Delete("delete from tb_brand where id = #{id}")
    int deleteById(int id);

    int deleteByIds(@Param("ids") int[] ids);

    @Select("select count(*) from tb_brand")
    int getTotalCount();

    @Select("select * from tb_brand limit #{start}, #{pageSize}")
    List<Brand> findByPageData(@Param("start") int start, @Param("pageSize") int pageSize);


    int getTotalCountWithCondition(Brand brand);


    List<Brand> findByPageDataWithCondition(@Param("start") int start, @Param("pageSize") int pSize, @Param("brand") Brand brand);
}
