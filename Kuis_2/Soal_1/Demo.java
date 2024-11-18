package Kuis_2.Soal_1;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0, 100, 3);
        Monster monster = new Monster("Goblin", 10, 5, 150, 10, "Red");

        System.out.println("Game Start!");
        monster.makeNoise();

        System.out.println("\nBattle:");
        monster.takeDamage(50);
        player.takeDamage(30);

        monster.takeDamage(100);
        player.takeDamage(80);
        player.takeDamage(50);
    }
}
