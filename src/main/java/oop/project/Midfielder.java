package oop.project;

public class Midfielder extends FootballPlayer {

    @Override
    public void printScore() {
        System.out.println("The player score is: 68");
    }

    public void printScore(int customScore) {
        System.out.println("The player score is: " + customScore);
    }

}
