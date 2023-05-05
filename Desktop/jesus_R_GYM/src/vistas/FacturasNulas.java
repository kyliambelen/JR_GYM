package vistas;

import bd.Conexion;
import dao.FacturaDao;
import entidades.Facturas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class FacturasNulas extends javax.swing.JFrame {

    UIManager UI;
    ArrayList<Facturas> factu = null;
    private final Conexion conexion = new Conexion();

    public FacturasNulas() {
        initComponents();
        setIconImage(getIconImage());
        this.setTitle("FACTURAS NULAS");
        mostrar_tablaFacturas_nulas(TableFacturas_nulas);
        txtNro_factura.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFacturas_nulas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNro_factura = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btnRevertir_factura = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LabelFondo = new javax.swing.JLabel();
        LabelBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1260, 590));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(248, 239, 251));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableFacturas_nulas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TableFacturas_nulas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TableFacturas_nulas.setForeground(new java.awt.Color(0, 51, 51));
        TableFacturas_nulas.setModel(new javax.swing.table.DefaultTableModel(
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
        TableFacturas_nulas.setGridColor(new java.awt.Color(204, 204, 204));
        TableFacturas_nulas.setSelectionBackground(new java.awt.Color(243, 247, 129));
        TableFacturas_nulas.setSelectionForeground(new java.awt.Color(51, 51, 51));
        TableFacturas_nulas.setShowVerticalLines(false);
        TableFacturas_nulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFacturas_nulasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableFacturas_nulas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 96, 840, 260));
        jScrollPane1.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoJR3.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, 160, 170));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 260, 20));

        txtNro_factura.setEditable(false);
        jPanel2.add(txtNro_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 370, 40, 30));

        jPanel5.setBackground(new java.awt.Color(224, 42, 2));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(224, 42, 2));
        jButton2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaNula_salir.png"))); // NOI18N
        jButton2.setText("SALIR");
        jButton2.setToolTipText("Restaurar Factura Anulada");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setOpaque(false);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 80, 90));

        btnRevertir_factura.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 10)); // NOI18N
        btnRevertir_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaNula_salir3.png"))); // NOI18N
        btnRevertir_factura.setText("RESTAURAR");
        btnRevertir_factura.setBorderPainted(false);
        btnRevertir_factura.setContentAreaFilled(false);
        btnRevertir_factura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRevertir_factura.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRevertir_factura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRevertir_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevertir_facturaActionPerformed(evt);
            }
        });
        jPanel5.add(btnRevertir_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 90));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, 260, 130));

        jPanel4.setBackground(new java.awt.Color(255, 204, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("RESTAURAR FACTURA ANULADA");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 470, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 25, 840, 60));

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoFactura_nula.png"))); // NOI18N
        LabelFondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 500));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1260, 500));

        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerFacturas_nulas.png"))); // NOI18N
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelBanner.setOpaque(true);
        jPanel1.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1260, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TableFacturas_nulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFacturas_nulasMouseClicked

        int filaSeleccionada = TableFacturas_nulas.rowAtPoint(evt.getPoint());

        txtNro_factura.setText(TableFacturas_nulas.getValueAt(filaSeleccionada, 0).toString());

    }//GEN-LAST:event_TableFacturas_nulasMouseClicked

    private void btnRevertir_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevertir_facturaActionPerformed

        revertirFactura();
    }//GEN-LAST:event_btnRevertir_facturaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        Factura_report.abreFact = null;

        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FacturasNulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturasNulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturasNulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturasNulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FacturasNulas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JTable TableFacturas_nulas;
    private javax.swing.JButton btnRevertir_factura;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNro_factura;
    // End of variables declaration//GEN-END:variables

    // FUNCION PARA VISUALIZAR LA TABLA FACTURAS NULAS
    FacturaDao factura = null;

    public void mostrar_tablaFacturas_nulas(JTable TableFacturas_nulas) {

        TableFacturas_nulas.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel tableFN = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tableFN.addColumn("FACTURA");
        tableFN.addColumn("USUARIO");
        tableFN.addColumn("ID ATLETA");
        tableFN.addColumn("FECHA");
        tableFN.addColumn("SERIE");
        tableFN.addColumn("COBRADOR");
        tableFN.addColumn("PAGO");
        tableFN.addColumn("ESTATUS");

        factura = new FacturaDao();
        Facturas factu = new Facturas();
        ArrayList<Facturas> list = factura.ListarFacturas_nulas();

        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[8];
                factu = list.get(i);

                fila[0] = factu.getNofactura();
                fila[1] = factu.getUsuario();
                fila[2] = factu.getIdatletas();
                fila[3] = factu.getFecha();
                fila[4] = factu.getNoserie();
                fila[5] = factu.getNombre_usuario();
                fila[6] = factu.getTotalPago();
                fila[7] = factu.getEstatus();

                tableFN.addRow(fila);
            }
            TableFacturas_nulas.setModel(tableFN);
            TableFacturas_nulas.setRowHeight(60);

            TableFacturas_nulas.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 25));

            TableFacturas_nulas.getTableHeader().setFont(new Font("Cambria", 1, 11));

            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
            TableFacturas_nulas.getColumnModel().getColumn(0).setCellRenderer(Alinear);
            TableFacturas_nulas.getColumnModel().getColumn(1).setCellRenderer(Alinear);
            TableFacturas_nulas.getColumnModel().getColumn(2).setCellRenderer(Alinear);
            TableFacturas_nulas.getColumnModel().getColumn(4).setCellRenderer(Alinear);
            //TableFacturas_nulas.getColumnModel().getColumn(7).setCellRenderer(Alinear);

            TableFacturas_nulas.getColumnModel().getColumn(0).setPreferredWidth(30);
            TableFacturas_nulas.getColumnModel().getColumn(1).setPreferredWidth(25);
            TableFacturas_nulas.getColumnModel().getColumn(2).setPreferredWidth(30);
            TableFacturas_nulas.getColumnModel().getColumn(3).setPreferredWidth(35);
            TableFacturas_nulas.getColumnModel().getColumn(4).setPreferredWidth(20);
            TableFacturas_nulas.getColumnModel().getColumn(5).setPreferredWidth(150);
            TableFacturas_nulas.getColumnModel().getColumn(6).setPreferredWidth(30);
            TableFacturas_nulas.getColumnModel().getColumn(7).setPreferredWidth(70);

            TableFacturas_nulas.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(255, 59, 0), Color.white));
            TableFacturas_nulas.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255, 59, 0)));
            TableFacturas_nulas.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255, 59, 0)));
            TableFacturas_nulas.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255, 59, 0)));
            TableFacturas_nulas.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255, 59, 0)));
            TableFacturas_nulas.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255, 59, 0)));
            TableFacturas_nulas.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255, 59, 0)));
            TableFacturas_nulas.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255, 59, 0)));

        }
    }

    /* FUNCION PARA REVERTIR LA FACTURA A ESTATUS 1 */
    public void revertirFactura() {
        int filaSeleccionada = TableFacturas_nulas.getSelectedRow();

        if (filaSeleccionada == -1) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(null, "'ATENCIÓN'... debe Seleccionar una factura",
                    "FACTURAS", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

        } else {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
            int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Restaurar esta Factura..?",
                    "FACTURAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            if (opcion == 0) {

                try {
                    Facturas facturasN = new Facturas();

                    facturasN.setNofactura(Integer.parseInt(txtNro_factura.getText()));

                    FacturaDao factuNDao = new FacturaDao();

                    if (factuNDao.modificarFactura_nula(facturasN)) {

                        UI = null;
                        UIManager.put("OptionPane.background", new Color(255, 255, 255));
                        UIManager.put("Panel.background", new Color(255, 255, 255));
                        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                        JOptionPane.showMessageDialog(null, "La Factura ha sido Reestablecida",
                                "FACTURAS", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

                        mostrar_tablaFacturas_nulas(TableFacturas_nulas);

                    } else {

                        UI = null;
                        UIManager.put("OptionPane.background", new Color(255, 255, 255));
                        UIManager.put("Panel.background", new Color(255, 255, 255));
                        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                        JOptionPane.showMessageDialog(this, "Lo siento...!!! ha ocurrido un error guardando los datos",
                                "FACTURAS", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 90, 90));
                    }

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(this, "Error Desconocido" + "" + e.getMessage());
                }
            }
        }
    }

    /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logoVentana.png"));
        return retValue;
    }
}
