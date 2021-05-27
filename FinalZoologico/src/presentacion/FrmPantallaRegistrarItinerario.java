/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import exceptions.DAOException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetonegocio.DiaSemana;
import objetonegocio.Guia;
import objetonegocio.Horario;
import objetonegocio.Itinerario;
import objetonegocio.Zona;
import org.bson.types.ObjectId;
import reglas_negocio.iNegocios;

/**
 *
 * @author paulb
 */
public class FrmPantallaRegistrarItinerario extends javax.swing.JDialog {

    private static FrmPantallaRegistrarItinerario instancia;
    private Itinerario itinerario;
    private iNegocios iNegocios;
    private DefaultTableModel modeloTablaHorario;
    private DefaultTableModel modeloTablaZonas;
    private List<Zona> zonas;
    
    /**
     * Creates new form FrmPantallaRegistrarItinerario
     */
    private FrmPantallaRegistrarItinerario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modeloTablaHorario = (DefaultTableModel)this.tblHorario.getModel();
        modeloTablaZonas = (DefaultTableModel)this.tblZonas.getModel();
        
        
        this.itinerario = new Itinerario();
    }

    public static FrmPantallaRegistrarItinerario getInstance(java.awt.Frame parent){
        if(instancia==null){
            instancia = new FrmPantallaRegistrarItinerario(parent, true);
        }
        return instancia;
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        labelCabecera = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlFechas = new javax.swing.JPanel();
        txtDuracion = new javax.swing.JTextField();
        txtLongitud = new javax.swing.JTextField();
        txtMaxVisitantes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblZonas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHorario = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cmbGuia = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtNombreItinerario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(900, 570));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(23, 100, 191));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar itinerarios");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 470, 40));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_40px.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExitMouseReleased(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 40, 40));

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
        jPanel2.add(labelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 60));

        jPanel3.setBackground(new java.awt.Color(49, 58, 73));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Itinerarios");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pnlFechas.setBackground(new java.awt.Color(49, 58, 73));
        pnlFechas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles para el registro de un nuevo itinerario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlFechas.setForeground(new java.awt.Color(51, 51, 51));
        pnlFechas.setFocusable(false);
        pnlFechas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pnlFechas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDuracion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtDuracion.setToolTipText("");
        txtDuracion.setEnabled(false);
        pnlFechas.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 127, -1));

        txtLongitud.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtLongitud.setToolTipText("");
        txtLongitud.setEnabled(false);
        pnlFechas.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 127, -1));

        txtMaxVisitantes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtMaxVisitantes.setToolTipText("");
        txtMaxVisitantes.setEnabled(false);
        pnlFechas.add(txtMaxVisitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 127, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Duración en minutos");
        pnlFechas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 71, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Longitud en metros");
        pnlFechas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 118, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Guia");
        pnlFechas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clkBotonGuardar(evt);
            }
        });
        pnlFechas.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Zonas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jScrollPane1.setEnabled(false);

        tblZonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Zona", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblZonas);
        if (tblZonas.getColumnModel().getColumnCount() > 0) {
            tblZonas.getColumnModel().getColumn(1).setMinWidth(25);
            tblZonas.getColumnModel().getColumn(1).setPreferredWidth(25);
            tblZonas.getColumnModel().getColumn(1).setMaxWidth(25);
        }

        pnlFechas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 39, 230, 360));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        tblHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Horario"
            }
        ));
        tblHorario.setEnabled(false);
        jScrollPane2.setViewportView(tblHorario);
        if (tblHorario.getColumnModel().getColumnCount() > 0) {
            tblHorario.getColumnModel().getColumn(0).setResizable(false);
        }

        pnlFechas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 210, 370));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Max num visitantes");
        pnlFechas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 165, -1, -1));

        cmbGuia.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        cmbGuia.setEnabled(false);
        pnlFechas.add(cmbGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 250, 30));

        jPanel3.add(pnlFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 920, 410));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clkBotonBuscar(evt);
            }
        });
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        txtNombreItinerario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreItinerarioFocusLost(evt);
            }
        });
        txtNombreItinerario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreItinerarioKeyPressed(evt);
            }
        });
        jPanel3.add(txtNombreItinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 260, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 950, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(950, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseReleased
        cerrarVentana();
    }//GEN-LAST:event_btnExitMouseReleased

       public void cerrarVentana(){
           instancia = null;
           dispose();
       }
    
    private void labelCabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCabeceraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_labelCabeceraMouseDragged

    private void labelCabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCabeceraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_labelCabeceraMousePressed

    private void clkBotonGuardar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clkBotonGuardar
        guardar();
    }//GEN-LAST:event_clkBotonGuardar

    
    public void guardar(){
        try{
            List<Horario> horario = new ArrayList<>();
            List<ObjectId> recorridos = new ArrayList();
            itinerario.setGuia(((Guia)cmbGuia.getSelectedItem()).getId());
            for (int i = 0; i < tblHorario.getRowCount(); i++) {
                Horario hora = new Horario();
                if(!tblHorario.getValueAt(i, 1).toString().isEmpty() ){
                    
                    String[] horas = ((String)tblHorario.getValueAt(i, 1)).split(",");
                    hora.setDia((DiaSemana) tblHorario.getValueAt(i, 0));
                     
                    for (String hora1 : Arrays.asList(horas)) {
                        hora.agregarHora(hora1);
                    }
                    horario.add(hora);
                }
            }
            itinerario.setHorario(horario);
            itinerario.setMaxVisitantes(Integer.parseInt(txtMaxVisitantes.getText()));
            itinerario.setNombre(txtNombreItinerario.getText());
            
            for (int i = 0; i < tblZonas.getRowCount(); i++) {
                if((boolean)tblZonas.getValueAt(i, 1)){
                    recorridos.add(((Zona)tblZonas.getValueAt(i, 0)).getId());
                }
            }
            itinerario.setRecorridos(recorridos);
            itinerario.setDuracion(Integer.parseInt(txtDuracion.getText()));
            itinerario.setLongitud(Float.parseFloat(txtLongitud.getText()));
            
            Itinerario recuperado = iNegocios.recuperaItinerario(itinerario.getNombre());
            
            if(recuperado != null){
                muestraMsj("Error: itinerario existente");
                return;
            }
            iNegocios.guardaItinerario(itinerario);
            muestraMsj("Registro exitoso");
            limpiarCampos();
        }catch(DAOException ex){
            muestraMsj(ex.getMessage());
        }
    }
    
    
    private void clkBotonBuscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clkBotonBuscar
        // TODO add your handling code here:
        verificarExistencia();
    }//GEN-LAST:event_clkBotonBuscar

    private void txtNombreItinerarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreItinerarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreItinerarioFocusLost

    private void txtNombreItinerarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreItinerarioKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            verificarExistencia();
        }
    }//GEN-LAST:event_txtNombreItinerarioKeyPressed

    public void verificarExistencia(){
        try {
            // TODO add your handling code here:
            Itinerario itinerario = iNegocios.recuperaItinerario(txtNombreItinerario.getText());
            if(itinerario != null){
                llenaCamposInfor(itinerario);
                muestraMsj("Error: el Itinerario ya existe");
                return;
            }
            activaCampos();
            cargaCheckBoxZonas();
        } catch (DAOException ex) {
            muestraMsj(ex.getMessage());
        }
    }
    
    
    
    void despliegaInformacion(List<List> datos, iNegocios iNegocios) throws Exception {
        
        if (datos.isEmpty()) {
            
            throw new Exception("No se pudo recuperar algun dato");
        }else{
            for (List dato : datos) {
                if(dato.isEmpty()){
                    throw new Exception("No se pudo recuperar un dato");
                }
            }
        }
        this.iNegocios = iNegocios;
        
        modeloTablaHorario.addRow(new Object[]{DiaSemana.MARTES,""});
        modeloTablaHorario.addRow(new Object[]{DiaSemana.MIERCOLES,""});
        modeloTablaHorario.addRow(new Object[]{DiaSemana.JUEVES,""});
        modeloTablaHorario.addRow(new Object[]{DiaSemana.VIERNES,""});
        modeloTablaHorario.addRow(new Object[]{DiaSemana.SABADO,""});
        modeloTablaHorario.addRow(new Object[]{DiaSemana.DOMINGO,""});
        
        this.tblHorario.setModel(modeloTablaHorario);
        
        
        for (int i = 0; i < datos.size(); i++) {
               
            if (datos.get(i).get(0).getClass() == Zona.class) {
                this.zonas = datos.get(i);
            }
            
            if (datos.get(i).get(0).getClass() == Guia.class) {
                for (int j = 0; j < datos.get(i).size(); j++) {
                    this.cmbGuia.addItem((Guia) datos.get(i).get(j));
                }
            }
        }
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Guia> cmbGuia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCabecera;
    private javax.swing.JPanel pnlFechas;
    private javax.swing.JTable tblHorario;
    private javax.swing.JTable tblZonas;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtMaxVisitantes;
    private javax.swing.JTextField txtNombreItinerario;
    // End of variables declaration//GEN-END:variables
    int x,y;

    private void muestraMsj(String message) {
        JOptionPane.showMessageDialog(this, message, "Error/Advertencia",JOptionPane.ERROR_MESSAGE);
    }

    private void activaCampos() {
        this.txtDuracion.setEnabled(true);
        this.txtLongitud.setEnabled(true);
        this.txtMaxVisitantes.setEnabled(true);
        this.txtNombreItinerario.setEnabled(true);
        this.cmbGuia.setEnabled(true);
        this.tblHorario.setEnabled(true);
        this.tblZonas.setEnabled(true);
        this.btnGuardar.setEnabled(true);
    }

    private void cargaCheckBoxZonas() {
        
                for (int i = 0; i < zonas.size(); i++) {
                    Object[] row = new Object[2];
                    row[0] = zonas.get(i);
                    row[1] = false;
                    this.modeloTablaZonas.addRow(row);
                }
            
    }

    private void limpiarCampos() {
        txtDuracion.setText("");
        txtLongitud.setText("");
        txtMaxVisitantes.setText("");
        txtNombreItinerario.setText("");

    }

    private void llenaCamposInfor(Itinerario itinerario) throws DAOException {
        this.txtDuracion.setText(String.valueOf(itinerario.getDuracion()));
        this.txtLongitud.setText(String.valueOf(itinerario.getLongitud()));
        this.txtMaxVisitantes.setText(String.valueOf(itinerario.getMaxVisitantes()));
        
        //modeloTablaZonas = new DefaultTableModel();
        for (int i = 0; i < cmbGuia.getItemCount(); i++) {
            if(((Guia)cmbGuia.getItemAt(i)).getId() == itinerario.getGuia()){
                cmbGuia.setSelectedIndex(i);
                break;
            }
        }
        
        modeloTablaZonas.setRowCount(0);
        for (int i = 0; i < itinerario.getRecorridos().size(); i++) {
            modeloTablaZonas.addRow(new Object[]{iNegocios.recuperarZona(itinerario.getRecorridos().get(i)),true});            
        }
        tblZonas.setModel(modeloTablaZonas);
        
        this.modeloTablaHorario.setRowCount(0);
        this.txtNombreItinerario.setEnabled(false);
        for (int i = 0; i < itinerario.getHorario().size(); i++) {
            modeloTablaHorario.addRow(new Object[]{itinerario.getHorario().get(i).getDia(),itinerario.getHorario().get(i).getHora()});
        }
        tblHorario.setModel(modeloTablaHorario);

    }    
}
