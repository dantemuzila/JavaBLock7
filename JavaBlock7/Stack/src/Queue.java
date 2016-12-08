/**
 * Created by block7 on 12/7/16.
 */
import java.util.ArrayList;

public class Queue {
    ArrayList myList = new ArrayList();

    Queue(){

    }
    void add(Object obj){
        myList.add(0, obj);
    }
    Object remove(){
        if (isEmpty())
            return null;
        return myList.remove(myList.size() - 1);
    }
    Object peek(){
        if (isEmpty())
            return null;
        return myList.get(myList.size() - 1);
    }
    boolean isEmpty(){
        return myList.size() == 0;
    }

    void printQueue(){
        System.out.println("_______");
        System.out.print("Back of the Queue -->");
        for (Object obj : myList){
            System.out.print(obj + ", ");
        }
        System.out.print("<-- Front of the Queue");
        System.out.println("");
    }
}
