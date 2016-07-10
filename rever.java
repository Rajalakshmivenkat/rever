import java.io.*;
import java.util.*;
import java.lang.*;
public class Rever
{
public static void main(String[] args) 
{
    // Using treditonal approach
    String result="";
    for (int i=string.length()-1; i>=0; i--) 
    {
        result = result + string.charAt(i);
    }
    System.out.println(result);

    // Using StringBuffer class
    StringBuffer buffer = new StringBuffer(string);
    System.out.println(buffer.reverse());    
}
}
