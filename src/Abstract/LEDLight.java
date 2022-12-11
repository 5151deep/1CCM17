package Abstract;

public class LEDLight implements Switch{

    @Override
    public void SwitchOn() {
        System.out.println("LED light switch on");
    }

    @Override
    public void SwitchOff() {
        System.out.println("LED light switch off");
    }
}
