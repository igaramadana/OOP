package Kuis_2.Soal_3;

import java.util.ArrayList;
import java.util.List;

public class AncientSmartHomeController {
    private List<Device> devices;

    public AncientSmartHomeController() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void optimizeWaterWheels() {
        for (Device device : devices) {
            if (device instanceof WaterWheel) {
                WaterWheel wheel = (WaterWheel) device;
                wheel.activate();
                System.out.println("Optimizing ancient water wheel...");
            }
        }
    }

    public void activateAllDevices() {
        for (Device device : devices) {
            device.activate();
        }
    }

    public void deactivateAllDevices() {
        for (Device device : devices) {
            device.deactivate();
        }
    }

    public void showAllStatuses() {
        for (Device device : devices) {
            System.out.println(device.getStatus());
        }
    }

    public void nightMode() {
        for (Device device : devices) {
            if (device instanceof SmartLamp) {
                SmartLamp lamp = (SmartLamp) device;
                lamp.setBrightness(20);
            } else if (device instanceof SundialClock) {
                device.deactivate();
            }
        }
    }
}
