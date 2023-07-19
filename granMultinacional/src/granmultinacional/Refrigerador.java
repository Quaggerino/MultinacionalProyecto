/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granmultinacional;

/**
 *
 * poo2201
 */
public class Refrigerador extends Electrodomestico {
    //atributos
    private int cantidadPies;

    //constructor
    public Refrigerador(int cantidadPies, String marca, String codigo, int precioBase, int stock) {
        super(marca, codigo, precioBase, stock);
        setCantidadPies(cantidadPies);
    }

    //accesadores y mutadores
    public int getCantidadPies() {
        return cantidadPies;
    }

    public void setCantidadPies(int cantidadPies) {
        this.cantidadPies = cantidadPies;
    }

    //mostrar atributos
    public void imprimir() {
        super.imprimir();
        System.out.println("Cantidad de Pies:" + this.cantidadPies);
    }

    //calcular descuento
    public int calcularDescuento(String horario) {
        int descuento = 0;
        if (horario.equals("nocturno") && super.marca.equals("Acme") && this.cantidadPies == 15) {
            descuento = (int) (super.precioBase * porcentajeDescuento);
        }
        return descuento;
    }
}
