package vistas;

import Excel_reportes.AsistenciasExcel;
import Excel_reportes.AtletasExcel;
import Excel_reportes.FacturaDetallada;
import Excel_reportes.FacturacionExcel;
import Excel_reportes.MensualidadExcel;
import Excel_reportes.RutinasExcel;
import bd.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Reportes extends javax.swing.JFrame {

    public static ReporteAtleta_cedula addCedula;
    public static ReporteRutinasCedula reportCedula;
    public static ReporteRutinas_fecha reportFecha;
    public static ReporteMensualidad_cedula reportMensual_cedula;
    public static ReporteAsistenciasCedula abreReport_asistenciaCedula;
    public static ReporteAsistencias_pormes abreReport_asistencias_pormes;
    public static ReporteAsistencias_fechas abreReport_asistenciaFecha;
    public static ReporteFacturas_fecha abreReport_facturasFecha;
    public static ReporteFactura_detallecedula abreReport_detalleCedula;
    public static ReporteFacturacion_pormes abreReport_facturames;
    Operaciones_atletas imprime_report = new Operaciones_atletas();
    ReporteTodasRutinas todasRutinas = new ReporteTodasRutinas();
    Operaciones_mensualidad reportMensual = new Operaciones_mensualidad();
    private final Conexion conexion = new Conexion();

    public Reportes() {
        initComponents();
        setIconImage(getIconImage());
        this.setTitle("GESTION REPORTES");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuItem1 = new javax.swing.JMenuItem();
        PanelFondo_principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BarraMenu_principal = new javax.swing.JMenuBar();
        MenuAtletas = new javax.swing.JMenu();
        MenuReporte_general = new javax.swing.JMenuItem();
        MenuAtletas_cedula = new javax.swing.JMenuItem();
        SeparadorExcel_atletas = new javax.swing.JPopupMenu.Separator();
        Sub_menuExcel = new javax.swing.JMenu();
        MenuExcel = new javax.swing.JMenuItem();
        MenuRutinas = new javax.swing.JMenu();
        MenuRutinas_todas = new javax.swing.JMenuItem();
        MenuRutinas_cedula = new javax.swing.JMenuItem();
        MenuRutinas_fecha = new javax.swing.JMenuItem();
        SeparadorExcel_rutinas = new javax.swing.JPopupMenu.Separator();
        MenuRutinas_excel = new javax.swing.JMenu();
        MenuExcel_rutinas = new javax.swing.JMenuItem();
        MenuMensualidad = new javax.swing.JMenu();
        MenuMensualidad_todas = new javax.swing.JMenuItem();
        MenuMensualidad_cedula = new javax.swing.JMenuItem();
        SeparadorExcel_mensual = new javax.swing.JPopupMenu.Separator();
        MenuExcel_mensual = new javax.swing.JMenu();
        MenuMensualidad_excel = new javax.swing.JMenuItem();
        MenuAsistencias = new javax.swing.JMenu();
        MenuItem_general = new javax.swing.JMenuItem();
        MenuItemReport_cedulas = new javax.swing.JMenuItem();
        MenuItem_fecha = new javax.swing.JMenuItem();
        MenuItem_mes = new javax.swing.JMenuItem();
        MenuItemAtlemes = new javax.swing.JMenuItem();
        MenuAsist_excel = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        MenuPagos = new javax.swing.JMenu();
        MenuItemPagos = new javax.swing.JMenuItem();
        MenuFacturacion = new javax.swing.JMenu();
        MenuItemFacturaGeneral = new javax.swing.JMenuItem();
        MenuItemFactura_diariomes = new javax.swing.JMenuItem();
        MenuItemFactura_diaria = new javax.swing.JMenuItem();
        MenuItemFactura_todomeses = new javax.swing.JMenuItem();
        MenuItemFacturaDetalle = new javax.swing.JMenuItem();
        MenuItemFacturaDetalle_cedula = new javax.swing.JMenuItem();
        MenuItemFacturaDetalle_mes = new javax.swing.JMenuItem();
        MenuItemFactu_nula = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuExcel_facturas = new javax.swing.JMenu();
        MenuItemFactura_excel = new javax.swing.JMenuItem();
        MenuItemReportDetalle = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();
        MenuItemCerrar = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondo_principal.setBackground(new java.awt.Color(255, 255, 255));
        PanelFondo_principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        PanelFondo_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerReportes.jpg"))); // NOI18N
        PanelFondo_principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        getContentPane().add(PanelFondo_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        BarraMenu_principal.setBackground(new java.awt.Color(0, 204, 255));
        BarraMenu_principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        BarraMenu_principal.setPreferredSize(new java.awt.Dimension(56, 40));

        MenuAtletas.setBackground(new java.awt.Color(255, 102, 0));
        MenuAtletas.setBorder(null);
        MenuAtletas.setForeground(new java.awt.Color(0, 0, 153));
        MenuAtletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonAtletas.png"))); // NOI18N
        MenuAtletas.setText("ATLETAS");
        MenuAtletas.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuAtletas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuAtletas.setIconTextGap(10);
        MenuAtletas.setPreferredSize(new java.awt.Dimension(190, 20));

        MenuReporte_general.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuReporte_general.setForeground(new java.awt.Color(0, 0, 102));
        MenuReporte_general.setText("Reporte General");
        MenuReporte_general.setToolTipText("");
        MenuReporte_general.setContentAreaFilled(false);
        MenuReporte_general.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuReporte_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReporte_generalActionPerformed(evt);
            }
        });
        MenuAtletas.add(MenuReporte_general);

        MenuAtletas_cedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuAtletas_cedula.setForeground(new java.awt.Color(0, 0, 102));
        MenuAtletas_cedula.setText("Reporte por Cedula");
        MenuAtletas_cedula.setPreferredSize(new java.awt.Dimension(155, 22));
        MenuAtletas_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtletas_cedulaActionPerformed(evt);
            }
        });
        MenuAtletas.add(MenuAtletas_cedula);
        MenuAtletas.add(SeparadorExcel_atletas);

        Sub_menuExcel.setForeground(new java.awt.Color(0, 204, 0));
        Sub_menuExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonExcel.png"))); // NOI18N
        Sub_menuExcel.setText("EXCEL");
        Sub_menuExcel.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        Sub_menuExcel.setPreferredSize(new java.awt.Dimension(165, 30));

        MenuExcel.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuExcel.setForeground(new java.awt.Color(0, 102, 0));
        MenuExcel.setText("Reporte Excel");
        MenuExcel.setPreferredSize(new java.awt.Dimension(148, 25));
        MenuExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExcelActionPerformed(evt);
            }
        });
        Sub_menuExcel.add(MenuExcel);

        MenuAtletas.add(Sub_menuExcel);

        BarraMenu_principal.add(MenuAtletas);

        MenuRutinas.setBorder(null);
        MenuRutinas.setForeground(new java.awt.Color(0, 0, 153));
        MenuRutinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonRutinas.png"))); // NOI18N
        MenuRutinas.setText("RUTINAS");
        MenuRutinas.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuRutinas.setIconTextGap(10);
        MenuRutinas.setPreferredSize(new java.awt.Dimension(190, 20));
        MenuRutinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRutinasActionPerformed(evt);
            }
        });

        MenuRutinas_todas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuRutinas_todas.setForeground(new java.awt.Color(0, 0, 102));
        MenuRutinas_todas.setText("RutinasTodas");
        MenuRutinas_todas.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuRutinas_todas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRutinas_todasActionPerformed(evt);
            }
        });
        MenuRutinas.add(MenuRutinas_todas);

        MenuRutinas_cedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuRutinas_cedula.setForeground(new java.awt.Color(0, 0, 102));
        MenuRutinas_cedula.setText("Rutinas por Cedulas");
        MenuRutinas_cedula.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuRutinas_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRutinas_cedulaActionPerformed(evt);
            }
        });
        MenuRutinas.add(MenuRutinas_cedula);

        MenuRutinas_fecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuRutinas_fecha.setForeground(new java.awt.Color(0, 0, 102));
        MenuRutinas_fecha.setText("Rutinas por Fecha");
        MenuRutinas_fecha.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuRutinas_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRutinas_fechaActionPerformed(evt);
            }
        });
        MenuRutinas.add(MenuRutinas_fecha);
        MenuRutinas.add(SeparadorExcel_rutinas);

        MenuRutinas_excel.setForeground(new java.awt.Color(0, 204, 0));
        MenuRutinas_excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonExcel.png"))); // NOI18N
        MenuRutinas_excel.setText("EXCEL");
        MenuRutinas_excel.setToolTipText("");
        MenuRutinas_excel.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuRutinas_excel.setPreferredSize(new java.awt.Dimension(165, 30));

        MenuExcel_rutinas.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuExcel_rutinas.setForeground(new java.awt.Color(0, 153, 0));
        MenuExcel_rutinas.setText("Reporte Excel");
        MenuExcel_rutinas.setPreferredSize(new java.awt.Dimension(148, 25));
        MenuExcel_rutinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExcel_rutinasActionPerformed(evt);
            }
        });
        MenuRutinas_excel.add(MenuExcel_rutinas);

        MenuRutinas.add(MenuRutinas_excel);

        BarraMenu_principal.add(MenuRutinas);

        MenuMensualidad.setBorder(null);
        MenuMensualidad.setForeground(new java.awt.Color(0, 0, 153));
        MenuMensualidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonMensualidad.png"))); // NOI18N
        MenuMensualidad.setText("MENSUALIDAD");
        MenuMensualidad.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuMensualidad.setIconTextGap(10);
        MenuMensualidad.setPreferredSize(new java.awt.Dimension(190, 20));

        MenuMensualidad_todas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuMensualidad_todas.setForeground(new java.awt.Color(0, 0, 102));
        MenuMensualidad_todas.setText("Reporte General");
        MenuMensualidad_todas.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuMensualidad_todas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMensualidad_todasActionPerformed(evt);
            }
        });
        MenuMensualidad.add(MenuMensualidad_todas);

        MenuMensualidad_cedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuMensualidad_cedula.setForeground(new java.awt.Color(0, 0, 102));
        MenuMensualidad_cedula.setText("Reporte por Cedulas");
        MenuMensualidad_cedula.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuMensualidad_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMensualidad_cedulaActionPerformed(evt);
            }
        });
        MenuMensualidad.add(MenuMensualidad_cedula);
        MenuMensualidad.add(SeparadorExcel_mensual);

        MenuExcel_mensual.setForeground(new java.awt.Color(0, 204, 0));
        MenuExcel_mensual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonExcel.png"))); // NOI18N
        MenuExcel_mensual.setText("EXCEL");
        MenuExcel_mensual.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuExcel_mensual.setPreferredSize(new java.awt.Dimension(180, 30));

        MenuMensualidad_excel.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuMensualidad_excel.setForeground(new java.awt.Color(0, 153, 0));
        MenuMensualidad_excel.setText("Reporte Excel");
        MenuMensualidad_excel.setPreferredSize(new java.awt.Dimension(148, 25));
        MenuMensualidad_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMensualidad_excelActionPerformed(evt);
            }
        });
        MenuExcel_mensual.add(MenuMensualidad_excel);

        MenuMensualidad.add(MenuExcel_mensual);

        BarraMenu_principal.add(MenuMensualidad);

        MenuAsistencias.setBorder(null);
        MenuAsistencias.setForeground(new java.awt.Color(0, 0, 153));
        MenuAsistencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonAsistencia.png"))); // NOI18N
        MenuAsistencias.setText("ASISTENCIAS");
        MenuAsistencias.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuAsistencias.setIconTextGap(10);
        MenuAsistencias.setPreferredSize(new java.awt.Dimension(190, 20));
        MenuAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAsistenciasActionPerformed(evt);
            }
        });

        MenuItem_general.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItem_general.setForeground(new java.awt.Color(0, 0, 102));
        MenuItem_general.setText("Reporte General");
        MenuItem_general.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItem_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_generalActionPerformed(evt);
            }
        });
        MenuAsistencias.add(MenuItem_general);

        MenuItemReport_cedulas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemReport_cedulas.setForeground(new java.awt.Color(0, 0, 102));
        MenuItemReport_cedulas.setText("Reporte por Cedulas");
        MenuItemReport_cedulas.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItemReport_cedulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemReport_cedulasActionPerformed(evt);
            }
        });
        MenuAsistencias.add(MenuItemReport_cedulas);

        MenuItem_fecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItem_fecha.setForeground(new java.awt.Color(0, 0, 102));
        MenuItem_fecha.setText("Reporte por Fecha");
        MenuItem_fecha.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItem_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_fechaActionPerformed(evt);
            }
        });
        MenuAsistencias.add(MenuItem_fecha);

        MenuItem_mes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItem_mes.setForeground(new java.awt.Color(0, 0, 102));
        MenuItem_mes.setText("Reporte por Mes");
        MenuItem_mes.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItem_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_mesActionPerformed(evt);
            }
        });
        MenuAsistencias.add(MenuItem_mes);

        MenuItemAtlemes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemAtlemes.setForeground(new java.awt.Color(0, 0, 102));
        MenuItemAtlemes.setText("Reporte Atleta por Mes");
        MenuItemAtlemes.setToolTipText("");
        MenuItemAtlemes.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItemAtlemes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAtlemesActionPerformed(evt);
            }
        });
        MenuAsistencias.add(MenuItemAtlemes);

        MenuAsist_excel.setForeground(new java.awt.Color(0, 204, 0));
        MenuAsist_excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonExcel.png"))); // NOI18N
        MenuAsist_excel.setText(" EXCEL");
        MenuAsist_excel.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuAsist_excel.setPreferredSize(new java.awt.Dimension(180, 30));

        jMenuItem5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(0, 153, 0));
        jMenuItem5.setText("Reporte Excel");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(148, 25));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        MenuAsist_excel.add(jMenuItem5);

        MenuAsistencias.add(MenuAsist_excel);

        BarraMenu_principal.add(MenuAsistencias);

        MenuPagos.setBorder(null);
        MenuPagos.setForeground(new java.awt.Color(0, 0, 153));
        MenuPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonPago.png"))); // NOI18N
        MenuPagos.setText("PAGOS");
        MenuPagos.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuPagos.setIconTextGap(10);
        MenuPagos.setPreferredSize(new java.awt.Dimension(190, 20));

        MenuItemPagos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemPagos.setForeground(new java.awt.Color(0, 0, 102));
        MenuItemPagos.setText("Reporte Pagos");
        MenuItemPagos.setToolTipText("");
        MenuItemPagos.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItemPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPagosActionPerformed(evt);
            }
        });
        MenuPagos.add(MenuItemPagos);

        BarraMenu_principal.add(MenuPagos);

        MenuFacturacion.setBorder(null);
        MenuFacturacion.setForeground(new java.awt.Color(0, 0, 153));
        MenuFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonFacturas.png"))); // NOI18N
        MenuFacturacion.setText("FACTURACION");
        MenuFacturacion.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuFacturacion.setIconTextGap(10);
        MenuFacturacion.setPreferredSize(new java.awt.Dimension(190, 20));

        MenuItemFacturaGeneral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemFacturaGeneral.setForeground(new java.awt.Color(0, 0, 102));
        MenuItemFacturaGeneral.setText("Reporte Factura General");
        MenuItemFacturaGeneral.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItemFacturaGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFacturaGeneralActionPerformed(evt);
            }
        });
        MenuFacturacion.add(MenuItemFacturaGeneral);

        MenuItemFactura_diariomes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemFactura_diariomes.setForeground(new java.awt.Color(0, 0, 102));
        MenuItemFactura_diariomes.setText("Reporte Mensual");
        MenuItemFactura_diariomes.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItemFactura_diariomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFactura_diariomesActionPerformed(evt);
            }
        });
        MenuFacturacion.add(MenuItemFactura_diariomes);

        MenuItemFactura_diaria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemFactura_diaria.setForeground(new java.awt.Color(0, 0, 102));
        MenuItemFactura_diaria.setText("Reporte Diario");
        MenuItemFactura_diaria.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItemFactura_diaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFactura_diariaActionPerformed(evt);
            }
        });
        MenuFacturacion.add(MenuItemFactura_diaria);

        MenuItemFactura_todomeses.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemFactura_todomeses.setForeground(new java.awt.Color(0, 0, 102));
        MenuItemFactura_todomeses.setText("Reporte Total Meses");
        MenuItemFactura_todomeses.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItemFactura_todomeses.setVerifyInputWhenFocusTarget(false);
        MenuItemFactura_todomeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFactura_todomesesActionPerformed(evt);
            }
        });
        MenuFacturacion.add(MenuItemFactura_todomeses);

        MenuItemFacturaDetalle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemFacturaDetalle.setForeground(new java.awt.Color(0, 0, 102));
        MenuItemFacturaDetalle.setText("Factura Detallada");
        MenuItemFacturaDetalle.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItemFacturaDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFacturaDetalleActionPerformed(evt);
            }
        });
        MenuFacturacion.add(MenuItemFacturaDetalle);

        MenuItemFacturaDetalle_cedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemFacturaDetalle_cedula.setForeground(new java.awt.Color(0, 0, 102));
        MenuItemFacturaDetalle_cedula.setText("Factura Detalle Cliente");
        MenuItemFacturaDetalle_cedula.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItemFacturaDetalle_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFacturaDetalle_cedulaActionPerformed(evt);
            }
        });
        MenuFacturacion.add(MenuItemFacturaDetalle_cedula);

        MenuItemFacturaDetalle_mes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemFacturaDetalle_mes.setForeground(new java.awt.Color(0, 0, 102));
        MenuItemFacturaDetalle_mes.setText("Factura Detalle Mes");
        MenuItemFacturaDetalle_mes.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItemFacturaDetalle_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFacturaDetalle_mesActionPerformed(evt);
            }
        });
        MenuFacturacion.add(MenuItemFacturaDetalle_mes);

        MenuItemFactu_nula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemFactu_nula.setForeground(new java.awt.Color(0, 0, 102));
        MenuItemFactu_nula.setText("Facturas Nulas");
        MenuItemFactu_nula.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItemFactu_nula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFactu_nulaActionPerformed(evt);
            }
        });
        MenuFacturacion.add(MenuItemFactu_nula);
        MenuFacturacion.add(jSeparator1);

        MenuExcel_facturas.setForeground(new java.awt.Color(0, 204, 0));
        MenuExcel_facturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonExcel.png"))); // NOI18N
        MenuExcel_facturas.setText("EXCEL");
        MenuExcel_facturas.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuExcel_facturas.setPreferredSize(new java.awt.Dimension(180, 30));

        MenuItemFactura_excel.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuItemFactura_excel.setForeground(new java.awt.Color(0, 153, 0));
        MenuItemFactura_excel.setText("Facturacion Diaria");
        MenuItemFactura_excel.setPreferredSize(new java.awt.Dimension(190, 25));
        MenuItemFactura_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFactura_excelActionPerformed(evt);
            }
        });
        MenuExcel_facturas.add(MenuItemFactura_excel);

        MenuItemReportDetalle.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuItemReportDetalle.setForeground(new java.awt.Color(0, 153, 0));
        MenuItemReportDetalle.setText("Reporte Detallado");
        MenuItemReportDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemReportDetalleActionPerformed(evt);
            }
        });
        MenuExcel_facturas.add(MenuItemReportDetalle);

        MenuFacturacion.add(MenuExcel_facturas);

        BarraMenu_principal.add(MenuFacturacion);

        MenuSalir.setForeground(new java.awt.Color(0, 0, 153));
        MenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportesSalir.png"))); // NOI18N
        MenuSalir.setText("SALIR");
        MenuSalir.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuSalir.setIconTextGap(10);
        MenuSalir.setPreferredSize(new java.awt.Dimension(190, 20));

        MenuItemCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemCerrar.setForeground(new java.awt.Color(0, 0, 102));
        MenuItemCerrar.setText("Cerrar Ventana");
        MenuItemCerrar.setPreferredSize(new java.awt.Dimension(180, 22));
        MenuItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCerrarActionPerformed(evt);
            }
        });
        MenuSalir.add(MenuItemCerrar);

        BarraMenu_principal.add(MenuSalir);

        setJMenuBar(BarraMenu_principal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuReporte_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReporte_generalActionPerformed

        imprime_report.reportTodosAtletas();
    }//GEN-LAST:event_MenuReporte_generalActionPerformed

    private void MenuAtletas_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtletas_cedulaActionPerformed

        if (addCedula == null) {

            addCedula = new ReporteAtleta_cedula();
            addCedula.setVisible(true);
        }
    }//GEN-LAST:event_MenuAtletas_cedulaActionPerformed

    private void MenuExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExcelActionPerformed

        AtletasExcel.reporteAtletas();
    }//GEN-LAST:event_MenuExcelActionPerformed

    private void MenuRutinas_todasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRutinas_todasActionPerformed

        todasRutinas.reportTodasRutinas();
    }//GEN-LAST:event_MenuRutinas_todasActionPerformed

    private void MenuRutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRutinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuRutinasActionPerformed

    private void MenuRutinas_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRutinas_cedulaActionPerformed

        if (reportCedula == null) {

            reportCedula = new ReporteRutinasCedula();
            reportCedula.setVisible(true);
        }
    }//GEN-LAST:event_MenuRutinas_cedulaActionPerformed

    private void MenuRutinas_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRutinas_fechaActionPerformed

        if (reportFecha == null) {

            reportFecha = new ReporteRutinas_fecha();
            reportFecha.setVisible(true);
        }
    }//GEN-LAST:event_MenuRutinas_fechaActionPerformed

    private void MenuExcel_rutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExcel_rutinasActionPerformed

        RutinasExcel.reporteRutinas();
    }//GEN-LAST:event_MenuExcel_rutinasActionPerformed

    private void MenuMensualidad_todasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMensualidad_todasActionPerformed

        reportMensual.reportTodasMensualidad();
    }//GEN-LAST:event_MenuMensualidad_todasActionPerformed

    private void MenuMensualidad_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMensualidad_cedulaActionPerformed

        if (reportMensual_cedula == null) {

            reportMensual_cedula = new ReporteMensualidad_cedula();
            reportMensual_cedula.setVisible(true);
        }
    }//GEN-LAST:event_MenuMensualidad_cedulaActionPerformed

    private void MenuMensualidad_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMensualidad_excelActionPerformed

        MensualidadExcel.reporteMensualidad();
    }//GEN-LAST:event_MenuMensualidad_excelActionPerformed

    private void MenuItem_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_generalActionPerformed

        reportTodas_asistencias();
    }//GEN-LAST:event_MenuItem_generalActionPerformed

    private void MenuItemReport_cedulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemReport_cedulasActionPerformed

        if (abreReport_asistenciaCedula == null) {

            abreReport_asistenciaCedula = new ReporteAsistenciasCedula();
            abreReport_asistenciaCedula.setVisible(true);
        }
    }//GEN-LAST:event_MenuItemReport_cedulasActionPerformed

    private void MenuItem_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_fechaActionPerformed

        if (abreReport_asistenciaFecha == null) {

            abreReport_asistenciaFecha = new ReporteAsistencias_fechas();

            abreReport_asistenciaFecha.setVisible(true);

        }
    }//GEN-LAST:event_MenuItem_fechaActionPerformed

    private void MenuItem_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_mesActionPerformed

        reportTotalMes_asistencias();
    }//GEN-LAST:event_MenuItem_mesActionPerformed

    private void MenuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCerrarActionPerformed

        Administracion.abrirReporte = null;

        this.dispose();
    }//GEN-LAST:event_MenuItemCerrarActionPerformed

    private void MenuAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAsistenciasActionPerformed


    }//GEN-LAST:event_MenuAsistenciasActionPerformed

    private void MenuItemAtlemesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAtlemesActionPerformed

        if (abreReport_asistencias_pormes == null) {

            abreReport_asistencias_pormes = new ReporteAsistencias_pormes();
            abreReport_asistencias_pormes.setVisible(true);
        }
    }//GEN-LAST:event_MenuItemAtlemesActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        AsistenciasExcel.reporteAsistencias();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void MenuItemPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPagosActionPerformed

        reportTodos_pagos();
    }//GEN-LAST:event_MenuItemPagosActionPerformed

    private void MenuItemFacturaGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFacturaGeneralActionPerformed

        reportFactura_general();
    }//GEN-LAST:event_MenuItemFacturaGeneralActionPerformed

    private void MenuItemFactura_diariomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFactura_diariomesActionPerformed

        reportFacturaDiaria_mensual();
    }//GEN-LAST:event_MenuItemFactura_diariomesActionPerformed

    private void MenuItemFactura_diariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFactura_diariaActionPerformed

        if (abreReport_facturasFecha == null) {

            abreReport_facturasFecha = new ReporteFacturas_fecha();
            abreReport_facturasFecha.setVisible(true);
        }
    }//GEN-LAST:event_MenuItemFactura_diariaActionPerformed

    private void MenuItemFactura_todomesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFactura_todomesesActionPerformed

        reportFacturacionPor_mes();

    }//GEN-LAST:event_MenuItemFactura_todomesesActionPerformed

    private void MenuItemFactura_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFactura_excelActionPerformed

        FacturacionExcel.reporteFacturacion();
    }//GEN-LAST:event_MenuItemFactura_excelActionPerformed

    private void MenuItemReportDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemReportDetalleActionPerformed

        FacturaDetallada.reporteFacturacion_detalle();
    }//GEN-LAST:event_MenuItemReportDetalleActionPerformed

    private void MenuItemFacturaDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFacturaDetalleActionPerformed
        
        reportFacturacion_detalle();
    }//GEN-LAST:event_MenuItemFacturaDetalleActionPerformed

    private void MenuItemFacturaDetalle_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFacturaDetalle_cedulaActionPerformed
       
        if (abreReport_detalleCedula == null) {

            abreReport_detalleCedula = new ReporteFactura_detallecedula();
            abreReport_detalleCedula.setVisible(true);
        }
        
    }//GEN-LAST:event_MenuItemFacturaDetalle_cedulaActionPerformed

    private void MenuItemFacturaDetalle_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFacturaDetalle_mesActionPerformed
        
        if(abreReport_facturames == null){
            abreReport_facturames = new ReporteFacturacion_pormes();
            abreReport_facturames.setVisible(true);
        }
    }//GEN-LAST:event_MenuItemFacturaDetalle_mesActionPerformed

    private void MenuItemFactu_nulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFactu_nulaActionPerformed
        
        reportFacturas_nulas();
    }//GEN-LAST:event_MenuItemFactu_nulaActionPerformed
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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu_principal;
    private javax.swing.JMenu MenuAsist_excel;
    private javax.swing.JMenu MenuAsistencias;
    private javax.swing.JMenu MenuAtletas;
    private javax.swing.JMenuItem MenuAtletas_cedula;
    private javax.swing.JMenuItem MenuExcel;
    private javax.swing.JMenu MenuExcel_facturas;
    private javax.swing.JMenu MenuExcel_mensual;
    private javax.swing.JMenuItem MenuExcel_rutinas;
    private javax.swing.JMenu MenuFacturacion;
    private javax.swing.JMenuItem MenuItemAtlemes;
    private javax.swing.JMenuItem MenuItemCerrar;
    private javax.swing.JMenuItem MenuItemFactu_nula;
    private javax.swing.JMenuItem MenuItemFacturaDetalle;
    private javax.swing.JMenuItem MenuItemFacturaDetalle_cedula;
    private javax.swing.JMenuItem MenuItemFacturaDetalle_mes;
    private javax.swing.JMenuItem MenuItemFacturaGeneral;
    private javax.swing.JMenuItem MenuItemFactura_diaria;
    private javax.swing.JMenuItem MenuItemFactura_diariomes;
    private javax.swing.JMenuItem MenuItemFactura_excel;
    private javax.swing.JMenuItem MenuItemFactura_todomeses;
    private javax.swing.JMenuItem MenuItemPagos;
    private javax.swing.JMenuItem MenuItemReportDetalle;
    private javax.swing.JMenuItem MenuItemReport_cedulas;
    private javax.swing.JMenuItem MenuItem_fecha;
    private javax.swing.JMenuItem MenuItem_general;
    private javax.swing.JMenuItem MenuItem_mes;
    private javax.swing.JMenu MenuMensualidad;
    private javax.swing.JMenuItem MenuMensualidad_cedula;
    private javax.swing.JMenuItem MenuMensualidad_excel;
    private javax.swing.JMenuItem MenuMensualidad_todas;
    private javax.swing.JMenu MenuPagos;
    private javax.swing.JMenuItem MenuReporte_general;
    private javax.swing.JMenu MenuRutinas;
    private javax.swing.JMenuItem MenuRutinas_cedula;
    private javax.swing.JMenu MenuRutinas_excel;
    private javax.swing.JMenuItem MenuRutinas_fecha;
    private javax.swing.JMenuItem MenuRutinas_todas;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JPanel PanelFondo_principal;
    private javax.swing.JPopupMenu.Separator SeparadorExcel_atletas;
    private javax.swing.JPopupMenu.Separator SeparadorExcel_mensual;
    private javax.swing.JPopupMenu.Separator SeparadorExcel_rutinas;
    private javax.swing.JMenu Sub_menuExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void reportTodas_asistencias() {

        try {
            Connection conn = conexion.conectar();
            JasperReport reporte = null;

            Map parametro = new HashMap();

            parametro.put("imagen_logo1", Reportes.class.getResource("/reportes/logo1.png"));
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reporteAsistencias.jasper"));

            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            view.setVisible(true);
            view.setTitle("ASISTENCIAS");
        } catch (JRException e) {
        }

    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void reportTotalMes_asistencias() {

        try {

            Connection conn = conexion.conectar();

            JasperReport reporte = null;

            Map parametro = new HashMap();

            parametro.put("logo", Reportes.class.getResource("/reportes/logo1.png"));

            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportAsistencias_mes.jasper"));

            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

            JasperViewer view = new JasperViewer(jprint, false);

            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            view.setVisible(true);

            view.setTitle("TOTAL ASISTENCIAS POR MESES");

        } catch (JRException e) {

        }

    }

    /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void reportTodos_pagos() {

        try {
            Connection conn = conexion.conectar();
            JasperReport reporte = null;

            Map parametro = new HashMap();

            parametro.put("logo", Reportes.class.getResource("/reportes/logo1.png"));
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportPagos_general.jasper"));

            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            view.setVisible(true);
            view.setTitle("REPORTE-PAGOS");
        } catch (JRException e) {
        }

    }

    /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void reportFactura_general() {

        try {
            Connection conn = conexion.conectar();
            JasperReport reporte = null;

            Map parametro = new HashMap();

            parametro.put("vermiLogo", Reportes.class.getResource("/reportes/logo1.png"));
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportFacturaTotal_diaria.jasper"));

            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            view.setVisible(true);
            view.setTitle("REPORTE-FACTURACION");
        } catch (JRException e) {
        }

    }

    /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void reportFacturaDiaria_mensual() {

        try {
            Connection conn = conexion.conectar();
            JasperReport reporte = null;

            Map parametro = new HashMap();

            parametro.put("imgmiLogo", Reportes.class.getResource("/reportes/logoJR2.png"));
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportFacturacion_diaria.jasper"));

            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            view.setVisible(true);
            view.setTitle("REPORTE-FACTURACION");
        } catch (JRException e) {
        }

    }

    /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void reportFacturacionPor_mes() {

        try {
            Connection conn = conexion.conectar();
            JasperReport reporte = null;

            Map parametro = new HashMap();

            parametro.put("dir_img", Reportes.class.getResource("/reportes/logo1.png"));
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportVentas_cada_mes.jasper"));

            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            view.setVisible(true);
            view.setTitle("REPORTE-FACTURACION");
        } catch (JRException e) {
        }

    }
    
      /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void reportFacturacion_detalle() {

        try {
            Connection conn = conexion.conectar();
            JasperReport reporte = null;

            Map parametro = new HashMap();

            parametro.put("foto1", Reportes.class.getResource("/reportes/logo1.png"));
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportFactura_condetalle.jasper"));

            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            view.setVisible(true);
            view.setTitle("REPORTE-FACTURACION-DETALLADA");
        } catch (JRException e) {
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
    
     /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void reportFacturas_nulas() {

        try {
            Connection conn = conexion.conectar();
            JasperReport reporte = null;

            Map parametro = new HashMap();

            parametro.put("imgFactu_nula", Reportes.class.getResource("/reportes/logo1.png"));
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportFacturas_nulas.jasper"));

            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            view.setVisible(true);
            view.setTitle("FACTURAs NULAS");
        } catch (JRException e) {
        }

    }

}
