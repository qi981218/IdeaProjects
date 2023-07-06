package domain.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class TbClueExcelVo {
    /**
     * 强制读取第0 列 这里不建议 index 和 value 同时用，要么一个对象只用index，要么一个对象只用value去匹配
     */
    @ExcelProperty(index = 0)
    private String phone;
    /**
     * 渠道()
     */
    @ExcelProperty(value="渠道来源")
    private String channel;
    /**
     * 活动编号 (来源于活动列表8位字母或数字)
     */
    private String activityCode;

    /**
     * "客户姓名
     **/
    private String name;
    /**
     * 意向学科
     */
    private String subject;
    /**
     * 意向级别
     */
    private String level;
    /**
     * 性别
     */
    private String sex;
    /**
     * 年龄
     */
    private Long age;
    /**
     * 微信
     */
    private String weixin;
    /**
     * qq
     */
    private String qq;
}