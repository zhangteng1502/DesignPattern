package 建造者模式;

import org.junit.Test;

public class BuilderTest {

    @Test
    public void test() {
        Diretor diretor = new Diretor(new MobileBuilder());
        Bike construct = diretor.construct();
        System.out.println(construct);

    }
}
