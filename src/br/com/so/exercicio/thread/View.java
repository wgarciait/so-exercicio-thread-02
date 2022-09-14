package br.com.so.exercicio.thread;

public class View {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            ThreadId threadId = new ThreadId();
            threadId.start();
        }
    }
}
