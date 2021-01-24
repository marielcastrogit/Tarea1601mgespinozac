/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import views.ConvertidorMonedaFrame;

/**
 *
 * @author Usuario
 */
public class ConvertidorController implements ItemListener {

    private ConvertidorMonedaFrame convertidor;
    private double montoMonedasTengo, montoMonedasDeseo;
    private String monedasTengo, monedasDeseo;
    private Date fecha;
    private SimpleDateFormat sdf;
    private String fechaActual;

    public ConvertidorController(ConvertidorMonedaFrame convertidor) {
        this.convertidor = convertidor;
        montoMonedasTengo = 0;
        montoMonedasDeseo = 0;
        fecha = new Date();
        sdf = new SimpleDateFormat("dd/MM/YYYY");
        fechaActual = sdf.format(fecha);
        convertidor.getLblFecha().setText(fechaActual);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object origen = e.getSource();

        if (origen == convertidor.getLista1Monedas()) {
            monedasTengo = convertidor.getLista1Monedas().getSelectedItem().toString();
        }

        if (origen == convertidor.getLista2Monedas()) {
            monedasDeseo = convertidor.getLista2Monedas().getSelectedItem().toString();
        }
        /*
        Si las listas no estan vacias entonces que haga la conversion
         */
        if (!((convertidor.getLista1Monedas().getSelectedItem() == null) && (convertidor.getLista2Monedas().getSelectedItem() == null))) {
            convertirMoneda(monedasTengo, monedasDeseo);

        }

    }

    private void convertirMoneda(String montoTengo, String montoDeseado) {
        if (!(montoTengo.equals(montoDeseado))) {
            switch (montoTengo) {
                case "Córdobas":
                    switch (montoDeseado) {
                        case "Dólares":

                            break;
                        case "Euros":
                            break;
                    }
                    break;
                case "Dólares":
                    switch (montoDeseado) {
                        case "Córdobas":
                            Double cambio = valorDiaDolar() * Double.valueOf(montoTengo);
                            break;
                        case "Euros":
                            break;
                    }
                    break;
                case "Euros":
                    switch (montoDeseado) {
                        case "Córdobas":
                            break;
                        case "Dólares":
                            break;
                    }
                    break;
            }
        } else {
            /*
            Pondre la misma cantidad en ambos lados
             */
        }
    }

    private double valorDiaDolar() {
        if (fechaActual.equals("24/1/2021")) {
            return 34.87;
        }

        return 34.87;
    }

    private void valorDiaEuro() {

    }

    private void valorDiaCordoba() {

    }

}

    

