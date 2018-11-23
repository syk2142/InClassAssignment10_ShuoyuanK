import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("Please type in your tweet.");
        String text= in.nextLine();

        TweetTester tweetTester = new TweetTester();
        ArrayList<Integer> res = tweetTester.test(text);

        if (res.get(0) == 0) {
            System.out.println("Length Correct");
            System.out.println("Number of Hashtags: " + res.get(1));
            System.out.println("Number of Attributions: " + res.get(2));
            System.out.println("Number of Links: " + res.get(3));
        } else {
            System.out.println("Excess Characters: " + res.get(0));
        }

    }
}
// "This is a #long tweet. An extra long #link. So, when @you write your code i should ignore all of the #hashtags and #mentions since it is too long. It should also ignore all http://links";
// "This #tweet is #short and has several #hashtags. And HTtp://links @and @mentions";