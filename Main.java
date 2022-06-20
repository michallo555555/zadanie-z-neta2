
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("arytmetyczna ujemnych iloczyn dodatnich wpiszesz 0 to sie skonczy");
    Scanner scan=new Scanner(System.in);
    int iloczyn=1;
    int arytmetyczna=0;
    int[] tablica= new int[100];

    for (int i=0;i<100;i++)
      {
        tablica[i]=scan.nextInt();
        if (tablica[i]>0)
        {
          iloczyn=iloczyn*tablica[i];
          
        }  else if (tablica[i]<0)
        {
          arytmetyczna=arytmetyczna+tablica[i];
        } else if (tablica[i]==0)
        {
          arytmetyczna=arytmetyczna/(i);
          System.out.println("iloczyn="+ iloczyn);
          System.out.println("arytmetyczna="+ arytmetyczna);
        }
      } 
    {
      
    }
  
  }
}