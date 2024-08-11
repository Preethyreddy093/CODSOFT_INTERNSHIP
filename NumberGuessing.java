import java.util.*;

class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("Welcome To Number Guessing Game");
        int randomNumber = r.nextInt(100) + 1; 
        boolean isCorrect = false;
        int attempts = 0;
        
        while (!isCorrect) {
            System.out.println("Think Of A Number Between 1-100");
            int userNumber = sc.nextInt();
            attempts++;
            
            if (randomNumber == userNumber) {
                isCorrect = true;
                System.out.println("Congratulations! You guessed the right number in " + attempts + " attempts.");
            } else if (userNumber < randomNumber) {
                System.out.println("Your guess is too low. try again.");
            } else { 
                System.out.println("Your guess is too high. try again.");
            }
        }
        sc.close();
    }
}
