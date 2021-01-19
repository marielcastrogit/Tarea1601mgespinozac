
package controllers;

/*Esta es la clase que estara a cargo de controlar el TextoFrame, para 
Fusionar los textos.*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import views.TextoFrame;


public class TextoController implements ActionListener{
    private final TextoFrame texto;
    private String contenidoArchivo1, contenidoArchivo2, contenidoFinal;
    
    public TextoController(TextoFrame texto ){
        this.texto = texto;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "archivo1":
                contenidoArchivo1 = getArchivo();
                texto.getEditorTexto().setText(contenidoArchivo1);
                break;
            case "archivo2": 
                contenidoArchivo2 = getArchivo();
                texto.getEditorTexto().setText(contenidoArchivo1 + " " + contenidoArchivo2);
                break;
        }
        
        
    }
    
    private String getArchivo(){
        JFileChooser file;
        ObjectInputStream ois;
        
        try {
            file = new JFileChooser();
            File archivoGuardar = file.getSelectedFile();
            ois = new ObjectInputStream(new FileInputStream (archivoGuardar));
            return ois.readUTF();
        } catch (IOException ex) {}
        
        return "";
    }
}
    
