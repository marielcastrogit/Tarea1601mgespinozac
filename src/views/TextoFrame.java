package views;

import javax.swing.JEditorPane;
import javax.swing.JTextField;

public class TextoFrame extends javax.swing.JInternalFrame {

    public TextoFrame() {
        initComponents();
        setControllers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRuta1 = new javax.swing.JTextField();
        btnArchivo1 = new javax.swing.JButton();
        txtRuta2 = new javax.swing.JTextField();
        btnArchivo2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        editorTexto = new javax.swing.JEditorPane();
        btnGuardar = new javax.swing.JButton();
        btnLimpiarRuta1 = new javax.swing.JButton();
        btnLimpiarRuta2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        btnArchivo1.setText("...");
        btnArchivo1.setActionCommand("archivo1");

        btnArchivo2.setText("...");
        btnArchivo2.setActionCommand("archivo2");

        jScrollPane1.setViewportView(editorTexto);

        btnGuardar.setForeground(new java.awt.Color(51, 51, 51));
        btnGuardar.setText("Guardar");

        btnLimpiarRuta1.setForeground(new java.awt.Color(153, 153, 153));
        btnLimpiarRuta1.setText("Limpiar");
        btnLimpiarRuta1.setActionCommand("Limpiar Ruta1");

        btnLimpiarRuta2.setForeground(new java.awt.Color(153, 153, 153));
        btnLimpiarRuta2.setText("Limpiar");
        btnLimpiarRuta2.setActionCommand("Limpiar Ruta2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRuta1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnArchivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRuta2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnArchivo2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnLimpiarRuta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarRuta2)
                        .addGap(101, 101, 101)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArchivo1)
                    .addComponent(btnArchivo2))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiarRuta1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarRuta2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setEditorTexto(String texto) {
        editorTexto.setText(texto);
    }
    
    public String getEditorTexto(){
        return editorTexto.getText();
    }
    
    private void setControllers(){
        tc = new controllers.TextoController(this);
        
        btnArchivo1.addActionListener(tc);
        btnArchivo2.addActionListener(tc);
        
        btnLimpiarRuta1.addActionListener(tc);
        btnLimpiarRuta2.addActionListener(tc);
        
        btnGuardar.addActionListener(tc);
    }

    public JTextField getTxtRuta1() {
        return txtRuta1;
    }

    public JTextField getTxtRuta2() {
        return txtRuta2;
    }
    
    public void limpiarRuta1(){
        txtRuta1.setText("");
    }
    
    public void limpiarRuta2(){
        txtRuta2.setText("");
    }
    
    public boolean ruta1Vacia(){
        if(txtRuta1.getText().equals("")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean ruta2Vacia(){
        if(txtRuta2.getText().equals("")){
            return true;
        }else{
            return false;
        }
    }
    
    
    

    private controllers.TextoController tc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivo1;
    private javax.swing.JButton btnArchivo2;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiarRuta1;
    private javax.swing.JButton btnLimpiarRuta2;
    private javax.swing.JEditorPane editorTexto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtRuta1;
    private javax.swing.JTextField txtRuta2;
    // End of variables declaration//GEN-END:variables
}
