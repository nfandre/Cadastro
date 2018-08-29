/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroaluno;

/**
 *
 * @author André
 */
public class Aluno {
        private  String nome;
	private String cpf;
	private int email;
	
	public Aluno(String nome, String cpf, int email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

    Aluno() {
         //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }
        
}
