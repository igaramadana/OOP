package Kuis_2.Soal_3;

public class AncientSmartHomeDemo {
    public static void main(String[] args) {
        AncientSmartHomeController controller = new AncientSmartHomeController();

        // Membuat berbagai perangkat
        WaterWheel wheel1 = new WaterWheel("Main Generator", 1832, 30);
        WaterWheel wheel2 = new WaterWheel("Garden Fountain", 1845, 15);
        SundialClock sundial = new SundialClock("Garden Timekeeper", 1756);
        SmartLamp lamp1 = new SmartLamp("Living Room");
        SmartLamp lamp2 = new SmartLamp("Garden Path");

        // Menambahkan perangkat ke controller (Polymorphic Arguments)
        controller.addDevice(wheel1);
        controller.addDevice(wheel2);
        controller.addDevice(sundial);
        controller.addDevice(lamp1);
        controller.addDevice(lamp2);

        System.out.println("=== Activating All Devices ===");
        controller.activateAllDevices();

        System.out.println("\n=== Current Status of All Devices ===");
        controller.showAllStatuses();

        System.out.println("\n=== Activating Night Mode ===");
        controller.nightMode();

        System.out.println("\n=== Optimizing Water Wheels ===");
        controller.optimizeWaterWheels();

        System.out.println("\n=== Final Status ===");
        controller.showAllStatuses();
    }
}
