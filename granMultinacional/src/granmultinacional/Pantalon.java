/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granmultinacional;

/**
 *
 * poo2201
 */
public class Pantalon extends Producto {
    //atributos
    private String tipo;
    private char sexo;

    //constructor
    public Pantalon(String tipo, char sexo, String codigo, int precioBase, int stock) {
        super(codigo, precioBase, stock);
        setTipo(tipo);
        setSexo(sexo);
    }

    //accesadores y mutadores
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'H') {
            this.sexo = sexo;
        } else {
            System.out.println("EL SEXO DEBE SER MUJER ('M') ó HOMBRE('H')");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("jeans") || tipo.equalsIgnoreCase("cotele") || tipo.equalsIgnoreCase("tela")) {
            this.tipo = tipo;
        } else {
            System.out.println("EL TIPO DEBE SER jeans, cotele o tela");
        }
    }

    //calcular total
    public int calcularTotal(int cantidad, String horario) {
        int total = 0;
        if (super.validar(cantidad)) {
            total = (cantidad * super.precioBase);
            total = (int) (total + total * 0.19);
        }
        return total;
    }

    //mostrar atributos
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo:" + this.tipo);
        System.out.println("Sexo:" + this.sexo);
    }
}
