package 享元模式;

/**
 * @version v1.0
 * @ClassName: IBox
 * @Description: O图形类(具体享元角色)
 * @Author:
 */
public class OBox extends AbstractBox {

    @Override
    public String getShape() {
        return "O";
    }
}
