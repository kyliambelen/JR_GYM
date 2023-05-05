package vistas;

import bd.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class BuscarPago extends javax.swing.JDialog {

    UIManager UI;
    @SuppressWarnings("FieldMayBeFinal")
    private Conexion conexion = new Conexion();

    public BuscarPago(Operaciones_atletas ADDPAGOS, boolean modal) {
        super(ADDPAGOS, modal);
        initComponents();
         setIconImage(getIconImage());
        mostrarTabla_pagos();
    }
    public BuscarPago(AgregarAtletas ADDATLE, boolean modal) {
        super(ADDATLE, modal);
        initComponents();
         setIconImage(getIconImage());
        mostrarTabla_pagos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBuscar = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(472, 267));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 240));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("BUSCAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 60, 25));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 160, 25));

        TableBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TableBuscar.setForeground(new java.awt.Color(102, 102, 102));
        TableBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "MODO PAGO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableBuscar.setRowHeight(20);
        TableBuscar.setSelectionBackground(new java.awt.Color(128, 128, 128));
        TableBuscar.setShowVerticalLines(false);
        TableBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBuscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableBuscar);
        if (TableBuscar.getColumnModel().getColumnCount() > 0) {
            TableBuscar.getColumnModel().getColumn(0).setMinWidth(80);
            TableBuscar.getColumnModel().getColumn(0).setPreferredWidth(80);
            TableBuscar.getColumnModel().getColumn(0).setMaxWidth(80);
            TableBuscar.getColumnModel().getColumn(1).setMinWidth(250);
            TableBuscar.getColumnModel().getColumn(1).setPreferredWidth(250);
            TableBuscar.getColumnModel().getColumn(1).setMaxWidth(250);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 330, 110));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAGOS POR HORAS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 200, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 50));

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosHoras.png"))); // NOI18N
        LabelLogo.setOpaque(true);
        jPanel1.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        //buscarDatos_pagos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void TableBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBuscarMouseClicked

        /* FUNCION  PARA  SELECCIONAR  CON UN CLICK  EL PAGO  Y  PASAR  EL  PARAMETRO  AL CAMPO DEL MODULO  DE OPERACIONES ATLETAS  */
        if (TableBuscar.getSelectedRow() >= 0) {

            try {

                // PARA  PASAR  LOS  PARAMETROS  EN  EL  MODULO  OPERACIONES ATLETAS
                DefaultTableModel pasarDatos = (DefaultTableModel) TableBuscar.getModel();

                String idpago = String.valueOf(pasarDatos.getValueAt(TableBuscar.getSelectedRow(), 0));
                String modo_pago = String.valueOf(pasarDatos.getValueAt(TableBuscar.getSelectedRow(), 1));

                Operaciones_atletas.txtModo_pago.setText(String.valueOf(modo_pago));
               
                int Fila = TableBuscar.getSelectedRow();

                setVisible(false);
                dispose();

            } catch (Exception e) {

            }

        } else {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UN REGISTRO",
                    "ATLETAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));
        }

        /* FUNCION  PARA  SELECCIONAR  CON UN CLICK  EL PAGO  Y  PASAR  EL  PARAMETRO  AL CAMPO DEL MODULO  DE AGREGAR ATLETAS  */
        if (TableBuscar.getSelectedRow() >= 0) {

            try {

                // PARA  PASAR  LOS  PARAMETROS  EN  EL  MODULO  OPERACIONES ATLETAS
                DefaultTableModel pasarDatos = (DefaultTableModel) TableBuscar.getModel();

                String idpago = String.valueOf(pasarDatos.getValueAt(TableBuscar.getSelectedRow(), 0));
                String modo_pago = String.valueOf(pasarDatos.getValueAt(TableBuscar.getSelectedRow(), 1));

                AgregarAtletas.txtModo_pago.setText(String.valueOf(modo_pago));
               
                int Fila = TableBuscar.getSelectedRow();

                setVisible(false);
                dispose();

            } catch (Exception e) {

            }

        } else {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UN REGISTRO",
                    "ATLETAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));
        }

    }//GEN-LAST:event_TableBuscarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the window look and feel */
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
            java.util.logging.Logger.getLogger(BuscarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            BuscarPago dialog = new BuscarPago((Operaciones_atletas) new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JTable TableBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*  FUNCION  PARA  MOSTRAR  LA  TABLA  CON  LOS  PAGOS */
    public void mostrarTabla_pagos() {
        try {
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    if (columna == 2) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            TableBuscar.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = conexion.conectar();
            String sql = "SELECT idpago,modo_pago FROM pagos";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID ");
            modelo.addColumn("MODO PAGO ");
           

            int[] anchos = {40, 200};

            for (int i = 0; i < cantidadColumnas; i++) {

                TableBuscar.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]); 
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {

                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);
                //TableBuscar.setDefaultRenderer (Object.class, new CentrarColum_buscarCodigos ());

                TableBuscar.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));

                TableBuscar.getTableHeader().setFont(new Font("Cooper Black", 1, 3));

                TableBuscar.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(253, 40, 62), Color.white));
                TableBuscar.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(0, 204, 204), Color.white));

            }

        } catch (Exception ex) {
            System.err.println("ex.toString");

        }

    }
    
     /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logoVentana.png"));
        return retValue;
    }

}
