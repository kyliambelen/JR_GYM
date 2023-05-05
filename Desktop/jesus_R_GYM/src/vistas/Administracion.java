package vistas;

import entidades.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Administracion extends javax.swing.JFrame {

    UIManager UI;
    Usuarios usuar;
    public static Operaciones_pago opPagos;
    public static Operaciones_atletas opAtle;
    public static OperacionConfig_gym opConfig_gym;
    public static Operaciones_entrenador opEntrena;
    public static Operaciones_usuarios opUsuar;
    public static Operaciones_mensualidad operMensualidad;
    public static Operaciones_rutinas opeRutinas;
    public static Operaciones_Asistencia ingreAsistenciaADM;
    public static AgregarMensualidad addMensual;
    public static AgregarRutinas addRutina;
    public static Control_pagos addPagos;
    public static NumeroSerie abrirNumero_S;
    public static ListarMensualidad verMensualidad;
    public static ListarAtletas verAtletas;
    public static Administracion opconfiguracion;
    public static Factura_report abrirFactura;
    public static Pagina_entrada abrirPG_entrada;
    public static Reportes abrirReporte;

    public Administracion() {

        initComponents();
    }

    public Administracion(Usuarios usuar) {
        initComponents();
        this.usuar = usuar;
        this.setExtendedState(Pagina_entrada.MAXIMIZED_BOTH);
        this.setTitle("MODULO-ADMINISTRACION");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setIconImage(getIconImage());
        txtUsuario_id.setVisible(false);

        if (usuar.getIdRol() == 1 || usuar.getIdRol() == 2) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        } else {

        }
        if (usuar.getIdRol() == 3) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No Esta Autorizado a Ingresar a Este Modulo",
                    "CONFIGURACION", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        txtUsuario_id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnVer_atletas = new javax.swing.JLabel();
        btnAdministrar_usuarios = new javax.swing.JLabel();
        btnAdministrar_config = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnAdministrar_atletas = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnAdministrar_pagos = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        SeparadorEntrenador = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        SeparadorOrganizacion = new javax.swing.JSeparator();
        btnAdd_mensualidad = new javax.swing.JLabel();
        btnVerPago_mensual = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        btnAdmin_mensualidad = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnReportes = new javax.swing.JLabel();
        btnModulo_pago = new javax.swing.JLabel();
        btnModulo_nserie = new javax.swing.JLabel();
        btnAdmin_asistencia = new javax.swing.JLabel();
        btnAgregarRutinas = new javax.swing.JLabel();
        btnOperaciones_rutinas = new javax.swing.JLabel();
        btnAgregarEntrenador = new javax.swing.JLabel();
        btnFacturacion = new javax.swing.JLabel();
        LabelLogo = new javax.swing.JLabel();
        LabelMenu_vertical = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario_id.setEditable(false);
        PanelPrincipal.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 30, 40, 20));

        jSeparator1.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 8, 8));
        jSeparator1.getAccessibleContext().setAccessibleName("");
        jSeparator1.getAccessibleContext().setAccessibleDescription("");

        jSeparator3.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51), 2));
        PanelPrincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, 2));
        jSeparator3.getAccessibleContext().setAccessibleDescription("");

        btnVer_atletas.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        btnVer_atletas.setForeground(new java.awt.Color(0, 204, 51));
        btnVer_atletas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVer_atletas.setText("VER-ATLETAS");
        btnVer_atletas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 2, true));
        btnVer_atletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVer_atletasMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnVer_atletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 160, 30));

        btnAdministrar_usuarios.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        btnAdministrar_usuarios.setForeground(new java.awt.Color(255, 255, 0));
        btnAdministrar_usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdministrar_usuarios.setText("USUARIOS");
        btnAdministrar_usuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        btnAdministrar_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministrar_usuariosMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnAdministrar_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 280, 40));

        btnAdministrar_config.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        btnAdministrar_config.setForeground(new java.awt.Color(255, 128, 0));
        btnAdministrar_config.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdministrar_config.setText("CONFIGURACION");
        btnAdministrar_config.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 128, 0), 2));
        btnAdministrar_config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministrar_configMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnAdministrar_config, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 280, 40));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 8, 8));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 8, 8));
        jSeparator4.getAccessibleContext().setAccessibleDescription("");

        btnAdministrar_atletas.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        btnAdministrar_atletas.setForeground(new java.awt.Color(0, 204, 51));
        btnAdministrar_atletas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdministrar_atletas.setText(" ATLETAS");
        btnAdministrar_atletas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 3, true));
        btnAdministrar_atletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministrar_atletasMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnAdministrar_atletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 280, 40));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 8, 8));
        jSeparator7.getAccessibleContext().setAccessibleDescription("");

        jSeparator8.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 8, 8));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 8, 8));
        jSeparator5.getAccessibleContext().setAccessibleName("");
        jSeparator5.getAccessibleContext().setAccessibleDescription("");

        jSeparator6.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51), 2));
        PanelPrincipal.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 10, 10));

        btnAdministrar_pagos.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        btnAdministrar_pagos.setForeground(new java.awt.Color(255, 51, 0));
        btnAdministrar_pagos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdministrar_pagos.setText(" PAGOS");
        btnAdministrar_pagos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        btnAdministrar_pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministrar_pagosMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnAdministrar_pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, 40));

        jSeparator11.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 8, 8));

        jSeparator12.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 120, -1));

        jSeparator13.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 10, 10));

        SeparadorEntrenador.setOrientation(javax.swing.SwingConstants.VERTICAL);
        SeparadorEntrenador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(SeparadorEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 8, 8));

        jSeparator15.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 8, 8));

        jSeparator16.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 8, 8));

        jSeparator17.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 8, 8));

        jSeparator18.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator18.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 8, 8));

        jSeparator19.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator19.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 8, 8));

        jSeparator20.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        PanelPrincipal.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 120, 2));

        jSeparator21.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        PanelPrincipal.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 10, 10));

        jSeparator22.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator22.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 8, 8));

        SeparadorOrganizacion.setOrientation(javax.swing.SwingConstants.VERTICAL);
        SeparadorOrganizacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(SeparadorOrganizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 8, 8));

        btnAdd_mensualidad.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        btnAdd_mensualidad.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd_mensualidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd_mensualidad.setText("ADD-MENSUALIDAD");
        btnAdd_mensualidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnAdd_mensualidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdd_mensualidadMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnAdd_mensualidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 160, 30));

        btnVerPago_mensual.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        btnVerPago_mensual.setForeground(new java.awt.Color(255, 255, 255));
        btnVerPago_mensual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVerPago_mensual.setText("VER-PAGOS-MENSUAL");
        btnVerPago_mensual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnVerPago_mensual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerPago_mensualMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnVerPago_mensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 160, 30));

        jSeparator14.setBackground(new java.awt.Color(26, 105, 57));
        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PanelPrincipal.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 10, 10));

        btnAdmin_mensualidad.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        btnAdmin_mensualidad.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin_mensualidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdmin_mensualidad.setText("MENSUALIDAD");
        btnAdmin_mensualidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnAdmin_mensualidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdmin_mensualidadMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnAdmin_mensualidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 280, 40));

        btnSalir.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("SALIR");
        btnSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 204), 3, true));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setIconTextGap(100);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 280, 40));

        btnReportes.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(51, 255, 0));
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReportes.setText("REPORTES");
        btnReportes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 3, true));
        btnReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReportes.setIconTextGap(100);
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 280, 40));

        btnModulo_pago.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        btnModulo_pago.setForeground(new java.awt.Color(153, 0, 153));
        btnModulo_pago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModulo_pago.setText("REGISTRAR - PAGOS");
        btnModulo_pago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        btnModulo_pago.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnModulo_pagoMouseDragged(evt);
            }
        });
        btnModulo_pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOTON_MODULO_PAGO_ADMIN(evt);
            }
        });
        PanelPrincipal.add(btnModulo_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 280, 40));

        btnModulo_nserie.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        btnModulo_nserie.setForeground(new java.awt.Color(255, 204, 0));
        btnModulo_nserie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModulo_nserie.setText(" NUMERO SERIE");
        btnModulo_nserie.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        btnModulo_nserie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModulo_nserieMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnModulo_nserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 280, 40));

        btnAdmin_asistencia.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        btnAdmin_asistencia.setForeground(new java.awt.Color(0, 51, 255));
        btnAdmin_asistencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdmin_asistencia.setText("ASISTENCIAS");
        btnAdmin_asistencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 3, true));
        btnAdmin_asistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdmin_asistenciaMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnAdmin_asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 280, 40));

        btnAgregarRutinas.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        btnAgregarRutinas.setForeground(new java.awt.Color(153, 153, 255));
        btnAgregarRutinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregarRutinas.setText("ADD-RUTINAS");
        btnAgregarRutinas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        btnAgregarRutinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarRutinasMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnAgregarRutinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 160, 30));

        btnOperaciones_rutinas.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        btnOperaciones_rutinas.setForeground(new java.awt.Color(153, 153, 255));
        btnOperaciones_rutinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOperaciones_rutinas.setText("RUTINAS");
        btnOperaciones_rutinas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 3, true));
        btnOperaciones_rutinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOperaciones_rutinasMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnOperaciones_rutinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 280, 40));

        btnAgregarEntrenador.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        btnAgregarEntrenador.setForeground(new java.awt.Color(0, 153, 204));
        btnAgregarEntrenador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregarEntrenador.setText("ENTRENADOR");
        btnAgregarEntrenador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btnAgregarEntrenador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarEntrenadorMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnAgregarEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 280, 40));

        btnFacturacion.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        btnFacturacion.setForeground(new java.awt.Color(204, 204, 204));
        btnFacturacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFacturacion.setText("FACTURACION");
        btnFacturacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        btnFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFacturacionMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 280, 40));

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoJR3.png"))); // NOI18N
        PanelPrincipal.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 150, 150));

        LabelMenu_vertical.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        PanelPrincipal.add(LabelMenu_vertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 680));

        LabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("PANEL ADMINISTRATIVO");
        PanelPrincipal.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 420, 50));

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesas3.jpg"))); // NOI18N
        PanelPrincipal.add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1366, 770));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1370, 770));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministrar_pagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministrar_pagosMouseClicked

        if (usuar.getIdRol() != 1) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No Esta Autorizado a Ingresar a Este Modulo",
                    "PAGOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (opPagos != null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de PAGOS se encuentra abierto",
                    "PAGOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (opPagos == null) {

            opPagos = new Operaciones_pago(usuar);

            opPagos.setVisible(true);

        } else {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No Esta Autorizado a Ingresar a Este Modulo",
                    "PAGOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
        }


    }//GEN-LAST:event_btnAdministrar_pagosMouseClicked

    private void btnAdministrar_atletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministrar_atletasMouseClicked

        

        if (Administracion.opAtle != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo  ATLETAS se encuentra abierto.",
                    "MODULO COBRANZA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        }else{

            try {
                opAtle = new Operaciones_atletas(usuar);

            } catch (SQLException ex) {
                Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
            }
            opAtle.setVisible(true);
        }

    }//GEN-LAST:event_btnAdministrar_atletasMouseClicked

    private void btnAdministrar_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministrar_usuariosMouseClicked

        if (usuar.getIdRol() != 1) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No Esta Autorizado a Ingresar a Este Modulo",
                    "USUARIOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (opUsuar != null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de USUARIOS se encuentra abierto",
                    "USUARIOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (opUsuar == null) {

            Pagina_entrada.ingreAdmin = null;
            this.dispose();

            try {
                opUsuar = new Operaciones_usuarios(usuar);
            } catch (SQLException ex) {
                Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
            }

            opUsuar.setVisible(true);

        } else {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No Esta Autorizado a Ingresar a Este Modulo",
                    "USUARIOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
        }


    }//GEN-LAST:event_btnAdministrar_usuariosMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked

        if (Pagina_entrada.abrePG_entrada == null) {

            abrirPG_entrada = new Pagina_entrada(usuar);
            abrirPG_entrada.setVisible(true);
        }
        Pagina_entrada.ingreAdmin = null;
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnAdd_mensualidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdd_mensualidadMouseClicked

        if (addMensual != null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo se encuentra abierto",
                    "PAGOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            try {
                addMensual = new AgregarMensualidad();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            addMensual.setVisible(true);
        }
    }//GEN-LAST:event_btnAdd_mensualidadMouseClicked

    private void btnAdmin_asistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdmin_asistenciaMouseClicked
        if (Pagina_entrada.ingreAsistenciaOA != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Asistencia esta abierto en el módulo de inicio",
                    "ASISTENCIAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (Administracion.ingreAsistenciaADM != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Asistencia ya esta abierto",
                    "ASISTENCIAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            ingreAsistenciaADM = new Operaciones_Asistencia(usuar);
            ingreAsistenciaADM.setVisible(true);
        }
    }//GEN-LAST:event_btnAdmin_asistenciaMouseClicked

    private void BOTON_MODULO_PAGO_ADMIN(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOTON_MODULO_PAGO_ADMIN

        if (Operaciones_Asistencia.ingrePagos != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Pago esta abierto en el módulo de Asistencias",
                    "ASISTENCIAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (ListarPagos_pendientes.pagaDeuda != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Pago esta abierto en el módulo de Pagos Pendientes",
                    "PAGOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (Administracion.addPagos != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Pago esta abierto",
                    "ADMINISTRACION", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            addPagos = new Control_pagos(usuar);
            addPagos.setVisible(true);
        }

    }//GEN-LAST:event_BOTON_MODULO_PAGO_ADMIN

    private void btnModulo_nserieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModulo_nserieMouseClicked

        if (usuar.getIdRol() != 1) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No Esta Autorizado a Ingresar a Este Modulo",
                    "SERIALES", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (abrirNumero_S != null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo SERIALES se encuentra abierto",
                    "SERIALES", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (abrirNumero_S == null) {
            Administracion lns = null;

            abrirNumero_S = new NumeroSerie(lns, true, usuar);
            abrirNumero_S.setVisible(true);

        } else {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No Esta Autorizado a Ingresar a Este Modulo",
                    "SERIALES", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
        }


    }//GEN-LAST:event_btnModulo_nserieMouseClicked

    private void btnModulo_pagoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModulo_pagoMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModulo_pagoMouseDragged

    private void btnVerPago_mensualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerPago_mensualMouseClicked

        if (verMensualidad != null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo se encuentra abierto",
                    "PAGOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            try {
                verMensualidad = new ListarMensualidad(usuar);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            verMensualidad.setVisible(true);
        }
    }//GEN-LAST:event_btnVerPago_mensualMouseClicked

    private void btnVer_atletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVer_atletasMouseClicked

        if (verAtletas != null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo se encuentra abierto",
                    "SERIALES", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            if (verAtletas == null) {

                try {
                    verAtletas = new ListarAtletas(usuar);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }

                verAtletas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnVer_atletasMouseClicked

    private void btnAdmin_mensualidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdmin_mensualidadMouseClicked

        if (operMensualidad != null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de MENSUALIDAD se encuentra abierto",
                    "PAGOS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (operMensualidad == null) {

            try {
                operMensualidad = new Operaciones_mensualidad(usuar);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            operMensualidad.setVisible(true);
        }

    }//GEN-LAST:event_btnAdmin_mensualidadMouseClicked

    private void btnAgregarRutinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarRutinasMouseClicked

        if (addRutina != null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo AGREGAR RUTINAS se encuentra abierto",
                    "SERIALES", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        } else {

            try {
                addRutina = new AgregarRutinas();
            } catch (SQLException ex) {
                Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
            }
            addRutina.setVisible(true);

        }
    }//GEN-LAST:event_btnAgregarRutinasMouseClicked

    private void btnAgregarEntrenadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEntrenadorMouseClicked

        if (opEntrena != null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo ENTRENADOR se encuentra abierto",
                    "SERIALES", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        } else {
            if (opEntrena == null) {

                opEntrena = new Operaciones_entrenador();
                opEntrena.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnAgregarEntrenadorMouseClicked

    private void btnOperaciones_rutinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOperaciones_rutinasMouseClicked

        if (opeRutinas != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de RUTINAS se encuentra abierto",
                    "ASISTENCIAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {
            if (opeRutinas == null) {

                opeRutinas = new Operaciones_rutinas();
                opeRutinas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnOperaciones_rutinasMouseClicked

    private void btnAdministrar_configMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministrar_configMouseClicked

        if (usuar.getIdRol() != 1) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No Esta Autorizado a Ingresar a Este Modulo",
                    "CONFIGURACION", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (opConfig_gym != null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de CONFIGURACION se encuentra abierto",
                    "CONFIGURACION", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (opConfig_gym == null) {

            opConfig_gym = new OperacionConfig_gym(usuar);
            opConfig_gym.setVisible(true);
        } else {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No Esta Autorizado a Ingresar a Este Modulo",
                    "CONFIGURACION", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
        }

    }//GEN-LAST:event_btnAdministrar_configMouseClicked

    private void btnFacturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturacionMouseClicked

        if (Control_pagos.reportFactura != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Facturacion esta abierto en el módulo de Pagos",
                    "FACTURACION", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (Administracion.abrirFactura != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Facturación se encuentra abierto",
                    "FACTURACION", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            abrirFactura = new Factura_report();
            abrirFactura.setVisible(true);
        }
    }//GEN-LAST:event_btnFacturacionMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
       
        if (Administracion.abrirReporte != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo REPORTES se encuentra abierto",
                    "FACTURACION", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            abrirReporte = new Reportes();
            abrirReporte.setVisible(true);
        }
    }//GEN-LAST:event_btnReportesMouseClicked

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
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Administracion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelMenu_vertical;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JSeparator SeparadorEntrenador;
    private javax.swing.JSeparator SeparadorOrganizacion;
    private javax.swing.JLabel btnAdd_mensualidad;
    private javax.swing.JLabel btnAdmin_asistencia;
    private javax.swing.JLabel btnAdmin_mensualidad;
    private javax.swing.JLabel btnAdministrar_atletas;
    private javax.swing.JLabel btnAdministrar_config;
    private javax.swing.JLabel btnAdministrar_pagos;
    private javax.swing.JLabel btnAdministrar_usuarios;
    private javax.swing.JLabel btnAgregarEntrenador;
    private javax.swing.JLabel btnAgregarRutinas;
    private javax.swing.JLabel btnFacturacion;
    private javax.swing.JLabel btnModulo_nserie;
    private javax.swing.JLabel btnModulo_pago;
    private javax.swing.JLabel btnOperaciones_rutinas;
    private javax.swing.JLabel btnReportes;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnVerPago_mensual;
    private javax.swing.JLabel btnVer_atletas;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables

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
