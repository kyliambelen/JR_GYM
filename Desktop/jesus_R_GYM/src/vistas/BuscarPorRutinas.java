package vistas;

import bd.Conexion;
import dao.RutinasDao;
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
public class BuscarPorRutinas extends javax.swing.JDialog {

    UIManager UI;
    @SuppressWarnings("FieldMayBeFinal")
    private Conexion conexion = new Conexion();

    public BuscarPorRutinas(Operaciones_rutinas REOR, boolean modal) {
        super(REOR, modal);
        initComponents();
        mostrarTabla();
    }

    BuscarPorRutinas(Reportes REOR, boolean modal) {
         super(REOR, modal);
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
        TableBuscar = new javax.swing.JTable();
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

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
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

        TableBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TableBuscar.setForeground(new java.awt.Color(102, 102, 102));
        TableBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "CEDULA", "NOMBRES"
            }
        ));
        TableBuscar.setRowHeight(20);
        TableBuscar.setSelectionBackground(new java.awt.Color(128, 128, 128));
        TableBuscar.setShowVerticalLines(false);
        TableBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBuscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableBuscar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 110));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 275));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TableBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBuscarMouseClicked

        /* FUNCION  PARA  SELECCIONAR  CON UN CLICK  EL ATLETA  Y  PASAR  EL  PARAMETRO  AL CAMPO CEDULA DE reporteRutinasCedula */
        if (TableBuscar.getSelectedRow() >= 0) {

            try {

                // PARA  PASAR  LOS  PARAMETROS  EN  EL  MODULO  reporteRutinasCedula
                DefaultTableModel pasarDatos = (DefaultTableModel) TableBuscar.getModel();

                String idatletas = String.valueOf(pasarDatos.getValueAt(TableBuscar.getSelectedRow(), 0));
                String cedula = String.valueOf(pasarDatos.getValueAt(TableBuscar.getSelectedRow(), 1));
                String nombres = String.valueOf(pasarDatos.getValueAt(TableBuscar.getSelectedRow(), 2));

                ReporteRutinasCedula.txtCedulaRutina.setText(String.valueOf(cedula));
                ReporteRutinasCedula.txtNombresA.setText(String.valueOf(nombres));

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

         /* FUNCION  PARA  SELECCIONAR  CON UN CLICK  EL ATLETA  Y  PASAR  EL  PARAMETRO  AL CAMPO CEDULA DE reporteRutinas_fecha */
        if (TableBuscar.getSelectedRow() >= 0) {

            try {

                // PARA  PASAR  LOS  PARAMETROS  EN  EL  MODULO  reporteRutinasCedula
                DefaultTableModel pasarDatos = (DefaultTableModel) TableBuscar.getModel();

                String idatletas = String.valueOf(pasarDatos.getValueAt(TableBuscar.getSelectedRow(), 0));
                String cedula = String.valueOf(pasarDatos.getValueAt(TableBuscar.getSelectedRow(), 1));
                String nombres = String.valueOf(pasarDatos.getValueAt(TableBuscar.getSelectedRow(), 2));

                ReporteRutinas_fecha.txtCedula_atleta.setText(String.valueOf(cedula));
                ReporteRutinas_fecha.txtNombres_atleta.setText(String.valueOf(nombres));

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //mostrarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        buscarDatos_rutinas(txtBuscar.getText());
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
            java.util.logging.Logger.getLogger(BuscarPorRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPorRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPorRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPorRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            BuscarPorRutinas dialog = new BuscarPorRutinas((Operaciones_rutinas) new javax.swing.JFrame(), true);
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
    private javax.swing.JTable TableBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*  FUNCION  PARA  MOSTRAR  LA  TABLA  CON  LOS  CODIGOS */
    public void mostrarTabla() {
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
            String sql = "SELECT idatletas,cedula,nombres FROM rutinas group by idatletas";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID ");
            modelo.addColumn("CEDULA ");
            modelo.addColumn("NOMBRES");

            int[] anchos = {80, 120, 250};

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

                TableBuscar.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(Color.GRAY, Color.white));
                TableBuscar.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));
                TableBuscar.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));

            }

        } catch (Exception ex) {
            System.err.println("ex.toString");

        }

    }

    /*  FUNCION  PARA  HACER  LA  BUSQUEDA  DE LA CEDULA Y EL NOMBRE DEL ATLETA  */
    public void buscarDatos_rutinas(String buscar) {

        RutinasDao buscaRutinas = new RutinasDao();

        DefaultTableModel modelo = buscaRutinas.buscarCedula_rutinas(buscar);

        TableBuscar.setModel(modelo);

        // TableBuscar.setDefaultRenderer (Object.class, new CentrarColum_buscarCodigos ());
        TableBuscar.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));

        TableBuscar.getTableHeader().setFont(new Font("Cooper Black", 1, 4));

        TableBuscar.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(Color.GRAY, Color.white));
        TableBuscar.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));
        TableBuscar.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));

        TableBuscar.getColumnModel().getColumn(0).setMaxWidth(80);
        TableBuscar.getColumnModel().getColumn(0).setMinWidth(80);
        TableBuscar.getColumnModel().getColumn(1).setMaxWidth(120);
        TableBuscar.getColumnModel().getColumn(1).setMinWidth(120);
        TableBuscar.getColumnModel().getColumn(2).setMaxWidth(300);
        TableBuscar.getColumnModel().getColumn(2).setMinWidth(300);

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
