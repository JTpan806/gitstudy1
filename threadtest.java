
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
                multiple(2);
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
        count *=x;
    }
    
    public static int addTwice(){
        count ++;
        count ++;
        return count;
    }
    public static void pow(int n){
        n=2;
    for( i = 0; i < n; i++){
        count =5 ;
        count = count * count;

    }

}

}


