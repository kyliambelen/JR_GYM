package vistas;

import bd.Conexion;
import dao.NumeroSerieDao;
import entidades.NumeroSerie_factura;
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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

public class NumeroSerie extends java.awt.Dialog {

    UIManager UI;
    @SuppressWarnings("FieldMayBeFinal")
    private Conexion conexion = new Conexion ();

    Usuarios usuar;

    public NumeroSerie (Administracion lns, boolean modal) {
        super (lns, modal);
        initComponents ();
       
    }

    public NumeroSerie (Administracion lns, boolean modal, Usuarios usuar) {
        super (lns, modal);
        initComponents ();
        this.setTitle ("Seriales Facturas");
        txtIdNumeroSerie.setVisible (false);
        txtUsuario_id.setVisible (false);
          this.setIconImage (getIconImage ());
        this.usuar = usuar;

        if (usuar.getIdRol () == 1) {

            txtUsuario_id.setText ("" + usuar.getIdusuario ());
        }

    }

      
     /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ +  */
    // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
    public Image getIconImage () {
        Image retValue = Toolkit.getDefaultToolkit ().getImage (ClassLoader.getSystemResource ("img/logoNSerie1.png"));
        return retValue;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSerieInicio = new javax.swing.JTextField();
        txtSerieFinal = new javax.swing.JTextField();
        btnAgragarSerie = new javax.swing.JButton();
        btnEditarSerie = new javax.swing.JButton();
        btnEliminarSerie = new javax.swing.JButton();
        btnLimpiarSerie = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableNumeroSerie = new javax.swing.JTable();
        txtIdNumeroSerie = new javax.swing.JTextField();
        txtCampoBusqueda = new javax.swing.JTextField();
        txtUsuario_id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LabelTitle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        setTitle("OPERACIONES - SERIES");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("SERIE DE INICIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 120, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("SERIE FINAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 120, 30));

        txtSerieInicio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtSerieInicio.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.add(txtSerieInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 150, 30));

        txtSerieFinal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtSerieFinal.setForeground(new java.awt.Color(0, 0, 102));
        txtSerieFinal.setToolTipText("");
        jPanel1.add(txtSerieFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 150, 30));

        btnAgragarSerie.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnAgragarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonADD.png"))); // NOI18N
        btnAgragarSerie.setToolTipText("Agregar");
        btnAgragarSerie.setBorder(null);
        btnAgragarSerie.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agreAdd1.png"))); // NOI18N
        btnAgragarSerie.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonADD.png"))); // NOI18N
        btnAgragarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgragarSerieActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgragarSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 45, 45));
        btnAgragarSerie.getAccessibleContext().setAccessibleDescription("");

        btnEditarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEditar.png"))); // NOI18N
        btnEditarSerie.setToolTipText("Editar");
        btnEditarSerie.setBorder(null);
        btnEditarSerie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarSerie.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonEditar.png"))); // NOI18N
        btnEditarSerie.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEditar.png"))); // NOI18N
        btnEditarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSerieActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 45, 45));

        btnEliminarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEliminar.png"))); // NOI18N
        btnEliminarSerie.setToolTipText("Eliminar");
        btnEliminarSerie.setBorder(null);
        btnEliminarSerie.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete2.png"))); // NOI18N
        btnEliminarSerie.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEliminar.png"))); // NOI18N
        btnEliminarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSerieActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 45, 45));

        btnLimpiarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLimpiar.png"))); // NOI18N
        btnLimpiarSerie.setToolTipText("Limpiar");
        btnLimpiarSerie.setBorder(null);
        btnLimpiarSerie.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLimpiar2.png"))); // NOI18N
        btnLimpiarSerie.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLimpiar.png"))); // NOI18N
        btnLimpiarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSerieActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 45, 45));

        JTableNumeroSerie.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JTableNumeroSerie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FECHA", "SERIE", "SERIE INICIAL", "SERIE FINAL", "ESTATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Long.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTableNumeroSerie.setToolTipText("refrescar");
        JTableNumeroSerie.setRowHeight(28);
        JTableNumeroSerie.setSelectionBackground(new java.awt.Color(206, 246, 206));
        JTableNumeroSerie.setSelectionForeground(new java.awt.Color(0, 0, 102));
        JTableNumeroSerie.setUpdateSelectionOnSort(false);
        JTableNumeroSerie.setVerifyInputWhenFocusTarget(false);
        JTableNumeroSerie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableNumeroSerieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableNumeroSerie);
        if (JTableNumeroSerie.getColumnModel().getColumnCount() > 0) {
            JTableNumeroSerie.getColumnModel().getColumn(0).setMinWidth(80);
            JTableNumeroSerie.getColumnModel().getColumn(0).setPreferredWidth(80);
            JTableNumeroSerie.getColumnModel().getColumn(0).setMaxWidth(80);
            JTableNumeroSerie.getColumnModel().getColumn(1).setMinWidth(100);
            JTableNumeroSerie.getColumnModel().getColumn(1).setPreferredWidth(100);
            JTableNumeroSerie.getColumnModel().getColumn(1).setMaxWidth(100);
            JTableNumeroSerie.getColumnModel().getColumn(2).setMinWidth(120);
            JTableNumeroSerie.getColumnModel().getColumn(2).setPreferredWidth(120);
            JTableNumeroSerie.getColumnModel().getColumn(2).setMaxWidth(120);
            JTableNumeroSerie.getColumnModel().getColumn(3).setMinWidth(120);
            JTableNumeroSerie.getColumnModel().getColumn(3).setPreferredWidth(120);
            JTableNumeroSerie.getColumnModel().getColumn(3).setMaxWidth(120);
            JTableNumeroSerie.getColumnModel().getColumn(4).setMinWidth(120);
            JTableNumeroSerie.getColumnModel().getColumn(4).setPreferredWidth(120);
            JTableNumeroSerie.getColumnModel().getColumn(4).setMaxWidth(120);
            JTableNumeroSerie.getColumnModel().getColumn(5).setMinWidth(80);
            JTableNumeroSerie.getColumnModel().getColumn(5).setPreferredWidth(80);
            JTableNumeroSerie.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 620, 220));

        txtIdNumeroSerie.setEditable(false);
        jPanel1.add(txtIdNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, 30, -1));

        txtCampoBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCampoBusquedaKeyReleased(evt);
            }
        });
        jPanel1.add(txtCampoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 180, 30));

        txtUsuario_id.setEditable(false);
        jPanel1.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 30, -1));

        jPanel2.setBackground(new java.awt.Color(0, 171, 199));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1004, 60));

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitle.setText("AGREGAR N° SERIE");
        jPanel3.add(LabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoNSerie1.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnListaSalir.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalir_entrada.png"))); // NOI18N
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnListaSalir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1004, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 30, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1004, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible (false);
        dispose ();
    }//GEN-LAST:event_closeDialog

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        mostrarTablaCodigos ();
    }//GEN-LAST:event_formWindowOpened

    private void txtCampoBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoBusquedaKeyReleased

        buscarNumeroSerie (txtCampoBusqueda.getText ());
    }//GEN-LAST:event_txtCampoBusquedaKeyReleased

    private void btnAgragarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgragarSerieActionPerformed

        addNumerosSerie ();
        mostrarTablaCodigos();
    }//GEN-LAST:event_btnAgragarSerieActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        Administracion.abrirNumero_S = null;

        this.dispose ();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void JTableNumeroSerieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableNumeroSerieMouseClicked

        int filaSeleccionada = JTableNumeroSerie.rowAtPoint (evt.getPoint ());

        txtIdNumeroSerie.setText ((String) JTableNumeroSerie.getValueAt (filaSeleccionada, 0).toString ());
        txtSerieInicio.setText ((String) JTableNumeroSerie.getValueAt (filaSeleccionada, 2));
        txtSerieFinal.setText ((String) JTableNumeroSerie.getValueAt (filaSeleccionada, 3));


    }//GEN-LAST:event_JTableNumeroSerieMouseClicked

    private void btnEditarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSerieActionPerformed

        editarNumerosSerie ();
        mostrarTablaCodigos();
    }//GEN-LAST:event_btnEditarSerieActionPerformed

    private void btnEliminarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSerieActionPerformed

        delNumeroSerie ();
        mostrarTablaCodigos();
    }//GEN-LAST:event_btnEliminarSerieActionPerformed

    private void btnLimpiarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSerieActionPerformed

        limpiar ();
    }//GEN-LAST:event_btnLimpiarSerieActionPerformed

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    private void limpiar () {

        txtCampoBusqueda.setText ("");
        txtSerieInicio.setText ("");
        txtSerieFinal.setText ("");

    }

    //*********************************************************************************************************//
    public static void main (String args[]) {
        java.awt.EventQueue.invokeLater (() -> {
            NumeroSerie dialog = new NumeroSerie ((Administracion) new java.awt.Frame (), true);
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
    private javax.swing.JTable JTableNumeroSerie;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JButton btnAgragarSerie;
    private javax.swing.JButton btnEditarSerie;
    private javax.swing.JButton btnEliminarSerie;
    private javax.swing.JButton btnLimpiarSerie;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCampoBusqueda;
    private javax.swing.JTextField txtIdNumeroSerie;
    private javax.swing.JTextField txtSerieFinal;
    private javax.swing.JTextField txtSerieInicio;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables

    /*  FUNCION  PARA  MOSTRAR  LA  TABLA  CON  LOS  CODIGOS */
    public void mostrarTablaCodigos () {
        try {
            DefaultTableModel modelo = new DefaultTableModel () {
                @Override
                public boolean isCellEditable (int fila, int columna) {
                    if (columna == 5) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            JTableNumeroSerie.setModel (modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = conexion.conectar ();
            String sql = "SELECT idserie,fecha,LPAD(serie_inicio,'8','0'), LPAD(serie_final,'8','0'),estatus FROM numero_serie_factura";
            ps = conn.prepareStatement (sql);
            rs = ps.executeQuery ();

            ResultSetMetaData rsMD = rs.getMetaData ();
            int cantidadColumnas = rsMD.getColumnCount ();

            modelo.addColumn ("ID");
            modelo.addColumn ("FECHA");
            modelo.addColumn ("SERIE INICIO");
            modelo.addColumn ("SERIE FINAL");
            modelo.addColumn ("ESTATUS");
            int[] anchos = {80, 150, 120, 120, 120};

            for (int i = 0; i < cantidadColumnas; i++) {

                JTableNumeroSerie.getColumnModel ().getColumn (i).setPreferredWidth (anchos[i]);
            }

            while (rs.next ()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {

                    filas[i] = rs.getObject (i + 1);
                }

                modelo.addRow (filas);
                JTableNumeroSerie.setDefaultRenderer (Object.class, new CentrarColum_numeroSerie ());

                JTableNumeroSerie.getTableHeader ().setPreferredSize (new java.awt.Dimension (0, 20));

                JTableNumeroSerie.getTableHeader ().setFont (new Font ("Cooper Black", 1,10));

                JTableNumeroSerie.getColumnModel ().getColumn (0).setHeaderRenderer (new MyRenderer (new Color(0,0,102),   Color.white));
                JTableNumeroSerie.getColumnModel ().getColumn (1).setHeaderRenderer (new MyRenderer (new Color(66,158,71), Color.white));
                JTableNumeroSerie.getColumnModel ().getColumn (2).setHeaderRenderer (new MyRenderer (new Color(66,158,71), Color.white));
                JTableNumeroSerie.getColumnModel ().getColumn (3).setHeaderRenderer (new MyRenderer (new Color(66,158,71), Color.white));
                JTableNumeroSerie.getColumnModel ().getColumn (4).setHeaderRenderer (new MyRenderer (new Color(66,158,71), Color.white));
                

            }

        } catch (Exception ex) {
            System.err.println ("ex.toString");

        }

    }

    // FUNCION  PARA  AGREGAR  LOS  VALORES  DE  LOS  NUMEROS  DE   SERIES  //
    public void addNumerosSerie () {
        try {

            NumeroSerie_factura numserie = new NumeroSerie_factura ();
            NumeroSerieDao numserieDao = new NumeroSerieDao ();

            if ( txtSerieInicio.getText ().equals ("") || txtSerieFinal.getText ().equals ("")) {

                UI = null;
                UIManager.put ("OptionPane.background", new Color (255, 255, 255));
                UIManager.put ("Panel.background", new Color (255, 255, 255));
                UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
                UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 15)));
                UIManager.put ("OptionPane.messageForeground", Color.decode ("#0793FE"));
                JOptionPane.showMessageDialog (this, "ATENCION..! No Debe Haber Campos Vacios",
                        "Numero-Serie", JOptionPane.PLAIN_MESSAGE, icono ("/img/logoNSerie2.png", 60, 60));

            } else {

               
                numserie.setSerieInicio (Integer.parseInt (txtSerieInicio.getText ()));
                numserie.setSerieFinal (Integer.parseInt (txtSerieFinal.getText ()));

                if (numserieDao.agregarNumeroSerie (numserie)) {

                    UI = null;
                    UIManager.put ("OptionPane.background", new Color (255, 255, 255));
                    UIManager.put ("Panel.background", new Color (255, 255, 255));
                    UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
                    UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 15)));
                    UIManager.put ("OptionPane.messageForeground", Color.decode ("#0793FE"));
                    JOptionPane.showMessageDialog (this, "Los Datos Se Guardaron Correctamente",
                            "Numero-Serie", JOptionPane.PLAIN_MESSAGE, icono ("/img/logoNSerie2.png", 60, 60));

                    limpiar ();
		    

                } else {

                    UI = null;
                    UIManager.put ("OptionPane.background", new Color (255, 255, 255));
                    UIManager.put ("Panel.background", new Color (255, 255, 255));
                    UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
                    UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 15)));
                    UIManager.put ("OptionPane.messageForeground", Color.decode ("#0793FE"));
                    JOptionPane.showMessageDialog (this, "Lo siento...!!! Ha Ocurrido Un Error Guardando Los Datos",
                            "Numero-Serie", JOptionPane.PLAIN_MESSAGE, icono ("/img/logoNSerie2.png", 60, 60));
                }

            }
        } catch ( SQLException ex) {

            UI = null;
            UIManager.put ("OptionPane.background", new Color (255, 255, 255));
            UIManager.put ("Panel.background", new Color (255, 255, 255));
            UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
            UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 15)));
            UIManager.put ("OptionPane.messageForeground", Color.decode ("#0793FE"));
            JOptionPane.showMessageDialog (this, "Error al Guardar los Datos",
                    "Numero-Serie", JOptionPane.PLAIN_MESSAGE, icono ("/img/logoNSerie2.png", 60, 60));

            System.out.println ("ex");
        }

    }

    // FUNCION  PARA  EDITAR  LOS  VALORES  DE  LOS  NUMEROS  DE   SERIES  //
    public void editarNumerosSerie () {

        try {
            NumeroSerie_factura nserieF = new NumeroSerie_factura ();
            NumeroSerieDao nserieFDAO = new NumeroSerieDao ();

            if ( txtSerieInicio.getText ().equals ("") || txtSerieFinal.getText ().equals ("")) {

                UI = null;
                UIManager.put ("OptionPane.background", new Color (255, 255, 255));
                UIManager.put ("Panel.background", new Color (255, 255, 255));
                UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
                UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 15)));
                UIManager.put ("OptionPane.messageForeground", Color.decode ("#0793FE"));
                JOptionPane.showMessageDialog (this, "ATENCION..! Seleccione el registro de la tabla para Editar",
                        "Numero-Serie", JOptionPane.PLAIN_MESSAGE, icono ("/img/logoNSerie2.png", 60, 60));

            } else {

               
                nserieF.setSerieInicio (Integer.parseInt (txtSerieInicio.getText ()));
                nserieF.setSerieFinal (Integer.parseInt (txtSerieFinal.getText ()));
                nserieF.setIdserie (Integer.parseInt (txtIdNumeroSerie.getText ()));

                if (nserieFDAO.modificarNumeroSerie (nserieF)) {

                    UI = null;
                    UIManager.put ("OptionPane.background", new Color (255, 255, 255));
                    UIManager.put ("Panel.background", new Color (255, 255, 255));
                    UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
                    UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 15)));
                    UIManager.put ("OptionPane.messageForeground", Color.decode ("#0793FE"));
                    JOptionPane.showMessageDialog (this, "Los Datos Se Guardaron Correctamente",
                            "Numero-Serie", JOptionPane.PLAIN_MESSAGE, icono ("/img/logoNSerie2.png", 60, 60));

                    limpiar ();

                } else {

                    UI = null;
                    UIManager.put ("OptionPane.background", new Color (255, 255, 255));
                    UIManager.put ("Panel.background", new Color (255, 255, 255));
                    UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
                    UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 15)));
                    UIManager.put ("OptionPane.messageForeground", Color.decode ("#0793FE"));
                    JOptionPane.showMessageDialog (this, "Lo siento...!!! Ha Ocurrido Un Error Guardando Los Datos",
                            "Numero-Serie", JOptionPane.PLAIN_MESSAGE, icono ("/img/logoNSerie2.png", 60, 60));
                }
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog (this, e.getMessage ());
        }

    }

    /*   FUNCION  PARA  ELIMINAR  LOS  NUMEROS  DE  SERIES */
    public void delNumeroSerie () {

        if ( txtSerieInicio.getText ().equals ("") || txtSerieFinal.getText ().equals ("")) {

            UI = null;
            UIManager.put ("OptionPane.background", new Color (255, 255, 255));
            UIManager.put ("Panel.background", new Color (255, 255, 255));
            UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
            UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 15)));
            UIManager.put ("OptionPane.messageForeground", Color.decode ("#0793FE"));
            JOptionPane.showMessageDialog (this, "Debe Seleccionar La Serie Que Desea Eliminar.",
                    "Numero-Serie", JOptionPane.PLAIN_MESSAGE, icono ("/img/logoNSerie2.png", 60, 60));

        } else {
            
            
             UI = null;
                    UIManager.put ("OptionPane.background", new Color (255, 255, 255));
                    UIManager.put ("Panel.background", new Color (255, 255, 255));
                    UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
                    UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 15)));
                    UIManager.put ("OptionPane.messageForeground", Color.decode ("#0793FE"));
                    int opcion = JOptionPane.showConfirmDialog (this, "Estas Seguro de Eliminar Esta Serie..?",
                            "Numero-Serie", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono ("/img/logoNSerie2.png", 60, 60));
          if (opcion == 0) {

            NumeroSerie_factura nserieDel = new NumeroSerie_factura ();
            NumeroSerieDao nseriedelDAO = new NumeroSerieDao ();

            nserieDel.setIdserie (Integer.parseInt (txtIdNumeroSerie.getText ()));

            try {

                if (nseriedelDAO.eliminarNumeroSerie (nserieDel.getIdserie ())) {

                    UI = null;
                    UIManager.put ("OptionPane.background", new Color (255, 255, 255));
                    UIManager.put ("Panel.background", new Color (255, 255, 255));
                    UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
                    UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 15)));
                    UIManager.put ("OptionPane.messageForeground", Color.decode ("#0793FE"));
                    JOptionPane.showMessageDialog (this, "El Registro se Eliminó Correctamente.",
                            "Numero-Serie", JOptionPane.PLAIN_MESSAGE, icono ("/img/logoNSerie2.png", 60, 60));

                    limpiar ();

                } else {

                    UI = null;
                    UIManager.put ("OptionPane.background", new Color (255, 255, 255));
                    UIManager.put ("Panel.background", new Color (255, 255, 255));
                    UIManager.put ("OptionPane.messageFont", new FontUIResource (new Font ("Cambria", Font.BOLD, 16)));
                    UIManager.put ("OptionPane.buttonFont", new FontUIResource (new Font ("Cambria", Font.PLAIN, 15)));
                    UIManager.put ("OptionPane.messageForeground", Color.decode ("#0793FE"));
                    JOptionPane.showMessageDialog (this, "No se ha Podido Eliminar el Registro.",
                            "Numero-Serie", JOptionPane.PLAIN_MESSAGE, icono ("/img/logoNSerie2.png", 60, 60));
                }
            } catch (SQLException ex) {

                System.out.println (ex.getMessage ());
            }
          }
        }

        }
        /*  FUNCION  PARA  HACER  LA  BUSQUEDA  DEL  NUMERO DE SERIE  */
    public void buscarNumeroSerie (String buscar) {

        NumeroSerieDao buscaDao = new NumeroSerieDao ();

        DefaultTableModel modelo = buscaDao.buscarNumero_serie (buscar);

        JTableNumeroSerie.setModel (modelo);

        JTableNumeroSerie.setDefaultRenderer (Object.class, new CentrarColum_buscarCodigos ());

        JTableNumeroSerie.getTableHeader ().setPreferredSize (new java.awt.Dimension (0, 30));

        JTableNumeroSerie.getTableHeader ().setFont (new Font ("Cooper Black", 1, 6));

        JTableNumeroSerie.getColumnModel ().getColumn (0).setHeaderRenderer (new MyRenderer (Color.GRAY, Color.white));
        JTableNumeroSerie.getColumnModel ().getColumn (1).setHeaderRenderer (new MyRenderer (Color.blue, Color.white));
        JTableNumeroSerie.getColumnModel ().getColumn (2).setHeaderRenderer (new MyRenderer (Color.blue, Color.white));
        JTableNumeroSerie.getColumnModel ().getColumn (3).setHeaderRenderer (new MyRenderer (Color.blue, Color.white));
        JTableNumeroSerie.getColumnModel ().getColumn (4).setHeaderRenderer (new MyRenderer (Color.blue, Color.white));
        JTableNumeroSerie.getColumnModel ().getColumn (5).setHeaderRenderer (new MyRenderer (Color.blue, Color.white));

        JTableNumeroSerie.getColumnModel ().getColumn (0).setMaxWidth (80);
        JTableNumeroSerie.getColumnModel ().getColumn (0).setMinWidth (80);
        JTableNumeroSerie.getColumnModel ().getColumn (1).setMaxWidth (100);
        JTableNumeroSerie.getColumnModel ().getColumn (1).setMinWidth (100);
        JTableNumeroSerie.getColumnModel ().getColumn (2).setMaxWidth (100);
        JTableNumeroSerie.getColumnModel ().getColumn (2).setMinWidth (100);
        JTableNumeroSerie.getColumnModel ().getColumn (3).setMaxWidth (120);
        JTableNumeroSerie.getColumnModel ().getColumn (3).setMinWidth (120);
        JTableNumeroSerie.getColumnModel ().getColumn (4).setMaxWidth (120);
        JTableNumeroSerie.getColumnModel ().getColumn (4).setMinWidth (120);
        JTableNumeroSerie.getColumnModel ().getColumn (5).setMaxWidth (80);
        JTableNumeroSerie.getColumnModel ().getColumn (5).setMinWidth (80);

    }

    /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono (String path, int width, int heigth) {
        Icon img = new ImageIcon (new ImageIcon (getClass ().getResource (path)).getImage ()
                .getScaledInstance (width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    private void setDefaultCloseOperation(int DO_NOTHING_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
