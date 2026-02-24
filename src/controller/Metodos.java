
package controller;

public class Metodos {
    public Metodos(){
        super();
    }
    public int DuploFatorial(int n, int cont, int resultado){
        if(cont > n){
            return resultado;
        }else{
            resultado = resultado * cont;
            return DuploFatorial(n,cont + 2, resultado);
            
        }
    }
}
