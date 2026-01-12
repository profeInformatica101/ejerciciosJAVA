package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculadora - Pruebas unitarias completas (JUnit 5)")
class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora(); // por defecto: (0,0)
    }

    // -------------------------
    // Constructores / estado
    // -------------------------

    @Test
    @DisplayName("01. Constructor vacío inicializa num1=0 y num2=0")
    void test01_constructorVacio_inicializaACero() {
        int esperadoNum1 = 0;
        int actualNum1 = calculadora.getNum1();
        assertEquals(esperadoNum1, actualNum1, "num1 debe iniciar en 0 con constructor vacío");

        int esperadoNum2 = 0;
        int actualNum2 = calculadora.getNum2();
        assertEquals(esperadoNum2, actualNum2, "num2 debe iniciar en 0 con constructor vacío");
    }

    @Test
    @DisplayName("02. Constructor con parámetros asigna num1 y num2 correctamente")
    void test02_constructorParametros_asignaCampos() {
        Calculadora c = new Calculadora(7, -3);

        int esperadoNum1 = 7;
        int actualNum1 = c.getNum1();
        assertEquals(esperadoNum1, actualNum1, "El constructor debe asignar num1 correctamente");

        int esperadoNum2 = -3;
        int actualNum2 = c.getNum2();
        assertEquals(esperadoNum2, actualNum2, "El constructor debe asignar num2 correctamente");
    }

    @Test
    @DisplayName("03. Constructor con parámetros acepta valores extremos de int")
    void test03_constructorParametros_valoresExtremos() {
        Calculadora c = new Calculadora(Integer.MAX_VALUE, Integer.MIN_VALUE);

        int esperadoNum1 = Integer.MAX_VALUE;
        int actualNum1 = c.getNum1();
        assertEquals(esperadoNum1, actualNum1, "Debe aceptar Integer.MAX_VALUE en num1");

        int esperadoNum2 = Integer.MIN_VALUE;
        int actualNum2 = c.getNum2();
        assertEquals(esperadoNum2, actualNum2, "Debe aceptar Integer.MIN_VALUE en num2");
    }

    @Test
    @DisplayName("04. Setters/Getters actualizan y recuperan el estado")
    void test04_settersGetters_actualizanEstado() {
        calculadora.setNum1(10);
        calculadora.setNum2(20);

        int esperadoNum1 = 10;
        int actualNum1 = calculadora.getNum1();
        assertEquals(esperadoNum1, actualNum1, "setNum1 debe actualizar num1");

        int esperadoNum2 = 20;
        int actualNum2 = calculadora.getNum2();
        assertEquals(esperadoNum2, actualNum2, "setNum2 debe actualizar num2");
    }

    // -------------------------
    // suma()
    // -------------------------

    @Test
    @DisplayName("05. suma() con enteros positivos (5+2=7)")
    void test05_suma_positivos() {
        calculadora.setNum1(5);
        calculadora.setNum2(2);

        int esperado = 7;
        int actual = calculadora.suma();

        assertEquals(esperado, actual, "suma() debe sumar correctamente dos enteros positivos");
    }

    @Test
    @DisplayName("06. suma() con cero (0+7=7)")
    void test06_suma_conCero() {
        calculadora.setNum1(0);
        calculadora.setNum2(7);

        int esperado = 7;
        int actual = calculadora.suma();

        assertEquals(esperado, actual, "suma() debe cumplir identidad: 0+a=a");
    }

    @Test
    @DisplayName("07. suma() con mixtos (-5+2=-3)")
    void test07_suma_mixtos() {
        calculadora.setNum1(-5);
        calculadora.setNum2(2);

        int esperado = -3;
        int actual = calculadora.suma();

        assertEquals(esperado, actual, "suma() debe funcionar con negativos y positivos");
    }

    // -------------------------
    // resta()
    // -------------------------

    @Test
    @DisplayName("08. resta() con enteros positivos (5-2=3)")
    void test08_resta_positivos() {
        calculadora.setNum1(5);
        calculadora.setNum2(2);

        int esperado = 3;
        int actual = calculadora.resta();

        assertEquals(esperado, actual, "resta() debe restar correctamente dos enteros positivos");
    }

    @Test
    @DisplayName("09. resta() con resultado negativo (2-5=-3)")
    void test09_resta_resultadoNegativo() {
        calculadora.setNum1(2);
        calculadora.setNum2(5);

        int esperado = -3;
        int actual = calculadora.resta();

        assertEquals(esperado, actual, "resta() debe ser negativa cuando num1<num2");
    }

    @Test
    @DisplayName("10. resta() con cero (0-7=-7)")
    void test10_resta_conCero() {
        calculadora.setNum1(0);
        calculadora.setNum2(7);

        int esperado = -7;
        int actual = calculadora.resta();

        assertEquals(esperado, actual, "resta() debe funcionar cuando num1 es 0");
    }

    // -------------------------
    // multiplicacion()
    // -------------------------

    @Test
    @DisplayName("11. multiplicacion() con positivos (5*2=10)")
    void test11_multiplicacion_positivos() {
        calculadora.setNum1(5);
        calculadora.setNum2(2);

        int esperado = 10;
        int actual = calculadora.multiplicacion();

        assertEquals(esperado, actual, "multiplicacion() debe multiplicar correctamente dos positivos");
    }

    @Test
    @DisplayName("12. multiplicacion() con cero (7*0=0)")
    void test12_multiplicacion_conCero() {
        calculadora.setNum1(7);
        calculadora.setNum2(0);

        int esperado = 0;
        int actual = calculadora.multiplicacion();

        assertEquals(esperado, actual, "multiplicacion() debe cumplir: a*0=0");
    }

    @Test
    @DisplayName("13. multiplicacion() con signos (-5*2=-10)")
    void test13_multiplicacion_signos() {
        calculadora.setNum1(-5);
        calculadora.setNum2(2);

        int esperado = -10;
        int actual = calculadora.multiplicacion();

        assertEquals(esperado, actual, "multiplicacion() debe respetar el signo (neg*pos=neg)");
    }

    // -------------------------
    // dividir() (división entera -> double)
    // -------------------------

    @Test
    @DisplayName("14. dividir() exacta (10/2=5.0)")
    void test14_dividir_exacta() {
        calculadora.setNum1(10);
        calculadora.setNum2(2);

        double esperado = 5.0;
        double actual = calculadora.dividir();

        assertEquals(esperado, actual, "dividir() debe devolver 5.0 cuando 10/2 es exacto");
    }

    @Test
    @DisplayName("15. dividir() truncado (1/2=0.5)")
    void test15_dividir_truncado_1entre2() {
        calculadora.setNum1(1);
        calculadora.setNum2(2);

        double esperado = 0.5;
        double actual = calculadora.dividir();

        assertEquals(esperado, actual, "dividir() (int/int) debe truncar: 1/2=0 -> 0.0");
    }

    @Test
    @DisplayName("16. dividir() (3/2=1.5)")
    void test16_3entre2() {
        calculadora.setNum1(3);
        calculadora.setNum2(2);

        double esperado = 1.5;
        double actual = calculadora.dividir();

        assertEquals(esperado, actual, "dividir() 3/2-> 1.5");
    }

    @Test
    @DisplayName("17. dividir() con negativos (-3/2=>-1.5)")
    void test17_dividir_truncado_negativos() {
        calculadora.setNum1(-3);
        calculadora.setNum2(2);

        double esperado = -1.5;
        double actual = calculadora.dividir();

        assertEquals(esperado, actual, "dividir()  -3/2-> -1.5");
    }

    @Test
    @DisplayName("18. dividir() con numerador 0 (0/5=0.0)")
    void test18_dividir_ceroEntrePositivo() {
        calculadora.setNum1(0);
        calculadora.setNum2(5);

        double esperado = 0.0;
        double actual = calculadora.dividir();

        assertEquals(esperado, actual, "dividir() debe devolver 0.0 cuando num1 es 0");
    }

    @Test
    @DisplayName("19. dividir() por cero lanza ArithmeticException con mensaje correcto")
    void test19_dividir_porCero_excepcionMensaje() {
        calculadora.setNum1(5);
        calculadora.setNum2(0);

        ArithmeticException ex = assertThrows(ArithmeticException.class,
                () -> calculadora.dividir(),
                "dividir() debe lanzar ArithmeticException si num2==0");

        String esperado = "No se puede dividir por 0";
        String actual = ex.getMessage();

        assertEquals(esperado, actual, "El mensaje de la excepción debe ser exactamente el esperado");
    }

    // -------------------------
    // Coherencia
    // -------------------------

    @Test
    @DisplayName("20. Coherencia: (a-b)+b == a (a=20, b=7)")
    void test20_coherencia_restaYSuma() {
        int a = 20;
        int b = 7;

        calculadora.setNum1(a);
        calculadora.setNum2(b);
        int aMenosB = calculadora.resta();

        calculadora.setNum1(aMenosB);
        calculadora.setNum2(b);
        int resultado = calculadora.suma();

        int esperado = a;
        int actual = resultado;

        assertEquals(esperado, actual, "Debe cumplirse: (a-b)+b = a");
    }
}
