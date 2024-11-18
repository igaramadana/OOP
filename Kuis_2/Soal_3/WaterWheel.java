package Kuis_2.Soal_3;

public class WaterWheel extends AncientMechanisme{
    private int rotationSpeed;

    public WaterWheel(String name, int yearMade, int rotationSpeed) {
        super(name, yearMade);
        this.rotationSpeed = rotationSpeed;
    }

    @Override
    protected void initiateMechanisme() {
        System.out.println("Water wheel start to rotate at " + rotationSpeed + " RPM");
    }

    @Override
    public void deactivate() {
        System.out.println("Water wheel is stopped.");
        isActive = false;
    }

    @Override
    public String getStatus() {
        return "Water Wheel '" + name + "' (" + yearMade + ") - " + 
               (isActive ? "Running at " + rotationSpeed + " RPM" : "Stopped");
    }
}
