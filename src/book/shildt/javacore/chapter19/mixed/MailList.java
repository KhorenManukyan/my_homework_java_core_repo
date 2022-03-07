package book.shildt.javacore.chapter19.mixed;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> mailLinkedList = new LinkedList<>();
        mailLinkedList.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        mailLinkedList.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        mailLinkedList.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

        for (Address element: mailLinkedList){
            System.out.println(element);
            System.out.println();
        }
    }
}
