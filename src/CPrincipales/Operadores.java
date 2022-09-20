package CPrincipales;

public class Operadores {

    private Imagen objImagen;
    private short[][] kernel;

    public short[][] operadorSuma(short matrizGris[][], short matrizGris2[][]) {
        short k = 2;
        short matrizGrisNueva[][] = new short[matrizGris.length][matrizGris[0].length];
        if (matrizGris.length == matrizGris2.length && matrizGris[0].length == matrizGris2[0].length) {
            for (int i = 0; i < matrizGris.length; i++) {
                for (int j = 0; j < matrizGris[i].length; j++) {
                    matrizGrisNueva[i][j] = (short) ((matrizGris[i][j]) + (matrizGris2[i][j]) / k);
                }
            }
        }
        return matrizGrisNueva;
    }

    public short[][] operadorResta(short matrizGris[][], short matrizGris2[][]) {
        short k = 2;
        short matrizGrisNueva[][] = new short[matrizGris.length][matrizGris[0].length];
        if (matrizGris.length == matrizGris2.length && matrizGris[0].length == matrizGris2[0].length) {
            for (int i = 0; i < matrizGris.length; i++) {
                for (int j = 0; j < matrizGris[i].length; j++) {
                    matrizGrisNueva[i][j] = (short) ((matrizGris[i][j]) - (matrizGris2[i][j]) / k);
                }
            }
        }
        return matrizGrisNueva;
    }

    public short[][] operadorAnd(short matrizGris[][], short matrizGris2[][]) {
        short[][] matrizNueva = new short[matrizGris.length][matrizGris[0].length];
        boolean bandera1, bandera2;
        for (int i = 0; i < matrizGris.length; i++) {
            for (int j = 0; j < matrizGris[i].length; j++) {
                bandera1 = (matrizGris[i][j] == 255) ? true : false;
                bandera2 = (matrizGris2[i][j] == 255) ? true : false;
                if (bandera1 == false && bandera2 == true) {
                    matrizNueva[i][j] = 255;
                } else {
                    matrizNueva[i][j] = 0;
                }
            }
        }
        return matrizNueva;
    }

    public short[][] operadorOr(short[][] matriz, short[][] matriz2) {
        short[][] matrizNueva = new short[matriz.length][matriz[0].length];
        boolean bandera1, bandera2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                bandera1 = (matriz[i][j] == 255) ? true : false;
                bandera2 = (matriz2[i][j] == 255) ? true : false;
                if (bandera1 == false && bandera2 == false) {
                    matrizNueva[i][j] = 0;
                } else {
                    matrizNueva[i][j] = 255;
                }
            }
        }
        return matrizNueva;
    }

    public short[][] operadorXor(short[][] matriz, short[][] matriz2) {
        short[][] matrizNueva = new short[matriz.length][matriz[0].length];
        boolean bandera1, bandera2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                bandera1 = (matriz[i][j] == 255) ? true : false;
                bandera2 = (matriz2[i][j] == 255) ? true : false;
                if ((bandera1 == true && bandera2 == true) || (bandera1 == false && bandera2 == false)) {
                    matrizNueva[i][j] = 0;
                } else {
                    matrizNueva[i][j] = 255;
                }
            }
        }
        return matrizNueva;
    }

    public short[][] rotar90(short[][] matrizGris) {
        int w = matrizGris.length;
        int h = matrizGris[0].length;
        short[][] rot1 = new short[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                rot1[i][j] = matrizGris[w - j - 1][i];
            }
        }
        return rot1;
    }

    public short[][] rotar180(short[][] matrizGris) {
        short[][] matrizRotate1 = rotar90(matrizGris);
        int w = matrizGris.length;
        int h = matrizGris[0].length;
        short[][] rot1 = new short[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                rot1[i][j] = matrizRotate1[w - j - 1][i];
            }
        }
        return rot1;
    }

    public short[][] rotar270(short[][] matrizGris) {
        short[][] matrizRotate1 = rotar90(matrizGris);
        short[][] matrizRotate2 = rotar180(matrizRotate1);
        return matrizRotate2;
    }

    public short[][] promedioDelPunto(short[][] matriz) {
        int numero = matriz.length * 2;
        int newWidth = numero, newHeight = numero;
        short[][] matrizNueva = new short[numero][numero];
        int width = matriz.length;
        int height = matriz[0].length;
        double jFactor = (double) width / (double) newWidth;
        double iFactor = (double) height / (double) newHeight;
        for (int i = 0; i < newHeight; i++) {
            int I = (int) (i * iFactor);
            int p;
            for (int j = 0; j < newWidth; j++) {

                int J = (int) (j * jFactor);
                p = matriz[I][J];
                matrizNueva[i][j] = (short) p;

            }
        }
        return matrizNueva;
    }
}
