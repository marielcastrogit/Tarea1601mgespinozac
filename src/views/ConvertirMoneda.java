/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ConvertirMonedaController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class ConvertirMoneda extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConvertirMoneda
     */
    public ConvertirMoneda() {
        initComponents();
        setControllers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMonedasDeseo = new javax.swing.JLabel();
        lista1Monedas = new javax.swing.JComboBox<>();
        lista2Monedas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMontoTengo = new javax.swing.JTextField();
        txtMontoDeseado = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblMonedasTengo = new javax.swing.JLabel();

        lblMonedasDeseo.setText("Moneda que deseo");

        lista1Monedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Córdobas", "Dólares", "Euros" }));
        lista1Monedas.setSelectedIndex(-1);

        lista2Monedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Córdobas", "Dólares", "Euros" }));
        lista2Monedas.setSelectedIndex(-1);

        jLabel4.setText("Monto");

        jLabel5.setText("Monto");

        txtMontoDeseado.setEditable(false);

        btnConvertir.setText("Convertir");

        lblMonedasTengo.setText("Moneda que tengo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMontoTengo)
                    .addComponent(lblMonedasTengo)
                    .addComponent(lista1Monedas, 0, 144, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMonedasDeseo)
                    .addComponent(lista2Monedas, 0, 146, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(txtMontoDeseado))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonedasTengo)
                    .addComponent(lblMonedasDeseo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lista1Monedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lista2Monedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMontoTengo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoDeseado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConvertir)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setControllers(){
        lista1Monedas.addItemListener(cmc);
        lista2Monedas.addItemListener(cmc);
    }

    public JLabel getLblMonedasDeseo() {
        return lblMonedasDeseo;
    }

    public JButton getBtnConvertir() {
        return btnConvertir;
    }

    public JLabel getLblMonedasTengo() {
        return lblMonedasTengo;
    }

    public JComboBox<String> getLista1Monedas() {
        return lista1Monedas;
    }

    public JComboBox<String> getLista2Monedas() {
        return lista2Monedas;
    }

    public JTextField getTxtMontoDeseado() {
        return txtMontoDeseado;
    }

    public JTextField getTxtMontoTengo() {
        return txtMontoTengo;
    }
    
    
    
    private ConvertirMonedaController cmc;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblMonedasDeseo;
    private javax.swing.JLabel lblMonedasTengo;
    private javax.swing.JComboBox<String> lista1Monedas;
    private javax.swing.JComboBox<String> lista2Monedas;
    private javax.swing.JTextField txtMontoDeseado;
    private javax.swing.JTextField txtMontoTengo;
    // End of variables declaration//GEN-END:variables
}
