/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapatronstrategy.strategies;

import practicapatronstrategy.MetodoPago;

/**
 *
 * @author chris
 */
public class TransferenciaBancaria implements MetodoPago{
    
    @Override
    public void realizarPago(double monto) {
        // Lógica específica para realizar el pago con transferencia bancaria
        System.out.println("Pago realizado con transferencia bancaria: $" + monto);
    }
    
    @Override
    public boolean validarPago() {
        // Lógica específica para validar el pago con transferencia bancaria
        return true;
    }
}
