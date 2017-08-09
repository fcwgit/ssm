package cn.xyz.mbs.po;

import java.io.Serializable;

/**
 * Created by fanchengwei on 2017/6/30.
 */
public class ImRole implements Serializable{
    private String id;
    private String name;
    private String desc;
    private String level;
    private String branchid;
    private ImItem item;

    public ImItem getItem() {
        return item;
    }

    public void setItem(ImItem item) {
        this.item = item;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getBranchid() {
        return branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    @Override
    public String toString() {
        return "ImRole{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", level='" + level + '\'' +
                ", branchid='" + branchid + '\'' +
                ", item=" + item +
                '}';
    }
}
