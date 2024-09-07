/**
 * Clase Cartera.
 * @author Diego Hernandez Vazquez y Hanabi Hernandez Arce
 * @version 1.0                
 * @date 4 sep 2024.           
 */
 public class Cartera{
    private int b1, b2, b3, b4; // Valor monetiario de cuatro billetes distintos
    private long t1, t2, t3; // Numero de tres tarjetas diferentes
    private String material; // Material de la cartera
    private int apartados; // Numero de espacios que tiene la cartera para guardar tarjetas

    /**
     * Constructor por omisión que crea la cartera con valores predeterminados.
     */
    public Cartera(){
        b1 = 100;
        b2 = 200;
        b3 = 500;
        b4 = 1000;
        t1 = t2 = t3 = 0;
        material = "piel de lagartija";
        apartados = 0;
    }
    /**
     * Constructor por parámetros de la cartera con los valores especificados.
     *
     * @param b1 El valor del primer tipo de billete.
     * @param b2 El valor del segundo tipo de billete.
     * @param b3 El valor del tercer tipo de billete.
     * @param b4 El valor del cuarto tipo de billete.
     * @param t1 El número de la primera tarjeta.
     * @param t2 El número de la segunda tarjeta.
     * @param t3 El número de la tercera tarjeta.
     * @param material El material de la cartera.
     * @param apartados El número de apartados en la cartera.
     */
    public Cartera (int b1, int b2, int b3, int b4, long t1, long t2, long t3, String material, int apartados){
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.t1 = t1;
        this.t2 = t2;
        this.material = material;
        this.apartados = apartados;
    }

    /**
     * Constructor de copia que crea una nueva cartera a partir de una existente.
     *
     * @param c La cartera que se copia.
     */
    public Cartera(Cartera c){
        b1 = c.b1;
        b2 = c.b2;
        b3 = c.b3;
        b4 = c.b4;
        t1 = c.t1;
        t2 = c.t2;
        material = c.material;
        apartados = c.apartados;
    }
    //metodos de acceso
    /**
     * Asigna el valor del primer tipo de billete.
     *
     * @param b1 El valor del primer tipo de billete.
     */
    public void asignarB1(int b1){
        this.b1 = b1;
    } 
    /**
     * Obtiene el valor del primer billete.
     *
     * @return El valor del primer billete.
     */   
    public int obtenerB1(){
        return b1;
    }
    /**
     * Asigna el valor del segundo billete.
     *
     * @param b2 El valor del segundo billete.
     */
    public void asignarB2(int b2){
        this.b2 = b2;
    }    
    /**
     * Obtiene el valor del segundo  billete.
     *
     * @return El valor del segundo billete.
     */
    public int obtenerB2(){
        return b2;
    }
     /**
     * Asigna el valor del tercer billete.
     *
     * @param b3 El valor del tercer billete.
     */
    public void asignarB3(int b3){
        this.b3 = b3;
    }    
    /**
     * Obtiene el valor del tercer billete.
     *
     * @return El valor del tercer billete.
     */
    public int obtenerB3(){
        return b3;
    }
    /**
     * Asigna el valor del cuarto tipo de billete.
     *
     * @param b4 El valor del cuarto tipo de billete.
     */
    public void asignarB4(int b4){
        this.b4 = b4;
    }
     /**
     * Obtiene el valor del cuarto billete.
     *
     * @return El valor del cuarto billete.
     */
    public int obtenerB4(){
        return b4;
    }
    /**
     * Asigna el número de la primera tarjeta.
     *
     * @param t1 El número de la primera tarjeta.
     */
    public void asignarT1(long t1){
        this.t1 = t1;
    }
    /**
     * Obtiene el número de la primera tarjeta.
     *
     * @return El número de la primera tarjeta.
     */
    public long obtenerT1(){
        return t1;
    }
    /**
     * Asigna el número de la segunda tarjeta.
     *
     * @param t2 El número de la segunda tarjeta.
     */
    public void asignarT2(long t2){
        this.t2 = t2;
    }
    /**
     * Obtiene el número de la segunda tarjeta.
     *
     * @return El número de la segunda tarjeta.
     */
    public long obtenerT2(){
        return t2;
    }
    /**
     * Asigna el número de la tercera tarjeta.
     *
     * @param t3 El número de la tercera tarjeta.
     */
    public void  asignarT3(long t3){
        this.t3 = t3;
    }
    /**
     * Obtiene el número de la tercera tarjeta.
     *
     * @return El número de la tercera tarjeta.
     */
    public long obtenerT3(){
        return t3;
    }
    /**
     * Asigna el material de la cartera.
     *
     * @param material El material de la cartera.
     */
    public void asignarMaterial(String material){
        this.material = material;
    }
     /**
     * Obtiene el material de la cartera.
     *
     * @return El material de la cartera.
     */
    public String obtenerMaterial(){
        return material;
    }
     /**
     * Asigna el número de apartados en la cartera.
     *
     * @param apartados El número de apartados a asignar.
     */
    public void asignarApartados(int apartados){
        this.apartados = apartados;
    }
    /**
     * Obtiene el número de apartados en la cartera.
     *
     * @return El número de apartados en la cartera.
     */
    public int obtenerApartados(){
        return apartados;
    }
    //cambiando el toString y el equals
    /**
     * Devuelve una representación en cadena de la cartera con sus detalles.
     *
     * @return Una cadena que representa la cartera.
     */
    @Override
    public String toString() {
        return  "Billete 1: " + b1 + "\n" +
                "Billete 2: " + b2 + "\n" +
                "Billete 3: " + b3 + "\n" +
                "Billete 4: " + b4 + "\n" +
                "Tarjeta 1: " + t1 + "\n" +
                "Tarjeta 2: " + t2 + "\n" +
                "Tarjeta 3: " + t3 + "\n" +
                "Material: " + material + "\n" +
                "Numero de apartados: " + apartados;
    }
    /**
     * Compara esta cartera con otra para determinar si son iguales.
     *
     * @param c El objeto con el que comparar esta cartera.
     * @return true si ambas carteras son iguales; false en caso contrario.
     */
    public boolean equals(Cartera c) {
        if (this == c) return true;
        if (c == null || getClass() != c.getClass()) return false;
        Cartera cartera = (Cartera) c;
        return b1 == cartera.b1 && cartera.b2 == b2 && b3 == cartera.b3 && b4 == cartera.b4 &&
        t1 == cartera.t1 && cartera.t2 == t2 && cartera.t3 == t3 && material.equals(cartera.material) && apartados == cartera.apartados; 
    } 
}
