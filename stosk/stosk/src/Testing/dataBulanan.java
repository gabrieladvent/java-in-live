package Testing;

import java.text.DecimalFormat;
import java.util.Scanner;

public class dataBulanan {
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

        // Prediksi tekanan darah jangka pendek
        int normalCount = 0;
        int preHypertensionCount = 0;
        int hypertension1Count = 0;
        int hypertension2Count = 0;

        for (int bloodPressure : bloodPressures) {
            String prediction = calculatePrediction(bloodPressure);

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

    // Fungsi untuk menghitung prediksi berdasarkan tekanan darah
    public static String calculatePrediction(int bloodPressure) {
        if (bloodPressure < 120) {
            return "Normal";
        } else if (bloodPressure >= 120 && bloodPressure <= 139) {
            return "Pre-Hipertensi";
        } else if (bloodPressure >= 140 && bloodPressure <= 159) {
            return "Hipertensi Stage 1";
        } else {
            return "Hipertensi Stage 2";
        }
    }
}
