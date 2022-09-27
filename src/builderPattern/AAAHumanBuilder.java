package builderPattern;

public class AAAHumanBuilder implements HumanBuilder {

    private String name;
    private String head;
    private String body;
    private char sex;
    private int age;
    private Size size;

    @Override
    public HumanBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public HumanBuilder head(String head) {
        this.head = head;
        return this;
    }

    @Override
    public HumanBuilder body(String body) {
        this.body = body;
        return this;
    }

    @Override
    public HumanBuilder sex(char sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public HumanBuilder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public HumanBuilder size(int height, int weight) {
        this.size = new Size(height, weight);
        return this;
    }

    @Override
    public Human build() {
        return new Human(name, head, body, sex, age, size);
    }
}
