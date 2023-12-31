package com.huike.report.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huike.clues.domain.vo.IndexStatisticsVo;

/**
 * 首页统计分析的Mapper
 *
 * @author Administrator
 */
public interface ReportMapper {
    /**=========================================基本数据========================================*/
    /**
     * 获取线索数量
     *
     * @param beginCreateTime 开始时间
     * @param endCreateTime   结束时间
     * @param username        用户名
     * @return
     */
    Integer getCluesNum(@Param("startTime") String beginCreateTime,
                        @Param("endTime") String endCreateTime,
                        @Param("username") String username);

    /**
     * 获取商机数量
     *
     * @param beginCreateTime 开始时间
     * @param endCreateTime   结束时间
     * @param username        用户名
     * @return
     */
    Integer getBusinessNum(@Param("startTime") String beginCreateTime,
                           @Param("endTime") String endCreateTime,
                           @Param("username") String username);

    /**
     * 获取合同数量
     *
     * @param beginCreateTime 开始时间
     * @param endCreateTime   结束时间
     * @param username        用户名
     * @return
     */
    Integer getContractNum(@Param("startTime") String beginCreateTime,
                           @Param("endTime") String endCreateTime,
                           @Param("username") String username);

    /**
     * 获取合同金额
     *
     * @param beginCreateTime 开始时间
     * @param endCreateTime   结束时间
     * @param username        用户名
     * @return
     */
    Double getSalesAmount(@Param("startTime") String beginCreateTime,
                          @Param("endTime") String endCreateTime,
                          @Param("username") String username);


    /**=========================================今日简报========================================*/

    /**
     * 获取今日新增线索
     *
     * @param username
     * @return
     */
    Integer getTodayCluesNum(String username);

    /**
     * 获取今日新增商机
     *
     * @param username
     * @return
     */
    Integer getTodayBusinessNum(String username);

    /**
     * 获取今日新增客户
     *
     * @param username
     * @return
     */
    Integer getTodayContractNum(String username);

    /**
     * 获取今日销售额
     *
     * @param username
     * @return
     */
    Double getTodaySalesAmount(String username);


    /**=========================================待办========================================*/

}
