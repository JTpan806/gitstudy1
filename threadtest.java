
class ThreadTest {

    private static int count = 0;
    
    public static void main(String[] args){
        System.out.println("null");


        Runnable runnable = new Runnable() {
            @Override
            public void run(){
                increment();
                decrement();
<<<<<<< HEAD
                divide(1);
=======
                addTwice();
                add2();
                multipule();
>>>>>>> 0ec09675d76305ec32aafbd89e0aa2dc047a66a0
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

<<<<<<< HEAD
    public static void divide(int x){
         
        
        count /= x;
    }

=======
    public static void add2(){
        count+=2;
    }

    public static int addTwice(){
        count ++;
        count ++;
        return count;
    }
    
    public static int multiple(int x){
        x=10;
    	count *=x;
    	return count;
    }
>>>>>>> 0ec09675d76305ec32aafbd89e0aa2dc047a66a0
}


