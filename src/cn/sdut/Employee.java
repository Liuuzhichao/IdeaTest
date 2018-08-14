package cn.sdut;

public class Employee {

    private int id;
    private String name;

    public Employee () {
        this(1001);
        System.out.println("null");
    }

    public Employee ( int id ) {
        this(id, "cc");//调用下面的构造器
        System.out.println("part");
    }

    public Employee ( int id, String name ) {
        this.id = id;
        this.name = name;
        System.out.println("all");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show () {
        System.out.println(id+","+name);

    }
}
