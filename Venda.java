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
public class Venda {

    /**
     * @return the codVenda
     */
    public int getCodVenda() {
        return codVenda;
    }

    /**
     * @param codVenda the codVenda to set
     */
    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    /**
     * @return the notaFiscal
     */
    public int getNotaFiscal() {
        return notaFiscal;
    }

    /**
     * @param notaFiscal the notaFiscal to set
     */
    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }
    
    private int codVenda;
    private int notaFiscal;
    private Item item;
    
}
