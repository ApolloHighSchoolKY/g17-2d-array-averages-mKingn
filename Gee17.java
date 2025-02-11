public class Gee17{
  public static void main(String[] args){

    int[][] ray = new int[7][7];

    int fredrick = 1;

    for(row=0; row <ray.length; row++)
    {
      for(int col=0; col < ray[row].length; col++ )
      {
        ray[row][col] = fredrick;
        fredrick++;
      }
    }

    ArrayAverages twoDee = new ArrayAverages(ray);

    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
