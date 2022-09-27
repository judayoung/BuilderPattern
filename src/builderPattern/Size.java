package builderPattern;

public class Size {

    private int height;
    private int weight;

    public Size(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return "[(height : " + height + ")]"
                + "[(weight : " + weight + ")]";
    }

}
