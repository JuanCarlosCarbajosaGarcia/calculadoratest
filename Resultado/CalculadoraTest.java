import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void calcular() {
        assertAll(
                () -> assertEquals(7,Calculadora.calcular(3,4,"+")),
                () -> assertEquals(-7,Calculadora.calcular(-3,-4,"+")),
                () -> assertEquals(1,Calculadora.calcular(-3,4,"+")),
                () -> assertEquals((long)4000000000.00,Calculadora.calcular(2000000000,2000000000, "+"))
        );

        //int resultado = Calculadora.calcular(3,4,"+");
        //assertEquals(7,resultado);

        //long esperado = (long)4000000000.00;
        //assertEquals(esperado,resultado);
    }
}