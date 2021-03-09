package modularizacao.operacao.internal;

import modularizacao.operacao.Operacao;

public class Sum implements Operacao {

    @Override
    public int executarOperacao(int x, int y) {
        return x +y;
    }
}
