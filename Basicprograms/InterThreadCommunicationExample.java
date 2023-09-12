package com.telus.Basicprograms;

public class InterThreadCommunicationExample {

    public static void main(String[] args) {
        final Message message = new Message();

        Thread senderThread = new Thread(new Runnable() {
            @Override
			public void run() {
                String[] messages = {
                    "ONE",
                    "TWO",
                    "THREE",
                    "FOUR",
                    "FIVE"
                };
                for (String msg : messages) {
                    message.send(msg);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                message.send("exit");
            }
        });

        Thread receiverThread = new Thread(new Runnable() {
            @Override
			public void run() {
                String msg = "";
                while (!msg.equals("exit")) {
                    msg = message.receive();
                    System.out.println(msg);
                }
            }
        });

        senderThread.start();
        receiverThread.start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String receive() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void send(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

