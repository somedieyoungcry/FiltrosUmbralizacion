package Controlador;

import FRestauracion.Restauracion;
import Histograma.DibujarGrafico;
import Histograma.Histograma;
import Modelo.FFTException;
import java.awt.event.ActionListener;
import CPrincipales.Imagen;
import CPrincipales.Umbral;
import Panel.Frame;
import CPrincipales.Operadores;
import Modelo.ImageFFT;
import Morfologia.FMorfo;
import Panel.FHIs;
import Panel.HSI;
import Panel.Inicio;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class Controlador implements ActionListener {

    private Frame view;
    private Imagen img3;
    private FHIs FH;
    private HSI hsi;
    private Imagen modelo1;
    private Umbral modelo2;
    private short[][] kernel;
    private short [][] matrizAct;
    Frame ventanaPrincipal = new Frame();

    Imagen img = new Imagen();
    Imagen img1 = new Imagen();
    Umbral model = new Umbral();
    Operadores op = new Operadores();
    Restauracion res = new Restauracion();
    ImageFFT imgFF = new ImageFFT();
    Histograma his = new Histograma();
    Inicio in = new Inicio();
    FMorfo fm = new FMorfo();

    int u1;
    int u2;
    short c1, c2, c3, c4, c5, c6, c7, c8, c9;

    public Controlador(Frame view, Imagen modelo1) {
        this.view = view;
        this.FH = FH;
        this.modelo1 = modelo1;
        this.view.fGris2.addActionListener(this);
        this.view.bImagen1.addActionListener(this);
        this.view.Regresar.addActionListener(this);
        this.view.jMenuItem1.addActionListener(this);
        this.view.jMenuItem2.addActionListener(this);
        this.view.jMenuItem3.addActionListener(this);
        this.view.jMenuItem4.addActionListener(this);
        this.view.jMenuItem5.addActionListener(this);
        this.view.jMenuItem6.addActionListener(this);
        this.view.jMenuItem7.addActionListener(this);
        this.view.jMenuItem8.addActionListener(this);
        this.view.jMenuItem9.addActionListener(this);
        this.view.jMenuItem10.addActionListener(this);
        this.view.jMenuItem11.addActionListener(this);
        this.view.jMenuItem12.addActionListener(this);
        this.view.jMenuItem13.addActionListener(this);
        this.view.jMenuItem14.addActionListener(this);
        this.view.jMenuItem15.addActionListener(this);
        this.view.jMenuItem16.addActionListener(this);
        this.view.jMenuItem17.addActionListener(this);
        this.view.jMenuItem18.addActionListener(this);
        this.view.jMenuItem19.addActionListener(this);
        this.view.jMenuItem20.addActionListener(this);
        this.view.jMenuItem21.addActionListener(this);
        this.view.jMenuItem22.addActionListener(this);
        this.view.jMenuItem23.addActionListener(this);
        this.view.jMenuItem24.addActionListener(this);
        this.view.jMenuItem25.addActionListener(this);
        this.view.jMenuItem26.addActionListener(this);
        this.view.jMenuItem27.addActionListener(this);
        this.view.jMenuItem28.addActionListener(this);
        this.view.jMenuItem29.addActionListener(this);
        this.view.jMenuItem30.addActionListener(this);
        this.view.jMenuItem31.addActionListener(this);
        this.view.jMenuItem32.addActionListener(this);
        this.view.jMenuItem33.addActionListener(this);
        this.view.jMenuItem34.addActionListener(this);
        this.view.jMenuItem35.addActionListener(this);
        this.view.jMenuItem36.addActionListener(this);
        this.view.jMenuItem37.addActionListener(this);
        this.view.jMenuItem38.addActionListener(this);
        this.view.jMenuItem39.addActionListener(this);
        this.view.jMenuItem40.addActionListener(this);
        this.view.jMenuItem41.addActionListener(this);
        this.view.jMenuItem42.addActionListener(this);
    }

    public void Iniciar() {
        view.setTitle("Proyecto Final");
        view.setLocation(0, 0);
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.fGris2) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(img.getMatrizGris());
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.bImagen1) {
            try {
                img = new Imagen(img.abrirImagen());
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                img1 = img.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon imagen1 = new ImageIcon(img.getBufferImagen());
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
            view.NAlto.setText("" + img.getFilas());
            view.IAncho.setText("" + img.getColumnas());
            view.NImagen.setText("" + img.getNombre());
        }
        if (e.getSource() == view.Regresar) {
            ImageIcon imagen1 = new ImageIcon(img.getBufferImagen());
            Icon icon1 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(icon1);
        }
        if (e.getSource() == view.jMenuItem1) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(model.calculaInverso(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem2) {
            JOptionPane.showMessageDialog(null, "Ingrese los o el Umbral que desea");
            u1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el umbral"));
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(model.operadorUmbral(img.getMatrizGris(), u1));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem3) {
            JOptionPane.showMessageDialog(null, "Ingrese los o el Umbral que desea");
            u1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el umbral"));
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(model.operadorUmbralInverso(img.getMatrizGris(), u1));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem4) {
            JOptionPane.showMessageDialog(null, "Ingrese los o el Umbral que desea");
            u1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el umbral"));
            u2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el umbral 2"));
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(model.UmbralBinario(img.getMatrizGris(), u1, u2));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem5) {
            JOptionPane.showMessageDialog(null, "Ingrese los o el Umbral que desea");
            u1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el umbral"));
            u2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el umbral 2"));
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(model.UmbralBinarioInverso(img.getMatrizGris(), u1, u2));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem6) {
            JOptionPane.showMessageDialog(null, "Ingrese los o el Umbral que desea");
            u1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el umbral"));
            u2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el umbral 2"));
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(model.UmbralEnGris(img.getMatrizGris(), u1, u2));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem7) {
            JOptionPane.showMessageDialog(null, "Ingrese los o el Umbral que desea");
            u1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el umbral"));
            u2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el umbral 2"));
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(model.UmbralEnGrisInverso(img.getMatrizGris(), u1, u2));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem8) {
            JOptionPane.showMessageDialog(null, "Ingrese los o el Umbral que desea");
            u1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el umbral"));
            u2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el umbral 2"));
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(model.OperadordeExtension(img.getMatrizGris(), u1, u2));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem9) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(model.reduccionDeGrises(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem10) {//suma
             BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(op.operadorSuma(img.getMatrizGris(), img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem11) {//resta
             try {
                JOptionPane.showMessageDialog(view, "Ingrese 2da Imagen");
                this.img3 = new Imagen(img.abrirImagen());
                ImageIcon img18 = new ImageIcon(img.convierteMatrizEnBufferedImage(op.operadorResta(model.UmbralBinario(img.getMatrizGris(), 1, 150), model.UmbralBinario(img.getMatrizGris(), 1, 127))));
                matrizAct = op.operadorResta(model.UmbralBinario(img.getMatrizGris(), 1, 150), model.UmbralBinario(img.getMatrizGris(), 1, 127));
                Icon Icono8 = new ImageIcon(img18.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
                view.jImagen1.setIcon(Icono8);
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == view.jMenuItem12) {//And
            try {
                JOptionPane.showMessageDialog(view, "Ingrese 2da Imagen");
                this.img3 = new Imagen(img.abrirImagen());
                ImageIcon img18 = new ImageIcon(img.convierteMatrizEnBufferedImage(op.operadorAnd(model.UmbralBinario(img.getMatrizGris(), 1, 150), model.UmbralBinario(img.getMatrizGris(), 1, 127))));
                matrizAct = op.operadorAnd(model.UmbralBinario(img.getMatrizGris(), 1, 150), model.UmbralBinario(img.getMatrizGris(), 1, 127));
                Icon Icono8 = new ImageIcon(img18.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
                view.jImagen1.setIcon(Icono8);
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == view.jMenuItem13) {//or
            try {
                JOptionPane.showMessageDialog(view, "Ingrese 2da Imagen");
                this.img3 = new Imagen(img.abrirImagen());
                ImageIcon img18 = new ImageIcon(img.convierteMatrizEnBufferedImage(op.operadorOr(model.UmbralBinario(img.getMatrizGris(), 1, 150), model.UmbralBinario(img.getMatrizGris(), 1, 127))));
                matrizAct = op.operadorOr(model.UmbralBinario(img.getMatrizGris(), 1, 150), model.UmbralBinario(img.getMatrizGris(), 1, 127));
                Icon Icono8 = new ImageIcon(img18.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
                view.jImagen1.setIcon(Icono8);
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == view.jMenuItem14) {//xor
             try {
                JOptionPane.showMessageDialog(view, "Ingrese 2da Imagen");
                this.img3 = new Imagen(img.abrirImagen());
                ImageIcon img18 = new ImageIcon(img.convierteMatrizEnBufferedImage(op.operadorXor(model.UmbralBinario(img.getMatrizGris(), 1, 150), model.UmbralBinario(img.getMatrizGris(), 1, 127))));
                matrizAct = op.operadorXor(model.UmbralBinario(img.getMatrizGris(), 1, 150), model.UmbralBinario(img.getMatrizGris(), 1, 127));
                Icon Icono8 = new ImageIcon(img18.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
                view.jImagen1.setIcon(Icono8);
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == view.jMenuItem15) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(op.rotar90(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem16) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(op.rotar180(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem17) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(op.rotar270(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem19) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(op.promedioDelPunto(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage());
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem18) {
            JOptionPane.showMessageDialog(null, "Ingrese Valores de la Matriz");
            c1 = Short.parseShort(JOptionPane.showInputDialog(null, "Ingrese Valor de Matriz 1, 1"));
            c2 = Short.parseShort(JOptionPane.showInputDialog(null, "Ingrese Valor de Matriz 1, 2"));
            c3 = Short.parseShort(JOptionPane.showInputDialog(null, "Ingrese Valor de Matriz 1, 3"));
            c4 = Short.parseShort(JOptionPane.showInputDialog(null, "Ingrese Valor de Matriz 2, 1"));
            c5 = Short.parseShort(JOptionPane.showInputDialog(null, "Ingrese Valor de Matriz 2, 2"));
            c6 = Short.parseShort(JOptionPane.showInputDialog(null, "Ingrese Valor de Matriz 2, 3"));
            c7 = Short.parseShort(JOptionPane.showInputDialog(null, "Ingrese Valor de Matriz 3, 1"));
            c8 = Short.parseShort(JOptionPane.showInputDialog(null, "Ingrese Valor de Matriz 3, 2"));
            c9 = Short.parseShort(JOptionPane.showInputDialog(null, "Ingrese Valor de Matriz 3, 3"));
            short[][] Kernel = {{c1, c2, c3}, {c4, c5, c6}, {c7, c8, c9}};
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(res.calculoConvolucion(img.getMatrizGris(), Kernel));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem20) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(res.filtroMediaAritmetica(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem21) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(res.mediaGeometrica(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem22) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(res.filtroMediana(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem23) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(res.filtroMaximo(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem24) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(res.filtroMinimo(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem25) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(res.filtroPuntoMedio(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem26) {
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(res.mediaSeccion(img.getMatrizGris()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem27) {
            ImageFFT fft = null;
            try {
                fft = new ImageFFT(img.convertRGBAToIndexed(img.getBufferImagen()));
            } catch (FFTException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            fft.transform();
            BufferedImage imagenactual2 = null;
            try {
                imagenactual2 = fft.getSpectrum();
            } catch (FFTException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage());
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem28) {
            FH = new FHIs();
            view.pack();
            FH.setVisible(true);
            FH.setDefaultCloseOperation(FH.DISPOSE_ON_CLOSE);
        }
        if (FH != null) {
            Histograma ObjHistograma = new Histograma();
            int[][] histograma = ObjHistograma.histograma((BufferedImage) img.getBufferImagen());
            DibujarGrafico ObjDibujaHisto = new DibujarGrafico();
            for (int i = 0; i < 5; i++) {
                int[] histogramaCanal = new int[256];
                System.arraycopy(histograma[i], 0, histogramaCanal, 0, histograma[i].length);
                switch (i) {
                    case 0:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, FH.jPanel_rojo, Color.red);
                        break;
                    case 1:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, FH.jPanel_verde, Color.green);
                        break;
                    case 2:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, FH.jPanel_azul, Color.blue);
                        break;
                    case 3:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, FH.jPanel_negro, Color.black);
                        break;
                    case 4:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, FH.jPanel_gris, Color.gray);
                        break;
                }
            }
        }
        if (e.getSource() == view.jMenuItem29) {
            try {
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio"));
                BufferedImage imagen = img.convertRGBAToIndexed(img.getBufferImagen());
                ImageFFT fft = new ImageFFT(imagen);
                fft.transform();
                fft.idealLowPassFilter(radio);
                fft.transform();
                ImageIcon img12 = new ImageIcon(fft.toImage(null));
                Icon iconoI2 = new ImageIcon(img12.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
                view.jImagen1.setIcon(iconoI2);
            } catch (FFTException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == view.jMenuItem30) {
            try {
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio"));
                BufferedImage imagen = img.convertRGBAToIndexed(img.getBufferImagen());
                ImageFFT fft = new ImageFFT(imagen);
                fft.transform();
                fft.idealHighPassFilter(radio);
                fft.transform();
                ImageIcon img12 = new ImageIcon(fft.toImage(null));
                Icon iconoI2 = new ImageIcon(img12.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
                view.jImagen1.setIcon(iconoI2);
            } catch (FFTException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == view.jMenuItem31) {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio"));
            double delta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Delta"));
            try {
                BufferedImage imagen = img.convertRGBAToIndexed(img.getBufferImagen());
                ImageFFT fft = new ImageFFT(imagen);
                fft.transform();
                fft.idealBandPassFilter(radio, delta);
                fft.transform();
                ImageIcon img12 = new ImageIcon(fft.toImage(null));
                Icon iconoI2 = new ImageIcon(img12.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
                view.jImagen1.setIcon(iconoI2);
            } catch (FFTException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == view.jMenuItem32) {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio"));
            double delta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Delta"));
            try {
                BufferedImage imagen = img.convertRGBAToIndexed(img.getBufferImagen());
                ImageFFT fft = new ImageFFT(imagen);
                fft.transform();
                fft.idealBandStopFilter(radio, delta);
                fft.transform();
                ImageIcon img12 = new ImageIcon(fft.toImage(null));
                Icon iconoI2 = new ImageIcon(img12.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
                view.jImagen1.setIcon(iconoI2);
            } catch (FFTException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == view.jMenuItem33) {
            try {
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio"));
                BufferedImage imagen = img.convertRGBAToIndexed(img.getBufferImagen());
                ImageFFT fft = new ImageFFT(imagen);
                fft.transform();
                fft.butterworthLowPassFilter(radio);
                fft.transform();
                ImageIcon img12 = new ImageIcon(fft.toImage(null));
                Icon iconoI2 = new ImageIcon(img12.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
                view.jImagen1.setIcon(iconoI2);
            } catch (FFTException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == view.jMenuItem34) {
            try {
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio"));
                BufferedImage imagen = img.convertRGBAToIndexed(img.getBufferImagen());
                ImageFFT fft = new ImageFFT(imagen);
                fft.transform();
                fft.butterworthHighPassFilter(radio);
                fft.transform();
                ImageIcon img12 = new ImageIcon(fft.toImage(null));
                Icon iconoI2 = new ImageIcon(img12.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
                view.jImagen1.setIcon(iconoI2);
            } catch (FFTException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == view.jMenuItem35) {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio"));
            double delta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Delta"));
            try {
                BufferedImage imagen = img.convertRGBAToIndexed(img.getBufferImagen());
                ImageFFT fft = new ImageFFT(imagen);
                fft.transform();
                fft.butterworthBandPassFilter(radio, delta);
                fft.transform();
                ImageIcon img12 = new ImageIcon(fft.toImage(null));
                Icon iconoI2 = new ImageIcon(img12.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
                view.jImagen1.setIcon(iconoI2);
            } catch (FFTException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == view.jMenuItem36) {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio"));
            double delta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Delta"));
            try {
                BufferedImage imagen = img.convertRGBAToIndexed(img.getBufferImagen());
                ImageFFT fft = new ImageFFT(imagen);
                fft.transform();
                fft.butterworthBandStopFilter(radio, delta);
                fft.transform();
                ImageIcon img12 = new ImageIcon(fft.toImage(null));
                Icon iconoI2 = new ImageIcon(img12.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
                view.jImagen1.setIcon(iconoI2);
            } catch (FFTException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == view.jMenuItem37) {
            img.convertRGBToCMY(img.getMatrizR(), img.getMatrizG(), img.getMatrizB());
            BufferedImage imagenactual2 = img.convertRGBToCMY(img.getMatrizR(), img.getMatrizG(), img.getMatrizB());
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem38) {
            hsi = new HSI();
            view.pack();
            hsi.setVisible(true);
            hsi.setDefaultCloseOperation(FH.DISPOSE_ON_CLOSE);
            BufferedImage imga2 = img.convierteMatrizEnBufferedImage(img.getHueImage(img.getMatrizR(), img.getMatrizG(), img.getMatrizB()));
            ImageIcon img1 = new ImageIcon(imga2);
            Icon img2 = new ImageIcon(img1.getImage().getScaledInstance(hsi.jMatiz.getWidth(), hsi.jMatiz.getHeight(), Image.SCALE_DEFAULT));
            hsi.jMatiz.setIcon(img2);
            BufferedImage imga3 = img.convierteMatrizEnBufferedImage(img.getSaturationImage(img.getMatrizR(), img.getMatrizG(), img.getMatrizB()));
            ImageIcon img4 = new ImageIcon(imga3);
            Icon img5 = new ImageIcon(img4.getImage().getScaledInstance(hsi.jSaturacion.getWidth(), hsi.jSaturacion.getHeight(), Image.SCALE_DEFAULT));
            hsi.jSaturacion.setIcon(img5);
            BufferedImage imagenactual2 = img.convierteMatrizEnBufferedImage(img.getIntensityImage(img.getMatrizR(), img.getMatrizG(), img.getMatrizB()));
            ImageIcon imagen1 = new ImageIcon(imagenactual2);
            Icon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(hsi.jIntensidad.getWidth(), hsi.jIntensidad.getHeight(), Image.SCALE_DEFAULT));
            hsi.jIntensidad.setIcon(imagen2);
        }
        if (e.getSource() == view.jMenuItem39) {
            int[] mascara = {1, 1, 1, 1, 1, 1, 1, 1, 1};
            ImageIcon img13 = new ImageIcon(fm.Erosion(img.getBufferImagen(), mascara, mascara.length));
            Icon iconoI3 = new ImageIcon(img13.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(iconoI3);
        }
        if (e.getSource() == view.jMenuItem40) {
            int[] mascara = {0, 1, 0, 1, 1, 1, 0, 1, 0};
            BufferedImage dila = fm.Dilatacion(img.getBufferImagen(), mascara, mascara.length);
            ImageIcon img13 = new ImageIcon(dila);
            Icon iconoI3 = new ImageIcon(img13.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(iconoI3);
        }
        if (e.getSource() == view.jMenuItem41) { //Este metodo pertenece a la clase Open
            int[] mascaraErosion = {1, 1, 1, 1, 1, 1, 1, 1, 1};
            int[] mascaraDilatacion = {0, 1, 0, 1, 1, 1, 0, 1, 0};
            BufferedImage ero = fm.Erosion(img.getBufferImagen(), mascaraErosion, mascaraErosion.length);
            BufferedImage dila = fm.Dilatacion(ero, mascaraDilatacion, mascaraDilatacion.length);
            ImageIcon img13 = new ImageIcon(dila);
            Icon iconoI3 = new ImageIcon(img13.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(iconoI3);

        }
        if (e.getSource() == view.jMenuItem42) { //Este metodo pertenece a Close
            int[] mascaraErosion = {1, 1, 1, 1, 1, 1, 1, 1, 1};
            int[] mascaraDilatacion = {0, 1, 0, 1, 1, 1, 0, 1, 0};
            BufferedImage dila = fm.Dilatacion(img.getBufferImagen(), mascaraDilatacion, mascaraDilatacion.length);
            BufferedImage ero = fm.Erosion(dila, mascaraErosion, mascaraErosion.length);
            ImageIcon img13 = new ImageIcon(ero);
            Icon iconoI3 = new ImageIcon(img13.getImage().getScaledInstance(view.jImagen1.getWidth(), view.jImagen1.getHeight(), Image.SCALE_DEFAULT));
            view.jImagen1.setIcon(iconoI3);

        }
    }
}
