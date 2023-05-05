
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
public class ReporteFactura_detallecedula extends javax.swing.JFrame {
     UIManager UI;
    private final Conexion conexion = new Conexion();
     public static BuscarAtletas abreReportDetalle_Cedula;
    
     public ReporteFactura_detallecedula() {
        initComponents();
         setIconImage(getIconImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRutina2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAbrirCedula = new javax.swing.JButton();
        txtNombres_fact = new javax.swing.JTextField();
        txtCedulaCliente_fact = new javax.swing.JTextField();
        btnBuscarFactura_detallecedula = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(490, 273));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRutina2.setBackground(new java.awt.Color(51, 153, 255));
        PanelRutina2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FACTURA DETALLE CLIENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelRutina2.setPreferredSize(new java.awt.Dimension(490, 273));
        PanelRutina2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CEDULA");
        PanelRutina2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 20));

        btnAbrirCedula.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 11)); // NOI18N
        btnAbrirCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonUnico.png"))); // NOI18N
        btnAbrirCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAbrirCedula.setContentAreaFilled(false);
        btnAbrirCedula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonUnico2.png"))); // NOI18N
        btnAbrirCedula.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonUnico.png"))); // NOI18N
        btnAbrirCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirCedulaActionPerformed(evt);
            }
        });
        PanelRutina2.add(btnAbrirCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 90, 40, 30));

        txtNombres_fact.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        txtNombres_fact.setForeground(new java.awt.Color(102, 102, 102));
        txtNombres_fact.setToolTipText("");
        PanelRutina2.add(txtNombres_fact, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, 30));

        txtCedulaCliente_fact.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        txtCedulaCliente_fact.setForeground(new java.awt.Color(102, 102, 102));
        PanelRutina2.add(txtCedulaCliente_fact, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 220, 30));

        btnBuscarFactura_detallecedula.setBackground(new java.awt.Color(0, 153, 204));
        btnBuscarFactura_detallecedula.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        btnBuscarFactura_detallecedula.setForeground(new java.awt.Color(0, 0, 153));
        btnBuscarFactura_detallecedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBuscar.png"))); // NOI18N
        btnBuscarFactura_detallecedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBuscarFactura_detallecedula.setContentAreaFilled(false);
        btnBuscarFactura_detallecedula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBuscar2.png"))); // NOI18N
        btnBuscarFactura_detallecedula.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBuscar.png"))); // NOI18N
        btnBuscarFactura_detallecedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFactura_detallecedulaActionPerformed(evt);
            }
        });
        PanelRutina2.add(btnBuscarFactura_detallecedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoJR3.png"))); // NOI18N
        PanelRutina2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 150, 150));

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

        PanelRutina2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 150, 10));

        getContentPane().add(PanelRutina2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 273));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCedulaActionPerformed

        Reportes RERE = null;

        abreReportDetalle_Cedula = new BuscarAtletas(RERE, true);
        abreReportDetalle_Cedula.setVisible(true);
    }//GEN-LAST:event_btnAbrirCedulaActionPerformed

    private void btnBuscarFactura_detallecedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFactura_detallecedulaActionPerformed

       mostrarFacturaDetalle_cedula();
        Operaciones_rutinas.rutinaCedula = null;
        Reportes.reportCedula = null;
        Reportes.abreReport_asistenciaCedula = null;
        Reportes.abreReport_detalleCedula = null;
        this.dispose();
    }//GEN-LAST:event_btnBuscarFactura_detallecedulaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the window look and feel */
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
            java.util.logging.Logger.getLogger(ReporteFactura_detallecedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteFactura_detallecedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteFactura_detallecedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteFactura_detallecedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteFactura_detallecedula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelRutina2;
    public static javax.swing.JButton btnAbrirCedula;
    private javax.swing.JButton btnBuscarFactura_detallecedula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtCedulaCliente_fact;
    public static javax.swing.JTextField txtNombres_fact;
    // End of variables declaration//GEN-END:variables


      
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
    
    
    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void mostrarFacturaDetalle_cedula() {

         if (txtCedulaCliente_fact.getText().isEmpty()) {
             
              UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Ingrese El Numero de La Cedula",
            "FACTURACION", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 60, 60));
            
              } else {
            
             try {
                Connection conn = conexion.conectar();

                JasperReport reporte = null;

                Map parametro = new HashMap();

                parametro.put("dni", txtCedulaCliente_fact.getText());
                parametro.put("img_foto", ReporteFactura_detallecedula.class.getResource("/reportes/logo1.png"));

                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportFacturaDetallada_clientes.jasper"));

                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                view.setVisible(true);
                view.setTitle("FACTURACION");
            } catch (Exception e) {
            }
    }
        
    }
}
