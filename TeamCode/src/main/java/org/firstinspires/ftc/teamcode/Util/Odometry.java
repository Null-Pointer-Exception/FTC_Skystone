package org.firstinspires.ftc.teamcode.Util;

public class Odometry {
    final static double y0 = 1.0;
    final static double x0 = 1.0;
    final static double RADIUS = 1;
    //[angle1, angle2, angle3][0]
    public static int[] getPosition(double[][] angles){
        double[][] A = new double[][]{
            {y0, y0, 0.0},
            {x0, -x0, 2 * y0},
            {-1, 1, 0}
        };
        
        double[] result = Matrix(Matrix.cMult((RADIUS / (2 * y0), A)), angles);
        return result;
    }
}
