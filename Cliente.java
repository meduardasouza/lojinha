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
public class Cliente extends Serumano {

    /**
     * @return the codCliente
     */
    public int getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    /**
     * @return the vip
     */
    public String getVip() {
        return vip;
    }

    /**
     * @param vip the vip to set
     */
    public void setVip(String vip) {
        this.vip = vip;
    }

    private int codCliente;
    private String vip;

}
