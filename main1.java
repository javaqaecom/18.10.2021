public class main1 {

    public static void main(String[] args) {
       /* car myCar1= new car("tesla","red",58458,2019);// myca1 is name of the car    we created new car and give it the name mycar1
       // myCar1.company="Tesla";
       // myCar1.color="white";
       // myCar1.year=2021;
       // myCar1.carId=5553487;
         System.out.println(myCar1);
        car dvirCar= new car("skoda","white",789541,2020);
        System.out.println(dvirCar);
        dvirCar.nextYear();
        System.out.println(dvirCar);

        phone userPhone = new phone(16.66,"galaxy","android",8000,32,100000000);



/*
        car shmulikCar= new car();
        shmulikCar.company="audi";
        shmulikCar.color="black";
        shmulikCar.year= 2021;
        shmulikCar.carId=565874;

        System.out.println(shmulikCar.company);
        System.out.println(myCar1.company);

        phone ameerPhone = new phone();
        ameerPhone.screenSize=16.9;
        ameerPhone.price= 45000;
        ameerPhone.camera= 12 ;
        ameerPhone.model = "iphone";
        ameerPhone.os="ios";
        ameerPhone.memory= 256;

        human human1= new human();
        human1.name="jack";
        human1.hairColor="black";
        human1.height= 170;
        human1.weight= 65.5;
        human1.shirtSize="m";
        human1.balance= 155000;*/

        point a= new point(4,4);
        point b= new point(6,8);
        System.out.println(a);
        System.out.println(b);
        while(a.x<b.x){
            a.nextx();
        }
        while (a.y<b.y){
            a.nexty();
        }

        System.out.println(a);


    }
}
