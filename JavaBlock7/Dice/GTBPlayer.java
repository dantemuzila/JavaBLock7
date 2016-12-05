/**
 * Created by block7 on 10/21/16.
 */
public class GTBPlayer {
    public GTBPlayer(String name){
        this.name = name;
    }
    String name;

    public int rollForOneRound(){
        int r1 =0;
        int a = new Dice("1d6").rollDice();
        int b = new Dice("1d6").rollDice();
        int c = new Dice("1d6").rollDice();
        if (a>b && a>c) {
            r1 = a;
        }
        else if (b>a && b>c) {
             r1 = b;
        }
        else if (c>a && c>b) {
            r1 = c;
        }
        else if (a==b && a>c){
            r1 = a;
        }
        else if (b==c && b>a){
            r1 = b;
        }
        else {
            r1 = c;
        }
        System.out.println("The highest role is" + r1);

        int r2 = 0;
        int d = new Dice("1d6").rollDice();
        int e = new Dice("1d6").rollDice();
        if (d>e){
            r2 = d;
        }else {
            r2 = e;
        }
        System.out.println("The highest role is" + r2);

        int r3 = new Dice("1d6").rollDice();
        System.out.println("Role is" + r3);
        System.out.println("The three numbers are " + r1 + ", "  + r2 + ", " + r3);

        int total = 0;
        total = r1 + r2 + r3;
        System.out.println("The sum of the rolls is " + total);
        return total;

    }
}
