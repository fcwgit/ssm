package cn.xyz.mbs.po;

import java.util.List;
import java.util.Map;

/**
 * Created by fanchengwei on 2017/7/27.
 * vo包装对象包含相关Bean
 */
public class ImUserVo  {
    private ImUser imUser;
    private ImUserCustom imUserCustom;
    private List<ImUserCustom> imUserCustomList;
    private Map<String,Object> imUserMap;

    public Map<String, Object> getImUserMap() {
        return imUserMap;
    }

    public void setImUserMap(Map<String, Object> imUserMap) {
        this.imUserMap = imUserMap;
    }

    public List<ImUserCustom> getImUserCustomList() {
        return imUserCustomList;
    }

    public void setImUserCustomList(List<ImUserCustom> imUserCustomList) {
        this.imUserCustomList = imUserCustomList;
    }

    public ImUser getImUser() {
        return imUser;
    }

    public void setImUser(ImUser imUser) {
        this.imUser = imUser;
    }

    public ImUserCustom getImUserCustom() {
        return imUserCustom;
    }

    public void setImUserCustom(ImUserCustom imUserCustom) {
        this.imUserCustom = imUserCustom;
    }
}
