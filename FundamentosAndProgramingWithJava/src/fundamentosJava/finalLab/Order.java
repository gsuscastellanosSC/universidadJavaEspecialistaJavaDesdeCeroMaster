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
public class Order {

    private final int idOrder;
    private Pc pcs[];
    private static int accOrders;
    private static final int MAX_PCS = 10;
    private int accPcs;

    public Order() {
        this.idOrder = ++Order.accOrders;
        this.pcs = new Pc[MAX_PCS];
    }

    public void addPc(Pc pc) {
        if (this.accPcs < Order.MAX_PCS) {
            this.pcs[this.accPcs++] = pc;
        } else {
            System.out.println("Max PC's Over Flow: " + Order.MAX_PCS);
        }
    }

    public void showOrder() {
        System.out.println("IdOrder#:" + this.idOrder);
        System.out.println("PC's in the Order: ");
        for (int i = 0; i < this.accPcs; i++) {
            System.out.println(this.pcs[i]);
        }
    }
}
