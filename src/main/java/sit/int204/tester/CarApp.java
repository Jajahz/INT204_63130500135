package sit.int204.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sit.int204.beans.Car;

public class CarApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) context.getBean("car");
        car.start();
        System.out.println(car);

        Car carX = (Car) context.getBean("carX");
        carX.start();
        System.out.println(carX);
    }
}