package com.chen.base.entity;

import lombok.Data;

import java.util.Map;

/**
 * @author Administrator
 */
@Data
public class PageParams {
    Integer pageNumber;
    Integer pageSize;
    Map<String, String> searchMap;
}
