import java.util.Scanner;
class Main {    
    public static void main(String[] args) {    
        Scanner a = new Scanner(System.in);    
        String str1=a.nextLine();    
        StringBuffer newStr=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) 
        {        
            if(Character.isLowerCase(str1.charAt(i))) 
            {                 newStr.setCharAt(i,Character.toUpperCase(str1.charAt(i)));    
            }       
            else if(Character.isUpperCase(str1.charAt(i))) 
            {                     newStr.setCharAt(i,Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println(newStr);    
    }    
}     