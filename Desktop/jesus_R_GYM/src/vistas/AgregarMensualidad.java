package vistas;

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
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FontUIResource;
import static vistas.Operaciones_Asistencia.txtHora_entrada;
import static vistas.Operaciones_Asistencia.txtHora_salida;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class AgregarMensualidad extends javax.swing.JFrame {

    private final Conexion conexion = new Conexion();
    UIManager UI;
    Usuarios usuar;
    public static BuscarAtletas buscaAtleta;
    public static BuscarEntrenador buscaEntrenador;

    public AgregarMensualidad(Usuarios usuar) {
        initComponents();
        this.setTitle("AGREGAR-MENSUALIDAD");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        setIconImage(getIconImage());
        txtRutaFoto.setVisible(false);
        txtIdatletas.setVisible(false);
        txtUsuario_id.setVisible(false);


        this.usuar = usuar;
        if (usuar.getIdRol() == 1) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        } else if (usuar.getIdRol() == 2) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        } else if (usuar.getIdRol() == 3) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        }
    }

    public AgregarMensualidad() {
        initComponents();
        this.setTitle("AGREGAR-MENSUALIDAD");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        setIconImage(getIconImage());
        txtRutaFoto.setVisible(false);
        txtIdatletas.setVisible(false);
        txtUsuario_id.setVisible(false);


    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_pago = new javax.swing.ButtonGroup();
        PanelFondoGris = new javax.swing.JPanel();
        LabelImagen_logo = new javax.swing.JLabel();
        LabelNro_referencia = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        LabelCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        LabelNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        LabelFoto = new javax.swing.JLabel();
        btnBuscarAtletas = new javax.swing.JButton();
        LabelFecha_inscripcion = new javax.swing.JLabel();
        LabelFin_membresia = new javax.swing.JLabel();
        LabelMonto_inscripcion = new javax.swing.JLabel();
        txtMontoInscripcion = new javax.swing.JTextField();
        LabelMonto_mensual = new javax.swing.JLabel();
        txtMontoMensualidad = new javax.swing.JTextField();
        LabelMonto_abono = new javax.swing.JLabel();
        txtMontoAbonado = new javax.swing.JTextField();
        LabelMonto_pendiente = new javax.swing.JLabel();
        txtMontoPendiente = new javax.swing.JTextField();
        PanelFormaPago = new javax.swing.JPanel();
        LabelForma_pago = new javax.swing.JLabel();
        RbuttonEfectivo = new javax.swing.JRadioButton();
        RbuttonTransferencia_bolivares = new javax.swing.JRadioButton();
        RbuttonEfectivo_divisa = new javax.swing.JRadioButton();
        RbuttonTransferencia_divisas = new javax.swing.JRadioButton();
        LabelTitulo1 = new javax.swing.JLabel();
        LabelImagen_Banner = new javax.swing.JLabel();
        PanelNegro = new javax.swing.JPanel();
        LabelEntrenamiento = new javax.swing.JLabel();
        CboxEntrenamiento = new javax.swing.JComboBox<>();
        LabelTurno = new javax.swing.JLabel();
        CboxTurnos = new javax.swing.JComboBox<>();
        LabelHora_entrada = new javax.swing.JLabel();
        LabelHora_salida = new javax.swing.JLabel();
        SeparadorVertical1 = new javax.swing.JSeparator();
        LAbelEntrenador_per = new javax.swing.JLabel();
        txtEntrenador_per = new javax.swing.JTextField();
        LAbelMonto_entrenador = new javax.swing.JLabel();
        txtMonto_entrenador = new javax.swing.JTextField();
        LAbelFecha_inicio = new javax.swing.JLabel();
        LabelFecha_final = new javax.swing.JLabel();
        SeparadorVertical2 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        LabelTitulo2 = new javax.swing.JLabel();
        DateFecha_inicio = new com.toedter.calendar.JDateChooser();
        DateFecha_finaliza = new com.toedter.calendar.JDateChooser();
        btnEntrenador = new javax.swing.JButton();
        txtHora_entrada = new javax.swing.JFormattedTextField();
        txtHora_salida = new javax.swing.JFormattedTextField();
        LabelDatos_inscripcion = new javax.swing.JLabel();
        LabelDatos_personales = new javax.swing.JLabel();
        DateFecha_inscripcion = new com.toedter.calendar.JDateChooser();
        DateFin_membresia = new com.toedter.calendar.JDateChooser();
        txtRutaFoto = new javax.swing.JTextField();
        txtIdatletas = new javax.swing.JTextField();
        txtUsuario_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondoGris.setBackground(new java.awt.Color(204, 204, 204));
        PanelFondoGris.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelImagen_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoJR3.png"))); // NOI18N
        PanelFondoGris.add(LabelImagen_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 150, 150));

        LabelNro_referencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelNro_referencia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNro_referencia.setText("N° REF");
        PanelFondoGris.add(LabelNro_referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, 30));

        txtReferencia.setEditable(false);
        txtReferencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtReferencia.setForeground(new java.awt.Color(102, 102, 102));
        txtReferencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        txtReferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelFondoGris.add(txtReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 160, 30));

        LabelCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelCedula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelCedula.setText("CEDULA");
        PanelFondoGris.add(LabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, 30));

        txtCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(102, 102, 102));
        txtCedula.setToolTipText("<html>\n<p style=\"color:#2E9AFE\"> Ingrese un número de cédula</p>\n<p style=\"color:#FF4000\"> Presione ENTER</P>\n\n</html>");
        txtCedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });
        PanelFondoGris.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 160, 30));

        LabelNombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelNombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNombres.setText("NOMBRES");
        PanelFondoGris.add(LabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, 30));

        txtNombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(102, 102, 102));
        txtNombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        PanelFondoGris.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 250, 30));

        LabelFoto.setBackground(new java.awt.Color(255, 255, 255));
        LabelFoto.setForeground(new java.awt.Color(0, 102, 255));
        LabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFoto.setText("CLICK-AQUI");
        LabelFoto.setToolTipText("<html>\n<p>Haga click para cargar una foto.</p>\n\n</html>");
        LabelFoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        LabelFoto.setOpaque(true);
        LabelFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelFotoMouseClicked(evt);
            }
        });
        PanelFondoGris.add(LabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 80, 80));

        btnBuscarAtletas.setBackground(new java.awt.Color(0, 102, 255));
        btnBuscarAtletas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarAtletas.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAtletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mensualidadBusca_atletas.png"))); // NOI18N
        btnBuscarAtletas.setBorder(null);
        btnBuscarAtletas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mensualidadBusca_atletas2.png"))); // NOI18N
        btnBuscarAtletas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mensualidadBusca_atletas.png"))); // NOI18N
        btnBuscarAtletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAtletasActionPerformed(evt);
            }
        });
        PanelFondoGris.add(btnBuscarAtletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 330, 40));

        LabelFecha_inscripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelFecha_inscripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelFecha_inscripcion.setText("FECHA INSCRIPCION");
        PanelFondoGris.add(LabelFecha_inscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 150, 30));

        LabelFin_membresia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelFin_membresia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelFin_membresia.setText("FIN MEMBRESIA");
        PanelFondoGris.add(LabelFin_membresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 170, 30));

        LabelMonto_inscripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelMonto_inscripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelMonto_inscripcion.setText("MONTO INSCRIPCION");
        PanelFondoGris.add(LabelMonto_inscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 150, 30));

        txtMontoInscripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMontoInscripcion.setForeground(new java.awt.Color(102, 102, 102));
        txtMontoInscripcion.setToolTipText("SOLO NUMEROS");
        txtMontoInscripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        txtMontoInscripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoInscripcionKeyTyped(evt);
            }
        });
        PanelFondoGris.add(txtMontoInscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 170, 30));

        LabelMonto_mensual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelMonto_mensual.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelMonto_mensual.setText("MONTO MENSUALIDAD");
        PanelFondoGris.add(LabelMonto_mensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, 170, 30));

        txtMontoMensualidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMontoMensualidad.setForeground(new java.awt.Color(102, 102, 102));
        txtMontoMensualidad.setToolTipText("SOLO NUMEROS");
        txtMontoMensualidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        txtMontoMensualidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoMensualidadKeyTyped(evt);
            }
        });
        PanelFondoGris.add(txtMontoMensualidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 250, 170, 30));
        txtMontoMensualidad.getAccessibleContext().setAccessibleDescription("");

        LabelMonto_abono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelMonto_abono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelMonto_abono.setText("MONTO ABONADO");
        PanelFondoGris.add(LabelMonto_abono, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 150, 30));

        txtMontoAbonado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMontoAbonado.setForeground(new java.awt.Color(102, 102, 102));
        txtMontoAbonado.setToolTipText("SOLO NUMEROS");
        txtMontoAbonado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        txtMontoAbonado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoAbonadoKeyTyped(evt);
            }
        });
        PanelFondoGris.add(txtMontoAbonado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 170, 30));

        LabelMonto_pendiente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelMonto_pendiente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelMonto_pendiente.setText("MONTO PENDIENTE");
        PanelFondoGris.add(LabelMonto_pendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 170, 30));

        txtMontoPendiente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMontoPendiente.setForeground(new java.awt.Color(102, 102, 102));
        txtMontoPendiente.setToolTipText("SOLO NUMEROS");
        txtMontoPendiente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        txtMontoPendiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoPendienteKeyTyped(evt);
            }
        });
        PanelFondoGris.add(txtMontoPendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 300, 170, 30));
        txtMontoPendiente.getAccessibleContext().setAccessibleDescription("");

        PanelFormaPago.setBackground(new java.awt.Color(0, 102, 255));
        PanelFormaPago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelFormaPago.setForeground(new java.awt.Color(255, 255, 255));
        PanelFormaPago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelForma_pago.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 16)); // NOI18N
        LabelForma_pago.setForeground(new java.awt.Color(255, 255, 255));
        LabelForma_pago.setText("FORMA DE PAGO");
        PanelFormaPago.add(LabelForma_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 190, 20));

        RbuttonEfectivo.setBackground(new java.awt.Color(0, 102, 255));
        grupo_pago.add(RbuttonEfectivo);
        RbuttonEfectivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RbuttonEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        RbuttonEfectivo.setSelected(true);
        RbuttonEfectivo.setText("EFECTIVO Bs");
        RbuttonEfectivo.setContentAreaFilled(false);
        RbuttonEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbuttonEfectivoActionPerformed(evt);
            }
        });
        PanelFormaPago.add(RbuttonEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 140, 20));

        RbuttonTransferencia_bolivares.setBackground(new java.awt.Color(0, 102, 255));
        grupo_pago.add(RbuttonTransferencia_bolivares);
        RbuttonTransferencia_bolivares.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RbuttonTransferencia_bolivares.setForeground(new java.awt.Color(255, 255, 255));
        RbuttonTransferencia_bolivares.setText("TRANSFERENCIA Bs");
        RbuttonTransferencia_bolivares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbuttonTransferencia_bolivaresActionPerformed(evt);
            }
        });
        PanelFormaPago.add(RbuttonTransferencia_bolivares, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 140, 20));

        RbuttonEfectivo_divisa.setBackground(new java.awt.Color(0, 102, 255));
        grupo_pago.add(RbuttonEfectivo_divisa);
        RbuttonEfectivo_divisa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RbuttonEfectivo_divisa.setForeground(new java.awt.Color(255, 255, 255));
        RbuttonEfectivo_divisa.setText("EFECTIVO-DIVISAS");
        RbuttonEfectivo_divisa.setActionCommand("EFECTIVO");
        PanelFormaPago.add(RbuttonEfectivo_divisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 170, -1));

        RbuttonTransferencia_divisas.setBackground(new java.awt.Color(0, 102, 255));
        grupo_pago.add(RbuttonTransferencia_divisas);
        RbuttonTransferencia_divisas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RbuttonTransferencia_divisas.setForeground(new java.awt.Color(255, 255, 255));
        RbuttonTransferencia_divisas.setText("TRANSFERENCIA-DIVISAS");
        RbuttonTransferencia_divisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbuttonTransferencia_divisasActionPerformed(evt);
            }
        });
        PanelFormaPago.add(RbuttonTransferencia_divisas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 170, -1));

        PanelFondoGris.add(PanelFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 710, 90));

        LabelTitulo1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 28)); // NOI18N
        LabelTitulo1.setForeground(new java.awt.Color(0, 102, 255));
        LabelTitulo1.setText("MODALIDAD PAGO MENSUAL");
        PanelFondoGris.add(LabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 560, -1));

        LabelImagen_Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banner11.jpg"))); // NOI18N
        LabelImagen_Banner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelImagen_Banner.setMaximumSize(new java.awt.Dimension(1260, 150));
        LabelImagen_Banner.setMinimumSize(new java.awt.Dimension(1260, 150));
        PanelFondoGris.add(LabelImagen_Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1260, 150));

        PanelNegro.setBackground(new java.awt.Color(51, 51, 51));
        PanelNegro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelNegro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelEntrenamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelEntrenamiento.setForeground(new java.awt.Color(255, 255, 255));
        LabelEntrenamiento.setText("ENTRENAMIENTO");
        PanelNegro.add(LabelEntrenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 28));

        CboxEntrenamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CboxEntrenamiento.setForeground(new java.awt.Color(102, 102, 102));
        CboxEntrenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Por Cuenta Propia", "Colectivo", "Personalizado" }));
        CboxEntrenamiento.setBorder(null);
        PanelNegro.add(CboxEntrenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 230, 28));
        CboxEntrenamiento.getAccessibleContext().setAccessibleName("");

        LabelTurno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTurno.setForeground(new java.awt.Color(255, 255, 255));
        LabelTurno.setText("TURNO");
        PanelNegro.add(LabelTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 28));

        CboxTurnos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CboxTurnos.setForeground(new java.awt.Color(102, 102, 102));
        CboxTurnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Mañana", "Tarde", "Noche" }));
        CboxTurnos.setBorder(null);
        PanelNegro.add(CboxTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 230, 28));
        CboxTurnos.getAccessibleContext().setAccessibleName("");

        LabelHora_entrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelHora_entrada.setForeground(new java.awt.Color(255, 255, 255));
        LabelHora_entrada.setText("HORA ENTRADA");
        PanelNegro.add(LabelHora_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 28));

        LabelHora_salida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelHora_salida.setForeground(new java.awt.Color(255, 255, 255));
        LabelHora_salida.setText("HORA SALIDA");
        PanelNegro.add(LabelHora_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 28));

        SeparadorVertical1.setBackground(new java.awt.Color(244, 42, 7));
        SeparadorVertical1.setForeground(new java.awt.Color(244, 42, 7));
        SeparadorVertical1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        SeparadorVertical1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 42, 7), 3));
        SeparadorVertical1.setOpaque(true);
        PanelNegro.add(SeparadorVertical1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 10, 150));

        LAbelEntrenador_per.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LAbelEntrenador_per.setForeground(new java.awt.Color(255, 255, 255));
        LAbelEntrenador_per.setText("ENTRENADOR PERSONALIZADO");
        PanelNegro.add(LAbelEntrenador_per, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 220, 28));

        txtEntrenador_per.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEntrenador_per.setForeground(new java.awt.Color(102, 102, 102));
        txtEntrenador_per.setBorder(null);
        txtEntrenador_per.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntrenador_perActionPerformed(evt);
            }
        });
        PanelNegro.add(txtEntrenador_per, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 200, 28));

        LAbelMonto_entrenador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LAbelMonto_entrenador.setForeground(new java.awt.Color(255, 255, 255));
        LAbelMonto_entrenador.setText("MONTO ENTRENADOR");
        PanelNegro.add(LAbelMonto_entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 220, 28));

        txtMonto_entrenador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMonto_entrenador.setForeground(new java.awt.Color(102, 102, 102));
        txtMonto_entrenador.setToolTipText("SOLO NUMEROS");
        txtMonto_entrenador.setBorder(null);
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
        PanelNegro.add(txtMonto_entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 230, 28));

        LAbelFecha_inicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LAbelFecha_inicio.setForeground(new java.awt.Color(255, 255, 255));
        LAbelFecha_inicio.setText("FECHA INICIO");
        PanelNegro.add(LAbelFecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 220, 28));

        LabelFecha_final.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelFecha_final.setForeground(new java.awt.Color(255, 255, 255));
        LabelFecha_final.setText("FECHA FINALIZACION");
        PanelNegro.add(LabelFecha_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 220, 28));

        SeparadorVertical2.setBackground(new java.awt.Color(244, 42, 7));
        SeparadorVertical2.setForeground(new java.awt.Color(244, 42, 7));
        SeparadorVertical2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        SeparadorVertical2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 42, 7), 3));
        SeparadorVertical2.setOpaque(true);
        PanelNegro.add(SeparadorVertical2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 10, 150));

        btnAgregar.setBackground(new java.awt.Color(0, 102, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnagregarMensualidad.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnagregarMensualidad2.png"))); // NOI18N
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnagregarMensualidad.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregar(evt);
            }
        });
        PanelNegro.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 310, 40));

        btnLimpiar.setBackground(new java.awt.Color(0, 204, 51));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnlimpiarMensualidad.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnlimpiarMensualidad2.png"))); // NOI18N
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnlimpiarMensualidad.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelNegro.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, 310, 40));

        btnSalir.setBackground(new java.awt.Color(244, 42, 7));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnsalirMensualidad.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnsalirMensualidad2.png"))); // NOI18N
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnsalirMensualidad.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelNegro.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, 310, 40));

        LabelTitulo2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        LabelTitulo2.setForeground(new java.awt.Color(255, 0, 0));
        LabelTitulo2.setText("ENTRENAMIENTO / ENTRENADOR");
        PanelNegro.add(LabelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 5, 410, 20));

        DateFecha_inicio.setForeground(new java.awt.Color(102, 102, 102));
        DateFecha_inicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelNegro.add(DateFecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 230, 28));
        DateFecha_inicio.getAccessibleContext().setAccessibleDescription("");

        DateFecha_finaliza.setForeground(new java.awt.Color(102, 102, 102));
        DateFecha_finaliza.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelNegro.add(DateFecha_finaliza, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 230, 28));
        DateFecha_finaliza.getAccessibleContext().setAccessibleDescription("");

        btnEntrenador.setBackground(new java.awt.Color(255, 0, 51));
        btnEntrenador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEntrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/presionaDedo.png"))); // NOI18N
        btnEntrenador.setToolTipText("<html>\n<p>Haga click para buscar un ENTRENADOR.</p>\n\n</html>");
        btnEntrenador.setBorderPainted(false);
        btnEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenadorActionPerformed(evt);
            }
        });
        PanelNegro.add(btnEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 30, 28, 28));

        txtHora_entrada.setBackground(new java.awt.Color(0, 204, 0));
        txtHora_entrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        txtHora_entrada.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtHora_entrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHora_entrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora_entrada.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        PanelNegro.add(txtHora_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 70, 28));

        txtHora_salida.setBackground(new java.awt.Color(204, 0, 51));
        txtHora_salida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        txtHora_salida.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtHora_salida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHora_salida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora_salida.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        PanelNegro.add(txtHora_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 70, 28));

        PanelFondoGris.add(PanelNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 1240, 190));

        LabelDatos_inscripcion.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 16)); // NOI18N
        LabelDatos_inscripcion.setForeground(new java.awt.Color(0, 102, 255));
        LabelDatos_inscripcion.setText("DATOS INSCRIPCION");
        PanelFondoGris.add(LabelDatos_inscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 170, 230, -1));

        LabelDatos_personales.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 16)); // NOI18N
        LabelDatos_personales.setForeground(new java.awt.Color(0, 102, 255));
        LabelDatos_personales.setText("DATOS PERSONALES");
        PanelFondoGris.add(LabelDatos_personales, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 230, -1));

        DateFecha_inscripcion.setForeground(new java.awt.Color(102, 102, 102));
        DateFecha_inscripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelFondoGris.add(DateFecha_inscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 170, 30));

        DateFin_membresia.setForeground(new java.awt.Color(102, 102, 102));
        DateFin_membresia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelFondoGris.add(DateFin_membresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 200, 170, 30));
        DateFin_membresia.getAccessibleContext().setAccessibleName("");
        DateFin_membresia.getAccessibleContext().setAccessibleDescription("");

        txtRutaFoto.setEditable(false);
        PanelFondoGris.add(txtRutaFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 330, 30));

        txtIdatletas.setEditable(false);
        PanelFondoGris.add(txtIdatletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 40, 30));

        txtUsuario_id.setEditable(false);
        PanelFondoGris.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 50, 30));

        getContentPane().add(PanelFondoGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RbuttonTransferencia_bolivaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbuttonTransferencia_bolivaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbuttonTransferencia_bolivaresActionPerformed

    private void RbuttonEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbuttonEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbuttonEfectivoActionPerformed

    private void btnBuscarAtletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAtletasActionPerformed

        AgregarMensualidad ADDMEN = null;
        buscaAtleta = new BuscarAtletas(ADDMEN, true);
        buscaAtleta.setVisible(true);
    }//GEN-LAST:event_btnBuscarAtletasActionPerformed

    private void txtEntrenador_perActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntrenador_perActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntrenador_perActionPerformed

    private void txtMonto_entrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonto_entrenadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonto_entrenadorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        Administracion.addMensual = null;
        Operaciones_Asistencia.addMensualidad = null;
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BotonAgregar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregar

        try {
            GuardarMensualidad();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e.getMessage());
        }


    }//GEN-LAST:event_BotonAgregar

    private void LabelFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelFotoMouseClicked

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
            txtRutaFoto.setText(String.valueOf(file));
            //de cierto modo necesitamos tener la imagen para ello debemos conocer la ruta de dicha imagen
            Image foto = getToolkit().getImage(txtRutaFoto.getText());
            //Le damos dimension a nuestro label que tendra la imagen
            foto = foto.getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            //Imprimimos la imagen en el label
            LabelFoto.setIcon(new ImageIcon(foto));
        }

    }//GEN-LAST:event_LabelFotoMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void RbuttonTransferencia_divisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbuttonTransferencia_divisasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbuttonTransferencia_divisasActionPerformed

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
                    "MENSUALIDAD", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtMonto_entrenadorKeyTyped

    private void txtMontoInscripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoInscripcionKeyTyped

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
                    "MENSUALIDAD", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtMontoInscripcionKeyTyped

    private void txtMontoAbonadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoAbonadoKeyTyped

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
                    "MENSUALIDAD", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtMontoAbonadoKeyTyped

    private void txtMontoMensualidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoMensualidadKeyTyped

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
                    "MENSUALIDAD", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtMontoMensualidadKeyTyped

    private void txtMontoPendienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoPendienteKeyTyped

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
                    "MENSUALIDAD", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 50, 50));
        }
    }//GEN-LAST:event_txtMontoPendienteKeyTyped

    private void btnEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenadorActionPerformed

        AgregarMensualidad ADDENTRENADOR = null;
        buscaEntrenador = new BuscarEntrenador(ADDENTRENADOR, true);
        buscaEntrenador.setVisible(true);
    }//GEN-LAST:event_btnEntrenadorActionPerformed

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            //if (!"".equals(txtCedula.getText())) {//
            if (txtCedula.getText().equals("")) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                JOptionPane.showMessageDialog(this, "Ingrese un Número de Cédula...!!!",
                        "MENSUALIDAD", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));

            } else {
                String cedula = txtCedula.getText();
                AtletasDao atletasDAO = new AtletasDao();
                Atletas atletas = new Atletas();

                atletas = atletasDAO.buscarAtletas_asistencia(cedula);

                if (atletas.getCedula() != 0) {

                    txtCedula.setText("" + atletas.getCedula());
                    txtNombres.setText("" + atletas.getNombres());

                } else {

                    txtCedula.setText("");
                    txtNombres.setText("");

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                    JOptionPane.showMessageDialog(this, "La cédula Ingresada no Existe",
                            "ATLETAS", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                    txtCedula.requestFocus();
                    txtCedula.setText("");
                }
            }
        }
    }//GEN-LAST:event_txtCedulaKeyReleased

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
            java.util.logging.Logger.getLogger(AgregarMensualidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarMensualidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarMensualidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarMensualidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AgregarMensualidad().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxEntrenamiento;
    private javax.swing.JComboBox<String> CboxTurnos;
    private com.toedter.calendar.JDateChooser DateFecha_finaliza;
    private com.toedter.calendar.JDateChooser DateFecha_inicio;
    private com.toedter.calendar.JDateChooser DateFecha_inscripcion;
    private com.toedter.calendar.JDateChooser DateFin_membresia;
    private javax.swing.JLabel LAbelEntrenador_per;
    private javax.swing.JLabel LAbelFecha_inicio;
    private javax.swing.JLabel LAbelMonto_entrenador;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelDatos_inscripcion;
    private javax.swing.JLabel LabelDatos_personales;
    private javax.swing.JLabel LabelEntrenamiento;
    private javax.swing.JLabel LabelFecha_final;
    private javax.swing.JLabel LabelFecha_inscripcion;
    private javax.swing.JLabel LabelFin_membresia;
    private javax.swing.JLabel LabelForma_pago;
    private javax.swing.JLabel LabelFoto;
    private javax.swing.JLabel LabelHora_entrada;
    private javax.swing.JLabel LabelHora_salida;
    private javax.swing.JLabel LabelImagen_Banner;
    private javax.swing.JLabel LabelImagen_logo;
    private javax.swing.JLabel LabelMonto_abono;
    private javax.swing.JLabel LabelMonto_inscripcion;
    private javax.swing.JLabel LabelMonto_mensual;
    private javax.swing.JLabel LabelMonto_pendiente;
    private javax.swing.JLabel LabelNombres;
    private javax.swing.JLabel LabelNro_referencia;
    private javax.swing.JLabel LabelTitulo1;
    private javax.swing.JLabel LabelTitulo2;
    private javax.swing.JLabel LabelTurno;
    private javax.swing.JPanel PanelFondoGris;
    private javax.swing.JPanel PanelFormaPago;
    private javax.swing.JPanel PanelNegro;
    private javax.swing.JRadioButton RbuttonEfectivo;
    private javax.swing.JRadioButton RbuttonEfectivo_divisa;
    private javax.swing.JRadioButton RbuttonTransferencia_bolivares;
    private javax.swing.JRadioButton RbuttonTransferencia_divisas;
    private javax.swing.JSeparator SeparadorVertical1;
    private javax.swing.JSeparator SeparadorVertical2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarAtletas;
    private javax.swing.JButton btnEntrenador;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    public static javax.swing.ButtonGroup grupo_pago;
    public static javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtEntrenador_per;
    private javax.swing.JFormattedTextField txtHora_entrada;
    private javax.swing.JFormattedTextField txtHora_salida;
    public static javax.swing.JTextField txtIdatletas;
    private javax.swing.JTextField txtMontoAbonado;
    private javax.swing.JTextField txtMontoInscripcion;
    private javax.swing.JTextField txtMontoMensualidad;
    private javax.swing.JTextField txtMontoPendiente;
    private javax.swing.JTextField txtMonto_entrenador;
    public static javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtRutaFoto;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION AGREGAR
    public void GuardarMensualidad() throws SQLException, FileNotFoundException {

        try {

            Mensualidad mensual = new Mensualidad();
            MensualidadDao mensualDAO = new MensualidadDao();
            Connection conn = conexion.conectar();

            if (txtCedula.getText().equals("") || txtNombres.getText().equals("") || DateFecha_inscripcion.getDate() == null || DateFecha_inicio.getDate() == null || DateFin_membresia.getDate() == null || DateFecha_finaliza.getDate() == null || txtMontoInscripcion.getText().equals("") || txtMontoMensualidad.getText().equals("") || txtHora_entrada.getText().equals("") || txtHora_salida.getText().equals("") || txtEntrenador_per.getText().equals("") || txtMonto_entrenador.getText().equals("")) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                JOptionPane.showMessageDialog(this, "Atención...No Debe Haber Campos Vacios",
                        "MENSUALIDAD", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

            } else if (CboxEntrenamiento.getSelectedIndex() == 0) {
                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                JOptionPane.showMessageDialog(this, "Debe Seleccionar el Entrenamiento a solicitar",
                        "MENSUALIDAD", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));

            } else if (CboxTurnos.getSelectedIndex() == 0) {
                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
                JOptionPane.showMessageDialog(this, "Seleccione el Turno para su Entrenamiento",
                        "MENSUALIDAD", JOptionPane.INFORMATION_MESSAGE, icono("/img/logoJR3.png", 90, 90));

            } else if (txtRutaFoto.getText().equals("")) {

                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                JOptionPane.showMessageDialog(this, "Atención...Debe Seleccionar Una Foto",
                        "MENSUALIDAD", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

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

            
            
            }else{

                if (mensualDAO.existeMensualidad(Integer.parseInt(txtCedula.getText())) == 0) {

                    String insertar = "INSERT INTO mensualidad(cedula,nombres,fecha_inscripcion,fecha_final,monto_inscripcion,monto_mensualidad,"
                            + "monto_abono,monto_debe,forma_depago,nombre_entrenador,monto_entrenador,fecha_inicio,fecha_finaliza,entrenamientos,turno,hora_entrada,hora_salida,rutaFoto,foto) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                    String fecha_inscripcion;
                    String fecha_finMembresia;
                    String fecha_inicio;
                    String fecha_finaliza;
                    FileInputStream archivoFoto;
                    PreparedStatement pst = conn.prepareStatement(insertar);
                    java.util.Date date = new java.util.Date();
                    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                    fecha_inscripcion = f.format(DateFecha_inscripcion.getDate());
                    fecha_finMembresia = f.format(DateFin_membresia.getDate());
                    fecha_inicio = f.format(DateFecha_inicio.getDate());
                    fecha_finaliza = f.format(DateFecha_finaliza.getDate());

                    //pst.setString(1, txtReferencia.getText());
                    pst.setString(1, txtCedula.getText());
                    pst.setString(2, txtNombres.getText());
                    pst.setString(3, fecha_inscripcion);
                    pst.setString(4, fecha_finMembresia);
                    pst.setString(5, txtMontoInscripcion.getText());
                    pst.setString(6, txtMontoMensualidad.getText());
                    pst.setString(7, txtMontoAbonado.getText());
                    pst.setString(8, txtMontoPendiente.getText());
                    if (RbuttonEfectivo.isSelected()) {
                        pst.setString(9, RbuttonEfectivo.getLabel());
                    } else if (RbuttonEfectivo_divisa.isSelected()) {
                        pst.setString(9, RbuttonEfectivo_divisa.getLabel());
                    } else if (RbuttonTransferencia_bolivares.isSelected()) {
                        pst.setString(9, RbuttonTransferencia_bolivares.getLabel());

                    } else if (RbuttonTransferencia_divisas.isSelected()) {
                        pst.setString(9, RbuttonTransferencia_divisas.getLabel());

                    }
                    pst.setString(10, txtEntrenador_per.getText());
                    pst.setString(11, txtMonto_entrenador.getText());
                    pst.setString(12, fecha_inicio);
                    pst.setString(13, fecha_finaliza);
                    pst.setString(14, CboxEntrenamiento.getItemAt(CboxEntrenamiento.getSelectedIndex()));
                    pst.setString(15, CboxTurnos.getItemAt(CboxTurnos.getSelectedIndex()));
                    pst.setString(16, txtHora_entrada.getText());
                    pst.setString(17, txtHora_salida.getText());

                    pst.setString(18, txtRutaFoto.getText());
                    archivoFoto = new FileInputStream(txtRutaFoto.getText());
                    pst.setBinaryStream(19, archivoFoto);

                    pst.executeUpdate();

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 20)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                    JOptionPane.showMessageDialog(this, "Su registro se guardó satisfactoriamente...!!!!",
                            "MENSUALIDAD", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                    limpiar();

                } else {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "El Cliente Ya Se Encuentra Registrado",
                            "MENSUALIDAD", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
                }
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // METODO PARA LIMPIAR LOS CAMPOS DEL FORMULARIO DE LA MENSUALIDAD
    public void limpiar() {
        txtReferencia.setText("");
        txtCedula.setText("");
        txtNombres.setText("");
        DateFecha_inscripcion.setDate(null);
        DateFin_membresia.setDate(null);
        txtMontoInscripcion.setText("");
        txtMontoMensualidad.setText("");
        txtMontoAbonado.setText("");
        txtMontoPendiente.setText("");
        txtEntrenador_per.setText("");
        txtMonto_entrenador.setText("");
        DateFecha_inicio.setDate(null);
        DateFecha_finaliza.setDate(null);
        CboxEntrenamiento.setSelectedIndex(0);
        CboxTurnos.setSelectedIndex(0);
        txtHora_entrada.setText("");
        txtHora_salida.setText("");
        txtRutaFoto.setText("");
        LabelFoto.setIcon(null);

    }

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

    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION  PARA  GENERAR  UN  NUMERO  DE   SERIE  PARA  LA  REFERENCIA
    public void generarSerie() {

        Mensualidad mensual = new Mensualidad();
        Connection conn = conexion.conectar();
        try {

            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = ("SELECT nroreferencia FROM mensualidad");

            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                mensual.setNroreferencia(rs.getString("nroreferencia"));
            }
            String[] fila = new String[1];

            fila[0] = mensual.getNroreferencia();

            if (!"".equals(fila[0])) {
                txtReferencia.setText( "JRG-00001");
            } else {
                UI = null;
                UIManager.put("OptionPane.background", new Color(255, 255, 255));
                UIManager.put("Panel.background", new Color(255, 255, 255));
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UIManager.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                JOptionPane.showMessageDialog(this, "Ha Ocurrido un Error",
                        "MENSUALIDAD", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 60, 60));
            }

        } catch (SQLException ex) {

            Logger.getLogger(AgregarMensualidad.class.getName()).log(Level.SEVERE, null, ex);
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
}
