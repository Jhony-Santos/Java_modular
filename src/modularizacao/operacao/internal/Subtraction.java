package modularizacao.operacao.internal;

import modularizacao.operacao.Operacao;

public class Subtraction implements Operacao {
    @Override
    public int executarOperacao(int x, int y) {
        return x-y;
    }
}
