package br.com.so.exercicio.thread;

public class ThreadId extends Thread{

    @Override
    public void run() {
        System.out.println("Thread Id = " + getId());
    }
}
