import java.util.*;  
public class main
{  
    public static void main(String[] args)  
    {  
	String firstName = "John ";
    	String lastName = "Doe";

	String checkName = "john";
	String checkPass = "password";

	String strUname = null;
	String strPass = null;

	Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
    	System.out.println("Enter user name: ");  
    	strUname = sc.nextLine();              //reads string
	
	System.out.println("Enter Password: ");
	strPass = sc.nextLine();

	if (checkName.equals(strUname))
	{
		if(checkPass.equals(strPass))
		{
			System.out.println (firstName + " " + lastName);
		}	
		else
		{
			System.out.println("Password is: " + strPass);
		}
	
	}	


    	System.out.print("have a great day");             
    }  
}  
