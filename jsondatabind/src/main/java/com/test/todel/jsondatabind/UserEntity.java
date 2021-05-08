package com.test.todel.jsondatabind;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description: ʵ�嶨��
 * <p>
 * Create:      2018/9/6 22:37
 *
 * @author Yang Meng
 */
public class UserEntity {

    public UserEntity() {}

    public UserEntity(String uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    /** ʵ���ʶ�� */
    @JsonProperty("UID")
    private String uid;

    @JsonProperty("name")
    private String name;

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

