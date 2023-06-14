import java.text.DecimalFormat;
import java.util.Scanner;

public class Mingguan {

    // Fungsi untuk menghitung matriks transisi perubahan
    public static double[][] calculateTransitionMatrix(int[] bloodPressures) {
        double[][] countMatrix = new double[4][4];
        int[] currentStateCount = new int[4];

        for (int i = 0; i < bloodPressures.length - 1; i++) {
            int currentState = getState(bloodPressures[i]);
            int nextState = getState(bloodPressures[i + 1]);
            countMatrix[currentState][nextState]++;
            currentStateCount[currentState]++;
        }

        for (int i = 0; i < countMatrix.length; i++) {
            for (int j = 0; j < countMatrix[i].length; j++) {
                countMatrix[i][j] /= currentStateCount[i];
            }
        }

        return countMatrix;
    }

    // Fungsi untuk menghitung matriks distribusi stabil (steady state)
    public static double[][] calculateSteadyState(double[][] probabilityMatrix) {
        int n = probabilityMatrix.length;
        double[][] steadyState = new double[n][n];
        double[][] currentMatrix = new double[n][n];

        // Inisialisasi matriks awal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                currentMatrix[i][j] = probabilityMatrix[i][j];
            }
        }

        // Iterasi hingga mencapai konvergensi
        while (!isConverged(steadyState, currentMatrix)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    steadyState[i][j] = currentMatrix[i][j];
                }
            }

            // Mengupdate matriks distribusi stabil
            double[][] tempMatrix = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    double sum = 0;
                    for (int k = 0; k < n; k++) {
                        sum += steadyState[i][k] * probabilityMatrix[k][j];
                    }
                    tempMatrix[i][j] = sum;
                }
            }
            currentMatrix = tempMatrix;
        }

        return steadyState;
    }

    // Fungsi untuk memeriksa konvergensi matriks
    public static boolean isConverged(double[][] matrix1, double[][] matrix2) {
        int n = matrix1.length;
        double epsilon = 1e-8;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(matrix1[i][j] - matrix2[i][j]) > epsilon) {
                    return false;
                }
            }
        }

        return true;
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
        double[][] transitionMatrix = calculateTransitionMatrix(bloodPressures);

        // Menampilkan matriks transisi perubahan
        System.out.println("\nMatriks Peluang Transisi:");
        displayMatrix(transitionMatrix);

        // Menghitung matriks distribusi stabil
        double[][] steadyState = calculateSteadyState(transitionMatrix);

        // Menampilkan matriks distribusi stabil
        System.out.println("\nMatriks Distribusi Stabil:");
        displayMatrix(steadyState);
    }
}
