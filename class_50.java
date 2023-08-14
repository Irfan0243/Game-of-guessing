import java.util.Scanner;
import java.util.Random;
class Guessing{

 int number;
 int inputnumber;
 int noofGuesses=0;

    public int getNoofGuesses() {
        return noofGuesses;
    }

    public void setNoofGuesses(int noofGuesses) {
        this.noofGuesses = noofGuesses;
    }
    Guessing(){
       Random rand=new Random();
       this.number= rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.print("guess a number:");
        Scanner sc=new Scanner(System.in);
        inputnumber= sc.nextInt();
    }
    Boolean isCorrect(){
        noofGuesses++;

        if(inputnumber==number){
      System.out.format("your guess is right,it was %d\n You guessed it in %d attempts",number,noofGuesses);
       return true;
    } else if (inputnumber<number) {
            System.out.println("Too Low");
        } else if (inputnumber>number) {
            System.out.println("Too high");
        }
        return false;
    }
    }
public class class_50 {
    public static void main (String[] args){
        Game g= new Game();
        boolean b=false;
     while (!b){
         g.takeUserInput();
         b=g.isCorrect();
     }
    }
}

