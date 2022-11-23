package oop.project;

public class FootballPlayer {

    // encapsulation
    private String firstName;
    private String lastName;
    private int age;

    private int score;

    public FootballPlayer() {
    }

    public FootballPlayer(String firstName, String lastName, int age, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void printScore() {
        System.out.println("The player score is: " + this.getScore());
    }
}
