/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author FELICIANO
 */
public class EstaLlenaException extends Exception {

    /**
     * Creates a new instance of <code>EstaLlenaException</code> without detail
     * message.
     */
    public EstaLlenaException() {
    }

    /**
     * Constructs an instance of <code>EstaLlenaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EstaLlenaException(String msg) {
        super(msg);
        showMessageDialog(null, msg);
    }
    
}
