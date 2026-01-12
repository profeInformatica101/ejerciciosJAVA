package com;

/**
 * Class Calculadora
 */
public class Calculadora {

  //
  // Fields->Campos
  //

  private int num1;
  private int num2;
  
  //
  // Constructors->Constructores
  //
  public Calculadora () { 
	  this.num1 =0;
	  this.num2 =0;
  };
  
  public Calculadora (int num1, int num2) { 
	  this.num1 = num1;
	  this.num2 = num2;
  };
  
  //
  // Methods -> Métodos
  //

  //
  // Accessor methods
  //

  /**
   * Set the value of num1
   * @param newVar the new value of num1
   */
  public void setNum1 (int num1) {
    this.num1 = num1;
  }

  /**
   * Get the value of num1
   * @return the value of num1
   */
  public int getNum1 () {
    return num1;
  }

  /**
   * Set the value of num2
   * @param newVar the new value of num2
   */
  public void setNum2 (int num2) {
    this.num2 = num2;
  }

  /**
   * Get the value of num2
   * @return the value of num2
   */
  public int getNum2 () {
    return num2;
  }

  //
  // Other methods
  //

  /**
   * @return       int
   */
  public int suma()
  {
	  return num1+num2;
  }


  /**
   * @return       int
   */
  public int resta()
  {
	  return num1-num2;
  }


  /**
   * @return       int
   */
  public int multiplicacion()
  {
	  return num1*num2;
  }


  /**
   * @return       double
   */
  public double dividir()
  {
	  if(num2 == 0)
		  throw new ArithmeticException("No se puede dividir por 0");
  
	  return num1/ (double)num2;
  }


}
