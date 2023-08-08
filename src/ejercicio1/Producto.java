/*
En un nuevo proyecto crear una clase de nombre Producto con los atributos código de tipo
entero, descripción un String, precio de tipo double y stock de tipo entero; un constructor
que permita inicializar todos sus atributos y los métodos get y set. Desde el método main
de clase principal del proyecto instanciar un Producto y luego mostrar por consola el estado
de todos sus atributos.
 */
package ejercicio1;

/**
 *
 * @author Cristian Rodriguez
 */
public class Producto {
    private int codigo; //definir codigo como entero
    private String descripcion;//defini descripcion como caracter
    private double precio;//definir precio como real
    private int stock;//definir codigo como entero
    
    public Producto(){
        // nos permite crear un producto sin datos!
    }               // 7779151231 , "carne", 2500, 10
    public Producto(int codigo,String descripcion,double precio,int stock){
        this.codigo =  codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
                
    public int getCodigo() {//mostrar
        return codigo;
    }
                
    public void setCodigo(int codigo) {//Escribir
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
