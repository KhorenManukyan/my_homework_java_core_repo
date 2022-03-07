package book.shildt.javacore.chapter9.interfaces.interfaces_variables;

import java.util.Random;

public class Question implements SharedConstants {
    Random rand = new Random();

    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30) {
            return NO;
        } else if (prob < 60) {
            return YES;
        } else if (prob < 75) {
            return LATER;
        } else if (prob < 98) {
            return LATER;
        } else {
            return NEVER;
        }
    }
}
