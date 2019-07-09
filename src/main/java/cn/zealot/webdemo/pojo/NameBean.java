package cn.zealot.webdemo.pojo;

import cn.zealot.webdemo.common.SexEnum;

public class NameBean {
    private String name = new String();
    private Integer age = 0;
    private SexEnum sex = SexEnum.UNKNOWN;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
