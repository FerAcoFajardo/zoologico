/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import exceptions.BusinessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetonegocio.Animal;
import objetonegocio.Especie;
import objetonegocio.Sexo;

/**
 *
 * @author fernando
 */
public class FrmEditarAnimales extends javax.swing.JDialog {

     private static FrmEditarAnimales instancia;
     private DefaultTableModel modeloTabla;
     private Especie especie;
     private javax.swing.JDialog parent;
    /**
     * Creates new form FrmEditarAnimales
     */
    private FrmEditarAnimales(javax.swing.JDialog parent, boolean modal, Especie especie) {
        super(parent, modal);
        this.parent = parent;
        initComponents();
        this.especie = especie;
        this.setLocationRelativeTo(null);
    }
    
    public static FrmEditarAnimales getInstance(javax.swing.JDialog parent, Especie especie) {
        if (instancia == null) {
            instancia = new FrmEditarAnimales(parent, true, especie);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spinEdad = new javax.swing.JSpinner();
        txtNombre = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimales = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        btnCerrarVentana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        tblAnimales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAnimales);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
        );

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clkBotonAgregarAnimal(evt);
            }
        });

        jLabel3.setText("Sexo");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clkBotonEliminarAnimal(evt);
            }
        });

        btnCerrarVentana.setText("Cerrar");
        btnCerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clkCerrarVentana(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spinEdad)
                            .addComponent(txtNombre)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addGap(40, 40, 40)
                            .addComponent(btnEliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCerrarVentana))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spinEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnEliminar)
                    .addComponent(btnCerrarVentana))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clkBotonAgregarAnimal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clkBotonAgregarAnimal
         try {
             // TODO add your handling code here:
             agregarAnimal();
         } catch (BusinessException ex) {
            muestaMsjError(ex.getMessage());
         }
        
    }//GEN-LAST:event_clkBotonAgregarAnimal

    private void clkBotonEliminarAnimal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clkBotonEliminarAnimal
         try {
             // TODO add your handling code here:
             verificaAnimalSeleccionado();
         } catch (BusinessException ex) {
             muestaMsjError(ex.getMessage());
         }
    }//GEN-LAST:event_clkBotonEliminarAnimal

    private void clkCerrarVentana(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clkCerrarVentana
        // TODO add your handling code here:
        List<Animal> listaAnimales = new ArrayList();
        instancia = null;
        for (int i = 0; i < tblAnimales.getRowCount(); i++) {
            String nombre = tblAnimales.getValueAt(i, 1).toString();
            int edad = Integer.parseInt(tblAnimales.getValueAt(i, 2).toString());
            Sexo sexo = (Sexo) tblAnimales.getValueAt(i, 3);
            Animal animal = new Animal(nombre, edad, especie, sexo);
            listaAnimales.add(animal);
        }
        especie.setAnimales(listaAnimales);
        ((FrmPantallaRegistroEspecie)super.getParent()).setEspecie(especie);
        ((FrmPantallaRegistroEspecie)super.getParent()).actualizarNumAnimales(listaAnimales.size());
        dispose();
    }//GEN-LAST:event_clkCerrarVentana

    
    public void verificaAnimalSeleccionado() throws BusinessException{
        int fila = tblAnimales.getSelectedRow();
        if(fila == -1){
            throw new BusinessException("Error: Debe de seleccionar un animal");
        }else{
            muestraMensajeConfirmacion(fila);
        }
    }
    
    public void muestraMensajeConfirmacion(int fila ){
        int opcion = JOptionPane.showConfirmDialog(this, "Desea confirmar la eliminación","Confirmación", JOptionPane.YES_NO_OPTION);
        if(opcion == 1){
            eliminarAnimal(fila);
        }
    }
    
    public void eliminarAnimal(int fila){
        this.tblAnimales.remove(fila);
    }
    
    public void agregarAnimal() throws BusinessException{
        Animal animal = new Animal();
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(spinEdad.getValue().toString());
        Sexo sexo = (Sexo) cmbSexo.getSelectedItem();
        
        animal.setEdad(edad);
        animal.setNombre(nombre);
        animal.setSexo(sexo);
        
        verificaExistencia(animal);
        
        animal.verificar();
        
        agregaAnimal(animal);
    }
    public void verificaExistencia(Animal animal) throws BusinessException{
        for (int i = 0; i < tblAnimales.getRowCount(); i++) {
            if(tblAnimales.getValueAt(i, 1) == animal.getNombre()){
                throw new BusinessException("Error: Este animal ya esta registrado");
            }
        }
    }

    public void despliegaInformacion(List<Animal> listaAnimales){
        
        this.cmbSexo.addItem(Sexo.HEMBRA);
        this.cmbSexo.addItem(Sexo.MACHO);
        
        if(!listaAnimales.isEmpty()){
            this.modeloTabla = (DefaultTableModel) this.tblAnimales.getModel();
        
        listaAnimales.forEach(animal -> {
            Object[] fila = new Object[3];
            
            fila[0] = animal.getNombre();
            fila[1] = animal.getEdad();
            fila[2] = animal.getSexo();
            modeloTabla.addRow(fila);
        });
        
        tblAnimales.setModel(modeloTabla);
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarVentana;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Sexo> cmbSexo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinEdad;
    private javax.swing.JTable tblAnimales;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void muestaMsjError(String message) {
        JOptionPane.showMessageDialog(this, message,"Error",JOptionPane.ERROR_MESSAGE);
    }

    private void agregaAnimal(Animal animal) {
        modeloTabla = (DefaultTableModel) this.tblAnimales.getModel();
        
        Object[] rowData = new Object[3];
        
        rowData[0] = animal.getNombre();
        rowData[1] = animal.getEdad();
        rowData[2] = animal.getSexo();
       
        modeloTabla.addRow(rowData);
        this.tblAnimales.setModel(modeloTabla);
    }
}