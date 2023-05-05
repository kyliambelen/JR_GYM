package vistas;

import bd.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.plaf.FontUIResource;
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
public class ReporteAsistencias_pormes extends javax.swing.JFrame {

    UIManager UI;
    private final Conexion conexion = new Conexion();
    public static BuscarAtletas searchAtletas;

    public ReporteAsistencias_pormes() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("ASISTENCIAS");
        setIconImage(getIconImage());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRutina3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCedulaAtleta_asistencia = new javax.swing.JTextField();
        txtNombresAtleta_asistencias = new javax.swing.JTextField();
        btnBuscar_solomes = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnCedulaRutinas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        LabelLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar_pormes = new javax.swing.JButton();
        JCBox_asistencias_mes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 320));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRutina3.setBackground(new java.awt.Color(0, 102, 204));
        PanelRutina3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ASISTENCIAS POR MES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelRutina3.setMinimumSize(new java.awt.Dimension(515, 370));
        PanelRutina3.setPreferredSize(new java.awt.Dimension(515, 370));
        PanelRutina3.setVerifyInputWhenFocusTarget(false);
        PanelRutina3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("NOMBRES:");
        PanelRutina3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 30));

        txtCedulaAtleta_asistencia.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        txtCedulaAtleta_asistencia.setForeground(new java.awt.Color(102, 102, 102));
        PanelRutina3.add(txtCedulaAtleta_asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 200, 30));

        txtNombresAtleta_asistencias.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        txtNombresAtleta_asistencias.setForeground(new java.awt.Color(102, 102, 102));
        txtNombresAtleta_asistencias.setToolTipText("");
        PanelRutina3.add(txtNombresAtleta_asistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 200, 30));

        btnBuscar_solomes.setBackground(new java.awt.Color(0, 0, 153));
        btnBuscar_solomes.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        btnBuscar_solomes.setForeground(new java.awt.Color(0, 153, 255));
        btnBuscar_solomes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonMes_general.png"))); // NOI18N
        btnBuscar_solomes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBuscar_solomes.setContentAreaFilled(false);
        btnBuscar_solomes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonMes_general2.png"))); // NOI18N
        btnBuscar_solomes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonMes_general.png"))); // NOI18N
        btnBuscar_solomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_solomesActionPerformed(evt);
            }
        });
        PanelRutina3.add(btnBuscar_solomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 200, 30));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MESES:");
        PanelRutina3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 25));

        btnCedulaRutinas.setBackground(new java.awt.Color(51, 0, 153));
        btnCedulaRutinas.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 11)); // NOI18N
        btnCedulaRutinas.setForeground(new java.awt.Color(0, 153, 255));
        btnCedulaRutinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonUnico.png"))); // NOI18N
        btnCedulaRutinas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCedulaRutinas.setContentAreaFilled(false);
        btnCedulaRutinas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonUnico2.png"))); // NOI18N
        btnCedulaRutinas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonUnico.png"))); // NOI18N
        btnCedulaRutinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCedulaRutinasActionPerformed(evt);
            }
        });
        PanelRutina3.add(btnCedulaRutinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 70, 40, 30));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("CEDULA:");
        PanelRutina3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 30));

        LabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoJR3.png"))); // NOI18N
        LabelLogo.setFocusable(false);
        LabelLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelRutina3.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 150, 160));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        PanelRutina3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 150, 30));

        btnBuscar_pormes.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        btnBuscar_pormes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonMes_clientes.png"))); // NOI18N
        btnBuscar_pormes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBuscar_pormes.setContentAreaFilled(false);
        btnBuscar_pormes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonMes_clientes2.png"))); // NOI18N
        btnBuscar_pormes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonMes_clientes.png"))); // NOI18N
        btnBuscar_pormes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_pormesActionPerformed(evt);
            }
        });
        PanelRutina3.add(btnBuscar_pormes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 200, 30));

        JCBox_asistencias_mes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JCBox_asistencias_mes.setForeground(new java.awt.Color(102, 102, 102));
        JCBox_asistencias_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "NOVIEMBRE", "DICIEMBRE" }));
        PanelRutina3.add(JCBox_asistencias_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 200, 30));

        getContentPane().add(PanelRutina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscar_solomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_solomesActionPerformed

        mostrarAsistencias_solomes();

        Reportes.abreReport_asistencias_pormes = null;
        this.dispose();
    }//GEN-LAST:event_btnBuscar_solomesActionPerformed

    private void btnCedulaRutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCedulaRutinasActionPerformed

        Reportes RERE = null;

        searchAtletas = new BuscarAtletas(RERE, true);
        searchAtletas.setVisible(true);
    }//GEN-LAST:event_btnCedulaRutinasActionPerformed

    private void btnBuscar_pormesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_pormesActionPerformed
        
        mostrarAsistencias_atletames();
        Reportes.abreReport_asistencias_pormes = null;
        this.dispose();
    }//GEN-LAST:event_btnBuscar_pormesActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteAsistencias_pormes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ReporteAsistencias_pormes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBox_asistencias_mes;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JPanel PanelRutina3;
    private javax.swing.JButton btnBuscar_pormes;
    private javax.swing.JButton btnBuscar_solomes;
    public static javax.swing.JButton btnCedulaRutinas;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtCedulaAtleta_asistencia;
    public static javax.swing.JTextField txtNombresAtleta_asistencias;
    // End of variables declaration//GEN-END:variables

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void mostrarAsistencias_solomes() {

        if (JCBox_asistencias_mes.getSelectedIndex() == 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Debe Seleccionar un Mes",
                    "ASISTENCIAS", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

        } else {

            try {
                Connection conn = conexion.conectar();
                JasperReport reporte = null;

                Map parametro = new HashMap();

                parametro.put("mesAsistencia", JCBox_asistencias_mes.getSelectedItem());

                parametro.put("imprimeLogo", ReporteAsistencias_pormes.class.getResource("/reportes/logo1.png"));

                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportAsistenciasMensual.jasper"));
                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                view.setVisible(true);
                view.setTitle("ASISTENCIAS POR MES");
            } catch (JRException e) {
            }

        }

    }

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void mostrarAsistencias_atletames() {

        if (txtCedulaAtleta_asistencia.getText().isEmpty() || JCBox_asistencias_mes.getSelectedIndex() == 0) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Ingrese El Numero de La Cedula Y/O El Mes del Año",
                    "ASISTENCIAS", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

        } else {

            try {
                Connection conn = conexion.conectar();

                JasperReport reporte = null;

                Map parametro = new HashMap();

                parametro.put("cedulaAtleta", txtCedulaAtleta_asistencia.getText());
                parametro.put("mesAsistencia", JCBox_asistencias_mes.getSelectedItem());
                parametro.put("viewLogo", ReporteAsistencias_pormes.class.getResource("/reportes/logo1.png"));

                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportAsistenciasAtletas_mes.jasper"));

                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                view.setVisible(true);
                view.setTitle("ASISTENCIAS ATLETA POR MES");
            } catch (JRException e) {
            }

        }

    }

   
    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */

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
