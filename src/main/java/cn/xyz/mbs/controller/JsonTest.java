package cn.xyz.mbs.controller;

import cn.xyz.mbs.po.ImUser;
import cn.xyz.mbs.po.ImUserCustom;
import cn.xyz.mbs.po.ImUserVo;
import cn.xyz.mbs.service.ImUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fanchengwei on 2017/8/1.
 * test github
 */
@Controller
public class JsonTest {

    @Autowired
    private ImUserService imUserService;

    //请求json串，返回json串
    //@RequestBody将请求的用户信息的json串，转成imUser对象
    //@ResponseBody将imUser转成json输出
    @RequestMapping("requestJson")
    public @ResponseBody ImUser requestJson(@RequestBody ImUser imUser)throws Exception{
        System.out.println(imUser);
        return imUser;
    }


    //请求json串，返回json串
    //@RequestBody将请求的用户信息的json串，转成imUser对象
    //@ResponseBody将imUser转成json输出
    @RequestMapping("responceJson")
    public @ResponseBody ImUser responceJson( ImUser imUser)throws Exception{
        System.out.println(imUser);
        return imUser;
    }

    //查询用户信息，输出json
    //userView/{id}里边的{id}表示将这个位置的参数传到@PathVariable指定名称中
    @RequestMapping("userViewTest/{id}")
    public @ResponseBody ImUserCustom userView(@PathVariable("id") String id)throws Exception{
        ImUserVo imUserVo = new ImUserVo();
        ImUserCustom imUserCustom = new ImUserCustom();
        imUserCustom.setId(id);
        imUserVo.setImUserCustom(imUserCustom);
        imUserCustom = imUserService.selectImUserById(imUserVo);

        return imUserCustom;
    }
}
