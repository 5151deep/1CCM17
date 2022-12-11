package Abstract;

public class MainApp1 {
    public static void main(String[] args) {

        Switch s1 = new LEDLight();  //upcasting
        s1.SwitchOn();
        s1.SwitchOff();

        Switch s2 = new SolarLight();  //upcasting
        s2.SwitchOn();
        s2.SwitchOff();

    }

}
