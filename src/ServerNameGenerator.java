import java.util.Random;
public class ServerNameGenerator {


    public static void main(String[] args) {
        String[] nouns = {"roses", "tulips", "grass", "house", "dog", "cat", "person","bird","snake","deer"};
        shuffle(nouns, 50);
        String[] adjectives = {"red", "lovely", "gorgeous", "green", "giant", "silent", "loud", "ugly", "smelly","amazing"};
        shuffle(adjectives, 50);

        for (int i = 0; i < nouns.length && i < adjectives.length; i++) {
            System.out.println("Here is your server name: " + adjectives[i] + " " + nouns[i]);
        }
    }

    public static void shuffle(String[] list, int swapCount) {
        Random random = new Random();
        for (int i = 0; i < swapCount; i++) {
            int index1 = random.nextInt(list.length);
            int index2 = random.nextInt(list.length);

            //Swap these two with each other
            String temp = list[index1];
            list[index1] = list[index2];
            list[index2] = temp;

        }
    }
}