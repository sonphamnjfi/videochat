/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import javax.imageio.ImageIO;

/**
 *
 * @author sonph
 */
public class testchangebyte {
    
    public static void main(String[] args) throws IOException{
        String dirName="D:\\";
        ByteArrayOutputStream baos=new ByteArrayOutputStream(1000);
        BufferedImage img=ImageIO.read(new File(dirName,"rose.jpg"));
        ImageIO.write(img, "jpg", baos);
        baos.flush();
 
        String base64String=Base64.getEncoder().encodeToString(baos.toByteArray());
            
        baos.close();
 
        byte[] bytearray = Base64.getDecoder().decode(base64String);
               decode(base64String);
 
        BufferedImage imag=ImageIO.read(new ByteArrayInputStream(bytearray));
        ImageIO.write(imag, "jpg", new File(dirName,"snap.jpg"));
    }
    
}
