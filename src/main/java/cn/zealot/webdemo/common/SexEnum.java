package cn.zealot.webdemo.common;

public enum SexEnum {
    UNKNOWN(0, "未知"),
    BOY(1, "男"),
    GIRL(2, "女");

    private Integer value;
    private String des;

    SexEnum(Integer value, String des) {
        this.value = value;
        this.des = des;
    }


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
