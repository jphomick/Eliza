import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = "";
        System.out.println("Hello, I am Eliza! How are you doing?");
        Random rand = new Random();

        boolean caps = false;

        while (!input.toLowerCase().equals("q") && !input.toLowerCase().equals("i am feeling great")) {
            input = read.nextLine().toLowerCase();
            String output = "Unknown";

            boolean doRespond = false;
            boolean otherResponse = false;

            input = input.toLowerCase();
            if (input.equals("caps")) {
                caps = true;
            }
            String rebind = "";
            boolean version2 = false;
            for (String word : input.toLowerCase().split("[^\\w']+")) {
                //System.out.println(word);
                if (word.equals("i")) {
                    word = word.replaceAll("i\\b", "you");
                    doRespond = true;
                    version2 = true;
                } else if (word.equals("me")) {
                    word = word.replaceAll("me\\b", "you");
                    doRespond = true;
                    version2 = true;
                } else if (word.equals("i'm")) {
                    word = word.replaceAll("i'm\\b", "you are");
                    doRespond = true;
                    version2 = true;
                } else if (word.equals("i'll")) {
                    word = word.replaceAll("i'll\\b", "you will");
                    doRespond = true;
                    version2 = true;
                } else if (word.equals("my")) {
                    word = word.replaceAll("my\\b", "your");
                    doRespond = true;
                    version2 = true;
                } else if (word.equals("am")) {
                    word = word.replaceAll("am\\b", "are");
                    doRespond = true;
                    version2 = true;
                } else if (word.equals("you're")) {
                    word = word.replaceAll("you're\\b", "I'm");
                    doRespond = true;
                } else if (word.equals("you")) {
                    if (version2) {
                        word = word.replaceAll("you\\b", "me");
                    } else {
                        word = word.replaceAll("you\\b", "I");
                    }
                    doRespond = true;
                } else if (word.equals("your")) {
                    word = word.replaceAll("your\\b", "my");
                    doRespond = true;
                } else if (word.equals("are")) {
                    word = word.replaceAll("are\\b", "am");
                    doRespond = true;
                } else if (word.equals("they")) {
                    doRespond = true;
                } else if (word.equals("can")) {
                    output = "Anything is possible, if you put your mind to it.";
                    otherResponse = true;
                } else if (word.equals("well")) {
                    output = "Glad to hear you're doing well! Can you tell me more?";
                    otherResponse = true;
                } else if (word.equals("poor")) {
                    output = "Oh no! Surely things will get better!";
                    otherResponse = true;
                } else if (word.equals("fine")) {
                    output = "We can improve your disposition, I think.";
                    otherResponse = true;
                } else if (input.equals("ok")) {
                    output = "Compliance is important...sometimes...";
                    otherResponse = true;
                } else if (word.equals("hate")) {
                    output = "Hate is a strong word. Try and improve your feelings about it.";
                    otherResponse = true;
                } else if (word.equals("don't") || input.contains("do not")) {
                    output = "Well I do! Maybe. ;)";
                    otherResponse = true;
                } else if (word.equals("hope")) {
                    output = "I hope so too!";
                    otherResponse = true;
                } else if (word.equals("yes")) {
                    output = "It's good to be affirmative!";
                    otherResponse = true;
                } else if (word.equals("bad")) {
                    output = "Things will turn around!";
                    otherResponse = true;
                } else if (word.equals("sure")) {
                    output = "I'm definitely sure! No question!";
                    otherResponse = true;
                } else if (word.contains("thank")) {
                    output = "You're welcome!";
                    otherResponse = true;
                } else if (word.equals("why")) {
                    output = "Sometimes things happen for a reason.";
                    otherResponse = true;
                } else if (word.equals("how")) {
                    output = "With a enough determination, I guess.";
                    otherResponse = true;
                } else if (word.equals("what")) {
                    output = "Sometimes when asking what, you should ask why.";
                    otherResponse = true;
                } else if (word.equals("hello")) {
                    output = "Hi! What's going on?";
                    otherResponse = true;
                } else if (word.equals("hello")) {
                    output = "Hi! What's going on?";
                    otherResponse = true;
                } else if (word.equals("good")) {
                    output = "To that, I say excellent!";
                    otherResponse = true;
                } else if (word.equals("no")) {
                    output = "Maybe you'll be able to change that answer soon.";
                    otherResponse = true;
                } /*else if (input.indexOf(' ') == -1) {
                    output = "Yee Haw!";
                    prev = "";
                }*/ else if (word.equals("yee haw")) {
                    output = "Yee Haw!";
                    otherResponse = true;
                } else if (word.equals("do")) {
                    output = "Indeed!";
                    otherResponse = true;
                } else if (word.equals("really")) {
                    output = "Yes, of course!";
                    otherResponse = true;
                }

                rebind += " " + word;
            }

            rebind = rebind.trim();

            if (doRespond && !otherResponse) {
                int type = rand.nextInt(3);
                if (type == 0) {
                    output = "Why do you think " + rebind + "?";
                } else if (type == 1) {
                    output = "I can understand that " + rebind + ". It's a valid concern.";
                } else {
                    output = "\"" + rebind + "\" What a thing to say. I think about this late at night sometimes.";
                }
            }

            if (output.equals("Unknown")) {
                int type = rand.nextInt(3);
                if (type == 0) {
                    output = "How interesting! Tell me more!";
                } else if (type == 1) {
                    output = "I'm curious about this";
                } else {
                    output = "Wait, really? I need more information!";
                }
            }

            if (caps) {
                output = output.toUpperCase();
            }

            System.out.println(output);
        }
    }
}
