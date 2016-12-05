/**
 * Created by teacher on 9/26/16.
 */
public class VariablesSandbox {

    public static void log(String s) {
        System.out.println(s);
    }

    public static void mathExamples() {
        int i1 = 15;
        int i2 = 5;
        int i3 = i1 % i2;
       // log("" + i3);
        double d1 = (double) i1 / (double) i2;
       // log ("" + d1);
    }
    public static void funWithMainFields(SVar s1, SVar s2) {
        SVar s3;
        s3 = s1;
        s1 = null;
        s1.printValues();
        s2.printValues();
        s3.printValues ();

        s3. intField= 9999;
        s1.printValues();
        s2.printValues();
        s3.printValues ();

        int i1 = s3.intField + s2.intField;
        log ("" + i1);
    }

    public static void main(String[] args) {

        SVar s1 = new SVar(12, 100.0, false, "goodbye columbus");
        SVar s2 = new SVar(5, 3.14159, true, "Hello, World");

        s1.printValues();
        s2.printValues();
        mathExamples();
    }
}
