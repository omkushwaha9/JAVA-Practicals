public class p5 {
    public static void main(String[] args) {
        double F = 2.3;
        double C;
        C = F-3.2/1.8;
        System.out.println("Equation = "+C);

        double pi = 3.14, r=4.5, R=11.90, h=34.78;
        double Area;
        Area = (pi*r*r)+(2*pi*R*h);
        System.out.println("Equation2 = "+Area);

        double a = 20.29, b = 10.90, x = 3.45,Side;
        Side = Math.sqrt((a*a)+(b*b)-(2*a*b)* Math.cos(x));
        System.out.println("Equation3 = "+Side);
    }
}
