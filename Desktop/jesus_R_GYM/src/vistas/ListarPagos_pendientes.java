package vistas;

import bd.Conexion;
import dao.PagoPendienteDao;
import entidades.PagoPendiente;
import entidades.Usuarios;
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
public class ListarPagos_pendientes extends javax.swing.JFrame {

    UIManager UI;
    Usuarios usuar;
    private final Conexion conexion = new Conexion();

    public static Control_pagos pagaDeuda;

    public ListarPagos_pendientes(Usuarios usuar) throws SQLException {
        initComponents();
        mostrarTablaPago_pendientes();
        txtUsuario_id.setVisible(false);
        txtIdpagoP.setVisible(false);
        this.usuar = usuar;
        if (usuar.getIdRol() == 1) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        } else if (usuar.getIdRol() == 2) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        } else if (usuar.getIdRol() == 3) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        }
    }

    public ListarPagos_pendientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        LabelBanner = new javax.swing.JLabel();
        PanelBotones = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        btnSalir_pagoP = new javax.swing.JButton();
        PanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePagos_pendientes = new javax.swing.JTable();
        LabelBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        LabelFondoTabla = new javax.swing.JLabel();
        Panel_color = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        txtUsuario_id = new javax.swing.JTextField();
        txtIdpagoP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(140, 124, 116));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerHorarios.jpg"))); // NOI18N
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelBanner.setOpaque(true);
        PanelPrincipal.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1260, 150));

        PanelBotones.setBackground(new java.awt.Color(204, 51, 0));
        PanelBotones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonEliminar_pp2.png"))); // NOI18N
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonEliminar_pp.png"))); // NOI18N
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonEliminar_pp.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_ELIMINAR_PAGO_PENDIENTE(evt);
            }
        });
        PanelBotones.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 150, 40));

        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonPagar_ppendiente.png"))); // NOI18N
        btnPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));
        btnPagar.setContentAreaFilled(false);
        btnPagar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonPagar_ppendiente2.png"))); // NOI18N
        btnPagar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonPagar_ppendiente2.png"))); // NOI18N
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_PAGAR_PENDIENTES(evt);
            }
        });
        PanelBotones.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 150, 40));

        btnSalir_pagoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonSalir_pp.png"))); // NOI18N
        btnSalir_pagoP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));
        btnSalir_pagoP.setContentAreaFilled(false);
        btnSalir_pagoP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonSalir_pp2.png"))); // NOI18N
        btnSalir_pagoP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonSalir_pp2.png"))); // NOI18N
        btnSalir_pagoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_SALIR_PAGO_PENDIENTE(evt);
            }
        });
        PanelBotones.add(btnSalir_pagoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 150, 40));

        PanelPrincipal.add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 1260, 80));

        PanelTabla.setBackground(new java.awt.Color(223, 53, 55));
        PanelTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelTabla.setEnabled(false);
        PanelTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablePagos_pendientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TablePagos_pendientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TablePagos_pendientes.setForeground(new java.awt.Color(102, 102, 102));
        TablePagos_pendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CEDULA", "NOMBRES", "FECHA", "TIEMPO", "HORA ENTRADA", "HORA SALIDA", "OBSERVACION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablePagos_pendientes.setGridColor(new java.awt.Color(204, 204, 204));
        TablePagos_pendientes.setRowHeight(30);
        TablePagos_pendientes.setSelectionBackground(new java.awt.Color(255, 153, 164));
        TablePagos_pendientes.setSelectionForeground(new java.awt.Color(51, 51, 51));
        TablePagos_pendientes.setShowVerticalLines(false);
        TablePagos_pendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePagos_pendientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablePagos_pendientes);
        if (TablePagos_pendientes.getColumnModel().getColumnCount() > 0) {
            TablePagos_pendientes.getColumnModel().getColumn(0).setMinWidth(50);
            TablePagos_pendientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablePagos_pendientes.getColumnModel().getColumn(0).setMaxWidth(50);
            TablePagos_pendientes.getColumnModel().getColumn(1).setMinWidth(100);
            TablePagos_pendientes.getColumnModel().getColumn(1).setPreferredWidth(100);
            TablePagos_pendientes.getColumnModel().getColumn(1).setMaxWidth(100);
            TablePagos_pendientes.getColumnModel().getColumn(2).setMinWidth(250);
            TablePagos_pendientes.getColumnModel().getColumn(2).setPreferredWidth(250);
            TablePagos_pendientes.getColumnModel().getColumn(2).setMaxWidth(250);
            TablePagos_pendientes.getColumnModel().getColumn(3).setMinWidth(120);
            TablePagos_pendientes.getColumnModel().getColumn(3).setPreferredWidth(120);
            TablePagos_pendientes.getColumnModel().getColumn(3).setMaxWidth(120);
            TablePagos_pendientes.getColumnModel().getColumn(4).setMinWidth(100);
            TablePagos_pendientes.getColumnModel().getColumn(4).setPreferredWidth(100);
            TablePagos_pendientes.getColumnModel().getColumn(4).setMaxWidth(100);
            TablePagos_pendientes.getColumnModel().getColumn(5).setMinWidth(120);
            TablePagos_pendientes.getColumnModel().getColumn(5).setPreferredWidth(120);
            TablePagos_pendientes.getColumnModel().getColumn(5).setMaxWidth(120);
            TablePagos_pendientes.getColumnModel().getColumn(6).setMinWidth(120);
            TablePagos_pendientes.getColumnModel().getColumn(6).setPreferredWidth(120);
            TablePagos_pendientes.getColumnModel().getColumn(6).setMaxWidth(120);
            TablePagos_pendientes.getColumnModel().getColumn(7).setMinWidth(500);
            TablePagos_pendientes.getColumnModel().getColumn(7).setPreferredWidth(500);
            TablePagos_pendientes.getColumnModel().getColumn(7).setMaxWidth(500);
        }

        PanelTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1240, 310));

        LabelBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelBuscar.setForeground(new java.awt.Color(255, 255, 255));
        LabelBuscar.setText("Buscar");
        PanelTabla.add(LabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 30));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        PanelTabla.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 230, 30));

        LabelFondoTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoTabla_pagoPendiente.jpg"))); // NOI18N
        LabelFondoTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelTabla.add(LabelFondoTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 380));

        PanelPrincipal.add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 1260, 380));

        Panel_color.setBackground(new java.awt.Color(240, 0, 0));
        Panel_color.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Panel_color.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(253, 216, 42));
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("REGISTRO DE PAGOS PENDIENTES");
        Panel_color.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 400, 50));

        txtUsuario_id.setEditable(false);
        Panel_color.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 30, -1));

        txtIdpagoP.setEditable(false);
        Panel_color.add(txtIdpagoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 30, -1));

        PanelPrincipal.add(Panel_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 1260, 50));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1300, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BOTON_PAGAR_PENDIENTES(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_PAGAR_PENDIENTES

        if (Administracion.addPagos != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Pago esta abierto en el módulo administracion",
                    "Pagos-Pendientes", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (Operaciones_Asistencia.ingrePagos != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Pago esta abierto en el módulo de Asistencia",
                    "Pagos-Pendientes", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            if (pagaDeuda == null) {

                pagaDeuda = new Control_pagos(usuar);
                pagaDeuda.setVisible(true);
            }
        }
    }//GEN-LAST:event_BOTON_PAGAR_PENDIENTES

    private void BOTON_SALIR_PAGO_PENDIENTE(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_SALIR_PAGO_PENDIENTE

        Operaciones_Asistencia.listPagos = null;

        this.dispose();

    }//GEN-LAST:event_BOTON_SALIR_PAGO_PENDIENTE

    private void BOTON_ELIMINAR_PAGO_PENDIENTE(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_ELIMINAR_PAGO_PENDIENTE
        
        try {
            eliminarPagos_pendientes();
        } catch (SQLException ex) {
            Logger.getLogger(ListarPagos_pendientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BOTON_ELIMINAR_PAGO_PENDIENTE

    private void TablePagos_pendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePagos_pendientesMouseClicked
       
        int filaSeleccionada = TablePagos_pendientes.rowAtPoint(evt.getPoint());
	
	txtIdpagoP.setText((String) TablePagos_pendientes.getValueAt(filaSeleccionada, 0).toString());
    }//GEN-LAST:event_TablePagos_pendientesMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        buscarPagos_pendientes(txtBuscar.getText ());
        if(txtBuscar.getText ().isEmpty()){

            try {
                mostrarTablaPago_pendientes();
            } catch (SQLException ex) {
                Logger.getLogger(ListarPagos_pendientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
            java.util.logging.Logger.getLogger(ListarPagos_pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarPagos_pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarPagos_pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarPagos_pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ListarPagos_pendientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JLabel LabelBuscar;
    private javax.swing.JLabel LabelFondoTabla;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JPanel Panel_color;
    private javax.swing.JTable TablePagos_pendientes;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnSalir_pagoP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtIdpagoP;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables


    /*  Funcion para listar los atletas que tienen pagos pendientes */
    @SuppressWarnings("null")
    public void mostrarTablaPago_pendientes() throws SQLException {

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

        //TablePagos_pendientes.setDefaultRenderer(Object.class, new CentrarColum_atletas());
        TablePagos_pendientes.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));

        TablePagos_pendientes.getTableHeader().setFont(new Font("Roboto Medium", 1, 6));

        TablePagos_pendientes.setModel(modelo);
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = conexion.conectar();
        String sql = "SELECT idpagoP,cedula,nombres,date_format(fecha,'%d-%m-%Y')as fecha,tiempo,hora_entrada, hora_salida,observaciones FROM pagopendiente where estatus = 1";

        try {
            ps = conn.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ListarPagos_pendientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        rs = ps.executeQuery();

        ResultSetMetaData rsMD = rs.getMetaData();
        int cantidadColumnas = rsMD.getColumnCount();

        modelo.addColumn("ID");
        modelo.addColumn("CEDULA");
        modelo.addColumn("NOMBRES");
        modelo.addColumn("FECHA");
        modelo.addColumn("TIEMPO");
        modelo.addColumn("HORA ENTRADA");
        modelo.addColumn("HORA SALIDA");
        modelo.addColumn("OBSERVACIONES");

        int[] anchos = {50, 120, 200, 100, 80, 140, 140, 500};

        for (int i = 0; i < cantidadColumnas; i++) {

            TablePagos_pendientes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        while (rs.next()) {
            Object[] filas = new Object[cantidadColumnas];

            for (int i = 0; i < cantidadColumnas; i++) {

                filas[i] = rs.getObject(i + 1);
            }

            modelo.addRow(filas);

            TablePagos_pendientes.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(128, 126, 65), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(40, 40, 40), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(40, 40, 40), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(40, 40, 40), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(40, 40, 40), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(40, 40, 40), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(40, 40, 40), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(40, 40, 40), Color.white));

        }
    }

    // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logoJR3.png"));
        return retValue;
    }

    /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
 /*   FUNCION  PARA  ELIMINAR  LOS  PAGOS ESTABLECIDOS */
    public void eliminarPagos_pendientes() throws SQLException {

        if (this.TablePagos_pendientes.getRowCount() == 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No hay registros para Eliminar",
                    "Pago-Pendiente", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
        }

        //  ELIMINAR  UN  PAGO PENDIENTE  DE LA LISTA
        if (TablePagos_pendientes.getRowCount() > 0) {
            if (this.TablePagos_pendientes.getSelectedRow() == -1) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                JOptionPane.showMessageDialog(this, "Seleccione un registros para Eliminar",
                        "Pago-Pendiente", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            } else {
                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Eliminar este Pago pendiente..?",
                        "Pago-Pendiente", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                if (opcion == 0) {

                    PagoPendiente pagosP = new PagoPendiente();
                    PagoPendienteDao pagosPDAO = new PagoPendienteDao();

                    pagosP.setIdpagoP(Integer.parseInt(txtIdpagoP.getText()));

                    if (pagosPDAO.eliminarPagoPendiente(pagosP.getIdpagoP())) {

                        UI = null;
                        UIManager.put("OptionPane.background", new Color(255, 255, 255));
                        UIManager.put("Panel.background", new Color(255, 255, 255));
                        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                        JOptionPane.showMessageDialog(this, "El pago Pendiente se eliminó Correctamente.",
                                "Pago-Pendiente", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                        
                        mostrarTablaPago_pendientes();

                    } else {

                        UI = null;
                        UIManager.put("OptionPane.background", new Color(255, 255, 255));
                        UIManager.put("Panel.background", new Color(255, 255, 255));
                        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                        JOptionPane.showMessageDialog(this, "No se ha Podido Eliminar el Registro.",
                                "Pago-Pendiente", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                    }
                }
            }

        }

    }
    
     // METODO PARA BUSCAR LOS PAGOS PENDIENTES EN LA TABLA 
    
    public void buscarPagos_pendientes (String buscar) {

        PagoPendienteDao buscaPago_pendDao = new PagoPendienteDao();

        DefaultTableModel modelo = buscaPago_pendDao.buscarPago_pendiente(buscar);

        TablePagos_pendientes.setModel (modelo);

        //TableViewAtletas.setDefaultRenderer (Object.class, new CentrarColum_prod ());

        TablePagos_pendientes.getTableHeader ().setPreferredSize (new java.awt.Dimension (0, 30));

        TablePagos_pendientes.getTableHeader ().setFont (new Font ("Cooper Black", 1, 10));

            
            // Muestra el tamaño de las celdas
            TablePagos_pendientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablePagos_pendientes.getColumnModel().getColumn(1).setPreferredWidth(120);
            TablePagos_pendientes.getColumnModel().getColumn(2).setPreferredWidth(200);
            TablePagos_pendientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            TablePagos_pendientes.getColumnModel().getColumn(4).setPreferredWidth(80);
            TablePagos_pendientes.getColumnModel().getColumn(5).setPreferredWidth(100);
            TablePagos_pendientes.getColumnModel().getColumn(6).setPreferredWidth(100);
            TablePagos_pendientes.getColumnModel().getColumn(7).setPreferredWidth(500);
          
           // Muestra el color de la celda del header en cada columna
           
            TablePagos_pendientes.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(35, 32, 29), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(35, 32, 29), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(35, 32, 29), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(35, 32, 29), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(35, 32, 29), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(35, 32, 29), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(35, 32, 29), Color.white));
            TablePagos_pendientes.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(35, 32, 29), Color.white));
            
            
    }

}
