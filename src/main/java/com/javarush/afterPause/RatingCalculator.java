package com.javarush.afterPause;

import org.apache.commons.math3.linear.*;

import java.util.Arrays;

public class RatingCalculator {
    private static final double[][] EXAMPLES = {{328.5, 84.19, 59.63, 59.06, 3063},
            {345.0, 78.78, 46.84, 59.65, 2920},
            {356.2, 76.54, 40.31, 66.61, 2831},
            {340.0, 73.90, 46.64, 60.62, 2643},
            {341.0, 74.80, 48.24, 59.75, 2672},
            {351.0, 73.90, 40.83, 42.62, 2274},
            {330.0, 82.00, 61.79, 48.59, 2794},
            {356.0, 71.20, 46.08, 47.38, 2319}};

    public static void main(String[] args) {
        double[] coefficients = calculateCoefficients(EXAMPLES);
        System.out.println("Coefficients: " + Arrays.toString(coefficients));
    }

    private static double[] calculateCoefficients(double[][] examples) {
        int n = examples.length;
        int m = examples[0].length - 1;
        double[][] A = new double[n][m];
        double[] b = new double[n];

        // Заполнение матрицы A и вектора b
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = examples[i][j];
            }
            b[i] = examples[i][m];
        }

        // Решение методом наименьших квадратов
        RealMatrix aMatrix = MatrixUtils.createRealMatrix(A);
        RealVector bVector = MatrixUtils.createRealVector(b);
        DecompositionSolver solver = new SingularValueDecomposition(aMatrix).getSolver();
        RealVector xVector = solver.solve(bVector);

        return xVector.toArray();
    }
}


