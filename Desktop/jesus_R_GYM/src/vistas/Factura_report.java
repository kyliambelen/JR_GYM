package vistas;

import bd.Conexion;
import dao.AtletasDao;

import dao.FacturaDao;
import dao.NumeroSerieDao;
import entidades.Atletas;
import entidades.Facturas;

import entidades.NumeroSerie_factura;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.plaf.FontUIResource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static vistas.Factura_report.buscaFactura;

public class Factura_report extends javax.swing.JFrame {

    UIManager UI;
    private final Conexion conexion = new Conexion();
    public static BuscarFacturas buscaFactura;
    public static ReporteFacturas_fecha buscaFactura_diaria;
    public static FacturasNulas abreFact;
    Reportes mireportFactura = new Reportes();
            

    public Factura_report() {
        initComponents();
        setIconImage(getIconImage());
        this.setTitle("Reportes");
        llenarCBox_SerieInicio();
        llenarCBox_SerieFinal();
    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void llenarCBox_SerieInicio() {
        try {
            Connection conn = conexion.conectar();
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT inicio FROM  vista_max_numero_serie";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                JCBoxSerieInicio.addItem(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Factura_report.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void llenarCBox_SerieFinal() {
        try {
            Connection conn = conexion.conectar();
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT  final FROM  vista_max_numero_serie";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                JCBoxSerieFinal.addItem(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Factura_report.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSerialActual = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSerieInicio = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSerieFinal = new javax.swing.JLabel();
        btnReportF_A = new javax.swing.JButton();
        btnSalirR = new javax.swing.JButton();
        btnAnularFacturaF = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnRestaurar_factura = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        JCBoxSerieFinal = new javax.swing.JComboBox<>();
        JCBoxSerieInicio = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JCBoxEstatus = new javax.swing.JComboBox<>();
        JCBoxPago = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtTotalLetras = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCodFactura = new javax.swing.JTextField();
        txtFechaVenci = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btnBuscaFactura = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        txtNofacturaF = new javax.swing.JLabel();
        txtDniF = new javax.swing.JLabel();
        txtCodF = new javax.swing.JLabel();
        txtNombreF = new javax.swing.JLabel();
        txtFechaF = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtMontoFacturaF = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtEstatusF = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccionF = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btnFacturacion_report = new javax.swing.JButton();
        btnFactura_diaria = new javax.swing.JButton();
        btnFactura_mensual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(88, 172, 250));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MODULO  FACTURACION");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 380, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("SERIAL SIGUIENTE :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 25));

        txtSerialActual.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtSerialActual.setForeground(new java.awt.Color(204, 0, 0));
        txtSerialActual.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txtSerialActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 110, 25));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("SERIE  ACTUAL");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 25));

        txtSerieInicio.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtSerieInicio.setForeground(new java.awt.Color(0, 0, 51));
        txtSerieInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txtSerieInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 90, 25));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("AL");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, 25));

        txtSerieFinal.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtSerieFinal.setForeground(new java.awt.Color(0, 0, 51));
        txtSerieFinal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txtSerieFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 100, 25));

        btnReportF_A.setBackground(new java.awt.Color(0, 0, 0));
        btnReportF_A.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        btnReportF_A.setForeground(new java.awt.Color(255, 255, 255));
        btnReportF_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaFacturar2.png"))); // NOI18N
        btnReportF_A.setToolTipText("Imprimir Facturas");
        btnReportF_A.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        btnReportF_A.setBorderPainted(false);
        btnReportF_A.setContentAreaFilled(false);
        btnReportF_A.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaFacturar.png"))); // NOI18N
        btnReportF_A.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaFacturar2.png"))); // NOI18N
        btnReportF_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportF_AMouseClicked(evt);
            }
        });
        btnReportF_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportF_AActionPerformed(evt);
            }
        });
        jPanel2.add(btnReportF_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 70, 50));

        btnSalirR.setBackground(new java.awt.Color(0, 0, 102));
        btnSalirR.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnSalirR.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaSalir.png"))); // NOI18N
        btnSalirR.setToolTipText("Cerrar Ventana");
        btnSalirR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        btnSalirR.setContentAreaFilled(false);
        btnSalirR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaSalir3.png"))); // NOI18N
        btnSalirR.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaSalir.png"))); // NOI18N
        btnSalirR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalirR, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 70, 50));

        btnAnularFacturaF.setBackground(new java.awt.Color(0, 153, 0));
        btnAnularFacturaF.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnAnularFacturaF.setForeground(new java.awt.Color(255, 255, 255));
        btnAnularFacturaF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaAnular.png"))); // NOI18N
        btnAnularFacturaF.setToolTipText("Anular Factura");
        btnAnularFacturaF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        btnAnularFacturaF.setContentAreaFilled(false);
        btnAnularFacturaF.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaAnular2.png"))); // NOI18N
        btnAnularFacturaF.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaAnular.png"))); // NOI18N
        btnAnularFacturaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularFacturaFActionPerformed(evt);
            }
        });
        jPanel2.add(btnAnularFacturaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 70, 50));

        jLabel25.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 153, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("IMPRIMIR FACTURAS");
        jLabel25.setAutoscrolls(true);
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 190, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jSeparator3.setOpaque(true);
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 100, 2));

        btnRestaurar_factura.setBackground(new java.awt.Color(255, 255, 255));
        btnRestaurar_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaRestaurar.png"))); // NOI18N
        btnRestaurar_factura.setToolTipText("Restaurar Factura Anulada");
        btnRestaurar_factura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        btnRestaurar_factura.setContentAreaFilled(false);
        btnRestaurar_factura.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaRestaurar2.png"))); // NOI18N
        btnRestaurar_factura.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaRestaurar.png"))); // NOI18N
        btnRestaurar_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurar_facturaActionPerformed(evt);
            }
        });
        jPanel2.add(btnRestaurar_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 70, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 800, 150));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(255, 255, 255), null, null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JCBoxSerieFinal.setEditable(true);
        JCBoxSerieFinal.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        JCBoxSerieFinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(JCBoxSerieFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 220, 32));

        JCBoxSerieInicio.setEditable(true);
        JCBoxSerieInicio.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        JCBoxSerieInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(JCBoxSerieInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 220, 32));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("SERIAL INICIO");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 140, 30));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("SON:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 140, 30));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Nro. FACTURA");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 140, 30));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("TIPO FACTURA");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, 30));

        JCBoxEstatus.setEditable(true);
        JCBoxEstatus.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        JCBoxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "ORIGINAL", "COPIA" }));
        JCBoxEstatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(JCBoxEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 220, 32));

        JCBoxPago.setEditable(true);
        JCBoxPago.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        JCBoxPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Efectivo", "Cuenta Corriente", "Tarjeta de debito", "Tarjeta de Credito", "Cheque", "Transferencia Bancaria", "Mercado Pago", "Sin Detallar", "Otro" }));
        JCBoxPago.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(JCBoxPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 220, 32));

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("TIPO PAGO");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 30));

        txtTotalLetras.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtTotalLetras.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jPanel3.add(txtTotalLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 600, 32));

        jLabel23.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("F. VENCIMIENTO");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 140, 30));

        txtCodFactura.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtCodFactura.setToolTipText("<html>\n<p style=\"color:blue\">Presione <span style=\"color:red\" >\"ENTER\"</span> para cargar la Factura</p>\n</html>");
        txtCodFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        txtCodFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodFacturaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodFacturaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodFacturaKeyTyped(evt);
            }
        });
        jPanel3.add(txtCodFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 178, 32));

        txtFechaVenci.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtFechaVenci.setToolTipText("");
        txtFechaVenci.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jPanel3.add(txtFechaVenci, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 220, 30));

        jLabel24.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("SERIAL FINAL");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 140, 30));

        btnBuscaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturasBuscar.png"))); // NOI18N
        btnBuscaFactura.setToolTipText("<html>\n<p style=\"color:#DF0101\">Buscar Facturas</p>\n\n</html>");
        btnBuscaFactura.setAutoscrolls(true);
        btnBuscaFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        btnBuscaFactura.setContentAreaFilled(false);
        btnBuscaFactura.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturasBurcar2.png"))); // NOI18N
        btnBuscaFactura.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturasBuscar.png"))); // NOI18N
        btnBuscaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaFacturaActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 40, 32));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 800, 270));

        jSeparator2.setBackground(new java.awt.Color(88, 172, 250));
        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 153, 204), null, null));
        jSeparator2.setOpaque(true);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 60));

        jPanel4.setBackground(new java.awt.Color(239, 245, 251));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNofacturaF.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtNofacturaF.setForeground(new java.awt.Color(255, 0, 51));
        txtNofacturaF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNofacturaF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));
        jPanel4.add(txtNofacturaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 30));

        txtDniF.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtDniF.setForeground(new java.awt.Color(255, 0, 51));
        txtDniF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDniF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));
        jPanel4.add(txtDniF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 180, 30));

        txtCodF.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtCodF.setForeground(new java.awt.Color(255, 0, 51));
        txtCodF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCodF.setText("    ");
        txtCodF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));
        jPanel4.add(txtCodF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, 30));

        txtNombreF.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtNombreF.setForeground(new java.awt.Color(255, 0, 51));
        txtNombreF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));
        jPanel4.add(txtNombreF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 310, 30));

        txtFechaF.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtFechaF.setForeground(new java.awt.Color(255, 0, 51));
        txtFechaF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFechaF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));
        jPanel4.add(txtFechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 100, 30));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Estatus");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 60, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("N°");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Fecha Factura");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 30));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("Cedula");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, 20));

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 102));
        jLabel19.setText("Nombre o Razón Social");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 102));
        jLabel20.setText("Cod Cliente");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 30));

        txtMontoFacturaF.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txtMontoFacturaF.setForeground(new java.awt.Color(0, 153, 255));
        txtMontoFacturaF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMontoFacturaF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));
        jPanel4.add(txtMontoFacturaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 150, 30));

        jLabel22.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 102));
        jLabel22.setText("Dirección");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, -1));

        txtEstatusF.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txtEstatusF.setForeground(new java.awt.Color(0, 153, 255));
        txtEstatusF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEstatusF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));
        jPanel4.add(txtEstatusF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 150, 30));

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 102));
        jLabel21.setText("Monto ");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 60, -1));

        txtDireccionF.setEditable(false);
        txtDireccionF.setBackground(new java.awt.Color(240, 240, 240));
        txtDireccionF.setColumns(20);
        txtDireccionF.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtDireccionF.setForeground(new java.awt.Color(0, 0, 153));
        txtDireccionF.setRows(5);
        txtDireccionF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        txtDireccionF.setCaretColor(new java.awt.Color(0, 0, 51));
        txtDireccionF.setDisabledTextColor(new java.awt.Color(0, 0, 51));
        txtDireccionF.setOpaque(false);
        jScrollPane1.setViewportView(txtDireccionF);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 380, 80));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 420, 430));

        jPanel5.setBackground(new java.awt.Color(230, 230, 230));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFacturacion_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaReporte.png"))); // NOI18N
        btnFacturacion_report.setToolTipText("");
        btnFacturacion_report.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        btnFacturacion_report.setContentAreaFilled(false);
        btnFacturacion_report.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaReporte2.png"))); // NOI18N
        btnFacturacion_report.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaReporte.png"))); // NOI18N
        btnFacturacion_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturacion_reportActionPerformed(evt);
            }
        });
        jPanel5.add(btnFacturacion_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, 190, 30));

        btnFactura_diaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaDiaria.png"))); // NOI18N
        btnFactura_diaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        btnFactura_diaria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaDiaria2.png"))); // NOI18N
        btnFactura_diaria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaDiaria.png"))); // NOI18N
        btnFactura_diaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactura_diariaActionPerformed(evt);
            }
        });
        jPanel5.add(btnFactura_diaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 8, 190, 30));

        btnFactura_mensual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaMensual.png"))); // NOI18N
        btnFactura_mensual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        btnFactura_mensual.setContentAreaFilled(false);
        btnFactura_mensual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaMensual2.png"))); // NOI18N
        btnFactura_mensual.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturaMensual.png"))); // NOI18N
        btnFactura_mensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactura_mensualActionPerformed(evt);
            }
        });
        jPanel5.add(btnFactura_mensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 8, 190, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 538, 790, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRActionPerformed

        Administracion.abrirFactura = null;
        Control_pagos.reportFactura = null;
        this.dispose();

    }//GEN-LAST:event_btnSalirRActionPerformed

    private void btnReportF_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportF_AActionPerformed
        mostrarFactura();
        limpiarFacturaReport();

    }//GEN-LAST:event_btnReportF_AActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        generarSerieActual();
        generarNumerosSeries();
    }//GEN-LAST:event_formWindowOpened

    private void btnReportF_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportF_AMouseClicked

    }//GEN-LAST:event_btnReportF_AMouseClicked

    private void txtCodFacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodFacturaKeyPressed

        /* if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        
        cargarFactura();
        
        }*/

    }//GEN-LAST:event_txtCodFacturaKeyPressed

    private void txtCodFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodFacturaKeyTyped

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
                    "Facturas", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 60, 60));
        }
    }//GEN-LAST:event_txtCodFacturaKeyTyped

    private void btnAnularFacturaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularFacturaFActionPerformed
        if (txtCodFactura.getText().isEmpty()) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Ingrese El Numero de La Factura",
                    "Facturas", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

        } else {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Anular Esta Factura..?",
                    "Facturas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

            if (opcion == 0) {

                try {
                    anularFactura();
                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                    JOptionPane.showMessageDialog(this, "factura Anulada con Exito",
                            "Facturas", JOptionPane.INFORMATION_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

                    limpiarFacturaReport();
                    txtCodFactura.requestFocus();
                } catch (SQLException ex) {
                    Logger.getLogger(Factura_report.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnAnularFacturaFActionPerformed

    private void btnBuscaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaFacturaActionPerformed

        Factura_report REFA = null;

        buscaFactura = new BuscarFacturas(REFA, true);
        buscaFactura.setVisible(true);


    }//GEN-LAST:event_btnBuscaFacturaActionPerformed

    private void txtCodFacturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodFacturaKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            // cargarFactura();
            String nofactura = (txtCodFactura.getText());
            FacturaDao facturaDao = new FacturaDao();
            Facturas facturas = new Facturas();
            AtletasDao atletasDAO = new AtletasDao();
            Atletas atletas = new Atletas();

            facturas = facturaDao.buscarFactura(nofactura);

            if (txtCodFactura.getText().equals("")) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                JOptionPane.showMessageDialog(this, "Lo Siento....Debe Introducir Un Numero de Factura",
                        "Facturas", JOptionPane.INFORMATION_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

                limpiarFacturaReport();
                return;
            }

            if (facturas.getNofactura() <= 0) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                JOptionPane.showMessageDialog(this, "La Factura que intenta imprimir no Existe",
                        "Facturas", JOptionPane.INFORMATION_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

                limpiarFacturaReport();
                return;
            }

            if (facturas.getNofactura() > 0) {

                txtNofacturaF.setText("" + facturas.getNofactura());
                txtFechaF.setText("" + facturas.getFecha());
                txtMontoFacturaF.setText("" + facturas.getTotalPago());
                txtEstatusF.setText("" + facturas.getEstatus());

                atletas = atletasDAO.ubicaAtletas(nofactura);

                txtCodF.setText("" + atletas.getIdatletas());
                txtDniF.setText("" + atletas.getCedula());
                txtNombreF.setText("" + atletas.getNombres());
                txtDireccionF.setText("" + atletas.getDireccion());

                txtNofacturaF.requestFocus();
                txtTotalLetras.setText("");

            } else {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                JOptionPane.showMessageDialog(this, "El N° de la Factura no esta Registrado... introduzca un Número de Factura Existente",
                        "Facturas", JOptionPane.INFORMATION_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

            }
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Verifique que el Serial de Inicio y final sean los Correctos",
                    "Facturas", JOptionPane.INFORMATION_MESSAGE, icono("/img/panelfacturas.png", 60, 60));
        }
    }//GEN-LAST:event_txtCodFacturaKeyReleased

    private void btnFactura_diariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactura_diariaActionPerformed

        if (buscaFactura_diaria == null) {

            buscaFactura_diaria = new ReporteFacturas_fecha();
            buscaFactura_diaria.setVisible(true);
        }

    }//GEN-LAST:event_btnFactura_diariaActionPerformed

    private void btnFactura_mensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactura_mensualActionPerformed
        
      mireportFactura.reportFacturacionPor_mes();
    }//GEN-LAST:event_btnFactura_mensualActionPerformed

    private void btnRestaurar_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurar_facturaActionPerformed
        
        if (abreFact != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo RESTAURAR FACTURAS se encuentra abierto",
                    "FACTURAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {
           

                abreFact = new FacturasNulas();
                abreFact.setVisible(true);
            
        }
    }//GEN-LAST:event_btnRestaurar_facturaActionPerformed

    private void btnFacturacion_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturacion_reportActionPerformed
        
        mireportFactura.reportFactura_general();
    }//GEN-LAST:event_btnFacturacion_reportActionPerformed

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
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
            java.util.logging.Logger.getLogger(Factura_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBoxEstatus;
    private javax.swing.JComboBox<String> JCBoxPago;
    private javax.swing.JComboBox<String> JCBoxSerieFinal;
    private javax.swing.JComboBox<String> JCBoxSerieInicio;
    private javax.swing.JButton btnAnularFacturaF;
    private javax.swing.JButton btnBuscaFactura;
    private javax.swing.JButton btnFactura_diaria;
    private javax.swing.JButton btnFactura_mensual;
    private javax.swing.JButton btnFacturacion_report;
    private javax.swing.JButton btnReportF_A;
    private javax.swing.JButton btnRestaurar_factura;
    private javax.swing.JButton btnSalirR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel txtCodF;
    public static javax.swing.JTextField txtCodFactura;
    private javax.swing.JTextArea txtDireccionF;
    private javax.swing.JLabel txtDniF;
    private javax.swing.JLabel txtEstatusF;
    private javax.swing.JLabel txtFechaF;
    private javax.swing.JTextField txtFechaVenci;
    private javax.swing.JLabel txtMontoFacturaF;
    private javax.swing.JLabel txtNofacturaF;
    private javax.swing.JLabel txtNombreF;
    private javax.swing.JLabel txtSerialActual;
    private javax.swing.JLabel txtSerieFinal;
    private javax.swing.JLabel txtSerieInicio;
    private javax.swing.JTextField txtTotalLetras;
    // End of variables declaration//GEN-END:variables

    /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void generarSerieActual() {

        NumeroSerieDao generaserieDAO = new NumeroSerieDao();
        String serie = generaserieDAO.NroSerieVentas();

        int increment = Integer.parseInt(serie);
        increment = increment + 1;
        txtSerialActual.setText("000000" + increment);

    }


    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void generarNumerosSeries() {
        NumeroSerieDao nserieDao = new NumeroSerieDao();
        NumeroSerie_factura nserieFact = new NumeroSerie_factura();

        nserieFact = nserieDao.listarNumeroSerie();

        if (nserieFact.getSerieInicio() > 0) {

            txtSerieInicio.setText("0000" + nserieFact.getSerieInicio());
            txtSerieFinal. setText("0000" + nserieFact.getSerieFinal());

        }
    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void cargarFactura() {

        String nofactura = (txtCodFactura.getText());
        FacturaDao facturaDao = new FacturaDao();
        Facturas facturas = new Facturas();
        AtletasDao atletasDAO = new AtletasDao();
        Atletas atletas = new Atletas();

        facturas = facturaDao.buscarFactura(nofactura);

        if (facturas.getEstatus() != 1) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "La Factura que intenta imprimir está ANULADA",
                    "Facturas", JOptionPane.INFORMATION_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

            return;
        }

        if (facturas.getNofactura() > 0) {

            txtNofacturaF.setText("" + facturas.getNofactura());
            txtFechaF.setText("" + facturas.getFecha());
            txtMontoFacturaF.setText("" + facturas.getTotalPago());
            txtEstatusF.setText("" + facturas.getEstatus());

            atletas = atletasDAO.ubicaAtletas(nofactura);

            txtCodF.setText("" + atletas.getIdatletas());
            txtDniF.setText("" + atletas.getCedula());
            txtNombreF.setText("" + atletas.getNombres());
            txtDireccionF.setText("" + atletas.getDireccion());

            txtNofacturaF.requestFocus();
            txtTotalLetras.setText("");

        } else {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El N° de la Factura no esta Registrado... introduzca un Número de Factura Existente",
                    "Facturas", JOptionPane.INFORMATION_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

        }
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void limpiarFacturaReport() {

        txtNofacturaF.setText("");
        txtFechaF.setText("");
        txtMontoFacturaF.setText("");
        txtEstatusF.setText("");
        txtCodF.setText("");
        txtDniF.setText("");
        txtNombreF.setText("");
        txtDireccionF.setText("");
        txtTotalLetras.setText("");

    }

    public void limpiarCamposFactura() {

        txtCodFactura.setText("");
        JCBoxPago.setSelectedIndex(0);
        JCBoxEstatus.setSelectedIndex(0);
        JCBoxSerieInicio.setSelectedIndex(0);
        JCBoxSerieFinal.setSelectedIndex(0);
        txtFechaVenci.setText("");
        txtTotalLetras.setText("");

    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void anularFactura() throws SQLException {

        //int nofactura = Integer.parseInt (txtCodFactura.getText ());
        FacturaDao facturaDao = new FacturaDao();
        Facturas factura = new Facturas();

        factura.setNofactura(Integer.parseInt(txtCodFactura.getText()));
        if (facturaDao.anulaFacturas(factura)) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "factura Anulada con Exito",
                    "Facturas", JOptionPane.INFORMATION_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

            txtNofacturaF.requestFocus();
        }

    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    Facturas factura = new Facturas();
    NumeroSerie_factura nserie = new NumeroSerie_factura();

    public void mostrarFactura() {
        if (txtCodFactura.getText().isEmpty() || txtFechaVenci.getText().isEmpty() || txtTotalLetras.getText().isEmpty()) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Ingrese El Numero de La Factura, la fecha de Vencimiento y el Monto en Letras de la factura",
                    "FACTURA", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

        } else {
            try {

                String opcion = JCBoxPago.getSelectedItem().toString();
                if (opcion.equals("Seleccione")) {
                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                    JOptionPane.showMessageDialog(this, "Debe Seleccionar El Tipo de Pago a Realizar ",
                            "FACTURA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                    return;
                }
                opcion = JCBoxEstatus.getSelectedItem().toString();
                if (opcion.equals("Seleccione")) {
                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                    JOptionPane.showMessageDialog(this, " Seleccione El Tipo de Factura a Imprimir ",
                            "FACTURA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                    return;
                }

               
                Connection conn = conexion.conectar();
                JasperReport reporte = null;
                //String path = "src\\reportes\\reportFactura.jasper";
                Map parametro = new HashMap();

                parametro.put("nroFactura", txtNofacturaF.getText());
                parametro.put("serieInicio", JCBoxSerieInicio.getSelectedItem());
                parametro.put("serieFinal", JCBoxSerieFinal.getSelectedItem());
                parametro.put("tipoFactura", JCBoxEstatus.getSelectedItem());
                parametro.put("formaPago", JCBoxPago.getSelectedItem());
                parametro.put("fechaVenci", txtFechaVenci.getText());
                parametro.put("cantidadLetra", txtTotalLetras.getText());
                parametro.put("img_banner", Factura_report.class.getResource("/reportes/bannerGym_factura2.jpg"));
                parametro.put("img_piePagina", Factura_report.class.getResource("/reportes/img_piePagina.jpg"));
                parametro.put("img_barraDescripcion", Factura_report.class.getResource("/reportes/img_descripcion2.jpg"));

                //reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportFactura.jasper"));
                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                view.setVisible(true);
                view.setTitle("Factura");
            } catch (JRException e) {
            }
            limpiarCamposFactura();
            txtNofacturaF.requestFocus();
        }

    }



    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
   
    
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
