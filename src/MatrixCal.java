/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author FTIS\i12057
 */
public class MatrixCal {

    public static int[][] penjumlahan(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Ukuran matriks tidak sama!");
            return null;
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    res[i][j] = a[i][j] + b[i][j];
                }
            }
        }
        return res;
    }

    public static int[][] pengurangan(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Ukuran matriks tidak sama!");
            return null;
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    res[i][j] = a[i][j] - b[i][j];
                }
            }
        }
        return res;
    }

    public static int[][] perkalian(int[][] a, int[][] b) {
        int[][] res = new int[a[0].length][b.length];
        if (a.length != b[0].length || a[0].length != b.length) {
            System.out.println("Ukuran matriks tidak sesuai!");
            return null;
        } else {
            int[] temp1, temp2 = new int[b.length];
            for (int i = 0; i < a[0].length; i++) {
                for (int j = 0; j < b.length; j++) {
                    int temp = 0;
                    temp1 = a[i];
                    for (int k = 0; k < temp2.length; k++) {
                        temp2[k] = b[k][j];
                    }
                    for (int k = 0; k < temp1.length; k++) {
                        temp += temp1[k] * temp2[k];
                    }
                    res[i][j] = temp;
                }
            }
        }
        return res;
    }

    public static int[][] transpose(int[][] a) {
        int[][] res = new int[a[0].length][a.length];
        {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    res[i][j] = a[j][i];
                }
            }
        }
        return res;
    }
}
