package cn.itcast.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand {
    private Integer id;
    private String brandName;
    private String companyName;
    private Integer status;
    private String description;
    private Integer ordered;

}
