package cn.xyz.mbs.po;

import cn.xyz.mbs.controller.volidate.Volidate1;
import cn.xyz.mbs.controller.volidate.Volidate2;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * Created by fanchengwei on 2017/6/30.
 */
public class ImUser implements Serializable{
    @NotNull(message = "{user.id.not.null}",groups = {Volidate1.class, Volidate2.class})
    private String id;
    private String branchid;
    //校验名称在1-5字符之间
    //message提示错误信息
    @Size(min = 1,max = 5,message = "{user.name.length.error}")
    private String name;
    private String desc;
    private String phone;
    private String email;
    private String address;
    private ImBranch imBranch;
    private ImRole imRole;
    private List<ImItem> imItemList;

    public List<ImItem> getImItemList() {
        return imItemList;
    }

    public void setImItemList(List<ImItem> imItemList) {
        this.imItemList = imItemList;
    }

    public ImRole getImRole() {
        return imRole;
    }

    public void setImRole(ImRole imRole) {
        this.imRole = imRole;
    }

    public ImBranch getImBranch() {
        return imBranch;
    }

    public void setImBranch(ImBranch imBranch) {
        this.imBranch = imBranch;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBranchid() {
        return branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ImUser{" +
                "id='" + id + '\'' +
                ", branchid='" + branchid + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", imBranch=" + imBranch +
                ", imRole=" + imRole +
                ", imItemList=" + imItemList +
                '}';
    }
}
