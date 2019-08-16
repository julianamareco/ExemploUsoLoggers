
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author douglas
 */
public class CalculadoraView {
    public static void main(String[] args) throws IOException {
        CalculadoraComLoggers calculadora = new CalculadoraComLoggers();
        calculadora.somar(10, 20);
        calculadora.subtrair(30, 40);
        calculadora.subtrair(20, 0);
    }
}
