package com.wenzeng.aston.dto.query;

import java.io.Serializable;

/**
 * @author wenzeng
 * @since 1.0
 */
public class BaseQuery implements Serializable {
    private static final long serialVersionUID = -7287443408840710082L;
    private Integer offset = 0;
    private Integer limit = 50;
    private String orderBy;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
