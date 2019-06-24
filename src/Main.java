import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = "";
        System.out.println("Hello, I am Eliza! How are you doing?");
        int repeatCounter = 0;
        String prev = "";

        while (!input.toLowerCase().equals("q") && !input.toLowerCase().equals("i am feeling great")) {
            input = read.nextLine().toLowerCase();
            String output = "I'm not sure what you mean?";

            if (input.contains(prev) && !prev.trim().equals("")) {
                repeatCounter++;
            } else {
                repeatCounter = 0;
            }

            if (input.contains("can")) {
                output = "Anything is possible, if you put your mind to it.";
                prev = "can";
            } else if (repeatCounter > 0) {
                Random rand = new Random();
                int path = rand.nextInt(5);
                if (path == 0) {
                    output = "Anything else bothering you right now?";
                } else if (path == 1) {
                    output = "How is work going?";
                } else if (path == 2) {
                    output = "How are things at home?";
                } else if (path == 3) {
                    output = "How's the weather?";
                } else if (path == 4) {
                    output = "Working on anything interesting?";
                }
            } else if (input.contains("well") && !input.contains("well,")) {
                output = "Glad to hear you're doing well! Can you tell me more?";
                prev = "well";
            } else if (input.contains("poor")) {
                output = "Oh no! Surely things will get better!";
                prev = "poor";
            } else if (input.contains("fine")) {
                    output = "We can improve your disposition, I think.";
                    prev = "fine";
            } else if (input.equals("ok")) {
                output = "Compliance is important...sometimes...";
                prev = "ok";
            } else if (input.contains("hate")) {
                output = "Hate is a strong word. Try and improve your feelings about it.";
                prev = "hate";
            } else if (input.contains("don't") || input.contains("do not")) {
                output = "Well I do! Maybe. ;)";
                prev = "don't";
            }   else if (input.contains("hope")) {
                output = "I hope so too!";
                prev = "hope";
            } else if (input.contains("yes")) {
                output = "It's good to be affirmative!";
                prev = "yes";
            } else if (input.contains("bad")) {
                output = "Thing will turn around!";
                prev = "bad";
            } else if (input.contains("sure")) {
                output = "I'm definitely sure! No question!";
                prev = "sure";
            } else if (input.contains("why")) {
                output = "Sometimes things happen for a reason.";
                prev = "why";
            } else if (input.contains("how")) {
                output = "With a enough determination, I guess.";
                prev = "how";
            } else if (input.contains("what")) {
                output = "Sometimes when asking what, you should ask why.";
                prev = "what";
            } else if (input.contains("hello")) {
                output = "Hi! What's going on?";
                prev = "hello";
            } else if (input.contains("hello")) {
                    output = "Hi! What's going on?";
                    prev = "hello";
            } else if (input.contains("good")) {
                output = "To that, I say excellent!";
                prev = "good";
            } else if (input.contains("no")) {
                output = "Maybe you'll be able to change that answer soon.";
                prev = "no";
            } else if (input.indexOf(' ') == -1) {
                output = "Yee Haw!";
                prev = "";
            } else if (input.contains("yee haw")) {
                output = "Yee Haw!";
                prev = "yee haw";
            } else if (input.contains("do")) {
                output = "Indeed, they do!";
                prev = "do";
            } else {
                boolean doRespond = false;
                input = input.toLowerCase();
                for (String word : input.toLowerCase().split(" ")) {
                    if (word.equals("i")) {
                        input = input.replaceAll("i\\b", "you");
                        doRespond = true;
                    } else if (word.equals("me")) {
                        input = input.replaceAll("me\\b", "you");
                        doRespond = true;
                    } else if (word.equals("i'm")) {
                        input = input.replaceAll("i'm\\b", "you are");
                        doRespond = true;
                    } else if (word.equals("i'll")) {
                        input = input.replaceAll("i'll\\b", "you will");
                        doRespond = true;
                    } else if (word.equals("my")) {
                        input = input.replaceAll("my\\b", "your");
                        doRespond = true;
                    } else if (word.equals("am")) {
                        input = input.replaceAll("am\\b", "are");
                        doRespond = true;
                    } else if (word.equals("you're")) {
                        input = input.replaceAll("you're\\b", "I'm");
                        doRespond = true;
                    } else if (word.equals("you")) {
                        input = input.replaceAll("you\\b", "I");
                        doRespond = true;
                    } else if (word.equals("your")) {
                        input = input.replaceAll("your\\b", "my");
                        doRespond = true;
                    } else if (word.equals("are")) {
                        input = input.replaceAll("are\\b", "am");
                        doRespond = true;
                    } else if (word.equals("they")) {
                        doRespond = true;
                    }
                }
                if (doRespond) {
                    output = "Why do you think " + input + "?";
                    prev = "";
                }
            }

            System.out.println(output);
        }
    }
}
