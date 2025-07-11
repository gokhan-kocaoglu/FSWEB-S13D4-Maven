package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());

        System.out.println("------------------------");

        Player player = new Player("Arthur", 120, Weapon.SWORD);

        System.out.println(player.healthRemaining()); // 100

        player.loseHealth(30);
        System.out.println(player.healthRemaining()); // 70

        player.restoreHealth(50);
        System.out.println(player.healthRemaining()); // 100

        player.loseHealth(120); // Arthur player has been knocked out of game
        System.out.println(player.healthRemaining());
    }
}