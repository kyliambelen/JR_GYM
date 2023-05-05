package vistas;

import bd.Conexion;
import dao.AtletasDao;
import entidades.Atletas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class AgregarAtletas extends javax.swing.JDialog {

    UIManager UI;
    AtletasDao atletaDAO;
    Atletas atleta = new Atletas();
    private FileInputStream fis;
    private int longitudBytes;
    int codigo = 0;
    private final Conexion conexion = new Conexion();
     public static BuscarPago abrePagos;

    /**
     * Creates new form AgregarAtletas
     *
     * @param ADDATLETAS
     * @param modal
     */
    public AgregarAtletas(Operaciones_Asistencia ADDATLETAS, boolean modal) {
        super(ADDATLETAS, modal);
        initComponents();
        setIconImage(getIconImage());
        
        this.setTitle("ATLETAS");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        txtRuta.setVisible(false);

    }

    public AgregarAtletas(Control_pagos AGREGAATLETAS, boolean modal) {
        super(AGREGAATLETAS, modal);
        initComponents();
        setIconImage(getIconImage());
        
        this.setTitle("ATLETAS");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        //txtRuta.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        txtModo_pago = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        CboxSexo = new javax.swing.JComboBox<>();
        txtAno_nacimiento = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        CboxAsistencia = new javax.swing.JComboBox<>();
        txtTelefono = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtFechaR = new com.toedter.calendar.JDateChooser();
        txtDireccion = new javax.swing.JTextField();
        jLabel_foto = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAgregarA = new javax.swing.JButton();
        btnSalirA = new javax.swing.JButton();
        LabelLogo = new javax.swing.JLabel();
        Label1ra = new javax.swing.JLabel();
        LabelBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(785, 695));
        setPreferredSize(new java.awt.Dimension(785, 695));
        setResizable(false);
        setSize(new java.awt.Dimension(785, 695));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(55, 138, 175));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtModo_pago.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtModo_pago.setForeground(new java.awt.Color(51, 51, 51));
        txtModo_pago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtModo_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModo_pagoActionPerformed(evt);
            }
        });
        PanelPrincipal.add(txtModo_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 220, 30));

        txtCedula.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(51, 51, 51));
        txtCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelPrincipal.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 140, 30));

        txtNombres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(51, 51, 51));
        txtNombres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelPrincipal.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 250, 30));

        CboxSexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CboxSexo.setForeground(new java.awt.Color(51, 51, 51));
        CboxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino\t", "Femenino", "Otro" }));
        PanelPrincipal.add(CboxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 250, 30));

        txtAno_nacimiento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtAno_nacimiento.setForeground(new java.awt.Color(51, 51, 51));
        txtAno_nacimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelPrincipal.add(txtAno_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 250, 30));

        txtCorreo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        txtCorreo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelPrincipal.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 250, 30));

        CboxAsistencia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CboxAsistencia.setForeground(new java.awt.Color(51, 51, 51));
        CboxAsistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diaria", "Tres Dias a la Semana", "Eventualmente", "Entrenamiento Acordado", "Otro" }));
        PanelPrincipal.add(CboxAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 250, 30));

        txtTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(51, 51, 51));
        txtTelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelPrincipal.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 250, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/presionaDedo.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 460, 30, 30));

        txtFechaR.setForeground(new java.awt.Color(51, 51, 51));
        txtFechaR.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PanelPrincipal.add(txtFechaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 250, 30));

        txtDireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(51, 51, 51));
        txtDireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelPrincipal.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 540, 30));

        jLabel_foto.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 10)); // NOI18N
        jLabel_foto.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_foto.setText("CLICK AQUI");
        jLabel_foto.setBorder(javax.swing.BorderFactory.createTitledBorder("FOTO"));
        jLabel_foto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_fotoMouseClicked(evt);
            }
        });
        PanelPrincipal.add(jLabel_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 100, 100));
        PanelPrincipal.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 100, -1));

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtObservaciones.setForeground(new java.awt.Color(51, 51, 51));
        txtObservaciones.setLineWrap(true);
        txtObservaciones.setRows(5);
        txtObservaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtObservaciones.setCaretColor(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(txtObservaciones);

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 250, 150));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 242, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OBSERVACIONES");
        PanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 250, 25));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 242, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CEDULA:");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 150, 25));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 242, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("NOMBRES:");
        PanelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, 25));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 242, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("AÑO NACIMIENTO:");
        PanelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, 25));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 242, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("SEXO:");
        PanelPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 150, 25));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 242, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("E-MAIL:");
        PanelPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 150, 25));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 242, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TELEFONO:");
        PanelPrincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 150, 25));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 242, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ASISTENCIA:");
        PanelPrincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 150, 25));

        jLabel10.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 242, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("MODO PAGO:");
        PanelPrincipal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 150, 25));

        jLabel11.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 242, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("FECHA REGISTRO:");
        PanelPrincipal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 150, 25));

        jLabel12.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 242, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("DIRECCION:");
        PanelPrincipal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 150, 25));

        btnAgregarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonAgregarA.png"))); // NOI18N
        btnAgregarA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        btnAgregarA.setContentAreaFilled(false);
        btnAgregarA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonAgregarA2.png"))); // NOI18N
        btnAgregarA.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonAgregarA2.png"))); // NOI18N
        btnAgregarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_AGREGAR(evt);
            }
        });
        PanelPrincipal.add(btnAgregarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 90, 45));

        btnSalirA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonCerrarA.png"))); // NOI18N
        btnSalirA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        btnSalirA.setContentAreaFilled(false);
        btnSalirA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonCerrarA2.png"))); // NOI18N
        btnSalirA.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonCerrarA2.png"))); // NOI18N
        btnSalirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnSalirA, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, 90, 45));

        LabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo11.png"))); // NOI18N
        LabelLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 160, 140));
        PanelPrincipal.add(Label1ra, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 90, 60));

        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerAgregarA5.png"))); // NOI18N
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelPrincipal.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 730, 90));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAActionPerformed

        Operaciones_Asistencia.searchAtletas = null;
        Control_pagos.agregaAtletas = null;
        this.dispose();
    }//GEN-LAST:event_btnSalirAActionPerformed

    private void BOTON_AGREGAR(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_AGREGAR

        try {
            agregaAtletas();

            /*Operaciones_atletas addAtletas = new Operaciones_atletas();
            
            try {
            addAtletas.GuardarAtletas();
            } catch (SQLException ex) {
            Logger.getLogger(AgregarAtletas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
            Logger.getLogger(AgregarAtletas.class.getName()).log(Level.SEVERE, null, ex);
            }
             */
        } catch (SQLException ex) {
            Logger.getLogger(AgregarAtletas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AgregarAtletas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BOTON_AGREGAR

    private void jLabel_fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_fotoMouseClicked

        jLabel_foto.setText("");
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

    private void txtModo_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModo_pagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModo_pagoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        AgregarAtletas ADDATLE = null;
        abrePagos = new BuscarPago(ADDATLE, true);
        abrePagos.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            AgregarAtletas dialog = new AgregarAtletas((Operaciones_Asistencia) new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxAsistencia;
    private javax.swing.JComboBox<String> CboxSexo;
    private javax.swing.JLabel Label1ra;
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnAgregarA;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalirA;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_foto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAno_nacimiento;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private com.toedter.calendar.JDateChooser txtFechaR;
    public static javax.swing.JTextField txtModo_pago;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

   

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logoVentana.png"));
        return retValue;
    }

    /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    public void agregaAtletas() throws SQLException, FileNotFoundException {

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

                    txtCedula.setBackground(new Color(255, 255, 255));
                    txtNombres.setBackground(new Color(255, 255, 255));
                    txtAno_nacimiento.setBackground(new Color(255, 255, 255));
                    txtCorreo.setBackground(new Color(255, 255, 255));
                    txtTelefono.setBackground(new Color(255, 255, 255));
                    txtDireccion.setBackground(new Color(255, 255, 255));
                    txtObservaciones.setBackground(new Color(255, 255, 255));
                    
                    limpiarAddAtletas();

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
    //  FUNCION LIMPIAR CAMPOS DE TEXTOS
    public void limpiarAddAtletas() {
        txtCedula.setText("");
        txtNombres.setText("");
        txtTelefono.setText("");
        txtAno_nacimiento.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtObservaciones.setText("");
        txtRuta.setText(null);
        jLabel_foto.setIcon(null);
        CboxSexo.setSelectedIndex(0);
        CboxAsistencia.setSelectedIndex(0);
        txtModo_pago.setText("");
        txtFechaR.setDate(null);
    }

}
