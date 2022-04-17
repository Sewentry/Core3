package lesson4;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CheckExecutorService{
        public static void main(String[] args) throws InterruptedException {
            final int size = 10;
            final int h = size / 2;
            float[] arr = new float[size];
            oneTreadsMethod(arr);
            twoTreadsMethod(arr);

        }
        public static void oneTreadsMethod (float arr[]){

            Arrays.fill(arr, 1);
            long a =System.currentTimeMillis();
            for(int i=0;i<arr.length;i++){
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            }

            System.out.println(System.currentTimeMillis()-a);
        }
        public static  void twoTreadsMethod (float arr[]) throws InterruptedException {

            Arrays.fill(arr, 1);
            long a = System.currentTimeMillis();
            ExecutorService pool = Executors.newFixedThreadPool(2);

            for (int k = 0; k < arr.length; k++) {
                int i = k;
                pool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                });
            }
            pool.shutdown();
            System.out.println(System.currentTimeMillis()-a);


        }

}