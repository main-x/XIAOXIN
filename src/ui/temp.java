package ui;

public class temp {

    public static void main(String[] args) {
        tom t = new tom();
        t.setAge(12);
        t.setName("tom");
        System.out.println("name:"+t.getName());
        System.out.println("age"+t.getAge());
    }
}

class  tom{
    private  String name;
    private  Integer age;

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


}