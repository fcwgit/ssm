package cn.xyz.mbs.mapper;

import cn.xyz.mbs.po.ImUser;
import cn.xyz.mbs.po.ImUserCustom;
import cn.xyz.mbs.po.ImUserVo;

import java.util.List;

/**
 * Created by fanchengwei on 2017/7/27.
 */
public interface ImUserMapper {
    public List<ImUserCustom> selectImUserByIdAndName(ImUserVo imUserVo)throws Exception;

    public ImUser selectImUserById(ImUserVo imUserVo)throws Exception;

    public void updateImUserById(ImUserCustom imUserCustom)throws Exception;
}
