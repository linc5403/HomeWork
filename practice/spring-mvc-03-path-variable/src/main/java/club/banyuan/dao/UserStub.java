package club.banyuan.dao;

public class UserStub {
    public String getName() {
        return name;
    }

    private String name;
    private int id;
    private int age;

    public UserStub(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
