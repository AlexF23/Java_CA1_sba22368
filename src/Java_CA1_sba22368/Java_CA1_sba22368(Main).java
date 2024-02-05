/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Java_CA1_sba22368;

/** //https://github.com/AlexF23/Java_CA1_sba22368.git// **github link**
 *
 * @author Alexander
 */
public class Java_CA1_sba22368 {
private static String firstName;
	private static String lastName;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader filereader = new FileReader("C:\\Users\\Alexander\\Documents\\NetBeansProjects\\Java_CA1_sba22368\\students.txt"); // the the data from the .txt file
        WriteToFile write= new WriteToFile(); // create class file called Filereader to read the .txt file
        
        for(int i=0;i<filereader.getInputArray().size();i=i+3) { 
            
            String firstLine=filereader.getInputArray().get(i).trim();
				String secondLine=filereader.getInputArray().get(i+1).trim();
				String thirdLine=filereader.getInputArray().get(i+2).trim();
                                
                                if(countWhiteSpace(firstLine)&&parseName(firstLine)&& checkFirstName()&&checkNumber(secondLine)&& checkStudentNumber(thirdLine))
                                {
                                    //System.out.println(firstLine);
					System.out.println("valid");
					String workType="";
					switch(Integer.parseInt(secondLine))
					{
					case 1:workType="Very Light";break; // change the workload Int to the type of workload it is (Very light/ light/ part time/ full time)
					case 2:workType="Light";break;
					case 3:workType="Part Time";break;
					case 4:workType="Part Time";break;
					case 5:workType="Part Time";break;
					default:workType="Full Time";
					}
					write.write(thirdLine+"-"+lastName.trim()+"\r\n"+workType+"\r\n"); // format the rewrite the file
                                    
                                } //created two classes called "FileReader" & "WriteToFile"
        }
        
    }
// Methods below for checking the students.txt file
    
    private static boolean countWhiteSpace(String s1) {
        //b) The second name can be letters and/or numbers and must be separated from the
		//first name by a single space; 
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				count++;
				
				
			}
		}
		if(count==1)
		{
			//System.out.println("here");
			return true;
		}
		else
		{
			return false;
		
        
    }
                
    }
    private static boolean checkFirstName() { //check to see if the first name has letters
       
		//a)	the first name must be letters only; 
		//System.out.println(firstName);
//		if(firstName.contains("3"))
//		{
//			return false;
//		}
		if(firstName.matches(".*\\d.*"))
			{
				
				return false;
			}
		return true;

    }

    private static boolean parseName(String s1) {
        for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				firstName=s1.substring(0,i);
				lastName=s1.substring(i);
				
//				System.out.println(firstName);
//				System.out.println(lastName);
				return true;
    }
        
                } return false;
    }
    private static boolean checkNumber(String s1) { //check to see if the classes are between 1 and 8 
        
     //   c)	the number of classes must be an integer value between 1 and 8 (inclusive), and 
			int num = Integer.parseInt(s1);
			if(num<1 ||num>8)
			{
				return false;
			}
		
		return true;
        
    }

    private static boolean checkStudentNumber(String s1) {
        //		d)	the student “number” must be a minimum of 6 characters with the first 2 characters
		//being numbers, the 3rd  and 4th characters (and possibly 5th ) being a letter, and everything after the last letter character being a number.
		//String alpha="abcdefghijklmnopqrstuvABCDEFGHIJKLMNOPQRSTUVWXYZ";
                
          
           
           
		
		if(s1.length()<6)
		{
			return false;
		}
		String one=""+s1.charAt(0);
		String two=""+s1.charAt(1);
		String three=""+s1.charAt(2);
		String four=""+s1.charAt(3);
		String five=""+s1.charAt(4);
                
                 //     1)	Ensure that the student number year is at least 2020 (i.e. that the number starts with 20 or higher) 
                
                if (Integer.parseInt(one)<2) { //covert (one) String to an Int and check to see if it is laess than 2
                    return false;
                }
	
		
		if((!one.matches("\\d")||!two.matches("\\d")))
		{
			return false;
		}
		else if(three.matches("\\d")||four.matches("\\d"))
		{
			return false;
		}
		else if(!five.matches("\\w"))
		{
			return false;
		}
		else if(s1.substring(5).matches(".*[a-zA-Z].*"))
		{
			return false;
		}
				
      //          2)	Ensure that the number after the letter(s) is reasonable – i.e. that it is between 1 and 200
                //55PUP4478
                //012345678
                else if (s1.substring(5).length()<1 && s1.substring(5).length()>200) {
                    
                    return false;
                }
                
		return true;
        
    }
    
}
