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

    public TextoController(TextoFrame texto) {
        this.texto = texto;
        file = new JFileChooser();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "archivo1":
                FileReader fr;
                String contenido = "";
                file.showOpenDialog(texto);
                texto.getTxtRuta1().setText(file.getSelectedFile().toString());
                String saltoLinea = "\n";
                try{
                    BufferedReader br = new BufferedReader(new FileReader(file.getSelectedFile()));
                    
                    String linea;

                        
                    while((linea = br.readLine())!= null){
                        contenido = contenido + linea + saltoLinea;
                    }

                }catch(IOException ex){
                    
                }finally{
                    
                }
                
                texto.setEditorTexto(contenido);
                break;

            case "archivo2":
                file.showOpenDialog(texto);
                texto.getTxtRuta2().setText(file.getSelectedFile().toString());
                break;
        }

    }

}
