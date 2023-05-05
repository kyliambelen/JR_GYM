package vistas;

import Excel_reportes.RutinasExcel;
import bd.Conexion;
import dao.RutinasDao;
import entidades.CboxSelectAtletas;
import entidades.Rutinas;
import entidades.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class Operaciones_rutinas extends javax.swing.JFrame {

    UIManager UI;
    Usuarios usuar;
    private final Conexion conexion = new Conexion();
    public static ReporteTodasRutinas todasRutinas;
    public static ReporteRutinasCedula rutinaCedula;
    public static ReporteRutinas_fecha rutinaFecha;

    public Operaciones_rutinas() {

        initComponents();

        this.setTitle("OPERACIONES RUTINAS");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setIconImage(getIconImage());
        txtIdatletas.setVisible(false);
        txtUsuario_id.setVisible(false);
        txtIdrutina.setVisible(false);

        visualizar_tabla_rutinas(TableRutinas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelNaranja = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        LabelBanner = new javax.swing.JLabel();
        PanelGris_oscuro = new javax.swing.JPanel();
        PanelGris = new javax.swing.JPanel();
        LabelNombre = new javax.swing.JLabel();
        LabelEntrenador1 = new javax.swing.JLabel();
        txtEntrenador = new javax.swing.JTextField();
        LabelFecha = new javax.swing.JLabel();
        LabelBuscarTabla = new javax.swing.JLabel();
        DateChFecha = new com.toedter.calendar.JDateChooser();
        txtDia = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        ComboBoxId_atletas = new javax.swing.JComboBox<>();
        txtCedula_rutina = new javax.swing.JTextField();
        LabelNombre1 = new javax.swing.JLabel();
        LabelRutina1 = new javax.swing.JLabel();
        txtRutina = new javax.swing.JTextField();
        LabelModalidad1 = new javax.swing.JLabel();
        txtModalidad = new javax.swing.JTextField();
        LabelEjercicio1 = new javax.swing.JLabel();
        txtEjercicio = new javax.swing.JTextField();
        LabelSerie1 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        LabelRepeticiones1 = new javax.swing.JLabel();
        txtRepeticiones = new javax.swing.JTextField();
        LabelDescanso1 = new javax.swing.JLabel();
        txtDescanso = new javax.swing.JTextField();
        btnEditarRu = new javax.swing.JButton();
        btnEliminarRu = new javax.swing.JButton();
        btnLimpiarRu = new javax.swing.JButton();
        btnSalirRu = new javax.swing.JButton();
        btnEliminar_todo_rutina = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableRutinas = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        LabelBuscar_tabla = new javax.swing.JLabel();
        txtUsuario_id = new javax.swing.JTextField();
        txtIdrutina = new javax.swing.JTextField();
        txtIdatletas = new javax.swing.JTextField();
        jMenuReportExcel = new javax.swing.JMenuBar();
        MenuRutinas = new javax.swing.JMenu();
        menuRutinas = new javax.swing.JMenuItem();
        menuRutina_cedula = new javax.swing.JMenuItem();
        menuRutina_fecha = new javax.swing.JMenuItem();
        MenuReporte_excel = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelNaranja.setBackground(new java.awt.Color(254, 191, 0));
        PanelNaranja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));
        PanelNaranja.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 490, 10));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelNaranja.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 10));

        PanelPrincipal.add(PanelNaranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1000, 30));

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoJR3.png"))); // NOI18N
        PanelPrincipal.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 150));

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 153, 255));
        LabelTitulo.setText("ADMINISTRAR RUTINAS");
        PanelPrincipal.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banner44.jpg"))); // NOI18N
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelPrincipal.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1250, 150));

        PanelGris_oscuro.setBackground(new java.awt.Color(0, 153, 255));
        PanelGris_oscuro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris_oscuro.setEnabled(false);
        PanelGris_oscuro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGris.setBackground(new java.awt.Color(102, 102, 102));
        PanelGris.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre.setText("CEDULA");
        PanelGris.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 28));

        LabelEntrenador1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelEntrenador1.setForeground(new java.awt.Color(255, 255, 255));
        LabelEntrenador1.setText("ENTRENADOR");
        PanelGris.add(LabelEntrenador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 90, 28));

        txtEntrenador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEntrenador.setForeground(new java.awt.Color(0, 0, 153));
        txtEntrenador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris.add(txtEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 220, 28));

        LabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        LabelFecha.setText("FECHA");
        PanelGris.add(LabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 50, 30));

        LabelBuscarTabla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelBuscarTabla.setForeground(new java.awt.Color(255, 255, 255));
        LabelBuscarTabla.setText("DIA");
        PanelGris.add(LabelBuscarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 30, 28));

        DateChFecha.setBackground(new java.awt.Color(204, 204, 255));
        DateChFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        DateChFecha.setForeground(new java.awt.Color(255, 0, 51));
        DateChFecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PanelGris.add(DateChFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 140, 28));

        txtDia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDia.setForeground(new java.awt.Color(0, 0, 153));
        txtDia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 140, 28));

        txtNombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 0, 153));
        txtNombres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 220, 28));

        PanelGris.add(ComboBoxId_atletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 30));

        txtCedula_rutina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCedula_rutina.setForeground(new java.awt.Color(0, 0, 153));
        txtCedula_rutina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris.add(txtCedula_rutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 10, 90, 28));

        LabelNombre1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelNombre1.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre1.setText("NOMBRES");
        PanelGris.add(LabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 70, 28));

        PanelGris_oscuro.add(PanelGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1230, 50));

        LabelRutina1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelRutina1.setForeground(new java.awt.Color(255, 255, 0));
        LabelRutina1.setText("RUTINAS ");
        PanelGris_oscuro.add(LabelRutina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, 20));

        txtRutina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRutina.setForeground(new java.awt.Color(0, 0, 153));
        txtRutina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris_oscuro.add(txtRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        LabelModalidad1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelModalidad1.setForeground(new java.awt.Color(255, 255, 255));
        LabelModalidad1.setText("MODALIDAD");
        PanelGris_oscuro.add(LabelModalidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 90, 20));

        txtModalidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtModalidad.setForeground(new java.awt.Color(0, 0, 153));
        txtModalidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris_oscuro.add(txtModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 160, 30));

        LabelEjercicio1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelEjercicio1.setForeground(new java.awt.Color(255, 255, 255));
        LabelEjercicio1.setText("EJERCICIO");
        PanelGris_oscuro.add(LabelEjercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 90, 20));

        txtEjercicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEjercicio.setForeground(new java.awt.Color(0, 0, 153));
        txtEjercicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris_oscuro.add(txtEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 390, 30));

        LabelSerie1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelSerie1.setForeground(new java.awt.Color(255, 255, 255));
        LabelSerie1.setText("SERIE");
        PanelGris_oscuro.add(LabelSerie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 50, 20));

        txtSerie.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSerie.setForeground(new java.awt.Color(0, 0, 153));
        txtSerie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris_oscuro.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 150, 30));

        LabelRepeticiones1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelRepeticiones1.setForeground(new java.awt.Color(255, 255, 255));
        LabelRepeticiones1.setText("REPETICIONES");
        PanelGris_oscuro.add(LabelRepeticiones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, 90, 22));

        txtRepeticiones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRepeticiones.setForeground(new java.awt.Color(0, 0, 153));
        txtRepeticiones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris_oscuro.add(txtRepeticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 150, 30));

        LabelDescanso1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelDescanso1.setForeground(new java.awt.Color(255, 255, 255));
        LabelDescanso1.setText("DESCANSO");
        PanelGris_oscuro.add(LabelDescanso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 80, 70, 22));

        txtDescanso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDescanso.setForeground(new java.awt.Color(0, 0, 153));
        txtDescanso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris_oscuro.add(txtDescanso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 110, 150, 30));

        btnEditarRu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarRutinas.png"))); // NOI18N
        btnEditarRu.setBorderPainted(false);
        btnEditarRu.setContentAreaFilled(false);
        btnEditarRu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarRutinas2.png"))); // NOI18N
        btnEditarRu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarRutinas.png"))); // NOI18N
        btnEditarRu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRuActionPerformed(evt);
            }
        });
        PanelGris_oscuro.add(btnEditarRu, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 150, 30));

        btnEliminarRu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarRutinas.png"))); // NOI18N
        btnEliminarRu.setBorderPainted(false);
        btnEliminarRu.setContentAreaFilled(false);
        btnEliminarRu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarRutinas2.png"))); // NOI18N
        btnEliminarRu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarRutinas.png"))); // NOI18N
        btnEliminarRu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRuActionPerformed(evt);
            }
        });
        PanelGris_oscuro.add(btnEliminarRu, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 150, 30));

        btnLimpiarRu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarRutinas.png"))); // NOI18N
        btnLimpiarRu.setBorderPainted(false);
        btnLimpiarRu.setContentAreaFilled(false);
        btnLimpiarRu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarRutinas2.png"))); // NOI18N
        btnLimpiarRu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarRutinas.png"))); // NOI18N
        btnLimpiarRu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarRuActionPerformed(evt);
            }
        });
        PanelGris_oscuro.add(btnLimpiarRu, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 150, 30));

        btnSalirRu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirRutinas2.png"))); // NOI18N
        btnSalirRu.setBorderPainted(false);
        btnSalirRu.setContentAreaFilled(false);
        btnSalirRu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirRutinas.png"))); // NOI18N
        btnSalirRu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirRutinas2.png"))); // NOI18N
        btnSalirRu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRuActionPerformed(evt);
            }
        });
        PanelGris_oscuro.add(btnSalirRu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 150, 150, 30));

        btnEliminar_todo_rutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminartodoRutinas.png"))); // NOI18N
        btnEliminar_todo_rutina.setBorderPainted(false);
        btnEliminar_todo_rutina.setContentAreaFilled(false);
        btnEliminar_todo_rutina.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminartodoRutinas2.png"))); // NOI18N
        btnEliminar_todo_rutina.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminartodoRutinas.png"))); // NOI18N
        btnEliminar_todo_rutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar_todo_rutinaActionPerformed(evt);
            }
        });
        PanelGris_oscuro.add(btnEliminar_todo_rutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 150, 30));

        PanelPrincipal.add(PanelGris_oscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 1250, 190));

        TableRutinas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TableRutinas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TableRutinas.setForeground(new java.awt.Color(102, 102, 102));
        TableRutinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CEDULA", "NOMBRE", "ENTRENADOR", "DIA", "FECHA", "RUTINAS", "MODALIDAD", "EJERCICIO", "SERIE", "REPETICIONES", "DESCANSO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableRutinas.setRowHeight(18);
        TableRutinas.setSelectionBackground(new java.awt.Color(255, 198, 21));
        TableRutinas.setShowVerticalLines(false);
        TableRutinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableRutinasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableRutinas);

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 1250, 190));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        PanelPrincipal.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 220, 230, 25));

        LabelBuscar_tabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarjr.png"))); // NOI18N
        PanelPrincipal.add(LabelBuscar_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 220, -1, -1));

        txtUsuario_id.setEditable(false);
        PanelPrincipal.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 200, 30, 20));

        txtIdrutina.setEditable(false);
        txtIdrutina.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        PanelPrincipal.add(txtIdrutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 200, 30, -1));

        txtIdatletas.setEditable(false);
        txtIdatletas.setEnabled(false);
        PanelPrincipal.add(txtIdatletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 200, 30, -1));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        jMenuReportExcel.setBackground(new java.awt.Color(0, 153, 255));
        jMenuReportExcel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jMenuReportExcel.setForeground(new java.awt.Color(255, 0, 51));
        jMenuReportExcel.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jMenuReportExcel.setOpaque(false);
        jMenuReportExcel.setPreferredSize(new java.awt.Dimension(63, 35));

        MenuRutinas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuRutinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportesRutinas.jpg"))); // NOI18N
        MenuRutinas.setText("     REPORTES");
        MenuRutinas.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuRutinas.setIconTextGap(0);
        MenuRutinas.setMinimumSize(new java.awt.Dimension(29, 25));
        MenuRutinas.setPreferredSize(new java.awt.Dimension(214, 20));

        menuRutinas.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        menuRutinas.setText("RUTINAS");
        menuRutinas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuRutinas.setPreferredSize(new java.awt.Dimension(210, 30));
        menuRutinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRutinasActionPerformed(evt);
            }
        });
        MenuRutinas.add(menuRutinas);

        menuRutina_cedula.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        menuRutina_cedula.setText("RUTINAS POR CEDULA");
        menuRutina_cedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuRutina_cedula.setPreferredSize(new java.awt.Dimension(210, 30));
        menuRutina_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRutina_cedulaActionPerformed(evt);
            }
        });
        MenuRutinas.add(menuRutina_cedula);

        menuRutina_fecha.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        menuRutina_fecha.setText("RUTINAS POR FECHA");
        menuRutina_fecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuRutina_fecha.setPreferredSize(new java.awt.Dimension(210, 30));
        menuRutina_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRutina_fechaActionPerformed(evt);
            }
        });
        MenuRutinas.add(menuRutina_fecha);

        jMenuReportExcel.add(MenuRutinas);

        MenuReporte_excel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuReporte_excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excel.jpg"))); // NOI18N
        MenuReporte_excel.setText("     EXCEL");
        MenuReporte_excel.setAutoscrolls(true);
        MenuReporte_excel.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuReporte_excel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MenuReporte_excel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuReporte_excel.setIconTextGap(0);
        MenuReporte_excel.setInheritsPopupMenu(true);
        MenuReporte_excel.setMinimumSize(new java.awt.Dimension(130, 20));
        MenuReporte_excel.setPreferredSize(new java.awt.Dimension(178, 20));
        MenuReporte_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReporte_excelActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jMenuItem1.setText("REPORTE EXCEL");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem1.setPreferredSize(new java.awt.Dimension(175, 30));
        jMenuItem1.setRequestFocusEnabled(false);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuReporte_excel.add(jMenuItem1);

        jMenuReportExcel.add(MenuReporte_excel);

        setJMenuBar(jMenuReportExcel);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        buscarRutinas(txtBuscar.getText());
        if (txtBuscar.getText().isEmpty()) {

            visualizar_tabla_rutinas(TableRutinas);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void TableRutinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableRutinasMouseClicked

        try {

            Connection conn = conexion.conectar();
            String fecha;
            java.util.Date date = new java.util.Date();
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
            //fecha = f.format(DateChFecha.getDate());
            int Fila = TableRutinas.getSelectedRow();
            int ID = (Integer.parseInt(TableRutinas.getValueAt(Fila, 0).toString()));

            PreparedStatement pst = conn.prepareStatement("SELECT * FROM rutinas WHERE idrutina = '" + ID + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                //Datos consultados

                txtIdrutina.setText(rs.getString("idrutina"));
                txtIdatletas.setText(rs.getString("idatletas"));
                txtCedula_rutina.setText(rs.getString("cedula"));
                txtNombres.setText(rs.getString("nombres"));
                txtEntrenador.setText(rs.getString("entrenador"));
                txtDia.setText(rs.getString("dia"));
                DateChFecha.setDate(rs.getDate("fecha_rutina"));
                txtRutina.setText(rs.getString("rutinas"));
                txtModalidad.setText(rs.getString("modalidad"));
                txtEjercicio.setText(rs.getString("ejercicio"));
                txtSerie.setText(rs.getString("serie"));
                txtRepeticiones.setText(rs.getString("repeticiones"));
                txtDescanso.setText(rs.getString("descanso"));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error al cargar!");

        }
    }//GEN-LAST:event_TableRutinasMouseClicked

    private void btnEditarRuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRuActionPerformed

        try {
            editarRutinas();
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones_rutinas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarRuActionPerformed

    private void btnEliminarRuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRuActionPerformed

        eliminar_item_rutinas();

    }//GEN-LAST:event_btnEliminarRuActionPerformed

    private void btnEliminar_todo_rutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar_todo_rutinaActionPerformed

        eliminar_todo_rutinas();

    }//GEN-LAST:event_btnEliminar_todo_rutinaActionPerformed

    private void btnSalirRuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRuActionPerformed

        Administracion.opeRutinas = null;

        this.dispose();
    }//GEN-LAST:event_btnSalirRuActionPerformed

    private void menuRutina_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRutina_cedulaActionPerformed

        if (rutinaCedula == null) {

            rutinaCedula = new ReporteRutinasCedula();
            rutinaCedula.setVisible(true);
        }
    }//GEN-LAST:event_menuRutina_cedulaActionPerformed

    private void menuRutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRutinasActionPerformed
        if (todasRutinas == null) {

            todasRutinas = new ReporteTodasRutinas();
            todasRutinas.setVisible(true);
        }
    }//GEN-LAST:event_menuRutinasActionPerformed

    private void menuRutina_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRutina_fechaActionPerformed

        if (rutinaFecha == null) {

            rutinaFecha = new ReporteRutinas_fecha();
            rutinaFecha.setVisible(true);
        }
    }//GEN-LAST:event_menuRutina_fechaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        RutinasExcel.reporteRutinas();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnLimpiarRuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarRuActionPerformed

        limpiar_campos();
    }//GEN-LAST:event_btnLimpiarRuActionPerformed

    private void MenuReporte_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReporte_excelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuReporte_excelActionPerformed

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
            java.util.logging.Logger.getLogger(Operaciones_rutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones_rutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones_rutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones_rutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Operaciones_rutinas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<CboxSelectAtletas> ComboBoxId_atletas;
    public static com.toedter.calendar.JDateChooser DateChFecha;
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JLabel LabelBuscarTabla;
    private javax.swing.JLabel LabelBuscar_tabla;
    private javax.swing.JLabel LabelDescanso1;
    private javax.swing.JLabel LabelEjercicio1;
    private javax.swing.JLabel LabelEntrenador1;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelModalidad1;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelNombre1;
    private javax.swing.JLabel LabelRepeticiones1;
    private javax.swing.JLabel LabelRutina1;
    private javax.swing.JLabel LabelSerie1;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JMenu MenuReporte_excel;
    private javax.swing.JMenu MenuRutinas;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelGris;
    private javax.swing.JPanel PanelGris_oscuro;
    private javax.swing.JPanel PanelNaranja;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTable TableRutinas;
    private javax.swing.JButton btnEditarRu;
    private javax.swing.JButton btnEliminarRu;
    private javax.swing.JButton btnEliminar_todo_rutina;
    private javax.swing.JButton btnLimpiarRu;
    private javax.swing.JButton btnSalirRu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar jMenuReportExcel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuRutina_cedula;
    private javax.swing.JMenuItem menuRutina_fecha;
    private javax.swing.JMenuItem menuRutinas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula_rutina;
    public static javax.swing.JTextField txtDescanso;
    public static javax.swing.JTextField txtDia;
    public static javax.swing.JTextField txtEjercicio;
    public static javax.swing.JTextField txtEntrenador;
    public static javax.swing.JTextField txtIdatletas;
    public static javax.swing.JTextField txtIdrutina;
    public static javax.swing.JTextField txtModalidad;
    public static javax.swing.JTextField txtNombres;
    public static javax.swing.JTextField txtRepeticiones;
    public static javax.swing.JTextField txtRutina;
    public static javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables

    // FUNCION PARA VISUALIZAR LA TABLA DE LAS RUTINAS
    RutinasDao rutinas = null;

    public void visualizar_tabla_rutinas(JTable TableRutinas) {

        TableRutinas.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel tableAT = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableAT.addColumn("ID");
        tableAT.addColumn("ID ATLTA");
        tableAT.addColumn("CEDULA");
        tableAT.addColumn("NOMBRES");
        tableAT.addColumn("ENTRENADOR");
        tableAT.addColumn("FECHA");
        tableAT.addColumn("RUTINAS");
        tableAT.addColumn("MODALIDAD");
        tableAT.addColumn("EJERCICIOS");
        tableAT.addColumn("SERIE");
        tableAT.addColumn("REPETICIONES");
        tableAT.addColumn("DESCANSO");

        rutinas = new RutinasDao();
        Rutinas ruti = new Rutinas();
        ArrayList<Rutinas> list = rutinas.Listar_rutinas();

        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[12];
                ruti = list.get(i);
                fila[0] = ruti.getIdrutina();
                fila[1] = ruti.getIdatletas();
                fila[2] = ruti.getCedula();
                fila[3] = ruti.getNombres();
                fila[4] = ruti.getEntrenador();
                fila[5] = ruti.getFecha_rutina();
                fila[6] = ruti.getRutinas();
                fila[7] = ruti.getModalidad();
                fila[8] = ruti.getEjercicio();
                fila[9] = ruti.getSerie();
                fila[10] = ruti.getRepeticiones();
                fila[11] = ruti.getDescanso();

                tableAT.addRow(fila);
            }
            TableRutinas.setModel(tableAT);
            TableRutinas.setRowHeight(60);

            TableRutinas.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 25));

            TableRutinas.getTableHeader().setFont(new Font("Cambria", 1, 11));

            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
            TableRutinas.getColumnModel().getColumn(0).setCellRenderer(Alinear);

            TableRutinas.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableRutinas.getColumnModel().getColumn(1).setPreferredWidth(50);
            TableRutinas.getColumnModel().getColumn(2).setPreferredWidth(40);
            TableRutinas.getColumnModel().getColumn(3).setPreferredWidth(110);
            TableRutinas.getColumnModel().getColumn(4).setPreferredWidth(110);
            TableRutinas.getColumnModel().getColumn(5).setPreferredWidth(50);
            TableRutinas.getColumnModel().getColumn(6).setPreferredWidth(50);
            TableRutinas.getColumnModel().getColumn(7).setPreferredWidth(80);
            TableRutinas.getColumnModel().getColumn(8).setPreferredWidth(160);
            TableRutinas.getColumnModel().getColumn(9).setPreferredWidth(50);
            TableRutinas.getColumnModel().getColumn(10).setPreferredWidth(80);
            TableRutinas.getColumnModel().getColumn(11).setPreferredWidth(50);

            TableRutinas.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(19, 124, 169), Color.white));
            TableRutinas.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableRutinas.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableRutinas.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableRutinas.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableRutinas.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableRutinas.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableRutinas.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableRutinas.getColumnModel().getColumn(8).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableRutinas.getColumnModel().getColumn(9).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableRutinas.getColumnModel().getColumn(10).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableRutinas.getColumnModel().getColumn(11).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));

        }
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // METODO PARA EDITAR LAS RUTINAS
    public void editarRutinas() throws SQLException {

        if (txtCedula_rutina.getText().equals("") || txtNombres.getText().equals("") || txtEntrenador.getText().equals("") || txtDia.getText().equals("") || DateChFecha.getDate() == null || txtRutina.getText().equals("") || txtModalidad.getText().equals("") || txtEjercicio.getText().equals("") || txtSerie.getText().equals("") || txtRepeticiones.getText().equals("") || txtDescanso.getText().equals("")) {

            txtCedula_rutina.setBackground(new Color(248, 224, 224));
            txtNombres.setBackground(new Color(248, 224, 224));
            txtEntrenador.setBackground(new Color(248, 224, 224));
            txtDia.setBackground(new Color(248, 224, 224));
            txtRutina.setBackground(new Color(248, 224, 224));
            txtModalidad.setBackground(new Color(248, 224, 224));
            txtEjercicio.setBackground(new Color(248, 224, 224));
            txtSerie.setBackground(new Color(248, 224, 224));
            txtRepeticiones.setBackground(new Color(248, 224, 224));
            txtDescanso.setBackground(new Color(248, 224, 224));

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "Atención...No Debe Haber Campos Vacios",
                    "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        } else {

            try {
                Connection conn = conexion.conectar();

                String sql = "UPDATE rutinas SET idatletas=?,cedula=?,nombres=?,entrenador=?,dia=?, fecha_rutina=?, rutinas=?, modalidad=?, ejercicio=?, serie=?,repeticiones=?,descanso=?  WHERE idrutina = ?";
                String fecha;
                java.util.Date date = new java.util.Date();
                SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
                fecha = f.format(DateChFecha.getDate());

                PreparedStatement pst = conn.prepareStatement(sql);

                pst.setString(1, txtIdatletas.getText());
                pst.setString(2, txtCedula_rutina.getText());
                pst.setString(3, txtNombres.getText());
                pst.setString(4, txtEntrenador.getText());
                pst.setString(5, (txtDia.getText()));
                pst.setString(6, fecha);
                pst.setString(7, txtRutina.getText());
                pst.setString(8, txtModalidad.getText());
                pst.setString(9, txtEjercicio.getText());
                pst.setString(10, txtSerie.getText());
                pst.setString(11, txtRepeticiones.getText());
                pst.setString(12, txtDescanso.getText());
                pst.setString(13, txtIdrutina.getText());

                int n = pst.executeUpdate();
                if (n > 0) {
                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                    JOptionPane.showMessageDialog(this, "Se Han Modificado Con Exito Los Datos",
                            "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                    visualizar_tabla_rutinas(TableRutinas);
                    limpiar_campos();

                } else {
                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                    JOptionPane.showMessageDialog(this, "Hubo error en el momento de actualizar los datos",
                            "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                }
            } catch (SQLException ex) {
                Logger.getLogger(Operaciones_rutinas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    // METODO PARA ELIMINAR SOLO UN ITEM DE CUALQUIER RUTINA(ELIMINACION POR 'idrutina')
    public void eliminar_item_rutinas() {

        Connection conn = conexion.conectar();

        if (txtNombres.getText().equals("") || txtEntrenador.getText().equals("") || txtDia.getText().equals("") || DateChFecha.getDate() == null || txtRutina.getText().equals("") || txtModalidad.getText().equals("") || txtEjercicio.getText().equals("") || txtSerie.getText().equals("") || txtRepeticiones.getText().equals("") || txtDescanso.getText().equals("")) {

            txtNombres.setBackground(new Color(248, 224, 224));
            txtEntrenador.setBackground(new Color(248, 224, 224));
            txtDia.setBackground(new Color(248, 224, 224));
            txtRutina.setBackground(new Color(248, 224, 224));
            txtModalidad.setBackground(new Color(248, 224, 224));
            txtEjercicio.setBackground(new Color(248, 224, 224));
            txtSerie.setBackground(new Color(248, 224, 224));
            txtRepeticiones.setBackground(new Color(248, 224, 224));
            txtDescanso.setBackground(new Color(248, 224, 224));

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "Atención...No Debe Haber Campos Vacios",
                    "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        } else {

            UI = null;
            UIManager.put("OptionPane.background", new Color(254, 254, 254));
            UIManager.put("Panel.background", new Color(254, 254, 254));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Eliminar Este Usuario..?",
                    "RUTINAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            if (opcion == 0) {

                int fila = TableRutinas.getSelectedRow();
                if (fila > -1) {
                    String idrutina = TableRutinas.getValueAt(fila, 0).toString();
                    String sql = "DELETE FROM rutinas WHERE idrutina='" + idrutina + "'";
                    try {
                        PreparedStatement pst = conn.prepareStatement(sql);
                        int n = pst.executeUpdate();
                        if (n > 0) {
                            UI = null;
                            UIManager.put("OptionPane.background", new Color(254, 254, 254));
                            UIManager.put("Panel.background", new Color(254, 254, 254));
                            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                            JOptionPane.showMessageDialog(this, "El Registro se Eliminó Correctamente",
                                    "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                            visualizar_tabla_rutinas(TableRutinas);

                            limpiar_campos();
                        } else {
                            UI = null;
                            UIManager.put("OptionPane.background", new Color(254, 254, 254));
                            UIManager.put("Panel.background", new Color(254, 254, 254));
                            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                            JOptionPane.showMessageDialog(this, "No se ha Podido Eliminar el Registro.",
                                    "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Operaciones_rutinas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // METODO PARA ELIMINAR TODAS LAS RUTINAS(ELIMINACION POR 'IDATLETAS')
    public void eliminar_todo_rutinas() {

        Connection conn = conexion.conectar();

        if (txtNombres.getText().equals("") || txtEntrenador.getText().equals("") || txtDia.getText().equals("") || DateChFecha.getDate() == null || txtRutina.getText().equals("") || txtModalidad.getText().equals("") || txtEjercicio.getText().equals("") || txtSerie.getText().equals("") || txtRepeticiones.getText().equals("") || txtDescanso.getText().equals("")) {

            txtNombres.setBackground(new Color(248, 224, 224));
            txtEntrenador.setBackground(new Color(248, 224, 224));
            txtDia.setBackground(new Color(248, 224, 224));
            txtRutina.setBackground(new Color(248, 224, 224));
            txtModalidad.setBackground(new Color(248, 224, 224));
            txtEjercicio.setBackground(new Color(248, 224, 224));
            txtSerie.setBackground(new Color(248, 224, 224));
            txtRepeticiones.setBackground(new Color(248, 224, 224));
            txtDescanso.setBackground(new Color(248, 224, 224));

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "Atención...Seleccione el Atleta a Eliminar",
                    "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        } else {

            UI = null;
            UIManager.put("OptionPane.background", new Color(254, 254, 254));
            UIManager.put("Panel.background", new Color(254, 254, 254));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Eliminar Las Rutinas De Este Atleta..?",
                    "RUTINAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            if (opcion == 0) {

                int fila = TableRutinas.getSelectedRow();
                if (fila > -1) {
                    String idatletas = TableRutinas.getValueAt(fila, 1).toString();
                    String sql = "DELETE FROM rutinas WHERE idatletas='" + idatletas + "'";
                    try {
                        PreparedStatement pst = conn.prepareStatement(sql);
                        int n = pst.executeUpdate();
                        if (n > 0) {
                            UI = null;
                            UIManager.put("OptionPane.background", new Color(254, 254, 254));
                            UIManager.put("Panel.background", new Color(254, 254, 254));
                            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                            JOptionPane.showMessageDialog(this, "El Registro se Eliminó Correctamente",
                                    "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                            visualizar_tabla_rutinas(TableRutinas);
                            limpiar_campos();
                        } else {
                            UI = null;
                            UIManager.put("OptionPane.background", new Color(254, 254, 254));
                            UIManager.put("Panel.background", new Color(254, 254, 254));
                            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                            JOptionPane.showMessageDialog(this, "No se ha Podido Eliminar el Registro.",
                                    "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Operaciones_rutinas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

    }

    //METODO PARA LIMPIAR LOS CAMPOS DE OPERACIONES RUTINAS
    public void limpiar_campos() {

        txtIdatletas.setText("");
        txtCedula_rutina.setText("");
        txtNombres.setText("");
        txtEntrenador.setText("");
        txtDia.setText("");
        txtDia.setText("");
        DateChFecha.setDate(null);
        txtRutina.setText("");
        txtModalidad.setText("");
        txtEjercicio.setText("");
        txtSerie.setText("");
        txtRepeticiones.setText("");
        txtDescanso.setText("");
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
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

    // FUNCION PARA BUSCAR LOS ENTRENADORES EN LA TABLA DE OPERACIONES ENTRENADOR
    public void buscarRutinas(String buscar) {

        RutinasDao buscaDao = new RutinasDao();

        DefaultTableModel modelo = buscaDao.buscarRutinas_oper(buscar);

        TableRutinas.setModel(modelo);

        TableRutinas.setRowHeight(60);

        TableRutinas.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 25));

        TableRutinas.getTableHeader().setFont(new Font("Cambria", 1, 11));

        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
        TableRutinas.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        TableRutinas.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        TableRutinas.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        TableRutinas.getColumnModel().getColumn(4).setCellRenderer(Alinear);
        TableRutinas.getColumnModel().getColumn(6).setCellRenderer(Alinear);
        TableRutinas.getColumnModel().getColumn(7).setCellRenderer(Alinear);
        TableRutinas.getColumnModel().getColumn(8).setCellRenderer(Alinear);
        TableRutinas.getColumnModel().getColumn(9).setCellRenderer(Alinear);
        TableRutinas.getColumnModel().getColumn(10).setCellRenderer(Alinear);
        TableRutinas.getColumnModel().getColumn(11).setCellRenderer(Alinear);

        TableRutinas.getColumnModel().getColumn(0).setPreferredWidth(30);
        TableRutinas.getColumnModel().getColumn(1).setPreferredWidth(80);
        TableRutinas.getColumnModel().getColumn(2).setPreferredWidth(80);
        TableRutinas.getColumnModel().getColumn(3).setPreferredWidth(180);
        TableRutinas.getColumnModel().getColumn(4).setPreferredWidth(180);
        TableRutinas.getColumnModel().getColumn(5).setPreferredWidth(80);
        TableRutinas.getColumnModel().getColumn(6).setPreferredWidth(80);
        TableRutinas.getColumnModel().getColumn(7).setPreferredWidth(130);
        TableRutinas.getColumnModel().getColumn(8).setPreferredWidth(200);
        TableRutinas.getColumnModel().getColumn(9).setPreferredWidth(80);
        TableRutinas.getColumnModel().getColumn(10).setPreferredWidth(100);
        TableRutinas.getColumnModel().getColumn(11).setPreferredWidth(80);

        TableRutinas.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(19, 124, 169), Color.white));
        TableRutinas.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableRutinas.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableRutinas.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableRutinas.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableRutinas.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableRutinas.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableRutinas.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableRutinas.getColumnModel().getColumn(8).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableRutinas.getColumnModel().getColumn(9).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableRutinas.getColumnModel().getColumn(10).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableRutinas.getColumnModel().getColumn(11).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));

    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
}
