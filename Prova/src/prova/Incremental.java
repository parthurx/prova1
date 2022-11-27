/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

public class Incremental {

    private static final Incremental instance = new Incremental();

    public static Incremental getInstance() {
        return instance;
    }
    private static int count = 0;
    private int number;

    public void IncrementalNumber(int n) {
        for (int i = 0; i < n; i++) {
            number = ++count;
            System.out.println("Incremental " + number);
        }
    }
}
