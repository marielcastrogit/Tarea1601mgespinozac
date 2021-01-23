package controllers;

import java.awt.event.*;
import javax.swing.AbstractButton;
import views.CineFrame;

public class CineFrameController implements KeyListener, ItemListener {

    private CineFrame cine;

    public CineFrameController(CineFrame cine) {
        this.cine = cine;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        /*
        Con get source obtengo el objeto en el cual 
        se origino el evento, getKeychar devuelve 
        la letra o el valor que se esta digitando
        
        El metodo consume lo que hace es ignorar 
        dichos eventos en caso de que el valor sea 
        menor que 0 o mayor que 9, es decir solo numeros
         */
        if ((e.getSource() == cine.getTxtBoletosAdultos()) || (e.getSource() == cine.getTxtBoletosNiños())) {
            char valorDigitado = e.getKeyChar();

            if (valorDigitado < '0' || valorDigitado > '9') {
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        String item = ((AbstractButton) e.getItemSelectable()).getActionCommand();
        
        
        String pelicula = cine.getListaPeliculas().getSelectedItem().toString();

        if (pelicula.equals("Star Wars - El ascenso de Skywalker")) {
            if (item.equals("2D")) {

                System.out.println("LISTA PELICULAS TERCER IF");
                cine.getLblPrecioAdultos().setText("140");
                cine.getLblPrecioNiños().setText("120");
            }
            if (cine.getRbt3D().isSelected()) {
                System.out.println("LISTA PELICULAS CUARTO IF");
                cine.getLblPrecioAdultos().setText("180");
                cine.getLblPrecioNiños().setText("150");
            }
        }
    }

}
