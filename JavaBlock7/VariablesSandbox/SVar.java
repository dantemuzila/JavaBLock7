/**
 * Created by teacher on 9/26/16.
 */
public class SVar {
    int intField;
    double doubleField;
    boolean booleanField;
    String stringField;

    public SVar() {}

    public SVar(int i, double d, boolean b, String s) {
        intField = i;
        doubleField = d;
        booleanField = b;
        stringField = s;
    }

    public void printValues() {
        System.out.println(toString() + " " + intField + " " + doubleField + " " + booleanField + " " + stringField );
    }
}
