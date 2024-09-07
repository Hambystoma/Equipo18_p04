package p04.Tarjeta;
/**
 * Clase Tarjeta.
 * @author Diego Hernandez Vazquez y Hanabi Hernandez Arce
 * @version 1.0                
 * @date 06 sep 2024.           
 */
import java.util.Objects;

 public class Tarjeta {

    private long numeroTarjeta; // Numero de la tarjeta
    private String fechaCaducidad; // Fecha de caducidad o expiro de la tarjeta
    private String titular; // Nombre del titular de la tarjeta
    private String emisor; // Compañia u organizacion que expide la tarjeta
    private int cvv; // Codigo cvv de la tarjeta

    /**
     * Constructor por omisión que crea una tarjeta con valores predeterminados.
     */
    public Tarjeta() {
        this.numeroTarjeta = 0;
        this.fechaCaducidad = "";
        this.titular = "";
        this.emisor = "";
        this.cvv = 0;
    }

     /**
     * Constructor por parametros para una tarjeta con los valores especificados.
     *
     * @param numeroTarjeta El número de la tarjeta.
     * @param fechaCaducidad La fecha de caducidad de la tarjeta en formato MM/AA.
     * @param titular El nombre del titular de la tarjeta.
     * @param emisor El nombre del emisor de la tarjeta.
     * @param cvv El código de seguridad de la tarjeta.
     */
    public Tarjeta(long numeroTarjeta, String fechaCaducidad, String titular, String emisor, int cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
        this.titular = titular;
        this.emisor = emisor;
        this.cvv = cvv;
    }

    
    /**
     * Constructor de copia que crea una nueva tarjeta a partir de otra existente.
     *
     * @param t La tarjeta que se copia.
     */
    public Tarjeta(Tarjeta t) {
        this.numeroTarjeta = t.numeroTarjeta;
        this.fechaCaducidad = t.fechaCaducidad;
        this.titular = t.titular;
        this.emisor = t.emisor;
        this.cvv = t.cvv;
    }

    // Métodos de acceso y modificación
    /**
     * Obtiene el número de la tarjeta.
     *
     * @return El número de la tarjeta.
     */
    public long obtenerNumeroTarjeta() {
        return numeroTarjeta;
    }
    /**
     * Asigna el número de la tarjeta.
     *
     * @param numeroTarjeta El número de la tarjeta asignada.
     */
    public void asignarNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    /**
     * Obtiene la fecha de caducidad de la tarjeta.
     *
     * @return La fecha de caducidad de la tarjeta.
     */
    public String obtenerFechaCaducidad() {
        return fechaCaducidad;
    }
    /**
     * Asigna la fecha de caducidad de la tarjeta.
     *
     * @param fechaCaducidad La fecha de caducidad.
     */
    public void asignarFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    /**
     * Obtiene el nombre del titular de la tarjeta.
     *
     * @return El nombre del titular de la tarjeta.
     */
    public String obtenerTitular() {
        return titular;
    }
    /**
     * Asigna el titular de la tarjeta.
     *
     * @param titular El nombre del titular a asignar.
     */
    public void asignarTitular(String titular) {
        this.titular = titular;
    }
    /**
     * Obtiene el emisor de la tarjeta.
     *
     * @return El nombre del emisor de la tarjeta.
     */
    public String obtenerEmisor() {
        return emisor;
    }
    /**
     * Asigna el emisor de la tarjeta.
     *
     * @param emisor El nombre del emisor a asignar.
     */
    public void asignarEmisor(String emisor) {
        this.emisor = emisor;
    }
    /**
     * Obtiene el CVV de la tarjeta.
     *
     * @return El código de seguridad de la tarjeta.
     */
    public int obtenerCvv() {
        return cvv;
    }
    /**
     * Asigna elCVV de la tarjeta.
     *
     * @param cvv El código de seguridad a asignar.
     */
    public void asignarCvv(int cvv) {
        this.cvv = cvv;
    }
    /**
     * Devuelve la cadena String de la tarjeta con sus detalles.
     *
     * @return Una cadena que representa la tarjeta.
     */
    @Override
    public String toString() {
        return "Tarjeta {\n" +
                "numero de tarjeta = " + numeroTarjeta + "\n" +
                "fecha de caducidad = " + fechaCaducidad + "\n" +
                "titular = " + titular + "\n" +
                "emisor = " + emisor + "\n" +
                "cvv = " + cvv + "\n" +
                "}";
    }
    /**
     * Compara esta tarjeta con otra para determinar si son iguales.
     *
     * @param obj Comparar esta tarjeta.
     * @return true si ambas tarjetas son iguales; false si no es asi.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tarjeta tarjeta = (Tarjeta) obj;
        return numeroTarjeta == tarjeta.numeroTarjeta &&
               cvv == tarjeta.cvv &&
               fechaCaducidad.equals(tarjeta.fechaCaducidad) &&
               titular.equals(tarjeta.titular) &&
               emisor.equals(tarjeta.emisor);
    }
}