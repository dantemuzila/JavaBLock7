/**
 * Created by block7 on 10/26/16.
 */
public class LSArray {

    int[] myArray;
    int[] copyArray;

    LSArray(int size){
        myArray = new int[size];
        System.out.println(myArray.length);
        copyArray = new int[size];
        System.out.println(copyArray.length);
    }

    void randomize(int maxInt){
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int) (Math.random() * maxInt) + 1;
            copyArray[i] = (int) (Math.random() * maxInt) + 1;
        }
    }

    void printArray(){
        // for (int i: myArray) {
        System.out.println();
        for (int i = 0; i < myArray.length; i++){
            // System.out.print(i + " ");
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < copyArray.length; i++){
            System.out.print(copyArray[i] + " ");
        }
        System.out.println("");
    }

    void swap(int i, int j){
        int ith = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = ith;
    }

    void selectionSort(){
        for (int i = 0; i < myArray.length; i++) {
            int positionOfLowest = i;
            for (int j = i + 1; j < myArray.length; j++){
                if (myArray[positionOfLowest] > myArray[j]){
                    positionOfLowest = j;
                }
            }
            swap(i, positionOfLowest);
        }
    }

    void addValues(){
        int total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total = total + myArray[i];
        }
        System.out.print("The total sum of the numbers is " + total + " ");
    }

    void copy(){
        for (int i = 0; i < myArray.length; i++) {
            copyArray[i] = myArray[i];
        }
    }
}
