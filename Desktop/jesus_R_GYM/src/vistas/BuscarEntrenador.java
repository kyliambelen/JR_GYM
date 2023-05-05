package vistas;

import bd.Conexion;
import dao.AtletasDao;
import dao.EntrenadorDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class BuscarEntrenador extends javax.swing.JDialog {

    UIManager UI;

    private final Conexion conexion = new Conexion();

    public BuscarEntrenador(AgregarMensualidad ADDENTRENADOR, boolean modal) {
        super(ADDENTRENADOR, modal);
        initComponents();
        setIconImage(getIconImage());
        this.setTitle("ENTRENADOR");
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarEntrenador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBuscarEntrenador = new javax.swing.JTable();
        PanelSuperior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(0, 153, 204));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(500, 240));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(500, 240));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("BUSCAR");
        PanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 30));

        txtBuscarEntrenador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarEntrenadorKeyReleased(evt);
            }
        });
        PanelPrincipal.add(txtBuscarEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 220, 30));

        TableBuscarEntrenador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TableBuscarEntrenador.setForeground(new java.awt.Color(102, 102, 102));
        TableBuscarEntrenador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "CEDULA", "NOMBRES"
            }
        ));
        TableBuscarEntrenador.setRowHeight(20);
        TableBuscarEntrenador.setSelectionBackground(new java.awt.Color(128, 128, 128));
        TableBuscarEntrenador.setShowVerticalLines(false);
        TableBuscarEntrenador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBuscarEntrenadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableBuscarEntrenador);

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 110));

        PanelSuperior.setBackground(new java.awt.Color(0, 102, 102));
        PanelSuperior.setPreferredSize(new java.awt.Dimension(500, 50));
        PanelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENTRENADORES");
        PanelSuperior.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 15, 190, 20));

        PanelPrincipal.add(PanelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarEntrenadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEntrenadorKeyReleased
        buscarDatos_entrenador(txtBuscarEntrenador.getText());
    }//GEN-LAST:event_txtBuscarEntrenadorKeyReleased

    private void TableBuscarEntrenadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBuscarEntrenadorMouseClicked

        /* FUNCION  PARA  SELECCIONAR  CON UN CLICK  EL ATLETA  Y  PASAR  EL  PARAMETRO  AL CAMPO DEL MODULO  DE VENTAS  */
        if (TableBuscarEntrenador.getSelectedRow() >= 0) {

            try {

                // PARA  PASAR  LOS  PARAMETROS  EN  EL  MODULO  AGREGAR MENSUALIDAD
                DefaultTableModel pasarDatos = (DefaultTableModel) TableBuscarEntrenador.getModel();

                String identrenador = String.valueOf(pasarDatos.getValueAt(TableBuscarEntrenador.getSelectedRow(), 0));
                String cedula = String.valueOf(pasarDatos.getValueAt(TableBuscarEntrenador.getSelectedRow(), 1));
                String nombres = String.valueOf(pasarDatos.getValueAt(TableBuscarEntrenador.getSelectedRow(), 2));

                AgregarMensualidad.txtEntrenador_per.setText(String.valueOf(nombres));

                int Fila = TableBuscarEntrenador.getSelectedRow();

                setVisible(false);
                dispose();

            } catch (Exception e) {

            }

        } else {
            UI = null;
            UIManager.put("OptionPane.background", new Color(255, 255, 255));
            UIManager.put("Panel.background", new Color(255, 255, 255));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.BOLD, 16)));
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Cambria", Font.PLAIN, 15)));
            UIManager.put("OptionPane.messageForeground", Color.decode("#DF0101"));
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UN REGISTRO",
                    "ENTRENADOR", JOptionPane.PLAIN_MESSAGE, icono("/img/logoJR3.png", 90, 90));
        }


    }//GEN-LAST:event_TableBuscarEntrenadorMouseClicked

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
            java.util.logging.Logger.getLogger(BuscarEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            BuscarEntrenador dialog = new BuscarEntrenador((AgregarMensualidad) new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JTable TableBuscarEntrenador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscarEntrenador;
    // End of variables declaration//GEN-END:variables

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*  FUNCION  PARA  MOSTRAR  LA  TABLA  CON  LOS  CODIGOS */
    public void mostrarTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    if (columna == 2) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            TableBuscarEntrenador.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = conexion.conectar();
            String sql = "SELECT identrenador,cedula,nombres FROM entrenador";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID ");
            modelo.addColumn("CEDULA ");
            modelo.addColumn("NOMBRES");

            int[] anchos = {80, 120, 250};

            for (int i = 0; i < cantidadColumnas; i++) {

                TableBuscarEntrenador.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {

                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);

                TableBuscarEntrenador.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));
                TableBuscarEntrenador.getTableHeader().setFont(new Font("Cooper Black", 1, 3));

                TableBuscarEntrenador.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(Color.GRAY, Color.white));
                TableBuscarEntrenador.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));
                TableBuscarEntrenador.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));

            }

        } catch (Exception ex) {
            System.err.println("ex.toString");

        }

    }

    /*  FUNCION  PARA  HACER  LA  BUSQUEDA  DE LA CEDULA Y EL NOMBRE DEL ENTRENADOR  */
    public void buscarDatos_entrenador(String buscar) {

        EntrenadorDao buscaEntrenador = new EntrenadorDao();

        DefaultTableModel modelo = buscaEntrenador.buscarNombres(buscar);

        TableBuscarEntrenador.setModel(modelo);

        // TableBuscar.setDefaultRenderer (Object.class, new CentrarColum_buscarCodigos ());
        TableBuscarEntrenador.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));

        TableBuscarEntrenador.getTableHeader().setFont(new Font("Cooper Black", 1, 4));

        TableBuscarEntrenador.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(Color.GRAY, Color.white));
        TableBuscarEntrenador.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));
        TableBuscarEntrenador.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(Color.blue, Color.white));

        TableBuscarEntrenador.getColumnModel().getColumn(0).setMaxWidth(80);
        TableBuscarEntrenador.getColumnModel().getColumn(0).setMinWidth(80);
        TableBuscarEntrenador.getColumnModel().getColumn(1).setMaxWidth(120);
        TableBuscarEntrenador.getColumnModel().getColumn(1).setMinWidth(120);
        TableBuscarEntrenador.getColumnModel().getColumn(2).setMaxWidth(300);
        TableBuscarEntrenador.getColumnModel().getColumn(2).setMinWidth(300);

    }

    /* FUNCION  PARA  COLOCAR  ICONO  A LAS  VENTANAS DE DIALOGOS  DE LOS JOPCIONPANEL*/
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logoVentana.png"));
        return retValue;
    }

}
