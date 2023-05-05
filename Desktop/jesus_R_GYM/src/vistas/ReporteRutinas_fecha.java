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
public class ReporteRutinas_fecha extends javax.swing.JFrame {

    UIManager UI;
    private Conexion conexion = new Conexion();

    public static BuscarPorRutinas searchFecha;

    public ReporteRutinas_fecha() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("RUTINAS");
         setIconImage(getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRutina3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCedula_atleta = new javax.swing.JTextField();
        txtNombres_atleta = new javax.swing.JTextField();
        btnBuscarRutina_cedula = new javax.swing.JButton();
        DateChooser_desde = new com.toedter.calendar.JDateChooser();
        DateChooser_hasta = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCedulaRutinas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(560, 290));
        setResizable(false);
        setSize(new java.awt.Dimension(560, 290));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRutina3.setBackground(new java.awt.Color(0, 153, 204));
        PanelRutina3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RUTINAS POR FECHA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelRutina3.setMinimumSize(new java.awt.Dimension(515, 370));
        PanelRutina3.setPreferredSize(new java.awt.Dimension(515, 370));
        PanelRutina3.setVerifyInputWhenFocusTarget(false);
        PanelRutina3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("NOMBRES:");
        PanelRutina3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 30));

        txtCedula_atleta.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        txtCedula_atleta.setForeground(new java.awt.Color(102, 102, 102));
        PanelRutina3.add(txtCedula_atleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 200, 30));

        txtNombres_atleta.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        txtNombres_atleta.setForeground(new java.awt.Color(102, 102, 102));
        txtNombres_atleta.setToolTipText("");
        PanelRutina3.add(txtNombres_atleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 240, 30));

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
        PanelRutina3.add(btnBuscarRutina_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 150, 30));

        DateChooser_desde.setForeground(new java.awt.Color(51, 51, 51));
        DateChooser_desde.setDateFormatString("yyyy/MM/dd");
        DateChooser_desde.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        PanelRutina3.add(DateChooser_desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 240, 30));

        DateChooser_hasta.setForeground(new java.awt.Color(51, 51, 51));
        DateChooser_hasta.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        PanelRutina3.add(DateChooser_hasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 240, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("HASTA:");
        PanelRutina3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 30));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FECHA");
        PanelRutina3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 80, 25));

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
        PanelRutina3.add(btnCedulaRutinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 50, 40, 30));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("CEDULA:");
        PanelRutina3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoJR3.png"))); // NOI18N
        PanelRutina3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 150, 150));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("DESDE:");
        PanelRutina3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, 30));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        PanelRutina3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 150, 30));

        getContentPane().add(PanelRutina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarRutina_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRutina_cedulaActionPerformed

       
        mostrarRutinas_fecha();
        Operaciones_rutinas.rutinaFecha = null;
        Reportes.reportFecha = null;
        this.dispose();
    }//GEN-LAST:event_btnBuscarRutina_cedulaActionPerformed

    private void btnCedulaRutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCedulaRutinasActionPerformed

        Operaciones_rutinas REOR = null;

        searchFecha = new BuscarPorRutinas(REOR, true);
        searchFecha.setVisible(true);
    }//GEN-LAST:event_btnCedulaRutinasActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteRutinas_fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteRutinas_fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteRutinas_fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteRutinas_fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteRutinas_fecha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser_desde;
    private com.toedter.calendar.JDateChooser DateChooser_hasta;
    private javax.swing.JPanel PanelRutina3;
    private javax.swing.JButton btnBuscarRutina_cedula;
    public static javax.swing.JButton btnCedulaRutinas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtCedula_atleta;
    public static javax.swing.JTextField txtNombres_atleta;
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
    public void mostrarRutinas_fecha() {

       
            
            if (txtCedula_atleta.getText().isEmpty() || DateChooser_desde.getDate()== null || DateChooser_hasta.getDate()== null){

            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#0B0B3B"));
            JOptionPane.showMessageDialog(this, "Ingrese El Numero de La Cedula Y/O Las Fechas a Buscar",
                    "RUTINAS", JOptionPane.PLAIN_MESSAGE, icono("/img/panelfacturas.png", 60, 60));

        } else {

            try {
                Connection conn = conexion.conectar();
                String fechaUno;
                String fechaDos;
                java.util.Date date = new java.util.Date();
                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                fechaUno = f.format(DateChooser_desde.getDate());
                fechaDos = f.format(DateChooser_hasta.getDate());

                JasperReport reporte = null;
              
                Map parametro = new HashMap();

                parametro.put("cedula_atleta", txtCedula_atleta.getText());
                parametro.put("nombres_atleta", txtNombres_atleta.getText());
                parametro.put("fecha1", fechaUno);
                parametro.put("fecha2", fechaDos);
                parametro.put("imagen_ruta", ReporteRutinas_fecha.class.getResource("/reportes/logo1.png"));

                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportVerRutinas.jasper"));

                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                view.setVisible(true);
                view.setTitle("RUTINAS POR FECHAS");
            } catch (Exception e) {
            }

        }

    }
    /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */

}
