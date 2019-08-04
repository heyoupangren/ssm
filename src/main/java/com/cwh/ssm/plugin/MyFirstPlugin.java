package com.cwh.ssm.plugin;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import javax.lang.model.SourceVersion;
import java.util.Properties;

/**
 * @author Cwh
 * CreateTime 2019/8/4 17:26
 */

/**
 * 插件编写
 *  1、编写Interceptor的实现类
 *  2、使用@Intercepts注解完成插件签名
 *  3、将写好的插件注册到全局配置文件中
 */


/**
 * 完成插件签名：
 *      告诉MyBatis当前插件用来拦截哪个对象哪个方法
 */
@Intercepts({
        @Signature(type = StatementHandler.class,method = "parameterize",args = java.sql.Statement.class)
})
public class MyFirstPlugin implements Interceptor {
    /**
     *intercept:拦截：
     *      拦截目标对象的目标方法的执行
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        System.out.println("MyFirstPlugin...intercept: "+invocation.getMethod());

 /*       //动态的改变一下SQL运行的参数：以前1号员工，实际从数据库查询6号员工
        Object target = invocation.getTarget();
        System.out.println("当前拦截到的对象："+target);
        //拿到：StatementHandler==>ParameterHandler==>parameterObject
        //拿到target的元数据
        MetaObject metaObject = SystemMetaObject.forObject(target);
        Object value = metaObject.getValue("parameterHandler.parameterObject");
        System.out.println("value = " + value);
        //修改完SQL语句要用的参数
        metaObject.setValue("parameterHandler.parameterObject","6");*/
        //执行目标方法
        Object proceed = invocation.proceed();
        //返回执行后的返回值
        return proceed;
    }

    /**
     *plugin:
     *      包装目标对象的：包装:为目标对象创建一个代理对象
     */
    @Override
    public Object plugin(Object target) {
        System.out.println("MyFirstPlugin...plugin:MyBatis将要包装的对象："+target);
        //我们可以借助Plugin的wrap方法来使用当前Interceptor包装我们的目标对象
        Object wrap = Plugin.wrap(target, this);
        //返回为当前target创建的代理对象
        return wrap;
    }

    /**
     * setProperties:
     *          将插件注册的property属性设置进来
     */
    @Override
    public void setProperties(Properties properties) {

        System.out.println("插件配置的信息："+properties);
    }
}
