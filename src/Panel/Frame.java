package Panel;

import CPrincipales.Imagen;
import CPrincipales.Umbral;

public class Frame extends javax.swing.JFrame {

    Imagen img = new Imagen();
    Imagen img1 = new Imagen();
    Umbral model = new Umbral();

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jImagen1 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NImagen = new javax.swing.JLabel();
        IAncho = new javax.swing.JLabel();
        NAlto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        bImagen1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        fGris2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(155, 177, 238));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jImagen1.setForeground(new java.awt.Color(0, 0, 0));

        Regresar.setBackground(new java.awt.Color(100, 137, 230));
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Regresar Imagen Original");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre Imagen:");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ancho:");

        jLabel8.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Alto:");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\juanj\\Downloads\\pChiquitito2.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 2, Short.MAX_VALUE)
                            .addComponent(IAncho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NAlto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(206, 206, 206))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(IAncho))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(NAlto)))
                            .addComponent(NImagen))
                        .addGap(63, 63, 63)
                        .addComponent(Regresar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(184, 206, 247));
        menuBar.setForeground(new java.awt.Color(184, 206, 247));

        jMenu1.setText("Archivo");
        jMenu1.setToolTipText("");

        bImagen1.setText("Buscar imagen");
        bImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImagen1ActionPerformed(evt);
            }
        });
        jMenu1.add(bImagen1);

        menuBar.add(jMenu1);

        jMenu2.setText("F. Gris");

        fGris2.setText("Filtro Gris");
        fGris2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fGris2ActionPerformed(evt);
            }
        });
        jMenu2.add(fGris2);

        menuBar.add(jMenu2);

        jMenu3.setText("Umbrales");

        jMenuItem1.setText("Inverso");
        jMenu3.add(jMenuItem1);

        jMenu7.setText("Umbral");

        jMenuItem2.setText("Operador Umbral");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        jMenuItem3.setText("Operador Umbral Inverso");
        jMenu7.add(jMenuItem3);

        jMenu3.add(jMenu7);

        jMenu11.setText("Binario");

        jMenuItem4.setText("Umbral binario");
        jMenu11.add(jMenuItem4);

        jMenuItem5.setText("Umbral binario inverso");
        jMenu11.add(jMenuItem5);

        jMenu3.add(jMenu11);

        jMenu12.setText("Umbral Gris");

        jMenuItem6.setText("Umbral en Gris");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem6);

        jMenuItem7.setText("Umbral en Gris inverso");
        jMenu12.add(jMenuItem7);

        jMenu3.add(jMenu12);

        jMenuItem8.setText("Operador de extencion");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Reduccion de niveles de gris");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        menuBar.add(jMenu3);

        jMenu4.setText("Operadores");

        jMenuItem10.setText("Suma");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Resta");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("And");
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Or");
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Xor");
        jMenu4.add(jMenuItem14);

        jMenu10.setText("Rotaciones");

        jMenuItem15.setText("Rotar 90");
        jMenu10.add(jMenuItem15);

        jMenuItem16.setText("Rotar 180");
        jMenu10.add(jMenuItem16);

        jMenuItem17.setText("Rotar 270");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem17);

        jMenu4.add(jMenu10);

        menuBar.add(jMenu4);

        jMenu5.setText("Restauradores");

        jMenuItem18.setText("Convolucion");
        jMenu5.add(jMenuItem18);

        jMenuItem19.setText("Interpolacion");
        jMenu5.add(jMenuItem19);

        jMenuItem20.setText("Media Aritmética");
        jMenu5.add(jMenuItem20);

        jMenuItem21.setText("Media Geométrica");
        jMenu5.add(jMenuItem21);

        jMenuItem22.setText("Mediana");
        jMenu5.add(jMenuItem22);

        jMenuItem23.setText("Max");
        jMenu5.add(jMenuItem23);

        jMenuItem24.setText("Min");
        jMenu5.add(jMenuItem24);

        jMenuItem25.setText("Punto Medio");
        jMenu5.add(jMenuItem25);

        jMenuItem26.setText("Media Sección");
        jMenu5.add(jMenuItem26);

        menuBar.add(jMenu5);

        jMenu6.setText("F. Dominio F.");

        jMenuItem27.setText("Transformada Fourier");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem27);

        jMenuItem28.setText("Histograma");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem28);

        jMenuItem29.setText("idealLowPassFilter");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem29);

        jMenuItem30.setText("idealHighPassFilter");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem30);

        jMenuItem31.setText("idealBandPassFilter");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem31);

        jMenuItem32.setText("idealBandStopFilter");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem32);

        jMenuItem33.setText("butterworthLowPassFilter");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem33);

        jMenuItem34.setText("butterworthHighPassFilter");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem34);

        jMenuItem35.setText("butterworthBandPassFilter");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem35);

        jMenuItem36.setText("butterworthBandStopFilter");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem36);

        menuBar.add(jMenu6);

        jMenu8.setText("Conversiones");

        jMenuItem37.setText("CMY");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem37);

        jMenuItem38.setText("HSI");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem38);

        menuBar.add(jMenu8);

        jMenu9.setText("F. Morfologicos");

        jMenuItem39.setText("Erosion");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem39);

        jMenuItem40.setText("Dilatacion");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem40);

        jMenuItem41.setText("Apertura");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem41);

        jMenuItem42.setText("Cierre");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem42);

        menuBar.add(jMenu9);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImagen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bImagen1ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void fGris2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fGris2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fGris2ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel IAncho;
    public javax.swing.JLabel NAlto;
    public javax.swing.JLabel NImagen;
    public javax.swing.JButton Regresar;
    public javax.swing.JMenuItem bImagen1;
    public javax.swing.JMenuItem fGris2;
    public javax.swing.JLabel jImagen1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    public javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    public javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JMenuItem jMenuItem10;
    public javax.swing.JMenuItem jMenuItem11;
    public javax.swing.JMenuItem jMenuItem12;
    public javax.swing.JMenuItem jMenuItem13;
    public javax.swing.JMenuItem jMenuItem14;
    public javax.swing.JMenuItem jMenuItem15;
    public javax.swing.JMenuItem jMenuItem16;
    public javax.swing.JMenuItem jMenuItem17;
    public javax.swing.JMenuItem jMenuItem18;
    public javax.swing.JMenuItem jMenuItem19;
    public javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JMenuItem jMenuItem20;
    public javax.swing.JMenuItem jMenuItem21;
    public javax.swing.JMenuItem jMenuItem22;
    public javax.swing.JMenuItem jMenuItem23;
    public javax.swing.JMenuItem jMenuItem24;
    public javax.swing.JMenuItem jMenuItem25;
    public javax.swing.JMenuItem jMenuItem26;
    public javax.swing.JMenuItem jMenuItem27;
    public javax.swing.JMenuItem jMenuItem28;
    public javax.swing.JMenuItem jMenuItem29;
    public javax.swing.JMenuItem jMenuItem3;
    public javax.swing.JMenuItem jMenuItem30;
    public javax.swing.JMenuItem jMenuItem31;
    public javax.swing.JMenuItem jMenuItem32;
    public javax.swing.JMenuItem jMenuItem33;
    public javax.swing.JMenuItem jMenuItem34;
    public javax.swing.JMenuItem jMenuItem35;
    public javax.swing.JMenuItem jMenuItem36;
    public javax.swing.JMenuItem jMenuItem37;
    public javax.swing.JMenuItem jMenuItem38;
    public javax.swing.JMenuItem jMenuItem39;
    public javax.swing.JMenuItem jMenuItem4;
    public javax.swing.JMenuItem jMenuItem40;
    public javax.swing.JMenuItem jMenuItem41;
    public javax.swing.JMenuItem jMenuItem42;
    public javax.swing.JMenuItem jMenuItem5;
    public javax.swing.JMenuItem jMenuItem6;
    public javax.swing.JMenuItem jMenuItem7;
    public javax.swing.JMenuItem jMenuItem8;
    public javax.swing.JMenuItem jMenuItem9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
