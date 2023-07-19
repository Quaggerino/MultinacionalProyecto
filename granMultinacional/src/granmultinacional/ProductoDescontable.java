/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granmultinacional;

/**
 *
 * poo2201
 */
public interface ProductoDescontable {
    // descuento 13%
    double porcentajeDescuento = 0.13;

    //método calcular descuento
    public int calcularDescuento(String horario);
}
