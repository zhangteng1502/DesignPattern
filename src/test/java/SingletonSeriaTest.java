import org.junit.Test;
import 单例设计模式.SingletonEH;
import 单例设计模式.SingletonSeria;

import java.io.*;

public class SingletonSeriaTest {

    @Test
    public void SingletonSeriaTest() throws Exception {
        //往文件中写对象
        writeObject2File();
        //从文件中读取对象
        单例设计模式.SingletonSeria s1 = readObjectFromFile();
        单例设计模式.SingletonSeria s2 = readObjectFromFile();
        //判断两个反序列化后的对象是否是同一个对象
        //上面代码运行结果是 false ，表明序列化和反序列化已经破坏了单例设计模式
        System.out.println(s1 == s2);
    }

    private static 单例设计模式.SingletonSeria readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\project\\wenjian\\nihao.txt"));
        单例设计模式.SingletonSeria singletonSeria = (单例设计模式.SingletonSeria) ois.readObject();
        return singletonSeria;
    }

    public static void writeObject2File() throws Exception {
        //获取Singleton类的对象
        单例设计模式.SingletonSeria instance = 单例设计模式.SingletonSeria.getInstance();
        //创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new
                FileOutputStream("D:\\project\\wenjian\\nihao.txt"));
        //将instance对象写出到文件中
        oos.writeObject(instance);
    }
}
