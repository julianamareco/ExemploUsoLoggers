

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Logger;

/**
 *
 * @author douglas
 */
public class DesempenhoLogger {
    
    public static void main(String[] args) {
        Logger logger;
        logger = Logger.getLogger("Logger");
        for(int i = 0; i < 100000; i++){
            logger.info("V: "+i);
        }
    }
}
