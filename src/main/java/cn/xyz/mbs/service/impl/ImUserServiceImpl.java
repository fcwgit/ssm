package cn.xyz.mbs.service.impl;

import cn.xyz.mbs.mapper.ImUserMapper;
import cn.xyz.mbs.po.ImUser;
import cn.xyz.mbs.po.ImUserCustom;
import cn.xyz.mbs.po.ImUserVo;
import cn.xyz.mbs.service.ImUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by fanchengwei on 2017/7/27.
 * 商品管理
 */
public class ImUserServiceImpl implements ImUserService{

    @Autowired
    private ImUserMapper imUserMapper;
    @Override
    public List<ImUserCustom> selectImUserByIdAndName(ImUserVo imUserVo) throws Exception {
        return imUserMapper.selectImUserByIdAndName(imUserVo);
    }

    @Override
    public ImUserCustom selectImUserById(ImUserVo imUserVo) throws Exception {
        ImUser imUser = imUserMapper.selectImUserById(imUserVo);
        //对imUserCustom进行业务处理
        ImUserCustom imUserCustom = new ImUserCustom();
        BeanUtils.copyProperties(imUser,imUserCustom);
        return imUserCustom;
    }

    @Override
    public void updateImUser(String id,ImUserCustom imUserCustom)throws Exception{
        //添加业务校验，通常在service接口对关键参数进行合法性校验
        //校验id是否为空，如果为空则抛出异常
        imUserMapper.updateImUserById(imUserCustom);
    }

}
