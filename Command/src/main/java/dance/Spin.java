package dance;

public class Spin {

    private int degrees;

    public Spin(int degrees) {
        this.degrees = degrees;
    }

    public String spin() {
        return "Spin " + degrees + " degrees";
    }

}
