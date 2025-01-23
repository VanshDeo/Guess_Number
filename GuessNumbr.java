import java.util.*;
public class GuessNumbr {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int j=1;
        System.out.println("Welcome User, to the Number Guessing game");
        while(j!=0){
        System.out.println("Enter the upper limit and lower limit in which you want to guess the number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int rd=rand.nextInt(a,b);
        System.out.println("***********************************");
        System.out.println("A random number has been generated \n You have 5 chances to guess the number");
        System.out.println("So, let's begin!");
        int i=5;
        while(i!=0){
            System.out.println("Enter your guess: ");
            int ch=sc.nextInt();
            if(ch==rd){
                System.out.println("You have Guessed correctly! \n Congratulations!!");
            }
            else{
                System.out.println("Oh no! Wrong Guess");
                i--;
                System.out.println("You now have "+i+" guesses left.");
            }
            if(i==0){
                System.out.println("You have run out of your chances. \nTo play again enter 1 otherwise 0");
                int ch1=sc.nextInt();
                if(ch1==1){
                    j=1;
                }
                else if(ch1==0){
                    System.out.println("End!!!!!");
                    j=0;
                }
                else{
                    System.out.println("Invalid Input");
                }
            }
        }
    }
    }
    
}
