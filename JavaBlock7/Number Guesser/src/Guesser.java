/**
 * Created by block7 on 10/4/16.
 */
public class Guesser {
    public static int max;
    public static int min;
    public Guesser(){
        this.max = 100;
        this.min = 1;
    }

    public static int guess() {
        int guess = 0;
        guess = (int) (Math.random()* (max-min + 1)) + min;
        System.out.println(guess + " : " + max + " to " + min);
        return guess;
    }
    public void setMax(int newMax){
        this.max = newMax;
    }
    public void setMin(int newMin){
        this.min = newMin;
    }

}


