package oop.project;

public class Main {
    public static void main(String[] args) {

        FootballPlayer newPlayer = new FootballPlayer("Cristiano", "Ronaldo", 37, 94);

        Midfielder midfielder = new Midfielder();

        System.out.println("The player's age is: " + newPlayer.getAge());

        newPlayer.printScore();

        // method overriding (runtime polymorphism)
        midfielder.printScore();

        // method overloading (compile time polymorphism)
        midfielder.printScore(89);

    }
}
