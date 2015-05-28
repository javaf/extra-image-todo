// @wolfram77
package main;

// required modules
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;



public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedImage img = ImageIO.read(new File("0.jpg"));
        // ImageIO.write(img, "jpg", new File("1.jpg"));
        ImageWriter wrt = ImageIO.getImageWritersByFormatName("jpeg").next();
        ImageWriteParam iwp = wrt.getDefaultWriteParam();
        iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        iwp.setCompressionQuality(0.5f);
        wrt.setOutput(ImageIO.createImageOutputStream(new File("1.jpg")));
        wrt.write(null, new IIOImage(img, null, null), iwp);
        System.out.println(img);
    }
}
