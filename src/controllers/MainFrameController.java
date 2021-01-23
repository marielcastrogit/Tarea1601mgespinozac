package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import views.*;

public class MainFrameController implements ActionListener {

    private MainFrame frame;
    private TextoFrame textoFrame;
    private DepartamentoFrame depaFrame;
    private CineFrame cineFrame;

    public MainFrameController(MainFrame frame) {
        this.frame = frame;
        textoFrame = new TextoFrame();
        depaFrame = new DepartamentoFrame();
        cineFrame = new CineFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Fusionar contenido archivos":
                mostrarFormularioInterno(textoFrame, false, true);
                break;
            case "Departamento Municipio":
                mostrarFormularioInterno(depaFrame, false, true);
                break;
            case "Cine":
                mostrarFormularioInterno(cineFrame, false, true);
                break;
        }

    }

    private void mostrarFormularioInterno(JInternalFrame internal, boolean maximizable, boolean centrado) {
        frame.getDesktop().add(internal);
        internal.setVisible(true);
        if (maximizable) {
            frame.getDesktop().getDesktopManager().maximizeFrame(internal);
        }
        if ((!maximizable) && centrado) {
            internal.setLocation((frame.getDesktop().getWidth() - internal.getWidth()) / 2,
                    (frame.getDesktop().getHeight() - internal.getHeight()) / 2);
        }
    }

}
