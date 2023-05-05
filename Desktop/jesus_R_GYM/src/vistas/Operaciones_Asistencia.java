package vistas;

import bd.Conexion;
import dao.AtletasDao;
import dao.PagoPendienteDao;
import entidades.Atletas;
import entidades.PagoPendiente;
import entidades.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import static vistas.AgregarMensualidad.buscaAtleta;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Operaciones_Asistencia extends javax.swing.JFrame {

    private final Conexion conexion = new Conexion();
    UIManager UI;

    int item;
    public static AgregarAtletas searchAtletas;
    public static Control_pagos ingrePagos;
    public static ListarPagos_pendientes listPagos;
    public static AgregarMensualidad addMensualidad;
    public static ListarMensualidad listMensualidad;
    public static ListarAtletas lista_de_atletas;
    public static Operaciones_mensualidad operMensualidad2;
    public static LoginActivar ingreLogin_activar;
    public static BuscarAsistencia buscaAsistencia;

    Usuarios usuar;

    public Operaciones_Asistencia(Usuarios usuar) {
        initComponents();
        setIconImage(getIconImage());
        this.setTitle("ASISTENCIA-DIARIA");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.usuar = usuar;
        txtIdAtletas.setVisible(false);
        txtUsuario_id.setVisible(false);
        txtIdasistencia.setVisible(false);
        if (usuar.getIdRol() == 1) {

            txtUsuario_id.setText("" + usuar.getIdusuario());
            btnEliminar.setEnabled(false);
            btnEliminar_todo.setEnabled(false);
            btnPagar.setEnabled(false);

        } else if (usuar.getIdRol() == 2) {

            txtUsuario_id.setText("" + usuar.getIdusuario());
            btnEliminar.setEnabled(false);
            btnEliminar_todo.setEnabled(false);
            btnPagar.setEnabled(false);

        } else {

            txtUsuario_id.setText("" + usuar.getIdusuario());
            btnEliminar.setEnabled(false);
            btnEliminar_todo.setEnabled(false);
            btnPagar.setEnabled(false);

        }
    }

    public Operaciones_Asistencia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GRUPO_PAGO = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        PanelAmarillo = new javax.swing.JPanel();
        btnBuscarAtletas = new javax.swing.JButton();
        LabelCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        LabelNombres = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        LabelHora_entrada = new javax.swing.JLabel();
        LabelHora_salida = new javax.swing.JLabel();
        txtDateFecha = new com.toedter.calendar.JDateChooser();
        txtIdAtletas = new javax.swing.JTextField();
        LabelObservaciones1 = new javax.swing.JLabel();
        RadioButton_si = new javax.swing.JRadioButton();
        RadioButton_no = new javax.swing.JRadioButton();
        LabelObservaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        txtHora_entrada = new javax.swing.JFormattedTextField();
        txtHora_salida = new javax.swing.JFormattedTextField();
        txtUsuario_id = new javax.swing.JTextField();
        btnAgregarAtleta = new javax.swing.JButton();
        btnAddMensualidad = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        btnListarAtletas = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        RadioButton_mensual = new javax.swing.JRadioButton();
        LabelFecha1 = new javax.swing.JLabel();
        ComboBoxTiempo = new javax.swing.JComboBox<>();
        btnAgregarAsistencia = new javax.swing.JButton();
        LabelBanner = new javax.swing.JLabel();
        txtIdasistencia = new javax.swing.JTextField();
        PanelVerde = new javax.swing.JPanel();
        btnDesbloqueo = new javax.swing.JButton();
        btnPago_pendiente = new javax.swing.JButton();
        btnVerPago_pendiente = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEliminar_todo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRecobrar_asistencia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAsistencia_diaria = new javax.swing.JTable();
        LabelFondoTabla = new javax.swing.JLabel();
        LabelBanner1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAmarillo.setBackground(new java.awt.Color(55, 138, 175));
        PanelAmarillo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelAmarillo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarAtletas.setBackground(new java.awt.Color(0, 153, 255));
        btnBuscarAtletas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscarAtletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/presionaDedo.png"))); // NOI18N
        btnBuscarAtletas.setToolTipText("<html>\n\n<p>Presione para buscar<br>\nun atleta</p>\n</html>");
        btnBuscarAtletas.setAutoscrolls(true);
        btnBuscarAtletas.setBorderPainted(false);
        btnBuscarAtletas.setContentAreaFilled(false);
        btnBuscarAtletas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarAtletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAtletasActionPerformed(evt);
            }
        });
        PanelAmarillo.add(btnBuscarAtletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 10, 30, 30));

        LabelCedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelCedula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelCedula.setText("CEDULA");
        PanelAmarillo.add(LabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 30));

        txtCedula.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(102, 102, 102));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });
        PanelAmarillo.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 210, 30));

        txtNombres.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(102, 102, 102));
        txtNombres.setNextFocusableComponent(txtDateFecha);
        PanelAmarillo.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 240, 30));

        LabelNombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelNombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNombres.setText("NOMBRES");
        PanelAmarillo.add(LabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, 30));

        LabelFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelFecha.setText("TIEMPO");
        PanelAmarillo.add(LabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 30));

        LabelHora_entrada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelHora_entrada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelHora_entrada.setText("HORA ENTRADA");
        PanelAmarillo.add(LabelHora_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 130, 30));

        LabelHora_salida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelHora_salida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelHora_salida.setText("HORA SALIDA");
        PanelAmarillo.add(LabelHora_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 130, 30));

        txtDateFecha.setForeground(new java.awt.Color(102, 102, 102));
        txtDateFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PanelAmarillo.add(txtDateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 240, 30));

        txtIdAtletas.setEditable(false);
        PanelAmarillo.add(txtIdAtletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, 30, 20));

        LabelObservaciones1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelObservaciones1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelObservaciones1.setText("OBSERVACIONES");
        PanelAmarillo.add(LabelObservaciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 120, 20));

        RadioButton_si.setBackground(new java.awt.Color(0, 204, 51));
        GRUPO_PAGO.add(RadioButton_si);
        RadioButton_si.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        RadioButton_si.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton_si.setText("SI CANCELO");
        RadioButton_si.setIconTextGap(10);
        RadioButton_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_siActionPerformed(evt);
            }
        });
        PanelAmarillo.add(RadioButton_si, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 110, 30));

        RadioButton_no.setBackground(new java.awt.Color(255, 0, 0));
        GRUPO_PAGO.add(RadioButton_no);
        RadioButton_no.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        RadioButton_no.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton_no.setText("NO CANCELO");
        PanelAmarillo.add(RadioButton_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 110, 30));

        LabelObservaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelObservaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelObservaciones.setText("CANCELACION PAGO");
        PanelAmarillo.add(LabelObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 130, 30));

        txtObservacion.setColumns(20);
        txtObservacion.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txtObservacion.setForeground(new java.awt.Color(102, 102, 102));
        txtObservacion.setRows(5);
        txtObservacion.setToolTipText("<html>\n<h4><p style=\"color:blue\">NOTA:<br>\nEs importante que coloque si el atleta cancelo,<br>\nno canceló o su pago es realizado mensual..</p></h4>\n</html>");
        jScrollPane2.setViewportView(txtObservacion);

        PanelAmarillo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 250, 80));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jSeparator1.setOpaque(true);
        PanelAmarillo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 5, 120));

        txtHora_entrada.setBackground(new java.awt.Color(8, 138, 41));
        txtHora_entrada.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtHora_entrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHora_entrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora_entrada.setToolTipText("<html>\n\n<p>Debe colocar un cero(0)<br>\nantes. Ejemplo: 03:45</p>\n</html>");
        txtHora_entrada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PanelAmarillo.add(txtHora_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 60, 30));

        txtHora_salida.setBackground(new java.awt.Color(153, 0, 0));
        txtHora_salida.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtHora_salida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHora_salida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora_salida.setToolTipText("<html>\n\n<p>Debe colocar un cero(0)<br>\nantes. Ejemplo: 03:45</p>\n</html>");
        txtHora_salida.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtHora_salida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PanelAmarillo.add(txtHora_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 60, 30));

        txtUsuario_id.setEditable(false);
        PanelAmarillo.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 30, 30, 20));

        btnAgregarAtleta.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarAtleta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregarAtleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAgregarAtletas.png"))); // NOI18N
        btnAgregarAtleta.setToolTipText("Agregar Atletas");
        btnAgregarAtleta.setBorderPainted(false);
        btnAgregarAtleta.setContentAreaFilled(false);
        btnAgregarAtleta.setIconTextGap(20);
        btnAgregarAtleta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAgregarAtletas2.png"))); // NOI18N
        btnAgregarAtleta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAgregarAtletas.png"))); // NOI18N
        btnAgregarAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_AGREGAR_ATLETAS(evt);
            }
        });
        PanelAmarillo.add(btnAgregarAtleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 130, 35));

        btnAddMensualidad.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAddMensualidad.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMensualidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAddMensualidad.png"))); // NOI18N
        btnAddMensualidad.setToolTipText("Agregar Mensualidad");
        btnAddMensualidad.setBorderPainted(false);
        btnAddMensualidad.setContentAreaFilled(false);
        btnAddMensualidad.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAddMensualidad2.png"))); // NOI18N
        btnAddMensualidad.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAddMensualidad.png"))); // NOI18N
        btnAddMensualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_ADD_MENSUALIDAD(evt);
            }
        });
        PanelAmarillo.add(btnAddMensualidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 130, 35));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVerMensualidad.png"))); // NOI18N
        jButton1.setToolTipText("Visualizar lista de Mensualidad");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVerMensualidad2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVerMensualidad.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_VER_MENSUALIDAD(evt);
            }
        });
        PanelAmarillo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 50, 130, 35));

        btnPagar.setBackground(new java.awt.Color(153, 204, 255));
        btnPagar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCobrar.png"))); // NOI18N
        btnPagar.setToolTipText("Efectuar Cobro");
        btnPagar.setBorderPainted(false);
        btnPagar.setContentAreaFilled(false);
        btnPagar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCobrar2.png"))); // NOI18N
        btnPagar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCobrar.png"))); // NOI18N
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_PAGAR(evt);
            }
        });
        PanelAmarillo.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 90, 130, 35));

        btnListarAtletas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnListarAtletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnListarAtletas.png"))); // NOI18N
        btnListarAtletas.setToolTipText("Ver Lista de Atletas");
        btnListarAtletas.setBorderPainted(false);
        btnListarAtletas.setContentAreaFilled(false);
        btnListarAtletas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnListarAtletas2.png"))); // NOI18N
        btnListarAtletas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnListarAtletas.png"))); // NOI18N
        btnListarAtletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_LISTAR_ATLETAS(evt);
            }
        });
        PanelAmarillo.add(btnListarAtletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 130, 35));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jSeparator3.setOpaque(true);
        PanelAmarillo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1073, 10, 5, 120));

        RadioButton_mensual.setBackground(new java.awt.Color(0, 102, 204));
        GRUPO_PAGO.add(RadioButton_mensual);
        RadioButton_mensual.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        RadioButton_mensual.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton_mensual.setText("PAGO MENSUAL");
        RadioButton_mensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_mensualActionPerformed(evt);
            }
        });
        PanelAmarillo.add(RadioButton_mensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 110, 30));

        LabelFecha1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelFecha1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelFecha1.setText("FECHA");
        PanelAmarillo.add(LabelFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 30));

        ComboBoxTiempo.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        ComboBoxTiempo.setForeground(new java.awt.Color(102, 102, 102));
        ComboBoxTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1 Hora", "2 Horas", "3 Horas", "4 Horas", "5 Horas", "6 Horas", "7 Horas", "8 Horas" }));
        PanelAmarillo.add(ComboBoxTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 240, 30));

        btnAgregarAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarAsistencia.png"))); // NOI18N
        btnAgregarAsistencia.setToolTipText("Agregar Asistencia");
        btnAgregarAsistencia.setBorderPainted(false);
        btnAgregarAsistencia.setContentAreaFilled(false);
        btnAgregarAsistencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarAsistencia2.png"))); // NOI18N
        btnAgregarAsistencia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarAsistencia.png"))); // NOI18N
        btnAgregarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAsistenciaActionPerformed(evt);
            }
        });
        PanelAmarillo.add(btnAgregarAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 130, 35));

        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerOperacionesAsistencia.png"))); // NOI18N
        LabelBanner.setToolTipText("");
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelBanner.setOpaque(true);
        PanelAmarillo.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -160, 1260, 150));

        txtIdasistencia.setEditable(false);
        PanelAmarillo.add(txtIdasistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 50, 30, -1));

        PanelPrincipal.add(PanelAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1260, 170));

        PanelVerde.setBackground(new java.awt.Color(0, 51, 102));
        PanelVerde.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelVerde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDesbloqueo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnDesbloqueo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDesbloqueo.png"))); // NOI18N
        btnDesbloqueo.setToolTipText("Desbloquear Botones");
        btnDesbloqueo.setBorderPainted(false);
        btnDesbloqueo.setContentAreaFilled(false);
        btnDesbloqueo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDesbloqueo2.png"))); // NOI18N
        btnDesbloqueo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDesbloqueo.png"))); // NOI18N
        btnDesbloqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesbloqueoActionPerformed(evt);
            }
        });
        PanelVerde.add(btnDesbloqueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 130, 35));

        btnPago_pendiente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnPago_pendiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnGuardarPagoP.png"))); // NOI18N
        btnPago_pendiente.setToolTipText("Guardar Pagos pendientes");
        btnPago_pendiente.setActionCommand(" PAGO PENDIENTE");
        btnPago_pendiente.setBorderPainted(false);
        btnPago_pendiente.setContentAreaFilled(false);
        btnPago_pendiente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnGuardarPagoP2.png"))); // NOI18N
        btnPago_pendiente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnGuardarPagoP.png"))); // NOI18N
        btnPago_pendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_PAGO_PENDIENTE(evt);
            }
        });
        PanelVerde.add(btnPago_pendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 35));

        btnVerPago_pendiente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnVerPago_pendiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVerPagoP.png"))); // NOI18N
        btnVerPago_pendiente.setToolTipText("Ver Pagos Pendientes");
        btnVerPago_pendiente.setBorderPainted(false);
        btnVerPago_pendiente.setContentAreaFilled(false);
        btnVerPago_pendiente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVerPagoP2.png"))); // NOI18N
        btnVerPago_pendiente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVerPagoP.png"))); // NOI18N
        btnVerPago_pendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_VER_PAGO_PENDIENTE(evt);
            }
        });
        PanelVerde.add(btnVerPago_pendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 190, 35));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalirControlAsist.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalirControlAsist2.png"))); // NOI18N
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalirControlAsist.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelVerde.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 130, 35));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEliminarControlAsist.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEliminarControlAsist2.png"))); // NOI18N
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEliminarControlAsist.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_ELIMINAR_PAGO(evt);
            }
        });
        PanelVerde.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 130, 35));

        btnEliminar_todo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnEliminar_todo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEliminarTodo.png"))); // NOI18N
        btnEliminar_todo.setToolTipText("Eliminar Todos");
        btnEliminar_todo.setBorderPainted(false);
        btnEliminar_todo.setContentAreaFilled(false);
        btnEliminar_todo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEliminarTodo2.png"))); // NOI18N
        btnEliminar_todo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEliminarTodo.png"))); // NOI18N
        btnEliminar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar_todoActionPerformed(evt);
            }
        });
        PanelVerde.add(btnEliminar_todo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 130, 35));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLimpiarControlA.png"))); // NOI18N
        btnLimpiar.setToolTipText("Limpiar");
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLimpiarControlA2.png"))); // NOI18N
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLimpiarControlA.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelVerde.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 130, 35));

        btnRecobrar_asistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresf_asistencia.png"))); // NOI18N
        btnRecobrar_asistencia.setToolTipText("Recobrar Asistencia");
        btnRecobrar_asistencia.setBorderPainted(false);
        btnRecobrar_asistencia.setContentAreaFilled(false);
        btnRecobrar_asistencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresf_asistencia2.png"))); // NOI18N
        btnRecobrar_asistencia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresf_asistencia.png"))); // NOI18N
        btnRecobrar_asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecobrar_asistenciaActionPerformed(evt);
            }
        });
        PanelVerde.add(btnRecobrar_asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 5, 70, 40));

        PanelPrincipal.add(PanelVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 1260, 50));

        TableAsistencia_diaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TableAsistencia_diaria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TableAsistencia_diaria.setForeground(new java.awt.Color(102, 102, 102));
        TableAsistencia_diaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CEDULA", "NOMBRES", "FECHA", "TIEMPO", "HORA ENTRADA", "HORA SALIDA", "CANCELACION", "OBSERVACION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableAsistencia_diaria.setNextFocusableComponent(txtHora_salida);
        TableAsistencia_diaria.setRowHeight(40);
        TableAsistencia_diaria.setSelectionBackground(new java.awt.Color(102, 102, 102));
        TableAsistencia_diaria.setShowVerticalLines(false);
        TableAsistencia_diaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableAsistencia_diariaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableAsistencia_diaria);
        if (TableAsistencia_diaria.getColumnModel().getColumnCount() > 0) {
            TableAsistencia_diaria.getColumnModel().getColumn(0).setMinWidth(50);
            TableAsistencia_diaria.getColumnModel().getColumn(0).setPreferredWidth(50);
            TableAsistencia_diaria.getColumnModel().getColumn(0).setMaxWidth(50);
            TableAsistencia_diaria.getColumnModel().getColumn(1).setMinWidth(80);
            TableAsistencia_diaria.getColumnModel().getColumn(1).setPreferredWidth(80);
            TableAsistencia_diaria.getColumnModel().getColumn(1).setMaxWidth(80);
            TableAsistencia_diaria.getColumnModel().getColumn(2).setMinWidth(250);
            TableAsistencia_diaria.getColumnModel().getColumn(2).setPreferredWidth(250);
            TableAsistencia_diaria.getColumnModel().getColumn(2).setMaxWidth(250);
            TableAsistencia_diaria.getColumnModel().getColumn(3).setMinWidth(120);
            TableAsistencia_diaria.getColumnModel().getColumn(3).setPreferredWidth(120);
            TableAsistencia_diaria.getColumnModel().getColumn(3).setMaxWidth(120);
            TableAsistencia_diaria.getColumnModel().getColumn(4).setMinWidth(100);
            TableAsistencia_diaria.getColumnModel().getColumn(4).setPreferredWidth(100);
            TableAsistencia_diaria.getColumnModel().getColumn(4).setMaxWidth(100);
            TableAsistencia_diaria.getColumnModel().getColumn(5).setMinWidth(120);
            TableAsistencia_diaria.getColumnModel().getColumn(5).setPreferredWidth(120);
            TableAsistencia_diaria.getColumnModel().getColumn(5).setMaxWidth(120);
            TableAsistencia_diaria.getColumnModel().getColumn(6).setMinWidth(120);
            TableAsistencia_diaria.getColumnModel().getColumn(6).setPreferredWidth(120);
            TableAsistencia_diaria.getColumnModel().getColumn(6).setMaxWidth(120);
            TableAsistencia_diaria.getColumnModel().getColumn(7).setMinWidth(120);
            TableAsistencia_diaria.getColumnModel().getColumn(7).setPreferredWidth(120);
            TableAsistencia_diaria.getColumnModel().getColumn(7).setMaxWidth(120);
            TableAsistencia_diaria.getColumnModel().getColumn(8).setMinWidth(300);
            TableAsistencia_diaria.getColumnModel().getColumn(8).setPreferredWidth(300);
            TableAsistencia_diaria.getColumnModel().getColumn(8).setMaxWidth(300);
        }
        TableAsistencia_diaria.getAccessibleContext().setAccessibleName("");

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 1230, 230));

        LabelFondoTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerControlPrincipal.png"))); // NOI18N
        PanelPrincipal.add(LabelFondoTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 1260, 290));

        LabelBanner1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerOperacionesAsistencia.png"))); // NOI18N
        LabelBanner1.setToolTipText("");
        LabelBanner1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelBanner1.setOpaque(true);
        PanelPrincipal.add(LabelBanner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1260, 150));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarAtletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAtletasActionPerformed

        Operaciones_Asistencia ADDMEN = null;
        buscaAtleta = new BuscarAtletas(ADDMEN, true);
        buscaAtleta.setVisible(true);
    }//GEN-LAST:event_btnBuscarAtletasActionPerformed

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!"".equals(txtCedula.getText())) {
                String cedula = txtCedula.getText();
                AtletasDao atletasDAO = new AtletasDao();
                Atletas atletas = new Atletas();

                atletas = atletasDAO.buscarAtletas_asistencia(cedula);

                if (atletas.getCedula() != 0) {
                    txtIdAtletas.setText("" + atletas.getIdatletas());
                    txtCedula.setText("" + atletas.getCedula());
                    txtNombres.setText("" + atletas.getNombres());

                } else {
                    txtIdAtletas.setText("");
                    txtCedula.setText("");
                    txtNombres.setText("");

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                    JOptionPane.showMessageDialog(this, "La cédula Ingresada no Existe",
                            "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                    txtCedula.requestFocus();
                    txtCedula.setText("");
                }
            } else {

                txtCedula.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void BOTON_ELIMINAR_PAGO(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_ELIMINAR_PAGO

        eliminarSoloUno();
    }//GEN-LAST:event_BOTON_ELIMINAR_PAGO

    private void btnEliminar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar_todoActionPerformed

        /*  FUNCION  PARA  ANULAR  LOS  PRODUCTOS  DEL  DETALLE  DE  LA   VENTA */
        if (TableAsistencia_diaria.getRowCount() > 0) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Eliminar todos los registros de Asistencia..?",
                    "ASISTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            if (opcion == 0) {

                try {
                    eliminarTodo_asistencia();
                } catch (SQLException ex) {
                    Logger.getLogger(Operaciones_Asistencia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEliminar_todoActionPerformed

    private void TableAsistencia_diariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAsistencia_diariaMouseClicked
         String pago = null;
        int filaSeleccionada = TableAsistencia_diaria.rowAtPoint(evt.getPoint());

        txtIdAtletas.setText(TableAsistencia_diaria.getValueAt(filaSeleccionada, 0).toString());
        txtCedula.setText(TableAsistencia_diaria.getValueAt(filaSeleccionada, 1).toString());
        txtNombres.setText(TableAsistencia_diaria.getValueAt(filaSeleccionada, 2).toString());
        try {
            Date fechaAsistencia = new SimpleDateFormat("dd-MM-yyyy").parse((String) TableAsistencia_diaria.getValueAt(filaSeleccionada, 3));
            txtDateFecha.setDate(fechaAsistencia);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        ComboBoxTiempo.setSelectedItem(TableAsistencia_diaria.getValueAt(filaSeleccionada, 4).toString());
        txtHora_entrada.setText(TableAsistencia_diaria.getValueAt(filaSeleccionada, 5).toString());
        txtHora_salida.setText(TableAsistencia_diaria.getValueAt(filaSeleccionada, 6).toString());
        txtObservacion.setText(TableAsistencia_diaria.getValueAt(filaSeleccionada, 8).toString());
       

    }//GEN-LAST:event_TableAsistencia_diariaMouseClicked

    private void RadioButton_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButton_siActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        if (TableAsistencia_diaria.getRowCount() > 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Si desea salir debe eliminar todos los registros de asistencia",
                    "Asistencia", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {
            Pagina_entrada.ingreAsistenciaOA = null;
            Administracion.ingreAsistenciaADM = null;
            ListarPagos_pendientes.pagaDeuda = null;
            this.dispose();

        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BOTON_AGREGAR_ATLETAS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_AGREGAR_ATLETAS

        if (Control_pagos.agregaAtletas != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de ATLETAS Esta Abierto en el Módulo de PAGOS",
                    "ASISTENCIAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        
        } else if (Operaciones_Asistencia.searchAtletas != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo  ATLETAS se encuentra abierto.",
                    "ASISTENCIAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            Operaciones_Asistencia ADDATLETAS = null;
            searchAtletas = new AgregarAtletas(ADDATLETAS, true);
            searchAtletas.setVisible(true);
            
        }
    }//GEN-LAST:event_BOTON_AGREGAR_ATLETAS

    private void BOTON_PAGAR(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_PAGAR
        if (Administracion.addPagos != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Pago esta abierto en el módulo administracion",
                    "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (ListarPagos_pendientes.pagaDeuda != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo de Pago esta abierto en el módulo de Pagos Pendientes",
                    "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
        } else {

            if (ingrePagos == null) {

                ingrePagos = new Control_pagos(usuar);
                ingrePagos.setVisible(true);
            }
        }
    }//GEN-LAST:event_BOTON_PAGAR

    private void BOTON_PAGO_PENDIENTE(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_PAGO_PENDIENTE

        pagosPendientes();
        eliminarSoloUno();
    }//GEN-LAST:event_BOTON_PAGO_PENDIENTE

    private void BOTON_VER_PAGO_PENDIENTE(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_VER_PAGO_PENDIENTE
        if (listPagos == null) {

            try {
                listPagos = new ListarPagos_pendientes(usuar);
            } catch (SQLException ex) {
                Logger.getLogger(Operaciones_Asistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
            listPagos.setVisible(true);
        }

    }//GEN-LAST:event_BOTON_VER_PAGO_PENDIENTE

    private void BOTON_ADD_MENSUALIDAD(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_ADD_MENSUALIDAD

        if (addMensualidad == null) {

            addMensualidad = new AgregarMensualidad(usuar);

            addMensualidad.setVisible(true);
        }

    }//GEN-LAST:event_BOTON_ADD_MENSUALIDAD

    private void BOTON_VER_MENSUALIDAD(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_VER_MENSUALIDAD

        if (listMensualidad == null) {

            try {
                listMensualidad = new ListarMensualidad(usuar);
            } catch (SQLException ex) {
                Logger.getLogger(Operaciones_Asistencia.class.getName()).log(Level.SEVERE, null, ex);
            }

            listMensualidad.setVisible(true);
        }

    }//GEN-LAST:event_BOTON_VER_MENSUALIDAD

    private void BOTON_LISTAR_ATLETAS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_LISTAR_ATLETAS

        if (lista_de_atletas == null) {

            try {
                lista_de_atletas = new ListarAtletas(usuar);
            } catch (SQLException ex) {
                Logger.getLogger(Operaciones_Asistencia.class.getName()).log(Level.SEVERE, null, ex);
            }

            lista_de_atletas.setVisible(true);
        }
    }//GEN-LAST:event_BOTON_LISTAR_ATLETAS

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void RadioButton_mensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_mensualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButton_mensualActionPerformed

    private void btnDesbloqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesbloqueoActionPerformed

        if (ingreLogin_activar == null) {

            ingreLogin_activar = new LoginActivar();
            ingreLogin_activar.setVisible(true);
        }
    }//GEN-LAST:event_btnDesbloqueoActionPerformed

    private void btnAgregarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAsistenciaActionPerformed

        agregarAsistencia_hoy();
        try {

            if (txtCedula.getText().equals("") || txtNombres.getText().equals("") || txtDateFecha.getDate() == (null) || txtHora_entrada.getText().equals("") || txtHora_salida.getText().equals("") || txtObservacion.getText().equals("")) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                JOptionPane.showMessageDialog(this, "No debe haber campos vacios ",
                        "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                txtCedula.requestFocus();
                return;
            }
            GuardarAsistencia();
        } catch (SQLException | FileNotFoundException ex) {
            Logger.getLogger(Operaciones_Asistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarAsistenciaActionPerformed

    private void btnRecobrar_asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecobrar_asistenciaActionPerformed

        Operaciones_Asistencia TRAEASISTENCIA = null;
        buscaAsistencia = new BuscarAsistencia(TRAEASISTENCIA, true);
        buscaAsistencia.setVisible(true);
    }//GEN-LAST:event_btnRecobrar_asistenciaActionPerformed

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
            java.util.logging.Logger.getLogger(Operaciones_Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Operaciones_Asistencia().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> ComboBoxTiempo;
    private javax.swing.ButtonGroup GRUPO_PAGO;
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JLabel LabelBanner1;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelFecha1;
    private javax.swing.JLabel LabelFondoTabla;
    private javax.swing.JLabel LabelHora_entrada;
    private javax.swing.JLabel LabelHora_salida;
    private javax.swing.JLabel LabelNombres;
    private javax.swing.JLabel LabelObservaciones;
    private javax.swing.JLabel LabelObservaciones1;
    private javax.swing.JPanel PanelAmarillo;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelVerde;
    public static javax.swing.JRadioButton RadioButton_mensual;
    public static javax.swing.JRadioButton RadioButton_no;
    public static javax.swing.JRadioButton RadioButton_si;
    private javax.swing.JTable TableAsistencia_diaria;
    public static javax.swing.JButton btnAddMensualidad;
    private javax.swing.JButton btnAgregarAsistencia;
    private javax.swing.JButton btnAgregarAtleta;
    private javax.swing.JButton btnBuscarAtletas;
    private javax.swing.JButton btnDesbloqueo;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnEliminar_todo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListarAtletas;
    public static javax.swing.JButton btnPagar;
    private javax.swing.JButton btnPago_pendiente;
    private javax.swing.JButton btnRecobrar_asistencia;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JButton btnVerPago_pendiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JTextField txtCedula;
    public static com.toedter.calendar.JDateChooser txtDateFecha;
    public static javax.swing.JFormattedTextField txtHora_entrada;
    public static javax.swing.JFormattedTextField txtHora_salida;
    public static javax.swing.JTextField txtIdAtletas;
    public static javax.swing.JTextField txtIdasistencia;
    public static javax.swing.JTextField txtNombres;
    public static javax.swing.JTextArea txtObservacion;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables


    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
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

    public void limpia_Asistencia() {

        txtIdAtletas.setText("");
        txtCedula.setText("");
        txtNombres.setText("");
        txtDateFecha.setDate(null);
        ComboBoxTiempo.setSelectedIndex(0);
        txtHora_entrada.setText("");
        txtHora_salida.setText("");
        txtObservacion.setText("");
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
 /*  FUNCION  PARA  ANULAR   TODOS  LOS ITEM  DE LA TABLA DE ASISTENCIA -- */
    public void eliminarTodo_asistencia() throws SQLException {

        if (TableAsistencia_diaria.getRowCount() > 0) {
            DefaultTableModel modelo = new DefaultTableModel(0, TableAsistencia_diaria.getColumnCount());
            TableAsistencia_diaria.setModel(modelo);

            modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("CEDULA");
            modelo.addColumn("NOMBRES");
            modelo.addColumn("FECHA");
            modelo.addColumn("TIEMPO");
            modelo.addColumn("HORA ENTRADA");
            modelo.addColumn("HORA SALIDA");
            modelo.addColumn("CANCELACION");
            modelo.addColumn("OBSERVACIONES");

            TableAsistencia_diaria.setModel(modelo);

            txtIdAtletas.setText("");
            txtCedula.setText("");
            txtNombres.setText("");
            txtDateFecha.setDate(null);
            ComboBoxTiempo.setSelectedIndex(0);
            txtHora_entrada.setText("");
            txtHora_salida.setText("");
            txtObservacion.setText("");

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Todos los registros han sido Eliminados...!!",
                    "Asistencia", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            txtCedula.requestFocus();

        } else {
            txtCedula.requestFocus();

        }
    }

    /*  FUNCION  PARA VALIDAR LOS CAMPOS DE LA HORA -- */
    public boolean validar_campoHora(String hora) {
        boolean b;

        @SuppressWarnings("RedundantStringToString")
        char[] a = hora.toString().toCharArray();
        String[] c = hora.split(":");
        if ((a[0] == ' ') || (a[1] == ' ') || (a[2] == ' ') || (a[3] == ' ') || (a[4] == ' ') || (getInteger(c[0]) > 24) || (getInteger(c[1]) > 59)) {

            b = false;

        } else {
            b = true;
        }

        return b;

    }

    public int getInteger(String valor) {
        int integer = Integer.parseInt(valor);
        return integer;
    }

    /*  ***********************************************************************************************************************************  */
 /* FUNCION PARA ELIMINAR UN REGISTRO DE LA TABLA ASISTENCIAS  */
    public void eliminarSoloUno() {

        if (this.TableAsistencia_diaria.getRowCount() == 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "No hay registros para Eliminar",
                    "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
        }

        //  ELIMINAR  UN  ATLETA  DE LA LISTA
        if (TableAsistencia_diaria.getRowCount() > 0) {
            if (this.TableAsistencia_diaria.getSelectedRow() == -1) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                JOptionPane.showMessageDialog(this, "Seleccione un registros para Eliminar",
                        "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            } else {
                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Eliminar este registro de Asistencia..?",
                        "ASISTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                if (opcion == 0) {
                    DefaultTableModel modelo = new DefaultTableModel();
                    modelo = (DefaultTableModel) TableAsistencia_diaria.getModel();
                    modelo.removeRow(TableAsistencia_diaria.getSelectedRow());

                    txtCedula.requestFocus();

                    if (this.TableAsistencia_diaria.getRowCount() == 0) {
                    txtIdAtletas.setText("");
                    txtCedula.setText("");
                    txtNombres.setText("");
                    txtDateFecha.setDate(null);
                    ComboBoxTiempo.setSelectedIndex(0);
                    txtHora_entrada.setText("");
                    txtHora_salida.setText("");
                    txtObservacion.setText("");
                    
                    txtCedula.requestFocus();
                    }
                    } else {
                    
                    txtCedula.requestFocus();
                    }
            }
        }
    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
 /* FUNCION PARA GUARDAR LOS PAGOS QUE QUEDAN PENDIENTES */
    public void pagosPendientes() {

        try {

            PagoPendiente pagoPen = new PagoPendiente();
            PagoPendienteDao pagoPenDAO = new PagoPendienteDao();

            if (txtCedula.getText().equals("") || txtNombres.getText().equals("") || txtDateFecha.getDate() == null || txtHora_entrada.getText().equals("") || txtHora_salida.getText().equals("") || txtObservacion.getText().equals("")) {
                UI = null;
                UIManager.put("OptionPane.background", new Color(245, 245, 245));
                UIManager.put("Panel.background", new Color(245, 245, 245));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                JOptionPane.showMessageDialog(this, "Seleccione un registro de la tabla... ¡¡¡No Debe Haber Campos Vacios",
                        "Pago-Pendiente", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            } else {
                String fecha;
                java.util.Date date = new java.util.Date();
                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                //fecha = f.format(txtDateFecha.getDate());

                pagoPen.setCedula(txtCedula.getText());
                pagoPen.setNombres(txtNombres.getText());
                pagoPen.setFecha(f.format(txtDateFecha.getDate()));
                pagoPen.setTiempo((String) ComboBoxTiempo.getSelectedItem());
                pagoPen.setHora_entrada(txtHora_entrada.getText());
                pagoPen.setHora_salida(txtHora_salida.getText());
                pagoPen.setObservaciones(txtObservacion.getText());

                if (pagoPenDAO.agregarPagosPendientes(pagoPen)) {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(245, 245, 245));
                    UIManager.put("Panel.background", new Color(245, 245, 245));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "Los Datos Se Guardaron Correctamente",
                            "Pago-Pendiente", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                    limpia_Asistencia();

                } else {
                    JOptionPane.showMessageDialog(this, "Lo siento...!!! Ha Ocurrido Un Error Guardando Los Datos");
                }

            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {

            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    // FUNCION PARA LIMPIAR LOS CAMPOS 
    public void limpiar() {

        txtIdAtletas.setText("");
        txtCedula.setText("");
        txtNombres.setText("");
        txtDateFecha.setDate(null);
        ComboBoxTiempo.setSelectedIndex(0);
        txtHora_entrada.setText("");
        txtHora_salida.setText("");
        txtObservacion.setText("");

    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
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
    public void agregarAsistencia_hoy() {

        if (txtCedula.getText().equals("")) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Introduzca un Número de Cedula ",
                    "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (txtNombres.getText().equals("")) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Introduzca los Nombres ",
                    "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (ComboBoxTiempo.getSelectedIndex() == 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Seleccionar El Tiempo Que Va a Entrenar ",
                    "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (txtHora_entrada.getText().equals("")) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Seleccionar la Hora de Entrada ",
                    "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (txtHora_salida.getText().equals("")) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Seleccionar la Hora de Salida ",
                    "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (validar_campoHora(txtHora_entrada.getText()) == false) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "La hora de 'ENTRADA' es incorrecta o Debe Colocar la Hora de Entrada",
                    "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (validar_campoHora(txtHora_salida.getText()) == false) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "La hora de 'SALIDA' es incorrecta o Debe Colocar la Hora de Salida",
                    "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (txtObservacion.getText().equals("")) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Escriba si hay alguna Observación",
                    "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else if (txtDateFecha.getDate() == (null)) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Seleccionar la Fecha ",
                    "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            String fecha;
            String pago = null;

            java.util.Date date = new java.util.Date();
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
            fecha = f.format(txtDateFecha.getDate());

            String idatletas = txtIdAtletas.getText();
            String cedula = txtCedula.getText();
            String nombres = txtNombres.getText();
            String fecha_asistencia = (fecha);
            String tiempo = (String) ComboBoxTiempo.getSelectedItem();
            String horaEntrada = txtHora_entrada.getText();
            String horaSalida = txtHora_salida.getText();

            if (RadioButton_si.isSelected()) {
                pago = RadioButton_si.getLabel();
            } else if (RadioButton_no.isSelected()) {
                pago = RadioButton_no.getLabel();
            }
            String cancelacion = pago;
            String observacion = txtObservacion.getText();

            item = item + 1;
            DefaultTableModel modelo = new DefaultTableModel();

            modelo = (DefaultTableModel) TableAsistencia_diaria.getModel();
            for (int i = 0; i < TableAsistencia_diaria.getRowCount(); i++) {
                if (TableAsistencia_diaria.getValueAt(i, 1).equals(txtCedula.getText())) {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                    JOptionPane.showMessageDialog(this, "El Atleta ya está Agregado",
                            "ASISTENCIA", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                    //limpia_Asistencia();
                    txtCedula.requestFocus();

                    return;
                }
            }
            TableAsistencia_diaria.getColumnModel().getColumn(7).setCellRenderer(new RenderPintarCeldas_tbl_asistencia());
            ArrayList listaVenta = new ArrayList();
            listaVenta.add(item);
            listaVenta.add(idatletas);
            listaVenta.add(cedula);
            listaVenta.add(nombres);
            listaVenta.add(fecha_asistencia);
            listaVenta.add(tiempo);
            listaVenta.add(horaEntrada);
            listaVenta.add(horaSalida);
            listaVenta.add(cancelacion);
            listaVenta.add(observacion);

            Object[] objVenta = new Object[9];

            objVenta[0] = listaVenta.get(1);
            objVenta[1] = listaVenta.get(2);
            objVenta[2] = listaVenta.get(3);
            objVenta[3] = listaVenta.get(4);
            objVenta[4] = listaVenta.get(5);
            objVenta[5] = listaVenta.get(6);
            objVenta[6] = listaVenta.get(7);
            objVenta[7] = listaVenta.get(8);
            objVenta[8] = listaVenta.get(9);

            modelo.addRow(objVenta);

        }
    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION  PARA AGREGAR LOS ATLETAS A LA TABLA ASISTENCIA DIARIA
    public void GuardarAsistencia() throws SQLException, FileNotFoundException {

        Connection conn = conexion.conectar();

        String insertar = "INSERT INTO asistencia(cedula,nombres,fecha,tiempo,hora_entrada,hora_salida,cancelacion,observaciones) values (?,?,?,?,?,?,?,?)";

        String fecha_asistencia;
        String pago;

        PreparedStatement pst = conn.prepareStatement(insertar);
        java.util.Date date = new java.util.Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        fecha_asistencia = f.format(txtDateFecha.getDate());

        pst.setString(1, txtCedula.getText());
        pst.setString(2, txtNombres.getText());
        pst.setString(3, fecha_asistencia);
        pst.setString(4, ComboBoxTiempo.getItemAt(ComboBoxTiempo.getSelectedIndex()));
        pst.setString(5, txtHora_entrada.getText());
        pst.setString(6, txtHora_salida.getText());

        if (RadioButton_si.isSelected()) {
            pago = RadioButton_si.getLabel();
            pst.setString(7, pago);
        } else if (RadioButton_no.isSelected()) {
            pago = RadioButton_no.getLabel();
            pst.setString(7, pago);
        } else if (RadioButton_mensual.isSelected()) {
            pago = RadioButton_mensual.getLabel();
            pst.setString(7, pago);
        }
        pst.setString(8, txtObservacion.getText());

        pst.executeUpdate();

        UI = null;
        UIManager.put("OptionPane.background", new Color(255, 255, 255));
        UIManager.put("Panel.background", new Color(255, 255, 255));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
        UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
        JOptionPane.showMessageDialog(this, "Su Asistencia se guardó satisfactoriamente...!!!!",
                "ASISTENCIA", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        limpia_Asistencia();

    }
    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
}
