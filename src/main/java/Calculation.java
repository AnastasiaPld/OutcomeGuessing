import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Calculation {

    public Calculation(String team, String team1, int finalScore, int finalScore1) {
        this.team = team;
        this.finalScore = finalScore;
        this.team = team1;
        this.finalScore = finalScore1;
        System.out.println("Outcome of this season play is:" + " " + team + ": " + team1 + " " + finalScore + ":" + finalScore1);
    }

    String team;
    int finalScore;
//
//    public void setTeam(String team) {
//        this.team = team;
//    }
//
//    public void setFinalScore(int finalScore) {
//        this.finalScore = finalScore;
//    }

    public void outcome() {
        String winTeam = "Manchester";
        int winScore = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter team for your bet:");
        String guessTeam = sc.nextLine();
        if (guessTeam.matches(winTeam)) {
            System.out.println("Congratulations your guess for the Team is correct. Your reward is the Big one - 100$.");
        }
        if (!guessTeam.matches(winTeam)) {
            System.out.println("Your guess is incorrect! No reward!");
        }

        System.out.println("Please, enter score for winning team:");
        int guessScore = sc.nextInt();
        if (guessScore == winScore) {
            System.out.println("Congrats your win is the Biggest one and the prize is - 200$. Your guess about the score is correct!");
        } else if (guessScore == winScore) {
            System.out.println("Your guess is incorrect no reward!");
        }

    }
}









