/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granmultinacional;

/**
 *
 * poo2201
 */
public abstract class Producto {
    //atributos
    protected String codigo;
    protected int precioBase, stock;

    //constructor
    public Producto(String codigo, int precioBase, int stock) {
        setCodigo(codigo);
        setPrecioBase(precioBase);
        setStock(stock);
    }

    //accesadores y mutadores
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        if (precioBase > 0) {
            this.precioBase = precioBase;
        } else {
            System.out.println("EL PRECIO BASE DEBE SER MAYOR A 0");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;;
        } else {
            System.out.println("EL STOCK DEBE SER MAYOR IGUAL A 0");
        }

    }

    //método abstracto
    public abstract int calcularTotal(int cantidad, String horario);

    //validar stock
    public boolean validar(int cantidad) {
        boolean valida = false;
        if (cantidad <= this.stock) {
            valida = true;
        } else {
            System.out.println("NO HAY STOCK DEL PRODUCTO");
        }
        return valida;
    }

    //mostrar atributos
    public void imprimir() {
        System.out.println("Código:" + this.codigo);
        System.out.println("Precio Base:" + this.precioBase);
        System.out.println("Stock:" + this.stock);
    }
}
