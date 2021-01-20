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

                file.showOpenDialog(texto);
                texto.getTxtRuta1().setText(file.getSelectedFile().toString());
                try {
                    BufferedReader br = new BufferedReader(new FileReader(file.getSelectedFile()));

                    String linea;

                    while ((linea = br.readLine()) != null) {
                        contenido1 = contenido1 + linea + "\n";
                    }
                    
                    contenidoFinal = contenido1 + contenido2;
                    texto.setEditorTexto(contenidoFinal);
                } catch (IOException ex) {
                }

                break;

            case "archivo2":
                file.showOpenDialog(texto);
                texto.getTxtRuta2().setText(file.getSelectedFile().toString());
                try {
                    BufferedReader br = new BufferedReader(new FileReader(file.getSelectedFile()));

                    String linea;

                    while ((linea = br.readLine()) != null) {
                        contenido2 = contenido2 + linea + "\n";
                    }
                    contenidoFinal = contenido1 + contenido2;
                    texto.setEditorTexto(contenidoFinal);
                } catch (IOException ex) {
                }
                break;
                
                
        }

    }

}
