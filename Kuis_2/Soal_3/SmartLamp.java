package Kuis_2.Soal_3;

public class SmartLamp implements Device {
    private String name;
    private boolean isOn;
    private int brightness;

    public SmartLamp(String name) {
        this.name = name;
        this.isOn = false;
        this.brightness = 0;
    }

    @Override
    public void activate() {
        isOn = true;
        brightness = 100;
        System.out.println("Smart lamp activated at full brightness.");
    }

    @Override
    public void deactivate() {
        isOn = false;
        brightness = 0;
        System.out.println("Smart lamp turned off");
    }

    @Override
    public String getStatus() {
        return "Smart Lamp '" + name + "' - " + (isOn ? "On (" + brightness + "%)" : "Off");
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Brightness set to " + brightness + "%");
    }
}
