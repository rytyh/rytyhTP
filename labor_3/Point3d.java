import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class  Point3d {
    private double aCoord;
    private double bCoord;
    private double cCoord;
    public Point3d(double a, double b, double c) {
        xCoord = a;
        yCoord = b;
        zCoord = c;
    }
    public Point3d() {
        aCoord = 0;
        bCoord = 0;
        cCoord = 0;
    }
    public double getA() {
        return aCoord;
    }
    public double getB() {
        return bCoord;
    }
    public double getC() {
        return cCoord;
    }
    public void setA(double a) {
        aCoord = a;
    }
    public void setB(double b) {
        bCoord = b;
    }
    public void setC(double c) {
        cCoord = c;
    }
    public static double distanceTo(Point3d firstPoint, Point3d secondPoint) {
        return sqrt(pow((firstPoint.getA() + secondPoint.getA()), 2) + pow((firstPoint.getB() + secondPoint.getB()), 2) +
                pow(firstPoint.getC() + secondPoint.getC(), 2));
    }
    private static double scanADouble(){
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
    public static Point3d getPoint(){
        System.out.print("input a: ");
        double a=scanADouble();
        System.out.print("input b: ");
        double b=scanADouble();
        System.out.print("input c: ");
        double c=scanADouble();
        return new Point3d(a,b,c);
    }
}