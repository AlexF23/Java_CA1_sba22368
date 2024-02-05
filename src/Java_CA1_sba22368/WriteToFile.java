/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Java_CA1_sba22368;

import java.io.BufferedWriter;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
  public void write(String s1) {
    try {

    	 FileWriter myWriter = new FileWriter("C:\\Users\\Alexander\\Documents\\NetBeansProjects\\Java_CA1_sba22368\\students.txt",true);
    	 myWriter.write(s1);
         myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}