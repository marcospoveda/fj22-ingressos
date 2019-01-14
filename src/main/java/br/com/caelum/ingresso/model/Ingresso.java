package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.caelum.ingresso.model.descontos.Desconto;

public class Ingresso {

    private Sessao sessao;
    private BigDecimal preco;

    /**
     * @deprecated hibernate only
     */

    public Ingresso(){}

    public Ingresso(Sessao sessao, Desconto tipoDeDesconto){
        this.sessao = sessao;
        this.preco = preco;
    }

    public BigDecimal getPreco(){
        return preco.setScale(2, RoundingMode.HALF_UP);
    }

    public void setPreco(BigDecimal preco){
        this.preco = preco;
    }

}