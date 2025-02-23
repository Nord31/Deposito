package cuentas;
/**
 * Clase diseñada como simulacion de una cuenta de banco
 * @author Omar
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }    
    /**
	 * Devuelve el nombre
	 * @return El nombre del titular de la cuenta.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método para obtener el nombre y almacenarlo en la variable nombre
	 * @param nombre El nombre del titular de la cuenta.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve cuenta que en este caso es una variable que contiene una cadena de texto
	 * @return El número de cuenta.
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Método para obtener el número de cuenta y almacenarlo en la variable cuenta
	 * @param cuenta El número de cuenta.
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * Devuelve el saldo
	 * @return saldo El saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Método para obtener el saldo
	 *@param Lo almacena en la variable
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 *  Obtiene el tipo de interés de la cuenta.
	 *  @return el valor de la variable tipoInterés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * Método que establece el tipo de interés de la cuenta
	 * @param tipoInterés Almacena el valor del tipo de interes
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
/**
 * Devuelve el estado de la cuenta
 * @return saldo de la cuenta
 */
	public double estado()
    {
        return saldo;
    }
	/**
	 * Ingresa la cantidad en cuenta
	 * @param cantidad cantidad a ingresar
	 * @throws Exception para valores negativos
	 */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Retira una cantidad
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad es 0 o negativas
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
