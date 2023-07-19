/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granmultinacional;

/**
 *
 * poo2201
 */
public class Lavadora extends Electrodomestico {
    //atributos
    private char carga;

    //constructor
    public Lavadora(char carga, String marca, String codigo, int precioBase, int stock) {
        super(marca, codigo, precioBase, stock);
        setCarga(carga);
    }

    //accesadores y mutadores
    public char getCarga() {
        return carga;
    }

    public void setCarga(char carga) {
        if (carga == 'A' || carga == 'C') {
            this.carga = carga;
        } else {
            System.out.println("LA CARGA DEBE SER POR ARRIBA ('A') O EL COSTADO ('C')");
        }
    }

    //mostrar atributos
    public void imprimir() {
        super.imprimir();
        System.out.println("Carga:" + this.carga);
    }

    //calcular descuento
    public int calcularDescuento(String horario) {
        int descuento = 0;
        if (horario.equals("nocturno") && super.marca.equals("Zoni") && this.carga == 'A') {
            descuento = (int) (super.precioBase * 0.11);
        }
        return descuento;
    }
}
