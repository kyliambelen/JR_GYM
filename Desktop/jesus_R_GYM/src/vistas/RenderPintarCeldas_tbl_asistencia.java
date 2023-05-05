package vistas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author MIGUEL A. RODRIGUEZ
 */
public class RenderPintarCeldas_tbl_asistencia extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1,int i, int i1) {
        JLabel labelResultado = (JLabel) super.getTableCellRendererComponent(jtable, 0, bln, bln1, i, i1);

        if (o instanceof String) {
            String Dato = (String) o;
            if (Dato.equals("SI CANCELO")) {
                labelResultado.setBackground(Color.green);
                labelResultado.setForeground(Color.blue);
            } else {
                if (Dato.equals("NO CANCELO")) {
                    labelResultado.setBackground(Color.RED);
                    labelResultado.setForeground(Color.WHITE);
                }
            }
        }else{
                    
                    labelResultado.setBackground(Color.BLUE);
                    labelResultado.setForeground(Color.WHITE);
                
    }
        return labelResultado;
    }
}

    