package 建造者模式;

public class MobileBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeate() {
        bike.setSeate("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
