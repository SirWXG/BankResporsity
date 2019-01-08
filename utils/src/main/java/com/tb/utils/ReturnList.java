package com.tb.utils;

import java.util.List;

/**
 * 分页查询数据包装
 * @author 何龙
 * @create 2019-01-08 23:54
 */
public class ReturnList {
    /**
     * 数据总条数
     */
    private Long total;
    /**
     * 数据列表
     */
    private List<?> list;

    private ReturnList() {}

    /**
     * 静态方法返回
     * @param total 数据总数
     * @param list 数据列表
     * @return ReturnList
     */
    public static ReturnList get(Long total, List<?> list) {
        ReturnList r =new ReturnList();
        r.total = total;
        r.list = list;
        return r;
    }

    @Override
    public String toString() {
        return "ReturnList{" +
                "total=" + total +
                ", list=" + list +
                '}';
    }
}
