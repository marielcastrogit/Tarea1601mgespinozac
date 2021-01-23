package controllers;

import java.awt.event.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import views.DepartamentoFrame;

public class DepaFrameController implements ActionListener {

    DepartamentoFrame depa;

    public DepaFrameController(DepartamentoFrame depa) {
        this.depa = depa;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Depa")) {
            setItemsMunicipio();
        }

        if (e.getSource() == depa.getListaMunicipios()) {
            mensaje();
        }

    }

    private void setItemsMunicipio() {
        switch (depa.getDepaSeleccionado()) {
            case "Masaya":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Catarina", "Masaya", "La Concepción", "Masatepe", "Nandasmo", "Nindirí", "Niquinohomo", "San Juan de Oriente", "Tisma"}));
                break;
            case "Boaco":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Boaco", "Camoapa", "San José de los Remates", "San Lorenzo", "Santa Lucía", "Teustepe"}));
                break;
            case "Carazo":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Jinotepe", "Diriamba", "Dolores", "El Rosario", "La Conquista", "La Paz", "San Marcos", "Santa Teresa"}));
                break;
            case "Chinandega":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Chinandega", "Chichigalpa", "Corinto", "El Realejo", "El Viejo", "Posoltega", "Puerto Morazán", "San Francisco del Norte", "San Juan de Cinco Pinos", "San Pedro del Norte", "Santo Tomás del Norte", "Somotillo", "Villanueva"}));
                break;
            case "Estelí":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Estelí", "Condega", "La Trinidad", "Pueblo Nuevo", "San Juan de Limay", "San Nicolás"}));
                break;
            case "Chontales":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Juigalpa", "Acoyapa", "Comalapa", "El Coral", "La Libertad", "San Francisco de Cuapa", "San Pedro de Lóvago", "Santo Domingo", "Santo Tomás", "Villa Sandino"}));
                break;
            case "Granada":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Granada", "Diriá", "Diriomo", "Nandaime"}));
                break;
            case "Jinotega":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Jinotega", "El Cuá", "La Concordia", "San José de Bocay", "San Rafael del Norte", "San Sebastián de Yalí", "Santa María de Pantasma", "Wiwilí", ""}));
                break;
            case "León":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"León", "Achuapa", "El Jicaral", "El Sauce", "La Paz Centro", "Larreynaga", "Nagarote", "Quezalguaque", "Santa Rosa del Peñón", "Telica"}));
                break;
            case "Madriz":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Somoto", "Las Sabanas", "Palacagüina", "San José de Cusmapa", "San Juan de Río Coco", "San Lucas", "Telpaneca", "Totogalpa", "Yalagüina"}));
                break;
            case "Managua":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Managua", "Ciudad Sandino", "El Crucero", "Mateare", "San Francisco Libre", "San Rafael del Sur", "Ticuantepe", "Tipitapa", "Villa Carlos Fonseca"}));
                break;
            case "Matagalpa":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Matagalpa", "Ciudad Darío", "El Tuma – La Dalia", "Esquipulas", "Matiguás", "Muy Muy", "Rancho Grande", "Río Blanco", "San Dionisio", "San Isidro", "San Ramón", "Sébaco", "Terrabona"}));
                break;
            case "Nueva Segovia":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Ocotal", "Ciudad Antigua", "Dipilto", "El Jícaro", "Jalapa", "Macuelizo", "Mozonte", "Murra", "Quilalí", "San Fernando", "Santa María", "Wiwilí"}));
                break;
            case "Río San Juan":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"San Carlos", "El Almendro", "El Castillo", "Morrito", "San Juan del Norte", "San Miguelito"}));
                break;
            case "Rivas":
                depa.getListaMunicipios().setModel(new DefaultComboBoxModel<>(new String[]{"Rivas", "Altagracia", "Belén", "Buenos Aires", "Cárdenas", "Moyogalpa", "Potosí", "San Jorge", "San Juan del Sur", "Tola"}));
                break;
        }
    }

    private void mensaje() {
        if ((depa.getListaDepa() != null) && (depa.getListaMunicipios() != null)) {
            JOptionPane.showMessageDialog(depa, "Has seleccionado " + depa.getListaDepa().getSelectedItem().toString() + ", "
                    + depa.getListaMunicipios().getSelectedItem().toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
