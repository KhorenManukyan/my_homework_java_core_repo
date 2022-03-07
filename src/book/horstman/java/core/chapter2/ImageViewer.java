package book.horstman.java.core.chapter2;

import javax.swing.*;
import java.awt.*;

/**
 * A program for viewing images.
 * @version 1.31 2018-04-10
 * @author Cay Horstmann
 */
public class ImageViewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ImageViewerFrame frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
