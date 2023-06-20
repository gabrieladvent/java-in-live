package Testing;

import java.text.DecimalFormat;

public class markovChain {
    public static double[] calculateSteadyState(double[][] transitionMatrix) {
        int n = transitionMatrix.length;
        double[][] transposeMatrix = transposeMatrix(transitionMatrix);

        double[] eigenvalues = calculateEigenvalues(transposeMatrix);
        double[][] eigenvectors = calculateEigenvectors(transposeMatrix, eigenvalues);

        int dominantEigenvalueIndex = findDominantEigenvalueIndex(eigenvalues);
        double[] steadyState = eigenvectors[dominantEigenvalueIndex];

        normalizeVector(steadyState);

        return steadyState;
    }

    private static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        return transpose;
    }

    private static double[] calculateEigenvalues(double[][] matrix) {
        // TODO: Implement eigenvalue calculation algorithm
        // You can use existing libraries or implement your own algorithm
        // to calculate eigenvalues of the matrix.
        // This implementation assumes the eigenvalues are already calculated.
        // Replace this with your eigenvalue calculation implementation.
        return new double[]{1.0, 0.5, 0.25}; // Placeholder values
    }

    private static double[][] calculateEigenvectors(double[][] matrix, double[] eigenvalues) {
        // TODO: Implement eigenvector calculation algorithm
        // You can use existing libraries or implement your own algorithm
        // to calculate eigenvectors of the matrix.
        // This implementation assumes the eigenvectors are already calculated.
        // Replace this with your eigenvector calculation implementation.
        return new double[][]{{1.0, 0.5, 0.25}, {0.5, 0.25, 0.125}, {0.25, 0.125, 0.0625}}; // Placeholder values
    }

    private static int findDominantEigenvalueIndex(double[] eigenvalues) {
        int dominantIndex = 0;
        double dominantValue = eigenvalues[0];

        for (int i = 1; i < eigenvalues.length; i++) {
            if (eigenvalues[i] > dominantValue) {
                dominantValue = eigenvalues[i];
                dominantIndex = i;
            }
        }

        return dominantIndex;
    }

    private static void normalizeVector(double[] vector) {
        double sum = 0.0;

        for (double value : vector) {
            sum += value;
        }

        for (int i = 0; i < vector.length; i++) {
            vector[i] /= sum;
        }
    }
    
    
    public static void main(String[] args) {
        double[][] transitionMatrix = {
            {0.2, 0.5, 0.3},
            {0.1, 0.6, 0.3},
            {0.4, 0.3, 0.3}
        };

        double[] steadyState = calculateSteadyState(transitionMatrix);

        System.out.println("Steady State:");
        for (int i = 0; i < steadyState.length; i++) {
            System.out.printf("State %d: %.4f\n", i, steadyState[i]);
        }
    }
}

