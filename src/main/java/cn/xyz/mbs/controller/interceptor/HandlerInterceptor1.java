package cn.xyz.mbs.controller.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by fanchengwei on 2017/8/2.
 */
public class HandlerInterceptor1 implements HandlerInterceptor{

    //拦截器的机制是基于AOP
    //进入Handler方法之前调用
    //应用场景：用于身份认证、身份授权
    //比如身份认证，认证不通过表示当前用户未登录，需要此方法进行拦截不再向下执行
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        //return false表示拦截，不向下执行
        //return true表示放行
        return true;
    }

    //进入Handler之后，返回ModelAndView之前调用
    //应用场景：从ModelAndView出发：统一处理公用的界面模型数据，如菜单权限列表，也可以指定统一视图
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    //执行Handler之后调用
    //应用场景：统一的异常处理以及日志处理
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
