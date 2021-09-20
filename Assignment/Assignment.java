/*
 * Daniel Cui
 * 9/20/2021
 * Problem Set 1-A
 */

class Assignment {
    public static void main (String[] argos) {
        System.out.println("----------------Quadratic Formula--------------");
        System.out.println("");
        double a = 1; //Quadratic "a"
        double b = 5; //Quadratic "b"
        double c = 6; //Quadratic "c"
        double quad1; //Answer 1
        double quad2; //Answer 2
        
        quad1 = (-b + (Math.sqrt((Math.pow(b, 2)) - (4*a*c)))) / (2*a);
        System.out.println("Answer 1: " + quad1); //Answer 1
        
        quad2 = (-b - (Math.sqrt((Math.pow(b, 2)) - (4*a*c)))) / (2*a);
        System.out.println("Answer 2: " + quad2); //Answer 2
        
        //----------------Slope--------------
        double x1 = 0;
        double y1 = 0;
        double x2 = 2;
        double y2 = 3;
        double slope;
        
        slope = (y2 - y1) / (x2 - x1);
        System.out.println("");
        System.out.println("----------------Slope--------------");
        System.out.println("");
        System.out.println("Slope: " + slope);
        
        //----------------Midpoint--------------
        //variables are mostly same as above
        double midpointx;
        double midpointy;
        
        midpointx = (x1 + x2) / 2;
        midpointy = (y1 + y2) / 2;
        System.out.println("");
        System.out.println("----------------Midpoint--------------");
        System.out.println("");
        System.out.println("Midpoint: (" + midpointx + ", " + midpointy + ")");
    }
}