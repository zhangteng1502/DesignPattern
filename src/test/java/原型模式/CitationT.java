package 原型模式;

import org.junit.Test;

public class CitationT {

    @Test
    public void test() {
        try {
            Citation citation = new Citation();
            citation.setName("张三");

            Citation clone = citation.clone();
            clone.setName("李四");
            citation.show();
            clone.show();

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
