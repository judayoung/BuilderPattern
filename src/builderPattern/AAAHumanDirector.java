package builderPattern;

/**
 * Director는 Builder와 함께 쓰면 클라이언트 코드를 더 줄일 수 있다.
 * */
public class AAAHumanDirector {

    private HumanBuilder humanBuilder;

    public AAAHumanDirector(HumanBuilder humanBuilder){
        this.humanBuilder = humanBuilder;
    }

    public Human shuhua(){
        return humanBuilder.head("pretty Face")
                .sex('w')
                .age(22)
                .size(161,45)
                .build();
    }

    public Human zico(){
        return humanBuilder
                .name("우지호")
                .head("smile Face")
                .body("Long Leg")
                .sex('m')
                .size(182,65)
                .build();
    }

}
