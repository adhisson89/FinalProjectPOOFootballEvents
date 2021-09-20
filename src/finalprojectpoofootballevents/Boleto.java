/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpoofootballevents;

import java.io.Serializable;

/**
 *
 * @author Daniela Roman
 */
public class Boleto implements Serializable{

    private int numeroBoleto;
    private double precio;

    public Boleto(int numeroBoleto, int edad) {
        this.numeroBoleto = numeroBoleto;

        if (edad < 18) {
            this.precio = 5;
        } else {
            this.precio = 10;
        }
    }

}
