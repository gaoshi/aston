package com.wenzeng.aston.web.controller;

import com.wenzeng.aston.dto.query.DictQuery;
import com.wenzeng.aston.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wenzeng
 * @since 1.0
 */
@Controller
@RequestMapping("/dict")
public class DictController {

    @Autowired
    private DictService dictService;

    @ResponseBody
    @RequestMapping("json")
    public Object dict(DictQuery dictQuery) {
        return dictService.queryDict(dictQuery);
    }
}

