package 建造者模式;

public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeate() {
        bike.setSeate("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
