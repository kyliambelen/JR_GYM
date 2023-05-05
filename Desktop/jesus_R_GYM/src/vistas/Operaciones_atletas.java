package vistas;

import Excel_reportes.AtletasExcel;
import Excel_reportes.ExportarExcel_atletas;
import bd.Conexion;
import dao.AtletasDao;
import entidades.Atletas;
import entidades.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
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
public class Operaciones_atletas extends javax.swing.JFrame {

    UIManager UI;
    AtletasDao atletaDAO;
    Atletas atleta = new Atletas();
    private FileInputStream fis;
    private int longitudBytes;
    public static Administracion adminAbre;
    public static ReporteAtleta_cedula buscaCed;
    public static ReporteAtleta_cedula verAtletas;
    public static BuscarPago addPagos;
    Usuarios usuar;

    int codigo = 0;
    private final Conexion conexion = new Conexion();

    public Operaciones_atletas() {

        initComponents();
        this.setTitle("ATLETAS");
        this.setExtendedState(Operaciones_atletas.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        this.setResizable(false);
        setIconImage(getIconImage());
        txtIdatletas.setVisible(false);
        txtUsuario_idAT.setVisible(false);
        txtRuta.setVisible(false);
    }

    Operaciones_atletas(Usuarios usuar) throws SQLException {
        initComponents();
        this.setTitle("ATLETAS");
        this.setExtendedState(Operaciones_atletas.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        this.setResizable(false);
        setIconImage(getIconImage());
        txtIdatletas.setVisible(false);
        txtUsuario_idAT.setVisible(false);
        txtRuta.setVisible(false);

        this.usuar = usuar;

        if (usuar.getIdRol() == 1 || usuar.getIdRol() == 2) {

            txtUsuario_idAT.setText("" + usuar.getIdusuario());

            // btnModuloAdmin.setVisible (true);
        } else {

        }
        visualizar_tabla_atletas(TableAtletas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGris = new javax.swing.JPanel();
        LabelBanner = new javax.swing.JLabel();
        PanelNegro = new javax.swing.JPanel();
        LabelCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        LabelNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        LabelEdad = new javax.swing.JLabel();
        txtAno_nacimiento = new javax.swing.JTextField();
        LabelSexo = new javax.swing.JLabel();
        CboxSexo = new javax.swing.JComboBox<>();
        LabelCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        LabelTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        LabelAsistencia = new javax.swing.JLabel();
        CboxAsistencia = new javax.swing.JComboBox<>();
        LabelModo_pago = new javax.swing.JLabel();
        LabelF_registro = new javax.swing.JLabel();
        txtFechaR = new com.toedter.calendar.JDateChooser();
        LabelDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        LabelObsevaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel_foto = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        txtUsuario_idAT = new javax.swing.JTextField();
        txtIdatletas = new javax.swing.JTextField();
        txtModo_pago = new javax.swing.JTextField();
        btnBuscarModo_pago = new javax.swing.JButton();
        PanelAzul = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtBuscarTabla = new javax.swing.JTextField();
        LabelBuscarTabla = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableAtletas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MenuReporte_general = new javax.swing.JMenuItem();
        MenuReporte_cedula = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuItemExport_excel = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGris.setBackground(new java.awt.Color(255, 255, 255));
        PanelGris.setMinimumSize(new java.awt.Dimension(1366, 730));
        PanelGris.setPreferredSize(new java.awt.Dimension(1366, 730));
        PanelGris.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerOA.jpg"))); // NOI18N
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelBanner.setMaximumSize(new java.awt.Dimension(1280, 300));
        LabelBanner.setMinimumSize(new java.awt.Dimension(1280, 300));
        LabelBanner.setPreferredSize(new java.awt.Dimension(1280, 300));
        LabelBanner.setVerifyInputWhenFocusTarget(false);
        PanelGris.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1260, 150));

        PanelNegro.setBackground(new java.awt.Color(51, 51, 51));
        PanelNegro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelNegro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelCedula.setForeground(new java.awt.Color(255, 255, 255));
        LabelCedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelCedula.setText("CEDULA");
        PanelNegro.add(LabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 70, 25));

        txtCedula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(102, 102, 102));
        txtCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCedula.setNextFocusableComponent(txtNombres);
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        PanelNegro.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 240, 25));

        LabelNombres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelNombres.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelNombres.setText("NOMBRES");
        PanelNegro.add(LabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 70, 25));

        txtNombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(102, 102, 102));
        txtNombres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNombres.setNextFocusableComponent(txtAno_nacimiento);
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        PanelNegro.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 240, 25));

        LabelEdad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelEdad.setForeground(new java.awt.Color(255, 255, 255));
        LabelEdad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelEdad.setText("AÑO NACIMIENTO");
        PanelNegro.add(LabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 25));

        txtAno_nacimiento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAno_nacimiento.setForeground(new java.awt.Color(102, 102, 102));
        txtAno_nacimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAno_nacimiento.setNextFocusableComponent(CboxSexo);
        txtAno_nacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAno_nacimientoKeyTyped(evt);
            }
        });
        PanelNegro.add(txtAno_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 240, 25));

        LabelSexo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelSexo.setForeground(new java.awt.Color(255, 255, 255));
        LabelSexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelSexo.setText("SEXO");
        PanelNegro.add(LabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 70, 25));

        CboxSexo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CboxSexo.setForeground(new java.awt.Color(102, 102, 102));
        CboxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino\t", "Femenino", "Otro" }));
        CboxSexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        CboxSexo.setNextFocusableComponent(txtCorreo);
        PanelNegro.add(CboxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 240, 25));

        LabelCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorreo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelCorreo.setText("E-MAIL");
        PanelNegro.add(LabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 70, 25));

        txtCorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCorreo.setNextFocusableComponent(txtTelefono);
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
        PanelNegro.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 240, 25));

        LabelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelTelefono.setText("TELEFONO");
        PanelNegro.add(LabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 110, 25));

        txtTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(102, 102, 102));
        txtTelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtTelefono.setNextFocusableComponent(CboxAsistencia);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        PanelNegro.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 240, 25));

        LabelAsistencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        LabelAsistencia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelAsistencia.setText("ASISTENCIA");
        PanelNegro.add(LabelAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 110, 25));

        CboxAsistencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CboxAsistencia.setForeground(new java.awt.Color(102, 102, 102));
        CboxAsistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diaria", "Tres Dias a la Semana", "Eventualmente", "Entrenamiento Acordado", "Otro" }));
        CboxAsistencia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelNegro.add(CboxAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 240, 25));

        LabelModo_pago.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelModo_pago.setForeground(new java.awt.Color(255, 255, 255));
        LabelModo_pago.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelModo_pago.setText("MODO DE PAGO");
        PanelNegro.add(LabelModo_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 110, 25));

        LabelF_registro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelF_registro.setForeground(new java.awt.Color(255, 255, 255));
        LabelF_registro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelF_registro.setText("FECHA REGISTRO");
        PanelNegro.add(LabelF_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 110, 25));

        txtFechaR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtFechaR.setForeground(new java.awt.Color(102, 102, 102));
        txtFechaR.setDateFormatString("dd-MM-yyyy");
        txtFechaR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFechaR.setNextFocusableComponent(txtDireccion);
        PanelNegro.add(txtFechaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 240, 25));

        LabelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        LabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelDireccion.setText("DIRECCION");
        PanelNegro.add(LabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 110, 25));

        txtDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(102, 102, 102));
        txtDireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDireccion.setNextFocusableComponent(txtObservaciones);
        PanelNegro.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 240, 25));

        LabelObsevaciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelObsevaciones.setForeground(new java.awt.Color(255, 255, 255));
        LabelObsevaciones.setText("OBSERVACIONES");
        PanelNegro.add(LabelObsevaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 5, 110, 10));

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtObservaciones.setRows(5);
        txtObservaciones.setToolTipText("<html>\n<p><b>Coloque las Observaciones Necesarias del Atleta....<br>\nPor ejemplo: Si presenta impedimentos físico- motor, si toma <br>\nalgun medicamento, si presenta alguna enfermedad cardiaca,<br>\nsi es hipertenso, si sufrió lesiones óseas o musculares....etc.</b></p><br>\n<p style=\"color:blue\"><b>NOTA: Es importante conocer los antecedentes del atleta y dejar <br>\npor sentado que realizará sus entrenamientos a pleno conocimientos<br>\nde sus facultades físicas y mental; y que está al tanto de los posibles<br>\n problemas que puedan presentarse por<span style=\"color:red\"> \"OMITIR\"</span> algun aspecto<br>\n médico importante relacionado con su salud física y mental..!!!!</b></p>\n\n</html>");
        txtObservaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtObservaciones.setNextFocusableComponent(jLabel_foto);
        jScrollPane2.setViewportView(txtObservaciones);

        PanelNegro.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 23, 210, 130));

        jLabel_foto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_foto.setForeground(new java.awt.Color(255, 102, 0));
        jLabel_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_foto.setToolTipText("<html>\n<p style=\"color:blue\">Haga CLICK--AQUI</p>\n<span style=\"color:red\">Para cargar una foto.</span");
        jLabel_foto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FOTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 102, 0))); // NOI18N
        jLabel_foto.setOpaque(true);
        jLabel_foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_fotoMouseClicked(evt);
            }
        });
        PanelNegro.add(jLabel_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, 90, 90));

        txtRuta.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        txtRuta.setForeground(new java.awt.Color(153, 153, 153));
        PanelNegro.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 140, 150, -1));

        txtUsuario_idAT.setEditable(false);
        PanelNegro.add(txtUsuario_idAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 30, 20));

        txtIdatletas.setEditable(false);
        txtIdatletas.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        PanelNegro.add(txtIdatletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 30, -1));
        txtIdatletas.getAccessibleContext().setAccessibleDescription("");

        txtModo_pago.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtModo_pago.setForeground(new java.awt.Color(102, 102, 102));
        PanelNegro.add(txtModo_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 200, 25));

        btnBuscarModo_pago.setBackground(new java.awt.Color(0, 204, 255));
        btnBuscarModo_pago.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscarModo_pago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/presionaDedo.png"))); // NOI18N
        btnBuscarModo_pago.setToolTipText("<html>\n\n<h3 style=\"background-color:black;\"><span style=\"color: #FFFFFF\">Presione AQUI</span></h3>\n\n\n\n</html>");
        btnBuscarModo_pago.setAlignmentY(0.15F);
        btnBuscarModo_pago.setBorderPainted(false);
        btnBuscarModo_pago.setContentAreaFilled(false);
        btnBuscarModo_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarModo_pagoActionPerformed(evt);
            }
        });
        PanelNegro.add(btnBuscarModo_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 30, 25));

        PanelGris.add(PanelNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 1260, 170));

        PanelAzul.setBackground(new java.awt.Color(250, 116, 1));
        PanelAzul.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(255, 255, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarEntrenador2.png"))); // NOI18N
        btnAgregar.setToolTipText("Agregar Registros");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardarEntrenador.png"))); // NOI18N
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarEntrenador2.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        PanelAzul.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));
        btnAgregar.getAccessibleContext().setAccessibleDescription("");

        btnEditar.setBackground(new java.awt.Color(0, 153, 0));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarEntrenador2.png"))); // NOI18N
        btnEditar.setToolTipText("Modificar Registros");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarEntrenador.png"))); // NOI18N
        btnEditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarEntrenador2.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PanelAzul.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 70, 30));
        btnEditar.getAccessibleContext().setAccessibleDescription("");

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarEntrenador.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar Registros");
        btnEliminar.setBorder(null);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarEntrenador2.png"))); // NOI18N
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarEntrenador.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PanelAzul.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 70, 30));
        btnEliminar.getAccessibleContext().setAccessibleDescription("");

        btnLimpiar.setBackground(new java.awt.Color(0, 102, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLimpiarAtletas2.png"))); // NOI18N
        btnLimpiar.setToolTipText("Limpiar Todos los campos de Textos");
        btnLimpiar.setBorder(null);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLimpiarAtletas.png"))); // NOI18N
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLimpiarAtletas2.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelAzul.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, 30));
        btnLimpiar.getAccessibleContext().setAccessibleDescription("");

        txtBuscarTabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBuscarTabla.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscarTabla.setToolTipText("Introduzca un Valor Para la Busqueda");
        txtBuscarTabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarTablaKeyReleased(evt);
            }
        });
        PanelAzul.add(txtBuscarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 320, 25));

        LabelBuscarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarjr.png"))); // NOI18N
        PanelAzul.add(LabelBuscarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, 30));

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(246, 11, 22));
        LabelTitulo.setText("REGISTRO DE ATLETAS");
        PanelAzul.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 270, 50));

        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 102));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalirAtletas2.png"))); // NOI18N
        btnAtras.setToolTipText("Cerrar Ventana");
        btnAtras.setBorder(null);
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalirAtletas.png"))); // NOI18N
        btnAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalirAtletas2.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        PanelAzul.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 70, 30));

        PanelGris.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 1260, 50));

        TableAtletas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TableAtletas.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        TableAtletas.setForeground(new java.awt.Color(102, 102, 102));
        TableAtletas.setModel(new javax.swing.table.DefaultTableModel(
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
        TableAtletas.setRowHeight(22);
        TableAtletas.setSelectionBackground(new java.awt.Color(153, 204, 255));
        TableAtletas.setSelectionForeground(new java.awt.Color(51, 0, 0));
        TableAtletas.setShowVerticalLines(false);
        TableAtletas.setUpdateSelectionOnSort(false);
        TableAtletas.setVerifyInputWhenFocusTarget(false);
        TableAtletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableAtletasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableAtletas);

        PanelGris.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 1260, 270));

        getContentPane().add(PanelGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 730));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(63, 35));

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportesRutinas.jpg"))); // NOI18N
        jMenu2.setText("  REPORTES");
        jMenu2.setToolTipText("");
        jMenu2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jMenu2.setIconTextGap(0);
        jMenu2.setPreferredSize(new java.awt.Dimension(175, 20));

        MenuReporte_general.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuReporte_general.setText("Reporte General");
        MenuReporte_general.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuReporte_general.setPreferredSize(new java.awt.Dimension(175, 30));
        MenuReporte_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReporte_generalActionPerformed(evt);
            }
        });
        jMenu2.add(MenuReporte_general);

        MenuReporte_cedula.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuReporte_cedula.setText("Reporte Por Cedula");
        MenuReporte_cedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuReporte_cedula.setPreferredSize(new java.awt.Dimension(175, 30));
        MenuReporte_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReporte_cedulaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuReporte_cedula);

        jMenuBar1.add(jMenu2);

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excel.jpg"))); // NOI18N
        jMenu1.setText("   EXCEL");
        jMenu1.setActionCommand("EXCEL");
        jMenu1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jMenu1.setIconTextGap(0);
        jMenu1.setPreferredSize(new java.awt.Dimension(174, 20));

        jMenuItem1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jMenuItem1.setText("Reporte Atletas");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem1.setPreferredSize(new java.awt.Dimension(173, 30));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        MenuItemExport_excel.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        MenuItemExport_excel.setText("Exportar Tabla a Excel");
        MenuItemExport_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemExport_excelActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemExport_excel);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            GuardarAtletas();
        } catch (SQLException | FileNotFoundException ex) {
            Logger.getLogger(Operaciones_atletas.class.getName()).log(Level.SEVERE, null, ex);
        }

        visualizar_tabla_atletas(TableAtletas);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jLabel_fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_fotoMouseClicked

        //Creamos nuestra variable archivo en la cual podremos usar todos los metodos de la clase jFileChooser
        JFileChooser archivo = new JFileChooser();
        //Si deseamos crear filtros para la selecion de archivos
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPG;*.JPEG)", "jpg", "jpeg");
        //Si deseas que se muestre primero los filtros usa la linea q esta abajo de esta.
        //archivo.setFileFilter(filtro);
        // Agregamos el Filtro pero cuidado se mostrara despues de todos los archivos
        archivo.addChoosableFileFilter(filtro);
        // Colocamos titulo a nuestra ventana de Seleccion
        archivo.setDialogTitle("Abrir Archivo");
        //Si deseamos que muestre una carpeta predetermina usa la siguiente linea
        //File ruta = new File("D:/productos");
        File ruta = new File("C:\\Users\\MIGUEL A. RODRIGUEZ\\Desktop\\FOTOS FUCIONARIOS SAIME");
        //Le implementamos a nuestro ventana de seleccion
        archivo.setCurrentDirectory(ruta);
        //Abrimos nuestra Ventana de Selccion
        int ventana = archivo.showOpenDialog(null);
        //hacemos comparacion en caso de aprete el boton abrir
        if (ventana == JFileChooser.APPROVE_OPTION) {
            //Obtenemos la ruta de nuestra imagen seleccionada
            File file = archivo.getSelectedFile();
            //Lo imprimimos en una caja de texto para ver su ruta
            txtRuta.setText(String.valueOf(file));
            //de cierto modo necesitamos tener la imagen para ello debemos conocer la ruta de dicha imagen
            Image foto = getToolkit().getImage(txtRuta.getText());
            //Le damos dimension a nuestro label que tendra la imagen
            foto = foto.getScaledInstance(90, 90, Image.SCALE_DEFAULT);
            //Imprimimos la imagen en el label
            jLabel_foto.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_jLabel_fotoMouseClicked

    private void TableAtletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAtletasMouseClicked

        try {

            Connection conn = conexion.conectar();
            int Fila = TableAtletas.getSelectedRow();
            int ID = (Integer.parseInt(TableAtletas.getValueAt(Fila, 0).toString()));

            PreparedStatement pst = conn.prepareStatement("SELECT * FROM atletas WHERE idatletas = '" + ID + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                //Datos consultados
                txtIdatletas.setText(rs.getString("idatletas"));
                txtCedula.setText(rs.getString("cedula"));
                txtNombres.setText(rs.getString("nombres"));
                txtAno_nacimiento.setText(rs.getString("ano_nacimiento"));
                CboxSexo.setSelectedItem(rs.getString("sexo"));
                txtCorreo.setText(rs.getString("correo"));
                txtTelefono.setText(rs.getString("telefono"));
                CboxAsistencia.setSelectedItem(rs.getString("asistencia"));
                txtModo_pago.setText(rs.getString("modo_pago"));

                String ls_fecha = String.valueOf(TableAtletas.getValueAt(TableAtletas.getSelectedRow(), 9));
                SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date fecha;
                try {
                    fecha = (java.util.Date) s.parse(ls_fecha);
                    txtFechaR.setDate(fecha);
                } catch (ParseException e) {
                }

                txtDireccion.setText(rs.getString("direccion"));
                txtObservaciones.setText(rs.getString("observaciones"));
                txtRuta.setText(rs.getString("ruta"));

                //leer Binario
                Blob blob = rs.getBlob(15);
                //pasar el binario a imagen
                byte[] data = blob.getBytes(1, (int) blob.length());
                //lee la imagen
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

                ImageIcon icono = new ImageIcon(img);
                Icon imagen = new ImageIcon(icono.getImage().getScaledInstance(jLabel_foto.getWidth(), jLabel_foto.getHeight(), Image.SCALE_DEFAULT));
                jLabel_foto.setIcon(imagen);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error al cargar!");
            System.out.println("Error al cargar foto: " + e);
        }
    }//GEN-LAST:event_TableAtletasMouseClicked

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
                    "Atletas", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped

    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtAno_nacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAno_nacimientoKeyTyped
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
                    "Atletas", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtAno_nacimientoKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped


    }//GEN-LAST:event_txtCorreoKeyTyped

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
                    "Atletas", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));

            txtCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoFocusLost

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
                    "Atletas", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        try {
            editarAtletas1();
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones_atletas.class.getName()).log(Level.SEVERE, null, ex);
        }
        visualizar_tabla_atletas(TableAtletas);
        limpiar();


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarAtletas();
        visualizar_tabla_atletas(TableAtletas);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //visualizar_tabla_atletas(TableAtletas);
    }//GEN-LAST:event_formWindowOpened

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Administracion.opAtle = null;
        Operaciones_Asistencia.searchAtletas = null;
        Control_pagos.agregaAtletas = null;

        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtBuscarTablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTablaKeyReleased

        buscarAtletas(txtBuscarTabla.getText());
        if (txtBuscarTabla.getText().isEmpty()) {

            visualizar_tabla_atletas(TableAtletas);
        }
    }//GEN-LAST:event_txtBuscarTablaKeyReleased

    private void MenuReporte_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReporte_cedulaActionPerformed

        if (buscaCed == null) {

            buscaCed = new ReporteAtleta_cedula();
            buscaCed.setVisible(true);
        }
    }//GEN-LAST:event_MenuReporte_cedulaActionPerformed

    private void MenuReporte_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReporte_generalActionPerformed

        reportTodosAtletas();
    }//GEN-LAST:event_MenuReporte_generalActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        AtletasExcel.reporteAtletas();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnBuscarModo_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarModo_pagoActionPerformed

        Operaciones_atletas ADDPAGOS = null;
        addPagos = new BuscarPago(ADDPAGOS, true);
        addPagos.setVisible(true);
    }//GEN-LAST:event_btnBuscarModo_pagoActionPerformed

    private void MenuItemExport_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemExport_excelActionPerformed
       
        exportarExcel();
    }//GEN-LAST:event_MenuItemExport_excelActionPerformed

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION PARA VISUALIZAR LA TABLA DE ATLETAS
    AtletasDao atletas = null;

    public void visualizar_tabla_atletas(JTable TableAtletas) {

        TableAtletas.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel tableAT = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableAT.addColumn("ID");
        tableAT.addColumn("CEDULA");
        tableAT.addColumn("NOMBRES");
        tableAT.addColumn("EDAD");
        tableAT.addColumn("SEXO");
        tableAT.addColumn("CORREO");
        tableAT.addColumn("TELEFONO");
        tableAT.addColumn("ASISTENCIA");
        tableAT.addColumn("PAGO");
        tableAT.addColumn("REGISTRO");
        tableAT.addColumn("DIRECCION");
        tableAT.addColumn("FOTO");

        atletas = new AtletasDao();
        Atletas atle = new Atletas();
        ArrayList<Atletas> list = atletas.Listar_atletas();

        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[12];
                atle = list.get(i);
                fila[0] = atle.getIdatletas();
                fila[1] = atle.getCedula();
                fila[2] = atle.getNombres();
                fila[3] = atle.getAno_nacimiento();
                fila[4] = atle.getSexo();
                fila[5] = atle.getCorreo();
                fila[6] = atle.getTelefono();
                fila[7] = atle.getAsistencia();
                fila[8] = atle.getModo_pago();
                fila[9] = atle.getFecha_registro();
                fila[10] = atle.getDireccion();
                try {
                    byte[] bi = atle.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[11] = new JLabel(imgi);

                } catch (IOException ex) {
                    fila[11] = new JLabel("No imagen");
                }
                tableAT.addRow(fila);
            }
            TableAtletas.setModel(tableAT);
            TableAtletas.setRowHeight(60);

            TableAtletas.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 25));

            TableAtletas.getTableHeader().setFont(new Font("Cambria", 1, 11));

            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
            TableAtletas.getColumnModel().getColumn(0).setCellRenderer(Alinear);
            TableAtletas.getColumnModel().getColumn(1).setCellRenderer(Alinear);
            TableAtletas.getColumnModel().getColumn(3).setCellRenderer(Alinear);
            TableAtletas.getColumnModel().getColumn(4).setCellRenderer(Alinear);
            TableAtletas.getColumnModel().getColumn(6).setCellRenderer(Alinear);
            TableAtletas.getColumnModel().getColumn(7).setCellRenderer(Alinear);
            TableAtletas.getColumnModel().getColumn(8).setCellRenderer(Alinear);
            TableAtletas.getColumnModel().getColumn(8).setCellRenderer(Alinear);
            TableAtletas.getColumnModel().getColumn(9).setCellRenderer(Alinear);

            TableAtletas.getColumnModel().getColumn(0).setPreferredWidth(30);
            TableAtletas.getColumnModel().getColumn(1).setPreferredWidth(70);
            TableAtletas.getColumnModel().getColumn(2).setPreferredWidth(150);
            TableAtletas.getColumnModel().getColumn(3).setPreferredWidth(45);
            TableAtletas.getColumnModel().getColumn(4).setPreferredWidth(75);
            TableAtletas.getColumnModel().getColumn(5).setPreferredWidth(160);
            TableAtletas.getColumnModel().getColumn(6).setPreferredWidth(85);
            TableAtletas.getColumnModel().getColumn(7).setPreferredWidth(160);
            TableAtletas.getColumnModel().getColumn(8).setPreferredWidth(70);
            TableAtletas.getColumnModel().getColumn(9).setPreferredWidth(80);
            TableAtletas.getColumnModel().getColumn(10).setPreferredWidth(250);

            TableAtletas.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(19, 124, 169), Color.white));
            TableAtletas.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableAtletas.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableAtletas.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableAtletas.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableAtletas.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableAtletas.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableAtletas.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableAtletas.getColumnModel().getColumn(8).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableAtletas.getColumnModel().getColumn(9).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableAtletas.getColumnModel().getColumn(10).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
            TableAtletas.getColumnModel().getColumn(11).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));

        }
    }


    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION AGREGAR
    public void GuardarAtletas() throws SQLException, FileNotFoundException {

        Atletas atletas = new Atletas();
        AtletasDao atleDAO = new AtletasDao();
        Connection conn = conexion.conectar();

        if (txtCedula.getText().equals("") || txtNombres.getText().equals("") || txtAno_nacimiento.getText().equals("") || txtCorreo.getText().equals("") || txtTelefono.getText().equals("") || txtDireccion.getText().equals("") || txtFechaR.getDate() == null || txtObservaciones.getText().equals("")) {

            txtCedula.setBackground(new Color(248, 224, 224));
            txtNombres.setBackground(new Color(248, 224, 224));
            txtAno_nacimiento.setBackground(new Color(248, 224, 224));
            txtCorreo.setBackground(new Color(248, 224, 224));
            txtTelefono.setBackground(new Color(248, 224, 224));
            txtDireccion.setBackground(new Color(248, 224, 224));
            txtObservaciones.setBackground(new Color(248, 224, 224));

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "Atención...No Debe Haber Campos Vacios",
                    "ATLETAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        } else if (txtRuta.getText().equals("")) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "Atención...Debe Seleccionar Una Foto",
                    "ATLETAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        } else {

            try {
                if (atleDAO.existeAtleta(Integer.parseInt(txtCedula.getText())) == 0) {

                    String insertar = "INSERT INTO atletas(fecha_registro,cedula,nombres,telefono,sexo,ano_nacimiento,correo,direccion,asistencia,modo_pago,observaciones,ruta,foto) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

                    String fecha;
                    FileInputStream archivoFoto;
                    PreparedStatement pst = conn.prepareStatement(insertar);
                    java.util.Date date = new java.util.Date();
                    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                    fecha = f.format(txtFechaR.getDate());

                    pst.setString(1, fecha);
                    pst.setString(2, txtCedula.getText());
                    pst.setString(3, txtNombres.getText());
                    pst.setString(4, txtTelefono.getText());
                    pst.setString(5, CboxSexo.getItemAt(CboxSexo.getSelectedIndex()));
                    pst.setString(6, txtAno_nacimiento.getText());
                    pst.setString(7, txtCorreo.getText());
                    pst.setString(8, txtDireccion.getText());
                    pst.setString(9, CboxAsistencia.getItemAt(CboxAsistencia.getSelectedIndex()));
                    pst.setString(10, txtModo_pago.getText());
                    pst.setString(11, txtObservaciones.getText());
                    pst.setString(12, txtRuta.getText());
                    archivoFoto = new FileInputStream(txtRuta.getText());
                    pst.setBinaryStream(13, archivoFoto);

                    pst.executeUpdate();

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                    JOptionPane.showMessageDialog(this, "Su registro se guardó satisfactoriamente...!!!!",
                            "ATLETAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                    visualizar_tabla_atletas(TableAtletas);
                    limpiar();

                    txtCedula.setBackground(new Color(255, 255, 255));
                    txtNombres.setBackground(new Color(255, 255, 255));
                    txtAno_nacimiento.setBackground(new Color(255, 255, 255));
                    txtCorreo.setBackground(new Color(255, 255, 255));
                    txtTelefono.setBackground(new Color(255, 255, 255));
                    txtDireccion.setBackground(new Color(255, 255, 255));
                    txtObservaciones.setBackground(new Color(255, 255, 255));

                } else {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "El Cliente Ya Se Encuentra Registrado",
                            "ATLETAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                }

            } catch (SQLException ex) {
                Logger.getLogger(Operaciones_atletas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // METODO PARA EDITAR LOS ATLETAS CON IMAGEN
    public void editarAtletas1() throws SQLException {

        if (txtCedula.getText().equals("") || txtNombres.getText().equals("") || txtAno_nacimiento.getText().equals("") || txtCorreo.getText().equals("") || txtTelefono.getText().equals("") || txtDireccion.getText().equals("") || txtFechaR.getDate() == null || txtObservaciones.getText().equals("")) {

            txtCedula.setBackground(new Color(248, 224, 224));
            txtNombres.setBackground(new Color(248, 224, 224));
            txtAno_nacimiento.setBackground(new Color(248, 224, 224));
            txtCorreo.setBackground(new Color(248, 224, 224));
            txtTelefono.setBackground(new Color(248, 224, 224));
            txtDireccion.setBackground(new Color(248, 224, 224));
            txtObservaciones.setBackground(new Color(248, 224, 224));

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "Atención...No Debe Haber Campos Vacios",
                    "ATLETAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        } else {

            try {
                Connection conn = conexion.conectar();
                FileInputStream archivofoto;
                File nombre = new File(txtRuta.getText());
                archivofoto = new FileInputStream(nombre);
                String sql = "UPDATE atletas SET fecha_registro=?,cedula=?,nombres = ?, telefono = ?, sexo = ?, ano_nacimiento=?, correo=?, direccion=?,asistencia=?,modo_pago=?,observaciones=?,ruta=?, foto = ?  WHERE idatletas = ?";
                String fecha;
                java.util.Date date = new java.util.Date();
                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                fecha = f.format(txtFechaR.getDate());

                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, fecha);
                pst.setString(2, txtCedula.getText());
                pst.setString(3, txtNombres.getText());
                pst.setString(4, txtTelefono.getText());
                pst.setString(5, (CboxSexo.getItemAt(CboxSexo.getSelectedIndex())));
                pst.setString(6, txtAno_nacimiento.getText());
                pst.setString(7, txtCorreo.getText());
                pst.setString(8, txtDireccion.getText());
                pst.setString(9, (CboxAsistencia.getItemAt(CboxAsistencia.getSelectedIndex())));
                pst.setString(10, txtModo_pago.getText());
                pst.setString(11, txtObservaciones.getText());
                archivofoto = new FileInputStream(txtRuta.getText());
                pst.setString(12, txtRuta.getText());
                pst.setBinaryStream(13, archivofoto);
                pst.setString(14, txtIdatletas.getText());

                int n = pst.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "Datos actualizados con exito");

                    txtRuta.setText(null);
                    jLabel_foto.setIcon(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo error en el momento de actualizar los datos");
                }
            } catch (SQLException | FileNotFoundException ex) {
                Logger.getLogger(Operaciones_atletas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void eliminarAtletas() {

        Connection conn = conexion.conectar();

        if (txtCedula.getText().equals("") || txtNombres.getText().equals("") || txtAno_nacimiento.getText().equals("") || txtCorreo.getText().equals("") || txtTelefono.getText().equals("") || txtDireccion.getText().equals("") || txtFechaR.getDate() == null || txtObservaciones.getText().equals("")) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(254, 254, 254));
            UIManager.put("Panel.background", new Color(254, 254, 254));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "ATENCION..! No Debe Haber Campos Vacios",
                    "ATLETAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            UI = null;
            UIManager.put("OptionPane.background", new Color(254, 254, 254));
            UIManager.put("Panel.background", new Color(254, 254, 254));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Eliminar Este Usuario..?",
                    "ATLETAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            if (opcion == 0) {

                int fila = TableAtletas.getSelectedRow();
                if (fila > -1) {
                    String idatletas = TableAtletas.getValueAt(fila, 0).toString();
                    String sql = "DELETE FROM atletas WHERE idatletas='" + idatletas + "'";
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
                                    "ATLETAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                            limpiar();
                        } else {
                            UI = null;
                            UIManager.put("OptionPane.background", new Color(254, 254, 254));
                            UIManager.put("Panel.background", new Color(254, 254, 254));
                            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                            JOptionPane.showMessageDialog(this, "No se ha Podido Eliminar el Registro.",
                                    "ATLETAS", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Operaciones_atletas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    // FUNCION PARA BUSCAR LOS ATLETAS EN LA TABLA DE OPERACIONES 
    public void buscarAtletas(String buscar) {

        AtletasDao buscaDao = new AtletasDao();

        DefaultTableModel modelo = buscaDao.buscarAtletas_oper(buscar);

        TableAtletas.setModel(modelo);

        TableAtletas.setRowHeight(60);

        TableAtletas.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 25));

        TableAtletas.getTableHeader().setFont(new Font("Cambria", 1, 11));

        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
        TableAtletas.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        TableAtletas.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        TableAtletas.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        TableAtletas.getColumnModel().getColumn(4).setCellRenderer(Alinear);
        TableAtletas.getColumnModel().getColumn(6).setCellRenderer(Alinear);
        TableAtletas.getColumnModel().getColumn(7).setCellRenderer(Alinear);
        TableAtletas.getColumnModel().getColumn(8).setCellRenderer(Alinear);
        TableAtletas.getColumnModel().getColumn(8).setCellRenderer(Alinear);
        TableAtletas.getColumnModel().getColumn(9).setCellRenderer(Alinear);

        TableAtletas.getColumnModel().getColumn(0).setPreferredWidth(30);
        TableAtletas.getColumnModel().getColumn(1).setPreferredWidth(70);
        TableAtletas.getColumnModel().getColumn(2).setPreferredWidth(150);
        TableAtletas.getColumnModel().getColumn(3).setPreferredWidth(45);
        TableAtletas.getColumnModel().getColumn(4).setPreferredWidth(75);
        TableAtletas.getColumnModel().getColumn(5).setPreferredWidth(160);
        TableAtletas.getColumnModel().getColumn(6).setPreferredWidth(85);
        TableAtletas.getColumnModel().getColumn(7).setPreferredWidth(160);
        TableAtletas.getColumnModel().getColumn(8).setPreferredWidth(70);
        TableAtletas.getColumnModel().getColumn(9).setPreferredWidth(80);
        TableAtletas.getColumnModel().getColumn(10).setPreferredWidth(250);

        TableAtletas.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(19, 124, 169), Color.white));
        TableAtletas.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableAtletas.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableAtletas.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableAtletas.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableAtletas.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableAtletas.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableAtletas.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableAtletas.getColumnModel().getColumn(8).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableAtletas.getColumnModel().getColumn(9).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableAtletas.getColumnModel().getColumn(10).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        //TableAtletas.getColumnModel().getColumn(11).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));

    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    //  FUNCION LIMPIAR CAMPOS DE TEXTOS
    public void limpiar() {
        txtCedula.setText("");
        txtNombres.setText("");
        txtTelefono.setText("");
        txtAno_nacimiento.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtObservaciones.setText("");
        txtRuta.setText(null);
        jLabel_foto.setIcon(null);
        txtIdatletas.setText("");
        CboxSexo.setSelectedIndex(0);
        CboxAsistencia.setSelectedIndex(0);
        txtModo_pago.setText("");
        txtFechaR.setDate(null);
    }

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
            java.util.logging.Logger.getLogger(Operaciones_atletas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones_atletas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones_atletas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones_atletas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>admin


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Operaciones_atletas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxAsistencia;
    private javax.swing.JComboBox<String> CboxSexo;
    private javax.swing.JLabel LabelAsistencia;
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JLabel LabelBuscarTabla;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelEdad;
    private javax.swing.JLabel LabelF_registro;
    private javax.swing.JLabel LabelModo_pago;
    private javax.swing.JLabel LabelNombres;
    private javax.swing.JLabel LabelObsevaciones;
    private javax.swing.JLabel LabelSexo;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JMenuItem MenuItemExport_excel;
    private javax.swing.JMenuItem MenuReporte_cedula;
    private javax.swing.JMenuItem MenuReporte_general;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelGris;
    private javax.swing.JPanel PanelNegro;
    private javax.swing.JTable TableAtletas;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscarModo_pago;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel_foto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtAno_nacimiento;
    private javax.swing.JTextField txtBuscarTabla;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    public static com.toedter.calendar.JDateChooser txtFechaR;
    private javax.swing.JTextField txtIdatletas;
    public static javax.swing.JTextField txtModo_pago;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario_idAT;
    // End of variables declaration//GEN-END:variables

    /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logoVentana.png"));
        return retValue;
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void reportTodosAtletas() {

        try {
            Connection conn = conexion.conectar();
            JasperReport reporte = null;

            Map parametro = new HashMap();

            parametro.put("img_logo", Operaciones_atletas.class.getResource("/reportes/logoJR3.png"));
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/report_ListarAtletas.jasper"));

            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            view.setVisible(true);
            view.setTitle("ATLETAS");
        } catch (JRException e) {
        }

    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    
    public void exportarExcel(){
        ExportarExcel_atletas obj;

        obj = new ExportarExcel_atletas();
        try {
            obj.exportarExcel_atletas(TableAtletas);
        } catch (IOException ex) {
            Logger.getLogger(Operaciones_atletas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
