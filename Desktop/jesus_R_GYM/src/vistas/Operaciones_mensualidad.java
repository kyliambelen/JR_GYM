package vistas;

import Excel_reportes.MensualidadExcel;
import bd.Conexion;
import dao.AtletasDao;
import dao.MensualidadDao;
import entidades.Atletas;
import entidades.Mensualidad;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Operaciones_mensualidad extends javax.swing.JFrame {

    UIManager UI;
    private FileInputStream fis;
    private int longitudBytes;
    Usuarios usuar;
    private final Conexion conexion = new Conexion();
    public static ReporteMensualidad_cedula buscaCedulaMS;

    public Operaciones_mensualidad(Usuarios usuar) {
        initComponents();
        this.setResizable(false);
        this.setTitle("MENSUALIDAD");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setIconImage(getIconImage());
        txtIdmensualidad.setVisible(false);
        txtUsuario_id.setVisible(false);
        txtRuta.setVisible(false);
        this.usuar = usuar;
        if (usuar.getIdRol() == 1) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        } else if (usuar.getIdRol() == 2) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        } else if (usuar.getIdRol() == 3) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        }
        visualizar_tabla_mensualidad(TableMensualidad);
    }

    public Operaciones_mensualidad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        PanelGris = new javax.swing.JPanel();
        LabelBanner = new javax.swing.JLabel();
        PanelCampo_texto = new javax.swing.JPanel();
        LabelCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        LabelNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        LabelEdad = new javax.swing.JLabel();
        txtForma_pago = new javax.swing.JTextField();
        LabelCorreo = new javax.swing.JLabel();
        txtNro_referencia = new javax.swing.JTextField();
        LabelTelefono = new javax.swing.JLabel();
        txtMonto_inscripcion = new javax.swing.JTextField();
        LabelF_registro = new javax.swing.JLabel();
        txtFecha_inscripcion = new com.toedter.calendar.JDateChooser();
        LabelDireccion = new javax.swing.JLabel();
        txtAbono_inscripcion = new javax.swing.JTextField();
        jLabel_foto = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        txtUsuario_id = new javax.swing.JTextField();
        txtIdmensualidad = new javax.swing.JTextField();
        LabelF_registro1 = new javax.swing.JLabel();
        txtFecha_membresia = new com.toedter.calendar.JDateChooser();
        LabelDireccion1 = new javax.swing.JLabel();
        txtPendiente_pago = new javax.swing.JTextField();
        LabelDireccion2 = new javax.swing.JLabel();
        txtMonto_mensualidad = new javax.swing.JTextField();
        LabelEntrenamiento = new javax.swing.JLabel();
        CboxEntrenamiento = new javax.swing.JComboBox<>();
        LabelTurno = new javax.swing.JLabel();
        CboxTurnos = new javax.swing.JComboBox<>();
        LabelHora_entrada = new javax.swing.JLabel();
        LabelHora_salida = new javax.swing.JLabel();
        LAbelEntrenador_per = new javax.swing.JLabel();
        LAbelMonto_entrenador = new javax.swing.JLabel();
        LAbelFecha_inicio = new javax.swing.JLabel();
        LabelFecha_final = new javax.swing.JLabel();
        txtEntrenador_per = new javax.swing.JTextField();
        txtMonto_entrenador = new javax.swing.JTextField();
        DateFecha_inicio = new com.toedter.calendar.JDateChooser();
        DateFecha_finaliza = new com.toedter.calendar.JDateChooser();
        txtHora_entrada = new javax.swing.JFormattedTextField();
        txtHora_salida = new javax.swing.JFormattedTextField();
        PanelBotonera = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtBuscarTabla = new javax.swing.JTextField();
        LabelBuscarTabla = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        LabelTitulo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableMensualidad = new javax.swing.JTable();
        MenuBarMensualidad = new javax.swing.JMenuBar();
        ReportMenu1 = new javax.swing.JMenu();
        MenuItemReport_todos = new javax.swing.JMenuItem();
        MenuItemReport_cedula = new javax.swing.JMenuItem();
        ReportMenu2 = new javax.swing.JMenu();
        MenuItemReport_todos1 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        PanelGris.setBackground(new java.awt.Color(204, 204, 204));
        PanelGris.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoMensualidad.png"))); // NOI18N
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelBanner.setMaximumSize(new java.awt.Dimension(1280, 300));
        LabelBanner.setMinimumSize(new java.awt.Dimension(1280, 300));
        LabelBanner.setPreferredSize(new java.awt.Dimension(1280, 300));
        LabelBanner.setVerifyInputWhenFocusTarget(false);
        PanelGris.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1260, 150));

        PanelCampo_texto.setBackground(new java.awt.Color(51, 51, 51));
        PanelCampo_texto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelCampo_texto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCedula.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelCedula.setForeground(new java.awt.Color(255, 255, 255));
        LabelCedula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelCedula.setText("CEDULA");
        LabelCedula.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        PanelCampo_texto.add(LabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 25));

        txtCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(102, 102, 102));
        txtCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        PanelCampo_texto.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 110, 25));

        LabelNombres.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelNombres.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNombres.setText("NOMBRES");
        LabelNombres.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        PanelCampo_texto.add(LabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 25));

        txtNombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(102, 102, 102));
        txtNombres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        PanelCampo_texto.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 180, 25));

        LabelEdad.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelEdad.setForeground(new java.awt.Color(255, 255, 255));
        LabelEdad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelEdad.setText("FORMA-PAGO");
        PanelCampo_texto.add(LabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 82, 25));

        txtForma_pago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtForma_pago.setForeground(new java.awt.Color(102, 102, 102));
        txtForma_pago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtForma_pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtForma_pagoKeyTyped(evt);
            }
        });
        PanelCampo_texto.add(txtForma_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 180, 25));

        LabelCorreo.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelCorreo.setText("Nro.REF");
        LabelCorreo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        PanelCampo_texto.add(LabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 25));

        txtNro_referencia.setEditable(false);
        txtNro_referencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNro_referencia.setForeground(new java.awt.Color(102, 102, 102));
        txtNro_referencia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNro_referencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNro_referenciaFocusLost(evt);
            }
        });
        txtNro_referencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNro_referenciaKeyTyped(evt);
            }
        });
        PanelCampo_texto.add(txtNro_referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, 25));

        LabelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelTelefono.setText("INSCRIPCION");
        LabelTelefono.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        PanelCampo_texto.add(LabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 25));

        txtMonto_inscripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMonto_inscripcion.setForeground(new java.awt.Color(102, 102, 102));
        txtMonto_inscripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtMonto_inscripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMonto_inscripcionKeyTyped(evt);
            }
        });
        PanelCampo_texto.add(txtMonto_inscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 180, 25));

        LabelF_registro.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelF_registro.setForeground(new java.awt.Color(255, 255, 255));
        LabelF_registro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelF_registro.setText("FECHA");
        LabelF_registro.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        PanelCampo_texto.add(LabelF_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 25));

        txtFecha_inscripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtFecha_inscripcion.setForeground(new java.awt.Color(102, 102, 102));
        txtFecha_inscripcion.setDateFormatString("dd-MM-yyyy");
        txtFecha_inscripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelCampo_texto.add(txtFecha_inscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 180, 25));

        LabelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        LabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelDireccion.setText("ABONO");
        PanelCampo_texto.add(LabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 82, 25));

        txtAbono_inscripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAbono_inscripcion.setForeground(new java.awt.Color(102, 102, 102));
        txtAbono_inscripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAbono_inscripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAbono_inscripcionKeyTyped(evt);
            }
        });
        PanelCampo_texto.add(txtAbono_inscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 180, 25));

        jLabel_foto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_foto.setForeground(new java.awt.Color(255, 102, 0));
        jLabel_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_foto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FOTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 102, 0))); // NOI18N
        jLabel_foto.setOpaque(true);
        jLabel_foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_fotoMouseClicked(evt);
            }
        });
        PanelCampo_texto.add(jLabel_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, 90, 90));

        txtRuta.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        txtRuta.setForeground(new java.awt.Color(153, 153, 153));
        PanelCampo_texto.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 130, 90, -1));

        txtUsuario_id.setEditable(false);
        PanelCampo_texto.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 30, 20));

        txtIdmensualidad.setEditable(false);
        txtIdmensualidad.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        PanelCampo_texto.add(txtIdmensualidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 30, -1));

        LabelF_registro1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelF_registro1.setForeground(new java.awt.Color(255, 255, 255));
        LabelF_registro1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelF_registro1.setText("FIN MEMBRESIA");
        PanelCampo_texto.add(LabelF_registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 82, 25));

        txtFecha_membresia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtFecha_membresia.setForeground(new java.awt.Color(102, 102, 102));
        txtFecha_membresia.setDateFormatString("dd-MM-yyyy");
        txtFecha_membresia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelCampo_texto.add(txtFecha_membresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 180, 25));

        LabelDireccion1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelDireccion1.setForeground(new java.awt.Color(255, 255, 255));
        LabelDireccion1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelDireccion1.setText("PENDIENTE");
        PanelCampo_texto.add(LabelDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 82, 25));

        txtPendiente_pago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPendiente_pago.setForeground(new java.awt.Color(102, 102, 102));
        txtPendiente_pago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPendiente_pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPendiente_pagoKeyTyped(evt);
            }
        });
        PanelCampo_texto.add(txtPendiente_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 180, 25));

        LabelDireccion2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelDireccion2.setForeground(new java.awt.Color(255, 255, 255));
        LabelDireccion2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelDireccion2.setText("MENSUALIDAD");
        PanelCampo_texto.add(LabelDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 82, 25));

        txtMonto_mensualidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMonto_mensualidad.setForeground(new java.awt.Color(102, 102, 102));
        txtMonto_mensualidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtMonto_mensualidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMonto_mensualidadKeyTyped(evt);
            }
        });
        PanelCampo_texto.add(txtMonto_mensualidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 180, 25));

        LabelEntrenamiento.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelEntrenamiento.setForeground(new java.awt.Color(255, 255, 255));
        LabelEntrenamiento.setText("ENTRENAMIENTO");
        PanelCampo_texto.add(LabelEntrenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 90, 25));

        CboxEntrenamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CboxEntrenamiento.setForeground(new java.awt.Color(102, 102, 102));
        CboxEntrenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Por Cuenta Propia", "Colectivo", "Personalizado" }));
        CboxEntrenamiento.setBorder(null);
        PanelCampo_texto.add(CboxEntrenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 180, 25));

        LabelTurno.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelTurno.setForeground(new java.awt.Color(255, 255, 255));
        LabelTurno.setText("TURNO");
        PanelCampo_texto.add(LabelTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 90, 25));

        CboxTurnos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CboxTurnos.setForeground(new java.awt.Color(102, 102, 102));
        CboxTurnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Mañana", "Tarde", "Noche" }));
        CboxTurnos.setBorder(null);
        PanelCampo_texto.add(CboxTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 180, 25));

        LabelHora_entrada.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelHora_entrada.setForeground(new java.awt.Color(255, 255, 255));
        LabelHora_entrada.setText("HORA ENTRADA");
        PanelCampo_texto.add(LabelHora_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 90, 25));

        LabelHora_salida.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelHora_salida.setForeground(new java.awt.Color(255, 255, 255));
        LabelHora_salida.setText("HORA SALIDA");
        PanelCampo_texto.add(LabelHora_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 90, 25));

        LAbelEntrenador_per.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LAbelEntrenador_per.setForeground(new java.awt.Color(255, 255, 255));
        LAbelEntrenador_per.setText("ENTRENADOR ");
        PanelCampo_texto.add(LAbelEntrenador_per, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 80, 25));

        LAbelMonto_entrenador.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LAbelMonto_entrenador.setForeground(new java.awt.Color(255, 255, 255));
        LAbelMonto_entrenador.setText("MONTO ENTRENADOR");
        PanelCampo_texto.add(LAbelMonto_entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 120, 25));

        LAbelFecha_inicio.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LAbelFecha_inicio.setForeground(new java.awt.Color(255, 255, 255));
        LAbelFecha_inicio.setText("FECHA INICIO");
        PanelCampo_texto.add(LAbelFecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 120, 25));

        LabelFecha_final.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LabelFecha_final.setForeground(new java.awt.Color(255, 255, 255));
        LabelFecha_final.setText("FECHA FINALIZACION");
        PanelCampo_texto.add(LabelFecha_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 120, 25));

        txtEntrenador_per.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEntrenador_per.setForeground(new java.awt.Color(102, 102, 102));
        txtEntrenador_per.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtEntrenador_per.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntrenador_perActionPerformed(evt);
            }
        });
        PanelCampo_texto.add(txtEntrenador_per, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 180, 25));

        txtMonto_entrenador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMonto_entrenador.setForeground(new java.awt.Color(102, 102, 102));
        txtMonto_entrenador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtMonto_entrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonto_entrenadorActionPerformed(evt);
            }
        });
        txtMonto_entrenador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMonto_entrenadorKeyTyped(evt);
            }
        });
        PanelCampo_texto.add(txtMonto_entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 180, 25));

        DateFecha_inicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        DateFecha_inicio.setForeground(new java.awt.Color(102, 102, 102));
        DateFecha_inicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelCampo_texto.add(DateFecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 180, 25));

        DateFecha_finaliza.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        DateFecha_finaliza.setForeground(new java.awt.Color(102, 102, 102));
        DateFecha_finaliza.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelCampo_texto.add(DateFecha_finaliza, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, 180, 25));

        txtHora_entrada.setBackground(new java.awt.Color(0, 153, 0));
        txtHora_entrada.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtHora_entrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHora_entrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora_entrada.setToolTipText("");
        txtHora_entrada.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        PanelCampo_texto.add(txtHora_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 70, 25));

        txtHora_salida.setBackground(new java.awt.Color(204, 0, 0));
        txtHora_salida.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtHora_salida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHora_salida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora_salida.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        PanelCampo_texto.add(txtHora_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 70, 25));

        PanelGris.add(PanelCampo_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 1260, 170));

        PanelBotonera.setBackground(new java.awt.Color(255, 199, 0));
        PanelBotonera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelBotonera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditar.setBackground(new java.awt.Color(0, 153, 0));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarMensualidad.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarMensualidad2.png"))); // NOI18N
        btnEditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarMensualidad.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PanelBotonera.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 30));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarMensualidad.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarMensualidad2.png"))); // NOI18N
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarMensualidad.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PanelBotonera.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 70, 30));

        btnLimpiar.setBackground(new java.awt.Color(0, 102, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarMensualidad.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarMensualidad2.png"))); // NOI18N
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarMensualidad.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelBotonera.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 70, 30));

        txtBuscarTabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBuscarTabla.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscarTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtBuscarTabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarTablaKeyReleased(evt);
            }
        });
        PanelBotonera.add(txtBuscarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 320, 30));

        LabelBuscarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarjr.png"))); // NOI18N
        PanelBotonera.add(LabelBuscarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, 30));

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirMensualidad.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirMensualidad2.png"))); // NOI18N
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirMensualidad.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelBotonera.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 70, 30));

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        LabelTitulo.setText("ADMINISTRAR MENSUALIDAD");
        PanelBotonera.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 310, 50));

        PanelGris.add(PanelBotonera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 1260, 50));

        TableMensualidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TableMensualidad.setFont(new java.awt.Font("Dubai Medium", 1, 10)); // NOI18N
        TableMensualidad.setForeground(new java.awt.Color(102, 102, 102));
        TableMensualidad.setModel(new javax.swing.table.DefaultTableModel(
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
        TableMensualidad.setRowHeight(22);
        TableMensualidad.setSelectionBackground(new java.awt.Color(255, 233, 150));
        TableMensualidad.setSelectionForeground(new java.awt.Color(51, 51, 51));
        TableMensualidad.setShowVerticalLines(false);
        TableMensualidad.setUpdateSelectionOnSort(false);
        TableMensualidad.setVerifyInputWhenFocusTarget(false);
        TableMensualidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMensualidadMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableMensualidad);

        PanelGris.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 1260, 240));

        MenuBarMensualidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        MenuBarMensualidad.setPreferredSize(new java.awt.Dimension(63, 40));

        ReportMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReportMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportesRutinas.jpg"))); // NOI18N
        ReportMenu1.setText("     REPORTES");
        ReportMenu1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        ReportMenu1.setIconTextGap(0);
        ReportMenu1.setMinimumSize(new java.awt.Dimension(173, 22));
        ReportMenu1.setPreferredSize(new java.awt.Dimension(220, 22));

        MenuItemReport_todos.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 10)); // NOI18N
        MenuItemReport_todos.setText("REPORTE MENSUALIDAD");
        MenuItemReport_todos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuItemReport_todos.setPreferredSize(new java.awt.Dimension(215, 30));
        MenuItemReport_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemReport_todosActionPerformed(evt);
            }
        });
        ReportMenu1.add(MenuItemReport_todos);

        MenuItemReport_cedula.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 10)); // NOI18N
        MenuItemReport_cedula.setText("REPORTE POR CEDULA");
        MenuItemReport_cedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuItemReport_cedula.setPreferredSize(new java.awt.Dimension(215, 30));
        MenuItemReport_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemReport_cedulaActionPerformed(evt);
            }
        });
        ReportMenu1.add(MenuItemReport_cedula);

        MenuBarMensualidad.add(ReportMenu1);

        ReportMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReportMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excel.jpg"))); // NOI18N
        ReportMenu2.setText("     EXCEL");
        ReportMenu2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        ReportMenu2.setIconTextGap(0);
        ReportMenu2.setMinimumSize(new java.awt.Dimension(173, 22));
        ReportMenu2.setPreferredSize(new java.awt.Dimension(210, 20));

        MenuItemReport_todos1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 10)); // NOI18N
        MenuItemReport_todos1.setText("REPORTE MENSUALIDAD");
        MenuItemReport_todos1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuItemReport_todos1.setIconTextGap(0);
        MenuItemReport_todos1.setPreferredSize(new java.awt.Dimension(207, 30));
        MenuItemReport_todos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemReport_todos1ActionPerformed(evt);
            }
        });
        ReportMenu2.add(MenuItemReport_todos1);

        MenuBarMensualidad.add(ReportMenu2);

        setJMenuBar(MenuBarMensualidad);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelGris, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelGris, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
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
                    "Atletas", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped

    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtForma_pagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtForma_pagoKeyTyped

    }//GEN-LAST:event_txtForma_pagoKeyTyped

    private void txtNro_referenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNro_referenciaFocusLost


    }//GEN-LAST:event_txtNro_referenciaFocusLost

    private void txtNro_referenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNro_referenciaKeyTyped

    }//GEN-LAST:event_txtNro_referenciaKeyTyped

    private void txtMonto_inscripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMonto_inscripcionKeyTyped

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
    }//GEN-LAST:event_txtMonto_inscripcionKeyTyped

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
        File ruta = new File("D:/productos");
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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        try {
            editarMensualidad();
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones_mensualidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        visualizar_tabla_mensualidad(TableMensualidad);
        limpiar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarMensualidad();
        visualizar_tabla_mensualidad(TableMensualidad);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Administracion.operMensualidad = null;
        Operaciones_Asistencia.operMensualidad2 = null;

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void TableMensualidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMensualidadMouseClicked

        try {

            Connection conn = conexion.conectar();
            int Fila = TableMensualidad.getSelectedRow();
            int ID = (Integer.parseInt(TableMensualidad.getValueAt(Fila, 0).toString()));

            PreparedStatement pst = conn.prepareStatement("SELECT idmensualidad,nroreferencia,cedula,nombres,fecha_inscripcion,fecha_final,monto_inscripcion,monto_mensualidad,monto_abono,monto_debe,forma_depago,nombre_entrenador,monto_entrenador,fecha_inicio,fecha_finaliza,entrenamientos,turno,hora_entrada,hora_salida,rutaFoto,foto FROM mensualidad WHERE idmensualidad = '" + ID + "'");
           
            
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                //Datos consultados
                txtIdmensualidad.setText(rs.getString("idmensualidad"));
                txtNro_referencia.setText(rs.getString("nroreferencia"));
                txtCedula.setText(rs.getString("cedula"));
                txtNombres.setText(rs.getString("nombres"));
                txtFecha_inscripcion.setDate(rs.getDate("fecha_inscripcion"));
                txtFecha_membresia.setDate(rs.getDate("fecha_final"));
                txtMonto_inscripcion.setText(rs.getString("monto_inscripcion"));
                txtMonto_mensualidad.setText(rs.getString("monto_mensualidad"));
                txtAbono_inscripcion.setText(rs.getString("monto_abono"));
                txtPendiente_pago.setText(rs.getString("monto_debe"));
                txtForma_pago.setText(rs.getString("forma_depago"));
                txtEntrenador_per.setText(rs.getString("nombre_entrenador"));
                txtMonto_entrenador.setText(rs.getString("monto_entrenador"));
                DateFecha_inicio.setDate(rs.getDate("fecha_inicio"));
                DateFecha_finaliza.setDate(rs.getDate("fecha_finaliza"));
                CboxEntrenamiento.setSelectedItem(rs.getString("entrenamientos"));
                CboxTurnos.setSelectedItem(rs.getString("turno"));
                txtHora_entrada.setText(rs.getString("hora_entrada"));
                txtHora_salida.setText(rs.getString("hora_salida"));
                txtRuta.setText(rs.getString("rutaFoto"));

                //leer Binario
                Blob blob = rs.getBlob(21);
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
    }//GEN-LAST:event_TableMensualidadMouseClicked

    private void txtEntrenador_perActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntrenador_perActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntrenador_perActionPerformed

    private void txtMonto_entrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonto_entrenadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonto_entrenadorActionPerformed

    private void txtMonto_entrenadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMonto_entrenadorKeyTyped

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
    }//GEN-LAST:event_txtMonto_entrenadorKeyTyped

    private void txtMonto_mensualidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMonto_mensualidadKeyTyped

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
    }//GEN-LAST:event_txtMonto_mensualidadKeyTyped

    private void txtPendiente_pagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPendiente_pagoKeyTyped

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
    }//GEN-LAST:event_txtPendiente_pagoKeyTyped

    private void MenuItemReport_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemReport_todosActionPerformed

        reportTodasMensualidad();
    }//GEN-LAST:event_MenuItemReport_todosActionPerformed

    private void MenuItemReport_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemReport_cedulaActionPerformed

        if (buscaCedulaMS == null) {

            buscaCedulaMS = new ReporteMensualidad_cedula();
            buscaCedulaMS.setVisible(true);
        }
    }//GEN-LAST:event_MenuItemReport_cedulaActionPerformed

    private void MenuItemReport_todos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemReport_todos1ActionPerformed

        MensualidadExcel.reporteMensualidad();
    }//GEN-LAST:event_MenuItemReport_todos1ActionPerformed

    private void txtBuscarTablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTablaKeyReleased

        buscarMensualidad(txtBuscarTabla.getText());
        if (txtBuscarTabla.getText().isEmpty()) {

            visualizar_tabla_mensualidad(TableMensualidad);
        }
    }//GEN-LAST:event_txtBuscarTablaKeyReleased

    private void txtAbono_inscripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbono_inscripcionKeyTyped

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
    }//GEN-LAST:event_txtAbono_inscripcionKeyTyped

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
            java.util.logging.Logger.getLogger(Operaciones_mensualidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones_mensualidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones_mensualidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones_mensualidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operaciones_mensualidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxEntrenamiento;
    private javax.swing.JComboBox<String> CboxTurnos;
    private com.toedter.calendar.JDateChooser DateFecha_finaliza;
    private com.toedter.calendar.JDateChooser DateFecha_inicio;
    private javax.swing.JLabel LAbelEntrenador_per;
    private javax.swing.JLabel LAbelFecha_inicio;
    private javax.swing.JLabel LAbelMonto_entrenador;
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JLabel LabelBuscarTabla;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelDireccion1;
    private javax.swing.JLabel LabelDireccion2;
    private javax.swing.JLabel LabelEdad;
    private javax.swing.JLabel LabelEntrenamiento;
    private javax.swing.JLabel LabelF_registro;
    private javax.swing.JLabel LabelF_registro1;
    private javax.swing.JLabel LabelFecha_final;
    private javax.swing.JLabel LabelHora_entrada;
    private javax.swing.JLabel LabelHora_salida;
    private javax.swing.JLabel LabelNombres;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelTurno;
    private javax.swing.JMenuBar MenuBarMensualidad;
    private javax.swing.JMenuItem MenuItemReport_cedula;
    private javax.swing.JMenuItem MenuItemReport_todos;
    private javax.swing.JMenuItem MenuItemReport_todos1;
    private javax.swing.JPanel PanelBotonera;
    private javax.swing.JPanel PanelCampo_texto;
    private javax.swing.JPanel PanelGris;
    private javax.swing.JMenu ReportMenu1;
    private javax.swing.JMenu ReportMenu2;
    private javax.swing.JTable TableMensualidad;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel_foto;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtAbono_inscripcion;
    private javax.swing.JTextField txtBuscarTabla;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEntrenador_per;
    public static com.toedter.calendar.JDateChooser txtFecha_inscripcion;
    public static com.toedter.calendar.JDateChooser txtFecha_membresia;
    private javax.swing.JTextField txtForma_pago;
    private javax.swing.JFormattedTextField txtHora_entrada;
    private javax.swing.JFormattedTextField txtHora_salida;
    private javax.swing.JTextField txtIdmensualidad;
    private javax.swing.JTextField txtMonto_entrenador;
    private javax.swing.JTextField txtMonto_inscripcion;
    private javax.swing.JTextField txtMonto_mensualidad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNro_referencia;
    private javax.swing.JTextField txtPendiente_pago;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables

    // FUNCION PARA VISUALIZAR LA TABLA DE LAS MENSUALIDADES
    AtletasDao atletas = null;

    public void visualizar_tabla_mensualidad(JTable TableMensualidad) {

        TableMensualidad.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel tableMENS = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableMENS.addColumn("ID");
        tableMENS.addColumn("Nro.REFERENCIA");
        tableMENS.addColumn("CEDULA");
        tableMENS.addColumn("NOMBRES");
        tableMENS.addColumn("F.INSCRIPCION");
        tableMENS.addColumn("FORMA PAGO");
        tableMENS.addColumn("ENTRENADOR");
        tableMENS.addColumn("F.INICIO");
        tableMENS.addColumn("ENTRENAMIENTOS");
        tableMENS.addColumn("TURNO");
        tableMENS.addColumn("H.ENTRADA");
        tableMENS.addColumn("FOTO");

        MensualidadDao mensualidad = new MensualidadDao();
        Mensualidad mensualid = new Mensualidad();
        ArrayList<Mensualidad> list = mensualidad.Listar_mensualidad();

        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[12];
                mensualid = list.get(i);
                fila[0] = mensualid.getIdmensualidad();
                fila[1] = mensualid.getNroreferencia();
                fila[2] = mensualid.getCedula();
                fila[3] = mensualid.getNombres();
                fila[4] = mensualid.getFecha_inscripcion();
                fila[5] = mensualid.getForma_depago();
                fila[6] = mensualid.getNombre_entrenador();
                fila[7] = mensualid.getFecha_inicio();
                fila[8] = mensualid.getEntrenamientos();
                fila[9] = mensualid.getTurno();
                fila[10] = mensualid.getHora_entrada();

                try {
                    byte[] bi = mensualid.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[11] = new JLabel(imgi);

                } catch (IOException ex) {
                    fila[11] = new JLabel("No imagen");
                }
                tableMENS.addRow(fila);
            }
            TableMensualidad.setModel(tableMENS);
            TableMensualidad.setRowHeight(60);

            TableMensualidad.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 25));

            TableMensualidad.getTableHeader().setFont(new Font("Cambria", 1, 11));

            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
            TableMensualidad.getColumnModel().getColumn(0).setCellRenderer(Alinear);

            TableMensualidad.getColumnModel().getColumn(0).setPreferredWidth(30);
            TableMensualidad.getColumnModel().getColumn(1).setPreferredWidth(120);
            TableMensualidad.getColumnModel().getColumn(2).setPreferredWidth(80);
            TableMensualidad.getColumnModel().getColumn(3).setPreferredWidth(200);
            TableMensualidad.getColumnModel().getColumn(4).setPreferredWidth(100);
            TableMensualidad.getColumnModel().getColumn(5).setPreferredWidth(150);
            TableMensualidad.getColumnModel().getColumn(6).setPreferredWidth(200);
            TableMensualidad.getColumnModel().getColumn(7).setPreferredWidth(100);
            TableMensualidad.getColumnModel().getColumn(8).setPreferredWidth(150);
            TableMensualidad.getColumnModel().getColumn(9).setPreferredWidth(100);
            TableMensualidad.getColumnModel().getColumn(10).setPreferredWidth(100);

            TableMensualidad.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(19, 124, 169), Color.white));
            TableMensualidad.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(252, 40, 2), Color.white));
            TableMensualidad.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(252, 40, 2), Color.white));
            TableMensualidad.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(252, 40, 2), Color.white));
            TableMensualidad.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(252, 40, 2), Color.white));
            TableMensualidad.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(252, 40, 2), Color.white));
            TableMensualidad.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(252, 40, 2), Color.white));
            TableMensualidad.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(252, 40, 2), Color.white));
            TableMensualidad.getColumnModel().getColumn(8).setHeaderRenderer(new MyRenderer(new Color(252, 40, 2), Color.white));
            TableMensualidad.getColumnModel().getColumn(9).setHeaderRenderer(new MyRenderer(new Color(252, 40, 2), Color.white));
            TableMensualidad.getColumnModel().getColumn(10).setHeaderRenderer(new MyRenderer(new Color(252, 40, 2), Color.white));
            TableMensualidad.getColumnModel().getColumn(11).setHeaderRenderer(new MyRenderer(new Color(252, 40, 2), Color.white));

        }
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

    // METODO PARA EDITAR MENSUALIDAD
    public void editarMensualidad() throws SQLException {

        Atletas atletas = new Atletas();
        AtletasDao atleDAO = new AtletasDao();
        if (txtNro_referencia.getText().equals("") || txtCedula.getText().equals("") || txtNombres.getText().equals("") || txtMonto_inscripcion.getText().equals("") || txtAbono_inscripcion.getText().equals("") || txtPendiente_pago.getText().equals("") || txtMonto_mensualidad.getText().equals("") || txtFecha_inscripcion.getDate() == null || txtFecha_membresia.getDate() == null || txtForma_pago.getText().equals("") || txtHora_entrada.getText().equals("") || txtHora_salida.getText().equals("") || txtEntrenador_per.getText().equals("") || txtMonto_entrenador.getText().equals("") || DateFecha_inicio.getDate() == null || DateFecha_finaliza.getDate() == null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "Atención...No Debe Haber Campos Vacios",
                    "Atletas", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

        } else {

            try {
                Connection conn = conexion.conectar();
                FileInputStream archivofoto;
                File nombre = new File(txtRuta.getText());
                archivofoto = new FileInputStream(nombre);
                String sql = "UPDATE mensualidad SET nroreferencia=?,cedula=?,nombres = ?, fecha_inscripcion = ?, fecha_final = ?, monto_inscripcion=?, monto_mensualidad=?, monto_abono=?, monto_debe=?,forma_depago=?,nombre_entrenador=?,monto_entrenador=?,fecha_inicio=?,fecha_finaliza=?, entrenamientos=?, hora_entrada=?, hora_salida=?, turno=?, rutaFoto=?, foto = ?  WHERE idmensualidad = ?";
                String fecha_insc;
                String fecha_memb;
                String fecha_inicio;
                String fecha_final;

                java.util.Date date = new java.util.Date();
                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                fecha_insc = f.format(txtFecha_inscripcion.getDate());

                java.util.Date date2 = new java.util.Date();
                SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
                fecha_memb = f2.format(txtFecha_membresia.getDate());

                java.util.Date date3 = new java.util.Date();
                SimpleDateFormat f3 = new SimpleDateFormat("yyyy-MM-dd");
                fecha_inicio = f3.format(DateFecha_inicio.getDate());

                java.util.Date date4 = new java.util.Date();
                SimpleDateFormat f4 = new SimpleDateFormat("yyyy-MM-dd");
                fecha_final = f.format(DateFecha_finaliza.getDate());

                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, txtNro_referencia.getText());
                pst.setString(2, txtCedula.getText());
                pst.setString(3, txtNombres.getText());
                pst.setString(4, fecha_insc);
                pst.setString(5, fecha_memb);
                pst.setString(6, txtMonto_inscripcion.getText());
                pst.setString(7, txtMonto_mensualidad.getText());
                pst.setString(8, txtAbono_inscripcion.getText());
                pst.setString(9, txtPendiente_pago.getText());
                pst.setString(10, txtForma_pago.getText());
                pst.setString(11, txtEntrenador_per.getText());
                pst.setString(12, txtMonto_entrenador.getText());
                pst.setString(13, fecha_inicio);
                pst.setString(14, fecha_final);
                pst.setString(15, (CboxEntrenamiento.getItemAt(CboxEntrenamiento.getSelectedIndex())));
                pst.setString(16, txtHora_entrada.getText());
                pst.setString(17, txtHora_salida.getText());
                pst.setString(18, (CboxTurnos.getItemAt(CboxTurnos.getSelectedIndex())));
                archivofoto = new FileInputStream(txtRuta.getText());
                pst.setString(19, txtRuta.getText());
                pst.setBinaryStream(20, archivofoto);
                pst.setString(21, txtIdmensualidad.getText());

                int n = pst.executeUpdate();
                if (n > 0) {
                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));

                    JOptionPane.showMessageDialog(null, "Datos actualizados con exito",
                            "Atletas", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                    txtRuta.setText(null);
                    jLabel_foto.setIcon(null);
                } else {
                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));

                    JOptionPane.showMessageDialog(null, "Hubo error en el momento de actualizar los datos",
                            "Atletas", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));
                }
            } catch (SQLException | FileNotFoundException ex) {
                Logger.getLogger(Operaciones_mensualidad.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void eliminarMensualidad() {

        Connection conn = conexion.conectar();

        if (txtNro_referencia.getText().equals("") || txtCedula.getText().equals("") || txtNombres.getText().equals("") || txtMonto_inscripcion.getText().equals("") || txtAbono_inscripcion.getText().equals("") || txtPendiente_pago.getText().equals("") || txtMonto_mensualidad.getText().equals("") || txtFecha_inscripcion.getDate() == null || txtFecha_membresia.getDate() == null || txtForma_pago.getText().equals("") || txtHora_entrada.getText().equals("") || txtHora_salida.getText().equals("") || txtEntrenador_per.getText().equals("") || txtMonto_entrenador.getText().equals("") || DateFecha_inicio.getDate() == null || DateFecha_finaliza.getDate() == null) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(254, 254, 254));
            UIManager.put("Panel.background", new Color(254, 254, 254));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "ATENCION..! Haga click a los datos que desea eliminar",
                    "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

        } else {

            UI = null;
            UIManager.put("OptionPane.background", new Color(254, 254, 254));
            UIManager.put("Panel.background", new Color(254, 254, 254));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Eliminar Este Usuario..?",
                    "Usuarios", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            if (opcion == 0) {

                int fila = TableMensualidad.getSelectedRow();
                if (fila > -1) {
                    String idMensualidad = TableMensualidad.getValueAt(fila, 0).toString();
                    String sql = "DELETE FROM mensualidad WHERE idMensualidad='" + idMensualidad + "'";
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
                                    "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));

                            limpiar();
                        } else {
                            UI = null;
                            UIManager.put("OptionPane.background", new Color(254, 254, 254));
                            UIManager.put("Panel.background", new Color(254, 254, 254));
                            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                            JOptionPane.showMessageDialog(this, "No se ha Podido Eliminar el Registro.",
                                    "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Operaciones_atletas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    //  METODO PARA LIMPIAR LOS CAMPOS 
    public void limpiar() {

        txtNro_referencia.setText("");
        txtCedula.setText("");
        txtNombres.setText("");
        txtFecha_inscripcion.setDate(null);
        txtMonto_inscripcion.setText("");
        txtAbono_inscripcion.setText("");
        txtPendiente_pago.setText("");
        txtMonto_mensualidad.setText("");
        txtFecha_membresia.setDate(null);
        txtForma_pago.setText("");
        CboxEntrenamiento.setSelectedIndex(0);
        CboxTurnos.setSelectedIndex(0);
        txtHora_entrada.setText("");
        txtHora_salida.setText("");
        txtEntrenador_per.setText("");
        txtMonto_entrenador.setText("");
        DateFecha_inicio.setDate(null);
        DateFecha_finaliza.setDate(null);
        txtRuta.setText(null);
        jLabel_foto.setIcon(null);
        txtIdmensualidad.setText("");

    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void reportTodasMensualidad() {

        try {
            Connection conn = conexion.conectar();
            JasperReport reporte = null;

            Map parametro = new HashMap();

            parametro.put("imagen_logo1", Operaciones_mensualidad.class.getResource("/reportes/logo1.png"));
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/report_ListarMensualidad.jasper"));

            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            view.setVisible(true);
            view.setTitle("MENSUALIDAD");
        } catch (JRException e) {
        }

    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION PARA BUSCAR LOS ATLETAS EN LA TABLA DE OPERACIONES 
    public void buscarMensualidad(String buscar) {

        MensualidadDao buscaDao = new MensualidadDao();

        DefaultTableModel modelo = buscaDao.buscarMensualidad_oper(buscar);

        TableMensualidad.setModel(modelo);

        TableMensualidad.setRowHeight(60);

        TableMensualidad.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 25));

        TableMensualidad.getTableHeader().setFont(new Font("Cambria", 1, 11));

        TableMensualidad.getColumnModel().getColumn(0).setPreferredWidth(30);
        TableMensualidad.getColumnModel().getColumn(1).setPreferredWidth(70);
        TableMensualidad.getColumnModel().getColumn(2).setPreferredWidth(90);
        TableMensualidad.getColumnModel().getColumn(3).setPreferredWidth(180);
        TableMensualidad.getColumnModel().getColumn(4).setPreferredWidth(70);
        TableMensualidad.getColumnModel().getColumn(5).setPreferredWidth(180);
        TableMensualidad.getColumnModel().getColumn(6).setPreferredWidth(120);
        TableMensualidad.getColumnModel().getColumn(7).setPreferredWidth(80);
        TableMensualidad.getColumnModel().getColumn(8).setPreferredWidth(80);
        TableMensualidad.getColumnModel().getColumn(9).setPreferredWidth(120);

        TableMensualidad.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(19, 124, 169), Color.white));
        TableMensualidad.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableMensualidad.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableMensualidad.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableMensualidad.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableMensualidad.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableMensualidad.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableMensualidad.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableMensualidad.getColumnModel().getColumn(8).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        TableMensualidad.getColumnModel().getColumn(9).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));
        //TableMensualidad.getColumnModel().getColumn(10).setHeaderRenderer(new MyRenderer(new Color(0, 0, 153), Color.white));

    }

}
