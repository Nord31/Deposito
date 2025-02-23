package cuentas;
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
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método para obtener el nombre y almacenarlo en la variable nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve cuenta que en este caso es una variable que contiene una cadena de texto
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Método para obtener el número de cuenta y almacenarlo en la variable cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * Devuelve el saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Método para obtener el saldo y almacenarlo en la variable del mismo nombre
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 *  Devuelve el valor de la variable tipoInterés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * Método para obtener los intereses y almacenarlo en la variable tipoInterés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
