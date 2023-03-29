package com.javarush.afterPause;
import org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression;

public class LinearRegressionExample {
    public static void main(String[] args) {
        double[][] x = {{328.5, 84.19, 59.63, 59.06},
                {345.0, 78.78, 46.84, 59.65},
                {356.2, 76.54, 40.31, 66.61},
                {340.0, 73.90, 46.64, 60.62},
                {341.0, 74.80, 48.24, 59.75},
                {351.0, 73.90, 40.83, 42.62},
                {330.0, 82.00, 61.79, 48.59},
                {356.0, 71.20, 46.08, 47.38},
                {335.0, 67.60, 58.75, 45.17},
                {338.0, 73.00, 51.67, 59.37},
                {270.1, 55.03, 53.79, 68.19}};
        double[] y = {3063, 2920, 2831, 2643, 2672, 2274, 2794, 2319, 2229, 2506, 1381};
        OLSMultipleLinearRegression regression = new OLSMultipleLinearRegression();
        regression.newSampleData(y, x);
        double[] coefficients = regression.estimateRegressionParameters();
        System.out.println("Intercept: " + coefficients[0]);
        System.out.println("Coefficient X1: " + coefficients[1]);
        System.out.println("Coefficient X2: " + coefficients[2]);
        System.out.println("Coefficient X3: " + coefficients[3]);
        System.out.println("Coefficient X4: " + coefficients[4]);
    }
}

