/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programme4;

/**
 *
 * @author keera
 */
public class MathNonStatic {

    public double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public double power(double a, double b) {
        return (b == 0) ? 1 : a * power(a, b - 1);
    }

    public double min(double a, double b) {
        return (a < b) ? a : b;
    }
}
