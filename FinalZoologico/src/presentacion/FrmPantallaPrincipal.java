/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import com.sun.awt.AWTUtilities;
import java.awt.Cursor;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.List;
import javax.swing.JOptionPane;
import reglas_negocio.FabricaNegocios;
import reglas_negocio.iNegocios;

/**
 *
 * @author fernando
 */
public class FrmPantallaPrincipal extends javax.swing.JFrame {
    
    List listaDatos;
    iNegocios iNegocios;

    /**
     * Creates new form FrmPantallaRegistrarHabitat
     */
    public FrmPantallaPrincipal() {
        initComponents();
        iNegocios = FabricaNegocios.crearNegocios();
        // Ventana con bordes redondeados
        this.setShape(new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30));
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        labelCabecera = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        btnMostrarRegistroHabitat = new javax.swing.JLabel();
        btnRegistroEspecies = new javax.swing.JLabel();
        btnRegistrarItinerario = new javax.swing.JLabel();
        btnRegistrarQueja = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");
        setUndecorated(true);
        setSize(new java.awt.Dimension(430, 377));

        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulo.setBackground(new java.awt.Color(23, 100, 191));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Zoológico");
        panelTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 180, -1));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_40px.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExitMouseReleased(evt);
            }
        });
        panelTitulo.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 40, 40));

        labelCabecera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelCabecera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                labelCabeceraMouseDragged(evt);
            }
        });
        labelCabecera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelCabeceraMousePressed(evt);
            }
        });
        panelTitulo.add(labelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 60));

        panelBackground.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 60));

        panelContenido.setBackground(new java.awt.Color(49, 58, 73));
        panelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrarRegistroHabitat.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnMostrarRegistroHabitat.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarRegistroHabitat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_no_image_64px.png"))); // NOI18N
        btnMostrarRegistroHabitat.setText("Registro hábitats");
        btnMostrarRegistroHabitat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarRegistroHabitatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarRegistroHabitatMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMostrarRegistroHabitatclkBotonMostrarRegistroHabitat(evt);
            }
        });
        panelContenido.add(btnMostrarRegistroHabitat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 50));

        btnRegistroEspecies.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnRegistroEspecies.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroEspecies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_pets_64px.png"))); // NOI18N
        btnRegistroEspecies.setText("Registro especies");
        btnRegistroEspecies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroEspeciesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroEspeciesMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRegistroEspeciesclkMostrarRegistrarEspecie(evt);
            }
        });
        panelContenido.add(btnRegistroEspecies, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 60));

        btnRegistrarItinerario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnRegistrarItinerario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarItinerario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_contact_details_64px.png"))); // NOI18N
        btnRegistrarItinerario.setText("Registro itinerarios");
        btnRegistrarItinerario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarItinerarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarItinerarioMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRegistrarItinerarioMouseReleased(evt);
            }
        });
        panelContenido.add(btnRegistrarItinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 390, 50));

        btnRegistrarQueja.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnRegistrarQueja.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarQueja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_disclaimer_64px.png"))); // NOI18N
        btnRegistrarQueja.setText("Registrar queja");
        btnRegistrarQueja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarQuejaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarQuejaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRegistrarQuejaMouseReleased(evt);
            }
        });
        panelContenido.add(btnRegistrarQueja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 60));

        panelBackground.add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 430, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(430, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarRegistroHabitatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarRegistroHabitatMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnMostrarRegistroHabitatMouseEntered

    private void btnMostrarRegistroHabitatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarRegistroHabitatMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnMostrarRegistroHabitatMouseExited

    private void btnMostrarRegistroHabitatclkBotonMostrarRegistroHabitat(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarRegistroHabitatclkBotonMostrarRegistroHabitat
        
        
        try{
            listaDatos = iNegocios.recuperarDatosFormHabitat();
           // System.out.println(listaDatos.toString());
            FrmPantallaRegistrarHabitat frmPantallaRegistrarHabitat = FrmPantallaRegistrarHabitat.getInstance(this);
            frmPantallaRegistrarHabitat.despliegaInformacion(listaDatos, iNegocios);
        }catch(Exception e){
            //System.out.println(e.getMessage());
            muestraMsjError(e.getMessage());
        }
    }//GEN-LAST:event_btnMostrarRegistroHabitatclkBotonMostrarRegistroHabitat

    private void btnRegistroEspeciesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroEspeciesMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnRegistroEspeciesMouseEntered

    private void btnRegistroEspeciesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroEspeciesMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnRegistroEspeciesMouseExited

    private void btnRegistroEspeciesclkMostrarRegistrarEspecie(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroEspeciesclkMostrarRegistrarEspecie
        try{
            listaDatos = iNegocios.recuperarDatosFormEspecie();
            FrmPantallaRegistroEspecie frmPantallaRegistroEspecie = FrmPantallaRegistroEspecie.getInstance(this);
            frmPantallaRegistroEspecie.despliegaInformacion(listaDatos, iNegocios);
        }catch(Exception e){
            muestraMsjError(e.getMessage());
        }
    }//GEN-LAST:event_btnRegistroEspeciesclkMostrarRegistrarEspecie

    private void btnRegistrarItinerarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarItinerarioMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnRegistrarItinerarioMouseEntered

    private void btnRegistrarItinerarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarItinerarioMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnRegistrarItinerarioMouseExited

    private void btnRegistrarItinerarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarItinerarioMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarItinerarioMouseReleased

    private void btnRegistrarQuejaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarQuejaMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnRegistrarQuejaMouseEntered

    private void btnRegistrarQuejaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarQuejaMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnRegistrarQuejaMouseExited

    private void btnRegistrarQuejaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarQuejaMouseReleased
        try{
            listaDatos = iNegocios.recuperarDatosFormHabitat();
           // System.out.println(listaDatos.toString());
            FrmPantallaRegistrarQueja frmPantallaRegistrarQuejas = FrmPantallaRegistrarQueja.getInstance(this);
            //FrmPantallaRegistrarQueja.despliegaInformacion(listaDatos, iNegocios);
        }catch(Exception e){
            //System.out.println(e.getMessage());
            muestraMsjError(e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarQuejaMouseReleased

    private void labelCabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCabeceraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_labelCabeceraMousePressed

    private void labelCabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCabeceraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_labelCabeceraMouseDragged

    private void btnExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseReleased
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseReleased

    
    public void muestraMsjError(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "Error",JOptionPane.ERROR_MESSAGE);
    }

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
            java.util.logging.Logger.getLogger(FrmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPantallaPrincipal().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMostrarRegistroHabitat;
    private javax.swing.JLabel btnRegistrarItinerario;
    private javax.swing.JLabel btnRegistrarQueja;
    private javax.swing.JLabel btnRegistroEspecies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCabecera;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
    int x,y;
}
