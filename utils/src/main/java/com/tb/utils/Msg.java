package com.tb.utils;

/**
 * 数据返回规范类
 * @author 何龙
 * @create 2019-01-08 23:16
 */
public class Msg {
    /**
     * 状态码
     * 0:接口正常
     * 1:接口异常
     */
    private Integer code=0;
    /**
     * 接口异常提示信息
     */
    private String msg;
    /**
     * 接口返回数据全部封装在data里
     */
    private Object data;


    /**
     * 接口正常返回
     * @param obj 返回数据
     * @return msg对象
     */
    public static Msg success(Object obj){
        Msg m=new Msg();
        m.code=0;
        m.msg="";
        m.data= obj;
        return m;
    }

    /**
     * 接口异常
     * @param code 状态码
     * @param msg 异常信息
     * @return msg
     */
    public static Msg error(Integer code,String msg){
        Msg m=new Msg();
        m.code=code;
        m.msg=msg;
        return m;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
