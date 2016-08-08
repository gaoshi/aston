package com.wenzeng.aston.dal;

import com.wenzeng.aston.domain.entity.Dict;
import com.wenzeng.aston.dto.query.DictQuery;

import java.util.List;

/**
 * @author wenzeng
 * @since 1.0
 */
public interface DictDao {

    List<Dict> queryDict(DictQuery dictQuery);
}
