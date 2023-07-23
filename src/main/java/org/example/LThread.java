package org.example;

public class LThread extends Thread{
    Runnable printFirst = new printFirst();
    Runnable printSecond = new printSecond();

    Runnable printThird = new printThird();

    public LThread(Runnable tr1, String name) {
        super(name);
    }

    public void run(Foo f, int num) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        if (num == 1) {
            f.first(printFirst);
        } else if (num == 2) {
            f.second(printSecond);
        } else {
            f.third(printThird);
        }
    }
}
