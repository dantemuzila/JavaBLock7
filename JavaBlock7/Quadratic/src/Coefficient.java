/**
 * Created by block7 on 9/28/16.
 */
public class Coefficient {
    Double value;
    public Coefficient (double dvalue){
        this.value = dvalue;
    }
    public Coefficient(String sValue) {
        this.value = Double.valueOf(sValue);
    }

    double getValue(){return value.doubleValue();}

}
