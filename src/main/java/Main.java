public class Main {

    public static void main(String[] arg){

        ThreadClass thread1 = new ThreadClass();
        ThreadClass thread2 = new ThreadClass();
        ThreadClass thread3 = new ThreadClass();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
