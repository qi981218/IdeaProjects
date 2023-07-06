package com.huike.review.mapper;

import com.huike.review.pojo.Review;
import com.huike.review.vo.MybatisReviewVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Mybatis复习的Mapper层
 */
public interface MybatisReviewMapper {


    /**======================================================新增======================================================**/
    int saveData(@Param("name") String name, @Param("age")String age,@Param("sex") String sex);
    /**======================================================删除======================================================**/

    /**======================================================修改======================================================**/

    /**======================================================简单查询===================================================**/

}
