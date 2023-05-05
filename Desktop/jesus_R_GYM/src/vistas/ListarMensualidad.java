
package vistas;

import Excel_reportes.ExportarExcel_pago_mensual;
import bd.Conexion;
import dao.MensualidadDao;
import entidades.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
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
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class ListarMensualidad extends javax.swing.JFrame {
    
     UIManager UI;
    Usuarios usuar;
    private final Conexion conexion = new Conexion();

    public ListarMensualidad(Usuarios usuar) throws SQLException {
        initComponents();
        setIconImage(getIconImage());
        this.setTitle("LISTAR-MENSUALIDAD");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        txtUsuario_id.setVisible(false);
        this.usuar = usuar;
        if (usuar.getIdRol() == 1) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        } else if (usuar.getIdRol() == 2) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        } else if (usuar.getIdRol() == 3) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        }
        mostrarTablaPago_mensual();
    }
    
    public ListarMensualidad() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        LabelBanner = new javax.swing.JLabel();
        PanelTabla = new javax.swing.JPanel();
        txtUsuario_id = new javax.swing.JTextField();
        btnExportar_lista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePagoMensual = new javax.swing.JTable();
        LabelTitulo = new javax.swing.JLabel();
        LabelBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        LabelFondoAzul = new javax.swing.JLabel();
        PanelBotones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerPagoMensual2.png"))); // NOI18N
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelBanner.setOpaque(true);
        PanelPrincipal.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1260, 150));

        PanelTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelTabla.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 40, -1));

        btnExportar_lista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exportarExcel.png"))); // NOI18N
        btnExportar_lista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnExportar_lista.setContentAreaFilled(false);
        btnExportar_lista.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exportarExcel2.png"))); // NOI18N
        btnExportar_lista.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exportarExcel.png"))); // NOI18N
        btnExportar_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportar_listaActionPerformed(evt);
            }
        });
        PanelTabla.add(btnExportar_lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 130, 32));

        TablePagoMensual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TablePagoMensual.setForeground(new java.awt.Color(0, 51, 51));
        TablePagoMensual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nro.REF.", "CEDULA", "NOMBRES", "FECHA-INSC.", "FECHA-FIN", "INSCRIPCION", "MENSUALIDAD", "ABONO", "DEBE", "FORMA-PAGO", "TURNO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablePagoMensual.setRowHeight(30);
        TablePagoMensual.setShowVerticalLines(false);
        jScrollPane1.setViewportView(TablePagoMensual);
        if (TablePagoMensual.getColumnModel().getColumnCount() > 0) {
            TablePagoMensual.getColumnModel().getColumn(0).setMinWidth(80);
            TablePagoMensual.getColumnModel().getColumn(0).setPreferredWidth(80);
            TablePagoMensual.getColumnModel().getColumn(0).setMaxWidth(80);
            TablePagoMensual.getColumnModel().getColumn(1).setMinWidth(80);
            TablePagoMensual.getColumnModel().getColumn(1).setPreferredWidth(80);
            TablePagoMensual.getColumnModel().getColumn(1).setMaxWidth(80);
            TablePagoMensual.getColumnModel().getColumn(2).setMinWidth(200);
            TablePagoMensual.getColumnModel().getColumn(2).setPreferredWidth(200);
            TablePagoMensual.getColumnModel().getColumn(2).setMaxWidth(200);
            TablePagoMensual.getColumnModel().getColumn(3).setMinWidth(100);
            TablePagoMensual.getColumnModel().getColumn(3).setPreferredWidth(100);
            TablePagoMensual.getColumnModel().getColumn(3).setMaxWidth(100);
            TablePagoMensual.getColumnModel().getColumn(4).setMinWidth(100);
            TablePagoMensual.getColumnModel().getColumn(4).setPreferredWidth(100);
            TablePagoMensual.getColumnModel().getColumn(4).setMaxWidth(100);
            TablePagoMensual.getColumnModel().getColumn(5).setMinWidth(130);
            TablePagoMensual.getColumnModel().getColumn(5).setPreferredWidth(130);
            TablePagoMensual.getColumnModel().getColumn(5).setMaxWidth(130);
            TablePagoMensual.getColumnModel().getColumn(6).setMinWidth(130);
            TablePagoMensual.getColumnModel().getColumn(6).setPreferredWidth(130);
            TablePagoMensual.getColumnModel().getColumn(6).setMaxWidth(130);
            TablePagoMensual.getColumnModel().getColumn(7).setMinWidth(100);
            TablePagoMensual.getColumnModel().getColumn(7).setPreferredWidth(100);
            TablePagoMensual.getColumnModel().getColumn(7).setMaxWidth(100);
            TablePagoMensual.getColumnModel().getColumn(8).setMinWidth(100);
            TablePagoMensual.getColumnModel().getColumn(8).setPreferredWidth(100);
            TablePagoMensual.getColumnModel().getColumn(8).setMaxWidth(100);
            TablePagoMensual.getColumnModel().getColumn(9).setMinWidth(120);
            TablePagoMensual.getColumnModel().getColumn(9).setPreferredWidth(120);
            TablePagoMensual.getColumnModel().getColumn(9).setMaxWidth(120);
            TablePagoMensual.getColumnModel().getColumn(10).setMinWidth(110);
            TablePagoMensual.getColumnModel().getColumn(10).setPreferredWidth(110);
            TablePagoMensual.getColumnModel().getColumn(10).setMaxWidth(110);
        }

        PanelTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1220, 300));

        LabelTitulo.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(222, 184, 37));
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("LISTADO PAGOS MENSUALES");
        PanelTabla.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 460, 50));

        LabelBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelBuscar.setForeground(new java.awt.Color(255, 255, 255));
        LabelBuscar.setText("Buscar");
        PanelTabla.add(LabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 30));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        PanelTabla.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 230, 32));

        LabelFondoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoAzul.png"))); // NOI18N
        PanelTabla.add(LabelFondoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 440));

        PanelPrincipal.add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 1260, 440));

        PanelBotones.setBackground(new java.awt.Color(0, 131, 199));
        PanelBotones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirMensulaidad.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirMensulaidad2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirMensulaidad.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_SALIR(evt);
            }
        });
        PanelBotones.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 90, 40));

        PanelPrincipal.add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1260, 80));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BOTON_SALIR(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_SALIR
        
        Administracion.verMensualidad = null;
        Operaciones_Asistencia.listMensualidad = null;
	this.dispose();
    }//GEN-LAST:event_BOTON_SALIR

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        
         buscarPagos_mensuales(txtBuscar.getText ());
         if(txtBuscar.getText ().isEmpty()){
             
             try {
                 mostrarTablaPago_mensual();
             } catch (SQLException ex) {
                 Logger.getLogger(ListarMensualidad.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnExportar_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportar_listaActionPerformed

        exportarExcel_lista_mensualidad();

    }//GEN-LAST:event_btnExportar_listaActionPerformed

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
            java.util.logging.Logger.getLogger(ListarMensualidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarMensualidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarMensualidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarMensualidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ListarMensualidad().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JLabel LabelBuscar;
    private javax.swing.JLabel LabelFondoAzul;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JTable TablePagoMensual;
    private javax.swing.JButton btnExportar_lista;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables

  /*  Funcion para listar los atletas que tienen pagos pendientes */
    @SuppressWarnings("null")
    public void mostrarTablaPago_mensual() throws SQLException {

        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                if (columna == 11) {
                    return true;
                } else {
                    return false;
                }
            }
        };

       
        TablePagoMensual.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));

        TablePagoMensual.getTableHeader().setFont(new Font("Roboto Medium", 1, 6));

        TablePagoMensual.setModel(modelo);
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = conexion.conectar();
        String sql = "SELECT nroreferencia,cedula,nombres,fecha_inscripcion,fecha_final, monto_inscripcion,monto_mensualidad,monto_abono,monto_debe,forma_depago,turno FROM mensualidad";

        try {
            ps = conn.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ListarPagos_pendientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        rs = ps.executeQuery();

        ResultSetMetaData rsMD = rs.getMetaData();
        int cantidadColumnas = rsMD.getColumnCount();

        modelo.addColumn("Nro.REF.");
        modelo.addColumn("CEDULA");
        modelo.addColumn("NOMBRES");
        modelo.addColumn("FECHA");
        modelo.addColumn("FINALIZACION");
        modelo.addColumn("INSCRIPCION");
        modelo.addColumn("MENSUALIADAD");
        modelo.addColumn("ABONO");
        modelo.addColumn("DEBE");
        modelo.addColumn("FORMA PAGO");
        modelo.addColumn("TURNO");
        

        int[] anchos = {70, 90, 170, 80, 100, 130, 130,80,80,160,70};

        for (int i = 0; i < cantidadColumnas; i++) {

            TablePagoMensual.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        while (rs.next()) {
            Object[] filas = new Object[cantidadColumnas];

            for (int i = 0; i < cantidadColumnas; i++) {

                filas[i] = rs.getObject(i + 1);
            }

            modelo.addRow(filas);

            TablePagoMensual.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(128, 126, 65), Color.white));
            TablePagoMensual.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            TablePagoMensual.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            TablePagoMensual.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            TablePagoMensual.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            TablePagoMensual.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            TablePagoMensual.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            TablePagoMensual.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            TablePagoMensual.getColumnModel().getColumn(8).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            TablePagoMensual.getColumnModel().getColumn(9).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            TablePagoMensual.getColumnModel().getColumn(10).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));

        }
    }
    
      // METODO PARA BUSCAR LOS PAGOS MENSUALES EN LA TABLA 
    
    public void buscarPagos_mensuales (String buscar) {

        MensualidadDao buscaMensDao = new MensualidadDao();

        DefaultTableModel modelo = buscaMensDao.buscarMensualidades(buscar);

        TablePagoMensual.setModel (modelo);

        //TableViewAtletas.setDefaultRenderer (Object.class, new CentrarColum_prod ());

        TablePagoMensual.getTableHeader ().setPreferredSize (new java.awt.Dimension (0, 30));

        TablePagoMensual.getTableHeader ().setFont (new Font ("Cooper Black", 1, 10));

            TablePagoMensual.getColumnModel().getColumn(0).setPreferredWidth(70);
            TablePagoMensual.getColumnModel().getColumn(1).setPreferredWidth(90);
            TablePagoMensual.getColumnModel().getColumn(2).setPreferredWidth(170);
            TablePagoMensual.getColumnModel().getColumn(3).setPreferredWidth(80);
            TablePagoMensual.getColumnModel().getColumn(4).setPreferredWidth(100);
            TablePagoMensual.getColumnModel().getColumn(5).setPreferredWidth(130);
            TablePagoMensual.getColumnModel().getColumn(6).setPreferredWidth(130);
            TablePagoMensual.getColumnModel().getColumn(7).setPreferredWidth(80);
            TablePagoMensual.getColumnModel().getColumn(8).setPreferredWidth(80);
            TablePagoMensual.getColumnModel().getColumn(9).setPreferredWidth(160);
            TablePagoMensual.getColumnModel().getColumn(10).setPreferredWidth(70);
           

           
            TablePagoMensual.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TablePagoMensual.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TablePagoMensual.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TablePagoMensual.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TablePagoMensual.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TablePagoMensual.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TablePagoMensual.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TablePagoMensual.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TablePagoMensual.getColumnModel().getColumn(8).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TablePagoMensual.getColumnModel().getColumn(9).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TablePagoMensual.getColumnModel().getColumn(10).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            
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
    
    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    
    public void exportarExcel_lista_mensualidad(){
        ExportarExcel_pago_mensual obj;

        obj = new ExportarExcel_pago_mensual();
        try {
            obj.exportarExcelPago_mensual(TablePagoMensual);
        } catch (IOException ex) {
            Logger.getLogger(Operaciones_atletas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
