/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datePolicy.SampleDateVetoPolicy;
import datePolicy.SampleHighlightPolicy;
import com.github.lgooddatepicker.components.DatePickerSettings;
import exceptions.DAOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetonegocio.Horario;
import objetonegocio.Itinerario;
import objetonegocio.Queja;
import reglas_negocio.iNegocios;

/**
 *
 * @author paulb
 */
public class FrmPantallaRegistrarQueja extends javax.swing.JDialog {

    int y, x;
    private DefaultTableModel modeloTablaHoras;
    private static FrmPantallaRegistrarQueja instancia;
    private static Queja queja;
    private iNegocios iNegocios;

    /**
     * Creates new form FrmPantallaRegistrarQuejas
     */
    private FrmPantallaRegistrarQueja(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modeloTablaHoras = (DefaultTableModel)this.tblHoras.getModel();
    }

    public static FrmPantallaRegistrarQueja getInstance(java.awt.Frame parent) {
        if (instancia == null) {
            instancia = new FrmPantallaRegistrarQueja(parent, true);
            queja = new Queja();
        }
        
        return instancia;
    }

    public void configuracionDatePicker() {
        int rowMultiplier = 4;
        int row = rowMultiplier;
        final LocalDate today = LocalDate.now();
        int pickerNumber = 0;

        // Note: Veto policies can only be set after constructing the date picker.
        DatePickerSettings dateSettings = pckDate.getSettings().copySettings();
        dateSettings.setAllowKeyboardEditing(false);
        pckDate.setSettings(dateSettings);

        //prueba forzada
        List<DayOfWeek> dias = Arrays.asList(DayOfWeek.FRIDAY, DayOfWeek.MONDAY);

        dateSettings.setHighlightPolicy(new SampleHighlightPolicy(dias));
        //dateSettings.setVetoPolicy(new SampleDateVetoPolicy(dias));
        dateSettings.setDateRangeLimits(today.minusDays(30), today.plusDays(0));
    }

    public void configuracionTimePicker() {
        int rowMultiplier = 4;
        int row = rowMultiplier;
        final LocalDate today = LocalDate.now();
        int pickerNumber = 0;

        // Note: Veto policies can only be set after constructing the date picker.
        DatePickerSettings dateSettings = pckDate.getSettings().copySettings();
        dateSettings.setAllowKeyboardEditing(false);
        pckDate.setSettings(dateSettings);

        //prueba forzada
        List<DayOfWeek> dias = Arrays.asList(DayOfWeek.FRIDAY, DayOfWeek.MONDAY);

        dateSettings.setHighlightPolicy(new SampleHighlightPolicy(dias));
        dateSettings.setVetoPolicy(new SampleDateVetoPolicy(dias));
        dateSettings.setDateRangeLimits(today.minusDays(30), today.plusDays(0));
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
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelCabecera = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pckDate = new com.github.lgooddatepicker.components.DatePicker();
        cmbItinerarios = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtGuia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoras = new javax.swing.JTable();
        btnGetDates = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(912, 570));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(23, 100, 191));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_32px_1.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quejas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

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
        jPanel2.add(labelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 60));

        jPanel3.setBackground(new java.awt.Color(49, 58, 73));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Guia");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        pckDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pckDateMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pckDateMouseClicked(evt);
            }
        });
        pckDate.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                pckDateInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel3.add(pckDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 230, 30));

        cmbItinerarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItinerariosItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbItinerarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 22, 230, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Itinerarios");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel9.setText("Fecha");
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtGuia.setEditable(false);
        txtGuia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel3.add(txtGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 220, -1));

        tblHoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHoras);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 170, 290));

        btnGetDates.setText("Consultar Horarios");
        btnGetDates.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGetDates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGetDatesMouseClicked(evt);
            }
        });
        jPanel3.add(btnGetDates, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 190, 220, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 440, 550));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        txtADescripcion.setColumns(20);
        txtADescripcion.setRows(5);
        txtADescripcion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(txtADescripcion);

        jLabel3.setText("Descripción de la queja");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel4.setText("Correo electrónico");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel5.setText("Num de teléfono");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel6.setText("Nombre (opcional)");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        txtNombreCompleto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jButton1.setText("Enviar queja");
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clkEnviarQueja(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 520, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(959, 614));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelCabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCabeceraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_labelCabeceraMouseDragged

    private void labelCabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCabeceraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_labelCabeceraMousePressed

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        instancia = null;
        dispose();
    }//GEN-LAST:event_jLabel7MouseReleased

    private void cmbItinerariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItinerariosItemStateChanged
        cargarListasDias();
        try {
            muestraGuia();
        } catch (DAOException ex) {
            muestraMensaje(ex.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbItinerariosItemStateChanged

    private void pckDateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pckDateMouseReleased
        System.out.println("first");
        cargarHoras();
        
    }//GEN-LAST:event_pckDateMouseReleased

    private void pckDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pckDateMouseClicked

    }//GEN-LAST:event_pckDateMouseClicked

    private void pckDateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_pckDateInputMethodTextChanged

    }//GEN-LAST:event_pckDateInputMethodTextChanged

    private void btnGetDatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGetDatesMouseClicked
        cargarHoras();
    }//GEN-LAST:event_btnGetDatesMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked


    }//GEN-LAST:event_jButton1MouseClicked

    private void clkEnviarQueja(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clkEnviarQueja
        // TODO add your handling code here:
        
        LocalDate fecha = pckDate.getDate();
        if(fecha == null){
            muestraMensaje("Error: La fecha no puede estar vacia", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Date date = Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
        
        int fila = tblHoras.getSelectedRow();
        if(fila == -1){
            muestraMensaje("Error: Debe de seleccionar una hora", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        List<String> hora = Arrays.asList(tblHoras.getValueAt(fila, 0).toString().split(":"));
       
        
        date.setHours(Integer.parseInt(hora.get(0)));
        date.setMinutes(Integer.parseInt(hora.get(1)));

        
        this.queja.setCorreo(txtEmail.getText());
        this.queja.setDescripcion(txtADescripcion.getText());
        this.queja.setTelefono(txtPhone.getText());
        this.queja.setFecha(date);
        this.queja.setItinerario(((Itinerario)cmbItinerarios.getSelectedItem()));
        this.queja.setNombreCompleto(txtNombreCompleto.getText());
        
        try {
            queja.validar();
            iNegocios.guardarQueja(queja);
            muestraMensaje("Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DAOException ex) {
            muestraMensaje(ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_clkEnviarQueja

    
    public void muestraMensaje(String message, int mode){
        JOptionPane.showMessageDialog(this, message,"Mensaje",mode);
    }
    
    
    
    private void cargarListasDias() {
        int rowMultiplier = 4;
        int row = rowMultiplier;
        final LocalDate today = LocalDate.now();
        int pickerNumber = 0;

        Itinerario itinerarioSeleccionado = ((Itinerario) cmbItinerarios.getSelectedItem());
        List<DayOfWeek> dias = transformarDias(itinerarioSeleccionado);
        
        // Note: Veto policies can only be set after constructing the date picker.
        DatePickerSettings dateSettings = pckDate.getSettings().copySettings();
        dateSettings.setAllowKeyboardEditing(false);
        pckDate.setSettings(dateSettings);

        //prueba forzada
        //List<DayOfWeek> dias = Arrays.asList(DayOfWeek.FRIDAY, DayOfWeek.MONDAY);
        dateSettings.setHighlightPolicy(new SampleHighlightPolicy(dias));
        dateSettings.setVetoPolicy(new SampleDateVetoPolicy(dias));
        dateSettings.setDateRangeLimits(today.minusDays(30), today.plusDays(0));
        cargarHoras();
    }

    private List<DayOfWeek> transformarDias(Itinerario itinerarioSeleccionado){
        List<DayOfWeek> dias = new LinkedList<>();
        for (Horario horario : itinerarioSeleccionado.getHorario()) {
            switch (horario.getDia()) {
                case MARTES:
                    dias.add(DayOfWeek.TUESDAY);
                    break;
                case MIERCOLES:
                    dias.add(DayOfWeek.WEDNESDAY);
                    break;
                case JUEVES:
                    dias.add(DayOfWeek.THURSDAY);
                    break;
                case VIERNES:
                    dias.add(DayOfWeek.FRIDAY);
                    break;
                case SABADO:
                    dias.add(DayOfWeek.SATURDAY);
                    break;
                default:
                    break;
            }
        }
        return dias;
    }
    
    private void cargarHoras() {
        modeloTablaHoras.setRowCount(0);
        
        LocalDate date = pckDate.getDate();
        if (date == null) {
            return;
        }
        DayOfWeek diaSeleccinado = date.getDayOfWeek();
        
        Itinerario itinerarioSeleccionado = ((Itinerario) cmbItinerarios.getSelectedItem());
        
        List<DayOfWeek> dias = transformarDias(itinerarioSeleccionado);
        List<Horario> horarios = itinerarioSeleccionado.getHorario();
            
        for (DayOfWeek dia1 : dias) {
            if (dia1 == diaSeleccinado) {
                for (Horario horario : horarios) {
                    DayOfWeek dia = null;
                    switch(horario.getDia()){
                        case MARTES: dia = DayOfWeek.TUESDAY;break;
                        case MIERCOLES: dia = DayOfWeek.WEDNESDAY;break;
                        case JUEVES: dia = DayOfWeek.THURSDAY;break;
                        case VIERNES: dia = DayOfWeek.FRIDAY;break;
                        case SABADO: dia = DayOfWeek.SATURDAY;break;
                        case DOMINGO: dia = DayOfWeek.SUNDAY;break;
                        default:break;
                    }
                    if (dia == dia1) {
                        List<String> horas = horario.getHora();
                        for (String hora : horas) {
                            modeloTablaHoras.addRow(new Object[]{hora});
                        }
                    }
                }
            }
        }
        
        
        
    }

    

    public void muestraGuia() throws DAOException {
        txtGuia.setText(iNegocios.buscarGuia(((Itinerario) cmbItinerarios.getSelectedItem()).getGuia()).getNombre());
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
            if (datos.get(i).get(0).getClass() == Itinerario.class) {
                datos.get(i).forEach(itinerario -> {
                    this.cmbItinerarios.addItem((Itinerario) itinerario);
                });
            }
            /*
            if (datos.get(i).get(0).getClass() == Cuidador.class) {
                for (Object cuidador : (((List) datos.get(i)))) {
                    this.cmbCuidador.addItem((Cuidador) cuidador);
                }
            }
            
        }*/
            //configuracionDatePicker();
            this.setVisible(true);
            this.setLocationRelativeTo(null);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetDates;
    private javax.swing.JComboBox<Itinerario> cmbItinerarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCabecera;
    private com.github.lgooddatepicker.components.DatePicker pckDate;
    private javax.swing.JTable tblHoras;
    private javax.swing.JTextArea txtADescripcion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGuia;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

}
