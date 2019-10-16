package com.company.async;

/**
 * 回调接口类
 *
 * @author ynx
 * @version V1.0
 * @date 2019-10-16
 * @modified_date 2019-10-16
 */
public interface CallBack {
    //处理结果回调
    public void process(String message);
    //服务端接收回调
    public void report(String message);
}
