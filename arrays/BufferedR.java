import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedR
{
  public static void main(String[]args)throws IOException
  {
   BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Write your name");
   String name=reader.readLine();
   System.out.println("Welcome"+name);
   

  }
}
