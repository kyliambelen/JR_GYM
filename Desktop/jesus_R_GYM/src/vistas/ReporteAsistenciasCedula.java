
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.plaf.FontUIResource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class ReporteAsistenciasCedula extends javax.swing.JFrame {

   UIManager UI;
    private final Conexion conexion = new Conexion();
     public static BuscarAtletas buscaAtle_asistencia;
     public static Reportes abreReport_cedula;
    public ReporteAsistenciasCedula() {
        initComponents();
         setIconImage(getIconImage());
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRutina2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAbrirCedula = new javax.swing.JButton();
        txtNombresAsistencias = new javax.swing.JTextField();
        txtCedulaAsistencias = new javax.swing.JTextField();
        btnBuscarAsistencias_cedula = new javax.swing.JButton();
        LabelLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(490, 273));
        setResizable(false);

        PanelRutina2.setBackground(new java.awt.Color(0, 102, 204));
        PanelRutina2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ASISTENCIA POR CEDULAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelRutina2.setForeground(new java.awt.Color(255, 255, 255));
        PanelRutina2.setMinimumSize(new java.awt.Dimension(490, 273));
        PanelRutina2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CEDULA");
        PanelRutina2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 20));

        btnAbrirCedula.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 11)); // NOI18N
        btnAbrirCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonUnico.png"))); // NOI18N
        btnAbrirCedula.setToolTipText("");
        btnAbrirCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAbrirCedula.setContentAreaFilled(false);
        btnAbrirCedula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonUnico2.png"))); // NOI18N
        btnAbrirCedula.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonUnico.png"))); // NOI18N
        btnAbrirCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirCedulaActionPerformed(evt);
            }
        });
        PanelRutina2.add(btnAbrirCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 40, 30));

        txtNombresAsistencias.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        txtNombresAsistencias.setForeground(new java.awt.Color(102, 102, 102));
        txtNombresAsistencias.setToolTipText("");
        PanelRutina2.add(txtNombresAsistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 220, 30));

        txtCedulaAsistencias.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        txtCedulaAsistencias.setForeground(new java.awt.Color(102, 102, 102));
        PanelRutina2.add(txtCedulaAsistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 220, 30));

        btnBuscarAsistencias_cedula.setBackground(new java.awt.Color(0, 153, 204));
        btnBuscarAsistencias_cedula.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        btnBuscarAsistencias_cedula.setForeground(new java.awt.Color(0, 0, 153));
        btnBuscarAsistencias_cedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBuscar.png"))); // NOI18N
        btnBuscarAsistencias_cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBuscarAsistencias_cedula.setContentAreaFilled(false);
        btnBuscarAsistencias_cedula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBuscar2.png"))); // NOI18N
        btnBuscarAsistencias_cedula.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBuscar.png"))); // NOI18N
        btnBuscarAsistencias_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAsistencias_cedulaActionPerformed(evt);
            }
        });
        PanelRutina2.add(btnBuscarAsistencias_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 150, 30));

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoJR3.png"))); // NOI18N
        PanelRutina2.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 160, 160));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        PanelRutina2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 150, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRutina2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRutina2, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCedulaActionPerformed

        Reportes RERE = null;

        buscaAtle_asistencia = new BuscarAtletas(RERE, true);
        buscaAtle_asistencia.setVisible(true);
    }//GEN-LAST:event_btnAbrirCedulaActionPerformed

    private void btnBuscarAsistencias_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAsistencias_cedulaActionPerformed

        mostrarAsistencias_cedula();

        Operaciones_rutinas.rutinaCedula = null;
        Reportes.reportCedula = null;
        Reportes.abreReport_asistenciaCedula = null;
        this.dispose();
    }//GEN-LAST:event_btnBuscarAsistencias_cedulaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReporteAsistenciasCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteAsistenciasCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteAsistenciasCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteAsistenciasCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteAsistenciasCedula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JPanel PanelRutina2;
    public static javax.swing.JButton btnAbrirCedula;
    private javax.swing.JButton btnBuscarAsistencias_cedula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtCedulaAsistencias;
    public static javax.swing.JTextField txtNombresAsistencias;
    // End of variables declaration//GEN-END:variables


/*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void mostrarAsistencias_cedula() {

        if (txtCedulaAsistencias.getText().isEmpty()) {

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Ingrese El Numero de La Cedula",
                    "ASISTENCIAS", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

        } else {

            try {
                Connection conn = conexion.conectar();

                JasperReport reporte = null;

                Map parametro = new HashMap();

                parametro.put("cedula", txtCedulaAsistencias.getText());
                parametro.put("rutaLogo", ReporteAsistenciasCedula.class.getResource("/reportes/logo1.png"));

                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportAsistencias_Cedulas.jasper"));

                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                view.setVisible(true);
                view.setTitle("ASISTENCIAS");
            } catch (Exception e) {
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
