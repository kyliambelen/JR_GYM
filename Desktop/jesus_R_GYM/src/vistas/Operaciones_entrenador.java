package vistas;

import bd.Conexion;
import dao.AtletasDao;
import dao.EntrenadorDao;
import entidades.Entrenador;
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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class Operaciones_entrenador extends javax.swing.JFrame {

    UIManager UI;
    Usuarios usuar;
    private final Conexion conexion = new Conexion();

    public Operaciones_entrenador(Usuarios usuar) {
        initComponents();
        setIconImage(getIconImage());
        this.setTitle("OPERACIONES ENTRENADORES");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        txtUsuario_id.setVisible(false);
        txtIdentrenador.setVisible(false);
        visualizar_tabla_entrenador(TableEntrenador);
        this.usuar = usuar;

        if (usuar.getIdRol() == 1 || usuar.getIdRol() == 2 || usuar.getIdRol() == 3) {

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

    public Operaciones_entrenador() {
        initComponents();
        setIconImage(getIconImage());
        this.setTitle("OPERACIONES ENTRENADORES");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        txtUsuario_id.setVisible(false);
        txtIdentrenador.setVisible(false);
        visualizar_tabla_entrenador(TableEntrenador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGris_Principal = new javax.swing.JPanel();
        LabelBanner = new javax.swing.JLabel();
        PanelNegro = new javax.swing.JPanel();
        LabelCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        LabelNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        LabelSexo = new javax.swing.JLabel();
        CboxSexo = new javax.swing.JComboBox<>();
        LabelCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        LabelTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        LabelAsistencia = new javax.swing.JLabel();
        CboxAsistencia = new javax.swing.JComboBox<>();
        LabelHorario = new javax.swing.JLabel();
        LabelDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtUsuario_id = new javax.swing.JTextField();
        txtIdentrenador = new javax.swing.JTextField();
        CboxHorario = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        PanelAzul = new javax.swing.JPanel();
        txtBuscarTabla = new javax.swing.JTextField();
        LabelBuscarTabla = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableEntrenador = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGris_Principal.setBackground(new java.awt.Color(204, 204, 204));
        PanelGris_Principal.setMinimumSize(new java.awt.Dimension(1300, 700));
        PanelGris_Principal.setName(""); // NOI18N
        PanelGris_Principal.setPreferredSize(new java.awt.Dimension(1300, 700));
        PanelGris_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personalTrainning.jpg"))); // NOI18N
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelBanner.setMaximumSize(new java.awt.Dimension(1280, 300));
        LabelBanner.setMinimumSize(new java.awt.Dimension(1280, 300));
        LabelBanner.setPreferredSize(new java.awt.Dimension(1280, 300));
        LabelBanner.setVerifyInputWhenFocusTarget(false);
        PanelGris_Principal.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1260, 150));

        PanelNegro.setBackground(new java.awt.Color(51, 51, 51));
        PanelNegro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelNegro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelCedula.setForeground(new java.awt.Color(255, 255, 255));
        LabelCedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelCedula.setText("CEDULA");
        PanelNegro.add(LabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 25));

        txtCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(102, 102, 102));
        txtCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        PanelNegro.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 250, 25));

        LabelNombres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelNombres.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelNombres.setText("NOMBRES");
        PanelNegro.add(LabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 25));

        txtNombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(102, 102, 102));
        txtNombres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        PanelNegro.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 250, 25));

        LabelSexo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelSexo.setForeground(new java.awt.Color(255, 255, 255));
        LabelSexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelSexo.setText("SEXO");
        PanelNegro.add(LabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 25));

        CboxSexo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CboxSexo.setForeground(new java.awt.Color(102, 102, 102));
        CboxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino\t", "Femenino", "Otro" }));
        CboxSexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelNegro.add(CboxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 250, 25));

        LabelCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorreo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelCorreo.setText("E-MAIL");
        PanelNegro.add(LabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 110, 25));

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        PanelNegro.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 250, 25));

        LabelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelTelefono.setText("TELEFONO");
        PanelNegro.add(LabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 110, 25));

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(102, 102, 102));
        txtTelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        PanelNegro.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 250, 25));

        LabelAsistencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        LabelAsistencia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelAsistencia.setText("ASISTENCIA");
        PanelNegro.add(LabelAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 110, 25));

        CboxAsistencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CboxAsistencia.setForeground(new java.awt.Color(102, 102, 102));
        CboxAsistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diaria", "Dos Dias a la Semana", "Tres Dias a la Semana", "Entrenamiento Acordado", "Otro" }));
        CboxAsistencia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelNegro.add(CboxAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 250, 25));

        LabelHorario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelHorario.setForeground(new java.awt.Color(255, 255, 255));
        LabelHorario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelHorario.setText("HORARIO");
        PanelNegro.add(LabelHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 25));

        LabelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        LabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelDireccion.setText("DIRECCION");
        PanelNegro.add(LabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 110, 25));

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(102, 102, 102));
        txtDireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelNegro.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 250, 25));

        txtUsuario_id.setEditable(false);
        PanelNegro.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 70, 30, 20));

        txtIdentrenador.setEditable(false);
        txtIdentrenador.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        PanelNegro.add(txtIdentrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 70, 30, -1));

        CboxHorario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CboxHorario.setForeground(new java.awt.Color(102, 102, 102));
        CboxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Jornada Completa", "Mañana", "Tarde", "Noche", " " }));
        CboxHorario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelNegro.add(CboxHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 250, 25));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardarEntrenador.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarEntrenador2.png"))); // NOI18N
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardarEntrenador.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        PanelNegro.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 70, 30));

        btnEditar.setBackground(new java.awt.Color(0, 153, 0));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarEntrenador.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarEntrenador2.png"))); // NOI18N
        btnEditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarEntrenador.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PanelNegro.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 70, 30));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarEntrenador.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarEntrenador2.png"))); // NOI18N
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarEntrenador.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PanelNegro.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 70, 30));

        btnLimpiar.setBackground(new java.awt.Color(0, 102, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarEntrenador.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarEntrenador2.png"))); // NOI18N
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarEntrenador.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelNegro.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 70, 30));

        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 102));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirEntrenador.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirEntrenador2.png"))); // NOI18N
        btnAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirEntrenador.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        PanelNegro.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 70, 30));

        PanelGris_Principal.add(PanelNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1260, 140));

        PanelAzul.setBackground(new java.awt.Color(203, 244, 0));
        PanelAzul.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarTabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBuscarTabla.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscarTabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarTablaKeyReleased(evt);
            }
        });
        PanelAzul.add(txtBuscarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 230, 25));

        LabelBuscarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarjr.png"))); // NOI18N
        PanelAzul.add(LabelBuscarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, -1, 30));

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        LabelTitulo.setText("REGISTRO DE ENTRENADORES");
        PanelAzul.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 370, 50));

        PanelGris_Principal.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 1260, 50));

        TableEntrenador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TableEntrenador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TableEntrenador.setForeground(new java.awt.Color(51, 51, 51));
        TableEntrenador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableEntrenador.setRowHeight(20);
        TableEntrenador.setSelectionBackground(new java.awt.Color(255, 251, 182));
        TableEntrenador.setSelectionForeground(new java.awt.Color(51, 0, 0));
        TableEntrenador.setShowVerticalLines(false);
        TableEntrenador.setUpdateSelectionOnSort(false);
        TableEntrenador.setVerifyInputWhenFocusTarget(false);
        TableEntrenador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableEntrenadorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableEntrenador);

        PanelGris_Principal.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 1260, 300));

        getContentPane().add(PanelGris_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char numero = evt.getKeyChar();

        if (Character.isLetter(numero)) {

            getToolkit().beep();
            evt.consume();

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Ingresar Solo Números...!!!",
                    "ENTRENADOR", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped

    }//GEN-LAST:event_txtNombresKeyTyped

    // METODO PARA VALIDAR EL CORREO ELECTRINICO
    public boolean isEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            return true;
        } else {
            return false;
        }
    }


    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost

        if (isEmail(txtCorreo.getText())) {

        } else {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Ingrese un E-Mail Válido...!!!",
                    "ENTRENADOR", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));

            txtCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped

    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped

        char numero = evt.getKeyChar();

        if (Character.isLetter(numero)) {

            getToolkit().beep();
            evt.consume();

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Ingresar Solo Números...!!!",
                    "ENTRENADOR", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            GuardarEntrenador();
        } catch (SQLException | FileNotFoundException ex) {
            Logger.getLogger(Operaciones_entrenador.class.getName()).log(Level.SEVERE, null, ex);
        }

        //visualizar_tabla_atletas(TableEntrenadores);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        try {
            editarEntrenador();
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones_atletas.class.getName()).log(Level.SEVERE, null, ex);
        }
        visualizar_tabla_entrenador(TableEntrenador);
        // limpiar();

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            suprimirEntrenador();
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones_entrenador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarEntrenador();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarTablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTablaKeyReleased

        buscarEntrenador(txtBuscarTabla.getText());
        if (txtBuscarTabla.getText().isEmpty()) {

            visualizar_tabla_entrenador(TableEntrenador);
        }
    }//GEN-LAST:event_txtBuscarTablaKeyReleased

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Administracion.opEntrena = null;

        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void TableEntrenadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableEntrenadorMouseClicked

        try {

            Connection conn = conexion.conectar();
            int Fila = TableEntrenador.getSelectedRow();
            int ID = (Integer.parseInt(TableEntrenador.getValueAt(Fila, 0).toString()));

            PreparedStatement pst = conn.prepareStatement("SELECT * FROM entrenador WHERE identrenador = '" + ID + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                //Datos consultados
                txtIdentrenador.setText(rs.getString("identrenador"));
                txtCedula.setText(rs.getString("cedula"));
                txtNombres.setText(rs.getString("nombres"));
                CboxSexo.setSelectedItem(rs.getString("sexo"));
                CboxHorario.setSelectedItem(rs.getString("horario"));
                CboxAsistencia.setSelectedItem(rs.getString("asistencia"));
                txtCorreo.setText(rs.getString("correo"));
                txtTelefono.setText(rs.getString("telefono"));
                txtDireccion.setText(rs.getString("direccion"));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error al cargar!");

        }
    }//GEN-LAST:event_TableEntrenadorMouseClicked

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
            java.util.logging.Logger.getLogger(Operaciones_entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones_entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones_entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones_entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Operaciones_entrenador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxAsistencia;
    private javax.swing.JComboBox<String> CboxHorario;
    private javax.swing.JComboBox<String> CboxSexo;
    private javax.swing.JLabel LabelAsistencia;
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JLabel LabelBuscarTabla;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelHorario;
    private javax.swing.JLabel LabelNombres;
    private javax.swing.JLabel LabelSexo;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelGris_Principal;
    private javax.swing.JPanel PanelNegro;
    private javax.swing.JTable TableEntrenador;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtBuscarTabla;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdentrenador;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION PARA VISUALIZAR LA TABLA DE LOS ENTRENADORES
    EntrenadorDao entrenador = null;

    public void visualizar_tabla_entrenador(JTable TableEntrenador) {

        TableEntrenador.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel tableAT = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableAT.addColumn("ID");
        tableAT.addColumn("CEDULA");
        tableAT.addColumn("NOMBRES");
        tableAT.addColumn("SEXO");
        tableAT.addColumn("HORARIO");
        tableAT.addColumn("ASISTENCIA");
        tableAT.addColumn("CORREO");
        tableAT.addColumn("TELEFONO");
        tableAT.addColumn("DIRECCION");

        entrenador = new EntrenadorDao();
        Entrenador entrena = new Entrenador();
        ArrayList<Entrenador> list = entrenador.Listar_entrenador();

        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[9];
                entrena = list.get(i);
                fila[0] = entrena.getIdentrenador();
                fila[1] = entrena.getCedula();
                fila[2] = entrena.getNombres();
                fila[3] = entrena.getSexo();
                fila[4] = entrena.getHorario();
                fila[5] = entrena.getAsistencia();
                fila[6] = entrena.getCorreo();
                fila[7] = entrena.getTelefono();
                fila[8] = entrena.getDireccion();

                tableAT.addRow(fila);
            }
            TableEntrenador.setModel(tableAT);
            TableEntrenador.setRowHeight(60);

            TableEntrenador.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 25));

            TableEntrenador.getTableHeader().setFont(new Font("Cambria", 1, 11));

            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
            TableEntrenador.getColumnModel().getColumn(0).setCellRenderer(Alinear);

            TableEntrenador.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableEntrenador.getColumnModel().getColumn(1).setPreferredWidth(50);
            TableEntrenador.getColumnModel().getColumn(2).setPreferredWidth(150);
            TableEntrenador.getColumnModel().getColumn(3).setPreferredWidth(40);
            TableEntrenador.getColumnModel().getColumn(4).setPreferredWidth(70);
            TableEntrenador.getColumnModel().getColumn(5).setPreferredWidth(80);
            TableEntrenador.getColumnModel().getColumn(6).setPreferredWidth(120);
            TableEntrenador.getColumnModel().getColumn(7).setPreferredWidth(60);
            TableEntrenador.getColumnModel().getColumn(8).setPreferredWidth(300);

            TableEntrenador.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(19, 124, 169), Color.white));
            TableEntrenador.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableEntrenador.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableEntrenador.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableEntrenador.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableEntrenador.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableEntrenador.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableEntrenador.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableEntrenador.getColumnModel().getColumn(8).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));

        }
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION AGREGAR ENTRENADORES
    public void GuardarEntrenador() throws SQLException, FileNotFoundException {

        Entrenador entrenador = new Entrenador();
        EntrenadorDao entrenadorDAO = new EntrenadorDao();
        Connection conn = conexion.conectar();

        if (txtCedula.getText().equals("") || txtNombres.getText().equals("") || txtCorreo.getText().equals("") || txtTelefono.getText().equals("") || txtDireccion.getText().equals("")) {

            txtCedula.setBackground(new Color(248, 224, 224));
            txtNombres.setBackground(new Color(248, 224, 224));
            txtCorreo.setBackground(new Color(248, 224, 224));
            txtTelefono.setBackground(new Color(248, 224, 224));
            txtDireccion.setBackground(new Color(248, 224, 224));

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "Atención...No Debe Haber Campos Vacios",
                    "ENTRENADOR", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        } else {

            try {
                if (entrenadorDAO.existeEntrenador(Integer.parseInt(txtCedula.getText())) == 0) {

                    String insertar = "INSERT INTO entrenador(cedula,nombres,sexo,horario,asistencia,correo,telefono,direccion) values (?,?,?,?,?,?,?,?)";

                    PreparedStatement pst = conn.prepareStatement(insertar);

                    pst.setString(1, txtCedula.getText());
                    pst.setString(2, txtNombres.getText());
                    pst.setString(3, CboxSexo.getItemAt(CboxSexo.getSelectedIndex()));
                    pst.setString(4, CboxHorario.getItemAt(CboxHorario.getSelectedIndex()));
                    pst.setString(5, CboxAsistencia.getItemAt(CboxAsistencia.getSelectedIndex()));
                    pst.setString(6, txtCorreo.getText());
                    pst.setString(7, txtTelefono.getText());
                    pst.setString(8, txtDireccion.getText());

                    pst.executeUpdate();

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                    JOptionPane.showMessageDialog(this, "El Registro Ha Sido Guardado Correctamente...!!!!",
                            "ENTRENADOR", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                    visualizar_tabla_entrenador(TableEntrenador);
                    limpiarEntrenador();
                    
                    txtCedula.setBackground(new Color(255, 255, 255));
                    txtNombres.setBackground(new Color(255, 255, 255));
                    txtCorreo.setBackground(new Color(255, 255, 255));
                    txtTelefono.setBackground(new Color(255, 255, 255));
                    txtDireccion.setBackground(new Color(255, 255, 255));

                } else {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "El Entrenador Ya Se Encuentra Registrado",
                            "ENTRENADOR", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                }

            } catch (SQLException ex) {
                Logger.getLogger(Operaciones_atletas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // METODO PARA EDITAR LOS ENTRENADORES
    public void editarEntrenador() throws SQLException {

        try {
            Entrenador entrena = new Entrenador();
            EntrenadorDao entrenaDAO = new EntrenadorDao();

            if (txtCedula.getText().equals("") || txtNombres.getText().equals("") || txtCorreo.getText().equals("") || txtTelefono.getText().equals("") || txtDireccion.getText().equals("")) {

                txtCedula.setBackground(new Color(248, 224, 224));
                txtNombres.setBackground(new Color(248, 224, 224));
                txtCorreo.setBackground(new Color(248, 224, 224));
                txtTelefono.setBackground(new Color(248, 224, 224));
                txtDireccion.setBackground(new Color(248, 224, 224));

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                JOptionPane.showMessageDialog(this, "Atención...No Debe Haber Campos Vacios",
                        "ENTRENADOR", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

            } else {

                entrena.setCedula(Integer.parseInt(txtCedula.getText()));
                entrena.setNombres(txtNombres.getText());
                entrena.setSexo(CboxSexo.getItemAt(CboxSexo.getSelectedIndex()));
                entrena.setHorario(CboxHorario.getItemAt(CboxHorario.getSelectedIndex()));
                entrena.setAsistencia(CboxAsistencia.getItemAt(CboxAsistencia.getSelectedIndex()));
                entrena.setCorreo(txtCorreo.getText());
                entrena.setTelefono(txtTelefono.getText());
                entrena.setDireccion(txtDireccion.getText());
                entrena.setIdentrenador(Integer.parseInt(txtIdentrenador.getText()));

                if (entrenaDAO.modificarEntrenadores(entrena)) {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));

                    JOptionPane.showMessageDialog(this, "Los Datos se Modificaron Correctamente",
                            "ENTRENADOR", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                    limpiarEntrenador();
                    visualizar_tabla_entrenador(TableEntrenador);

                } else {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                    JOptionPane.showMessageDialog(this, "Lo siento...!!! ha ocurrido un error guardando los datos",
                            "ENTRENADOR", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Error Desconocido" + "  " + e.getMessage());
        }

    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
 /*   FUNCION  PARA  ELIMINAR  LOS  ENTRENADORES ESTABLECIDOS */
    public void suprimirEntrenador() throws SQLException {

        if (txtCedula.getText().equals("") || txtNombres.getText().equals("") || txtCorreo.getText().equals("") || txtTelefono.getText().equals("") || txtDireccion.getText().equals("")) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
            JOptionPane.showMessageDialog(this, "Debe Seleccionar el Entrenador Que Desea Eliminar.",
                    "ENTRENADOR", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
            int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Eliminar este Pago..?",
                    "ENTRENADOR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            if (opcion == 0) {

                Entrenador entrena = new Entrenador();
              EntrenadorDao entrenaDAO = new EntrenadorDao();

                entrena.setIdentrenador(Integer.parseInt(txtIdentrenador.getText()));

                if (entrenaDAO.eliminarEntrenador(entrena.getIdentrenador())) {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "El Monto del pago se eliminó Correctamente.",
                            "ENTRENADOR", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                   limpiarEntrenador();
                    visualizar_tabla_entrenador(TableEntrenador);

                } else {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "No se ha Podido Eliminar el Registro.",
                            "ENTRENADOR", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                }
            }
        }
    }
     /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    
        public void limpiarEntrenador() {
            txtCedula.setText("");
            txtNombres.setText("");
            txtCorreo.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            CboxSexo.setSelectedIndex(0);
            CboxAsistencia.setSelectedIndex(0);
            CboxHorario.setSelectedIndex(0);
            
        }
    
     /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
        /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logoVentana.png"));
        return retValue;
    }

    // FUNCION PARA BUSCAR LOS ENTRENADORES EN LA TABLA DE OPERACIONES ENTRENADOR
    public void buscarEntrenador(String buscar) {

        EntrenadorDao buscaDao = new EntrenadorDao();

        DefaultTableModel modelo = buscaDao.buscarEntrenador_oper(buscar);

        TableEntrenador.setModel(modelo);

        TableEntrenador.setRowHeight(60);

        TableEntrenador.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 25));

        TableEntrenador.getTableHeader().setFont(new Font("Cambria", 1, 11));

        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
        TableEntrenador.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        TableEntrenador.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        TableEntrenador.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        TableEntrenador.getColumnModel().getColumn(4).setCellRenderer(Alinear);
        TableEntrenador.getColumnModel().getColumn(6).setCellRenderer(Alinear);
        TableEntrenador.getColumnModel().getColumn(7).setCellRenderer(Alinear);
        TableEntrenador.getColumnModel().getColumn(8).setCellRenderer(Alinear);
        TableEntrenador.getColumnModel().getColumn(8).setCellRenderer(Alinear);

        TableEntrenador.getColumnModel().getColumn(0).setPreferredWidth(30);
        TableEntrenador.getColumnModel().getColumn(1).setPreferredWidth(80);
        TableEntrenador.getColumnModel().getColumn(2).setPreferredWidth(150);
        TableEntrenador.getColumnModel().getColumn(3).setPreferredWidth(80);
        TableEntrenador.getColumnModel().getColumn(4).setPreferredWidth(80);
        TableEntrenador.getColumnModel().getColumn(5).setPreferredWidth(100);
        TableEntrenador.getColumnModel().getColumn(6).setPreferredWidth(160);
        TableEntrenador.getColumnModel().getColumn(7).setPreferredWidth(100);
        TableEntrenador.getColumnModel().getColumn(8).setPreferredWidth(250);

        TableEntrenador.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(19, 124, 169), Color.white));
        TableEntrenador.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableEntrenador.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableEntrenador.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableEntrenador.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableEntrenador.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableEntrenador.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableEntrenador.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableEntrenador.getColumnModel().getColumn(8).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));

    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
}
