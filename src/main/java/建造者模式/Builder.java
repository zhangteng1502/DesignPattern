package 建造者模式;

public abstract class Builder {

    protected Bike bike = new Bike();

    public  abstract void buildFrame();

    public abstract void buildSeate();

    public abstract Bike createBike();


}
