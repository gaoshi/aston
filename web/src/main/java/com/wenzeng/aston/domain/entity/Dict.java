package com.wenzeng.aston.domain.entity;


import java.io.Serializable;

/**
 * @author wenzeng
 * @since 1.0
 */
public class Dict implements Serializable {

    private static final long serialVersionUID = 4011777179689983284L;

    /**
     * 主键
     */
    private long id;
    /**
     * 父级字典ID
     */
    private long parentId;
    /**
     * 字典名称
     */
    private String name;
    /**
     * 字典说明
     */
    private String instruction;
    /**
     * 字典唯一编码，最大支持64位
     */
    private String uniqueCode;
    /**
     * 排序
     */
    private int sort;
    /**
     * 创建时间
     */
    private long created;
    /**
     * 更新时间
     */
    private long updated;
    /**
     * 0:未删除,1:已删除
     */
    private long isDeleted;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public long getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(long isDeleted) {
        this.isDeleted = isDeleted;
    }
}
