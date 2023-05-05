
package vistas;

import bd.Conexion;
import dao.AtletasDao;
import dao.PagosDao;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class BuscarCodigo extends javax.swing.JDialog {

     UIManager UI;
     @SuppressWarnings("FieldMayBeFinal")
    private Conexion conexion = new Conexion ();
    
    public BuscarCodigo(Control_pagos ADDMEN, boolean modal) {
	super(ADDMEN, modal);
	initComponents();
         setIconImage(getIconImage());
        this.setTitle("CODIGO-PAGO");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBuscar_pagos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("BUSCAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 30));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 220, 30));

        TableBuscar_pagos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TableBuscar_pagos.setForeground(new java.awt.Color(102, 102, 102));
        TableBuscar_pagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "CODIGO", "DESCRIPCION", "MONTO"
            }
        ));
        TableBuscar_pagos.setRowHeight(20);
        TableBuscar_pagos.setSelectionBackground(new java.awt.Color(0, 153, 153));
        TableBuscar_pagos.setShowVerticalLines(false);
        TableBuscar_pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBuscar_pagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableBuscar_pagos);
        if (TableBuscar_pagos.getColumnModel().getColumnCount() > 0) {
            TableBuscar_pagos.getColumnModel().getColumn(0).setMinWidth(40);
            TableBuscar_pagos.getColumnModel().getColumn(0).setPreferredWidth(40);
            TableBuscar_pagos.getColumnModel().getColumn(0).setMaxWidth(40);
            TableBuscar_pagos.getColumnModel().getColumn(1).setMinWidth(80);
            TableBuscar_pagos.getColumnModel().getColumn(1).setPreferredWidth(80);
            TableBuscar_pagos.getColumnModel().getColumn(1).setMaxWidth(80);
            TableBuscar_pagos.getColumnModel().getColumn(2).setMinWidth(250);
            TableBuscar_pagos.getColumnModel().getColumn(2).setPreferredWidth(250);
            TableBuscar_pagos.getColumnModel().getColumn(2).setMaxWidth(250);
            TableBuscar_pagos.getColumnModel().getColumn(3).setMinWidth(80);
            TableBuscar_pagos.getColumnModel().getColumn(3).setPreferredWidth(80);
            TableBuscar_pagos.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 110));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 240));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TableBuscar_pagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBuscar_pagosMouseClicked
       
	 /* FUNCION  PARA  SELECCIONAR  CON UN CLICK  EL PAGO  Y  PASAR  EL  PARAMETRO  AL CAMPO DEL MODULO  CONTROL PAGOS  */
        if (TableBuscar_pagos.getSelectedRow () >= 0) {

            try {

                // PARA  PASAR  LOS  PARAMETROS  EN  EL  MODULO  CONTROL PAGOS
                DefaultTableModel pasarDatos = (DefaultTableModel) TableBuscar_pagos.getModel ();

               
                String idpago = String.valueOf (pasarDatos.getValueAt (TableBuscar_pagos.getSelectedRow (), 0));
                String codpago = String.valueOf (pasarDatos.getValueAt (TableBuscar_pagos.getSelectedRow (), 1));
                String descripcion = String.valueOf (pasarDatos.getValueAt (TableBuscar_pagos.getSelectedRow (), 2));
                String monto = String.valueOf (pasarDatos.getValueAt (TableBuscar_pagos.getSelectedRow (), 3));
                

                Control_pagos.txtIdPagosP.setText (String.valueOf (idpago));
                Control_pagos.txtCodigoP.setText (String.valueOf (codpago));
                Control_pagos.txtDescripcionP.setText (String.valueOf (descripcion));
                Control_pagos.txtMontoP.setText (String.valueOf (monto));

                int Fila = TableBuscar_pagos.getSelectedRow ();

                setVisible (false);
                dispose ();
                Control_pagos.txtCantidadP.requestFocus();

            } catch (Exception e) {

            }

        } else {
            JOptionPane.showMessageDialog (this, "DEBE SELECCIONAR UN REGISTRO", "SISTEMA", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_TableBuscar_pagosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        mostrarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
       buscarDatos_atletas(txtBuscar.getText ());
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
	    java.util.logging.Logger.getLogger(BuscarCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(BuscarCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(BuscarCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(BuscarCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>
	//</editor-fold>

	/* Create and display the dialog */
	java.awt.EventQueue.invokeLater(() -> {
            BuscarCodigo dialog = new BuscarCodigo((Control_pagos) new javax.swing.JFrame(), true);
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
    private javax.swing.JTable TableBuscar_pagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*  FUNCION  PARA  MOSTRAR  LA  TABLA  CON  LOS  CODIGOS */
    public void mostrarTabla () {
        try {
            DefaultTableModel modelo = new DefaultTableModel () {
		@Override
                public boolean isCellEditable (int fila, int columna) {
                    if (columna == 2) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            TableBuscar_pagos.setModel (modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = conexion.conectar ();
            String sql = "SELECT idpago,codpago,descripcion, monto FROM pagos";
            ps = conn.prepareStatement (sql);
            rs = ps.executeQuery ();

            ResultSetMetaData rsMD = rs.getMetaData ();
            int cantidadColumnas = rsMD.getColumnCount ();

           
            modelo.addColumn ("ID ");
            modelo.addColumn ("COD.PAGO ");
            modelo.addColumn ("DESCRIPCION");
            modelo.addColumn ("MONTO");
           
            int[] anchos = {80, 120, 250, 80};

            for (int i = 0; i < cantidadColumnas; i++) {

                TableBuscar_pagos.getColumnModel ().getColumn (i).setPreferredWidth (anchos[i]);
            }

            while (rs.next ()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {

                    filas[i] = rs.getObject (i + 1);
                }

                modelo.addRow (filas);
                //TableBuscar.setDefaultRenderer (Object.class, new CentrarColum_buscarCodigos ());

                TableBuscar_pagos.getTableHeader ().setPreferredSize (new java.awt.Dimension (0, 30));

                TableBuscar_pagos.getTableHeader ().setFont (new Font ("Cooper Black", 1, 3));

                TableBuscar_pagos.getColumnModel ().getColumn (0).setHeaderRenderer (new MyRenderer (Color.GRAY, Color.white));
                TableBuscar_pagos.getColumnModel ().getColumn (1).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
                TableBuscar_pagos.getColumnModel ().getColumn (2).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
                TableBuscar_pagos.getColumnModel ().getColumn (3).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
                

            }

        } catch (Exception ex) {
            System.err.println ("ex.toString");

        }

    }
    
    /*  FUNCION  PARA  HACER  LA  BUSQUEDA  DEL CODIGO Y LA DESCRIPCION DEL PAGO  */
    public void buscarDatos_atletas (String buscar) {

        PagosDao buscapago = new PagosDao();

        DefaultTableModel modelo = buscapago.buscarPagos(buscar);

        TableBuscar_pagos.setModel (modelo);

       // TableBuscar.setDefaultRenderer (Object.class, new CentrarColum_buscarCodigos ());

        TableBuscar_pagos.getTableHeader ().setPreferredSize (new java.awt.Dimension (0, 30));

        TableBuscar_pagos.getTableHeader ().setFont (new Font ("Cooper Black", 1, 4));

        TableBuscar_pagos.getColumnModel ().getColumn (0).setHeaderRenderer (new MyRenderer (Color.GRAY, Color.white));
        TableBuscar_pagos.getColumnModel ().getColumn (1).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
        TableBuscar_pagos.getColumnModel ().getColumn (2).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
        TableBuscar_pagos.getColumnModel ().getColumn (3).setHeaderRenderer (new MyRenderer(new Color(47, 79, 79), Color.white));
       

        TableBuscar_pagos.getColumnModel ().getColumn (0).setMaxWidth (80);
        TableBuscar_pagos.getColumnModel ().getColumn (0).setMinWidth (80);
        TableBuscar_pagos.getColumnModel ().getColumn (1).setMaxWidth (120);
        TableBuscar_pagos.getColumnModel ().getColumn (1).setMinWidth (120);
        TableBuscar_pagos.getColumnModel ().getColumn (2).setMaxWidth (250);
        TableBuscar_pagos.getColumnModel ().getColumn (2).setMinWidth (250);
        TableBuscar_pagos.getColumnModel ().getColumn (2).setMaxWidth (80);
        TableBuscar_pagos.getColumnModel ().getColumn (2).setMinWidth (80);
        

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
