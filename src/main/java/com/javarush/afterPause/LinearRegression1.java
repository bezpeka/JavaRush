//package com.javarush.afterPause;
//import org.apache.commons.math4.linear.Matrix;
//
//
//public class LinearRegression1 {
//    public static void main(String[] args) {
//        double[][] x = {{328.5, 84.19, 59.63, 59.06},
//                {345.0, 78.78, 46.84, 59.65},
//                {356.2, 76.54, 40.31, 66.61},
//                {340.0, 73.90, 46.64, 60.62},
//                {341.0, 74.80, 48.24, 59.75},
//                {351.0, 73.90, 40.83, 42.62},
//                {330.0, 82.00, 61.79, 48.59},
//                {356.0, 71.20, 46.08, 47.38},
//                {335.0, 67.60, 58.75, 45.17},
//                {338.0, 73.00, 51.67, 59.37},
//                {355.0, 74.80, 55.84, 52.24},
//                {360.0, 73.00, 47.83, 51.73},
//                {270.1, 55.03, 53.79, 68.19},
//                {489.0, 80.47, 40.49, 12.34},
//                {405.3, 82.28, 62.30, 75.81},
//                {322.0, 80.98, 83.65, 70.81},
//                {348.6, 74.03, 62.50, 58.63},
//                {335.7, 81.79, 60.83, 65.62}};
//
//        double[] y = {3063, 2920, 2831, 2643, 2672, 2274, 2794, 2319, 2229, 2506, 3266, 3254, 1381, 3976, 4741, 3843, 3871, 4048};
//
//        double[] beta = calculateLinearRegressionCoefficients(x, y);
//
//        // print out the calculated coefficients
//        for (double b : beta) {
//            System.out.println(b);
//        }
//    }
//
//    public static double[] calculateLinearRegressionCoefficients(double[][] x, double[] y) {
//        Matrix X = new Matrix(x);
//        Matrix Y = new Matrix(y, y.length);
//        Matrix XT = X.transpose();
//
//        Matrix XT_X = XT.times(X);
//        Matrix XT_X_inv = XT_X.inverse();
//        Matrix XT_Y = XT.times(Y);
//
//        Matrix beta = XT_X_inv.times(XT_Y);
//
//        double[] result = new double[beta.getRowDimension()];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = beta.get(i, 0);
//        }
//
//        return result;
//    }
//}
//
//
//
//
//
