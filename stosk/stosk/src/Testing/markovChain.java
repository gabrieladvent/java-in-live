package Testing;

import java.text.DecimalFormat;

public class markovChain {
    public static void main(String[] args) {
        // Data tekanan darah awal
        int initialBloodPressure = 130;

        // Matriks transisi perubahan tekanan darah
        double[][] transitionMatrix = {
                {0.5, 0.2, 0.2, 0.1},
                {0.1, 0.4, 0.3, 0.2},
                {0.2, 0.3, 0.3, 0.2},
                {0.1, 0.2, 0.3, 0.4}
        };

        // Kategori tekanan darah
        String[] hypertensionCategories = {"Normal", "Pre-Hipertensi", "Hipertensi Stage 1", "Hipertensi Stage 2"};

        // Menghitung perubahan tekanan darah menggunakan Markov Chain
        double[] currentProbabilities = {0, 0, 0, 0};
        currentProbabilities[getState(initialBloodPressure)] = 1;

        DecimalFormat decimalFormat = new DecimalFormat("0.00%");

        System.out.println("Perubahan tekanan darah menggunakan Markov Chain:");
        System.out.println("Tekanan awal: " + hypertensionCategories[getState(initialBloodPressure)]);

        for (int i = 0; i < hypertensionCategories.length; i++) {
            double probability = currentProbabilities[i];
            System.out.print("Probabilitas menjadi " + hypertensionCategories[i] + ": " + decimalFormat.format(probability));

            double[] nextProbabilities = new double[hypertensionCategories.length];
            for (int j = 0; j < nextProbabilities.length; j++) {
                for (int k = 0; k < currentProbabilities.length; k++) {
                    nextProbabilities[j] += currentProbabilities[k] * transitionMatrix[k][j];
                }
            }

            currentProbabilities = nextProbabilities;
        }

        // Menghitung persentase perubahan dari tekanan awal ke tekanan lain
        double sum = 0;
        for (double probability : currentProbabilities) {
            sum += probability;
        }

        System.out.println("\n\nPersentase perubahan dari tekanan awal:");
        for (int i = 0; i < hypertensionCategories.length; i++) {
            double percentage = currentProbabilities[i] / sum;
            System.out.print(hypertensionCategories[i] + ": " + decimalFormat.format(percentage));
            if (i < hypertensionCategories.length - 1) {
                System.out.print(" ");
            }
        }
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
}
