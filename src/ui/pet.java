package ui;

import java.util.Date;

public class pet {
    private String name;
    private String brand;
    private Integer age;
    private Date brithday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    @Override
    public String toString() {
        return "pet{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", age=" + age +
                ", brithday=" + brithday +
                '}';
    }
}
