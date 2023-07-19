/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granmultinacional;

/**
 *
 * poo2201
 */
public abstract class Electrodomestico extends Producto implements ProductoDescontable {
    //atributos
    protected String marca;

    //constructor
    public Electrodomestico(String marca, String codigo, int precioBase, int stock) {
        super(codigo, precioBase, stock);
        setMarca(marca);
    }

    //accesadores y mutadores
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() >= 2) {
            this.marca = marca;
        } else {
            System.out.println("LA MARCA DEBE TENER MINIMO 2 CARACTERES");
        }
    }

    //calcular total
    public int calcularTotal(int cantidad, String horario) {
        int total = 0, descuentos = 0;
        if (super.validar(cantidad)) {
            descuentos = calcularDescuento(horario);
            total = (super.precioBase - descuentos) * cantidad;
            total = (int) (total + total * 0.19);
        }
        return total;
    }

    //mostrar atributos
    public void imprimir() {
        super.imprimir();
        System.out.println("Marca:" + this.marca);

    }
}
