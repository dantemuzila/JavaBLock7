/**
 * Created by block7 on 10/7/16.
 */
public class BinaryGuesser {
    public int max;
    public int min;
    public int counter;
    public int counterMax;
    public BinaryGuesser(){
        this.max = 100;
        this.min = 1;
        this.counter = 0;
        this.counterMax = 10;
    }

    public int guess() {
        if (this.counter >= this.counterMax){
            return min-1;
        }
        int guess = 0;
        guess = (int) ((this.max-this.min)/2) + this.min;
        System.out.println(guess + " : " + this.max + " to " + this.min);
        this.incCounter();
        return guess;
    }
    public void setMax(int newMax){
        this.max = newMax;
    }
    public void setMin(int newMin){
        this.min = newMin;
    }
    public int getMin(){
        return this.min;
    }
    public void incCounter(){
        if (this.counter <= this.counterMax){
            this.counter = this.counter + 1;
        }
    }
}