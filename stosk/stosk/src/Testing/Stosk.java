/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Testing;

import java.text.DecimalFormat;
/**
 *
 * @author ASUS
 */import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Stosk {

    // Fungsi untuk menghitung matriks transisi perubahan
//public static int[][] calculateTransitionMatrix(int[] bloodPressures) {
//    int[][] countMatrix = new int[4][4];
//    for (int i = 0; i < bloodPressures.length - 1; i++) {
//        int currentState = getState(bloodPressures[i]);
//        int nextState = getState(bloodPressures[i + 1]);
//        countMatrix[currentState][nextState]++;
//    }
//    return countMatrix;
//    }

public static int[][] calculateTransitionMatrix(int[] bloodPressures) {
    int[][] destinationMatrix = new int[4][4];
    for (int i = 0; i < bloodPressures.length - 1; i++) {
        int currentState = getState(bloodPressures[i]);
        int nextState = getState(bloodPressures[i + 1]);
        destinationMatrix[currentState][nextState] = 1;
    }
    return destinationMatrix;
}


// Fungsi untuk menghitung probabilitas matriks transisi
public static double[][] calculateProbabilityMatrix(int[][] transitionMatrix) {
    int n = transitionMatrix.length;
    double[][] probabilityMatrix = new double[n][n];
    for (int i = 0; i < n; i++) {
        int totalTransitions = 0;
        for (int j = 0; j < n; j++) {
            totalTransitions += transitionMatrix[i][j];
        }
        for (int j = 0; j < n; j++) {
            if (totalTransitions != 0) {
                probabilityMatrix[i][j] = (double) transitionMatrix[i][j] / totalTransitions;
            }
        }
    }
    return probabilityMatrix;
}

// Fungsi untuk menghitung matriks distribusi stabil (steady state)
// Fungsi untuk menghitung matriks distribusi stabil (steady state)
public static double[][] calculateSteadyState(double[][] probabilityMatrix) {
    int n = probabilityMatrix.length;
    double[][] steadyState = new double[n][n];
    double[][] previousState = new double[n][n];
    double tolerance = 0.0001; // Toleransi konvergensi

    // Inisialisasi nilai awal
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            steadyState[i][j] = 1.0 / (n * n);
            previousState[i][j] = 0.0;
        }
    }

    // Iterasi hingga konvergensi tercapai
    while (!isConverged(steadyState, previousState, tolerance)) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                previousState[i][j] = steadyState[i][j]; // Simpan nilai sebelumnya

                double sum = 0.0;
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        sum += probabilityMatrix[k][l] * previousState[k][i] * previousState[l][j];
                    }
                }
                steadyState[i][j] = sum;
            }
        }
    }

    return steadyState;
}

// Fungsi untuk memeriksa apakah distribusi probabilitas telah konvergen
public static boolean isConverged(double[][] current, double[][] previous, double tolerance) {
    int n = current.length;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (Math.abs(current[i][j] - previous[i][j]) > tolerance) {
                return false; // Belum konvergen
            }
        }
    }
    return true; // Sudah konvergen
}



// Fungsi untuk mendapatkan status berdasarkan tekanan darah
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

// Fungsi untuk menampilkan matriks
public static void displayMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}

// Fungsi untuk menampilkan matriks dengan tipe data double
public static void displayMatrix(double[][] matrix) {
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(decimalFormat.format(matrix[i][j]) + " ");
        }
        System.out.println();
    }
}

// Fungsi untuk menampilkan vektor dengan tipe data double
public static void tampil(double[][] matrix) {
    int n = matrix.length;
    System.out.println("Hasil Perhitungan:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.printf("%.4f ", matrix[i][j]);
        }
        System.out.println();
    }
}


// Fungsi untuk menampilkan vektor dengan tipe data double dalam bentuk persen
public static void displayVectorPercentage(double[] vector, String[] kategori) {
    DecimalFormat decimalFormat = new DecimalFormat("0.00%");
    double sum = 0.0;
    for (double value : vector) {
        sum += value;
    }
    for (int i = 0; i < vector.length; i++) {
        double percentage = (vector[i] / sum) * 100;
        System.out.println(kategori[i] + ": " + decimalFormat.format(percentage / 100)); // Perubahan disini
    }
}

// Fungsi untuk menampilkan elemen dengan persentase terbesar dari vektor prediksi
public static void displayLargestProbability(double[] vector, String[] kategori) {
    DecimalFormat decimalFormat = new DecimalFormat("0.00%");
    int maxIndex = 0;
    double maxProbability = vector[0];
    for (int i = 1; i < vector.length; i++) {
        if (vector[i] > maxProbability) {
            maxProbability = vector[i];
            maxIndex = i;
        }
    }
    System.out.println("\nKemungkinan terbesar:");
    System.out.println(kategori[maxIndex]);
}

// Fungsi untuk menghitung prediksi jangka pendek atau jangka panjang
public static double[] calculatePrediction(double[][] steadyState,double[][] probabilityMatrix, int days) {
    int n = steadyState.length;
    double[] prediction = new double[n];
    for (int i = 0; i < n; i++) {
        double sum = steadyState[i][0];
        for (int j = 0; j < n; j++) {
            sum += probabilityMatrix[i][j] * steadyState[j][0] * days;
        }
        prediction[i] = sum;
    }
    // Normalisasi prediksi menjadi maksimal 100%
    double maxPrediction = prediction[0];
    for (int i = 1; i < n; i++) {
        if (prediction[i] > maxPrediction) {
            maxPrediction = prediction[i];
        }
    }
    for (int i = 0; i < n; i++) {
        prediction[i] = (prediction[i] / maxPrediction) * 100;
    }
    return prediction;
}


    
public static void main(String[] args) {
    int[] bloodPressures;
    String[] kategori = {"Normal", "Pre-Hipertensi", "Hipertensi Stage 1", "Hipertensi Stage 2"};
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
    
    // Menghitung probabilitas matriks transisi
    double[][] probabilityMatrix = calculateProbabilityMatrix(transitionMatrix);

    // Menampilkan probabilitas matriks transisi
    System.out.println("\nProbabilitas Matriks Transisi:");
    displayMatrix(probabilityMatrix);

    // Menghitung matriks distribusi stabil
    double[][] steadyState = calculateSteadyState(probabilityMatrix);

    // Menampilkan matriks distribusi stabil
    System.out.println("\nMatriks Distribusi Stabil:");
    tampil(steadyState);

    // Menghitung prediksi jangka pendek atau jangka panjang
    if (choice == 1) {
        // Menghitung prediksi jangka panjang (30 hari)
        System.out.println("\nPrediksi Jangka Panjang (30 hari):");
        double[] prediksiJangkaPanjang = calculatePrediction(steadyState, probabilityMatrix, 30);
        displayVectorPercentage(prediksiJangkaPanjang, kategori);
        displayLargestProbability(prediksiJangkaPanjang, kategori);
    } else if (choice == 2) {
        // Menghitung prediksi jangka pendek (7 hari)
        System.out.println("\nPrediksi Jangka Pendek (7 hari):");
        double[] shortTermPrediction = calculatePrediction(steadyState, probabilityMatrix, 7);
        displayVectorPercentage(shortTermPrediction, kategori);
        displayLargestProbability(shortTermPrediction, kategori);
    }
}
    
}
