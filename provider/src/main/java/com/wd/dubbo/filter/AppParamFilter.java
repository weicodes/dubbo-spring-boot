package com.wd.dubbo.filter;

import com.alibaba.dubbo.rpc.*;

public class AppParamFilter implements Filter {

    public static ThreadLocal<String> appClientIps = new ThreadLocal<String>();

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String appClientIp = RpcContext.getContext().getAttachment("appClientIp");
        appClientIps.set(appClientIp);
        return invoker.invoke(invocation);
    }
}
