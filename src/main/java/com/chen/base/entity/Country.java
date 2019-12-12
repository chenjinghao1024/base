package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 *
 * @author Mr.D
 * @date 2019/12/12
 */
@Data
public class Country implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String code;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}