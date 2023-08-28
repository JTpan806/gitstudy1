
class ThreadTest {

    private static int count = 0;
    
    public static void main(String[] args){
        System.out.println("null");


        Runnable runnable = new Runnable() {
            @Override
            public void run(){
                increment();
                decrement();
                pow(3);
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


    public static void pow(int i){
        int ocount = count;
        for(int j=1;j<i;j++){
            
            int count2 = count * ocount;
            count = count2;
        }
    }
}


