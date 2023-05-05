
package vistas;

import bd.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.text.SimpleDateFormat;
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
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class ReporteAsistencias_fechas extends javax.swing.JFrame {

   UIManager UI;
    private final Conexion conexion = new Conexion();
    public ReporteAsistencias_fechas() {
        initComponents();
         this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("ASISTENCIAS");
         setIconImage(getIconImage());
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRutina3 = new javax.swing.JPanel();
        btnBuscarRutina_cedula = new javax.swing.JButton();
        DateChFecha_desde = new com.toedter.calendar.JDateChooser();
        DateChFecha_hasta = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LabelLogo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(535, 290));
        setPreferredSize(new java.awt.Dimension(535, 290));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRutina3.setBackground(new java.awt.Color(0, 102, 204));
        PanelRutina3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ASISTENCIAS POR FECHAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelRutina3.setMinimumSize(new java.awt.Dimension(515, 370));
        PanelRutina3.setPreferredSize(new java.awt.Dimension(515, 370));
        PanelRutina3.setVerifyInputWhenFocusTarget(false);
        PanelRutina3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarRutina_cedula.setBackground(new java.awt.Color(0, 0, 153));
        btnBuscarRutina_cedula.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        btnBuscarRutina_cedula.setForeground(new java.awt.Color(0, 153, 255));
        btnBuscarRutina_cedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBuscar.png"))); // NOI18N
        btnBuscarRutina_cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBuscarRutina_cedula.setContentAreaFilled(false);
        btnBuscarRutina_cedula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBuscar2.png"))); // NOI18N
        btnBuscarRutina_cedula.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBuscar.png"))); // NOI18N
        btnBuscarRutina_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRutina_cedulaActionPerformed(evt);
            }
        });
        PanelRutina3.add(btnBuscarRutina_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 150, 30));

        DateChFecha_desde.setForeground(new java.awt.Color(51, 51, 51));
        DateChFecha_desde.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        PanelRutina3.add(DateChFecha_desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, 30));

        DateChFecha_hasta.setForeground(new java.awt.Color(51, 51, 51));
        DateChFecha_hasta.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        PanelRutina3.add(DateChFecha_hasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 180, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("HASTA:");
        PanelRutina3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 30));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FECHAS");
        PanelRutina3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 80, 25));

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoJR3.png"))); // NOI18N
        PanelRutina3.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 150, 160));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("DESDE:");
        PanelRutina3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, 30));

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

        PanelRutina3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 150, 30));

        getContentPane().add(PanelRutina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarRutina_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRutina_cedulaActionPerformed

      mostrarAsistencias_fecha();
        
        Reportes.abreReport_asistenciaFecha = null;
        this.dispose();
    }//GEN-LAST:event_btnBuscarRutina_cedulaActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteAsistencias_fechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteAsistencias_fechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteAsistencias_fechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteAsistencias_fechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteAsistencias_fechas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChFecha_desde;
    private com.toedter.calendar.JDateChooser DateChFecha_hasta;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JPanel PanelRutina3;
    private javax.swing.JButton btnBuscarRutina_cedula;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

 /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    public void mostrarAsistencias_fecha() {

       
            
            if (DateChFecha_desde.getDate()== null || DateChFecha_hasta.getDate()== null){

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Ingrese Las Fechas a Buscar",
                    "ASISTENCIAS", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

        } else {

            try {
                Connection conn = conexion.conectar();
                String fechaUno;
                String fechaDos;
                java.util.Date date = new java.util.Date();
                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                fechaUno = f.format(DateChFecha_desde.getDate());
                fechaDos = f.format(DateChFecha_hasta.getDate());

                JasperReport reporte = null;
               
                Map parametro = new HashMap();

                parametro.put("fecha_1", fechaUno);
                parametro.put("fecha_2", fechaDos);
                parametro.put("verLogo", ReporteAsistencias_fechas.class.getResource("/reportes/logo1.png"));

                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportAsistencias_fechas.jasper"));

                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                view.setVisible(true);
                view.setTitle("ASISTENCIAS POR FECHAS");
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

    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
   

}
