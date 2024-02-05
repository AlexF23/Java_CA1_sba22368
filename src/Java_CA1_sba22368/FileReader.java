/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_CA1_sba22368;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class FileReader {
   
    ArrayList<String> input2 = new ArrayList<>();

    public FileReader(String fileLocation) {
        File file = new File(fileLocation);
	    	
	       
	        //wrap in try catch to handle no file at location
	        try {
	        	//covert file to scanner object that we can scan thru
	            Scanner scan = new Scanner(file);
	            
	            //loop thru the file until no lines left
	            
	            while(scan.hasNextLine())
	            {
	            	 input2.add(scan.nextLine());
	            	
	            }
	            //done with the scanner
	            scan.close();
	        } catch (Exception e) {
	            System.err.println(e);
	            System.out.println("No line left");
	            
	        } 

	    }
	    
	    public ArrayList<String> getInputArray()
	    {
	    	return input2;