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
public class Funcionario extends Serumano {

    /**
     * @return the codFuncionario
     */
    public int getCodFuncionario() {
        return codFuncionario;
    }

    /**
     * @param codFuncionario the codFuncionario to set
     */
    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    /**
     * @return the carteiraTrabalho
     */
    public int getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    /**
     * @param carteiraTrabalho the carteiraTrabalho to set
     */
    public void setCarteiraTrabalho(int carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    /**
     * @return the dados
     */
    public Banco getDados() {
        return dados;
    }

    /**
     * @param dados the dados to set
     */
    public void setDados(Banco dados) {
        this.dados = dados;
    }

    private int codFuncionario;
    private int carteiraTrabalho;
    private Banco dados;

}
