public class Synchronized_1 {

    static int i = -1;

    public static void main(String[] args) {

        //Synchronized não é tao utilizada hoje, mas ainda é boa para aprender sobre concorrência de threads
        MeuRunnable2 runnable2 = new MeuRunnable2();

        Thread t0 = new Thread(runnable2);
        Thread t1 = new Thread(runnable2);
        Thread t2 = new Thread(runnable2);
        Thread t3 = new Thread(runnable2);
        Thread t4 = new Thread(runnable2);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

    public static class MeuRunnable2 implements Runnable {

        @Override
        public synchronized void run() { //só uma thread pode executar o run usando a mesma instancia
            i++;
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + i);
        }
    }

}
