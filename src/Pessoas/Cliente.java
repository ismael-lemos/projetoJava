package Pessoas;

import animais.Animal;

/**
 *
 * @author Ismael de Oliveira
 */
public class Cliente extends Pessoa {
    private Animal animal[];
    private int cpf;
    private int rg;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
    
}
