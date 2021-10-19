public class car {
    String company;//audi
    String color;// black
    int carId;//565674
    int year;//2021

    public car(String company, String color, int carId, int year) { //constructor
        this.company = company;
        this.color = color;
        this.carId = carId;
        this.year = year;
    }

    void nextYear(){
        this.year--;
    }

    @Override
    public String toString() {
        return "car{" +
                "company='" + company + '\'' +
                ", color='" + color + '\'' +
                ", carId=" + carId +
                ", year=" + year +
                '}';
    }
}

