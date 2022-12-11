package Abstract;

public class SolarLight implements Switch{
    @Override
    public void SwitchOn() {
        System.out.println("Solar Light Switch on");
    }

    @Override
    public void SwitchOff() {
        System.out.println("solar Light Switch off");
    }
}
