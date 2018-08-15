package com.java8.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author Benjamin Winterberg
 */
public class ExecutorsFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
//        test1();
        futureGet();
//        test3();
    }

    private static void test3() throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        Future<Integer> future = executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        });

        System.out.println("Future result: "+future.get(3, TimeUnit.SECONDS));
        executor.shutdownNow();
    }

    private static void futureGet() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<emp> m = new ArrayList<>();
        List<emp> l = new ArrayList<>();
        l.add(new emp("mike", "akopov"));
        l.add(new emp("alex", "akopov"));
        l.add(new emp("inna", "akopov"));
        l.add(new emp("innel", "akopov"));
        l.add(new emp("valery", "akopov"));
        l.add(new emp("artem", "akopov"));


        l.stream().forEach(z -> {
            Future<emp> s = executor.submit(() -> {
                String n = z.getLastName().toUpperCase();
                z.setLastName(n);
//                m.add(z);
                System.out.println("For Each z: "+z+" ->Thread: "+Thread.currentThread().getName());
                return z;
            });
            try {
                m.add(s.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

//        Future<Integer> future = executor.submit(() -> {
//            try {
//                TimeUnit.SECONDS.sleep(1);
//                return 123;
//            }
//            catch (InterruptedException e) {
//                throw new IllegalStateException("task interrupted", e);
//            }
//        });

        executor.shutdown();
//        future.get();

        m.stream().forEach(s -> {
//            try {
//                System.out.println("First name: " + s.get().getFirstName()+" Last name: "+s.get().getLastName());
                System.out.println("First name: " + s.getFirstName()+" Last name: "+s.getLastName());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
        });
    }

    private static void test1() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        Future<Integer> future = executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        });

        System.out.println("future done: " + future.isDone());

        Integer result = future.get();

        System.out.println("future done: " + future.isDone());
        System.out.print("result: " + result);

        executor.shutdownNow();
    }

    public static class emp {
        String firstName;
        String lastName;
    	
		public emp(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "emp{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    }
}

