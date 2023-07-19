/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granmultinacional;

import java.util.ArrayList;

/**
 *
 * poo2201
 */
public class RegistroProducto {
    //declarar colección
    static ArrayList<Producto> productos;

    //crear colección
    public RegistroProducto() {
        productos = new ArrayList<Producto>();
    }

    //agregar producto a la colección
    public static void agregarProducto(Producto nuevoProducto) {
        if (buscarProducto(nuevoProducto.getCodigo()) == false) {
            productos.add(nuevoProducto);
        }
    }

    //buscar producto a la colección por su código
    public static boolean buscarProducto(String codigo) {
        boolean valida = false;

        for (Producto temporalProducto : productos) {
            if (temporalProducto.getCodigo().equals(codigo)) {
                valida = true;
                break;
            }
        }
        return valida;
    }

    //mostrar atributos de los productos
    public static void mostrarProductos() {
        for (Producto temporalProducto : productos) {
            temporalProducto.imprimir();
            System.out.println("---------------------");
        }
    }

    //eliminar producto
    public static void eliminarProducto(String codigo) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo().equals(codigo)) {
                productos.remove(i);
                i = i - 1;
            }            
        }  
    }
}