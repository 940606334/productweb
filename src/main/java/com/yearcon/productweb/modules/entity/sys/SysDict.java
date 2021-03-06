package com.yearcon.productweb.modules.entity.sys;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author ayong
 * @create 2018-03-02 9:22
 **/
@Entity
@Table(name = "sys_dict", schema = "jeeplus_schema", catalog = "")
public class SysDict {
    private String id;
    private String value;
    private String label;
    private String type;
    private String description;
    private int sort;
    private String parentId;
    private String createBy;
    private Timestamp createDate;
    private String updateBy;
    private Timestamp updateDate;
    private String remarks;
    private String delFlag;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "sort")
    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "parent_id")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "create_by")
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "update_by")
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "update_date")
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "del_flag")
    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysDict sysDict = (SysDict) o;
        return sort == sysDict.sort &&
                Objects.equals(id, sysDict.id) &&
                Objects.equals(value, sysDict.value) &&
                Objects.equals(label, sysDict.label) &&
                Objects.equals(type, sysDict.type) &&
                Objects.equals(description, sysDict.description) &&
                Objects.equals(parentId, sysDict.parentId) &&
                Objects.equals(createBy, sysDict.createBy) &&
                Objects.equals(createDate, sysDict.createDate) &&
                Objects.equals(updateBy, sysDict.updateBy) &&
                Objects.equals(updateDate, sysDict.updateDate) &&
                Objects.equals(remarks, sysDict.remarks) &&
                Objects.equals(delFlag, sysDict.delFlag);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, value, label, type, description, sort, parentId, createBy, createDate, updateBy, updateDate, remarks, delFlag);
    }
}
