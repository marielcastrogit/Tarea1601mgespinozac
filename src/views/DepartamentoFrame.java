
package views;

import controllers.DepaFrameController;
import javax.swing.*;

public class DepartamentoFrame extends javax.swing.JInternalFrame {

    public DepartamentoFrame() {
        initComponents();
        setItemListaDepa();
        setControllers();
        listaDepartamentos.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listaDepartamentos = new javax.swing.JComboBox<>();
        listaMunicipios = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("DepartamentoMunicipioFrame");

        jLabel1.setText("Departamento");

        jLabel2.setText("Municipio");

        listaDepartamentos.setActionCommand("Depa");

        listaMunicipios.setActionCommand("Municipios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaMunicipios, 0, 185, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(listaDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setItemListaDepa() {
        departamentos = new String[]{"Masaya", "Managua", "Boaco", "Carazo", "Chinandega", "Chontales",
            "Estelí", "Granada", "Jinotega", "León", "Madriz", "Matagalpa",
            "Nueva Segovia", "Río San Juan", "Rivas"};

        listaDepartamentos.setModel(new javax.swing.DefaultComboBoxModel<>(departamentos));

    }

    private void setControllers() {
        dfc = new DepaFrameController(this);
        listaMunicipios.addActionListener(dfc);
        listaDepartamentos.addActionListener(dfc);
    }

    public String getDepaSeleccionado() {
        return listaDepartamentos.getSelectedItem().toString();
    }

    public JComboBox getListaMunicipios() {
        return listaMunicipios;
    }

    public JComboBox<String> getListaDepa() {
        return listaDepartamentos;
    }

    private DepaFrameController dfc;
    private String[] departamentos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> listaDepartamentos;
    private javax.swing.JComboBox<String> listaMunicipios;
    // End of variables declaration//GEN-END:variables
}
