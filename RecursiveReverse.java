import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecursiveReverse
{
  public static void main (String[] args)
  {
    try
    {
      //declare our reader and writer
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter writer = new PrintWriter(System.out);
    
      //parse our reader and writer to our function
      RecursiveReverse(reader, writer);
    
      //close our reader and writer
      writer.close();
      reader.close();
    }
    //catch any exceptions thrown
    catch (Exception e)
    {
      //print any exceptions
      System.err.println(e);
    }
    
  }
  
  public static void RecursiveReverse(BufferedReader reader, PrintWriter writer) throws Exception
  {
    //initialize our headLine each time the function is called
    //just to be safe
    String headLine = "";
    
    //line is read in the if loop
    if ((headLine = reader.readLine()) != null)
    {
      //if there is another line to be read lets call this function again
      //which will read the next line if its not null lets repeat
      //once it is null this cannot be called again and each subsequent
      //function moves on to println one at a time
      RecursiveReverse(reader,writer);
      //only writes once all has been read
      writer.write(headLine + "\n");
    }
  }
}
