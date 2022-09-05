package 建造者模式;

public class Bike {

    private String frame;

    private String seate;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeate() {
        return seate;
    }

    public void setSeate(String seate) {
        this.seate = seate;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seate='" + seate + '\'' +
                '}';
    }
}
