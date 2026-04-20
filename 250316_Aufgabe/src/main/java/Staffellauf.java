public class Staffellauf {

    protected static boolean stab = false;
    protected static boolean finish = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(new OwnRunnable(Type.STARTER));
        Thread t2 = new Thread(new OwnRunnable(Type.WAITER));
        Thread t3 = new Thread(new OwnRunnable(Type.PUBLIC));

        t1.start();
        t2.start();
        t3.start();

    }

    private static class OwnRunnable implements Runnable {

        Type type;

        public OwnRunnable(Type type) {
            this.type = type;
        }

        @Override
        public void run() {
            switch (this.type){
                case Type.STARTER:
                    try{
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    stab = true;
                    break;

                case Type.WAITER:
                    try{
                        Thread.sleep(3000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    while(!stab){
                        System.out.println("Waiting for stab");
                    }

                    System.out.println("Waiter arrived at the finish line");
                    finish = true;
                    break;

                case Type.PUBLIC:
                    while(!finish){

                        System.out.println("The public cheers");

                        try{
                            Thread.sleep(500);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }

                    }

                    break;
            }
        }
    }
}
