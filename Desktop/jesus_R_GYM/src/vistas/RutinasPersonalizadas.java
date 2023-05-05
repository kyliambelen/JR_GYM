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
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
public class RutinasPersonalizadas extends javax.swing.JFrame {

    private final Conexion conexion = new Conexion();
    UIManager UI;
    Usuarios usuar;

    public RutinasPersonalizadas() throws SQLException {
        initComponents();
        this.setTitle("RUTINAS-PERSONALIZADAS");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setIconImage(getIconImage());
        llenarCboxNombres_atletas();
        llenarCboxNombres_entrenador();

        CboxSelectAtletas cargaId_atletas = new CboxSelectAtletas();
        try {
            cargaId_atletas.cargarCboxAtletas2(CboxIdAtletas2);
        } catch (SQLException ex) {
            Logger.getLogger(RutinasPersonalizadas.class.getName()).log(Level.SEVERE, null, ex);
        }

        CboxSelectCedula_atleta cargaCedula2 = new CboxSelectCedula_atleta();
        cargaCedula2.cargarCboxCedula_rutinas2(ComboBoxCedula_atleta2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelNaranja = new javax.swing.JPanel();
        CboxIdAtletas2 = new javax.swing.JComboBox<>();
        CboxNombres2 = new javax.swing.JComboBox<>();
        CboxEntrenador2 = new javax.swing.JComboBox<>();
        CboxDia2 = new javax.swing.JComboBox<>();
        CboxRutinas2 = new javax.swing.JComboBox<>();
        JdateFecha = new com.toedter.calendar.JDateChooser();
        txtDescanso = new javax.swing.JTextField();
        txtModalidad = new javax.swing.JTextField();
        txtEjercicio = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        txtRepeticiones = new javax.swing.JTextField();
        LabelSeries = new javax.swing.JLabel();
        LabelModalidad = new javax.swing.JLabel();
        LabelEjercicios = new javax.swing.JLabel();
        LabelRepeticiones = new javax.swing.JLabel();
        LabelDescanso = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        LabelModalidad1 = new javax.swing.JLabel();
        LabelModalidad2 = new javax.swing.JLabel();
        LabelModalidad3 = new javax.swing.JLabel();
        LabelEjercicios1 = new javax.swing.JLabel();
        LabelEjercicios2 = new javax.swing.JLabel();
        LabelEjercicios3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelModalidad4 = new javax.swing.JLabel();
        ComboBoxCedula_atleta2 = new javax.swing.JComboBox<>();
        PanelBlanco = new javax.swing.JPanel();
        LabelFondo_Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 663));
        setPreferredSize(new java.awt.Dimension(1300, 663));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelNaranja.setBackground(new java.awt.Color(246, 152, 2));
        PanelNaranja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelNaranja.add(CboxIdAtletas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 320, 30));

        PanelNaranja.add(CboxNombres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 200, 30));

        PanelNaranja.add(CboxEntrenador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 240, 30));

        CboxDia2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));
        PanelNaranja.add(CboxDia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 30));

        CboxRutinas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Rutina 1", "Rutina 2", "Rutina 3", "Rutina 4", "Rutina 5", "Rutina 6", "Rutina 7", "Rutina 8", "Rutina 9", "Rutina 10" }));
        PanelNaranja.add(CboxRutinas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 210, 30));

        JdateFecha.setOpaque(false);
        PanelNaranja.add(JdateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 30));

        txtDescanso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDescanso.setForeground(new java.awt.Color(102, 102, 255));
        txtDescanso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        PanelNaranja.add(txtDescanso, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 150, 30));

        txtModalidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtModalidad.setForeground(new java.awt.Color(102, 102, 255));
        txtModalidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        PanelNaranja.add(txtModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 150, 30));

        txtEjercicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEjercicio.setForeground(new java.awt.Color(102, 102, 255));
        txtEjercicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        PanelNaranja.add(txtEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 450, 30));

        txtSerie.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSerie.setForeground(new java.awt.Color(102, 102, 255));
        txtSerie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        PanelNaranja.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 150, 30));

        txtRepeticiones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtRepeticiones.setForeground(new java.awt.Color(102, 102, 255));
        txtRepeticiones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        PanelNaranja.add(txtRepeticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 190, 30));

        LabelSeries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelSeries.setText("SERIES");
        PanelNaranja.add(LabelSeries, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 60, -1));

        LabelModalidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelModalidad.setText("ENTRENADOR");
        PanelNaranja.add(LabelModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 100, -1));

        LabelEjercicios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelEjercicios.setText("RUTINAS");
        PanelNaranja.add(LabelEjercicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 70, -1));

        LabelRepeticiones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelRepeticiones.setText("REPETICIONES");
        PanelNaranja.add(LabelRepeticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 110, -1));

        LabelDescanso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelDescanso.setText("DESCANSOS");
        PanelNaranja.add(LabelDescanso, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 100, -1));

        btnAgregar.setBackground(new java.awt.Color(255, 0, 51));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personalizadoGuardarRutinas.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.setFocusable(false);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personalizadoGuardarRutinas2.png"))); // NOI18N
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personalizadoGuardarRutinas.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        PanelNaranja.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 220, 40));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personalizadoSalirRutinas.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personalizadoSalirRutinas2.png"))); // NOI18N
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personalizadoSalirRutinas.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelNaranja.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 220, 40));

        LabelModalidad1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelModalidad1.setText("MODALIDAD");
        PanelNaranja.add(LabelModalidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 100, -1));

        LabelModalidad2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelModalidad2.setText("CEDULA");
        PanelNaranja.add(LabelModalidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, -1));

        LabelModalidad3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelModalidad3.setText("NOMBRES");
        PanelNaranja.add(LabelModalidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 80, -1));

        LabelEjercicios1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelEjercicios1.setText("EJERCICIOS");
        PanelNaranja.add(LabelEjercicios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 100, -1));

        LabelEjercicios2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelEjercicios2.setText("DIA");
        PanelNaranja.add(LabelEjercicios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 40, -1));

        LabelEjercicios3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelEjercicios3.setText("FECHA");
        PanelNaranja.add(LabelEjercicios3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgRutinas_personal.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        PanelNaranja.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 140, 110));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INGRESAR  RUTINAS");
        PanelNaranja.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 30));

        LabelModalidad4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelModalidad4.setText("ID ATLETA:");
        PanelNaranja.add(LabelModalidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 30));

        PanelNaranja.add(ComboBoxCedula_atleta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 210, 30));

        getContentPane().add(PanelNaranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 670));

        PanelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        PanelBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelFondo_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_btnPersonalizado.jpg"))); // NOI18N
        LabelFondo_Logo.setMaximumSize(new java.awt.Dimension(610, 660));
        LabelFondo_Logo.setMinimumSize(new java.awt.Dimension(610, 660));
        LabelFondo_Logo.setPreferredSize(new java.awt.Dimension(610, 660));
        PanelBlanco.add(LabelFondo_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 610, 660));

        getContentPane().add(PanelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 660, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            AgrearRutinas();
        } catch (SQLException ex) {
            Logger.getLogger(RutinasPersonalizadas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RutinasPersonalizadas.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        AgregarRutinas.personalRutina = null;

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(RutinasPersonalizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RutinasPersonalizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RutinasPersonalizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RutinasPersonalizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new RutinasPersonalizadas().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(RutinasPersonalizadas.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxDia2;
    private javax.swing.JComboBox<String> CboxEntrenador2;
    private javax.swing.JComboBox<CboxSelectAtletas> CboxIdAtletas2;
    private javax.swing.JComboBox<String> CboxNombres2;
    private javax.swing.JComboBox<String> CboxRutinas2;
    private javax.swing.JComboBox<CboxSelectCedula_atleta> ComboBoxCedula_atleta2;
    private com.toedter.calendar.JDateChooser JdateFecha;
    private javax.swing.JLabel LabelDescanso;
    private javax.swing.JLabel LabelEjercicios;
    private javax.swing.JLabel LabelEjercicios1;
    private javax.swing.JLabel LabelEjercicios2;
    private javax.swing.JLabel LabelEjercicios3;
    private javax.swing.JLabel LabelFondo_Logo;
    private javax.swing.JLabel LabelModalidad;
    private javax.swing.JLabel LabelModalidad1;
    private javax.swing.JLabel LabelModalidad2;
    private javax.swing.JLabel LabelModalidad3;
    private javax.swing.JLabel LabelModalidad4;
    private javax.swing.JLabel LabelRepeticiones;
    private javax.swing.JLabel LabelSeries;
    private javax.swing.JPanel PanelBlanco;
    private javax.swing.JPanel PanelNaranja;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtDescanso;
    private javax.swing.JTextField txtEjercicio;
    private javax.swing.JTextField txtModalidad;
    private javax.swing.JTextField txtRepeticiones;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables

// FUNCION PARA CARGAR EL JCOMBOBOX CON LOS NOMBRES DE LOS ATLETAS
    public void llenarCboxNombres_atletas() {
        try {
            Connection conn = conexion.conectar();
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT DISTINCT nombres FROM atletas";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                CboxNombres2.addItem((String) rs.getObject(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RutinasPersonalizadas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // FUNCION PARA CARGAR EL JCOMBOBOX CON LOS NOMBRES DE LOS ENTRENADORES
    public void llenarCboxNombres_entrenador() {
        try {
            Connection conn = conexion.conectar();
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT DISTINCT nombres FROM entrenador";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                CboxEntrenador2.addItem((String) rs.getObject(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RutinasPersonalizadas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /* FUNCION PARA AGREGAR LAS RUTINAS */
    public void AgrearRutinas() throws SQLException, FileNotFoundException {

        Rutinas rutinas = new Rutinas();
        RutinasDao rutinasDAO = new RutinasDao();
        Connection conn = conexion.conectar();

        if (txtModalidad.getText().equals("") || txtEjercicio.getText().equals("") || txtSerie.getText().equals("") || txtRepeticiones.getText().equals("") || txtDescanso.getText().equals("") || JdateFecha.getDate() == null) {

            txtModalidad.setBackground(new Color(248, 224, 224));
            txtEjercicio.setBackground(new Color(248, 224, 224));
            txtSerie.setBackground(new Color(248, 224, 224));
            txtRepeticiones.setBackground(new Color(248, 224, 224));
            txtDescanso.setBackground(new Color(248, 224, 224));
            JdateFecha.setBackground(new Color(248, 224, 224));

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

                if (CboxDia2.getSelectedIndex() == 0) {
                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                    JOptionPane.showMessageDialog(this, "Debe Seleccionar El Dia a Efectuar La Rutina",
                            "RUTINAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                    return;

                } else if (CboxRutinas2.getSelectedIndex() == 0) {
                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                    JOptionPane.showMessageDialog(this, "Debe Seleccionar La Rutina a Realizar ",
                            "RUTINAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                    return;

                }
               
                String fecha;
                java.util.Date date = new java.util.Date();
                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                fecha = f.format(JdateFecha.getDate());

                rutinas.setIdatletas(CboxIdAtletas2.getItemAt(CboxIdAtletas2.getSelectedIndex()).getIdatletas());
                rutinas.setCedula(ComboBoxCedula_atleta2.getItemAt(ComboBoxCedula_atleta2.getSelectedIndex()).getCedula());
                rutinas.setNombres(CboxNombres2.getItemAt(CboxNombres2.getSelectedIndex()));
                rutinas.setEntrenador(CboxEntrenador2.getItemAt(CboxEntrenador2.getSelectedIndex()));
                rutinas.setDia(CboxDia2.getItemAt(CboxDia2.getSelectedIndex()));
                rutinas.setFecha_rutina(fecha);
                rutinas.setRutinas(CboxRutinas2.getItemAt(CboxRutinas2.getSelectedIndex()));
                rutinas.setModalidad(txtModalidad.getText());
                rutinas.setEjercicio(txtEjercicio.getText());
                rutinas.setSerie(txtSerie.getText());
                rutinas.setRepeticiones(txtRepeticiones.getText());
                rutinas.setDescanso(txtDescanso.getText());

                if (rutinasDAO.agregarRutinas(rutinas)) {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                    JOptionPane.showMessageDialog(this, "Su Registro Se Guardó Satisfactoriamente...!!!!",
                            "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                    txtModalidad.setBackground(new Color(255, 255, 255));
                    txtEjercicio.setBackground(new Color(255, 255, 255));
                    txtSerie.setBackground(new Color(255, 255, 255));
                    txtRepeticiones.setBackground(new Color(255, 255, 255));
                    txtDescanso.setBackground(new Color(255, 255, 255));
                    JdateFecha.setBackground(new Color(255, 255, 255));

                    limpiarRutinas();

                } else {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                    JOptionPane.showMessageDialog(this, "Lo siento...!!! Ha Ocurrido Un Error Guardando Los Datos",
                            "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                }

                limpiarRutinas();
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */

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

    // METODO PARA LIMPIAR LOS CAMPOS DESPUES DE GUARDAR LAS RUTINAS
    public void limpiarRutinas() {

        txtModalidad.setText("");
        txtEjercicio.setText("");
        txtSerie.setText("");
        txtRepeticiones.setText("");
        txtDescanso.setText("");
        JdateFecha.setDate(null);
        CboxNombres2.setSelectedIndex(0);
        CboxEntrenador2.setSelectedIndex(0);
        CboxRutinas2.setSelectedIndex(0);
        CboxDia2.setSelectedIndex(0);
    }
}
