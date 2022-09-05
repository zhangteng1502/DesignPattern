package 建造者模式;

public class Diretor {

    private Builder builder;

    public Diretor(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeate();
        return builder.createBike();
    }
}
