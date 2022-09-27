package builderPattern;

public class Human {
    private String name;
    private String head;
    private String body;
    private char sex;
    private int age;
    private Size size;

    public Human(String head, String body, char sex, int age, Size size) {
        this.head = head;
        this.body = body;
        this.sex = sex;
        this.age = age;
        this.size = size;
    }

    public Human(String name, String head, String body, char sex, int age, Size size) {
        this(head, body, sex, age, size);
        this.name = name;
    }

    public String toString() {
        return "[(name : " + name + ")]"
                + "[(head : " + head + ")]"
                + "[(body : " + body + ")]"
                + "[(sex : " + sex + ")]"
                + "[(age : " + age + ")]"
                + "[(size : " + size.toString() + ")]";
    }
}
