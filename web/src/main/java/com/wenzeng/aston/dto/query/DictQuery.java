package com.wenzeng.aston.dto.query;

import java.io.Serializable;

/**
 * @author wenzeng
 * @since 1.0
 */
public class DictQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 5435650765941834890L;

    private Long id;
    private Long parentId;
    private String name;
    private String orderBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getOrderBy() {
        return orderBy;
    }

    @Override
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
