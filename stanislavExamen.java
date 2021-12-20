import java.util.*;
public class stanislavExamen {
    public static void main(String[]args) {
        Scanner teclat = new Scanner(System.in); 
    //declarem les variables//
    int matriuFrequencia[],minutsExercici;
    int edad;
    double percentatgeFCM;
    String matriuNivell[];

    //calculem FCM//
    System.out.println("Introdueix la teva edad per calcular la FCM: ");
    
        edad=teclat.nextInt();
    
    double FCM=(200-edad);
    
    System.out.println("la teva FCM es de : " + FCM);
   
    //preguntem minuts de exercici a realitzar//
   System.out.println("de quants minuts es l'exercici fisic? ");
        minutsExercici=teclat.nextInt();


    matriuFrequencia= new int [minutsExercici]; 
    matriuNivell= new String [11];   

    //preguntem al usuari la seva FC de cada minut del exercici//
    for (int i = 0; i < matriuFrequencia.length; i++) {
        System.out.println("FC del minut " + i + "del exercici fisic");

        matriuFrequencia[i]=teclat.nextInt();
        
        if(matriuFrequencia[i]==0){
            System.out.println("s'ha acabat l'exercici ");
            break;
        }
    }
    //informem al usuari sobre el nivell d'intensitat de cada minut de l'activitat//
    for (int i = 0; i < matriuFrequencia.length; i++) {
        percentatgeFCM=(matriuFrequencia[i]/FCM)*100;

        System.out.println("el percentatge de FCM del minut " + i + " ha estat de :" + percentatgeFCM);
        
         if(percentatgeFCM<=50){
            System.out.println("exercici massa suau,nivell indetectable");
        }
        if(percentatgeFCM>=50 && percentatgeFCM<60){
            System.out.println("minut " + i  + "--ha arribat al nivell 1 d'esforç,exercici molt suau");
            matriuNivell[i]="* ";
        }
        else if(percentatgeFCM>=60 && percentatgeFCM<70){
            System.out.println("minut" + i + "--ha arribat al nivell 2 d'esforç,exercici suau");
            matriuNivell[i]="* * ";
        }
        else if(percentatgeFCM>=70 && percentatgeFCM<80){
            System.out.println("minut" + i + "--ha arribat al nivell 3 d'esforç,exercici moderat");
            matriuNivell[i]="* * * ";
        }
        else if(percentatgeFCM>=80 && percentatgeFCM<90){
            System.out.println("minut" + i + "--ha arribat al nivell 4 d'esforç,exercici intens");
            matriuNivell[i]="* * * * ";
        }
        else if(percentatgeFCM>=90 && percentatgeFCM<=100){
            System.out.println("minut" + i + "--ha arribat al nivell 5 d'esforç,exercici ,maxim");
            matriuNivell[i]="* * * * * ";
        }
        
    }
        System.out.println();
        //informem el nivell assolit de cada minut de l'activitat//
        for (int a = minutsExercici; a >=0; a--) {
            if(matriuNivell[a]!=null){ 
            System.out.println("minut" + a + ":" + matriuNivell[a]);
            }

        }
        //mostra els 5 nivell possibles d'intensitat//
        System.out.println("nivell 1 2 3 4 5");

  









    }
}