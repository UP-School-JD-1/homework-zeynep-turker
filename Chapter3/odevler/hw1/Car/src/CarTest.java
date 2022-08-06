public class CarTest {

    public static void main(String[] args) {

        //Car objesi, değişkenlerinde final kullanıldığı için bu şekilde tanımlanmıştır
        Car car1 = new Car();
        car1.make = "Fiat Egea";
        car1.model = "Urban";
        car1.year = "2018";
        car1.distance = 0;
        car1.speed = 0;

        Car car2 = new Car();
        car2.make = "Fiat Egea";
        car2.model = "Urban Plus";
        car2.year = "2018";
        car2.distance = 500;
        car2.speed = 100;

        car1.accelerate(155);
        car2.accelerate(185);

        double timeCar1 = car1.go(1000);
        double timeCar2 = car2.go(1000);

        System.out.println("Car1's time for 1000 km : " + timeCar1);
        System.out.println("Car2's time for 1000 km : " + timeCar2 + "\n");

        //Eğer Car sınıfının go methodunu kullanmak istemezsek aşağıdaki şekilde de sonucu bulabiliriz

        double periodCar1 = (double) 1000 / car1.speed;
        double periodCar2 = (double) 1000 / car2.speed;

        System.out.println("Car1's time for 1000 km : " + periodCar1);
        System.out.println("Car2's time for 1000 km : " + periodCar2);
    }
}