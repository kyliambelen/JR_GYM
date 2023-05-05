package vistas;

import bd.Conexion;
import dao.Configuracion_gymDao;
import entidades.Configuracion_gym;
import entidades.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

public class OperacionConfig_gym extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private Conexion conexion = new Conexion();
    UIManager UI;
    Usuarios usuar;

    public OperacionConfig_gym(Usuarios usuar) {
        initComponents();

        this.setResizable(false);
        this.setTitle("CONFIGURACION");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setIconImage(getIconImage());
        txtIdorganizacion.setVisible(false);
        txtUsuario_id.setVisible(false);

        this.usuar = usuar;
        if (usuar.getIdRol() == 1) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        } else if (usuar.getIdRol() == 2) {

            return;

        } else if (usuar.getIdRol() == 3) {

            return;

        }
        mostrarTablaConfiguracion();
    }

    public OperacionConfig_gym() {
        initComponents();

    }


    /* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
    public void mostrarTablaConfiguracion() {
        try {
            DefaultTableModel modelo = new DefaultTableModel() {
                public boolean isCellEditable(int fila, int columna) {
                    if (columna == 8) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            JTableConfiguracion.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = conexion.conectar();
            String sql = "SELECT idorganizacion,rif,nombre,razon_social,correo,telefono,direccion,inicio_actividad FROM organizacion";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("RIF");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("RAZON SOCIAL");
            modelo.addColumn("E-MAIL");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("DIRECCION");
            modelo.addColumn("INICIO ACTIVIDAD");

            int[] anchos = {80, 110, 250, 250, 150, 100, 300, 80};

            for (int i = 0; i < cantidadColumnas; i++) {

                JTableConfiguracion.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {

                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);

                JTableConfiguracion.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));

                JTableConfiguracion.getTableHeader().setFont(new Font("Cooper Black", 1, 7));

                JTableConfiguracion.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(Color.GRAY, Color.white));
                JTableConfiguracion.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));
                JTableConfiguracion.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));
                JTableConfiguracion.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));
                JTableConfiguracion.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));
                JTableConfiguracion.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));
                JTableConfiguracion.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));
                JTableConfiguracion.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));

            }

        } catch (Exception ex) {
            System.err.println("ex.toString");

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelConfiguracion = new javax.swing.JPanel();
        JPanelTabla_config = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableConfiguracion = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdorganizacion = new javax.swing.JTextField();
        txtNombre_conf = new javax.swing.JTextField();
        txtRazonSocial_conf = new javax.swing.JTextField();
        txtTelefono_conf = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion_conf = new javax.swing.JTextField();
        txtInicio_actividad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRif = new javax.swing.JTextField();
        btnEditar_op = new javax.swing.JButton();
        btnLimpiar_op = new javax.swing.JButton();
        btnSalirProd_op = new javax.swing.JButton();
        txtUsuario_id = new javax.swing.JTextField();
        LabelBannerSuperior = new javax.swing.JLabel();
        LabelBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JPanelConfiguracion.setBackground(new java.awt.Color(255, 255, 255));
        JPanelConfiguracion.setMinimumSize(new java.awt.Dimension(1300, 700));
        JPanelConfiguracion.setPreferredSize(new java.awt.Dimension(1300, 700));
        JPanelConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelTabla_config.setBackground(new java.awt.Color(127, 117, 108));
        JPanelTabla_config.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        JPanelTabla_config.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTableConfiguracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        JTableConfiguracion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JTableConfiguracion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "RIF", "NOMBRE", "RAZON SOCIAL", "E-MAIL", "TELEFONO", "DIRECCION", "INICIO ACTIVIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTableConfiguracion.setRowHeight(100);
        JTableConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableConfiguracionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableConfiguracion);

        JPanelTabla_config.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 1230, 130));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPanelTabla_config.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 81, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RAZON SOCIAL");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPanelTabla_config.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 124, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TELEFONO");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPanelTabla_config.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 380, 90, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("E-MAIL");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPanelTabla_config.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 69, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DIRECCION");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPanelTabla_config.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 98, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("INICIO ACTIVIDAD");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPanelTabla_config.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 460, 150, -1));

        txtIdorganizacion.setEditable(false);
        txtIdorganizacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JPanelTabla_config.add(txtIdorganizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 40, 20));

        txtNombre_conf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre_conf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre_conf.setText("   ");
        txtNombre_conf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        txtNombre_conf.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNombre_conf.setSelectionColor(new java.awt.Color(102, 102, 255));
        JPanelTabla_config.add(txtNombre_conf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 400, 30));

        txtRazonSocial_conf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRazonSocial_conf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRazonSocial_conf.setText("   ");
        txtRazonSocial_conf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        txtRazonSocial_conf.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtRazonSocial_conf.setSelectionColor(new java.awt.Color(102, 102, 255));
        JPanelTabla_config.add(txtRazonSocial_conf, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 400, 30));

        txtTelefono_conf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTelefono_conf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono_conf.setText("   ");
        txtTelefono_conf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        txtTelefono_conf.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtTelefono_conf.setSelectionColor(new java.awt.Color(102, 102, 255));
        JPanelTabla_config.add(txtTelefono_conf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 410, 190, 30));

        txtCorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setText("   ");
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        txtCorreo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCorreo.setSelectionColor(new java.awt.Color(102, 102, 255));
        JPanelTabla_config.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 300, 30));

        txtDireccion_conf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDireccion_conf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDireccion_conf.setText("   ");
        txtDireccion_conf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        txtDireccion_conf.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDireccion_conf.setSelectionColor(new java.awt.Color(102, 102, 255));
        JPanelTabla_config.add(txtDireccion_conf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 600, 30));

        txtInicio_actividad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtInicio_actividad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInicio_actividad.setText("   ");
        txtInicio_actividad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        txtInicio_actividad.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtInicio_actividad.setSelectionColor(new java.awt.Color(102, 102, 255));
        JPanelTabla_config.add(txtInicio_actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 490, 270, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("RIF");
        JPanelTabla_config.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 30, -1));

        txtRif.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRif.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRif.setText("   ");
        txtRif.setAutoscrolls(false);
        txtRif.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        txtRif.setMargin(new java.awt.Insets(2, 0, 0, 2));
        txtRif.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtRif.setSelectionColor(new java.awt.Color(102, 102, 255));
        txtRif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRifActionPerformed(evt);
            }
        });
        JPanelTabla_config.add(txtRif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 180, 30));

        btnEditar_op.setBackground(new java.awt.Color(57, 142, 61));
        btnEditar_op.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnEditar_op.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar_op.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEditar.png"))); // NOI18N
        btnEditar_op.setToolTipText("Editar Productos");
        btnEditar_op.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar_op.setBorderPainted(false);
        btnEditar_op.setContentAreaFilled(false);
        btnEditar_op.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar_op.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEditar2.png"))); // NOI18N
        btnEditar_op.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEditar.png"))); // NOI18N
        btnEditar_op.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar_op.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar_opActionPerformed(evt);
            }
        });
        JPanelTabla_config.add(btnEditar_op, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 540, 45, 45));

        btnLimpiar_op.setBackground(new java.awt.Color(67, 160, 71));
        btnLimpiar_op.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnLimpiar_op.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar_op.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLimpiar.png"))); // NOI18N
        btnLimpiar_op.setToolTipText("Limpiar  Productos");
        btnLimpiar_op.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar_op.setBorderPainted(false);
        btnLimpiar_op.setContentAreaFilled(false);
        btnLimpiar_op.setFocusPainted(false);
        btnLimpiar_op.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar_op.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLimpiar2.png"))); // NOI18N
        btnLimpiar_op.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLimpiar.png"))); // NOI18N
        btnLimpiar_op.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar_opActionPerformed(evt);
            }
        });
        JPanelTabla_config.add(btnLimpiar_op, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 540, 45, 45));

        btnSalirProd_op.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnSalirProd_op.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirProd_op.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnListaSalir.png"))); // NOI18N
        btnSalirProd_op.setToolTipText("Salir");
        btnSalirProd_op.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalirProd_op.setBorderPainted(false);
        btnSalirProd_op.setFocusPainted(false);
        btnSalirProd_op.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalirProd_op.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalir_entrada.png"))); // NOI18N
        btnSalirProd_op.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnListaSalir.png"))); // NOI18N
        btnSalirProd_op.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProd_opActionPerformed(evt);
            }
        });
        JPanelTabla_config.add(btnSalirProd_op, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 540, 45, 45));

        txtUsuario_id.setEditable(false);
        txtUsuario_id.setBorder(null);
        JPanelTabla_config.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 40, 20));

        LabelBannerSuperior.setBackground(new java.awt.Color(51, 51, 51));
        LabelBannerSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerOrganizacion.png"))); // NOI18N
        LabelBannerSuperior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        JPanelTabla_config.add(LabelBannerSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1260, 150));

        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/organizacion2.jpg"))); // NOI18N
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelBanner.setOpaque(true);
        JPanelTabla_config.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 1260, 440));

        JPanelConfiguracion.add(JPanelTabla_config, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirProd_opActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProd_opActionPerformed
        Administracion.opConfig_gym = null;
        this.dispose();
    }//GEN-LAST:event_btnSalirProd_opActionPerformed

    private void btnLimpiar_opActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar_opActionPerformed
        limpiarConfiguracion();
    }//GEN-LAST:event_btnLimpiar_opActionPerformed

    private void btnEditar_opActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar_opActionPerformed
        modificarConfiguracion();
    }//GEN-LAST:event_btnEditar_opActionPerformed

    private void txtRifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRifActionPerformed

    private void JTableConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableConfiguracionMouseClicked

        Configuracion_gym config_gym = new Configuracion_gym();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Connection conn = conexion.conectar();
            int Fila = JTableConfiguracion.getSelectedRow();
            int idorganizacion = (Integer.parseInt(JTableConfiguracion.getValueAt(Fila, 0).toString()));

            String sql = ("SELECT idorganizacion,rif,nombre,razon_social,correo,telefono, direccion, inicio_actividad FROM organizacion WHERE idorganizacion =?");

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idorganizacion);
            rs = stmt.executeQuery();
            while (rs.next()) {

                txtIdorganizacion.setText(rs.getString("idorganizacion"));
                txtRif.setText(rs.getString("rif"));
                txtNombre_conf.setText(rs.getString("nombre"));
                txtRazonSocial_conf.setText(rs.getString("razon_social"));
                txtCorreo.setText(rs.getString("correo"));
                txtTelefono_conf.setText(rs.getString("telefono"));
                txtDireccion_conf.setText(rs.getString("direccion"));
                txtInicio_actividad.setText(rs.getString("inicio_actividad"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(OperacionConfig_gym.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_JTableConfiguracionMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(OperacionConfig_gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacionConfig_gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacionConfig_gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacionConfig_gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionConfig_gym().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelConfiguracion;
    private javax.swing.JPanel JPanelTabla_config;
    private javax.swing.JTable JTableConfiguracion;
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JLabel LabelBannerSuperior;
    private javax.swing.JButton btnEditar_op;
    private javax.swing.JButton btnLimpiar_op;
    private javax.swing.JButton btnSalirProd_op;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion_conf;
    private javax.swing.JTextField txtIdorganizacion;
    private javax.swing.JTextField txtInicio_actividad;
    private javax.swing.JTextField txtNombre_conf;
    private javax.swing.JTextField txtRazonSocial_conf;
    private javax.swing.JTextField txtRif;
    private javax.swing.JTextField txtTelefono_conf;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables

    public void agregarConfiguracion_gym() {

        try {

            Configuracion_gym config_gym = new Configuracion_gym();
            Configuracion_gymDao configGymDAO = new Configuracion_gymDao();

            if (txtRif.getText().equals("") || txtNombre_conf.getText().equals("") || txtRazonSocial_conf.getText().equals("") || txtTelefono_conf.getText().equals("") || txtCorreo.getText().equals("") || txtDireccion_conf.getText().equals("") || txtInicio_actividad.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "ATENCION..! No Debe Haber Campos Vacios");

            } else {

                if (configGymDAO.configuracionExiste(txtNombre_conf.getText()) == 0) {

                    config_gym.setRif(txtRif.getText());
                    config_gym.setNombre(txtNombre_conf.getText());
                    config_gym.setRazon_social(txtRazonSocial_conf.getText());
                    config_gym.setTelefono(txtTelefono_conf.getText());
                    config_gym.setCorreo(txtCorreo.getText());
                    config_gym.setDireccion(txtDireccion_conf.getText());

                    if (configGymDAO.agregarConfiguracion_gym(config_gym)) {

                        UI = null;
                        UIManager.put("OptionPane.background", new Color(255, 255, 255));
                        UIManager.put("Panel.background", new Color(255, 255, 255));
                        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                        JOptionPane.showMessageDialog(this, "Configuracion Agregada con Exito...!!!",
                                "CONFIGURACION", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                        limpiarConfiguracion();

                    } else {
                        UI = null;
                        UIManager.put("OptionPane.background", new Color(255, 255, 255));
                        UIManager.put("Panel.background", new Color(255, 255, 255));
                        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                        UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                        JOptionPane.showMessageDialog(this, "Lo siento...!!! Ha Ocurrido Un Error Agregando La Configuracion",
                                "CONFIGURACION", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                        limpiarConfiguracion();
                    }

                } else {
                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                    JOptionPane.showMessageDialog(this, "La configuracion se Encuentra Registrada",
                            "CONFIGURACION", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                    limpiarConfiguracion();
                }
            }
        } catch (Exception ex) {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "Debe llenar los Campos Vacios",
                    "CONFIGURACION", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

            limpiarConfiguracion();

            System.out.println("ex");
        }

    }

    /* METODO PARA EDITAR LOS PARAMETROS DEL MODULO CONFIGURACION DE LA EMPRESA  */
    public void modificarConfiguracion() {

        try {

            Configuracion_gym config_gym = new Configuracion_gym();
            Configuracion_gymDao config_gymDAO = new Configuracion_gymDao();

            if (txtIdorganizacion.getText().equals("") || txtRif.getText().equals("") || txtNombre_conf.getText().equals("") || txtRazonSocial_conf.getText().equals("") || txtTelefono_conf.getText().equals("") || txtCorreo.getText().equals("") || txtDireccion_conf.getText().equals("") || txtInicio_actividad.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "ATENCION..! No Debe Haber Campos Vacios");

            } else {

                config_gym.setRif(txtRif.getText());
                config_gym.setNombre(txtNombre_conf.getText());
                config_gym.setRazon_social(txtRazonSocial_conf.getText());
                config_gym.setCorreo(txtCorreo.getText());
                config_gym.setTelefono(txtTelefono_conf.getText());
                config_gym.setDireccion(txtDireccion_conf.getText());
                config_gym.setInicio_actividad(txtInicio_actividad.getText());
                config_gym.setIdorganizacion(Integer.parseInt(txtIdorganizacion.getText()));

                if (config_gymDAO.modificarConfiguracion_gym(config_gym)) {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                    JOptionPane.showMessageDialog(this, "Los Datos Se Guardaron Correctamente",
                            "CONFIGURACION", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                    limpiarConfiguracion();
                    mostrarTablaConfiguracion();

                } else {

                    UI = null;
                    UIManager.put("OptionPane.background", new Color(255, 255, 255));
                    UIManager.put("Panel.background", new Color(255, 255, 255));
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
                    UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
                    UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
                    JOptionPane.showMessageDialog(this, "Lo siento...!!! Ha Ocurrido Un Error Guardando Los Datos",
                            "CONFIGURACION", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));

                    limpiarConfiguracion();
                }
            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, "Error al Guardar los Datos");
            limpiarConfiguracion();

            System.out.println("ex");
        }

    }

    public void limpiarConfiguracion() {

        txtIdorganizacion.setText("");
        txtRif.setText("");
        txtNombre_conf.setText("");
        txtRazonSocial_conf.setText("");
        txtTelefono_conf.setText("");
        txtCorreo.setText("");
        txtDireccion_conf.setText("");
        txtInicio_actividad.setText("");
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
}
