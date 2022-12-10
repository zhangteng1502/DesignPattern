package 行为型模式.策略模式;

public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
