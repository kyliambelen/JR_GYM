package vistas;

import bd.Conexion;
import dao.PagosDao;
import entidades.Pagos;
import entidades.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Operaciones_pago extends javax.swing.JFrame {

    UIManager UI;

    private Conexion conexion = new Conexion();
    Usuarios usuar;

    public Operaciones_pago() {
        initComponents();
    }

    public Operaciones_pago(Usuarios usuar) {
        initComponents();
        setIconImage(getIconImage());
        this.setTitle("CONTROL-PAGOS");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        txtIdpago.setVisible(false);
        txtUsuario_id.setVisible(false);
         mostrarTabla();

        this.usuar = usuar;

        if (usuar.getIdRol() == 1 || usuar.getIdRol() == 2) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

            // btnModuloAdmin.setVisible (true);
        } else {
            //btnModuloAdmin.setVisible (false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePagos = new javax.swing.JTable();
        PanelOP = new javax.swing.JPanel();
        LabelExento = new javax.swing.JLabel();
        txtExento = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtModo_pago = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        LabelCodigo = new javax.swing.JLabel();
        LabelDescripcion = new javax.swing.JLabel();
        LabelModoP = new javax.swing.JLabel();
        LabelMonto = new javax.swing.JLabel();
        LabelIva = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtUsuario_id = new javax.swing.JTextField();
        txtIdpago = new javax.swing.JTextField();
        LabelBanner = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        LabelCinta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(1300, 700));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1300, 700));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablePagos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TablePagos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TablePagos.setForeground(new java.awt.Color(51, 51, 51));
        TablePagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablePagos.setRowHeight(30);
        TablePagos.setSelectionBackground(java.awt.SystemColor.inactiveCaption);
        TablePagos.setShowVerticalLines(false);
        TablePagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablePagos);

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 1260, 320));

        PanelOP.setBackground(new java.awt.Color(148, 148, 148));
        PanelOP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelExento.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LabelExento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelExento.setText("EXENTO");
        PanelOP.add(LabelExento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 110, 30));

        txtExento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtExento.setForeground(new java.awt.Color(51, 51, 51));
        txtExento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtExento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExentoKeyTyped(evt);
            }
        });
        PanelOP.add(txtExento, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 220, 30));

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(51, 51, 51));
        txtCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        PanelOP.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 220, 30));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        txtDescripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelOP.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 220, 30));

        txtModo_pago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtModo_pago.setForeground(new java.awt.Color(51, 51, 51));
        txtModo_pago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelOP.add(txtModo_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 220, 30));

        txtMonto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(51, 51, 51));
        txtMonto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });
        PanelOP.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 220, 30));

        txtIva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIva.setForeground(new java.awt.Color(51, 51, 51));
        txtIva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaKeyTyped(evt);
            }
        });
        PanelOP.add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 220, 30));

        LabelCodigo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LabelCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelCodigo.setText("COD PAGO");
        PanelOP.add(LabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 30));

        LabelDescripcion.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LabelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelDescripcion.setText("DESCRIPCION");
        PanelOP.add(LabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 30));

        LabelModoP.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LabelModoP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelModoP.setText("MODO PAGO");
        PanelOP.add(LabelModoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 30));

        LabelMonto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LabelMonto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelMonto.setText("MONTO");
        PanelOP.add(LabelMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 110, 30));

        LabelIva.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LabelIva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelIva.setText("IVA");
        PanelOP.add(LabelIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 110, 30));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarPagos.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarPagos2.png"))); // NOI18N
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarPagos.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelOP.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 90, 50));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirPagos.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirPagos2.png"))); // NOI18N
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirPagos.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelOP.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 80, 90, 50));

        txtUsuario_id.setEditable(false);
        PanelOP.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, 40, 30));

        txtIdpago.setEditable(false);
        PanelOP.add(txtIdpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 40, 30));

        PanelPrincipal.add(PanelOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1260, 150));

        LabelBanner.setBackground(new java.awt.Color(255, 255, 153));
        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banner23.jpg"))); // NOI18N
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelBanner.setOpaque(true);
        PanelPrincipal.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1260, 150));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosOperaciones.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosOperaciones2.png"))); // NOI18N
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosOperaciones.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 90, 30));

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarPagos.png"))); // NOI18N
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarPagos2.png"))); // NOI18N
        btnEditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarPagos.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 90, 30));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarPagos.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarPagos2.png"))); // NOI18N
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarPagos.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 90, 30));

        LabelCinta.setBackground(new java.awt.Color(204, 204, 204));
        LabelCinta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cintaPagos.jpg"))); // NOI18N
        LabelCinta.setPreferredSize(new java.awt.Dimension(1260, 50));
        PanelPrincipal.add(LabelCinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 1260, 50));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TablePagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePagosMouseClicked

      
        int filaSeleccionada = TablePagos.rowAtPoint(evt.getPoint());

        txtIdpago.setText((String) TablePagos.getValueAt(filaSeleccionada, 0).toString());
        txtCodigo.setText((String) TablePagos.getValueAt(filaSeleccionada, 1).toString());
        txtDescripcion.setText((String) TablePagos.getValueAt(filaSeleccionada, 2).toString());
        txtModo_pago.setText((String) TablePagos.getValueAt(filaSeleccionada, 3).toString());
        txtMonto.setText((String) TablePagos.getValueAt(filaSeleccionada, 4).toString());
        txtIva.setText((String) TablePagos.getValueAt(filaSeleccionada, 5).toString());
        txtExento.setText((String) TablePagos.getValueAt(filaSeleccionada, 6).toString());

    }//GEN-LAST:event_TablePagosMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            addPagos();
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones_pago.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            editarPagos();
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones_pago.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        try {
            suprimirPagos();
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones_pago.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        char numero = evt.getKeyChar();

        if (Character.isLetter(numero)) {

            getToolkit().beep();
            evt.consume();

            UI = null;
            UI.put("OptionPane.background", new Color(255, 255, 255));
            UI.put("Panel.background", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
            UI.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Ingresar Solo Números...!!!",
                    "PAGOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtMontoKeyTyped

    private void txtIvaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaKeyTyped
        char numero = evt.getKeyChar();

        if (Character.isLetter(numero)) {

            getToolkit().beep();
            evt.consume();

            UI = null;
            UI.put("OptionPane.background", new Color(255, 255, 255));
            UI.put("Panel.background", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
            UI.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Ingresar Solo Números...!!!",
                    "PAGOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtIvaKeyTyped

    private void txtExentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExentoKeyTyped
        char numero = evt.getKeyChar();

        if (Character.isLetter(numero)) {

            getToolkit().beep();
            evt.consume();

            UI = null;
            UI.put("OptionPane.background", new Color(255, 255, 255));
            UI.put("Panel.background", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
            UI.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Ingresar Solo Números...!!!",
                    "PAGOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtExentoKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Administracion.opPagos = null;
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Operaciones_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Operaciones_pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JLabel LabelCinta;
    private javax.swing.JLabel LabelCodigo;
    private javax.swing.JLabel LabelDescripcion;
    private javax.swing.JLabel LabelExento;
    private javax.swing.JLabel LabelIva;
    private javax.swing.JLabel LabelModoP;
    private javax.swing.JLabel LabelMonto;
    private javax.swing.JPanel PanelOP;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTable TablePagos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtExento;
    private javax.swing.JTextField txtIdpago;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtModo_pago;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void mostrarTabla() {
        try {
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    if (columna == 7) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            TablePagos.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = conexion.conectar();
            String sql = "SELECT idpago,codpago,descripcion,modo_pago,monto,iva,exento FROM pagos";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("CODIGO");
            modelo.addColumn("DESCRIPCION");
            modelo.addColumn("MODO-PAGO");
            modelo.addColumn("MONTO");
            modelo.addColumn("IVA");
            modelo.addColumn("EXENTO");

            int[] anchos = {50, 90, 200, 220, 120, 120, 120};

            for (int i = 0; i < cantidadColumnas; i++) {

                TablePagos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {

                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);
                //TablePagos.setDefaultRenderer (Object.class, new CentrarColum_pagos ());

                TablePagos.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));

                TablePagos.getTableHeader().setFont(new Font("Cooper Black", 1, 10));

                TablePagos.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(51, 51, 51), Color.WHITE));
                TablePagos.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(51, 51, 51), Color.WHITE));
                TablePagos.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(51, 51, 51), Color.WHITE));
                TablePagos.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(51, 51, 51), Color.WHITE));
                TablePagos.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(51, 51, 51), Color.WHITE));
                TablePagos.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(51, 51, 51), Color.WHITE));
                TablePagos.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(51, 51, 51), Color.WHITE));

            }

        } catch (SQLException ex) {
            System.err.println("ex.toString");

        }

    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION  PARA  AGREGAR  LOS PAGOS ESTABLECIDOS  //
    public void addPagos() throws SQLException {
        try {

            Pagos pagos = new Pagos();
            PagosDao pagosDAO = new PagosDao();

            if (txtCodigo.getText().equals("") || txtDescripcion.getText().equals("") || txtModo_pago.getText().equals("") || txtMonto.getText().equals("") || txtIva.getText().equals("")) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                JOptionPane.showMessageDialog(this, "ATENCION..!No debe haber campos vacios",
                        "PAGOS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            } else {

                if (pagosDAO.existePago(txtCodigo.getText()) == 0) {

                    pagos.setCodpago(txtCodigo.getText());
                    pagos.setDescripcion(txtDescripcion.getText());
                    pagos.setModo_pago(txtModo_pago.getText());
                    pagos.setMonto(Double.parseDouble(txtMonto.getText()));
                    pagos.setIva(Double.parseDouble(txtIva.getText()));
                    pagos.setExento(Double.parseDouble(txtExento.getText()));
                    pagos.setUsuario_id(Integer.parseInt(txtUsuario_id.getText()));

                    if (pagosDAO.agregarPagos(pagos)) {

                        UI = null;
                        UIManager.put("OptionPane.background", new Color(255, 255, 255));
                        UIManager.put("Panel.background", new Color(255, 255, 255));
                        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                        JOptionPane.showMessageDialog(this, "Los Datos Se Guardaron Correctamente",
                                "PAGOS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                        limpiar();
                        mostrarTabla();

                    } else {

                        UI = null;
                        UIManager.put("OptionPane.background", new Color(255, 255, 255));
                        UIManager.put("Panel.background", new Color(255, 255, 255));
                        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                        JOptionPane.showMessageDialog(this, "Lo siento...!!! Ha Ocurrido Un Error Guardando Los Datos",
                                "PAGOS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                    }
                } else {
                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "El PAGO ya Se encuentra Registrado",
                            "PAGOS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                }
            }
        } catch (HeadlessException | NumberFormatException ex) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
            JOptionPane.showMessageDialog(this, "Error al Guardar los Datos",
                    "HORARIOS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            System.out.println("ex");
        }

    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
// FUNCION  PARA  EDITAR  LOS  PAGOS ESTABLECIDOS  //
    public void editarPagos() throws SQLException {

        try {
            Pagos pagos = new Pagos();
            PagosDao pagosDAO = new PagosDao();

            if (txtCodigo.getText().equals("") || txtDescripcion.getText().equals("") || txtModo_pago.getText().equals("") || txtMonto.getText().equals("") || txtIva.getText().equals("")) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                JOptionPane.showMessageDialog(this, "ATENCION..! Seleccione el registro de la tabla para Editar",
                        "PAGOS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            } else {

                pagos.setCodpago(txtCodigo.getText());
                pagos.setDescripcion(txtDescripcion.getText());
                pagos.setModo_pago(txtModo_pago.getText());
                pagos.setMonto(Double.parseDouble(txtMonto.getText()));
                pagos.setIva(Double.parseDouble(txtIva.getText()));
                pagos.setExento(Double.parseDouble(txtExento.getText()));
                pagos.setIdpago(Integer.parseInt(txtIdpago.getText()));
                pagos.setUsuario_id(Integer.parseInt(txtUsuario_id.getText()));

                if (pagosDAO.modificarPagos(pagos)) {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "Los Datos Se Guardaron Correctamente",
                            "PAGOS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                    limpiar();
                    mostrarTabla();

                } else {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "Lo siento...!!! Ha Ocurrido Un Error Guardando Los Datos",
                            "PAGOS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                }
            }
        } catch (HeadlessException | NumberFormatException e) {

            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
 /*   FUNCION  PARA  ELIMINAR  LOS  PAGOS ESTABLECIDOS */
    public void suprimirPagos() throws SQLException {

        if (txtCodigo.getText().equals("") || txtDescripcion.getText().equals("") || txtModo_pago.getText().equals("") || txtMonto.getText().equals("") || txtIva.getText().equals("")) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
            JOptionPane.showMessageDialog(this, "Debe Seleccionar el Pago Que Desea Eliminar.",
                    "PAGOS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
            int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Eliminar este Pago..?",
                    "PAGOS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            if (opcion == 0) {

                Pagos pagos = new Pagos();
                PagosDao pagosDAO = new PagosDao();

                pagos.setIdpago(Integer.parseInt(txtIdpago.getText()));

                if (pagosDAO.eliminarPagos(pagos.getIdpago())) {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "El Monto del pago se eliminó Correctamente.",
                            "PAGOS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                    limpiar();
                    mostrarTabla();

                } else {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "No se ha Podido Eliminar el Registro.",
                            "PAGOS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                }
            }
        }

    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // METODO PARA LIMPIAR LOS CAMPOS 
    public void limpiar() {

        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtModo_pago.setText("");
        txtMonto.setText("");
        txtIva.setText("");
        txtExento.setText("");
        txtIdpago.setText("");

    }

   // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
    @Override
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
