package vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class PagoVenta extends java.awt.Dialog {

    Double ventaTotal = 0.00;
    Double entrega = 0.00;
    Double pagoVenta = 0.00;
    Double venta = 0.00;

    public PagoVenta (Control_pagos MVP, boolean modal) {
        super (MVP, modal);
        initComponents ();
         setIconImage(getIconImage());
        //this.setLocation (870, 280);

       
        ventaTotal = validaDouble (Control_pagos.txtTotal2.getText ());
        txtVentaPago.setText (String.format ("%.2f", ventaTotal));

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtVentaPago = new javax.swing.JLabel();
        txtPagoEntrega = new javax.swing.JTextField();
        txtCambioVenta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(308, 492));
        setResizable(false);
        setSize(new java.awt.Dimension(308, 492));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOTAL A PAGAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PAGO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 80, 30));

        txtVentaPago.setBackground(new java.awt.Color(102, 102, 102));
        txtVentaPago.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        txtVentaPago.setForeground(new java.awt.Color(255, 255, 255));
        txtVentaPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVentaPago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtVentaPago.setOpaque(true);
        jPanel1.add(txtVentaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 200, 50));

        txtPagoEntrega.setBackground(new java.awt.Color(153, 153, 153));
        txtPagoEntrega.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        txtPagoEntrega.setForeground(new java.awt.Color(0, 0, 102));
        txtPagoEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPagoEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPagoEntregaKeyReleased(evt);
            }
        });
        jPanel1.add(txtPagoEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 200, 50));

        txtCambioVenta.setBackground(new java.awt.Color(204, 204, 204));
        txtCambioVenta.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        txtCambioVenta.setForeground(new java.awt.Color(0, 0, 102));
        txtCambioVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCambioVenta.setAutoscrolls(true);
        txtCambioVenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtCambioVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtCambioVenta.setOpaque(true);
        txtCambioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCambioVentaKeyReleased(evt);
            }
        });
        jPanel1.add(txtCambioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 200, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CAMBIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 100, 20));

        btnLimpiar.setBackground(new java.awt.Color(0, 153, 255));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonLimpiar_pago.png"))); // NOI18N
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonLimpiar_pago2.png"))); // NOI18N
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonLimpiar_pago2.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 90, 50));

        btnPagar.setBackground(new java.awt.Color(51, 153, 0));
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonSalir_pago.png"))); // NOI18N
        btnPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnPagar.setContentAreaFilled(false);
        btnPagar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonSalir_pago2.png"))); // NOI18N
        btnPagar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonSalir_pago2.png"))); // NOI18N
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 90, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible (false);
        dispose ();
    }//GEN-LAST:event_closeDialog

    private void txtCambioVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCambioVentaKeyReleased

    }//GEN-LAST:event_txtCambioVentaKeyReleased

    private void txtPagoEntregaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoEntregaKeyReleased

         if (evt.getKeyCode () == KeyEvent.VK_ENTER) {
        venta = ventaTotal;
        entrega = validaDouble (txtPagoEntrega.getText ());
       if(entrega >= venta){
        pagoVenta = entrega - venta;
        
        txtCambioVenta.setText (String.format ("%.2f", pagoVenta));
       }else{
           JOptionPane.showMessageDialog (this, "DISCULPE..... El pago ingresado es insuficiente...!!!");
          
       }
         }
        
    }//GEN-LAST:event_txtPagoEntregaKeyReleased

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
       
        setVisible (false);
        dispose ();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtPagoEntrega.setText ("");
        txtCambioVenta.setText ("");
        txtPagoEntrega.requestFocus ();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main (String args[]) {
        java.awt.EventQueue.invokeLater (() -> {
            PagoVenta dialog = new PagoVenta ((Control_pagos) new java.awt.Frame (), true);
            dialog.addWindowListener (new java.awt.event.WindowAdapter () {
                @Override
                public void windowClosing (java.awt.event.WindowEvent e) {
                    System.exit (0);
                }
            });
            dialog.setVisible (true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCambioVenta;
    private javax.swing.JTextField txtPagoEntrega;
    private javax.swing.JLabel txtVentaPago;
    // End of variables declaration//GEN-END:variables
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
    /*   FUNCIONES  DE  VALIDACION*/
    public int validaInt (String number) {
        int result = 0; //Valor default.
        try {
            if (number != null) {
                result = Integer.parseInt (number);
            }
        } catch (NumberFormatException nfe) {
            //*No es numerico!
        }
        return result;
    }

    public double validaDouble (String number) {
        double result = 0; //Valor default.
        try {
            if (number != null) {
                result = Double.parseDouble (number);
            }
        } catch (NumberFormatException nfe) {
            //*No es numerico!
        }
        return result;
    }
    
      /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logoVentana.png"));
        return retValue;
    }

    /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

}
