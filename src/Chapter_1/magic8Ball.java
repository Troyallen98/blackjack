package Chapter_1;

import java.util.Random;

public class magic8Ball {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] magic8BallOptions = {
                "It is certain",
                "It is decidedly so",
                "Without a doubt",
                "Yes definitely",
                "You may rely on it",
                "As I see it, yes",
                "Most likely",
                "Outlook good",
                "Yes",
                "Signs point to yes",
                "Reply hazy, try again",
                "Ask again later",
                "Better not tell you now",
                "Cannot predict now",
                "Concentrate and ask again",
                "Don’t count on it",
                "My reply is no",
                "My sources say no",
                "Outlook not so good",
                "Very doubtful"
        };

        getRandomMessage(magic8BallOptions, rand);

    }

    public static void getRandomMessage(String[] options, Random rand) {
        int upperBound = 20;
        System.out.println(options[rand.nextInt(upperBound)]);
    }
}
