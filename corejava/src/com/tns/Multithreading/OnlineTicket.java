package com.tns.Multithreading;

class Ticket {
    int availableTickets = 5;

    synchronized void bookTicket(int tickets) {

        System.out.println(Thread.currentThread().getName()
                + " is trying to book " + tickets + " ticket(s)");

        if (availableTickets >= tickets) {

            int currentTickets = availableTickets;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            availableTickets = currentTickets - tickets;

            System.out.println(Thread.currentThread().getName()
                    + " booked " + tickets + " ticket(s)");

            System.out.println("Available tickets: " + availableTickets);

        } else {
            System.out.println(Thread.currentThread().getName()
                    + " cannot book tickets. Not enough tickets.");
        }
    }
}

class BookingTask implements Runnable {

    Ticket ticket;

    BookingTask(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        ticket.bookTicket(3);
    }
}

public class OnlineTicket {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        BookingTask b = new BookingTask(ticket);

        Thread t1 = new Thread(b, "Manu");
        Thread t2 = new Thread(b, "Shaiob");

        t1.start();
        t2.start();
    }
}
