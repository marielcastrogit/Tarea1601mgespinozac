package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.*;
import javax.swing.*;
import models.Persona;
import views.*;

public class PersonController implements ActionListener, KeyListener {

    private final PersonFrame persona;
    private int tecladoPulsaciones;
    private JFileChooser file;
    private Persona personaModelo;

    public PersonController(PersonFrame persona) {
        this.persona = persona;
        tecladoPulsaciones = 0;
        file = new JFileChooser();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Boton limpiar":
                persona.limpiar();
                break;
            case "Boton guardar":
                guardarPersona();
                break;
            case "Boton seleccionar":
                seleccionarPersona();
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == persona.getTxtNumCedula()) {

            if (persona.getTxtNumCedula().getText().equals("")) {
                tecladoPulsaciones = 0;
                System.out.println("Si esta vacio su valor es:" + tecladoPulsaciones + "\n");
            }

            tecladoPulsaciones++;//escribo algo y una pulsacion - borro algo y una pulsacion
            System.out.println("Valor inicial:" + tecladoPulsaciones);//pulsacion = 1 pulsacion = 2
            char digito = e.getKeyChar();//4borrar

            /*
            Si se presiona ENTER o se borra el digito entonces que 
            esa pulsacion del teclado no cuente.
             */
            int digitosCedula = persona.getTxtNumCedula().getText().length();
            if (digitosCedula < 13) {
                if (digito < '0' || digito > '9'
                        || digito == '\n' || digito == '\b' || digito == KeyEvent.VK_SPACE) {
                    e.consume();
                    tecladoPulsaciones--;
                    System.out.println("Valor si es una letra:" + tecladoPulsaciones + "\n");
                }
            }
            System.out.println("Valor final:" + tecladoPulsaciones + "\n");

            if (digitosCedula == 13) {
                String dia = persona.getTxtNumCedula().getText().substring(3, 5);
                String mes = persona.getTxtNumCedula().getText().substring(5, 7);
                String año = persona.getTxtNumCedula().getText().substring(7, 9);

                try {
                    int añoNacimiento = Integer.parseInt(año);

                    System.out.println(añoNacimiento);

                    if (añoNacimiento <= 04) {

                        if (añoNacimiento >= 0 && añoNacimiento <= 04) {

                            añoNacimiento += 2000;

                        } else {
                            añoNacimiento += 1900;
                        }
                        String fechaCumpleaños = String.valueOf(dia) + "-" + mes + "-" + año;

                        persona.getTxtFechaNacimiento().setText(fechaCumpleaños);

                        Calendar calendarioActual = Calendar.getInstance();

                        int añoActual = calendarioActual.get(Calendar.YEAR);

                        int edad = añoActual - añoNacimiento;

                        persona.getTxtEdad().setText(String.valueOf(edad));

                    } else {
                        JOptionPane.showMessageDialog(persona, "Esta persona no tiene 16 años por lo tanto la cedula no es valida", "", JOptionPane.INFORMATION_MESSAGE);
                        persona.getTxtFechaNacimiento().setText("");
                        persona.getTxtEdad().setText("");
                    }

                } catch (NumberFormatException ex) {
                }
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e
    ) {
    }

    @Override
    public void keyReleased(KeyEvent e
    ) {
    }

    private void guardarPersona() {
        file.showSaveDialog(persona);
        this.personaModelo = persona.getDatosPersona();
        File archivoGuardar = file.getSelectedFile();

        try {
            ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(archivoGuardar));
            ous.writeObject(personaModelo);
            ous.flush();
        } catch (IOException ex) {
        }

    }

    private void seleccionarPersona() {
        file.showOpenDialog(persona);
        File archivoAbrir = file.getSelectedFile();

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoAbrir));
            personaModelo = (Persona) ois.readObject();
            persona.setDatosPersona(personaModelo);
        } catch (IOException | ClassNotFoundException ex) {
        }

    }
}
