/**
 * Clase Tarjeta.
 * Esta clase crea y manipula instancias de {@link Cartera} para verificar su funcionalidad.
 * @author Diego Hernandez Vazquez y Hanabi Hernandez Arce
 * @version 1.0                
 * @date 06 sep 2024.           
 */
public class PruebaCarteras {
    /**
     * Método principal que ejecuta las pruebas sobre la clase {@link Cartera}.
     * 
     * Este método crea tres tipos de {@link Cartera} con diferentes atributos y compara dos
     * de ellas para verificar si son iguales usando {@code equals}. También imprime la 
     * la representación de las tres carteras para comprobar su contenido.
     * 
     * @param args Atributos de las carteras. 
     */
    public static void main(String[] args) {
        // Crear carteras
        Cartera cartera1 = new Cartera(50, 20, 500, 200, 9204756184920183L, 1928564738192048L, 1029384756473829L, "Metal", 8);
        Cartera cartera2 = new Cartera(50, 20, 500, 200, 9204756184920183L, 1928564738192048L, 1029384756473829L, "Metal", 8);
        Cartera cartera3 = new Cartera(500, 100, 200, 500, 129988776655443L, 1122334455667788L, 9375810335772834L, "Lagarto", 6);

        // Modificar valores para asegurarn iguales en atributos pero con contenido diferente que dos carteras sea
        cartera1.asignarT1(9204756184920183L);
        cartera1.asignarT2(1928564738192048L);
        cartera1.asignarT3(1029384756473829L);
        cartera1.asignarMaterial("Metal");
        cartera1.asignarApartados(8);
        
        cartera2.asignarT1(9204756184920183L); 
        cartera2.asignarT2(1928564738192048L); 
        cartera2.asignarT3(1029384756473829L);
        cartera2.asignarMaterial("Metal");      
        cartera2.asignarApartados(8);           
        
        cartera3.asignarT1(129988776655443L);
        cartera3.asignarT2(1122334455667788L);
        cartera3.asignarT3(9375810335772834L);
        cartera3.asignarMaterial("Lagarto");
        cartera3.asignarApartados(6);

        // Usar el equals para ver si cartera1 y cartera2 son iguales
        System.out.println("Cartera 1 y Cartera 2 son iguales: " + cartera1.equals(cartera2));
        
        // Usar el equals para ver si cartera1 y cartera3 son iguales
        System.out.println("Cartera 1 y Cartera 3 son iguales: " + cartera1.equals(cartera3)); 

        // Imprimir las tres carteras
        System.out.println("\nCartera 1:");
        System.out.println(cartera1.toString());

        System.out.println("\nCartera 2:");
        System.out.println(cartera2.toString());

        System.out.println("\nCartera 3:");
        System.out.println(cartera3.toString());
    }
}
