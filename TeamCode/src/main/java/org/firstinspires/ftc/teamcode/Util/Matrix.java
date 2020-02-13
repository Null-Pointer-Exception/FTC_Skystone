package org.firstinspires.ftc.teamcode.Util;


public class Matrix {
    public static double[][] cMult(double k, double[][] a){
        double[][] res = new double[a.length][a[0].length];
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; i++){
                res[i][j] = k * a[i][j];
            }
        }
        return res;
    } 
    
    public static double[][] add(double[][] a, double [][] b){
        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;
        if(r1 != r2 || c1 != c2){
            throw new IndexOutOfBoundsException();
        }
        double[][] res = new double[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }
    
    public static double[][] subtract(double[][] a, double [][] b){
        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;
        if(r1 != r2 || c1 != c2){
            throw new IndexOutOfBoundsException();
        }
        double[][] res = new double[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }
    
    public static double[][] multiply(double[][] a, double [][] b){
        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;
        if(r2 != c1){
            throw new IndexOutOfBoundsException();
        }
        double[][] res = new double[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                double sum = 0;
                for(int k = 0; k < c1; k++){
                    sum += a[i][k] * b[k][j];
                }
                res[i][j] = sum;
            }
        }
        return res;
    }
}
