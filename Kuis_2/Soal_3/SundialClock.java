package Kuis_2.Soal_3;

public class SundialClock extends AncientMechanisme {
    private String currentTime;

    public SundialClock(String name, int yearMade) {
        super(name, yearMade);
        this.currentTime = "Unknown";
    }

    @Override
    protected void initiateMechanisme() {
        System.out.println("Sundial aligning with sun position");
        calculateTime();
    }

    private void calculateTime() {
        this.currentTime = "12:00";
    }

    @Override
    public String getStatus() {
        return "Sundial '" + name + "' (" + yearMade + ") - Current Time: " + currentTime;
    }

    @Override
    public void deactivate() {
        System.out.println("Sundial covered.");
        isActive = false;
    }
}
