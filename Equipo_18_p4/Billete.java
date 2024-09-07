/**
 * Clase Billete.
 * @author Diego Hernandez Vazquez y Hanabi Hernandez Arce
 * @version 1.0                
 * @date 28 ago 2024.           
 */

 public class Billete{
    private int denominacionBillete; // Valor monetario en el mercado del billete
    private String imagenFigurativa; // Imagen que muestra el billete, personaje o elemento cultural
    private long numeroSerie; // Numero de serie del billete, dado por seguridad
    
    //constructor por omision
    public Billete(){
        this.denominacionBillete = 0;
        this.imagenFigurativa = "";
        this.numeroSerie = 0;
    }
     /**
     * Constructor por parametros para un billete con los valores elegidos
     * @param denominacionBillete El valor del billete en el mercado.
     * @param imagenFigurativa El personaje o elemento caracteristico del billete.
     * @param numeroSerie Numero de serie del billete.
     */
    public Billete(int denominacionBillete, String imagenFigurativa, long numeroSerie) {
        this.denominacionBillete = denominacionBillete;
        this.imagenFigurativa = imagenFigurativa;
        this.numeroSerie = numeroSerie;
    }
     /**
     * Constructor que copia otro objeto de la clase billete para crear un billete nuevo.
     *
     * @param b Es el objeto billete que se copia
     */
    public Billete(Billete b) {
        denominacionBillete = b.denominacionBillete;
        imagenFigurativa = b.imagenFigurativa;
        numeroSerie = b.numeroSerie;
    }
    /**
     * Obtiene la denominacion del billete.
     * @return El valor monetario del billete.
     */
    public int obtenerDenominacionBillete (int denominacionBillete){
        return denominacionBillete;
    }
    /**
     * Asigna el valor del billete.
     *
     * @param denominacionBillete El valor del billete que se asignara.
     */
    public void asignarDenominacionBillete (int denominacionBillete){
        this.denominacionBillete = denominacionBillete;
    }
    /**
     * Obtiene la imagen que se representa en el billete.
     * @return La imagen que representa el billete.
     */
    public String obtenerImagenFigurativa (String imagenFigurativa){
        return imagenFigurativa;
    }
    /**
     * Asigna la imagen que aparece en el billete.
     *
     * @param imagenFigurativa La imagen del personaje o elemento que aparece en el billete.
     */
    public void asignarImagenFigurativa (String imagenFigurativa){
        this.imagenFigurativa = imagenFigurativa;
    }
    /**
     * Obtiene el numero de serie del billete.
     * @return El numero de serie del billete.
     */
    public long obtenerNumeroSerie (long numeroSerie){
        return numeroSerie;
    }
    /**
     * Asigna el numero de serie del billete.
     *
     * @param numeroSerie El numero de seguridad de serie que el billete resivirá.
     */
    public void asignarNumeroSerie (long numeroSerie){
        this.numeroSerie = numeroSerie;
    }
     /**
     * Sobrescribimos el toString para que regrese los elementos del billete.
     *
     * @return Un String con los elementos del billete.
     */
    @Override
    public String toString() {
        return "Denominacion del billete: " + denominacionBillete + "\n" +
                "Imagen del billete: " + imagenFigurativa + "\n" +
                "Numero de serie del billete: " + numeroSerie;
    }
    /**
     * Compara esta tarjeta con otra para determinar si son iguales.
     *
     * @param b Compara este objeto de la clase Billete.
     * @return true si ambos billetes son iguales; false si no es asi.
     */
    public boolean equals(Billete b) {
        if (this == b) return true;
        Billete billete = (Billete) b;
        return numeroSerie == billete.numeroSerie && billete.imagenFigurativa == imagenFigurativa &&
               denominacionBillete == billete.denominacionBillete;
    }
 }