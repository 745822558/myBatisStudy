package com.lax.domain;

/**
 * @Description :
 * @Author : Create By liAnXin
 * @ClassName : User
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String add;

    public User() {
    }

    public User(Integer id, String name, Integer age, String add) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.add = add;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}