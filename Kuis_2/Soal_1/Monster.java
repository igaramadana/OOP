package Kuis_2.Soal_1;

public class Monster extends DamagableObject {
    private int threatLevel;
    private String color;

    public Monster(String name, int posx, int posy, int maxhealth, int threatLevel, String color) {
        super(name, posx, posy, maxhealth);
        this.threatLevel = threatLevel;
        this.color = color;
    }

    @Override
    public void onKilled() {
        System.out.println(name + " was Killed! Threat level: " + threatLevel);
        despawn();
    }

    public void makeNoise() {
        System.out.println(name + " makes a scary noise!");
    }
}
