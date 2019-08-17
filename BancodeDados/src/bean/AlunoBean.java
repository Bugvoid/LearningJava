package bean;

import classes.Aluno;
import dao.AlunoDAO;

public class AlunoBean {

    /**
     * Calcula a mÃ©diadia e a situaÃ§Ã£o
     *
     * @param nota1
     * @param nota2
     * @return
     */
    public String calculaMedia(float nota1, float nota2, String rgm) {
        String resp = "";
        AlunoDAO aluDAO = new AlunoDAO();
        //Calcula a mÃ©diadia e exibe na tela
        float media = (nota1 + nota2) / 2;
       
        aluDAO.gravarMedia(media, rgm);
        
        if (media < 3) {
            resp = media + " : Reprovado";
        } else if (media >= 6) {
            resp = media + " : Aprovado";
        } else {
            resp = media + " : Exame";
        }
        return resp;

    }
    
}