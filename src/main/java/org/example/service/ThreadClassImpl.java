package org.example.service;

public class ThreadClassImpl extends Thread {

    private int threadNumber;
    public ThreadClassImpl(int number){
        this.threadNumber = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("%d from threadnumber %d",i,threadNumber));
        }
    }
}
