package vistas;

import bd.Conexion;
import dao.FacturaDao;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class BuscarFacturas extends javax.swing.JDialog {

    UIManager UI;
    @SuppressWarnings("FieldMayBeFinal")
    private Conexion conexion = new Conexion();

    public BuscarFacturas(Factura_report REFA, boolean modal) {
        super(REFA, modal);
        initComponents();
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBuscar_facturas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 275));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 275));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 240));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("BUSCAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 30));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 220, 30));

        TableBuscar_facturas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TableBuscar_facturas.setForeground(new java.awt.Color(102, 102, 102));
        TableBuscar_facturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FECHA", "Nro.FACTURA", "CEDULA", "NOMBRES", "TOTAL FACTURA"
            }
        ));
        TableBuscar_facturas.setRowHeight(20);
        TableBuscar_facturas.setSelectionBackground(new java.awt.Color(128, 128, 128));
        TableBuscar_facturas.setShowVerticalLines(false);
        TableBuscar_facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBuscar_facturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableBuscar_facturas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 660, 110));

        jPanel2.setBackground(new java.awt.Color(56, 140, 60));
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 275));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TableBuscar_facturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBuscar_facturasMouseClicked
        //Factura_report facturaReport = new Factura_report();
        /* FUNCION  PARA  SELECCIONAR  CON UN CLICK  LA FACTURA  Y  PASAR  EL  PARAMETRO  AL CAMPO NOFACTURA EN "Factura_report"  */
        if (TableBuscar_facturas.getSelectedRow() >= 0) {

            try {

                // PARA  PASAR  LOS  PARAMETROS  EN  EL  MODULO  CONTROL PAGOS
                DefaultTableModel pasarDatos = (DefaultTableModel) TableBuscar_facturas.getModel();

                String cod_atleta = String.valueOf(pasarDatos.getValueAt(TableBuscar_facturas.getSelectedRow(), 0));
                String nofactura = String.valueOf(pasarDatos.getValueAt(TableBuscar_facturas.getSelectedRow(), 2));

                Factura_report.txtCodFactura.setText(String.valueOf(nofactura));

                int Fila = TableBuscar_facturas.getSelectedRow();

                setVisible(false);
                dispose();
                Factura_report.txtCodFactura.requestFocus();
                

            } catch (Exception e) {

            }

        } else {
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UN REGISTRO", "SISTEMA", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_TableBuscar_facturasMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        buscarDatos_facturas(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(BuscarFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BuscarFacturas dialog = new BuscarFacturas((Factura_report) new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableBuscar_facturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*  FUNCION  PARA  MOSTRAR  LA  TABLA  CON  LOS  Nro. DE LAS FACTURAS */
    public void mostrarTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    if (columna == 6) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            TableBuscar_facturas.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = conexion.conectar();
            String sql = "SELECT cod_atleta,fecha_factura,nofactura,cedula, cliente,totalFactura FROM vista_listar_facturas order by fecha_factura";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID ");
            modelo.addColumn("FECHA");
            modelo.addColumn("Nro. FACTURA ");
            modelo.addColumn("CEDULA");
            modelo.addColumn("CLIENTE");
            modelo.addColumn("TOTAL FACTURA");

            int[] anchos = {80, 120, 120, 80, 200, 120};

            for (int i = 0; i < cantidadColumnas; i++) {

                TableBuscar_facturas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {

                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);

                TableBuscar_facturas.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));

                TableBuscar_facturas.getTableHeader().setFont(new Font("Cooper Black", 1, 3));

                TableBuscar_facturas.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(Color.GRAY, Color.white));
                TableBuscar_facturas.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
                TableBuscar_facturas.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
                TableBuscar_facturas.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
                TableBuscar_facturas.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
                TableBuscar_facturas.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));

            }

        } catch (Exception ex) {
            System.err.println("ex.toString");

        }

    }

    /*  FUNCION  PARA  HACER  LA  BUSQUEDA  DE LA FACTURA Y EL NOMBRE DEL ATLETA  */
    public void buscarDatos_facturas(String buscar) {

        FacturaDao buscaFactura = new FacturaDao();

        DefaultTableModel modelo = buscaFactura.buscarFacturas(buscar);

        TableBuscar_facturas.setModel(modelo);

        // TableBuscar.setDefaultRenderer (Object.class, new CentrarColum_buscarCodigos ());
        TableBuscar_facturas.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));

        TableBuscar_facturas.getTableHeader().setFont(new Font("Cooper Black", 1, 4));

        TableBuscar_facturas.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(Color.GRAY, Color.white));
        TableBuscar_facturas.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
        TableBuscar_facturas.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
        TableBuscar_facturas.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
        TableBuscar_facturas.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
        TableBuscar_facturas.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));

        TableBuscar_facturas.getColumnModel().getColumn(0).setMaxWidth(80);
        TableBuscar_facturas.getColumnModel().getColumn(0).setMinWidth(80);
        TableBuscar_facturas.getColumnModel().getColumn(1).setMaxWidth(120);
        TableBuscar_facturas.getColumnModel().getColumn(1).setMinWidth(120);
        TableBuscar_facturas.getColumnModel().getColumn(2).setMaxWidth(120);
        TableBuscar_facturas.getColumnModel().getColumn(2).setMinWidth(120);
        TableBuscar_facturas.getColumnModel().getColumn(3).setMaxWidth(100);
        TableBuscar_facturas.getColumnModel().getColumn(3).setMinWidth(100);
        TableBuscar_facturas.getColumnModel().getColumn(4).setMaxWidth(250);
        TableBuscar_facturas.getColumnModel().getColumn(4).setMinWidth(250);
        TableBuscar_facturas.getColumnModel().getColumn(5).setMaxWidth(120);
        TableBuscar_facturas.getColumnModel().getColumn(5).setMinWidth(120);

    }

}
