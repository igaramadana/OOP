package Kuis_2.Soal_1;

public class GameObject {
    public String name;
    public int posx, posy;

    public GameObject(String name, int posx, int posy) {
        this.name = name;
        this.posx = posx;
        this.posy = posy;
    }

    public void despawn() {
        System.out.println(name + " has been despawned from the game.");
    }
}