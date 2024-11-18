package Kuis_2.Soal_1;

public abstract class DamagableObject extends GameObject {
    public int maxhealth;
    protected int health;

    public DamagableObject(String name, int posx, int posy, int maxhealth) {
        super(name, posx, posy);
        this.maxhealth = maxhealth;
        this.health = health;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage. Remaining Health: " + health);
        if (isDead()) {
            onKilled();
        }
    }

    public abstract void onKilled();
}