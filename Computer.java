import java.util.concurrent.ThreadLocalRandom;

public class Computer {
    
    public String computerChoice(){
        Random();
        String choice = "";
        switch (Random()){
            case 1: choice = "Rock";
            break;

            case 2: choice = "Paper";
            break;

            case 3: choice = "Scissors";
            break;
        }
        return choice;
    }

    public int Random() {

        // Generate random int from 1 to 3
        int randomNumber = ThreadLocalRandom.current().nextInt(1,4);
        return randomNumber;
    }

}
