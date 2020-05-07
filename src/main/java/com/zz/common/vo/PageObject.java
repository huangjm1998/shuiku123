package com.zz.common.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class PageObject<T> implements Serializable {
    //总条数数
    private Integer rowCount = 0;
    //总页数
    private Integer pageCount = 0;
    //当前页
    private Integer pageCurrent = 1;
    //页面大小
    private Integer pageSize;
    //总记录数
    private List<T> records;

    public PageObject(Integer rowCount, Integer pageCurrent, Integer pageSize, List<T> records) {
        super();
        this.rowCount = rowCount;
        //总页数
        this.pageCount = (rowCount - 1) / pageSize + 1;
        this.pageCurrent = pageCurrent;
        this.pageSize = pageSize;
        this.records = records;
    }

}
