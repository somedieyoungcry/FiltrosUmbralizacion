package FRestauracion;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Arrays;

public class Restauracion {

    int[][] matrizr, matrizg, matrizb;

    public short[][] calculoConvolucion(short[][] matrizGris, short[][] kernel) {
        short[][] matrizNueva = new short[matrizGris.length][matrizGris[0].length];
        int tope = kernel.length / 2;
        for (int i = tope; i < matrizNueva.length - tope; i++) {
            for (int j = tope; j < matrizNueva[0].length - tope; j++) {
                matrizNueva[i][j] = convolucionar(matrizGris, kernel, i, j);
            }
        }
        return matrizNueva;
    }

    public short convolucionar(short[][] matrizGris, short[][] kernel, int fila, int columna) {
        int tope = kernel.length / 2;
        short pixel = 0;
        short factor = 0;
        for (int i = 0; i < kernel.length; i++) {
            for (int j = 0; j < kernel[0].length; j++) {
                factor += kernel[i][j];
                pixel += (short) (kernel[i][j] * matrizGris[fila - tope + i][columna - tope + j]);
            }
        }
        if (factor > 0) {
            pixel /= factor;
        }
        return pixel;
    }

    public int mediaAritmetica(short[] a) {
        int media = 0;
        for (int i = 0; i < a.length; i++) {
            media = media + a[i];
        }
        media = media / a.length;
        return media;
    }

    public short[][] filtroMediaAritmetica(short[][] a) {
        short[] ar = new short[8];
        short[][] matrizNueva = new short[a.length][a[0].length];
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 1; j < a[i].length - 1; j++) {
                ar[0] = a[i - 1][j - 1];
                ar[1] = a[i][j - 1];
                ar[2] = a[i + 1][j - 1];
                ar[3] = a[i - 1][j];
                ar[4] = a[i + 1][j];
                ar[5] = a[i - 1][j + 1];
                ar[6] = a[i][j + 1];
                ar[7] = a[i + 1][j + 1];
                int nuevoPixel = mediaAritmetica(ar);
                matrizNueva[i][j] = (short) nuevoPixel;
            }
        }
        return matrizNueva;
    }

   /* public int mediaGeometrica(short[] a) {
        int media = 1;
        for (int i = 0; i < a.length; i++) {
            media = media * a[i];
        }
        media = (int) Math.pow(media, 8);
        return media;
    }

    public short[][] filtroMediaGeometrica(short[][] a) {
        short[] ar = new short[8];
        short[][] matrizNueva = new short[a.length][a[0].length];
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 1; j < a[i].length - 1; j++) {
                ar[0] = a[i - 1][j - 1];
                ar[1] = a[i][j - 1];
                ar[2] = a[i + 1][j - 1];
                ar[3] = a[i - 1][j];
                ar[4] = a[i + 1][j];
                ar[5] = a[i - 1][j + 1];
                ar[6] = a[i][j + 1];
                ar[7] = a[i + 1][j + 1];
                int nuevoPixel = mediaGeometrica(ar);
                matrizNueva[i][j] = (short) nuevoPixel;
            }
        }
        return matrizNueva;
    }*/
    
    public short[][] mediaGeometrica(short[][] matriz) {
        long media = 1;
        short[][] matrizNueva = new short[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizNueva[i][j] = matriz[i][j];
            }
        }

        for (int i = 1; i < matriz.length - 1; i++) {
            for (int j = 1; j < matriz[i].length - 1; j++) {
                for (int k = 0; k < vecindad(i, j, matriz).length; k++) {
                    media *= (vecindad(i, j, matriz)[k]);
                }
                media = (long) (Math.pow((double) media, 0.125));
                matrizNueva[i][j] = (short) media;
                media = 1;
            }
        }
        return matrizNueva;
    }

    public int mediana(short[] a) {
        int mediana;
        int mitad = a.length / 2;
        if (a.length % 2 == 0) {
            mediana = (a[mitad - 1] + a[mitad]) / 2;
        } else {
            mediana = a[mitad];
        }
        return mediana;
    }

    public short[][] filtroMediana(short[][] a) {
        short[] ar = new short[8];
        short[][] matrizNueva = new short[a.length][a[0].length];
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 1; j < a[i].length - 1; j++) {
                ar[0] = a[i - 1][j - 1];
                ar[1] = a[i][j - 1];
                ar[2] = a[i + 1][j - 1];
                ar[3] = a[i - 1][j];
                ar[4] = a[i + 1][j];
                ar[5] = a[i - 1][j + 1];
                ar[6] = a[i][j + 1];
                ar[7] = a[i + 1][j + 1];
                int nuevoPixel = mediana(ar);
                matrizNueva[i][j] = (short) nuevoPixel;
            }
        }
        return matrizNueva;
    }

    public int maximo(short[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public short[][] filtroMaximo(short[][] a) {
        short[] ar = new short[8];
        short[][] matrizNueva = new short[a.length][a[0].length];
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 1; j < a[i].length - 1; j++) {
                ar[0] = a[i - 1][j - 1];
                ar[1] = a[i][j - 1];
                ar[2] = a[i + 1][j - 1];
                ar[3] = a[i - 1][j];
                ar[4] = a[i + 1][j];
                ar[5] = a[i - 1][j + 1];
                ar[6] = a[i][j + 1];
                ar[7] = a[i + 1][j + 1];
                int nuevoPixel = maximo(ar);
                matrizNueva[i][j] = (short) nuevoPixel;
            }
        }
        return matrizNueva;
    }
    
        public int minimo(short[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public short[][] filtroMinimo(short[][] a) {
        short[] ar = new short[8];
        short[][] matrizNueva = new short[a.length][a[0].length];
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 1; j < a[i].length - 1; j++) {
                ar[0] = a[i - 1][j - 1];
                ar[1] = a[i][j - 1];
                ar[2] = a[i + 1][j - 1];
                ar[3] = a[i - 1][j];
                ar[4] = a[i + 1][j];
                ar[5] = a[i - 1][j + 1];
                ar[6] = a[i][j + 1];
                ar[7] = a[i + 1][j + 1];
                int nuevoPixel = minimo(ar);
                matrizNueva[i][j] = (short) nuevoPixel;
            }
        }
        return matrizNueva;
    }

    public short[][] filtroPuntoMedio(short[][] a) {
        short[] ar = new short[8];
        short[][] matrizNueva = new short[a.length][a[0].length];
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 1; j < a[i].length - 1; j++) {
                ar[0] = a[i - 1][j - 1];
                ar[1] = a[i][j - 1];
                ar[2] = a[i + 1][j - 1];
                ar[3] = a[i - 1][j];
                ar[4] = a[i + 1][j];
                ar[5] = a[i - 1][j + 1];
                ar[6] = a[i][j + 1];
                ar[7] = a[i + 1][j + 1];
                int nuevoPixel = (maximo(ar) + minimo(ar)) / 2;
                matrizNueva[i][j] = (short) nuevoPixel;
            }
        }
        return matrizNueva;
    }
     public short[] vecindad(int i, int j, short[][] matriz) {
        short[] arreglo = new short[8];
        arreglo[0] = matriz[i - 1][j - 1];
        arreglo[1] = matriz[i - 1][j];
        arreglo[2] = matriz[i - 1][j + 1];
        arreglo[3] = matriz[i][j - 1];
        arreglo[4] = matriz[i][j + 1];
        arreglo[5] = matriz[i + 1][j - 1];
        arreglo[6] = matriz[i + 1][j];
        arreglo[7] = matriz[i + 1][j + 1];
        return arreglo;
    }
     
    public short[][] mediaSeccion(short[][] matriz) {
        short[] arreglo;
        short[][] matrizNueva = new short[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizNueva[i][j] = matriz[i][j];
            }
        }
        for (int i = 1; i < matriz.length - 1; i++) {
            for (int j = 1; j < matriz[i].length - 1; j++) {
                arreglo = vecindad(i, j, matriz);
                Arrays.sort(arreglo);
                matrizNueva[i][j] = (short) ((arreglo[2] + arreglo[3] + arreglo[4] + arreglo[5]) / 4);
            }
        }
        return matrizNueva;
    }
}
