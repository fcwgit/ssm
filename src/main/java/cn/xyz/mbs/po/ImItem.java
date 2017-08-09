package cn.xyz.mbs.po;

/**
 * Created by fanchengwei on 2017/6/30.
 */
public class ImItem {
    private String id;
    private String name;
    private String url;
    private String tradeid;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    @Override
    public String toString() {
        return "ImItem{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", tradeid='" + tradeid + '\'' +
                ", stt='" + stt + '\'' +
                '}';
    }
}
