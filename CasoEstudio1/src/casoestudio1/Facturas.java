/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio1;

/**
 *
 * @author isaacherrera
 */
class Facturas {
    // Atributos 
    
    private String productosElectricos;
    private String productosAutomotrices;
    private String productosConstruccion;
    double montoFacturado;
    
    // Metodo constructor
    
    public Facturas(String productosElectricos, String productosAutomotrices, String productosConstruccion, int productosElectricos1, int productosAutomotrices1, int productosConstruccion1, double montoFacturado) {
        this.productosElectricos = productosElectricos;
        this.productosAutomotrices = productosAutomotrices;
        this.productosConstruccion = productosConstruccion;
        this.montoFacturado = montoFacturado;
        
        
    }
    
    // Getter and setter

    public String getProductosElectricos() {
        return productosElectricos;
    }

    public void setProductosElectricos(String productosElectricos) {
        this.productosElectricos = productosElectricos;
    }

    public String getProductosAutomotrices() {
        return productosAutomotrices;
    }

    public void setProductosAutomotrices(String productosAutomotrices) {
        this.productosAutomotrices = productosAutomotrices;
    }

    public String getProductosConstruccion() {
        return productosConstruccion;
    }

    public void setProductosConstruccion(String productosConstruccion) {
        this.productosConstruccion = productosConstruccion;
    }

    public double getMontoFacturado() {
        return montoFacturado;
    }

    public void setMontoFacturado(double montoFacturado) {
        this.montoFacturado = montoFacturado;
    }
}
    

    