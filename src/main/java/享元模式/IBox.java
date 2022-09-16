package 享元模式;

/**
 * @version v1.0
 * @ClassName: IBox
 * @Description: I图形类(具体享元角色)
 * @Author:
 */
public class IBox extends AbstractBox {

    @Override
    public String getShape() {
        return "I";
    }
}
