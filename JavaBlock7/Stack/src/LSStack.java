/**
 * Created by block7 on 12/7/16.
 */
import java.util.ArrayList;

public class LSStack {
    ArrayList myList = new ArrayList();

    LSStack(){

    }
    void push(Object obj){
        myList.add(0, obj);
    }
    Object pop(){
        if (isEmpty())
            return null;
        return myList.remove(0);
    }
    boolean isEmpty(){
        return myList.size() == 0;
    }
    Object peek(){
        if (isEmpty())
            return null;
        return myList.get(0);
    }
    void printStack(){
        System.out.println("_______");
        for (Object obj : myList){
            System.out.print(obj);
        }
        System.out.println("");
        System.out.println("_______");
    }
}
