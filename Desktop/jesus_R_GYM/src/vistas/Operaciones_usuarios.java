package vistas;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
import bd.Conexion;
import bd.hash;
import dao.UsuariosDao;
import entidades.CboxSelectRol;
import entidades.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import static vistas.Pagina_entrada.ingreAdmin;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Operaciones_usuarios extends javax.swing.JFrame {

    Usuarios usuar;
    UIManager UI;
    ArrayList<Usuarios> usuarios = null;
    DefaultTableModel modelo = new DefaultTableModel();
    private final Conexion conexion = new Conexion();
    UsuariosDao CboxCargarRol = new UsuariosDao();

    public Operaciones_usuarios() {
        initComponents();

    }

    public Operaciones_usuarios(Usuarios usuar) throws SQLException {
        initComponents();
        this.setTitle("USUARIOS");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/img/logoVentana.png")).getImage());
        this.setResizable(false);
        CboxSelectRol cargaRol = new CboxSelectRol();
        cargaRol.cargarcboxSelectRol(CboxSeleccionarRol);
        txtIdUsuario.setVisible(false);
        txtUsuario_id.setVisible(false);
         this.usuar = usuar;

        if (usuar.getIdRol() == 1 || usuar.getIdRol() == 2) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

            // btnModuloAdmin.setVisible (true);
        } else {
            //btnModuloAdmin.setVisible (false);
        }
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        JPanelFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableUsuarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombresUsuarios = new javax.swing.JTextField();
        txtCorreoUsuarios = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        CboxSeleccionarRol = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtIdUsuario = new javax.swing.JTextField();
        btnAgregarUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnLimpiarU = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        LabelBanner = new javax.swing.JLabel();
        txtUsuario_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1090, 460));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(222, 226, 225));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        JPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        JPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTableUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(35, 55, 30), new java.awt.Color(35, 55, 30)));
        JTableUsuarios.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        JTableUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        JTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRES", "CORREO", "USUARIO", "ROL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableUsuarios.setRowHeight(25);
        JTableUsuarios.setSelectionBackground(new java.awt.Color(5, 153, 189));
        JTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableUsuarios);

        JPanelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 730, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarioLogo.png"))); // NOI18N
        JPanelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, 70, 70));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 153, 189));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("LISTA DE USUARIOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.setIconTextGap(1);
        JPanelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 240, 62));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 55, 30));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ROL");
        JPanelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 55, 30));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("NOMBRES");
        JPanelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 80, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 55, 30));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("E-MAIL");
        JPanelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 55, 30));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("PASSWORD");
        JPanelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 80, 30));

        txtNombresUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombresUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        txtNombresUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 55, 30), 1, true));
        JPanelFondo.add(txtNombresUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 150, 30));

        txtCorreoUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCorreoUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreoUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 55, 30), 1, true));
        JPanelFondo.add(txtCorreoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 150, 30));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 55, 30), 1, true));
        JPanelFondo.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 150, 30));

        CboxSeleccionarRol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CboxSeleccionarRol.setForeground(new java.awt.Color(102, 102, 102));
        CboxSeleccionarRol.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 55, 30), 1, true));
        JPanelFondo.add(CboxSeleccionarRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 55, 30));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("USUARIO");
        JPanelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 80, 30));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 55, 30), 1, true));
        JPanelFondo.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 310, 150, 30));

        txtIdUsuario.setEditable(false);
        JPanelFondo.add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 400, 30, -1));

        btnAgregarUsuario.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnAgregarUsuario.setForeground(new java.awt.Color(60, 63, 65));
        btnAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonADD.png"))); // NOI18N
        btnAgregarUsuario.setToolTipText("Agregar");
        btnAgregarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAgregarUsuario.setFocusPainted(false);
        btnAgregarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarUsuario.setPreferredSize(new java.awt.Dimension(75, 51));
        btnAgregarUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agreAdd1.png"))); // NOI18N
        btnAgregarUsuario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonADD.png"))); // NOI18N
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });
        JPanelFondo.add(btnAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 45, 45));

        btnEditarUsuario.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnEditarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEditar.png"))); // NOI18N
        btnEditarUsuario.setToolTipText("Editar");
        btnEditarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnEditarUsuario.setFocusPainted(false);
        btnEditarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonEditar.png"))); // NOI18N
        btnEditarUsuario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEditar.png"))); // NOI18N
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });
        JPanelFondo.add(btnEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 45, 45));

        btnEliminarUsuario.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEliminar.png"))); // NOI18N
        btnEliminarUsuario.setToolTipText("Eliminar");
        btnEliminarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnEliminarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete2.png"))); // NOI18N
        btnEliminarUsuario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEliminar.png"))); // NOI18N
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        JPanelFondo.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 45, 45));

        btnLimpiarU.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnLimpiarU.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarUsuarios.png"))); // NOI18N
        btnLimpiarU.setToolTipText("Eliminar");
        btnLimpiarU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnLimpiarU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiarU.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarUsuarios2.png"))); // NOI18N
        btnLimpiarU.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarUsuarios.png"))); // NOI18N
        btnLimpiarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarUActionPerformed(evt);
            }
        });
        JPanelFondo.add(btnLimpiarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 45, 45));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnListaSalir.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnSalir.setFocusPainted(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exitsalir.png"))); // NOI18N
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnListaSalir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        JPanelFondo.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 45, 45));

        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerUsuarios.jpg"))); // NOI18N
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        JPanelFondo.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 100));

        txtUsuario_id.setEditable(false);
        JPanelFondo.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 40, -1));

        getContentPane().add(JPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed

        try {

            Usuarios usu = new Usuarios();
            UsuariosDao usuDao = new UsuariosDao();

            String pass = new String(txtPassword.getPassword());

            if (txtNombresUsuarios.getText().equals("") || txtCorreoUsuarios.getText().equals("") || txtUsuario.getText().equals("") || pass.equals("")) {
                UI = null;
                UI.put("OptionPane.background", new Color(245, 245, 245));
                UI.put("Panel.background", new Color(245, 245, 245));
                UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UI.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                JOptionPane.showMessageDialog(this, "ATENCION..! No Debe Haber Campos Vacios",
                        "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/jopanelUser.png", 60, 60));

            } else {

                if (usuDao.existeUsuario(txtUsuario.getText()) == 0) {

                    if (usuDao.esEmail(txtCorreoUsuarios.getText())) {

                        String nuevoPassword = hash.sha1(pass);

                        usu.setNombre(txtNombresUsuarios.getText());
                        usu.setCorreo(txtCorreoUsuarios.getText());
                        usu.setUsuario(txtUsuario.getText());
                        usu.setClave(nuevoPassword);
                        usu.setIdRol(CboxSeleccionarRol.getItemAt(CboxSeleccionarRol.getSelectedIndex()).getIdrol());

                        if (usuDao.agregarUsuarios(usu)) {

                            UI = null;
                            UI.put("OptionPane.background", new Color(245, 245, 245));
                            UI.put("Panel.background", new Color(245, 245, 245));
                            UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                            UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                            UI.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                            JOptionPane.showMessageDialog(this, "Los Datos Se Guardaron Correctamente",
                                    "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/jopanelUser.png", 60, 60));

                            limpiar();
                            mostrarTablaUsuarios();

                        } else {
                            JOptionPane.showMessageDialog(this, "Lo siento...!!! Ha Ocurrido Un Error Guardando Los Datos");
                        }

                    } else {
                        UI = null;
                        UI.put("OptionPane.background", new Color(245, 245, 245));
                        UI.put("Panel.background", new Color(245, 245, 245));
                        UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UI.put("OptionPane.messageForeground", Color.decode("#0793FE"));

                        JOptionPane.showMessageDialog(this, "El Correo Electronico No Es Válido",
                                "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/jopanelUser.png", 60, 60));
                    }
                } else {
                    UI = null;
                    UI.put("OptionPane.background", new Color(245, 245, 245));
                    UI.put("Panel.background", new Color(245, 245, 245));
                    UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UI.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "El Usuario Ya Se Encuentra Registrado",
                            "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/jopanelUser.png", 60, 60));

                }
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//  

    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed

        try {
            Usuarios EDITusuarios = new Usuarios();
            UsuariosDao editUsuDao = new UsuariosDao();
            String pass = new String(txtPassword.getPassword());

            if (txtNombresUsuarios.getText().equals("") || txtCorreoUsuarios.getText().equals("") || txtUsuario.getText().equals("") || pass.equals("")) {
                UI = null;
                UI.put("OptionPane.background", new Color(245, 245, 245));
                UI.put("Panel.background", new Color(245, 245, 245));
                UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                UI.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                JOptionPane.showMessageDialog(this, "ATENCION..! No debe haber campos vacios",
                        "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/jopanelUser.png", 60, 60));

            } else {

                if (editUsuDao.esEmail(txtCorreoUsuarios.getText())) {

                    String nuevoPassword = hash.sha1(pass);

                    EDITusuarios.setNombre(txtNombresUsuarios.getText());
                    EDITusuarios.setCorreo(txtCorreoUsuarios.getText());
                    EDITusuarios.setUsuario(txtUsuario.getText());
                    EDITusuarios.setClave(nuevoPassword);
                    EDITusuarios.setIdRol(CboxSeleccionarRol.getItemAt(CboxSeleccionarRol.getSelectedIndex()).getIdrol());
                    EDITusuarios.setIdusuario(Integer.parseInt(txtIdUsuario.getText()));

                    if (editUsuDao.modificarUsuarios(EDITusuarios)) {

                        UI = null;
                        UI.put("OptionPane.background", new Color(245, 245, 245));
                        UI.put("Panel.background", new Color(245, 245, 245));
                        UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UI.put("OptionPane.messageForeground", Color.decode("#0793FE"));

                        JOptionPane.showMessageDialog(this, "Los Datos se Modificaron Correctamente",
                                "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/jopanelUser.png", 60, 60));

                        limpiar();
                        mostrarTablaUsuarios();
                    } else {
                        UI = null;
                        UI.put("OptionPane.background", new Color(245, 245, 245));
                        UI.put("Panel.background", new Color(245, 245, 245));
                        UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UI.put("OptionPane.messageForeground", Color.decode("#0793FE"));

                        JOptionPane.showMessageDialog(this, "Lo siento...!!! ha ocurrido un error guardando los datos",
                                "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/jopanelUser.png", 60, 60));
                    }

                } else {
                    UI = null;
                    UI.put("OptionPane.background", new Color(245, 245, 245));
                    UI.put("Panel.background", new Color(245, 245, 245));
                    UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UI.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "El correo electronico no es válido",
                            "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/jopanelUser.png", 60, 60));
                }
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Error Desconocido" + "  " + e.getMessage());
        }

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed

        if (txtNombresUsuarios.getText().equals("") || txtCorreoUsuarios.getText().equals("") || txtUsuario.getText().equals("")) {

            UI = null;
            UI.put("OptionPane.background", new Color(254, 254, 254));
            UI.put("Panel.background", new Color(254, 254, 254));
            UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UI.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "ATENCION..! No Debe Haber Campos Vacios",
                    "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/usuMensajes.png", 60, 60));

        } else {

            UI = null;
            UI.put("OptionPane.background", new Color(254, 254, 254));
            UI.put("Panel.background", new Color(254, 254, 254));
            UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UI.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            int opcion = JOptionPane.showConfirmDialog(this, "Estas Seguro de Eliminar Este Usuario..?",
                    "Usuarios", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/img/usuMensajes.png", 60, 60));
            if (opcion == 0) {

                UsuariosDao elimDao = new UsuariosDao();
                Usuarios usuElim = new Usuarios();

                usuElim.setIdusuario(Integer.parseInt(txtIdUsuario.getText()));

                try {

                    if (elimDao.eliminarUsuarios(usuElim.getIdusuario())) {

                        UI = null;
                        UI.put("OptionPane.background", new Color(254, 254, 254));
                        UI.put("Panel.background", new Color(254, 254, 254));
                        UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UI.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                        JOptionPane.showMessageDialog(this, "El Registro se Eliminó Correctamente",
                                "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/usuMensajes.png", 60, 60));

                        limpiar();
                        mostrarTablaUsuarios();
                    } else {
                        UI = null;
                        UI.put("OptionPane.background", new Color(254, 254, 254));
                        UI.put("Panel.background", new Color(254, 254, 254));
                        UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UI.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                        JOptionPane.showMessageDialog(this, "No se ha Podido Eliminar el Registro.",
                                "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/usuMensajes.png", 60, 60));
                    }

                } catch (SQLException ex) {

                    System.out.println(ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Administracion.opUsuar = null;
        this.dispose();
        
        if (ingreAdmin == null) {

	   
            ingreAdmin = new Administracion(usuar);
            ingreAdmin.setVisible(true);
	}
    }//GEN-LAST:event_btnSalirActionPerformed

    private void JTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableUsuariosMouseClicked

        Usuarios usu = new Usuarios();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Connection conn = conexion.conectar();
            int Fila = JTableUsuarios.getSelectedRow();
            int ID = (Integer.parseInt(JTableUsuarios.getValueAt(Fila, 0).toString()));

            String sql = ("SELECT idusuario,nombre,correo,usuario,rol FROM usuario WHERE idusuario =?");

            ps = conn.prepareStatement(sql);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
            while (rs.next()) {

                if (JTableUsuarios.getSelectedRow() >= 0) {

                    txtNombresUsuarios.setText(rs.getString("nombre"));
                    txtCorreoUsuarios.setText(rs.getString("correo"));
                    txtUsuario.setText(rs.getString("usuario"));
                    CboxSeleccionarRol.setSelectedItem(rs.getString("rol"));
                    txtIdUsuario.setText(rs.getString("idusuario"));

                } else {
                    UI = null;
                    UI.put("OptionPane.background", new Color(245, 245, 245));
                    UI.put("Panel.background", new Color(245, 245, 245));
                    UI.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UI.put("OptionPane.messageForeground", Color.decode("#0793FE"));
                    JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UN REGISTRO",
                            "Usuarios", JOptionPane.PLAIN_MESSAGE, icono("/img/jopanelUser.png", 60, 60));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones_usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_JTableUsuariosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            mostrarTablaUsuarios();
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones_usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnLimpiarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarUActionPerformed
       
        limpiar();
    }//GEN-LAST:event_btnLimpiarUActionPerformed

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
            java.util.logging.Logger.getLogger(Operaciones_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operaciones_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<CboxSelectRol> CboxSeleccionarRol;
    private javax.swing.JPanel JPanelFondo;
    private javax.swing.JTable JTableUsuarios;
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnLimpiarU;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCorreoUsuarios;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombresUsuarios;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
 /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
 /*  Funcion para listar los usuarios en la tabla  */
    public void mostrarTablaUsuarios() throws SQLException {

        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                if (columna == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        //JTableUsuarios.setDefaultRenderer(Object.class, new CentrarColum_atletas());
        JTableUsuarios.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));

        JTableUsuarios.getTableHeader().setFont(new Font("Roboto Medium", 1, 6));

        JTableUsuarios.setModel(modelo);
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = conexion.conectar();
        String sql = "SELECT u.idusuario, u.nombre, u.correo, u.usuario, r.idrol, r.rol FROM usuario AS u INNER JOIN rol AS r "
                + "ON u.rol = r.idrol WHERE u.estatus = 1";

        try {
            ps = conn.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones_usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        rs = ps.executeQuery();

        ResultSetMetaData rsMD = rs.getMetaData();
        int cantidadColumnas = rsMD.getColumnCount();

        modelo.addColumn("ID");
        modelo.addColumn("NOMBRES");
        modelo.addColumn("CORREO");
        modelo.addColumn("USUARIO");
        modelo.addColumn("ID ROL");
        modelo.addColumn("ROL");

        int[] anchos = {50, 200, 200, 100, 50, 100};

        for (int i = 0; i < cantidadColumnas; i++) {

            JTableUsuarios.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        while (rs.next()) {
            Object[] filas = new Object[cantidadColumnas];

            for (int i = 0; i < cantidadColumnas; i++) {

                filas[i] = rs.getObject(i + 1);
            }

            modelo.addRow(filas);

            JTableUsuarios.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(128, 126, 65), Color.white));
            JTableUsuarios.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            JTableUsuarios.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            JTableUsuarios.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            JTableUsuarios.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));
            JTableUsuarios.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(45, 78, 30), Color.white));

        }
    }

    /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    private void limpiar() {
        txtNombresUsuarios.setText("");
        txtCorreoUsuarios.setText("");
        txtUsuario.setText("");
        txtPassword.setText("");
    }
    /*  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
}
