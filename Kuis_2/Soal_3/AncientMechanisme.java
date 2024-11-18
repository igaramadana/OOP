package Kuis_2.Soal_3;

public abstract class AncientMechanisme implements Device {
    protected String name;
    protected boolean isActive;
    protected int yearMade;

    public AncientMechanisme(String name, int yearMade) {
        this.name = name;
        this.yearMade = yearMade;
        this.isActive = false;
    }

    @Override
    public void activate() {
        isActive = true;
        initiateMechanisme();
    }

    protected abstract void initiateMechanisme();
}
