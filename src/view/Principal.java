package view;
import controller.Metodos;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args){
        Metodos m = new Metodos();
        int n;
        do{
           n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número ímpar:"));
        }while(n % 2 == 0);
        }
        int cont = 1;
        int resultado = 1;
        System.out.println(m.DuploFatorial(n, cont, resultado));
    }
}

