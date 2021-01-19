package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.MainFrame;
import views.TextoFrame;

public class MainFrameController implements ActionListener{
    private MainFrame frame;
    private TextoFrame textoFrame;
    
    public MainFrameController(MainFrame frame){
        this.frame = frame;
        textoFrame = new TextoFrame();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       switch(e.getActionCommand()){
           case "Fusionar contenido archivos":
               frame.getDesktop().add(textoFrame);
               textoFrame.setVisible(true);
               break;
       }
    }
    
}
