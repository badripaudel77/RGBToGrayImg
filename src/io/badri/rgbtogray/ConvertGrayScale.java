package io.badri.rgbtogray;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ConvertGrayScale {
    public static void main(String... args) { 
    	try {
    		//search for the RGB image (input file).
            File inputFile = new File("D:/photo collection/Banasthali photo/rgbimg.jpg");
            
            // locating ImageReaders and ImageWriters, 
            // and performing simple encoding and decoding.
           
            /* 
             * ImageIO Returns a BufferedImage as the result of decoding 
               supplied File with an ImageReaderchosen automatically from among those currently registered
             */
            BufferedImage image = ImageIO.read(inputFile); //Read an image, ImageIO returns BufferedImage

            int width = image.getWidth();
            int height = image.getHeight();
            
            //Constructs a BufferedImage of one of the predefined image types, width, ht. and type as params
            BufferedImage result = new BufferedImage(
                    image.getWidth(),
                    image.getHeight(),
                    BufferedImage.TYPE_INT_RGB);
          
            Graphics2D graphic = result.createGraphics();
            graphic.drawImage(image, 0, 0, Color.WHITE, null);

            //loop over each pixels and calculate the rgb grayscale
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                	
                    Color c = new Color(result.getRGB(j, i));
                    
                    int red = (int) (c.getRed() * 0.299);
                    int green = (int) (c.getGreen() * 0.587);
                    int blue = (int) (c.getBlue() * 0.114);
                                        
                    Color newColor = new Color(
                            red + green + blue,
                            red + green + blue,
                            red + green + blue);
                    
                    result.setRGB(j, i, newColor.getRGB());
                }
            }

            //what is filename to be created ? 
            File outputFile = new File("/D:/photo collection/Banasthali photo/grayimg.jpg");
            ImageIO.write(result, "jpg", outputFile);
            System.out.println("image converted to the gray from rgb.");

        }
    	   catch (IOException e) {
               e.printStackTrace();
         }
    }
}
