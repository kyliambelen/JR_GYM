package vistas;

import bd.Conexion;
import dao.RutinasDao;
import entidades.CboxSelectAtletas;
import entidades.CboxSelectCedula_atleta;
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
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class AgregarRutinas extends javax.swing.JFrame {

    public static RutinasPersonalizadas personalRutina;

    private final Conexion conexion = new Conexion();
    UIManager UI;
    Usuarios usuar;

    public AgregarRutinas() throws SQLException {
        initComponents();
        setIconImage(getIconImage());
        this.setTitle("RUTINAS");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        llenarCboxAtletas();
        llenarCboxEntrenador();

        CboxSelectAtletas cargaAtletas = new CboxSelectAtletas();
        cargaAtletas.cargarCboxAtletas(ComboBoxId_atletas);
        CboxSelectCedula_atleta cargaCedula = new CboxSelectCedula_atleta();
        cargaCedula.cargarCboxCedula_rutinas(ComboBoxCedula_atleta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGris_claro = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        LabelBannerP = new javax.swing.JLabel();
        PanelGris_oscuro = new javax.swing.JPanel();
        PanelRojo = new javax.swing.JPanel();
        DateCH_periodoPE = new com.toedter.calendar.JDateChooser();
        ComboBoxDia = new javax.swing.JComboBox<>();
        PanelNaranja = new javax.swing.JPanel();
        Separador2 = new javax.swing.JSeparator();
        LabelPeriodo = new javax.swing.JLabel();
        LabelAtleta = new javax.swing.JLabel();
        LabelEntrenador = new javax.swing.JLabel();
        Separador1 = new javax.swing.JSeparator();
        PanelNegro = new javax.swing.JPanel();
        LabelDescanso1 = new javax.swing.JLabel();
        ComboBoxDescanso = new javax.swing.JComboBox<>();
        LabelEjercicio1 = new javax.swing.JLabel();
        LabelSerie1 = new javax.swing.JLabel();
        LabelRepeticiones1 = new javax.swing.JLabel();
        LabelModalidad = new javax.swing.JLabel();
        ComboBoxEjercicio = new javax.swing.JComboBox<>();
        ComboBoxSerie = new javax.swing.JComboBox<>();
        ComboBoxRepeticiones = new javax.swing.JComboBox<>();
        ComboBoxModalidad = new javax.swing.JComboBox<>();
        btnPersonalizado = new javax.swing.JButton();
        ComboBoxRutinas = new javax.swing.JComboBox<>();
        txtRutina1 = new javax.swing.JTextField();
        btnGuardarPE = new javax.swing.JButton();
        btnSalirPE = new javax.swing.JButton();
        ComboBoxEntrenador = new javax.swing.JComboBox<>();
        ComboBoxId_atletas = new javax.swing.JComboBox<>();
        ComboBoxNombres = new javax.swing.JComboBox<>();
        LabelFecha = new javax.swing.JLabel();
        LabelId_atletas = new javax.swing.JLabel();
        LabelNombres = new javax.swing.JLabel();
        LabelNombre_entrenador = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanelLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxCedula_atleta = new javax.swing.JComboBox<>();
        LabelNombres1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGris_claro.setBackground(new java.awt.Color(204, 204, 204));
        PanelGris_claro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(243, 45, 0));
        LabelTitulo.setText("PLAN DE EJERCICIOS");
        PanelGris_claro.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 290, 30));

        LabelBannerP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banner2.jpg"))); // NOI18N
        PanelGris_claro.add(LabelBannerP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1250, 120));

        PanelGris_oscuro.setBackground(new java.awt.Color(153, 153, 153));
        PanelGris_oscuro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelGris_oscuro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRojo.setBackground(new java.awt.Color(255, 0, 0));
        PanelRojo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelGris_oscuro.add(PanelRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1060, 50));

        DateCH_periodoPE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 162, 61)));
        DateCH_periodoPE.setForeground(new java.awt.Color(102, 102, 102));
        DateCH_periodoPE.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PanelGris_oscuro.add(DateCH_periodoPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, 120, 30));

        ComboBoxDia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ComboBoxDia.setForeground(new java.awt.Color(102, 102, 102));
        ComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" }));
        ComboBoxDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 162, 61)));
        PanelGris_oscuro.add(ComboBoxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 110, 30));

        PanelNaranja.setBackground(new java.awt.Color(253, 162, 61));
        PanelNaranja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Separador2.setBackground(new java.awt.Color(255, 0, 0));
        Separador2.setForeground(new java.awt.Color(255, 0, 0));
        Separador2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Separador2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        Separador2.setOpaque(true);
        PanelNaranja.add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 10, 40));

        LabelPeriodo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelPeriodo.setText("PERIODO");
        PanelNaranja.add(LabelPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 80, 40));

        LabelAtleta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelAtleta.setText("ATLETA");
        PanelNaranja.add(LabelAtleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 40));

        LabelEntrenador.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelEntrenador.setText("ENTRENADOR");
        PanelNaranja.add(LabelEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 130, 40));

        Separador1.setBackground(new java.awt.Color(255, 0, 0));
        Separador1.setForeground(new java.awt.Color(255, 0, 0));
        Separador1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Separador1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        Separador1.setOpaque(true);
        PanelNaranja.add(Separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 10, 40));

        PanelGris_oscuro.add(PanelNaranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1060, 40));

        PanelNegro.setBackground(new java.awt.Color(51, 51, 51));
        PanelNegro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelNegro.setForeground(new java.awt.Color(255, 255, 255));
        PanelNegro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelDescanso1.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        LabelDescanso1.setForeground(new java.awt.Color(255, 255, 255));
        LabelDescanso1.setText("DESCANSO");
        PanelNegro.add(LabelDescanso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, 70, 20));

        ComboBoxDescanso.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        ComboBoxDescanso.setForeground(new java.awt.Color(255, 0, 0));
        ComboBoxDescanso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "1 MINUTO", "2 MINUTOS", "3 MINUTOS", "4 MINUTOS", "5 MINUTOS", "6 MINUTOS", "8 MINUTOS", "10 MINUTOS", " " }));
        PanelNegro.add(ComboBoxDescanso, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 120, 30));

        LabelEjercicio1.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        LabelEjercicio1.setForeground(new java.awt.Color(255, 255, 255));
        LabelEjercicio1.setText("EJERCICIO");
        PanelNegro.add(LabelEjercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 60, 20));

        LabelSerie1.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        LabelSerie1.setForeground(new java.awt.Color(255, 255, 255));
        LabelSerie1.setText("SERIE");
        PanelNegro.add(LabelSerie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 40, 20));

        LabelRepeticiones1.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        LabelRepeticiones1.setForeground(new java.awt.Color(255, 255, 255));
        LabelRepeticiones1.setText("REPETICIONES");
        PanelNegro.add(LabelRepeticiones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 90, 20));

        LabelModalidad.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        LabelModalidad.setForeground(new java.awt.Color(255, 255, 255));
        LabelModalidad.setText("MODALIDAD");
        PanelNegro.add(LabelModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 90, 20));

        ComboBoxEjercicio.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        ComboBoxEjercicio.setForeground(new java.awt.Color(255, 0, 0));
        ComboBoxEjercicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "PIERNAS-Sentadillas con barra", "PIERNAS-Prensa en máquina", "PIERNAS-Peso muerto", "PIERNAS-Zancada con mancuernas", "PIERNAS-Extensión de gemelos", "PECHO-Press de banca con barra en banco plano", "PECHO-Press banco inclinado con mancuernas", "PECHO-Aperturas banco plano/inclinado (alternar semanalmente)", "PECHO-Press declinado con barra", "PECHO-Flexiones", "ESPALDA-Dominadas ", "ESPALDA-Remo sentado", "ESPALDA-Jalón al pecho polea alta", "ESPALDA-Peso muerto rumano", "ESPALDA-Remo horizontal con barra", "ABDOMINALES - Elevaciones de piernas", "ABDOMINALES - Crunches", "ABDOMINALES - Oblíquos con polea", "HOMBROS-Press hombro sentado con barra", "HOMBROS- Elevaciones laterales con mancuernas", "HOMBROS-Press sentado con mancuernas", "HOMBROS Pájaros (posterior mancuernas)", "HOMBROS-Encogimientos de hombro con mancuernas (trapecios)", "BRAZOS-Curl bíceps con barra", "BRAZOS-Francés de tríceps barra Z", "BRAZOS-Bíceps (curl) banco inclinado", "BRAZOS-Fondos de tríceps", "BRAZOS-Curl bíceps inverso en polea", "BRAZOS-Press con barra agarre estrecho", " ", " " }));
        PanelNegro.add(ComboBoxEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 380, 30));

        ComboBoxSerie.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        ComboBoxSerie.setForeground(new java.awt.Color(255, 0, 0));
        ComboBoxSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "1 SERIE", "2 SERIES", "3 SERIES", "4 SERIES", "5 SERIES", "6 SERIES", "7 SERIES", "8 SERIES", "9 SERIES", "10 SERIES", " " }));
        PanelNegro.add(ComboBoxSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 120, 30));

        ComboBoxRepeticiones.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        ComboBoxRepeticiones.setForeground(new java.awt.Color(255, 0, 0));
        ComboBoxRepeticiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "1 REPETICION", "2 REPETICIONES", "3 REPETICIONES", "4 REPETICIONES", "5 REPETICIONES", "6 REPETICIONES", "8 REPETICIONES", "10 REPETICIONES", "12 REPETICIONES", "14 REPETICIONES", "16 REPETICIONES", "18 REPETICIONES", "20 REPETICIONES" }));
        PanelNegro.add(ComboBoxRepeticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 130, 30));

        ComboBoxModalidad.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        ComboBoxModalidad.setForeground(new java.awt.Color(255, 0, 0));
        ComboBoxModalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "Piernas", "Pecho", "Biceps", "Triceps", "Espalda", "Abdominales", "Hombros", " " }));
        PanelNegro.add(ComboBoxModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 140, 30));

        btnPersonalizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personalizadoRutinas.png"))); // NOI18N
        btnPersonalizado.setBorderPainted(false);
        btnPersonalizado.setContentAreaFilled(false);
        btnPersonalizado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personalizadoRutinas2.png"))); // NOI18N
        btnPersonalizado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personalizadoRutinas.png"))); // NOI18N
        btnPersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalizadoActionPerformed(evt);
            }
        });
        PanelNegro.add(btnPersonalizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 280, 40));

        ComboBoxRutinas.setBackground(new java.awt.Color(255, 153, 51));
        ComboBoxRutinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "RUTINA 1", "RUTINA 2", "RUTINA 3", "RUTINA 4", "RUTINA 5", "RUTINA 6", "RUTINA 7", "RUTINA 8", "RUTINA 9", "RUTINA 10" }));
        ComboBoxRutinas.setOpaque(false);
        PanelNegro.add(ComboBoxRutinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 30));

        txtRutina1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtRutina1.setForeground(new java.awt.Color(253, 162, 61));
        txtRutina1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRutina1.setText("RUTINAS");
        txtRutina1.setToolTipText("");
        txtRutina1.setBorder(null);
        txtRutina1.setOpaque(false);
        txtRutina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutina1ActionPerformed(evt);
            }
        });
        PanelNegro.add(txtRutina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 30));

        PanelGris_oscuro.add(PanelNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1060, 270));

        btnGuardarPE.setBackground(new java.awt.Color(0, 0, 153));
        btnGuardarPE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarPE.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarPE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardarRutinas.png"))); // NOI18N
        btnGuardarPE.setBorderPainted(false);
        btnGuardarPE.setContentAreaFilled(false);
        btnGuardarPE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardarRutinas2.png"))); // NOI18N
        btnGuardarPE.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardarRutinas.png"))); // NOI18N
        btnGuardarPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPEActionPerformed(evt);
            }
        });
        PanelGris_oscuro.add(btnGuardarPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 350, 150, 40));

        btnSalirPE.setBackground(new java.awt.Color(255, 0, 0));
        btnSalirPE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalirPE.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirPE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fueraRutinas.png"))); // NOI18N
        btnSalirPE.setBorderPainted(false);
        btnSalirPE.setContentAreaFilled(false);
        btnSalirPE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fueraRutinas2.png"))); // NOI18N
        btnSalirPE.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fueraRutinas.png"))); // NOI18N
        btnSalirPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPEActionPerformed(evt);
            }
        });
        PanelGris_oscuro.add(btnSalirPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 400, 150, 40));

        PanelGris_oscuro.add(ComboBoxEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 220, 30));

        PanelGris_oscuro.add(ComboBoxId_atletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 30));

        PanelGris_oscuro.add(ComboBoxNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 220, 30));

        LabelFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelFecha.setForeground(new java.awt.Color(255, 0, 0));
        LabelFecha.setText("FECHA");
        PanelGris_oscuro.add(LabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 50, 50, 30));

        LabelId_atletas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelId_atletas.setForeground(new java.awt.Color(255, 0, 0));
        LabelId_atletas.setText("ID ATLETA");
        PanelGris_oscuro.add(LabelId_atletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 30));

        LabelNombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelNombres.setForeground(new java.awt.Color(255, 0, 0));
        LabelNombres.setText("CEDULA");
        PanelGris_oscuro.add(LabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, 30));

        LabelNombre_entrenador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelNombre_entrenador.setForeground(new java.awt.Color(255, 0, 0));
        LabelNombre_entrenador.setText("NOMBRES ENTRENADOR");
        PanelGris_oscuro.add(LabelNombre_entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("DIA");
        PanelGris_oscuro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 30, 30));

        PanelLogo.setBackground(new java.awt.Color(255, 255, 255));
        PanelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoJR3.png"))); // NOI18N
        PanelLogo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        PanelGris_oscuro.add(PanelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 150, 330));

        PanelGris_oscuro.add(ComboBoxCedula_atleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 180, 30));

        LabelNombres1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelNombres1.setForeground(new java.awt.Color(255, 0, 0));
        LabelNombres1.setText("NOMBRES");
        PanelGris_oscuro.add(LabelNombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, 30));

        PanelGris_claro.add(PanelGris_oscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1250, 500));

        getContentPane().add(PanelGris_claro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutina1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutina1ActionPerformed

    private void btnGuardarPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPEActionPerformed

        GuardarRutinas();
    }//GEN-LAST:event_btnGuardarPEActionPerformed

    private void btnSalirPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPEActionPerformed

        Administracion.addRutina = null;

        this.dispose();
    }//GEN-LAST:event_btnSalirPEActionPerformed

    private void btnPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalizadoActionPerformed

        if (personalRutina != null) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "El módulo RUTINAS PERSONALIZADA se encuentra abierto",
                    "FACTURAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            try {
                personalRutina = new RutinasPersonalizadas();
            } catch (SQLException ex) {
                Logger.getLogger(AgregarRutinas.class.getName()).log(Level.SEVERE, null, ex);
            }
            personalRutina.setVisible(true);

    }//GEN-LAST:event_btnPersonalizadoActionPerformed
    }

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
            java.util.logging.Logger.getLogger(AgregarRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AgregarRutinas().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(AgregarRutinas.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<CboxSelectCedula_atleta> ComboBoxCedula_atleta;
    private javax.swing.JComboBox<String> ComboBoxDescanso;
    private javax.swing.JComboBox<String> ComboBoxDia;
    private javax.swing.JComboBox<String> ComboBoxEjercicio;
    private javax.swing.JComboBox<String> ComboBoxEntrenador;
    private javax.swing.JComboBox<CboxSelectAtletas> ComboBoxId_atletas;
    private javax.swing.JComboBox<String> ComboBoxModalidad;
    private javax.swing.JComboBox<String> ComboBoxNombres;
    private javax.swing.JComboBox<String> ComboBoxRepeticiones;
    private javax.swing.JComboBox<String> ComboBoxRutinas;
    private javax.swing.JComboBox<String> ComboBoxSerie;
    private com.toedter.calendar.JDateChooser DateCH_periodoPE;
    private javax.swing.JLabel LabelAtleta;
    private javax.swing.JLabel LabelBannerP;
    private javax.swing.JLabel LabelDescanso1;
    private javax.swing.JLabel LabelEjercicio1;
    private javax.swing.JLabel LabelEntrenador;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelId_atletas;
    private javax.swing.JLabel LabelModalidad;
    private javax.swing.JLabel LabelNombre_entrenador;
    private javax.swing.JLabel LabelNombres;
    private javax.swing.JLabel LabelNombres1;
    private javax.swing.JLabel LabelPeriodo;
    private javax.swing.JLabel LabelRepeticiones1;
    private javax.swing.JLabel LabelSerie1;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PanelGris_claro;
    private javax.swing.JPanel PanelGris_oscuro;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JPanel PanelNaranja;
    private javax.swing.JPanel PanelNegro;
    private javax.swing.JPanel PanelRojo;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JButton btnGuardarPE;
    private javax.swing.JButton btnPersonalizado;
    private javax.swing.JButton btnSalirPE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtRutina1;
    // End of variables declaration//GEN-END:variables

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
 /* FUNCION PARA AGREGAR LAS RUTINAS */
    public void GuardarRutinas() {

        if (DateCH_periodoPE.getDate() == null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));

            JOptionPane.showMessageDialog(this, "Debe Seleccionar La Fecha Que Asignará a la Rutina",
                    "RUTINAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            return;
        }

        if (ComboBoxDia.getSelectedIndex() == 0) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Seleccionar El Dia a Efectuar La Rutina",
                    "RUTINAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            return;

        } else if (ComboBoxRutinas.getSelectedIndex() == 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Seleccionar La Rutina a Realizar ",
                    "RUTINAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            return;

        } else if (ComboBoxModalidad.getSelectedIndex() == 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, " Seleccione La Modalidad de Ejercicio a Realizar ",
                    "RUTINAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            return;

        } else if (ComboBoxEjercicio.getSelectedIndex() == 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, " Seleccione El Tipo de Ejercicio Para Esta Rutina ",
                    "RUTINAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            return;

        } else if (ComboBoxSerie.getSelectedIndex() == 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, " Seleccione la Serie a Utilizar Para Este Ejercicio",
                    "RUTINAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            return;

        } else if (ComboBoxRepeticiones.getSelectedIndex() == 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, " Seleccione la Cantidad de Repeticiones Para Este Ejercicio ",
                    "RUTINAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            return;

        } else if (ComboBoxDescanso.getSelectedIndex() == 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, " Seleccione el Tiempo a Descanzar Para Este Ejercicio",
                    "RUTINAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

            return;
        }

        String fecha;
        Rutinas rutinas = new Rutinas();
        RutinasDao rutinasDAO = new RutinasDao();
        Connection conn = conexion.conectar();
        java.util.Date date = new java.util.Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        fecha = f.format(DateCH_periodoPE.getDate());

        rutinas.setIdatletas(ComboBoxId_atletas.getItemAt(ComboBoxId_atletas.getSelectedIndex()).getIdatletas());
        rutinas.setCedula(ComboBoxCedula_atleta.getItemAt(ComboBoxCedula_atleta.getSelectedIndex()).getCedula());
        rutinas.setNombres(ComboBoxNombres.getItemAt(ComboBoxNombres.getSelectedIndex()));
        rutinas.setEntrenador(ComboBoxEntrenador.getItemAt(ComboBoxEntrenador.getSelectedIndex()));
        rutinas.setDia(ComboBoxDia.getItemAt(ComboBoxDia.getSelectedIndex()));
        rutinas.setFecha_rutina(fecha);
        rutinas.setRutinas(ComboBoxRutinas.getItemAt(ComboBoxRutinas.getSelectedIndex()));
        rutinas.setModalidad(ComboBoxModalidad.getItemAt(ComboBoxModalidad.getSelectedIndex()));
        rutinas.setEjercicio(ComboBoxEjercicio.getItemAt(ComboBoxEjercicio.getSelectedIndex()));
        rutinas.setSerie(ComboBoxSerie.getItemAt(ComboBoxSerie.getSelectedIndex()));
        rutinas.setRepeticiones(ComboBoxRepeticiones.getItemAt(ComboBoxRepeticiones.getSelectedIndex()));
        rutinas.setDescanso(ComboBoxDescanso.getItemAt(ComboBoxDescanso.getSelectedIndex()));

        try {
            if (rutinasDAO.agregarRutinas(rutinas)) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                JOptionPane.showMessageDialog(this, "Su Registro Se Guardó Satisfactoriamente...!!!!",
                        "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                limpiarRutinas1();

            } else {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                JOptionPane.showMessageDialog(this, "Lo siento...!!! Ha Ocurrido Un Error Guardando Los Datos",
                        "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                limpiarRutinas1();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgregarRutinas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
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

    // FUNCION PARA CARGAR EL JCOMBOBOX CON LOS NOMBRES DE LOS ATLETAS
    public void llenarCboxAtletas() {
        try {
            Connection conn = conexion.conectar();
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT DISTINCT nombres FROM atletas";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ComboBoxNombres.addItem((String) rs.getObject(1));

            }

        } catch (SQLException ex) {
            Logger.getLogger(AgregarRutinas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    // FUNCION PARA CARGAR EL JCOMBOBOX CON LOS NOMBRES DE LOS ENTRENADORES
    public void llenarCboxEntrenador() {
        try {
            Connection conn = conexion.conectar();
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT DISTINCT nombres FROM entrenador";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ComboBoxEntrenador.addItem((String) rs.getObject(1));

            }

        } catch (SQLException ex) {
            Logger.getLogger(AgregarRutinas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    // METODO PARA LIMPIAR LOS CAMPOS DESPUES DE GUARDAR LAS RUTINAS
    public void limpiarRutinas1() {

        ComboBoxDia.setSelectedIndex(0);
        DateCH_periodoPE.setDate(null);
        ComboBoxRutinas.setSelectedIndex(0);
        ComboBoxModalidad.setSelectedIndex(0);
        ComboBoxEjercicio.setSelectedIndex(0);
        ComboBoxSerie.setSelectedIndex(0);
        ComboBoxRepeticiones.setSelectedIndex(0);
        ComboBoxDescanso.setSelectedIndex(0);
    }
}
