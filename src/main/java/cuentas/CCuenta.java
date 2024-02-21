package cuentas;

/**
 * La clase CCuenta nos almacena los datos de una cuenta bancaria
 * @author Pilar Vargas Sandoval
 */
public class CCuenta {

    /**
     * Nos devuelve el nombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Nombre a asignar
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Nos devuelve la Cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Cuenta a asignar
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Nos devuelve el Saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Saldo a asignar
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Nos devuelve el Tipo de interés
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Tipo de interés a asignar
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }

    
   /**
    * Constructor con parámetros
    * @param nom
    * @param cue
    * @param sal
    * @param tipo 
    */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Nos devuelve el estado de la cuenta, es decir, el saldo que tiene
     * @return 
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Nos permite ingresar saldo en la cuenta, excepto si la cantidad es negativa
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Nos permite retirar saldo de la cuenta, excepto si se quiere retirar más de lo que hay
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
