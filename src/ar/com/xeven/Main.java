package ar.com.xeven;

/*
Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30)
donde los parámetros que se le pasan al constructor son las horas, los minutos
y los segundos respectivamente.  Si se suman por ejemplo 30m 40s y 35m 20s el
resultado debería ser 1h 6m 0s.

 */

public class Main {

    public static void main(String[] args) {

        Tiempo t1 = new Tiempo(1,20,30);
        Tiempo t2 = new Tiempo(0,30,40);
        Tiempo t3 = new Tiempo(0,35,20);

        System.out.println(t1+" + "+t2+" = "+t1.suma(t2));
        System.out.println(t2+" - "+t3+" = "+t2.resta(t3));

    }
}
