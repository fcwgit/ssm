package cn.xyz.mbs.po;

/**
 * Created by fanchengwei on 2017/6/30.
 */
public class ImMenu {
    private String id;
    private String name;
    private String desc;
    private String parentid;
    private String stt;
    private String level;

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

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "ImMenu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", parentid='" + parentid + '\'' +
                ", stt='" + stt + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
