
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author douglas
 */
public class CalculadoraComLoggers {
    
    public static final Logger logger = Logger.getLogger(CalculadoraComLoggers.class.getName());

    public CalculadoraComLoggers() throws IOException {
        Handler file = new FileHandler("arquivo.txt");
        logger.addHandler(file);
    }
    
    public int somar(int x, int y) {
        logger.info("Iniciando calculo soma.");
        int resultado = x + y;
        logger.info("Calculo soma finalizado.");
        return resultado;
    }

    public int subtrair(int x, int y) {
        logger.info("Iniciando calculo subtração.");
        int resultado = x - y;
        logger.info("Calculo subtração finalizado.");
        return resultado;
    }
    
    public int dividir(int x, int y){
        logger.info("Iniciando calculo divisão.");
        int resultado = x / y;
        logger.info("Calculo divisão finalizado.");
        return resultado;
    }
}
