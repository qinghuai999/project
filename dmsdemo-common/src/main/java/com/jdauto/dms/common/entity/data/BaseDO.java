package com.jdauto.dms.common.entity.data;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import com.baomidou.mybatisplus.annotation.TableId;


import java.io.Serializable;

/**
 *
 * @Author: sushiqi
 * @Date: 2020年04月25日 20:46:32
 * @Description: 基本数据
 */
@Data
@ToString
@EqualsAndHashCode
public class BaseDO implements Serializable {
    /**
     * 主键id
     */
//    @TableId(value = "")
    private Long id;



}
