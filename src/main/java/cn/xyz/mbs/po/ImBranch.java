package cn.xyz.mbs.po;

/**
 * Created by fanchengwei on 2017/7/3.
 */
public class ImBranch {
    private String id;
    private String name;
    private String level;
    private String stt;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    @Override
    public String toString() {
        return "ImBranch{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", stt='" + stt + '\'' +
                '}';
    }
}
