/*
 * Daniel Cui
 * 9/20/2021
 * Problem Set 1-A
 */

class Assignment {
    public static void main (String[] argos) {
        int a = 1; //Quadratic "a"
        int b = 5; //Quadratic "b"
        int c = 6; //Quadratic "c"
        double quad1; //Answer 1
        double quad2; //Answer 2
        
        quad2 = (-b - (Math.sqrt((Math.pow(b, 2)) - (4*a*c)))) / (2*a);
        System.out.println("QUADRATIC FORMULA");
        System.out.print("The solutions for " + a + "x^2 + " + b + "x + " + c + " are " + quad2); //Answer 1

        quad1 = (-b + (Math.sqrt((Math.pow(b, 2)) - (4*a*c)))) / (2*a);
        System.out.println(" and " + quad1 + "."); //Answer 2

        //----------------Slope--------------
        double x1 = 0; //The "x" coordinate of the first point
        double y1 = 0; //The "y" coordinate of the first point
        double x2 = 2; //The "x" coordinate of the second point
        double y2 = 3; //The "y" coordinate of the second point
        double slope; //The slope of the line that forms from the set of two points

        slope = (y2 - y1) / (x2 - x1);
        System.out.println("");
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + (int) x1 + ", " + (int) y1 + ") and (" + (int) x2 + ", " + (int) y2 + ") has a slope of " + slope);

        //----------------Midpoint--------------
        //variables are mostly same as above
        double midpointx; //Point x
        double midpointy; //Point y
        int x3 = 0; //The "x" coordinate of the first point
        int y3 = 0; //The "y" coordinate of the first point
        int x4 = 2; //The "x" coordinate of the second point
        int y4 = 3; //The "y" coordinate of the second point

        midpointx = (x1 + x2) / 2;
        midpointy = (y1 + y2) / 2;
        System.out.println("");
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (" + x3 + ", " + y3 + ") and (" + x4 + ", " + y4 + ") is (" + midpointx + ", " + midpointy + ")");

        //----------------Arithmetic Series--------------
        int n = 5; //Number of terms
        double k0 = 1; //First term
        double k1 = 5; //The nth term
        double i = 1; //How much it's increasing by
        double sum; //Answer

        sum = n * ((k0 + k1) / 2);
        System.out.println("");
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first " + n + " terms of an arithmetic series that starts with " + k0);
        System.out.println(" and increases by " + i + " is " + sum);

        //----------------Geometric Series--------------
        double r = 2; //Common ratio
        double p = 3; //First term
        int k = 3; //Number of terms
        double o; //Answer

        o = (p * (1 - Math.pow(r,k))) / (1-r);
        System.out.println("");
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first " + k + " terms of a finite geometric series that starts with " + p); 
        System.out.print(" and increases by a rate of " + r + " is " + o);
    }
}