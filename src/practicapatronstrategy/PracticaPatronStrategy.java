/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapatronstrategy;

import practicapatronstrategy.strategies.PayPal;
import practicapatronstrategy.strategies.TransferenciaBancaria;
import practicapatronstrategy.strategies.TarjetaCredito;

/**
 *
 * @author chris
 */
public class PracticaPatronStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaPago sistemaPago = new SistemaPago();
        
        // Utilizando el método de pago TarjetaCredito
        MetodoPago tarjetaCredito = new TarjetaCredito();
        sistemaPago.setMetodoPago(tarjetaCredito);
        sistemaPago.procesarPago(100.0);
        
        // Utilizando el método de pago PayPal
        MetodoPago payPal = new PayPal();
        sistemaPago.setMetodoPago(payPal);
        sistemaPago.procesarPago(50.0);
        
        // Utilizando el método de pago TransferenciaBancaria
        MetodoPago transferenciaBancaria = new TransferenciaBancaria();
        sistemaPago.setMetodoPago(transferenciaBancaria);
        sistemaPago.procesarPago(200.0);
    }
    
}
