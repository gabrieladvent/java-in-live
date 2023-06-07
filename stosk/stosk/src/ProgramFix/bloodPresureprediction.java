/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramFix;

/**
 *
 * @author ASUS
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class bloodPresureprediction {
    

    public static void main(String[] args) {
        int[] bloodPressures;
        Scanner scanner = new Scanner(System.in);

        // Memilih jenis data (bulanan atau mingguan)
        System.out.print("Pilih jenis data (1 = Bulanan, 2 = Mingguan): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            bloodPressures = new int[30];
            System.out.println("Masukkan data tekanan darah sebulan (30 data):");
        } else if (choice == 2) {
            bloodPressures = new int[7];
            System.out.println("Masukkan data tekanan darah seminggu (7 data):");
        } else {
            System.out.println("Pilihan tidak valid. Program berakhir.");
            return;
        }

        // Input data tekanan darah
        for (int i = 0; i < bloodPressures.length; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            bloodPressures[i] = scanner.nextInt();
        }

        // Menghitung matriks transisi perubahan
        int[][] transitionMatrix = calculateTransitionMatrix(bloodPressures);

        // Menampilkan matriks transisi perubahan
        System.out.println("\nMatriks Transisi Perubahan:");
        displayMatrix(transitionMatrix);

        // Menghitung matriks distribusi stabil
        double[] steadyState = calculateSteadyState(transitionMatrix);

        // Menampilkan matriks distribusi stabil
        System.out.println("\nMatriks Distribusi Stabil:");
        displayVector(steadyState);

        // Prediksi tekanan darah jangka pendek
        int normalCount = 0;
        int preHypertensionCount = 0;
        int hypertension1Count = 0;
        int hypertension2Count = 0;

        for (int bloodPressure : bloodPressures) {
            String prediction = calculatePrediction(bloodPressure, steadyState);

            switch (prediction) {
                case "Normal":
                    normalCount++;
                    break;
                case "Pre-Hipertensi":
                    preHypertensionCount++;
                    break;
                case "Hipertensi Stage 1":
                    hypertension1Count++;
                    break;
                case "Hipertensi Stage 2":
                    hypertension2Count++;
                    break;
            }
        }

        // Menampilkan hasil prediksi dalam persentase
        int totalCount = bloodPressures.length;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("\nHasil Prediksi Jangka Pendek:");
        System.out.println("Normal: " + decimalFormat.format((double) normalCount / totalCount * 100) + "%");
        System.out.println("Pre-Hipertensi: " + decimalFormat.format((double) preHypertensionCount / totalCount * 100) + "%");
        System.out.println("Hipertensi Stage 1: " + decimalFormat.format((double) hypertension1Count / totalCount * 100) + "%");
        System.out.println("Hipertensi Stage 2: " + decimalFormat.format((double) hypertension2Count / totalCount * 100) + "%");

        // Menampilkan kemungkinan terbesar
        System.out.println("\nKemungkinan terbesar:");
        int maxCount = Math.max(Math.max(normalCount, preHypertensionCount), Math.max(hypertension1Count, hypertension2Count));
        if (normalCount == maxCount) {
            System.out.println("Normal");
        }
        if (preHypertensionCount == maxCount) {
            System.out.println("Pre-Hipertensi");
        }
        if (hypertension1Count == maxCount) {
            System.out.println("Hipertensi Stage 1");
        }
        if (hypertension2Count == maxCount) {
            System.out.println("Hipertensi Stage 2");
        }
    }

//     Fungsi untuk menghitung matriks transisi perubahan
    public static int[][] calculateTransitionMatrix(int[] bloodPressures) {
        int[][] transitionMatrix = new int[4][4];

        for (int i = 0; i < bloodPressures.length - 1; i++) {
            int currentState = getState(bloodPressures[i]);
            int nextState = getState(bloodPressures[i + 1]);
            transitionMatrix[currentState][nextState]++;
        }

        return transitionMatrix;
    }



    // Fungsi untuk menghitung matriks distribusi stabil
    public static double[] calculateSteadyState(int[][] transitionMatrix) {
        int n = transitionMatrix.length;
        double[] steadyState = new double[n];
        double[] initialProbabilities = new double[n];

        for (int i = 0; i < n; i++) {
            initialProbabilities[i] = 1.0 / n;
        }

        for (int i = 0; i < 100; i++) {
            steadyState = multiplyMatrixAndVector(transitionMatrix, initialProbabilities);
            initialProbabilities = steadyState.clone();
        }

        return steadyState;
    }

    // Fungsi untuk mengalikan matriks dan vektor
    public static double[] multiplyMatrixAndVector(int[][] matrix, double[] vector) {
        int m = matrix.length;
        int n = matrix[0].length;
        double[] result = new double[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }

        return result;
    }

    // Fungsi untuk mendapatkan kategori berdasarkan tekanan darah
    public static int getState(int bloodPressure) {
        if (bloodPressure < 120) {
            return 0; // Normal
        } else if (bloodPressure >= 120 && bloodPressure <= 139) {
            return 1; // Pre-Hipertensi
        } else if (bloodPressure >= 140 && bloodPressure <= 159) {
            return 2; // Hipertensi Stage 1
        } else {
            return 3; // Hipertensi Stage 2
        }
    }

    // Fungsi untuk menghitung prediksi berdasarkan tekanan darah dan matriks distribusi stabil
    public static String calculatePrediction(int bloodPressure, double[] steadyState) {
        int state = getState(bloodPressure);

        if (steadyState[state] >= 0.5) {
            return "Hipertensi Stage 2";
        } else if (steadyState[state] >= 0.3) {
            return "Hipertensi Stage 1";
        } else if (steadyState[state] >= 0.1) {
            return "Pre-Hipertensi";
        } else {
            return "Normal";
        }
    }

    // Fungsi untuk menampilkan matriks
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan vektor
    public static void displayVector(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}

