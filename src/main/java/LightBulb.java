public class LightBulb {

    private boolean isOn = false;

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Light bulb is turned on");
        } else {
            System.out.println("Light bulb is already on, you can´t turn it on twice!");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Light bulb is turned off");
        } else {
            System.out.println("Light bulb is already on, you can´t turn it on twice!");
        }
    }
}
