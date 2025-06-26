/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package casoestudio1;

import javax.swing.JOptionPane;

public class CasoEstudio1 {

    public static void main(String[] args) {

        int contadorFacturas = 0;
        String resumen = "";

        while (true) {

            String nombreCliente = JOptionPane.showInputDialog("Nombre del cliente: ");
            String cedulaCliente = JOptionPane.showInputDialog("Cédula del cliente: ");
            String codigoFactura = JOptionPane.showInputDialog("Código de la factura: ");
            int productosElectricos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos eléctricos compró?"));
            int productosAutomotrices = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos automotrices compró?"));
            int productosConstruccion = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos de construcción compró?"));
            double montoFacturado = Double.parseDouble(JOptionPane.showInputDialog("Monto facturado: "));

            Facturas f1 = new Facturas(nombreCliente, cedulaCliente, codigoFactura, productosElectricos, productosAutomotrices, productosConstruccion, montoFacturado);
            
            //variables para calcular 
            
            int bono1 = 0;
            int bono2 = 0;
            int bono3 = 0;
            int bono4 = 0;
            
            // condiciones 
            
            if (productosElectricos > 0) {
                if (productosAutomotrices > 0) {
                    if (productosConstruccion > 0) {
                        bono1 = (int)(montoFacturado * 0.10);
                    }
                }
            }

            if (productosElectricos >= 3) {
                bono2 = (int)(montoFacturado * 0.04);
            } else {
                bono2 = (int)(montoFacturado * 0.02);
            }

            if (productosAutomotrices > 4) {
                bono3 = (int)(montoFacturado * 0.04);
            } else {
                bono3 = (int)(montoFacturado * 0.02);
            }

            if (productosConstruccion > 0) {
                bono4 = (int)(montoFacturado * 0.08);
            }

            double montoTotal = montoFacturado + bono1 + bono2 + bono3 + bono4;

            if (montoFacturado > 50000) {
                montoTotal += montoFacturado * 0.05;
            }
            
            // Resumen 
            
            resumen += "Registro";  
            resumen += "Cliente: " + nombreCliente ;
            resumen += "Cédula: " + cedulaCliente ;
            resumen += "Código de Factura: " + codigoFactura  ;
            resumen += "Productos Eléctricos: " + productosElectricos  ;
            resumen += "Productos Automotrices: " + productosAutomotrices  ;
            resumen += "Productos Construcción: " + productosConstruccion ;
            resumen += "Monto Total con Bonos: " + montoTotal ;
           

            contadorFacturas++;

            int continuar = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra factura?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (continuar != JOptionPane.YES_OPTION) {
                break;
            }
        }

        resumen += "Total de facturas realizadas por el vendedor: " + contadorFacturas;
        
        JOptionPane.showMessageDialog(null, resumen);
       
    }
}
        

            
           
        
            