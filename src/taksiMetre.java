import java.util.Scanner;

public class taksiMetre {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("Lutfen Km Bilgisi Giriniz : ");
        double km = girdi.nextDouble();
        double tMetre = 2.20, total = 10;

        total += (km*tMetre);


        total=(total<20) ? 20 : total;
        System.out.println("Lutfen Km Bilgisi Giriniz : " + total);
      //-----------------------------------------------------------------------------//
        //*if(total<=20) {
          //  ;
           // System.out.println("20");
            //total = 20;
       // }else{
           // total = total + 0;

          //  System.out.println(total);
        //---------------------------------------------------------------------------//
        }



    }
