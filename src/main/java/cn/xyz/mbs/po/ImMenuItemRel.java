package cn.xyz.mbs.po;

/**
 * Created by fanchengwei on 2017/6/30.
 */
public class ImMenuItemRel {
    private String menuid;
    private String itemid;

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    @Override
    public String toString() {
        return "ImMenuItemRel{" +
                "menuid='" + menuid + '\'' +
                ", itemid='" + itemid + '\'' +
                '}';
    }
}
