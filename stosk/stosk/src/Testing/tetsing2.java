package Testing;
import java.util.Scanner;

public class tetsing2 {
    private static final int JUMLAH_KATEGORI = 4;
    private static final int JUMLAH_HARI = 7;
    private static final int JUMLAH_BULAN = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Program Prediksi Tekanan Darah");
        System.out.println("Pilih basis data: ");
        System.out.println("1. Bulanan");
        System.out.println("2. Mingguan");
        System.out.print("Pilihan Anda: ");

        int basisData = scanner.nextInt();
        int[][] dataTekananDarah;

        if (basisData == 1) {
            dataTekananDarah = inputDataTekananDarah(JUMLAH_BULAN, JUMLAH_KATEGORI);
        } else if (basisData == 2) {
            dataTekananDarah = inputDataTekananDarah(JUMLAH_HARI, JUMLAH_KATEGORI);
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        double[][] matriksKeadaan = hitungMatriksKeadaan(dataTekananDarah);
        double[][] matriksProbabilitas = hitungMatriksProbabilitas(matriksKeadaan);
        double[] steadyState = hitungSteadyState(matriksProbabilitas);

        System.out.println("\nPrediksi Tekanan Darah:");
        for (int i = 0; i < JUMLAH_KATEGORI; i++) {
            double persentase = steadyState[i] * 100;
            System.out.printf("Kategori %s: %.2f%%\n", getKategori(i), persentase);
        }

        int indeksKategoriTerbesar = cariKategoriTerbesar(steadyState);
        System.out.println("\nKategori tekanan darah yang paling mungkin: " + getKategori(indeksKategoriTerbesar));
    }

    private static int[][] inputDataTekananDarah(int jumlahData, int jumlahKategori) {
        Scanner scanner = new Scanner(System.in);
        int[][] dataTekananDarah = new int[jumlahKategori][jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data " + (i + 1));
            for (int j = 0; j < jumlahKategori; j++) {
                System.out.print("Masukkan jumlah tekanan darah kategori " + getKategori(j) + ": ");
                dataTekananDarah[j][i] = scanner.nextInt();
            }
        }

        return dataTekananDarah;
    }

    private static String getKategori(int indeks) {
        switch (indeks) {
            case 0:
                return "Normal";
            case 1:
                return "Pre-hipertensi";
            case 2:
                return "Hipertensi stage 1";
            case 3:
                return "Hipertensi stage 2";
            default:
                return "Kategori tidak valid";
        }
    }

private static double[][] hitungMatriksKeadaan(int[][] dataTekananDarah) {
    int jumlahKategori = dataTekananDarah.length;
    int jumlahData = dataTekananDarah[0].length;

    double[][] matriksKeadaan = new double[jumlahKategori][jumlahKategori];

    for (int i = 0; i < jumlahKategori; i++) {
        int jumlahTransisi = 0;
        for (int j = 0; j < jumlahData - 1; j++) {
            jumlahTransisi += dataTekananDarah[i][j] * dataTekananDarah[i][j + 1];
        }

        int totalData = 0;
        for (int j = 0; j < jumlahData; j++) {
            totalData += dataTekananDarah[i][j];
        }

        for (int k = 0; k < jumlahKategori; k++) {
            matriksKeadaan[i][k] = (double) jumlahTransisi / totalData;
        }
    }

    return matriksKeadaan;
}


    private static double[][] hitungMatriksProbabilitas(double[][] matriksKeadaan) {
        int jumlahKategori = matriksKeadaan.length;

        double[][] matriksProbabilitas = new double[jumlahKategori][jumlahKategori];

        for (int i = 0; i < jumlahKategori; i++) {
            double jumlahProbabilitas = 0;
            for (int j = 0; j < jumlahKategori; j++) {
                jumlahProbabilitas += matriksKeadaan[i][j];
            }

            for (int k = 0; k < jumlahKategori; k++) {
                matriksProbabilitas[i][k] = matriksKeadaan[i][k] / jumlahProbabilitas;
            }
        }

        return matriksProbabilitas;
    }

    private static double[] hitungSteadyState(double[][] matriksProbabilitas) {
        int jumlahKategori = matriksProbabilitas.length;

        double[][] matriksTranspos = new double[jumlahKategori][jumlahKategori];
        for (int i = 0; i < jumlahKategori; i++) {
            for (int j = 0; j < jumlahKategori; j++) {
                matriksTranspos[i][j] = matriksProbabilitas[j][i];
            }
        }

        double[] steadyState = new double[jumlahKategori];
        steadyState[0] = 1.0;

        double[] tempSteadyState = new double[jumlahKategori];

        while (true) {
            for (int i = 0; i < jumlahKategori; i++) {
                tempSteadyState[i] = steadyState[i];
                steadyState[i] = 0;
            }

            for (int i = 0; i < jumlahKategori; i++) {
                for (int j = 0; j < jumlahKategori; j++) {
                    steadyState[i] += matriksTranspos[i][j] * tempSteadyState[j];
                }
            }

            boolean konvergen = true;
            for (int i = 0; i < jumlahKategori; i++) {
                if (Math.abs(steadyState[i] - tempSteadyState[i]) > 0.0001) {
                    konvergen = false;
                    break;
                }
            }

            if (konvergen) {
                break;
            }
        }

        return steadyState;
    }

    private static int cariKategoriTerbesar(double[] steadyState) {
        int indeksKategoriTerbesar = 0;
        double persentaseTerbesar = steadyState[0];

        for (int i = 1; i < steadyState.length; i++) {
            if (steadyState[i] > persentaseTerbesar) {
                persentaseTerbesar = steadyState[i];
                indeksKategoriTerbesar = i;
            }
        }

        return indeksKategoriTerbesar;
    }
}
