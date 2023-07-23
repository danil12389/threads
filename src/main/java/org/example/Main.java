package org.example;

import javax.swing.table.TableRowSorter;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        //num = [1,2,3]

        Foo f = new Foo();

        KThread a = new KThread("THREAD_A");
        KThread b = new KThread("THREAD_B");
        KThread c = new KThread("THREAD_C");
        System.out.println("0 " + Thread.activeCount());
        a.start();
        a.run(f, 2);
        Thread.sleep(500);
        b.start();
        b.run(f, 1);
        Thread.sleep(500);
        c.start();
        c.run(f, 3);

        a.join();
        b.join();
        c.join();


    }
}