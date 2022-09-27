package builderPattern;

public interface HumanBuilder {

    HumanBuilder name(String name);
    HumanBuilder head(String head);
    HumanBuilder body(String body);
    HumanBuilder sex(char sex);
    HumanBuilder age(int age);
    HumanBuilder size(int height, int weight);
    Human build();

}
