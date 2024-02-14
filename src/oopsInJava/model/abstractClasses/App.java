package oopsInJava.model.abstractClasses;
import oopsInJava.model.abstractClasses.entity.*;
public class App {
    public static void main(String[] args) {

//        Example 1
        Tesla s = new Tesla();
        Car c = (Car)s;
        int x = (int)1212.121f;
        Car c1 = new Tesla();
//        Example 2
        Mobile mobile = new Mobile();
        Camera camera = (Camera) mobile;
        System.out.println(camera.recordVideo());

//        Example 3
        Iphone iphone = new Iphone();
        Mobile iMobile = (Mobile) iphone;
        iMobile.clickPicture();

    }
}
