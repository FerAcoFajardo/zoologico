/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import exceptions.DAOException;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import objetonegocio.Clima;
import objetonegocio.Continente;
import objetonegocio.Habitat;
import objetonegocio.Vegetacion;
import reglas_negocio.iNegocios;

/**
 *
 * @author fernando
 */
public class FrmPantallaRegistrarHabitat extends javax.swing.JDialog {

    private static FrmPantallaRegistrarHabitat instancia;
    private static Habitat habitat;
    private iNegocios iNegocios;
    private DefaultListModel mdlDisponibles;
    private DefaultListModel mdlSeleccionados = new DefaultListModel();

    /**
     * Creates new form FrmPantallaRegistrarHabitat
     */
    private FrmPantallaRegistrarHabitat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        // Ventana con bordes redondeados
        this.setShape(new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30));
    }

    public static FrmPantallaRegistrarHabitat getInstance(java.awt.Frame parent) {
        if (instancia == null) {
            instancia = new FrmPantallaRegistrarHabitat(parent, true);
            habitat = new Habitat();
        }
        return instancia;
    }

    public void despliegaInformacion(List<List> datos, iNegocios iNegocios) throws Exception {
        if (datos.isEmpty()) {

            throw new Exception("No se pudo recuperar algun dato");
        } else {
            for (List dato : datos) {
                if (dato.isEmpty()) {
                    throw new Exception("No se pudo recuperar un dato");
                }
            }
        }
        this.iNegocios = iNegocios;

        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).get(0).getClass() == Vegetacion.class) {
                datos.get(i).forEach(vegetacion -> {
                    this.cmbVegetacion.addItem((Vegetacion) vegetacion);
                });
            }
            if (datos.get(i).get(0).getClass() == Clima.class) {
//                for (Object item : (((List) datos.get(i)))) {
//                    this.cmbClima.addItem((Clima) item);
//                }
                datos.get(i).forEach(clima -> {
                    this.cmbClima.addItem((Clima) clima);
                });
            }
            if (datos.get(i).get(0).getClass() == Continente.class) {
                mdlDisponibles = new DefaultListModel();
                datos.get(i).forEach(continente -> {
                    mdlDisponibles.addElement(continente);
                });

                listContinentesDisponibles.setModel(mdlDisponibles);
                listContinentesDisponibles.setEnabled(false);
                listContinentesSeleccionados.setEnabled(false);
            }
        }
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        labelCabecera = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNombreHabitat = new javax.swing.JLabel();
        txtNombreHabitat = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        cmbVegetacion = new javax.swing.JComboBox<>();
        lblVegetacion = new javax.swing.JLabel();
        lblClima = new javax.swing.JLabel();
        cmbClima = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        pnlContinentes = new javax.swing.JPanel();
        scrlSeleccionados = new javax.swing.JScrollPane();
        listContinentesSeleccionados = new javax.swing.JList<>();
        scrlDisponibles = new javax.swing.JScrollPane();
        listContinentesDisponibles = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Habitats");
        setForeground(java.awt.Color.red);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 367));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 100, 191));
        jPanel1.setPreferredSize(new java.awt.Dimension(481, 75));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar h??bitats");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_40px.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExitMouseReleased(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 40, 40));

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
        jPanel1.add(labelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 62));

        jPanel2.setBackground(new java.awt.Color(49, 58, 73));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreHabitat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombreHabitat.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreHabitat.setText("Nombre Habitat");
        lblNombreHabitat.setToolTipText("");
        jPanel2.add(lblNombreHabitat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtNombreHabitat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNombreHabitat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreHabitatFocusLost(evt);
            }
        });
        txtNombreHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreHabitatActionPerformed(evt);
            }
        });
        txtNombreHabitat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreHabitatKeyPressed(evt);
            }
        });
        jPanel2.add(txtNombreHabitat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 220, -1));

        btnVerificar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clkBotonVerificarExistencia(evt);
            }
        });
        jPanel2.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        cmbVegetacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbVegetacion.setEnabled(false);
        jPanel2.add(cmbVegetacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 220, -1));

        lblVegetacion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVegetacion.setForeground(new java.awt.Color(255, 255, 255));
        lblVegetacion.setText("Tipo vegetaci??n");
        jPanel2.add(lblVegetacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lblClima.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblClima.setForeground(new java.awt.Color(255, 255, 255));
        lblClima.setText("Clima");
        jPanel2.add(lblClima, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        cmbClima.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbClima.setEnabled(false);
        jPanel2.add(cmbClima, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 220, -1));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clkBotonGuardarHabitat(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 640, 306));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContinentes.setBackground(new java.awt.Color(204, 204, 204));
        pnlContinentes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Continentes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24))); // NOI18N
        pnlContinentes.setForeground(new java.awt.Color(51, 51, 51));
        pnlContinentes.setFocusable(false);
        pnlContinentes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        listContinentesSeleccionados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccionados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 14))); // NOI18N
        listContinentesSeleccionados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listContinentesSeleccionados.setEnabled(false);
        listContinentesSeleccionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clkBotonEliminarContinente(evt);
            }
        });
        scrlSeleccionados.setViewportView(listContinentesSeleccionados);

        listContinentesDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 14))); // NOI18N
        listContinentesDisponibles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listContinentesDisponibles.setAutoscrolls(false);
        listContinentesDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clkBotonAgregarContinente(evt);
            }
        });
        scrlDisponibles.setViewportView(listContinentesDisponibles);

        javax.swing.GroupLayout pnlContinentesLayout = new javax.swing.GroupLayout(pnlContinentes);
        pnlContinentes.setLayout(pnlContinentesLayout);
        pnlContinentesLayout.setHorizontalGroup(
            pnlContinentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContinentesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(scrlSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrlDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContinentesLayout.setVerticalGroup(
            pnlContinentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrlDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
            .addComponent(scrlSeleccionados)
        );

        jPanel4.add(pnlContinentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 57, 360, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1000, 367));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreHabitatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreHabitatActionPerformed

    private void clkBotonVerificarExistencia(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clkBotonVerificarExistencia
        try {
            verificarExistencia();
            txtNombreHabitat.setEnabled(false);
        } catch (DAOException ex) {
            Logger.getLogger(FrmPantallaRegistrarHabitat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clkBotonVerificarExistencia

    private void clkBotonGuardarHabitat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clkBotonGuardarHabitat
        // TODO add your handling code here:
        guardarHabitat();
        
    }//GEN-LAST:event_clkBotonGuardarHabitat

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.instancia = null;
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void clkBotonEliminarContinente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clkBotonEliminarContinente
        if (listContinentesSeleccionados.isEnabled()) {
            eliminarContiente();
        }
    }//GEN-LAST:event_clkBotonEliminarContinente

    private void clkBotonAgregarContinente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clkBotonAgregarContinente
        if (listContinentesDisponibles.isEnabled()) {
            agregarContiente();
        }
    }//GEN-LAST:event_clkBotonAgregarContinente

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.instancia = null;
    }//GEN-LAST:event_formWindowClosed

    private void txtNombreHabitatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreHabitatFocusLost
//        try {
//            // TODO add your handling code here:
//            verificarExistencia();
//            txtNombreHabitat.setEnabled(false);
//        } catch (DAOException ex) {
//            Logger.getLogger(FrmPantallaRegistrarHabitat.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_txtNombreHabitatFocusLost

    private void labelCabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCabeceraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_labelCabeceraMouseDragged

    private void labelCabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCabeceraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_labelCabeceraMousePressed

    private void btnExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseReleased
        this.instancia = null;
        dispose();
    }//GEN-LAST:event_btnExitMouseReleased

    private void txtNombreHabitatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreHabitatKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                verificarExistencia();
                txtNombreHabitat.setEnabled(false);
            } catch (DAOException ex) {
                Logger.getLogger(FrmPantallaRegistrarHabitat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtNombreHabitatKeyPressed

    public void guardarHabitat() {
        try {
            habitat.setClima((Clima) cmbClima.getSelectedItem());
            habitat.setVegetacion((Vegetacion) cmbVegetacion.getSelectedItem());
            habitat.setNombre(txtNombreHabitat.getText());
            habitat.verificaCampos();
            iNegocios.guadarHabitat(habitat);
            JOptionPane.showMessageDialog(this, "Se ha creado exitosamente el nuevo habitat " + habitat.getNombre(), "Creado exitosamente", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            muestraMsjError(e.getMessage());
        }
    }

    public void verificarExistencia() throws DAOException {
        String nombre = this.txtNombreHabitat.getText();

        for (Habitat habitatNuevo : iNegocios.buscaHabitat()) {
            if (habitatNuevo.getNombre().equals(nombre)) {
                muestraMsjExistencia();
                System.out.println(habitatNuevo);
                llenarCamposInfo(habitatNuevo);
                return;
            }
        }

        activarCampos();
    }

    public void muestraMsjExistencia() {
        JOptionPane.showMessageDialog(this, "Este habitat ya existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    public void muestraMsjError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void llenarCamposInfo(Habitat habitatEncontrado) {
        mdlSeleccionados = new DefaultListModel();
        this.txtNombreHabitat.setText(habitatEncontrado.getNombre());
        //cmbClima.setSelectedItem(habitatEncontrado.getClima());
        for (int i = 0; i < cmbClima.getItemCount(); i++) {
            if (cmbClima.getItemAt(i) == habitatEncontrado.getClima()) {
                cmbClima.setSelectedIndex(i);
            }
        }
        //cmbVegetacion.setSelectedItem(habitatEncontrado.getVegetacion());
        for (int i = 0; i < cmbVegetacion.getItemCount(); i++) {
            if (cmbVegetacion.getItemAt(i).getNombre().equals(habitatEncontrado.getVegetacion().getNombre())) {
                cmbVegetacion.setSelectedIndex(i);
            }
        }
        habitatEncontrado.getContinentes().forEach(continente -> {
            mdlSeleccionados.addElement(continente);
            listContinentesSeleccionados.setModel(mdlSeleccionados);
        });

    }

    public void agregarContiente() {

        int fila = listContinentesDisponibles.getSelectedIndex();
        if (fila > -1) {
            mdlSeleccionados.addElement(listContinentesDisponibles.getSelectedValue());
            habitat.agregarContinente(listContinentesDisponibles.getSelectedValue());
            mdlDisponibles = (DefaultListModel) listContinentesDisponibles.getModel();
            mdlDisponibles.remove(fila);
            listContinentesDisponibles.setModel(mdlDisponibles);
            listContinentesSeleccionados.setModel(mdlSeleccionados);
        }
    }

    public void eliminarContiente() {
        int fila = listContinentesSeleccionados.getSelectedIndex();

        if (fila > -1) {
            mdlDisponibles.addElement(listContinentesSeleccionados.getSelectedValue());
            habitat.eliminarContinente(listContinentesDisponibles.getSelectedValue());
            mdlSeleccionados = (DefaultListModel) listContinentesSeleccionados.getModel();
            mdlSeleccionados.remove(fila);
            listContinentesSeleccionados.setModel(mdlSeleccionados);
            listContinentesDisponibles.setModel(mdlDisponibles);
        }

    }

    public void activarCampos() {
        this.cmbClima.setEnabled(true);
        this.cmbVegetacion.setEnabled(true);
        this.listContinentesDisponibles.setEnabled(true);
        this.listContinentesSeleccionados.setEnabled(true);
        this.btnGuardar.setEnabled(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<Clima> cmbClima;
    private javax.swing.JComboBox<Vegetacion> cmbVegetacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelCabecera;
    private javax.swing.JLabel lblClima;
    private javax.swing.JLabel lblNombreHabitat;
    private javax.swing.JLabel lblVegetacion;
    private javax.swing.JList<Continente> listContinentesDisponibles;
    private javax.swing.JList<Continente> listContinentesSeleccionados;
    private javax.swing.JPanel pnlContinentes;
    private javax.swing.JScrollPane scrlDisponibles;
    private javax.swing.JScrollPane scrlSeleccionados;
    private javax.swing.JTextField txtNombreHabitat;
    // End of variables declaration//GEN-END:variables
    int x, y;
}
