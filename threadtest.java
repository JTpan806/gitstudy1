
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
                add2();
                multiple(3);

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

    public static void add2(){
        count+=2;
    }
    
    public static void multiple(int x){
        count*=x;
    }

    public static int addTwice(){
        count ++;
        count ++;
        return count;
    }
}
