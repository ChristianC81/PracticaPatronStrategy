/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapatronstrategy;

/**
 *
 * @author chris
 */
public class SistemaPago {
     private MetodoPago metodoPago;
    
    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    public void procesarPago(double monto) {
        if (metodoPago.validarPago()) {
            metodoPago.realizarPago(monto);
        } else {
            System.out.println("El pago no pudo ser validado.");
        }
    }
}
