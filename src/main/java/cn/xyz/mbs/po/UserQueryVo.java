package cn.xyz.mbs.po;

import java.util.List;

/**
 * Created by fanchengwei on 2017/6/29.
 */
public class UserQueryVo {
    private List<Integer> ids;
    private UserCustom userCustom;


    public UserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
