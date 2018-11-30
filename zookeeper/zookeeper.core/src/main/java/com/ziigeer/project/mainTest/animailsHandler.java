package com.ziigeer.project.mainTest;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class animailsHandler<T,S> implements InvocationHandler {

    private T t;

    private S s;

    public animailsHandler(T t, S s) {
        this.t = t;
        this.s = s;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //预处理
        System.out.println(" 预处理");
        //直接 调用 被 代理 类 的 方法
        Object obj = method.invoke(t, args);
        //后 处理
        System.out.println(" 后处理");
        return obj;
    }


    public static void main(String[] args) {
        Animails a = new cat();
        //代理 实例 的 处理Handler
        InvocationHandler handler = new animailsHandler(a, "123");
        //当前 加载 器
        ClassLoader cl = a.getClass().getClassLoader();
        //动态 代理
        Animails proxy = (Animails) Proxy.newProxyInstance(cl, a.getClass().getInterfaces(), handler);
        //执行 具体 主题 角色 方法 proxy. request();
        proxy.name("123");


    }
}
