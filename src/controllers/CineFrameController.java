package controllers;

import java.awt.event.*;
import javax.swing.*;
import views.CineFrame;

public class CineFrameController implements KeyListener, ActionListener, ItemListener {

    private final CineFrame cine;

    public CineFrameController(CineFrame cine) {
        this.cine = cine;
    }

    @Override
    public void keyPressed(KeyEvent e) {
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
    public void keyReleased(KeyEvent e) {
        if ((e.getSource() == cine.getTxtBoletosAdultos()) || (e.getSource() == cine.getTxtBoletosNiños())) {
            calcularTotal();
        }

        if (e.getSource() == cine.getTxtTotalPagado()) {
            calcularCambio();
        }
    }

    private void calcularTotal() {

        try {
            int numBoletosAdulto = Integer.parseInt(cine.getTxtBoletosAdultos().getText());
            int numBoletosNiño = Integer.parseInt(cine.getTxtBoletosNiños().getText());

            int precioBoletoAdulto = Integer.parseInt(cine.getLblPrecioAdultos().getText());
            int precioBoletoNiño = Integer.parseInt(cine.getLblPrecioNiños().getText());

            int totalPagar = (numBoletosAdulto * precioBoletoAdulto) + (numBoletosNiño * precioBoletoNiño);

            cine.getLblTotalPagar().setText(String.valueOf(totalPagar));

        } catch (NumberFormatException ex) {

        }
    }

    private void calcularCambio() {
        if (!cine.getLblTotalPagar().getText().isEmpty()) {
            try {
                int totalPagado = Integer.parseInt(cine.getTxtTotalPagado().getText());
                int totalPagar = Integer.parseInt(cine.getLblTotalPagar().getText());
                if (totalPagado > totalPagar) {
                    cine.getLblCambio().setText(String.valueOf((totalPagado - totalPagar)));
                }

                if (totalPagado == totalPagar) {
                    cine.getLblCambio().setText("0");
                }

                if (totalPagado < totalPagar) {
                    cine.getLblCambio().setText("No cubre el monto");
                }
            } catch (NumberFormatException ex) {

            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        String btnSeleccionado = ((AbstractButton) e.getItemSelectable()).getActionCommand();

        String pelicula = cine.getListaPeliculas().getSelectedItem().toString();

        if (pelicula.equals("Star Wars - El ascenso de Skywalker")) {
            if (btnSeleccionado.equals("2D")) {
                cine.getLblPrecioAdultos().setText("140");
                cine.getLblPrecioNiños().setText("120");
                if (!cine.getLblTotalPagar().getText().isEmpty()) {
                    calcularTotal();
                    calcularCambio();
                }
            }
            if (btnSeleccionado.equals("3D")) {
                cine.getLblPrecioAdultos().setText("180");
                cine.getLblPrecioNiños().setText("150");
                if (!cine.getLblTotalPagar().getText().isEmpty()) {
                    calcularTotal();
                    calcularCambio();
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cine.getListaPeliculas()) {

            if (!(cine.getListaPeliculas().getSelectedItem().toString().equals("Star Wars - El ascenso de Skywalker"))) {
                cine.getBtnGrupoSala().setSelected(cine.getRbt2D().getModel(), true);
                cine.getRbt3D().setEnabled(false);
                cine.getLblPrecioAdultos().setText("140");
                cine.getLblPrecioNiños().setText("120");
                cine.getTxtBoletosAdultos().setText("");
                cine.getTxtCantidadBoletosNiños().setText("");
                cine.getLblCambio().setText("");
                cine.getLblTotalPagar().setText("");
                cine.getLblCambio().setText("");
                cine.getTxtTotalPagado().setText("");
            } else {
                cine.getRbt2D().setEnabled(true);
                cine.getRbt3D().setEnabled(true);

            }
        }
    }

}
