/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojinha.duds;

/**
 *
 * @author aluno
 */
public class Item {

    /**
     * @return the codProduto
     */
    public int getCodProduto() {
        return codProduto;
    }

    /**
     * @param codProduto the codProduto to set
     */
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the subTot
     */
    public float getSubTot() {
        return subTot;
    }

    /**
     * @param subTot the subTot to set
     */
    public void setSubTot(float subTot) {
        this.subTot = subTot;
    }

    private int codProduto;
    private int quantidade;
    private float subTot;
    
}
