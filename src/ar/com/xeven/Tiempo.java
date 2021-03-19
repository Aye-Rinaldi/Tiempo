package ar.com.xeven;

import javax.rmi.CORBA.Tie;

public class Tiempo {
    //atr
    private int segundos;
    private int horas;
    private int minutos;

    //constructores
    public Tiempo(int horas,int minutos,int segundos){
        this.segundos = (horas*3600) + (minutos*60) + (segundos);
    }

    public Tiempo(int segundos){
        this.segundos = segundos;
    }

    //getters segundos
    public int getSegundos() {
        return segundos;
    }

    //método para ver los intervalos
    //de tiempo de la forma 10h 35m 5s.
    @Override
    public String toString() {
        int segundos = this.segundos;
        int horas = segundos / 3600;
        segundos -= horas*3600;
        int minutos = segundos / 60;
        segundos -= minutos*60;

        if (this.segundos<0){ //para cuando resta
            return "-("+(-horas)+"h "+(-minutos)+"m "+(-segundos)+"s)";
        } else {
            return horas+"h "+minutos+"m "+segundos;
        }
    }

    public Tiempo suma(Tiempo t){
        return new Tiempo(this.segundos + t.getSegundos());
    }

    public Tiempo resta(Tiempo t){
        return  new Tiempo(this.segundos - t.getSegundos());
    }
}
