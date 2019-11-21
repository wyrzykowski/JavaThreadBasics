public class Main {

    public static void main(String[] arg){

        //Approach I - extends Threads class
//        ThreadClass thread1 = new ThreadClass();
//        ThreadClass thread2 = new ThreadClass();
//        ThreadClass thread3 = new ThreadClass();

//        thread1.start();
//        thread2.start();
//        thread3.start();


        //Approach II - implements runnable interface

        Thread threadRunnable1 = new Thread(new ThreadClassRunnable());
        Thread threadRunnable2 = new Thread(new ThreadClassRunnable());



        threadRunnable1.start();
        threadRunnable2.start();
    }
}
