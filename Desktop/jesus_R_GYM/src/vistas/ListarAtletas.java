package vistas;

import bd.Conexion;
import dao.AtletasDao;
import entidades.Atletas;
import entidades.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class ListarAtletas extends javax.swing.JFrame {

    UIManager UI;
    Usuarios usuar;
    private final Conexion conexion = new Conexion();

    public ListarAtletas(Usuarios usuar) throws SQLException {
        initComponents();
        
        setIconImage(getIconImage());
        this.setTitle ("LISTADO DE ATLETAS");       
        this.setDefaultCloseOperation (JFrame.DO_NOTHING_ON_CLOSE);
        txtUsuario_id.setVisible(false);
        this.usuar = usuar;
        if (usuar.getIdRol() == 1) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        } else if (usuar.getIdRol() == 2) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        } else if (usuar.getIdRol() == 3) {

            txtUsuario_id.setText("" + usuar.getIdusuario());

        }
        
        view_tabla_atletas(TableViewAtletas);
    }

    public ListarAtletas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        LabelBanner = new javax.swing.JLabel();
        PanelTabla = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        LabelBuscar = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        txtUsuario_id = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableViewAtletas = new javax.swing.JTable();
        LabelFondoTabla = new javax.swing.JLabel();
        PanelBotones = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        LabelTiraAtletas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerListaAtletas.png"))); // NOI18N
        LabelBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelBanner.setOpaque(true);
        PanelPrincipal.add(LabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1260, 150));

        PanelTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        PanelTabla.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 230, 30));

        LabelBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelBuscar.setForeground(new java.awt.Color(255, 0, 51));
        LabelBuscar.setText("Buscar");
        PanelTabla.add(LabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 30));

        LabelTitulo.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 59, 0));
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("LISTA DE ATLETAS");
        PanelTabla.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 370, -1));
        PanelTabla.add(txtUsuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 40, -1));

        TableViewAtletas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TableViewAtletas.setForeground(new java.awt.Color(0, 51, 51));
        TableViewAtletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableViewAtletas.setRowHeight(30);
        TableViewAtletas.setSelectionBackground(new java.awt.Color(119, 115, 22));
        TableViewAtletas.setShowVerticalLines(false);
        TableViewAtletas.setSurrendersFocusOnKeystroke(true);
        jScrollPane2.setViewportView(TableViewAtletas);

        PanelTabla.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1220, 330));

        LabelFondoTabla.setBackground(new java.awt.Color(239, 239, 251));
        LabelFondoTabla.setOpaque(true);
        PanelTabla.add(LabelFondoTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1260, 430));

        PanelPrincipal.add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 1260, 430));

        PanelBotones.setBackground(new java.awt.Color(255, 59, 0));
        PanelBotones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirAtletas.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirAtletas2.png"))); // NOI18N
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirAtletas.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirBOTON_SALIR(evt);
            }
        });
        PanelBotones.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 90, 40));

        LabelTiraAtletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tiraAtletas.png"))); // NOI18N
        LabelTiraAtletas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PanelBotones.add(LabelTiraAtletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 80));

        PanelPrincipal.add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1260, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirBOTON_SALIR(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirBOTON_SALIR

        Administracion.verAtletas = null;
        Operaciones_Asistencia.lista_de_atletas = null;
        this.dispose();
    }//GEN-LAST:event_btnSalirBOTON_SALIR

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
       
         buscarAtletas (txtBuscar.getText ());
         if(txtBuscar.getText ().isEmpty()){
             
             view_tabla_atletas(TableViewAtletas);
         }
    }//GEN-LAST:event_txtBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(ListarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarAtletas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBanner;
    private javax.swing.JLabel LabelBuscar;
    private javax.swing.JLabel LabelFondoTabla;
    private javax.swing.JLabel LabelTiraAtletas;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JTable TableViewAtletas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtUsuario_id;
    // End of variables declaration//GEN-END:variables

     // FUNCION PARA VISUALIZAR LA TABLA DE ATLETAS
    AtletasDao atletas = null;

    public void view_tabla_atletas(JTable TableViewAtletas) {

        TableViewAtletas.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel tableAT = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
       
        tableAT.addColumn("FOTO");
        tableAT.addColumn("CEDULA");
        tableAT.addColumn("NOMBRES");
        tableAT.addColumn("SEXO");
        tableAT.addColumn("FECHA-REGISTRO");
        tableAT.addColumn("ASISTENCIA");
        tableAT.addColumn("MODO-PAGO");
        tableAT.addColumn("OBSERVACIONES");

        atletas = new AtletasDao();
        Atletas atle = new Atletas();
        ArrayList<Atletas> list = atletas.Listar_atletas();

        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[8];
                atle = list.get(i);
                
                fila[1] = atle.getCedula();
                fila[2] = atle.getNombres();
                fila[3] = atle.getSexo();
                fila[4] = atle.getFecha_registro();
                fila[5] = atle.getAsistencia();
                fila[6] = atle.getModo_pago();
                fila[7] = atle.getObservaciones();
               
                try {
                    byte[] bi = atle.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[0] = new JLabel(imgi);

                } catch (IOException ex) {
                    fila[0] = new JLabel("No imagen");
                }
                tableAT.addRow(fila);
            }
            TableViewAtletas.setModel(tableAT);
            TableViewAtletas.setRowHeight(60);

            TableViewAtletas.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 25));

            TableViewAtletas.getTableHeader().setFont(new Font("Cambria", 1, 11));

            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
            TableViewAtletas.getColumnModel().getColumn(1).setCellRenderer(Alinear);
           
            
            
            

            TableViewAtletas.getColumnModel().getColumn(0).setPreferredWidth(60);
            TableViewAtletas.getColumnModel().getColumn(1).setPreferredWidth(100);
            TableViewAtletas.getColumnModel().getColumn(2).setPreferredWidth(240);
            TableViewAtletas.getColumnModel().getColumn(3).setPreferredWidth(140);
            TableViewAtletas.getColumnModel().getColumn(4).setPreferredWidth(160);
            TableViewAtletas.getColumnModel().getColumn(5).setPreferredWidth(220);
            TableViewAtletas.getColumnModel().getColumn(6).setPreferredWidth(120);
            TableViewAtletas.getColumnModel().getColumn(7).setPreferredWidth(250);
           

            TableViewAtletas.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(255, 59, 0), Color.white));
            TableViewAtletas.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4),new Color(255,59,0)));
            TableViewAtletas.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255,59,0)));
            TableViewAtletas.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255,59,0)));
            TableViewAtletas.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255,59,0)));
            TableViewAtletas.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255,59,0)));
            TableViewAtletas.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255,59,0)));
            TableViewAtletas.getColumnModel().getColumn(7).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), new Color(255,59,0)));
           
        }
    }
    
    // METODO PARA BUSCAR LOS ATLETAS EN LA TABLA 
    
    public void buscarAtletas (String buscar) {

        AtletasDao buscaDao = new AtletasDao();

        DefaultTableModel modelo = buscaDao.buscarAtletas(buscar);

        TableViewAtletas.setModel (modelo);

        //TableViewAtletas.setDefaultRenderer (Object.class, new CentrarColum_prod ());

        TableViewAtletas.getTableHeader ().setPreferredSize (new java.awt.Dimension (0, 30));

        TableViewAtletas.getTableHeader ().setFont (new Font ("Cooper Black", 1, 10));

            TableViewAtletas.getColumnModel().getColumn(0).setPreferredWidth(100);
            TableViewAtletas.getColumnModel().getColumn(1).setPreferredWidth(240);
            TableViewAtletas.getColumnModel().getColumn(2).setPreferredWidth(140);
            TableViewAtletas.getColumnModel().getColumn(3).setPreferredWidth(160);
            TableViewAtletas.getColumnModel().getColumn(4).setPreferredWidth(220);
            TableViewAtletas.getColumnModel().getColumn(5).setPreferredWidth(120);
            TableViewAtletas.getColumnModel().getColumn(6).setPreferredWidth(250);
           

           
            TableViewAtletas.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TableViewAtletas.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TableViewAtletas.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TableViewAtletas.getColumnModel().getColumn(3).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TableViewAtletas.getColumnModel().getColumn(4).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TableViewAtletas.getColumnModel().getColumn(5).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
            TableViewAtletas.getColumnModel().getColumn(6).setHeaderRenderer(new MyRenderer(new Color(243, 242, 4), Color.white));
    }
    
    
      /*  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  */
    
      // FUNCION  PARA  MOSTRAR  LAS  IMAGENES  EN  EL  TITULO  DE  LAS  VENTANAS
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logoVentana.png"));
        return retValue;
    }
}
