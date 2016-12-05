/**
 * Created by block7 on 10/26/16.
 */
public class ArrayMain {

    public static void main(String[]args){
        LSArray a = new LSArray(10);
        a.randomize(10);
        System.out.println(a);
        a.swap(3,4);
        a.addValues();
        a.copy();
        // a.selectionSort();
        a.printArray();
    }
}
