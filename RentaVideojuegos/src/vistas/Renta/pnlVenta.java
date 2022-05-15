/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Renta;

import entyties.Persona;
import entyties.Juegos;
import entyties.Venta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vistas.frmPrincipal;

/**
 *
 * @author jorge
 */
public class pnlVenta extends javax.swing.JPanel {

    private int filaSelSmart = -1;
    private int filaSelVta = -1;
    
    private List<Venta> ventaTmp = new ArrayList();
    /**
     * Creates new form Venta
     */
    public pnlVenta() {
        initComponents();
        llenarCombos();
        llenarTabla();
    }
    
    
    public void llenarTabla(){
        
        DefaultTableModel modelo = (DefaultTableModel) tblVenta.getModel();
        
        modelo.setRowCount(0); //Limpiar las filas de la tabla
        
        for(Juegos _jue : frmPrincipal._historialVentas.getJuegos()) {
            
            modelo.addRow(new Object[]{ 
                                        _jue.getNombre(),
                                        _jue.getStock(),
                                        _jue.getPrecioRenta(),
                                        _jue.getPrecioCompra()
                                        });
            
        }
        
        tblVenta.setModel(modelo);
        
    }
    
    
    public void llenarCombos(){
        
        cboComprador.removeAllItems();
        if(frmPrincipal._historialVentas.getCompradores().size() > 0){

            for(Persona comprador : frmPrincipal._historialVentas.getCompradores()){
                cboComprador.addItem(comprador.getNombre());
            }

            cboComprador.setSelectedIndex(0);
        }
        
        cboVendedor.removeAllItems();
        if(frmPrincipal._historialVentas.getVendedores().size() > 0){

            for(Persona vendedor : frmPrincipal._historialVentas.getVendedores()){
                cboVendedor.addItem(vendedor.getNombre());
            }

            cboVendedor.setSelectedIndex(0);
        }
        
        
    }
    
    
    private void vaciarCampos(boolean cancelar){
        txtFecha.setText("");
        lblTotalVenta.setText("0.0");
        
        cboComprador.setSelectedIndex(0);
        cboVendedor.setSelectedIndex(0);
        cboCredito.setSelectedIndex(0);
        
        DefaultTableModel modeloVta = (DefaultTableModel) tblVenta.getModel();
        if(cancelar){//Devolver el stock
            
            
            if(modeloVta.getRowCount() > 0){
                for(int i=0; i<modeloVta.getRowCount(); i++){
                    int cantidad =  (int) modeloVta.getValueAt(i, 1); // Cantidad
                    int codigo = (int) modeloVta.getValueAt(i, 4);
                    
                    
                    int stockActual = frmPrincipal._historialVentas.getJuegos().get(codigo).getStock();
                    stockActual = stockActual + cantidad;
                    
                    frmPrincipal._historialVentas.getJuegos().get(codigo).setStock(stockActual);
                    
                    
                }
            }            
            
        }
        modeloVta.setRowCount(0);
        tblVenta.setModel(modeloVta);
        llenarTabla();
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
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        cboComprador = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboVendedor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboCredito = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lblTotalVenta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSmartphones = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        btnAddVenta = new javax.swing.JButton();
        btnRemoveVenta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVA VENTA");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de Venta:");

        txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Comprador:");

        cboComprador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCompradorActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vendedor:");

        cboVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Compra a credito?");

        cboCredito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total:");

        lblTotalVenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotalVenta.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalVenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalVenta.setText("0.0");

        tblSmartphones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Stock", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSmartphones.setColumnSelectionAllowed(true);
        tblSmartphones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSmartphones.getTableHeader().setReorderingAllowed(false);
        tblSmartphones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSmartphonesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSmartphones);
        tblSmartphones.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblSmartphones.getColumnModel().getColumnCount() > 0) {
            tblSmartphones.getColumnModel().getColumn(0).setResizable(false);
            tblSmartphones.getColumnModel().getColumn(1).setResizable(false);
            tblSmartphones.getColumnModel().getColumn(2).setResizable(false);
        }

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio Unitario", "Total", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVenta.setColumnSelectionAllowed(true);
        tblVenta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblVenta.getTableHeader().setReorderingAllowed(false);
        tblVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVentaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblVenta);
        tblVenta.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblVenta.getColumnModel().getColumnCount() > 0) {
            tblVenta.getColumnModel().getColumn(0).setResizable(false);
            tblVenta.getColumnModel().getColumn(1).setResizable(false);
            tblVenta.getColumnModel().getColumn(2).setResizable(false);
            tblVenta.getColumnModel().getColumn(3).setResizable(false);
            tblVenta.getColumnModel().getColumn(4).setResizable(false);
        }

        btnAddVenta.setText(">>");
        btnAddVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVentaActionPerformed(evt);
            }
        });

        btnRemoveVenta.setText("<<");
        btnRemoveVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveVentaActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVenta.setBackground(new java.awt.Color(0, 102, 153));
        btnVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnVenta.setText("Vender");
        btnVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnVenta.setPreferredSize(new java.awt.Dimension(100, 40));
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("dd/MM/yyyy   =  25/12/2020");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cboVendedor, 0, 209, Short.MAX_VALUE)
                                        .addComponent(txtFecha)
                                        .addComponent(cboComprador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAddVenta, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRemoveVenta, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lblTotalVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cboComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(btnAddVenta)
                        .addGap(65, 65, 65)
                        .addComponent(btnRemoveVenta)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblSmartphonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSmartphonesMouseClicked
        filaSelSmart = tblSmartphones.getSelectedRow();
    }//GEN-LAST:event_tblSmartphonesMouseClicked

    private void btnAddVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVentaActionPerformed
       if(filaSelSmart == -1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar un smartphone.");
       }else{
           //Principal.ventaImpl.getCelulares() <- Catalogo de celulare
           
           int stockActual = frmPrincipal._historialVentas.getJuegos().get(filaSelSmart).getStock();
           String nombreCel = frmPrincipal._historialVentas.getJuegos().get(filaSelSmart).getNombre();
           
           if(stockActual >= 1){
             double totalVta = Double.valueOf(lblTotalVenta.getText());
               
               
             frmPrincipal._historialVentas.getJuegos().get(filaSelSmart).setStock(stockActual-1);
           
             DefaultTableModel modeloVta = (DefaultTableModel) tblVenta.getModel();
             
             int fila = -1;
             
             for(int i=0; i<modeloVta.getRowCount(); i++){
                 
                 String nombreVta = modeloVta.getValueAt(i, 0).toString();
                 if(nombreVta.equals(nombreCel)){
                     fila = i;
                     break;
                 }
                 
             }
             
             if(fila > -1){//Si encontró
                 
                int cantidad =  (int) modeloVta.getValueAt(fila, 1) + 1; // Cantidad
                double precio = (double) modeloVta.getValueAt(fila, 2);
                 
                modeloVta.setValueAt(cantidad, fila, 1);//Reemplazamos el valor de la cantidad
                modeloVta.setValueAt(cantidad*precio, fila, 3); 
                 
                 
             }else{//No encontro la fila creamos una nueva
                 
                 modeloVta.addRow(new Object[]{
                        nombreCel,
                        1,
                        frmPrincipal._historialVentas.getJuegos().get(filaSelSmart).getPrecioRenta(),
                        frmPrincipal._historialVentas.getJuegos().get(filaSelSmart).getPrecioRenta(),
                        filaSelSmart
                 });
                 
             }
             
             totalVta += frmPrincipal._historialVentas.getJuegos().get(filaSelSmart).getPrecioRenta();
             lblTotalVenta.setText(String.valueOf(totalVta));
             
             tblVenta.setModel(modeloVta);
             llenarTabla();
           }else{
               JOptionPane.showMessageDialog(this, "No tiene stock para ese modelo.");
           }
           
           
           
       }
    }//GEN-LAST:event_btnAddVentaActionPerformed

    private void btnRemoveVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveVentaActionPerformed
        if(filaSelVta == -1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar un smartphone en la tabla venta.");
       }else{
           
           int codigo =(int) tblVenta.getValueAt(filaSelVta, 4);
           int cantidad =(int) tblVenta.getValueAt(filaSelVta, 1);
           
           int stockActual = frmPrincipal._historialVentas.getJuegos().get(codigo).getStock();
           
           
           if(cantidad >= 1){
               
             double totalVta = Double.valueOf(lblTotalVenta.getText());
               
               
             frmPrincipal._historialVentas.getJuegos().get(codigo).setStock(stockActual+1);
           
             DefaultTableModel modeloVta = (DefaultTableModel) tblVenta.getModel();
             
                           
                double precio = (double) modeloVta.getValueAt(filaSelVta, 2);
                cantidad = cantidad -1;
                
                
                if(cantidad == 0){//Removemos la fila
                    modeloVta.removeRow(filaSelVta);
                }else{
                    
                    modeloVta.setValueAt(cantidad, filaSelVta, 1);//Reemplazamos el valor de la cantidad
                    modeloVta.setValueAt(cantidad*precio, filaSelVta, 3); 
                 
                    
                }
                
             totalVta -= frmPrincipal._historialVentas.getJuegos().get(codigo).getPrecioRenta();
             lblTotalVenta.setText(String.valueOf(totalVta));
             
             tblVenta.setModel(modeloVta);
             llenarTabla();
           }else{
               JOptionPane.showMessageDialog(this, "No tiene stock para ese modelo.");
           }
           
           
           
       }
    }//GEN-LAST:event_btnRemoveVentaActionPerformed

    private void tblVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentaMouseClicked
        filaSelVta = tblVenta.getSelectedRow();
    }//GEN-LAST:event_tblVentaMouseClicked

    private void cboCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCompradorActionPerformed
        int indice = cboComprador.getSelectedIndex();
        
        if(frmPrincipal._historialVentas.getCompradores().size() > 0 && indice > -1){
            Persona comprador = frmPrincipal._historialVentas.getCompradores().get(indice);

            
            
        }
    }//GEN-LAST:event_cboCompradorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      
        vaciarCampos(true);
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
       Venta vta = new Venta();
       
       vta.setFecha(txtFecha.getText());
       
       
       int indiceComprador = cboComprador.getSelectedIndex();
       vta.setComprador( frmPrincipal._historialVentas.getCompradores().get(indiceComprador) );
       
       int indiceVendedor = cboVendedor.getSelectedIndex();
       vta.setVendedor(frmPrincipal._historialVentas.getVendedores().get(indiceVendedor) );
       
       if(cboCredito.getSelectedIndex()> 0){
            vta.setRenta(true);
       }
       
       vta.setTotal(Double.valueOf(lblTotalVenta.getText()) );
       
       List<Juegos> venJuego = new ArrayList();
       
        DefaultTableModel modeloVta = (DefaultTableModel) tblVenta.getModel();
       
        if(modeloVta.getRowCount() > 0){
                for(int i=0; i<modeloVta.getRowCount(); i++){
                    int cantidad = (int) modeloVta.getValueAt(i, 1); // Cantidad
                    int codigo = (int) modeloVta.getValueAt(i, 4);
                    String nombre = (String) modeloVta.getValueAt(i, 0);
                    
                    Juegos juegoVen = new Juegos();
                    juegoVen.setStock(cantidad);  
                    juegoVen.setNombre(nombre);
                    venJuego.add(juegoVen);
                }
        }            
            
        
       vta.setProducto(venJuego);
       
       frmPrincipal._historialVentas.registrarVenta(vta);
       
       JOptionPane.showMessageDialog(this, "Se registro la venta correctamente");
       
        vaciarCampos(false);
       
       
    }//GEN-LAST:event_btnVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVenta;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRemoveVenta;
    private javax.swing.JButton btnVenta;
    private javax.swing.JComboBox<String> cboComprador;
    private javax.swing.JComboBox<String> cboCredito;
    private javax.swing.JComboBox<String> cboVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JTable tblSmartphones;
    private javax.swing.JTable tblVenta;
    private javax.swing.JFormattedTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
