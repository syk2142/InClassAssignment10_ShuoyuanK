import java.util.ArrayList;


class TweetTester {
    ArrayList<Integer> test(String input){
        int countMention = 0;
        int countHashtag = 0;
        int countLinks = 0;
        ArrayList<Integer> res = new ArrayList<>();

        if (input.length() > 140) {
            System.out.println(input.substring(140));
            res.add(input.length()-140);
            return res;
        }

        String [] words = input.split(" ");
        for (String word: words) {

            // Check if starts with http:
            if (word.toLowerCase().startsWith("http://")) {
                countLinks += 1;
                continue;
            }
            // Else check if starts with @ or # symbol
            char symbol = word.charAt(0);

            if (symbol == '@' && word.length() > 1) {
                countMention += 1;
            } else if (symbol == '#' && word.length() > 1) {
                countHashtag += 1;
            }

        }
        res.add(0);
        res.add(countHashtag);
        res.add(countMention);
        res.add(countLinks);
        return res;
    }
}