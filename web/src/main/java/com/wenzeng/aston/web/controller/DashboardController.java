package com.wenzeng.aston.web.controller;

import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wenzeng
 * @since 1.0
 */
@Controller
public class DashboardController {

    @RequestMapping({"/dashboard", "/main", "/"})
    public String dashboard() {
        return "dashboard";
    }
}

