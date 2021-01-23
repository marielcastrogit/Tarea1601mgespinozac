package controllers;

/*Esta es la clase que estara a cargo de controlar el TextoFrame, para 
Fusionar los textos.*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import views.TextoFrame;

public class TextoController implements ActionListener {

    private final TextoFrame texto;
    private JFileChooser file;
    private String contenidoFinal, contenido1, contenido2;

    public TextoController(TextoFrame texto) {
        this.texto = texto;
        file = new JFileChooser();
        contenidoFinal = "";
        contenido1 = "";
        contenido2 = "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "archivo1":
                if (texto.ruta1Vacia()) {

                    try {
                        file.showOpenDialog(texto);
                        texto.getTxtRuta1().setText(file.getSelectedFile().toString());
                        BufferedReader br = new BufferedReader(new FileReader(file.getSelectedFile()));

                        String linea;

                        while ((linea = br.readLine()) != null) {
                            contenido1 = contenido1 + linea + "\n";
                        }

                        contenidoFinal = contenido1 + contenido2;
                        texto.setEditorTexto(contenidoFinal);
                    } catch (IOException ex) {
                    }
                } else {
                    JOptionPane.showMessageDialog(texto, "El archivo ya ha sido seleccionado", " ", JOptionPane.INFORMATION_MESSAGE);
                }
                

                break;

            case "archivo2":
                if (texto.ruta2Vacia()) {

                    try {
                        file.showOpenDialog(texto);
                        texto.getTxtRuta2().setText(file.getSelectedFile().toString());
                        BufferedReader br = new BufferedReader(new FileReader(file.getSelectedFile()));

                        String linea;

                        while ((linea = br.readLine()) != null) {
                            contenido2 = contenido2 + linea + "\n";
                        }
                        contenidoFinal = contenido1 + contenido2;
                        texto.setEditorTexto(contenidoFinal);
                    } catch (IOException ex) {
                    }

                } else {
                    JOptionPane.showMessageDialog(texto, "El archivo ya ha sido seleccionado", " ", JOptionPane.INFORMATION_MESSAGE);
                }
                break;

            case "Limpiar Ruta1":
                texto.limpiarRuta1();
                contenido1 = "";
                texto.setEditorTexto(contenido2);
                break;
            case "Limpiar Ruta2":
                texto.limpiarRuta2();
                contenido2 = "";
                texto.setEditorTexto(contenido1);
                break;

        }

    }

}
