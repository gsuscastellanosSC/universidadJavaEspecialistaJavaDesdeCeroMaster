/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava.finalLab;

/**
 *
 * @author sc
 */
public class Mouse extends InputPeripherals {

    private final int idMouse;
    private static int accMouse;

    public Mouse(String typeInput, String brand) {
        super(typeInput, brand);
        this.idMouse = ++accMouse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mouse{idMouse=").append(idMouse);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
