// @wolfram77
package main;

// required modules
import java.awt.image.*;
import javax.imageio.*;
import java.util.*;
import java.io.*;



public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedImage img = ImageIO.read(new File("0.jpg"));
        ImageIO.write(img, "jpg", new File("1.jpg"));
        for(Iterator<ImageWriter> i = ImageIO.getImageWritersByFormatName("bmp"); i.hasNext();)
            System.out.println(i.next());
        System.out.println(img);
    }
}
