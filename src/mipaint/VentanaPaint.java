package mipaint;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;

/**
 *
 * @author ALITO
 */
public class VentanaPaint extends javax.swing.JFrame {

    Puntos puntos = new Puntos();
    /*inicializo dos variables xx y yy que corresponden al grosor por defecto
    sin embargo el grosor puede cambiar   a través de las cajas de texto
    */
    int xx = 20;
    int yy = 20;

    public VentanaPaint() {
        initComponents();
        /*Titulo de la ventana*/
        setTitle("Mi Paint);
        /*Localizar en el centro la */
        setLocationRelativeTo(null);
        /*Icono de la */
        setIconImage(new ImageIcon(getClass().getResource("/img/palette.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_elementos = new javax.swing.JPanel();
        btn_bote = new javax.swing.JButton();
        btn_borrador = new javax.swing.JButton();
        btn_aerosol = new javax.swing.JButton();
        btn_texto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pnl_dibujo = new javax.swing.JPanel();
        btn_lapiz = new javax.swing.JToggleButton();
        btn_brocha = new javax.swing.JToggleButton();
        txt_x = new javax.swing.JTextField();
        txt_y = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_grosor = new javax.swing.JButton();
        menu_paint = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        btn_menu_guardar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_elementos.setBackground(new java.awt.Color(255, 252, 252));
        pnl_elementos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl_elementos.setMaximumSize(new java.awt.Dimension(400, 32767));

        btn_bote.setBackground(new java.awt.Color(255, 255, 254));
        btn_bote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paint.png"))); // NOI18N
        btn_bote.setToolTipText("Bote de Pintura");
        btn_bote.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_bote.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bote.setFocusPainted(false);
        btn_bote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_boteMouseClicked(evt);
            }
        });
        btn_bote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_boteActionPerformed(evt);
            }
        });

        btn_borrador.setBackground(new java.awt.Color(255, 255, 254));
        btn_borrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eraser.png"))); // NOI18N
        btn_borrador.setToolTipText("Borrador");
        btn_borrador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_borrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_borrador.setFocusPainted(false);
        btn_borrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borradorActionPerformed(evt);
            }
        });

        btn_aerosol.setBackground(new java.awt.Color(255, 255, 254));
        btn_aerosol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spray.png"))); // NOI18N
        btn_aerosol.setToolTipText("Aerosol");
        btn_aerosol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_aerosol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_aerosol.setFocusPainted(false);
        btn_aerosol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aerosolActionPerformed(evt);
            }
        });

        btn_texto.setBackground(new java.awt.Color(255, 255, 254));
        btn_texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/text.png"))); // NOI18N
        btn_texto.setToolTipText("Texto");
        btn_texto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_texto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_texto.setFocusPainted(false);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnl_dibujo.setBackground(new java.awt.Color(255, 255, 254));
        pnl_dibujo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_dibujoMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout pnl_dibujoLayout = new javax.swing.GroupLayout(pnl_dibujo);
        pnl_dibujo.setLayout(pnl_dibujoLayout);
        pnl_dibujoLayout.setHorizontalGroup(
            pnl_dibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );
        pnl_dibujoLayout.setVerticalGroup(
            pnl_dibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_dibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_dibujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_lapiz.setBackground(new java.awt.Color(255, 255, 254));
        btn_lapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil.png"))); // NOI18N
        btn_lapiz.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_lapiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_lapiz.setFocusPainted(false);

        btn_brocha.setBackground(new java.awt.Color(255, 255, 254));
        btn_brocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brush.png"))); // NOI18N
        btn_brocha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_brocha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_brocha.setFocusPainted(false);
        btn_brocha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_brochaMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Grosor");

        btn_grosor.setText("Cambiar Grosor");
        btn_grosor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grosorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_elementosLayout = new javax.swing.GroupLayout(pnl_elementos);
        pnl_elementos.setLayout(pnl_elementosLayout);
        pnl_elementosLayout.setHorizontalGroup(
            pnl_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_elementosLayout.createSequentialGroup()
                .addGroup(pnl_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_elementosLayout.createSequentialGroup()
                            .addComponent(btn_lapiz, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_brocha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_elementosLayout.createSequentialGroup()
                                .addComponent(btn_borrador, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_bote, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_elementosLayout.createSequentialGroup()
                                .addComponent(btn_aerosol, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_elementosLayout.createSequentialGroup()
                        .addComponent(txt_x, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_y, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_elementosLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1))
                    .addGroup(pnl_elementosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_grosor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_elementosLayout.setVerticalGroup(
            pnl_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_elementosLayout.createSequentialGroup()
                .addGroup(pnl_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_borrador)
                    .addComponent(btn_bote))
                .addGap(6, 6, 6)
                .addGroup(pnl_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_lapiz)
                    .addComponent(btn_brocha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_texto)
                    .addComponent(btn_aerosol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_grosor)
                .addContainerGap(359, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        jMenu3.setText("Nuevo");
        jMenu1.add(jMenu3);

        btn_menu_guardar.setText("Guardar");
        jMenu1.add(btn_menu_guardar);

        menu_paint.add(jMenu1);

        setJMenuBar(menu_paint);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_elementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_elementos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borradorActionPerformed
        puntos.Borrar();
        pnl_dibujo.repaint();
        pnl_dibujo.setBackground(new java.awt.Color(255, 255, 254));
    }//GEN-LAST:event_btn_borradorActionPerformed

    private void btn_aerosolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aerosolActionPerformed

    }//GEN-LAST:event_btn_aerosolActionPerformed

    private void btn_grosorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grosorActionPerformed
        xx = Integer.parseInt(txt_x.getText());
        yy = Integer.parseInt(txt_y.getText());
        //Captura los valores del grosor en cada una de las cajas de texto
    }//GEN-LAST:event_btn_grosorActionPerformed

    private void pnl_dibujoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_dibujoMouseDragged
        //Llamo al metodo FuardarPuntos y le mando las coordenadas en x y y que capturé
        puntos.GuardarPuntos(evt.getX(), evt.getY());
        //Llamo al metodo DibujarLapiz para que me pinte el 
        /* OJO este metodo puede  cambiar dependiendo del pincel que se necesite*/
        DibujarLapiz();
    }//GEN-LAST:event_pnl_dibujoMouseDragged

    private void btn_brochaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_brochaMouseClicked

    }//GEN-LAST:event_btn_brochaMouseClicked

    private void btn_boteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_boteMouseClicked
        JColorChooser colorChooser = new JColorChooser();
        Color color = JColorChooser.showDialog(this, "Seleccione color", this.getBackground());
        pnl_dibujo.setBackground(color);
    }//GEN-LAST:event_btn_boteMouseClicked

    private void btn_boteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_boteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_boteActionPerformed
    public void DibujarLapiz() {
        //size() para saber el tamaño de la Lista y asi el numero de iteraciones del ciclo
        for (int i = 0; i < puntos.ListaX().size(); i++) {
            //en las variables recorro las posiciones almacenadas en x y y segun la iteracion
            int x = puntos.ListaX().get(i);
            int y = puntos.ListaY().get(i);
            pnl_dibujo.getGraphics().fill3DRect(x, y, xx, yy, true);
        }
    }

    public void DibujarBrocha() {
        for (int i = 0; i < puntos.ListaX().size(); i++) {
            int x = puntos.ListaX().get(i);
            int y = puntos.ListaY().get(i);
            pnl_dibujo.getGraphics().fillOval(x, y, xx, yy);
        }
    }

    public void DibujarPluma() {
        for (int i = 0; i < puntos.ListaX().size(); i++) {
            int x = puntos.ListaX().get(i);
            int y = puntos.ListaY().get(i);
            pnl_dibujo.getGraphics().fillRoundRect(x, y, xx, 5, xx, 5);
        }
    }

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
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aerosol;
    private javax.swing.JButton btn_borrador;
    private javax.swing.JButton btn_bote;
    private javax.swing.JToggleButton btn_brocha;
    private javax.swing.JButton btn_grosor;
    private javax.swing.JToggleButton btn_lapiz;
    private javax.swing.JMenu btn_menu_guardar;
    private javax.swing.JButton btn_texto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuBar menu_paint;
    private javax.swing.JPanel pnl_dibujo;
    private javax.swing.JPanel pnl_elementos;
    private javax.swing.JTextField txt_x;
    private javax.swing.JTextField txt_y;
    // End of variables declaration//GEN-END:variables
}
