package com.wenzeng.aston.service;

import com.wenzeng.aston.domain.entity.Dict;
import com.wenzeng.aston.dto.query.DictQuery;

import java.util.List;

/**
 * @author wenzeng
 * @since 1.0
 */
public interface DictService {

    String BEAN_NAME = "dictService";

    List<Dict> queryDict(DictQuery dictQuery);
}
