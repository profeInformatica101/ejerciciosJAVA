package com.cuenta;


/**
 * Class CuentaCorriente
 */
public class CuentaCorriente {

  //
  // Fields
  //

  private double saldo;
  private double limiteDescubierto = -50;
  private String nombre;
  private String DNI;
  
  //
  // Constructors
  //
  public CuentaCorriente () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of saldo
   * @param newVar the new value of saldo
   */
  public void setSaldo (double newVar) {
    saldo = newVar;
  }

  /**
   * Get the value of saldo
   * @return the value of saldo
   */
  public double getSaldo () {
    return saldo;
  }

  /**
   * Set the value of limiteDescubierto
   * @param newVar the new value of limiteDescubierto
   */
  public void setLimiteDescubierto (double newVar) {
    limiteDescubierto = newVar;
  }

  /**
   * Get the value of limiteDescubierto
   * @return the value of limiteDescubierto
   */
  public double getLimiteDescubierto () {
    return limiteDescubierto;
  }

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of DNI
   * @param newVar the new value of DNI
   */
  public void setDNI (String newVar) {
    DNI = newVar;
  }

  /**
   * Get the value of DNI
   * @return the value of DNI
   */
  public String getDNI () {
    return DNI;
  }

  //
  // Other methods
  //

  /**
   * @param        saldo
   */
  public void ingresaDinero(double saldo)
  {
  }


  /**
   * @return       double
   */
  public double _sacarDinero()
  {
	  return 0.0;
  }


}
