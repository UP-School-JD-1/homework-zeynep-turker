public class FootballPlayer {
    int no;
    String name;
    boolean inPlay;
    int minutes;
    int numberOfGoals;

    void play(int minutesToPlay) {
        this.minutes += minutesToPlay;
    }

    void score() {
        this.numberOfGoals++;
    }
}
