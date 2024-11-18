package Kuis_2.Soal_1;

public class Player extends DamagableObject{
    private int score;
    private int livesRemaining;

    public Player(String name, int posx, int posy, int maxhealth, int livesRemaining) {
        super(name, posx, posy, maxhealth);
        this.livesRemaining = livesRemaining;
        this.score = 0;
    }

    @Override
    public void onKilled() {
        livesRemaining--;
        System.out.println(name + " died! Lives Remaining: " + livesRemaining);
        if (livesRemaining > 0) {
            health = maxhealth;
            System.out.println(name + " revived");
        } else {
            despawn();
        }
    }
}
