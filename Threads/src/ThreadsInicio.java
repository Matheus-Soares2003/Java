public class ThreadsInicio {

    public static void main(String[] args) {

        MeuRunnable target = new MeuRunnable();

        //Thread Atual
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        //Nova Thread
        Thread t1 = new Thread(target);
        //t1.run(); //apenas executando na mesma thread (main)
        //t1.start(); //executando em uma nova thread

        //Runnable como lambda
        Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));

        //Utilizando várias threads
        Thread t3 = new Thread(target);

        t1.start();
        t2.start();
        t3.start();
    }
}