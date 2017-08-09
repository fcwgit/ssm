package cn.xyz.mbs.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by fanchengwei on 2017/7/31.
 */
public class CustomExceptionResolver implements HandlerExceptionResolver{

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) {
        //handler就是处理器适配器要执行的Handler对象（只有method）
        /**
         * 解析出异常类型
         * 如果该异常为系统自定义的异常，直接取出异常信息，在错误页面展示
         * 如果该异常不是系统自定义的异常，构造一个自定义的异常（信息为"未知错误"）
         */
        CustomerException customerException = null;
        if(e instanceof CustomerException){
            customerException = (CustomerException)e;
        }else{
            customerException = new CustomerException("未知异常");
        }
        String message = customerException.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message",message);
        modelAndView.setViewName("error");

        return modelAndView;
    }
}
