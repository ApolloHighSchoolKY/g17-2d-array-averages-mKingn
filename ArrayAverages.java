import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages()
  {
    int total=0;
    int length;
    for(int row[]: rayray)
    {
      for(int col: rayray[row])
      {
        total+=rayray[row][col];
      }

      length= rayray[row].length;
      total = total / length;

      System.out.println("the average of row " + row + " is " + total);
      total = 0;
      length = 0;
    }
  }

  public void columnAverages()
  {
    int total=0;
    int length;
    for(int col[]: rayray)
    {
      for(int row: rayray[col])
      {
        total+=rayray[col][row];
      }

      length= rayray[col].length;
      total = total / length;

      System.out.println("the average of collum " + col + " is " + total);
      total = 0;
      length = 0;
    } 
  }

  public void arrayAverage()
  {
    int total=0;
    int length=0; 
    for(row=0; row <rayray.length; row++)
    {
      for(int col=0; col < rayray[row].length; col++ )
      {
        total+= rayray[row][col];
        length++;
      }
    }
    total = total / length;

    System.out.println("the average of the array is " + total);

  }

  public String toString()
  {
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
