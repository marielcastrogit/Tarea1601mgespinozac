package controllers;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import views.ConvertirMoneda;

public class ConvertirMonedaController implements ItemListener {

    ConvertirMoneda convertidor;
    double montoMonedasTengo, montoMonedasDeseo;
    String monedasTengo, monedasDeseo;

    public ConvertirMonedaController(ConvertirMoneda convertidor) {
        this.convertidor = convertidor;
        montoMonedasTengo = 0;
        montoMonedasDeseo = 0;
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
        if(!((convertidor.getLista1Monedas().getSelectedItem()==null) && (convertidor.getLista2Monedas().getSelectedItem() == null))){
            convertirMoneda(monedasTengo, monedasDeseo);
            
        }

    }
    
    private void convertirMoneda(String montoTengo, String montoDeseado){
        if(!(montoTengo.equals(montoDeseado))){
        switch(montoTengo){
            case "Córdobas":
                switch(montoDeseado){
                    case "Dólares":
                        break;
                    case "Euros":
                        break;
                }
                break;
            case "Dólares":
                break;
            case "Euros":
                break;
        }
        }else{
            /*
            Pondre la misma cantidad en ambos lados
            */
        }
    }
    
    private void valorDiaDolar(){
        
    }
    
    private void valorDiaEuro(){
        
    }
    
    private void valorDiaCordoba(){
        
    }
    

}
