/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author FELICIANO
 */
public class EstaVaciaException extends Exception {

    /**
     * Creates a new instance of <code>EstaVaciaException</code> without detail
     * message.
     */
    public EstaVaciaException() {
    }

    /**
     * Constructs an instance of <code>EstaVaciaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EstaVaciaException(String msg) {
        super(msg);
        javax.swing.JOptionPane.showMessageDialog(null, msg);
    }
}