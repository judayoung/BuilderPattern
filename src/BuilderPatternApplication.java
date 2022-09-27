import builderPattern.HumanBuilder;
import builderPattern.Human;
import builderPattern.AAAHumanBuilder;
import builderPattern.AAAHumanDirector;

/**
 * Human -> HumanBuilder -> AAA_HumanBuilder -> AAA_HumanDirector
 * */
public class BuilderPatternApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Let's create Characters!");

        HumanBuilder humanBuilder = new AAAHumanBuilder();
        Human human = humanBuilder.head("Round Head")
                .body("Healthy Body")
                .sex('w')
                .age(35)
                .size(163, 55)
                .build();
        System.out.println("Human1 : " + human.toString());

        AAAHumanDirector AAAHumanDirector = new AAAHumanDirector(new AAAHumanBuilder());
        Human shuhua = AAAHumanDirector.shuhua();
        Human zico = AAAHumanDirector.zico();
        System.out.println("Human2 : "+shuhua.toString());
        System.out.println("Human3 : "+zico.toString());

    }

}
