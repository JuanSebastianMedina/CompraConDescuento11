/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentocompra11;
/**
 * @author juanse
 * fecha: sabado 06 de septiembre de 2025
 * Requerimientos: Un supermercado ofrece un 10% de descuento en todas las compras. 
 * Pide al usuario el número de productos que va a comprar. 
 * Por cada producto, solicita su nombre, precio unitario y cantidad. 
 * Calcula el total a pagar con el descuento ya aplicado. Usa solo for.
 */
import javax.swing.JOptionPane;
public class DescuentoCompra11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadTotalProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos de \n diferente tipo que desea comprar"));
        int precioTotal = 0;
        for (int i=0; i<cantidadTotalProductos; i++ ) {
            String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
            int precioProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de " + nombreProducto));
            int cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de " + nombreProducto));
            int precio = precioProducto * cantidadProducto;
            precioTotal = precioTotal+precio;
        }
        float descuentoTotal = precioTotal*0.9f;
        JOptionPane.showMessageDialog(null, "Total a pagar con descuento aplicado: \n" + descuentoTotal);
    }
}
