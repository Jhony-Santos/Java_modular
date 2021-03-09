package modularizacao.operacao;
import modularizacao.operacao.internal.Multiplication;
import modularizacao.operacao.internal.Division;
import modularizacao.operacao.internal.Subtraction;
import modularizacao.operacao.internal.Sum;


public class Calculadora {
    private Division div;
    private Multiplication multi;
    private Subtraction sub;
    private Sum sum;

    public Calculadora() {
        div = new Division();
        multi = new Multiplication();
        sub = new Subtraction();
        sum = new Sum();
    }

    public int somar(int x,int y){
        return sum.executarOperacao(x,y);
    }
    public int dividir(int x, int y){
        return div.executarOperacao(x,y);
    }
    public int multiplicar(int x,int y){
        return multi.executarOperacao(x,y);
    }
    public int subtrair(int x, int y){
        return sub.executarOperacao(x,y);
    }

}
