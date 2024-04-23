public class APLine{
  private int myA, myB, myC;
  public APLine(int a, int b, int c){
    myA = a;
    myB = b;
    myC = c;
  }
  public double getSlope(){
    return(-(myA)/(double)(myB));
  }
  public boolean isOnline(int x, int y){
    if(((myA*x) + (myB*y) - myC) == 0){
      return true;
    }
    return false;
  }
}
