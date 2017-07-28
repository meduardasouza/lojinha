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
public class Telefone {

    /**
     * @return the codPais
     */
    public int getCodPais() {
        return codPais;
    }

    /**
     * @param codPais the codPais to set
     */
    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    /**
     * @return the codRegiao
     */
    public int getCodRegiao() {
        return codRegiao;
    }

    /**
     * @param codRegiao the codRegiao to set
     */
    public void setCodRegiao(int codRegiao) {
        this.codRegiao = codRegiao;
    }

    /**
     * @return the descricao
     */
    public int getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    private int codPais;
    private int codRegiao;
    private int descricao;
    private int numero;

}
