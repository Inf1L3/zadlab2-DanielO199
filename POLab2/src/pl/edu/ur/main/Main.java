package pl.edu.ur.main;

import java.util.Scanner;


public class Main {

    
   
    public static void main(String[] args) {
        
        //ZADANIE 3
        
        /*
         int [] tablica= new int[10];
        

System.out.println("Podaj 10 liczb do tablicy ");

for(int i=0;i<10;i++)
{
	Scanner input= new Scanner(System.in);
	tablica[i]= input.nextInt();

}
System.out.println("Wybierz liczbe 1 ,2 ,3 lub 4");
Scanner in= new Scanner(System.in);
    int a=in.nextInt();
if(a==1){
System.out.println("Elementy tablicy od pierwszego do ostatniego");
for(int i=0;i<10;i++)
{
	
	System.out.println(tablica[i] + " ");
}
}
else if(a==2){
System.out.println("Elementy tablicy od ostatniego do pierwszego");
for(int i=9;i>=0;i--)
{
	
	System.out.println(tablica[i] + " ");
}
}

else if(a==3){
System.out.println("Elementy tablicy o numerach parzystych");
for(int i=0;i<10;i+=2)
{
	
	System.out.println(tablica[i] + " ");
}}

else if(a==4){
System.out.println("Elementy tablicy o numerach nieparzystych");
for(int i=1;i<10;i+=2)
{
	
	System.out.println(tablica[i] + " ");
}
}
        */
        
        
        
        
        
         
        //ZADANIE 4
        
        /*
          int[] tablica = new int[10];

        System.out.print("Podaj 10 liczb do tablicy ");

        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            tablica[i] = input.nextInt();

        }
        System.out.print("Wybierz 1 ,2 ,3 ,4 lub 5 ");
        Scanner input2 = new Scanner(System.in);
        int a = input2.nextInt();
        switch (a) {
            case 1:
                int suma = 0;
                for (int i = 0; i < 10; i++) {
                    suma += tablica[i];

                }

                System.out.print("Suma liczb z tablicy wynosi:" + suma);
                break;
            case 2:
                int iloczyn = 1;
                for (int i =0 ; i <10; i++) {
                    iloczyn = iloczyn * tablica[i];

                }

                System.out.print(" Iloczyn liczb z tablicy wynosi:" + iloczyn);
                break;
            case 3:
                int suma1 = 0;
                for (int i = 0; i < 10; i++) {
                    suma1 += tablica[i];

                }
                int srednia = suma1/ 10;
                System.out.print(" Srednia liczb z tablicy wynosi:" + srednia);
                break;
            case 4:
                int min = tablica[0];
                for (int i = 1; i < 10; i++) {
                    if (min > tablica[i]) {
                        min = tablica[i];
                    }

                }

                System.out.print(" Najmniejszy element tablicy to: " + min);
                break;
            case 5:
                int maks =tablica[0];
                for (int i = 1; i < 10; i++) {
                    if (maks < tablica[i]) {
                        maks = tablica[i];
                    }

                }

                System.out.print("Najwiekszy element tablicy to: " + maks);
                break;
        }
        
           */
        
        
        
        //ZADANIE 6
        
        /*
        int[]t = new int[10];
for(int i=9;i<10;i--)
{

	System.out.println("Podaj liczbe calkowita");
	Scanner input= new Scanner(System.in);
	t[i]= input.nextInt();
		if(t[i]<0){
			break;
			
			  }
}

     System.out.print("Podales liczbe mniejsza od zera, KONIEC" );
        */
        
        
      //ZADANIE 7
      
      /*
        System.out.println("Wprowadz n:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] t = new int[n];
        System.out.println("Wprowadz " + n + " liczb do tablicy:");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            t[i] = input.nextInt();

        }

 
        int i, j, a,f;
        System.out.println("Zawartosc tablicy: ");
         
        for(i = 0; i < n; i++) {
            System.out.print(t[i] + " ");}
         
        for (i = 0; i < n - 1; i++){       
           for (j = 0; j < n - 1; j++){
                if(t[j] > t[j + 1]){
                    a = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = a;
                    }
                }
          }                 
        System.out.println();
        System.out.println("Posortowana tablica: ");        
        for(i = 0; i < t.length; i++) System.out.print(t[i] + " ");
        
        
      */
        
        
    }
    }
        
        
        /*
        outer:
        for(int i=0;i<20;i++){
            if (i==2 || i ==6 || i==9 || i==15 || i==19)
            continue;
           
           System.out.println(i);
        
        }
        */
    
    /*    
        System.out.println("Podaj liczbe");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        int i=0;
        while(i<100){
            System.out.println("Petla numer: "+i);
            System.out.println("a="+a);
            a+=1;
            i++;
        }
        
    }}

      /* 
        System.out.println("Podaj liczbe");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        {
        switch (a) {
            case 1:
                System.out.println("Styczen");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecien");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpien");
                break;
            case 9:
                System.out.println("Wrzesien");
                break;
            case 10:
                System.out.println("Pazdziernik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzien");
                break;
        }
        }
    }*/

      

