package Morfologia;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class FMorfo {

    public BufferedImage Erosion(BufferedImage img, int mask[], int maskSize) {
        /**
         * Dimension of the image img.
         */
        BufferedImage imagenGris = img;
        int width = img.getWidth();
        int height = img.getHeight();

        //buff
        int buff[];

        //output of erosion
        int output[] = new int[width * height];

        //perform erosion
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                buff = new int[maskSize * maskSize];
                int i = 0;
                for (int ty = y - maskSize / 2, mr = 0; ty <= y + maskSize / 2; ty++, mr++) {
                    for (int tx = x - maskSize / 2, mc = 0; tx <= x + maskSize / 2; tx++, mc++) {

                        /**
                         * Sample 3x3 mask [kernel or structuring element] [0,
                         * 1, 0 1, 1, 1 0, 1, 0]
                         *
                         * Only those pixels of the image img that are under the
                         * mask element 1 are considered.
                         */
                        if (ty >= 0 && ty < height && tx >= 0 && tx < width) {
                            Color auxColor = new Color(img.getRGB(tx, ty));
                            //pixel under the mask
                            // System.out.println(mc);
                            // System.out.println(mr);
                            //System.out.println(mc+mr*maskSize);
                            if (mask[mr + mc / maskSize] != 1) {
                                continue;
                            }

                            buff[i] = auxColor.getRGB();
                            i++;

                        }
                    }
                }

                //sort buff
                java.util.Arrays.sort(buff);
                // System.out.println(i);
                //save lowest value
                output[x + y * width] = buff[(maskSize * maskSize) - i];
            }
        }

        /**
         * Save the erosion value in image img.
         */
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int v = output[x + y * width];
                imagenGris.setRGB(x, y, v);
            }
        }
        return imagenGris;
    }

    public BufferedImage Dilatacion(BufferedImage img, int mask[], int maskSize) {   
        /**
         * Dimension of the image img.
         */
        BufferedImage imagenGris = img;
        int width = img.getWidth();
        int height = img.getHeight();

        //buff
        int buff[];

        //output of erosion
        int output[] = new int[width * height];

        //perform erosion
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                buff = new int[maskSize * maskSize];
                int i = 0;
                for (int ty = y - maskSize / 2, mr = 0; ty <= y + maskSize / 2; ty++, mr++) {
                    for (int tx = x - maskSize / 2, mc = 0; tx <= x + maskSize / 2; tx++, mc++) {

                        /**
                         * Sample 3x3 mask [kernel or structuring element] [0,
                         * 1, 0 1, 1, 1 0, 1, 0]
                         *
                         * Only those pixels of the image img that are under the
                         * mask element 1 are considered.
                         */
                        if (ty >= 0 && ty < height && tx >= 0 && tx < width) {
                            Color auxColor = new Color(img.getRGB(tx, ty));
                            //pixel under the mask
                            // System.out.println(mc);
                            // System.out.println(mr);
                            //System.out.println(mc+mr*maskSize);
                            if (mask[mr + mc / maskSize] != 1) {
                                continue;
                            }

                            buff[i] = auxColor.getRGB();
                            i++;

                        }
                    }
                }

                //sort buff
                java.util.Arrays.sort(buff);
                // System.out.println(i);
                //save lowest value
                output[x + y * width] = buff[(maskSize * maskSize) - i];
            }
        }

        /**
         * Save the erosion value in image img.
         */
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int v = output[x + y * width];
                imagenGris.setRGB(x, y, v);
            }
        }
        return imagenGris;
    }
}
