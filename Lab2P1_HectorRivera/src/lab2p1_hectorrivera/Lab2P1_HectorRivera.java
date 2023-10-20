/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_hectorrivera;
import java.util.Scanner;

public class Lab2P1_HectorRivera {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char desc = 's';
        while (desc=='s' || desc=='S'){
            System.out.println("-------Menu--------");
            System.out.println("1.Dibujando triángulos");
            System.out.println("2.Área de figuras");
            System.out.println( "3.Evaluando números");
            System.out.println("");
            System.out.println("Elija una opcion: ");
            int opcion = leer.nextInt();
            
            if (opcion==1){
                System.out.println("--Dibujando triángulos--");
                System.out.println("Introduzca La longitud del lado A: ");
                int A = leer.nextInt();
                System.out.println("Introduzca La longitud del lado B: ");
                int B = leer.nextInt();
                System.out.println("Introduzca La longitud del lado C: ");
                int C = leer.nextInt();
                if(A<0||B<0||C<0) {
                    System.out.println("No puede haber negativo");
                }else{
                    if (A+B> C && A+C> B && C+B> A){
                        System.out.println("Su forma es un triangulo");
                    }else{
                        System.out.println("Su forma NO es un triangulo");
                    }//fin else
                }//fin else
            }//fin opcion1
            
            if (opcion==2){
                System.out.println("--Área de figuras--");
                char desc2='s';
                while(desc2=='s'||desc2=='S'){
                    System.out.println("Que tipo de forma va a usar");
                    System.out.println("1.Rectangulo");
                    System.out.println("2.triangulos");
                    System.out.println("3.circulo");
                    System.out.println("Ingrese el numero de su opcion: ");
                    int numd= leer.nextInt();
                    System.out.println("");
                    if (numd==1){
                        System.out.println("--Rectangulo--");
                        System.out.println("Ingrese la base");
                        double base = leer.nextDouble();
                        System.out.println("Ingrese la altura");
                        double alt = leer.nextDouble();
                        if (base>0||alt>0){
                            System.out.println("Area del rectangulo: "+ base*alt );
                        }else{
                            System.out.println("Los lados no pueden ser negativos");
                        }//fin else
                    }else{
                        if(numd==2){
                            System.out.println("--Triangulo--");
                            System.out.println("Ingrese la base");
                            double base = leer.nextDouble();
                            System.out.println("Ingrese la altura");
                            double alt = leer.nextDouble();
                            if (base>0||alt>0){
                                System.out.println("Area del triangulo: "+ base*alt*0.5 );
                            }else{
                                System.out.println("Los lados no pueden ser negativos");
                            }//fin else  
                        }else{
                            if(numd==3){
                                System.out.println("--Circulo--");
                                System.out.println("Ingrese el radio");
                                double radio = leer.nextDouble();
                                if (radio>0){
                                    System.out.println("Area del circulo: "+ Math.PI*Math.pow(radio, 2));
                                }else{
                                    System.out.println("el radio no puede ser negativo");
                                }//fin else
                            }//fin if
                        }//fin else
                }//fin else
                System.out.println("");
                System.out.println("Desea ingresar otra forma[s/n]");
                desc2=leer.next().charAt(0); 
                }//fin while
            }//fin opcion2
                
            if (opcion==3){
                System.out.println("--Evaluando números--");
                System.out.println("Ingrese un numero");
                int num=leer.nextInt();
                int cont=0;
                int div=1;
                boolean par;
                if (num%2==0){
                    par=true;
                }else{
                    par=false;
                }//Par o impar
                
                while(cont<=2){
                    if (num%div==0){
                        cont++;
                    }
                    div++;
                }//cuantos son divisibles
                if (par==true&&cont>2){
                    System.out.println("El numero es par. ");
                }else{
                    if(par==true&&cont<=2){
                        System.out.println("El numero es par y primo. ");
                    }else{
                        if(par==false&&cont>2){
                            System.out.println("El numero es impar. ");
                        }else{
                            if(par==false&&cont<=2){
                                System.out.println("El numero es impar y primo.");
                            }
                        }
                    }
                }   
            }//fin opcion3
            System.out.println("Desea continuar[s/n]");
            desc =leer.next().charAt(0);
            System.out.println("");
        }//fin while
    }//fin void  
}//fin class
