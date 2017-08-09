package cn.xyz.mbs.service;

import cn.xyz.mbs.po.ImUser;
import cn.xyz.mbs.po.ImUserCustom;
import cn.xyz.mbs.po.ImUserVo;

import java.util.List;

/**
 * Created by fanchengwei on 2017/7/27.
 */
public interface ImUserService {
    //查询用户列表
    public List<ImUserCustom> selectImUserByIdAndName(ImUserVo imUserVo)throws Exception;

    public ImUserCustom selectImUserById(ImUserVo imUserVo)throws Exception;

    /**
     * 修改用户姓名
     * @param id 修改用户的id
     * @param imUserCustom 要修改的用户的信息
     * @throws Exception
     */
    public void updateImUser(String id,ImUserCustom imUserCustom)throws Exception;
}
