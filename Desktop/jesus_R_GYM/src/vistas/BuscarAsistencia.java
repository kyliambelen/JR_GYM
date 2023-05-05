package vistas;

import bd.Conexion;
import dao.AsistenciaDao;
import entidades.Asistencia;
import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class BuscarAsistencia extends javax.swing.JDialog {

    UIManager UI;
    private final Conexion conexion = new Conexion();

    public BuscarAsistencia(Operaciones_Asistencia TRAEASISTENCIA, boolean modal) {
        super(TRAEASISTENCIA, modal);
        initComponents();
        txtIdasistencia.setVisible(false);
        mostrarTabla_asistencia();
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBuscar_asistencias = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdasistencia = new javax.swing.JTextField();
        LabelInformacion = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 240));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("BUSCAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, 30));

        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 220, 30));

        TableBuscar_asistencias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TableBuscar_asistencias.setForeground(new java.awt.Color(102, 102, 102));
        TableBuscar_asistencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CEDULA", "NOMBRES", "FECHA", "TIEMPO", "HORA ENTRADA", "HORA SALIDA", "OBSERVACIONES"
            }
        ));
        TableBuscar_asistencias.setRowHeight(20);
        TableBuscar_asistencias.setSelectionBackground(new java.awt.Color(128, 128, 128));
        TableBuscar_asistencias.setShowVerticalLines(false);
        TableBuscar_asistencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBuscar_asistenciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableBuscar_asistencias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 960, 240));

        jPanel2.setBackground(new java.awt.Color(56, 140, 60));
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RECUPERAR ASISTENCIA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1000, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1000, 60));

        txtIdasistencia.setEditable(false);
        jPanel1.add(txtIdasistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 395, 20, 10));

        LabelInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LabelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 560, 60));

        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonInformacion.png"))); // NOI18N
        btnInformacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        btnInformacion.setContentAreaFilled(false);
        btnInformacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonInformacion2.png"))); // NOI18N
        btnInformacion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonInformacion2.png"))); // NOI18N
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 110, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        buscarDatos_asistencias(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void TableBuscar_asistenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBuscar_asistenciasMouseClicked

        /* FUNCION  PARA  SELECCIONAR  CON UN CLICK  LOS  PARAMETRO QUE SE VAN A CARGAR EN LOS CAMPOS DEL MODULO ASISTENCIA DIARIA  */
            
           UI = null;
        UIManager.put("OptionPane.background", new Color(254, 254, 254));
        UIManager.put("Panel.background", new Color(254, 254, 254));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
        UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
        int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Restablecer esta Asistencia..?",
        "ASISTENCIAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
        
     
            if (opcion == 0) {
        try {

            Connection conn = conexion.conectar();
            int Fila = TableBuscar_asistencias.getSelectedRow();
            int ID = (Integer.parseInt(TableBuscar_asistencias.getValueAt(Fila, 0).toString()));
            
            

            PreparedStatement pst = conn.prepareStatement("SELECT * FROM asistencia WHERE idasistencia = '" + ID + "'");
          
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                //Datos consultados
                Operaciones_Asistencia.txtIdasistencia.setText(rs.getString("idasistencia"));
                Operaciones_Asistencia.txtCedula.setText(rs.getString("cedula"));
                Operaciones_Asistencia.txtNombres.setText(rs.getString("nombres"));
                Operaciones_Asistencia.txtDateFecha.setDate(rs.getDate("fecha"));
                Operaciones_Asistencia.ComboBoxTiempo.setSelectedItem(rs.getString("tiempo"));
                Operaciones_Asistencia.txtHora_entrada.setText(rs.getString("hora_entrada"));
                Operaciones_Asistencia.txtHora_salida.setText(rs.getString("hora_salida"));
                Operaciones_Asistencia.txtObservacion.setText(rs.getString("observaciones"));
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error al cargar!");

            }
        
    

        Asistencia asistencia = new Asistencia();
        AsistenciaDao asistenciaDAO = new AsistenciaDao();
        
         int filaSeleccionada = TableBuscar_asistencias.rowAtPoint(evt.getPoint());
         txtIdasistencia.setText((String) TableBuscar_asistencias.getValueAt(filaSeleccionada, 0).toString());
        asistencia.setIdasistencia(Integer.parseInt(txtIdasistencia.getText()));

        try {
            if (asistenciaDAO.eliminarAsistencia(asistencia.getIdasistencia())) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                JOptionPane.showMessageDialog(this, "El Registro de la tabla Asistencia se eliminó Correctamente.",
                        "ASISTENCIA", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                
                mostrarTabla_asistencia();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuscarAsistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TableBuscar_asistenciasMouseClicked
    }
    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        
         if (btnInformacion.isSelected()) {
             LabelInformacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 64)));
             LabelInformacion.setBackground((new Color(11, 97, 33)));
             LabelInformacion.setText("<html><p style='color:blue'>Seleccione el cliente de la tabla para ser agregado nuevamente al módulo de ASISTENCIAS.<br>"
                     + " Esto se hace en caso de perder la información a causa de fallas eléctricas,<br>"
                     + " por apagado del computador o por pérdida de la información diaria.</p></html>");
         }else{
             LabelInformacion.setText("");
             LabelInformacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
         }
    }//GEN-LAST:event_btnInformacionActionPerformed
       

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
            java.util.logging.Logger.getLogger(BuscarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            BuscarAsistencia dialog = new BuscarAsistencia((Operaciones_Asistencia) new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel LabelInformacion;
    private javax.swing.JTable TableBuscar_asistencias;
    private javax.swing.JToggleButton btnInformacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtIdasistencia;
    // End of variables declaration//GEN-END:variables

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*  FUNCION  PARA  MOSTRAR  LA  TABLA  CON  LOS  Nro. DE LAS FACTURAS */
    public void mostrarTabla_asistencia() {
        try {
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    if (columna == 8) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            TableBuscar_asistencias.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = conexion.conectar();
            String sql = "SELECT idasistencia,cedula,nombres,fecha, tiempo,hora_entrada, hora_salida,observaciones FROM asistencia order by fecha";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID ");
            modelo.addColumn("CEDULA");
            modelo.addColumn("NOMBRES ");
            modelo.addColumn("FECHA");
            modelo.addColumn("TIEMPO");
            modelo.addColumn("HORA ENTRADA");
            modelo.addColumn("HORA SALIDA");
            modelo.addColumn("OBSERVACIONES");

            int[] anchos = {40, 120, 250, 120, 100, 140, 140, 250};

            for (int i = 0; i < cantidadColumnas; i++) {

                TableBuscar_asistencias.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {

                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);

                TableBuscar_asistencias.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));

                TableBuscar_asistencias.getTableHeader().setFont(new Font("Cooper Black", 1, 3));

                TableBuscar_asistencias.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(Color.GRAY, Color.white));
                TableBuscar_asistencias.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
                TableBuscar_asistencias.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
                TableBuscar_asistencias.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
                TableBuscar_asistencias.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
                TableBuscar_asistencias.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
                TableBuscar_asistencias.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));
                TableBuscar_asistencias.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(47, 79, 79), Color.white));

            }

        } catch (Exception ex) {
            System.err.println("ex.toString");

        }

    }

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
    
     /*  FUNCION  PARA  HACER  LA  BUSQUEDA  DEL CODIGO Y LA DESCRIPCION DEL PAGO  */
    public void buscarDatos_asistencias (String buscar) {

        AsistenciaDao buscaAsistencia = new AsistenciaDao();

        DefaultTableModel modelo = buscaAsistencia.buscarAsistencias(buscar);

        TableBuscar_asistencias.setModel (modelo);

       // TableBuscar.setDefaultRenderer (Object.class, new CentrarColum_buscarCodigos ());

        TableBuscar_asistencias.getTableHeader ().setPreferredSize (new java.awt.Dimension (0, 30));

        TableBuscar_asistencias.getTableHeader ().setFont (new Font ("Cooper Black", 1, 4));

        TableBuscar_asistencias.getColumnModel ().getColumn (0).setHeaderRenderer (new MyRenderer (Color.GRAY, Color.white));
        TableBuscar_asistencias.getColumnModel ().getColumn (1).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
        TableBuscar_asistencias.getColumnModel ().getColumn (2).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
        TableBuscar_asistencias.getColumnModel ().getColumn (3).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
        TableBuscar_asistencias.getColumnModel ().getColumn (4).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
        TableBuscar_asistencias.getColumnModel ().getColumn (5).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
        TableBuscar_asistencias.getColumnModel ().getColumn (6).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
        TableBuscar_asistencias.getColumnModel ().getColumn (7).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
       

        TableBuscar_asistencias.getColumnModel().getColumn(0).setPreferredWidth(40);
        TableBuscar_asistencias.getColumnModel().getColumn(1).setPreferredWidth(120);
        TableBuscar_asistencias.getColumnModel().getColumn(2).setPreferredWidth(250);
        TableBuscar_asistencias.getColumnModel().getColumn(3).setPreferredWidth(120);
        TableBuscar_asistencias.getColumnModel().getColumn(4).setPreferredWidth(100);
        TableBuscar_asistencias.getColumnModel().getColumn(5).setPreferredWidth(140);
        TableBuscar_asistencias.getColumnModel().getColumn(6).setPreferredWidth(140);
        TableBuscar_asistencias.getColumnModel().getColumn(7).setPreferredWidth(250);
      

    }
}
