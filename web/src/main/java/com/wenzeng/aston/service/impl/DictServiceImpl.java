package com.wenzeng.aston.service.impl;

import com.wenzeng.aston.dal.DictDao;
import com.wenzeng.aston.domain.entity.Dict;
import com.wenzeng.aston.dto.query.DictQuery;
import com.wenzeng.aston.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wenzeng
 * @since 1.0
 */
@Service(DictService.BEAN_NAME)
public class DictServiceImpl implements DictService {

    @Autowired
    private DictDao dictDao;

    @Override
    public List<Dict> queryDict(DictQuery dictQuery) {
        return dictDao.queryDict(dictQuery);
    }
}

