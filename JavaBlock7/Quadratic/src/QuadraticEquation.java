/**
 * Created by block7 on 9/28/16.
 */
public class QuadraticEquation {
    Coefficient a,b,c;

    public QuadraticEquation(double aParam, double bParam, double cParam){
        a = new Coefficient(aParam);
        b = new Coefficient(bParam);
        c = new Coefficient(cParam);
    }

    public QuadraticEquation(String aParam, String bParam, String cParam){
        a = new Coefficient(aParam);
        b = new Coefficient(bParam);
        c = new Coefficient(cParam);
    }

    double discriminant() {
        return b.getValue() * b.getValue() - 4 * a.getValue() * c.getValue();
    }

    public void printSolution(){
        double disc = discriminant();

        if (disc < 0.0){
            System.out.println("no real solution");
        } else {
            double solution1 =
                -b.getValue() + Math.sqrt((disc))/ 2 * a.getValue();
            double solution2 =
                    -b.getValue() - Math.sqrt((disc))/ 2 * a.getValue();
            if (solution1 == solution2) {
                System.out.println("Solution: " + solution1);
            }
            else
            System.out.println("Solution1: " + solution1 + "Solution2 " + solution2);
        }


    }
}
