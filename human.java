public class human {
    String hairColor;
    String name;
    double height;
    double weight;
    double balance;
    String shirtSize;

    public human(String hairColor, String name, double height, double weight, double balance, String shirtSize) {
        this.hairColor = hairColor;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.balance = balance;
        this.shirtSize = shirtSize;
    }



    @Override
    public String toString() {
        return "human{" +
                "hairColor='" + hairColor + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", balance=" + balance +
                ", shirtSize='" + shirtSize + '\'' +
                '}';
    }
}
