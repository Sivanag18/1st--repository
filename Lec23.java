package Arrays.Stirngs;

import java.util.Scanner;

public class Lec23 {
    public static void main(String[] args) {
        String name = "CipherSchools"; // Created using string literals and stored in method area.
        String name2 = "CipherSchools";


        String name3 = new String("CipherSchools"); // creating string using constructors.
        String name4 = new String("CipherSchools");


        System.out.println(name==name2);  //compares reference for objects and values for primitive data types.
        System.out.println(name3==name4);
        System.out.println(name==name3);

 

System.out.println("-------------------------");
// Strings are immutable
// Everytime we do an operation on a string , a new object is created

  System.out.println("1. Concatenation.");
     String s1 = "Hello";
     s1 = s1 + "Peeps";
     System.out.println(s1);
     

     System.out.println("------------------------------");
    
    String s3 = new String("I would");
    String s4 = new String (" love it.");
    String s5 = s3.concat(s4);
    System.out.println(s5);


    System.out.println("----------------------");
    System.out.println("2. Checking if strings are equal in value"); 
    System.out.println(name.equals(name2));
    System.out.println(name.equals(name3));
     
    System.out.println("-------------------------");
    System.out.println("3. Creating new string object from character array");
    char arr[] = {'A','M','M','A'};
    String arrtostring = new String(arr);
    System.out.println(arrtostring);
 
   System.out.println("---------------------------");
   System.out.println("4. Creaating partial string object from character array");
   String pararr = new String(arr,1,3);
   System.out.println(pararr);
   String patarr2 = new String(arr,0,2);
   System.out.println(patarr2);

   System.out.println("------------------------------");
   System.out.println("5. changing case of string");
   System.out.println(name.toUpperCase());
   System.out.println(name.toLowerCase());   


   System.out.println("---------------------------------");
   System.out.println("6. Splitting");
   System.out.println("Please enter your full name");
   Scanner sc  = new Scanner(System.in);
   String fullname = sc.nextLine();
   String arr1[] = fullname.split(" ");
   for(int i = 0; i<arr1.length; i++){
    System.out.println(arr1[i]);
   }
 
   System.out.println("Please enter something by commas");
  // Scanner sc  = new Scanner(System.in);
   String fullname1 = sc.nextLine();
   String arr2[] = fullname1.split(",");
   for(int i= 0; i<arr2.length; i++){
    System.out.println(arr2[i]);
   }


    System.out.println("Please enter somwthing with dots.");
 //  Scanner sc  = new Scanner(System.in);
   String fullname3 = sc.nextLine();
   String arr3[] = fullname3.split("[.]");
   for(int i = 0; i<arr3.length; i++){
    System.out.println(arr3[i]);
   }
   
   System.out.println("-----------------------------");

   System.out.println("7. Length of the string");
   int len = name.length();
   System.out.println("Length of :" + name +"is" + len);
   

   System.out.println("____________---------------");
   System.out.println("8. Finding index of a char in a string");
   int index = name.indexOf("e");
   System.out.println("Index of e in name"+ name + "is:"+ index);

   



    }
}
