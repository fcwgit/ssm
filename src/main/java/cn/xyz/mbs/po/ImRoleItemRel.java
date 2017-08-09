package cn.xyz.mbs.po;

/**
 * Created by fanchengwei on 2017/6/30.
 */
public class ImRoleItemRel {
    private String roleid;
    private String itemid;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    @Override
    public String toString() {
        return "ImRoleItemRel{" +
                "roleid='" + roleid + '\'' +
                ", itemid='" + itemid + '\'' +
                '}';
    }
}
