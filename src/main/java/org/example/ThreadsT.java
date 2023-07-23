package org.example;

public class ThreadsT {
    public  static void main(String[] args) throws Exception {
        Foo f = new Foo();
        Runnable printFirst = new printFirst();
        Runnable printSecond = new printSecond();
        Runnable printThird = new printThird();



        Runnable tr1 = ()->{
            try{
                f.first(printFirst);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        };

        Runnable tr2 = ()->{
            try{
                f.second(printSecond);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        };

        Runnable tr3 = ()->{
            try{
                f.third(printThird);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        };

        Thread t1 = new Thread(tr1, "A");
        Thread t2 = new Thread(tr2, "B");
        Thread t3 = new Thread(tr3, "C");

        t3.start();
        Thread.sleep(500);
        t2.start();
        Thread.sleep(500);
        t1.start();
    }

}
