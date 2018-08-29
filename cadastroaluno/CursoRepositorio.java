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
public class CursoRepositorio {
    public String getByCodigo(String codigo){
        return codigo;
    }
    public Turma getTurma(String codigo){
        Turma turma = new Turma();
        return turma;
    }
    public void getAlunos(String codigo){

    }
    
    public boolean existeAluno(String cpf){
        return true;
    }
    
        
}
