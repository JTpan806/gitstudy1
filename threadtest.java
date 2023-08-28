
class ThreadTest {

    private static int count = 0;
    
    public static void main(String[] args){
        System.out.println("null");


        Runnable runnable = new Runnable() {
            @Override
            public void run(){
                increment();
                decrement();
                addTwice();
                System.out.println("runnable");
            }
        };

        runnable.run();
        System.out.println(count);
    }

    public static void increment(){
        count++;
    }

    public static void decrement(){
        count--;
    }

    public static int addTwice(){
        count += 2;
        return count;
    }
}


