package vistas;

import Excel_reportes.FacturacionExcel;
import bd.Conexion;
import bd.hash;
import dao.AtletasDao;
import dao.Detalle_tempDao;
import dao.FacturaDao;
import dao.NumeroSerieDao;
import dao.PagosDao;
import entidades.Atletas;
import entidades.Detalle_temp;
import entidades.Facturas;
import entidades.NumeroSerie_factura;
import entidades.Pagos;
import entidades.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class Control_pagos extends javax.swing.JFrame {

    int xMouse, yMouse;
    UIManager UI;
    int item;
    double subTotal = 0.00;
    double total = 0.00;
    double impuesto = 0.00;
    double iva = 0.00;
    double sinIva = 0.00;
    double monto = 0.00;
    int correlativo = 0;

    private final Conexion conexion = new Conexion();

    public static BuscarCodigo addCodigo;
    public static BuscarAtletas addAtletas;
    public static Calculadora ingreCalculadora;
    public static Factura_report reportFactura;
    public static AgregarAtletas agregaAtletas;
    public static LoginActivar_ventas Login_activar;
    Usuarios usuar;

    Detalle_temp detemp = new Detalle_temp();

    public Control_pagos() {

        initComponents();

    }

    public Control_pagos(Usuarios usuar) {
        initComponents();
        setIconImage(getIconImage());
        this.setTitle("CONTROL-PAGOS");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.usuar = usuar;
        txtTokenP.setVisible(false);
        txtIdUsuarioP.setVisible(false);
        txtIdPagosP.setVisible(false);
        txtIdAtletasP.setVisible(false);
        txtNombreUsuarioP.setVisible(false);
        txtTotal2.setVisible(false);
        txtSerieFinalP.setVisible(false);
        txtIdusuario_cobrador.setVisible(false);
        txtSerieInicial.setVisible(false);
        txtTotalPago_generalP.setBackground(new Color(25, 25, 112));

        generarSerie();

        JLNombreUsuario.setText(usuar.getNombre());

        if (usuar.getIdRol() == 1) {

            txtIdUsuarioP.setText("" + usuar.getIdusuario());
            txtNombreUsuarioP.setText("" + usuar.getNombre());
            btnEliminarPagoP.setVisible(false);
            btnAnularPagosP.setVisible(false);
        } else if (usuar.getIdRol() == 2) {

            txtIdUsuarioP.setText("" + usuar.getIdusuario());
            txtNombreUsuarioP.setText("" + usuar.getNombre());
            btnEliminarPagoP.setVisible(false);
            btnAnularPagosP.setVisible(false);

        } else if (usuar.getIdRol() == 3) {

            txtIdUsuarioP.setText("" + usuar.getIdusuario());
            txtNombreUsuarioP.setText("" + usuar.getNombre());
            btnEliminarPagoP.setVisible(false);
            btnAnularPagosP.setVisible(false);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        btnCodigoP = new javax.swing.JButton();
        btnCalculadoraP = new javax.swing.JButton();
        btnSalirP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCedulaP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidadP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDescuentoP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSerieInicialP = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JLNombreUsuario = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMonto_totalP = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTotalCobrarP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCobrar_pagos = new javax.swing.JTable();
        btnFacturaP = new javax.swing.JButton();
        btnAnularPagosP = new javax.swing.JButton();
        btnEliminarPagoP = new javax.swing.JButton();
        btnSupervisorP = new javax.swing.JButton();
        txtTokenP = new javax.swing.JTextField();
        txtIdAtletasP = new javax.swing.JTextField();
        txtIdPagosP = new javax.swing.JTextField();
        txtIdUsuarioP = new javax.swing.JTextField();
        txtNombreUsuarioP = new javax.swing.JTextField();
        txtTotal2 = new javax.swing.JTextField();
        txtSerieFinalP = new javax.swing.JTextField();
        txtIdusuario_cobrador = new javax.swing.JTextField();
        btnAtletasP = new javax.swing.JButton();
        PanelBlanco = new javax.swing.JPanel();
        txtTotalPago_generalP = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSubTotal_pagoP = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnProcesarVentaP = new javax.swing.JButton();
        btnCalculaCambio = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtIva = new javax.swing.JLabel();
        txtMonto_iva = new javax.swing.JLabel();
        btnReport = new javax.swing.JButton();
        txtSerieInicial = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtNombresP = new javax.swing.JTextField();
        txtDescripcionP = new javax.swing.JTextField();
        txtMontoP = new javax.swing.JTextField();
        btnBusca_cliente = new javax.swing.JButton();
        txtSaludo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(935, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(0, 51, 102));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setToolTipText("");
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCodigoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atletasCodigos.png"))); // NOI18N
        btnCodigoP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnCodigoP.setContentAreaFilled(false);
        btnCodigoP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCodigoP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atletasCodigos2.png"))); // NOI18N
        btnCodigoP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atletasCodigos.png"))); // NOI18N
        btnCodigoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodigoPActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnCodigoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 95, 50));

        btnCalculadoraP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atletasCalcular.png"))); // NOI18N
        btnCalculadoraP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnCalculadoraP.setContentAreaFilled(false);
        btnCalculadoraP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalculadoraP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosCalcular2.png"))); // NOI18N
        btnCalculadoraP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atletasCalcular.png"))); // NOI18N
        btnCalculadoraP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculadoraPActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnCalculadoraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 95, 50));

        btnSalirP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exitsalir1.png"))); // NOI18N
        btnSalirP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnSalirP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalirP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosSalir2.png"))); // NOI18N
        btnSalirP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exitsalir1.png"))); // NOI18N
        btnSalirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnSalirP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 95, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CEDULA");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 50, -1));

        txtCedulaP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCedulaP.setForeground(new java.awt.Color(51, 51, 51));
        txtCedulaP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCedulaP.setAlignmentX(2.5F);
        txtCedulaP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtCedulaP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaPKeyTyped(evt);
            }
        });
        PanelPrincipal.add(txtCedulaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 160, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CODIGO");
        PanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        txtCodigoP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCodigoP.setForeground(new java.awt.Color(51, 51, 51));
        txtCodigoP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtCodigoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoPKeyReleased(evt);
            }
        });
        PanelPrincipal.add(txtCodigoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CANTIDAD DE DIAS");
        PanelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, 20));

        txtCantidadP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCantidadP.setForeground(new java.awt.Color(51, 51, 51));
        txtCantidadP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtCantidadP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadPKeyTyped(evt);
            }
        });
        PanelPrincipal.add(txtCantidadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DESCUENTO");
        PanelPrincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        txtDescuentoP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtDescuentoP.setForeground(new java.awt.Color(51, 51, 51));
        txtDescuentoP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtDescuentoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescuentoPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoPKeyTyped(evt);
            }
        });
        PanelPrincipal.add(txtDescuentoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 160, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ATLETA");
        PanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 60, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DESCRIPCION");
        PanelPrincipal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MONTO");
        PanelPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        jLabel17.setForeground(new java.awt.Color(0, 102, 255));
        jLabel17.setText("NUMERO DE SERIE");
        PanelPrincipal.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, -1));

        txtSerieInicialP.setBackground(new java.awt.Color(0, 153, 204));
        txtSerieInicialP.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txtSerieInicialP.setForeground(new java.awt.Color(255, 255, 255));
        txtSerieInicialP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSerieInicialP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtSerieInicialP.setOpaque(true);
        PanelPrincipal.add(txtSerieInicialP, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 180, 30));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 255));
        jLabel14.setText("USUARIO");
        jLabel14.setToolTipText("");
        PanelPrincipal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 110, 30));

        JLNombreUsuario.setBackground(new java.awt.Color(0, 153, 204));
        JLNombreUsuario.setFont(new java.awt.Font("Fira Sans Condensed ExtraBold", 1, 20)); // NOI18N
        JLNombreUsuario.setForeground(new java.awt.Color(0, 0, 102));
        JLNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLNombreUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        JLNombreUsuario.setOpaque(true);
        PanelPrincipal.add(JLNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 290, 40));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoUsuario.png"))); // NOI18N
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 110, 90));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MONTO TOTAL");
        PanelPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 80, -1));

        txtMonto_totalP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtMonto_totalP.setForeground(new java.awt.Color(0, 153, 204));
        txtMonto_totalP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        PanelPrincipal.add(txtMonto_totalP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TOTAL A COBRAR");
        PanelPrincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 110, -1));

        txtTotalCobrarP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotalCobrarP.setForeground(new java.awt.Color(0, 153, 204));
        txtTotalCobrarP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        txtTotalCobrarP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalCobrarPKeyPressed(evt);
            }
        });
        PanelPrincipal.add(txtTotalCobrarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 180, 30));

        TableCobrar_pagos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TableCobrar_pagos.setFont(new java.awt.Font("Roboto Black", 1, 15)); // NOI18N
        TableCobrar_pagos.setForeground(new java.awt.Color(25, 25, 112));
        TableCobrar_pagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "COD", "DESCRIPCION", "CANT.DIAS", "MONTO", "MONTO TOTAL", "DESC.", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableCobrar_pagos.setAlignmentX(2.5F);
        TableCobrar_pagos.setGridColor(new java.awt.Color(204, 204, 204));
        TableCobrar_pagos.setRowHeight(35);
        TableCobrar_pagos.setSelectionBackground(new java.awt.Color(102, 102, 102));
        TableCobrar_pagos.setShowVerticalLines(false);
        jScrollPane1.setViewportView(TableCobrar_pagos);
        if (TableCobrar_pagos.getColumnModel().getColumnCount() > 0) {
            TableCobrar_pagos.getColumnModel().getColumn(0).setMinWidth(40);
            TableCobrar_pagos.getColumnModel().getColumn(0).setPreferredWidth(40);
            TableCobrar_pagos.getColumnModel().getColumn(0).setMaxWidth(40);
            TableCobrar_pagos.getColumnModel().getColumn(1).setMinWidth(120);
            TableCobrar_pagos.getColumnModel().getColumn(1).setPreferredWidth(120);
            TableCobrar_pagos.getColumnModel().getColumn(1).setMaxWidth(120);
            TableCobrar_pagos.getColumnModel().getColumn(2).setMinWidth(300);
            TableCobrar_pagos.getColumnModel().getColumn(2).setPreferredWidth(300);
            TableCobrar_pagos.getColumnModel().getColumn(2).setMaxWidth(300);
            TableCobrar_pagos.getColumnModel().getColumn(3).setMinWidth(80);
            TableCobrar_pagos.getColumnModel().getColumn(3).setMaxWidth(80);
            TableCobrar_pagos.getColumnModel().getColumn(4).setMinWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(4).setPreferredWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(4).setMaxWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(5).setMinWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(5).setPreferredWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(5).setMaxWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(6).setMinWidth(70);
            TableCobrar_pagos.getColumnModel().getColumn(6).setPreferredWidth(70);
            TableCobrar_pagos.getColumnModel().getColumn(6).setMaxWidth(70);
            TableCobrar_pagos.getColumnModel().getColumn(7).setMinWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(7).setPreferredWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(7).setMaxWidth(90);
        }

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 890, 180));

        btnFacturaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosFacturar.png"))); // NOI18N
        btnFacturaP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnFacturaP.setContentAreaFilled(false);
        btnFacturaP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosFacturar2.png"))); // NOI18N
        btnFacturaP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosFacturar.png"))); // NOI18N
        btnFacturaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaPActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnFacturaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 90, 60));

        btnAnularPagosP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosAnular.png"))); // NOI18N
        btnAnularPagosP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAnularPagosP.setContentAreaFilled(false);
        btnAnularPagosP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnularPagosP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosAnular2.png"))); // NOI18N
        btnAnularPagosP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosAnular.png"))); // NOI18N
        btnAnularPagosP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularPagosPActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnAnularPagosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 90, 60));

        btnEliminarPagoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosEliminar.png"))); // NOI18N
        btnEliminarPagoP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnEliminarPagoP.setContentAreaFilled(false);
        btnEliminarPagoP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarPagoP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagoseliminar2.png"))); // NOI18N
        btnEliminarPagoP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosEliminar.png"))); // NOI18N
        btnEliminarPagoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPagoPActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnEliminarPagoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 90, 60));

        btnSupervisorP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosSupervisor.png"))); // NOI18N
        btnSupervisorP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSupervisorP.setContentAreaFilled(false);
        btnSupervisorP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosSuperV2.png"))); // NOI18N
        btnSupervisorP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosSupervisor.png"))); // NOI18N
        btnSupervisorP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupervisorPActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnSupervisorP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 90, 60));

        txtTokenP.setEditable(false);
        txtTokenP.setEnabled(false);
        PanelPrincipal.add(txtTokenP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 90, 20));

        txtIdAtletasP.setEditable(false);
        txtIdAtletasP.setEnabled(false);
        PanelPrincipal.add(txtIdAtletasP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 30, -1));

        txtIdPagosP.setEditable(false);
        txtIdPagosP.setEnabled(false);
        PanelPrincipal.add(txtIdPagosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 30, -1));

        txtIdUsuarioP.setEditable(false);
        txtIdUsuarioP.setEnabled(false);
        PanelPrincipal.add(txtIdUsuarioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 30, 20));

        txtNombreUsuarioP.setEditable(false);
        txtNombreUsuarioP.setEnabled(false);
        PanelPrincipal.add(txtNombreUsuarioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 90, 20));

        txtTotal2.setEditable(false);
        txtTotal2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        PanelPrincipal.add(txtTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 30, 20));

        txtSerieFinalP.setEditable(false);
        PanelPrincipal.add(txtSerieFinalP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 30, 20));

        txtIdusuario_cobrador.setEditable(false);
        PanelPrincipal.add(txtIdusuario_cobrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, 30, 20));

        btnAtletasP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosAtletas.png"))); // NOI18N
        btnAtletasP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAtletasP.setContentAreaFilled(false);
        btnAtletasP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtletasP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atletaspagos2.png"))); // NOI18N
        btnAtletasP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosAtletas.png"))); // NOI18N
        btnAtletasP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtletasPActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnAtletasP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 95, 50));

        PanelBlanco.setBackground(new java.awt.Color(0, 0, 51));
        PanelBlanco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTotalPago_generalP.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtTotalPago_generalP.setForeground(new java.awt.Color(255, 51, 51));
        txtTotalPago_generalP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotalPago_generalP.setToolTipText("");
        txtTotalPago_generalP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtTotalPago_generalP.setOpaque(true);
        PanelBlanco.add(txtTotalPago_generalP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 240, 40));

        jLabel12.setFont(new java.awt.Font("Dialog", 3, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TOTAL");
        jLabel12.setToolTipText("");
        PanelBlanco.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 80, 40));

        txtSubTotal_pagoP.setBackground(new java.awt.Color(255, 255, 255));
        txtSubTotal_pagoP.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtSubTotal_pagoP.setForeground(new java.awt.Color(255, 255, 0));
        txtSubTotal_pagoP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSubTotal_pagoP.setToolTipText("");
        PanelBlanco.add(txtSubTotal_pagoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 200, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("IVA ");
        jLabel10.setToolTipText("");
        PanelBlanco.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, 30));

        btnProcesarVentaP.setBackground(new java.awt.Color(255, 255, 0));
        btnProcesarVentaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosOk.png"))); // NOI18N
        btnProcesarVentaP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        btnProcesarVentaP.setContentAreaFilled(false);
        btnProcesarVentaP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProcesarVentaP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosOk2.png"))); // NOI18N
        btnProcesarVentaP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosOk.png"))); // NOI18N
        btnProcesarVentaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarVentaPActionPerformed(evt);
            }
        });
        PanelBlanco.add(btnProcesarVentaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 40));

        btnCalculaCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosCambio.png"))); // NOI18N
        btnCalculaCambio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnCalculaCambio.setContentAreaFilled(false);
        btnCalculaCambio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosCambio2.png"))); // NOI18N
        btnCalculaCambio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosCambio.png"))); // NOI18N
        btnCalculaCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaCambioActionPerformed(evt);
            }
        });
        PanelBlanco.add(btnCalculaCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SUB-TOTAL");
        jLabel11.setToolTipText("");
        PanelBlanco.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 30));

        txtIva.setBackground(new java.awt.Color(0, 0, 51));
        txtIva.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtIva.setForeground(new java.awt.Color(255, 255, 255));
        PanelBlanco.add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 70, 30));

        txtMonto_iva.setBackground(new java.awt.Color(255, 255, 255));
        txtMonto_iva.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtMonto_iva.setForeground(new java.awt.Color(255, 255, 0));
        txtMonto_iva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PanelBlanco.add(txtMonto_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 190, 30));

        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosReporte.png"))); // NOI18N
        btnReport.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnReport.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosReporte2.png"))); // NOI18N
        btnReport.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosReporte.png"))); // NOI18N
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        PanelBlanco.add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, 40));

        PanelPrincipal.add(PanelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 480, 160));

        txtSerieInicial.setEditable(false);
        PanelPrincipal.add(txtSerieInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 90, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosLimpiar.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosLimpiar2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosLimpiar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 80, 30));

        txtNombresP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNombresP.setForeground(new java.awt.Color(0, 153, 204));
        txtNombresP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        txtNombresP.setEnabled(false);
        txtNombresP.setOpaque(false);
        PanelPrincipal.add(txtNombresP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 280, 30));

        txtDescripcionP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtDescripcionP.setForeground(new java.awt.Color(0, 153, 204));
        txtDescripcionP.setToolTipText("");
        txtDescripcionP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        txtDescripcionP.setEnabled(false);
        txtDescripcionP.setOpaque(false);
        PanelPrincipal.add(txtDescripcionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 280, 30));

        txtMontoP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtMontoP.setForeground(new java.awt.Color(0, 153, 204));
        txtMontoP.setToolTipText("");
        txtMontoP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        txtMontoP.setEnabled(false);
        txtMontoP.setOpaque(false);
        PanelPrincipal.add(txtMontoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 180, 30));

        btnBusca_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosClientes.png"))); // NOI18N
        btnBusca_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        btnBusca_cliente.setContentAreaFilled(false);
        btnBusca_cliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosClientes2.png"))); // NOI18N
        btnBusca_cliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagosClientes.png"))); // NOI18N
        btnBusca_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusca_clienteActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnBusca_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 50, 30));

        txtSaludo.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        txtSaludo.setForeground(new java.awt.Color(255, 255, 0));
        PanelPrincipal.add(txtSaludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 290, 40));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 935, 725));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCodigoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodigoPActionPerformed

        Control_pagos ADDMEN = null;

        addCodigo = new BuscarCodigo(ADDMEN, true);
        addCodigo.setVisible(true);
    }//GEN-LAST:event_btnCodigoPActionPerformed

    private void btnCalculadoraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculadoraPActionPerformed

        if (ingreCalculadora == null) {

            ingreCalculadora = new Calculadora();
            ingreCalculadora.setVisible(true);
        }
    }//GEN-LAST:event_btnCalculadoraPActionPerformed

    private void btnSalirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPActionPerformed
        if (TableCobrar_pagos.getRowCount() > 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Borrar los pagos Pendiente por cobrar",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        } else {
            Administracion.addPagos = null;
            Operaciones_Asistencia.ingrePagos = null;
            ListarPagos_pendientes.pagaDeuda = null;
            this.dispose();

        }
    }//GEN-LAST:event_btnSalirPActionPerformed

    private void txtCedulaPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaPKeyPressed

        /*   FUNCION  PARA  BUSCAR  EL  ATLETA  QUE VA HACER EL PAGO */
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!"".equals(txtCedulaP.getText())) {

                int cedula = (Integer.parseInt(txtCedulaP.getText()));

                AtletasDao atletasDAO = new AtletasDao();
                Atletas atletas = new Atletas();

                atletas = atletasDAO.buscarAtletas(cedula);

                if (atletas.getNombres() != null) {
                    txtNombresP.setText("" + atletas.getNombres());
                    txtIdAtletasP.setText("" + atletas.getIdatletas());
                    txtSaludo.setText("");
                    txtCodigoP.requestFocus();

                } else {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                    JOptionPane.showMessageDialog(this, "El Cliente no esta Registrado...Ingrese el Nuevo Cliente.",
                            "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                    txtCedulaP.setText("");
                    txtNombresP.setText("");

                }
            } else {
                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                JOptionPane.showMessageDialog(this, "Debe Ingresar el la cedula del Cliente",
                        "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));

            }
        }
    }//GEN-LAST:event_txtCedulaPKeyPressed

    private void txtCedulaPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaPKeyTyped

        char numero = evt.getKeyChar();

        if (Character.isLetter(numero)) {

            getToolkit().beep();
            evt.consume();

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Ingresar Solo Números...!!!",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));
        }
    }//GEN-LAST:event_txtCedulaPKeyTyped

    private void txtCodigoPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!"".equals(txtCodigoP.getText())) {
                String codpago = txtCodigoP.getText();
                PagosDao pagosDAO = new PagosDao();
                Pagos pagos = new Pagos();

                pagos = pagosDAO.buscarPagos_cobranza(codpago);

                if (pagos.getDescripcion() != null) {
                    txtIdPagosP.setText("" + pagos.getIdpago());
                    txtDescripcionP.setText("" + pagos.getDescripcion());
                    txtCantidadP.setText("");
                    txtMontoP.setText("" + pagos.getMonto());
                    txtDescuentoP.setText("" + 0);

                    txtCantidadP.requestFocus();

                } else {
                    txtIdPagosP.setText("");
                    txtDescripcionP.setText("");
                    txtCantidadP.setText("");
                    txtMontoP.setText("0.00");
                    txtMonto_totalP.setText("0.00");
                    txtDescuentoP.setText("0");
                    txtTotalCobrarP.setText("0.00");

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                    JOptionPane.showMessageDialog(this, "El Código Ingresado no Existe",
                            "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                    txtCodigoP.requestFocus();
                    txtCodigoP.setText("");
                }
            } else {

                txtCodigoP.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCodigoPKeyReleased

    private void txtCantidadPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadPKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            detallePago();
        }
    }//GEN-LAST:event_txtCantidadPKeyPressed

    private void txtCantidadPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadPKeyTyped

        char numero = evt.getKeyChar();

        if (Character.isLetter(numero)) {

            getToolkit().beep();
            evt.consume();

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Ingresar Solo Números...!!!",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));
        }
    }//GEN-LAST:event_txtCantidadPKeyTyped

    private void txtDescuentoPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoPKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            totalPago();
        }
    }//GEN-LAST:event_txtDescuentoPKeyPressed

    private void txtDescuentoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoPKeyTyped

        char numero = evt.getKeyChar();

        if (Character.isLetter(numero)) {

            getToolkit().beep();
            evt.consume();

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Ingresar Solo Números...!!!",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));
        }
    }//GEN-LAST:event_txtDescuentoPKeyTyped

    private void txtTotalCobrarPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalCobrarPKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCantidadP.getText()) && !"".equals(txtCodigoP.getText())) {

                String codpago = txtCodigoP.getText();
                String descripcion = txtDescripcionP.getText();
                int idpago = validaInt(txtIdPagosP.getText());
                int cantidad_dia = validaInt(txtCantidadP.getText());

                double monto = validaDouble(txtMontoP.getText());
                double monto_total = validaDouble(txtMonto_totalP.getText());
                double descuento = validaDouble(txtDescuentoP.getText());
                double total_cobro = validaDouble(txtTotalCobrarP.getText());

                item = item + 1;
                DefaultTableModel modelo = new DefaultTableModel();

                modelo = (DefaultTableModel) TableCobrar_pagos.getModel();
                for (int i = 0; i < TableCobrar_pagos.getRowCount(); i++) {
                    if (TableCobrar_pagos.getValueAt(i, 2).equals(txtDescripcionP.getText())) {

                        UI = null;
                        UIManager.put("OptionPane.background", new Color(255, 255, 255));
                        UIManager.put("Panel.background", new Color(255, 255, 255));
                        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                        JOptionPane.showMessageDialog(this, "El pago ya ha sido Agregado",
                                "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));
                        return;
                    }
                }

                ArrayList listaVenta = new ArrayList();
                listaVenta.add(item);
                listaVenta.add(idpago);
                listaVenta.add(codpago);
                listaVenta.add(descripcion);
                listaVenta.add(cantidad_dia);
                listaVenta.add(monto);
                listaVenta.add(monto_total);
                listaVenta.add(descuento);
                listaVenta.add(total_cobro);

                Object[] objPago = new Object[8];

                objPago[0] = listaVenta.get(1);
                objPago[1] = listaVenta.get(2);
                objPago[2] = listaVenta.get(3);
                objPago[3] = listaVenta.get(4);
                objPago[4] = listaVenta.get(5);
                objPago[5] = listaVenta.get(6);
                objPago[6] = listaVenta.get(7);
                objPago[7] = listaVenta.get(8);

                modelo.addRow(objPago);

                try {
                    procesarPago();
                } catch (SQLException ex) {
                    Logger.getLogger(Control_pagos.class.getName()).log(Level.SEVERE, null, ex);
                }
                limpiaVentas();

            } else {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                JOptionPane.showMessageDialog(this, "Ingrese la Cantidad o Código del producto ",
                        "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                if (txtCantidadP.getText().isEmpty()) {
                    txtCantidadP.requestFocus();
                } else if (txtCodigoP.getText().isEmpty()) {
                    txtCodigoP.requestFocus();
                } else {
                    // limpiaVentas ();
                }
            }
        }
    }//GEN-LAST:event_txtTotalCobrarPKeyPressed

    private void btnFacturaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaPActionPerformed

        if (Control_pagos.reportFactura != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Facturacion esta abierto",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (Administracion.abrirFactura != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Facturación se encuentra abierto en el Módulo de Administracion",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            reportFactura = new Factura_report();
            reportFactura.setVisible(true);
        }
    }//GEN-LAST:event_btnFacturaPActionPerformed

    private void btnAnularPagosPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularPagosPActionPerformed

        /*  FUNCION  PARA  ANULAR  LOS  PAGOS  DEL  DETALLE DE LA TABLA DE PAGOS */
        if (TableCobrar_pagos.getRowCount() > 0) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Anular todos los Pagos ..?",
                    "MODULO COBRANZA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/logoJR3.png", 90, 90));
            if (opcion == 0) {

                try {
                    anularItemPagos();
                    eliminarTodosPagos_del_detalle();
                } catch (SQLException ex) {
                    Logger.getLogger(Control_pagos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnAnularPagosPActionPerformed

    private void btnEliminarPagoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPagoPActionPerformed

        //  ELIMINAR  UN  PAGO  DEL  DETALLE  TEMPORAL
        if (this.TableCobrar_pagos.getSelectedRow() == -1) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Seleccione El Registros a Eliminar",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        } else if (TableCobrar_pagos.getRowCount() > 0) {

            eliminarPago_del_detalle();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) TableCobrar_pagos.getModel();
            modelo.removeRow(TableCobrar_pagos.getSelectedRow());
            try {
                delPago();
            } catch (SQLException ex) {
                Logger.getLogger(Control_pagos.class.getName()).log(Level.SEVERE, null, ex);
            }

            txtCodigoP.requestFocus();

            if (this.TableCobrar_pagos.getRowCount() == 0) {
                txtSubTotal_pagoP.setText("");
                txtTotalPago_generalP.setText("");
                txtMonto_iva.setText("");
                txtIva.setText("");

                txtCodigoP.requestFocus();
            }
        } else {

            txtCodigoP.requestFocus();

        }
    }//GEN-LAST:event_btnEliminarPagoPActionPerformed

    private void btnSupervisorPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupervisorPActionPerformed

        if (Login_activar == null) {

            Login_activar = new LoginActivar_ventas();
            Login_activar.setVisible(true);
        }
    }//GEN-LAST:event_btnSupervisorPActionPerformed

    private void btnProcesarVentaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarVentaPActionPerformed

        /*   FUNCION  PARA  GENERAR LA CANCELACION DEL PAGO*/
        if (txtIdAtletasP.getText().equals("")) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "ATENCION..! Ingrese la Cédula del Cliente que va a Cancelar el Pago",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));
            return;
        }
        if (TableCobrar_pagos.getRowCount() <= 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "ATENCION..! Ingrese el Código del Pago a Efectuar",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));
            txtCodigoP.requestFocus();

        } else {

            try {

                generarProcesoPago();
                limpiarItemTabla();
                generarSerie();
            } catch (SQLException ex) {
                Logger.getLogger(Control_pagos.class.getName()).log(Level.SEVERE, null, ex);
            }

            txtCedulaP.requestFocus();

        }

    }//GEN-LAST:event_btnProcesarVentaPActionPerformed

    private void btnCalculaCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaCambioActionPerformed

        PagoVenta pagoV = new PagoVenta(this, true);
        pagoV.setVisible(true);
    }//GEN-LAST:event_btnCalculaCambioActionPerformed

    private void btnAtletasPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtletasPActionPerformed

        Control_pagos ADDMEN = null;

        addAtletas = new BuscarAtletas(ADDMEN, true);
        addAtletas.setVisible(true);
    }//GEN-LAST:event_btnAtletasPActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        txtCedulaP.requestFocus();

        NumeroSerieDao nserieDao = new NumeroSerieDao();
        NumeroSerie_factura nserieFact = new NumeroSerie_factura();

        nserieFact = nserieDao.listarNumeroSerie();

        if (nserieFact.getSerie() > 0) {

            txtSerieInicial.setText("" + nserieFact.getSerie());

            txtSerieFinalP.setText("" + nserieFact.getSerieFinal());

            txtCodigoP.requestFocus();

        }
    }//GEN-LAST:event_formWindowOpened

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed

        FacturacionExcel.reporteFacturacion();
    }//GEN-LAST:event_btnReportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        limpiaVentas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBusca_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusca_clienteActionPerformed

        if (Control_pagos.agregaAtletas != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo Agregar Atletas esta abierto",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        

        } else if (Operaciones_Asistencia.searchAtletas != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo  ATLETAS se encuentra abierto en el Módulo de ASISTENCIAS",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {
            Control_pagos AGREGAATLETAS = null;
            agregaAtletas = new AgregarAtletas(AGREGAATLETAS, true);
            agregaAtletas.setVisible(true);
        }
    }//GEN-LAST:event_btnBusca_clienteActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Control_pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Control_pagos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLNombreUsuario;
    private javax.swing.JPanel PanelBlanco;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTable TableCobrar_pagos;
    public static javax.swing.JButton btnAnularPagosP;
    private javax.swing.JButton btnAtletasP;
    private javax.swing.JButton btnBusca_cliente;
    private javax.swing.JButton btnCalculaCambio;
    private javax.swing.JButton btnCalculadoraP;
    private javax.swing.JButton btnCodigoP;
    public static javax.swing.JButton btnEliminarPagoP;
    public static javax.swing.JButton btnFacturaP;
    private javax.swing.JButton btnProcesarVentaP;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSalirP;
    private javax.swing.JButton btnSupervisorP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtCantidadP;
    public static javax.swing.JTextField txtCedulaP;
    public static javax.swing.JTextField txtCodigoP;
    public static javax.swing.JTextField txtDescripcionP;
    private javax.swing.JTextField txtDescuentoP;
    public static javax.swing.JTextField txtIdAtletasP;
    public static javax.swing.JTextField txtIdPagosP;
    private javax.swing.JTextField txtIdUsuarioP;
    private javax.swing.JTextField txtIdusuario_cobrador;
    private javax.swing.JLabel txtIva;
    public static javax.swing.JTextField txtMontoP;
    private javax.swing.JLabel txtMonto_iva;
    private javax.swing.JLabel txtMonto_totalP;
    private javax.swing.JTextField txtNombreUsuarioP;
    public static javax.swing.JTextField txtNombresP;
    public static javax.swing.JLabel txtSaludo;
    private javax.swing.JTextField txtSerieFinalP;
    private javax.swing.JTextField txtSerieInicial;
    private javax.swing.JLabel txtSerieInicialP;
    private javax.swing.JLabel txtSubTotal_pagoP;
    private javax.swing.JTextField txtTokenP;
    public static javax.swing.JTextField txtTotal2;
    private javax.swing.JLabel txtTotalCobrarP;
    public static javax.swing.JLabel txtTotalPago_generalP;
    // End of variables declaration//GEN-END:variables

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
 /*   FUNCIONES  DE  VALIDACION*/
    public int validaInt(String number) {
        int result = 0; //Valor default.
        try {
            if (number != null) {
                result = Integer.parseInt(number);
            }
        } catch (NumberFormatException nfe) {
            //*No es numerico!
        }
        return result;
    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public double validaDouble(String number) {
        double result = 0; //Valor default.
        try {
            if (number != null) {
                result = Double.parseDouble(number);
            }
        } catch (NumberFormatException nfe) {
            //*No es numerico!
        }
        return result;
    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */

 /*   FUNCION  PARA  LIMPIAR  LOS  CAMPOS  DEL  DETALLE  DE  LOS PAGOS*/
    public void limpiaVentas() {

        txtCodigoP.setText("");
        txtDescripcionP.setText("");
        txtCantidadP.setText("");
        txtMontoP.setText("");
        txtTotalCobrarP.setText("");
        txtDescuentoP.setText("");
        txtMonto_totalP.setText("");

        txtCodigoP.requestFocus();
    }

    /*   FUNCION  PARA  CALCULAR  EL PROCESAMIENTO  DEL COBRO DE LA TARIFA A PAGAR   */
    public void procesarPago() throws SQLException {

        Connection conn = conexion.conectar();

        Detalle_temp detemp = new Detalle_temp();
        Detalle_tempDao detempDAO = new Detalle_tempDao();
        Pagos pagoIva = new Pagos();

        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = ("SELECT iva FROM pagos");

        ps = conn.prepareStatement(sql);

        rs = ps.executeQuery();
        while (rs.next()) {
            pagoIva.setIva(rs.getDouble("iva"));
        }
        String[] fila = new String[1];

        fila[0] = String.valueOf(pagoIva.getIva());

        txtIva.setText(fila[0]);

        subTotal = 0.00;
        total = 0.00;
        impuesto = 0.00;
        iva = 0.00;
        sinIva = 0.00;
        monto = 0.00;

        int numFila = TableCobrar_pagos.getRowCount();
        for (int i = 0; i < numFila; i++) {

            double total_cobro = validaDouble(String.valueOf(TableCobrar_pagos.getModel().getValueAt(i, 7)));
            monto = validaDouble(txtMontoP.getText());
            iva = validaDouble(txtIva.getText());
            subTotal = subTotal + total_cobro;
            total = total + total_cobro;
            impuesto = subTotal * (iva / 100);
            sinIva = subTotal - impuesto;
            total = sinIva + impuesto;
            txtSubTotal_pagoP.setText(String.format("%.2f", sinIva));
            txtMonto_iva.setText(String.format("%.2f", impuesto));
            txtTotalPago_generalP.setText(String.format("%.2f", total));
            txtTotal2.setText("" + total);
            String usuario_id = txtIdUsuarioP.getText();
            String token = hash.sha1(usuario_id);
            txtTokenP.setText("" + token);
            txtTotalPago_generalP.setBackground(new Color(255, 255, 0));

        }
        detemp.setIdpago(validaInt(txtIdPagosP.getText()));
        detemp.setCantidad_dia(validaInt(txtCantidadP.getText()));
        detemp.setToken_user(txtTokenP.getText());
        detemp.setDescuento(validaDouble(txtDescuentoP.getText()));

        if (detempDAO.calcularPAgos(detemp)) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Pago Agregado",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        }
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
 /*   FUNCION  PARA  CALCULAR  EL  MONTO  DE LA COBRANZA  PARA  AGREGARLO  AL DETALLE */
    public void detallePago() {
        if (txtCantidadP.getText().equals("")) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Colocar la Cantidad de dias a pagar ",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            txtCantidadP.requestFocus();

        } else {
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            double monto = validaDouble(txtMontoP.getText());
            int cantidad = validaInt(txtCantidadP.getText());
            double costoPago = monto * cantidad;
            txtMonto_totalP.setText("" + costoPago);
            txtDescuentoP.requestFocus();
        }
    }

    /*   FUNCION  PARA CALCULAR EL  MONTO  TOTAL    PARA  AGREGARLO  AL  DETALLE*/
    public void totalPago() {
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        double monto = validaDouble(txtMontoP.getText());
        int cantidad = validaInt(txtCantidadP.getText());
        double costoCobro = monto * cantidad;
        double descuento = validaDouble(txtDescuentoP.getText());
        double cobroTotal = costoCobro - descuento;

        txtTotalCobrarP.setText("" + cobroTotal);

        txtTotalCobrarP.requestFocus();
    }

    /*  FUNCION  PARA  ELIMINAR  UN  PRODUCTO  DE  LA  VENTA */
    public void eliminarPago_del_detalle() {

        Connection conn = conexion.conectar();

        int fila = TableCobrar_pagos.getSelectedRow();
        String valor = TableCobrar_pagos.getValueAt(fila, 0).toString();

        try {

            PreparedStatement ps = conn.prepareStatement("DELETE FROM detalle_temp WHERE idpago = '" + valor + "'");
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Control_pagos.class.getName()).log(Level.SEVERE, null, ex);

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No se pudo Eliminar El ",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
        }
    }

    /*   FUNCION  PARA  ELIMINAR  EL  CAMPO  DEL  DETALLE DE LA TABLA DE PAGOS*/
    public void delPago() throws SQLException {

        Connection conn = conexion.conectar();

        subTotal = 0.00;
        total = 0.00;
        impuesto = 0.00;
        monto = 0.00;
        int numFila = TableCobrar_pagos.getRowCount();
        for (int i = 0; i < numFila; i++) {

            double pagoTotal = validaDouble(String.valueOf(TableCobrar_pagos.getModel().getValueAt(i, 7)));
            monto = validaDouble(txtMontoP.getText());
            subTotal = subTotal + pagoTotal;
            total = total + pagoTotal;
            txtSubTotal_pagoP.setText(String.format("%.2f", subTotal));
            txtTotalPago_generalP.setText(String.format("%.2f", total));

            String usuario_id = txtIdUsuarioP.getText();
            String token = hash.sha1(usuario_id);
            txtTokenP.setText("" + token);

        }
    }

    /*  FUNCION  PARA -- BORRAR  TODOS  LOS ITEM  DE  LOS PAGOS  -- */
    public void anularItemPagos() throws SQLException {

        if (TableCobrar_pagos.getRowCount() > 0) {
            DefaultTableModel modelo = new DefaultTableModel(0, TableCobrar_pagos.getColumnCount());
            TableCobrar_pagos.setModel(modelo);

            modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("COD");
            modelo.addColumn("DESCRIPCION");
            modelo.addColumn("CANT. DIAS");
            modelo.addColumn("MONTO");
            modelo.addColumn("MONTO TOTAL");
            modelo.addColumn("DESCUENTO");
            modelo.addColumn("TOTAL");
            TableCobrar_pagos.setModel(modelo);
            TableCobrar_pagos.getColumnModel().getColumn(0).setMaxWidth(40);
            TableCobrar_pagos.getColumnModel().getColumn(0).setPreferredWidth(40);
            TableCobrar_pagos.getColumnModel().getColumn(1).setMaxWidth(100);
            TableCobrar_pagos.getColumnModel().getColumn(1).setPreferredWidth(100);
            TableCobrar_pagos.getColumnModel().getColumn(2).setMaxWidth(350);
            TableCobrar_pagos.getColumnModel().getColumn(2).setPreferredWidth(350);
            TableCobrar_pagos.getColumnModel().getColumn(3).setMaxWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(3).setPreferredWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(4).setMaxWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(4).setPreferredWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(5).setMaxWidth(100);
            TableCobrar_pagos.getColumnModel().getColumn(5).setPreferredWidth(100);
            TableCobrar_pagos.getColumnModel().getColumn(6).setMaxWidth(110);
            TableCobrar_pagos.getColumnModel().getColumn(6).setPreferredWidth(110);
            TableCobrar_pagos.getColumnModel().getColumn(7).setMaxWidth(110);
            TableCobrar_pagos.getColumnModel().getColumn(7).setPreferredWidth(110);

            txtSubTotal_pagoP.setText("");
            txtTotalPago_generalP.setText("");
            txtIdPagosP.setText("");
            txtCedulaP.setText("");
            txtNombresP.setText("");
            txtIdAtletasP.setText("");
            txtNombreUsuarioP.setText("");
            txtIva.setText("");
            txtMonto_iva.setText("");

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Usted ha Anulado este pago....!!!!",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            txtCodigoP.requestFocus();

        } else {
            txtCodigoP.requestFocus();

        }
    }

    /*   FUNCION  PARA  ELIMINAR  LOS  CAMPOS  DEL  DETALLE  TEMPORAL DE LA TABLA --*/
    public void eliminarTodosPagos_del_detalle() {

        Connection conn = conexion.conectar();

        int fila = TableCobrar_pagos.getSelectedRow();
        String usuario_id = txtIdUsuarioP.getText();
        String token = hash.sha1(usuario_id);
        txtTokenP.setText("" + token);

        String valor = txtTokenP.getText();
        txtTokenP.setText(valor);

        try {

            PreparedStatement ps = conn.prepareStatement("DELETE  FROM detalle_temp WHERE token_user = '" + valor + "'");
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Control_pagos.class.getName()).log(Level.SEVERE, null, ex);

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No se pudo Eliminar El Pago",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
        }
    }

    /*   FUNCION  PARA  GENERAR EL PAGO*/
    public void generarProcesoPago() throws SQLException {

        Facturas facturas = new Facturas();
        FacturaDao facturaDAO = new FacturaDao();

        try {

            facturas.setUsuario(Integer.parseInt(txtIdUsuarioP.getText()));
            facturas.setIdatletas(Integer.parseInt(txtIdAtletasP.getText()));
            facturas.setToken_user(txtTokenP.getText());
            facturas.setNombre_usuario(txtNombreUsuarioP.getText());
            facturas.setNoserie(txtSerieInicialP.getText());

            if (facturaDAO.generaTotalpagos(facturas)) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                JOptionPane.showMessageDialog(this, "Pago Realizado con Exito",
                        "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                limpiarItemTabla();
            }

        } catch (Exception ex) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Error al Guardar los Datos",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            Logger.getLogger(Control_pagos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*   FUNCION  PARA  LIMPIAR  LAS FILAS DE LA TABLA COBRAR PAGOS  */
    public void limpiarItemTabla() throws SQLException {

        DefaultTableModel modelo = new DefaultTableModel(0, TableCobrar_pagos.getColumnCount());
        if (TableCobrar_pagos.getRowCount() > 0) {

            TableCobrar_pagos.setModel(modelo);
        }

        if (TableCobrar_pagos.getRowCount() <= 0) {

            modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("COD");
            modelo.addColumn("DESCRIPCION");
            modelo.addColumn("CANT.DIAS");
            modelo.addColumn("MONTO");
            modelo.addColumn("MONTO TOTAL");
            modelo.addColumn("DESCUENTO");
            modelo.addColumn("TOTAL");
            TableCobrar_pagos.setModel(modelo);
            TableCobrar_pagos.getColumnModel().getColumn(0).setMaxWidth(40);
            TableCobrar_pagos.getColumnModel().getColumn(0).setPreferredWidth(40);
            TableCobrar_pagos.getColumnModel().getColumn(1).setMaxWidth(100);
            TableCobrar_pagos.getColumnModel().getColumn(1).setPreferredWidth(100);
            TableCobrar_pagos.getColumnModel().getColumn(2).setMaxWidth(350);
            TableCobrar_pagos.getColumnModel().getColumn(2).setPreferredWidth(350);
            TableCobrar_pagos.getColumnModel().getColumn(3).setMaxWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(3).setPreferredWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(4).setMaxWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(4).setPreferredWidth(90);
            TableCobrar_pagos.getColumnModel().getColumn(5).setMaxWidth(100);
            TableCobrar_pagos.getColumnModel().getColumn(5).setPreferredWidth(100);
            TableCobrar_pagos.getColumnModel().getColumn(6).setMaxWidth(110);
            TableCobrar_pagos.getColumnModel().getColumn(6).setPreferredWidth(110);
            TableCobrar_pagos.getColumnModel().getColumn(7).setMaxWidth(110);
            TableCobrar_pagos.getColumnModel().getColumn(7).setPreferredWidth(110);

            txtSubTotal_pagoP.setText("");
            txtTotalPago_generalP.setText("");
            txtTotalPago_generalP.setBackground(new Color(25, 25, 112));
            txtSaludo.setText("GRACIAS POR SU PAGO...!!!");
            txtIdPagosP.setText("");
            txtIva.setText("");
            txtMonto_iva.setText("");
            txtCedulaP.setText("");
            txtNombresP.setText("");
            txtIdAtletasP.setText("");
            txtSerieInicialP.setText("");

            txtCodigoP.requestFocus();

        }

        UI = null;
        UIManager.put("OptionPane.background", new Color(255, 255, 255));
        UIManager.put("Panel.background", new Color(255, 255, 255));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
        UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
        JOptionPane.showMessageDialog(this, "Pago Registrado con Exito",
                "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

    }

    // FUNCION  PARA  GENERAR  UN  NUMERO  DE   SERIE  PARA  LA  FACTURAS
    public void generarSerie() {

        NumeroSerieDao generaserieDAO = new NumeroSerieDao();
        String serie = generaserieDAO.NroSeriePagos();
        String serieFinal = generaserieDAO.NroSerieFinal();

        if (serie == null) {

            txtSerieInicialP.setText("000001");
        } else if (!serie.equals(serieFinal)) {

            int increment = Integer.parseInt(serie);
            increment = increment + 1;
            txtSerieInicialP.setText("" + increment);

        } else {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Ingresar un Nuevo Serial para las Facturas",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            txtCodigoP.setEnabled(false);
            txtCedulaP.setEnabled(false);
            txtCantidadP.setEnabled(false);
            txtDescuentoP.setEnabled(false);

            btnCodigoP.setEnabled(false);
            btnCalculadoraP.setEnabled(false);
            btnAtletasP.setEnabled(false);

        }

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
