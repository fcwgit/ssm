package cn.xyz.mbs.po;

/**
 * Created by fanchengwei on 2017/7/3.
 * Custom扩展对象继承基础对象
 */
public class ImUserCustom extends ImUser {
    private String rolename;
    private String level;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        super.toString();
        return "ImUserCustom{" +
                "name='"+ super.getName() + "\'"+
                "rolename='" + rolename + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
