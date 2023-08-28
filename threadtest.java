
class ThreadTest {
    public static void main(String[] args){
        System.out.println("null");


        Runnable runnable = new Runnable() {
            @Override
            public void run(){

                System.out.println("runnable");
            }
        };

        runnable.run();

    }
}


