/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Testing;

/**
 *
 * @author ASUS
 */import java.util.ArrayList;
import java.util.List;
public class Stosk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] bloodPressures = {125, 127, 138, 167, 164, 166};

        // Menghitung prediksi jangka pendek
        List<String> predictions = new ArrayList<>();
        for (int i = 0; i < bloodPressures.length; i++) {
            int bloodPressure = bloodPressures[i];
            String prediction = calculatePrediction(bloodPressure);
            predictions.add(prediction);
        }

        // Menampilkan hasil prediksi
        System.out.println("Hasil Prediksi Jangka Pendek:");
        for (int i = 0; i < bloodPressures.length; i++) {
            int bloodPressure = bloodPressures[i];
            String prediction = predictions.get(i);
            System.out.println("Tekanan darah: " + bloodPressure + " - Prediksi: " + prediction);
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
