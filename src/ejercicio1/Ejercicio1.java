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
public class Ejercicio1 {

  
    public static void main(String[] args) {
      
      Producto asado = new Producto(7791, "Asado en Tira", 2500 , 10);
      System.out.println("El codigo del "+ asado.getDescripcion()+ " es: "+ asado.getCodigo()+" que sale: $" + asado.getPrecio()+ " y nos quedan " + asado.getStock() + "kg.");
        System.out.println("Holas como estas");
    }
    
}
