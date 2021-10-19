public class phone {
    double screenSize;
    String model;
    String os;
    int price;
    double camera;
    int memory;

    public phone(double screenSize, String model, String os, int price, double camera, int memory) {
        this.screenSize = screenSize;
        this.model = model;
        this.os = os;
        this.price = price;
        this.camera = camera;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "phone{" +
                "screenSize=" + screenSize +
                ", model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", price=" + price +
                ", camera=" + camera +
                ", memory=" + memory +
                '}';
    }
}
