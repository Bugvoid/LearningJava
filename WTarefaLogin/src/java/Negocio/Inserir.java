/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Basic.Alunos;
import Basic.Disciplinas;

/**
 *
 * @author Alexander
 */
public class Inserir {
    public Alunos InserirAlunos(String nome, String apelido, int idade){
        Alunos alunos = new Alunos(nome, apelido, idade);
        return alunos;
    }
    public Disciplinas InserirDisciplinas(String nome, String professor){
        Disciplinas disciplinas = new Disciplinas(nome, professor);
        return disciplinas;
    }
}
