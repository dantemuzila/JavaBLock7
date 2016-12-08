/**
 * Created by block7 on 12/7/16.
 */
public class StackMain {
    public static void testStack(){
        LSStack stack = new LSStack();

        stack.push(new Integer(1));
        stack.push(new Integer(8));
        stack.push(new Integer(4));
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();

    }
    public static void testQueue(){
        Queue queue = new Queue();

        queue.add(new Integer(1));
        queue.add(new Integer(2));
        queue.add(new Integer(3));
        queue.add(new Integer(4));
        queue.printQueue();
        queue.remove();
        queue.printQueue();
        System.out.println(queue.peek());

    }

    public static void main(String[] args){
        testStack();
        testQueue();
    }
}
