package projetoempresati;

import javax.swing.JOptionPane;

public class ProjetoEmpresaTI {

    public static void main(String[] args) {
        new EmpresaTI();
    }
}

class EmpresaTI {

    /*
    Esta classe deve ter os atributos: razão social, nome fantasia, CNPJ, 
    endereço, uma lista de programadores, 
    uma lista de Secretarias e uma lista dos funcionários do Comercial.
     */
    private String razaoSocial, nomeFantasia, CNPJ, endereço;
    private Programador prog[]; // lista de programadores da empresa
    private Secretario secr[]; // lista de secretários/as da empresa
    private Comercial comerc[]; // lista de funcionário do Comercial da empresa

    public EmpresaTI() { //método construtor onde colocaremos as chamadas...
        //lerDadosDaEmpresa(); //habilitaremos depois
        simulacaoLeituraDeDados(); //para testar sem ter que digitar, desabilitaremos depois
        mostrarTodosOsFuncionarios();
        mediaSalariosMulheresDaEmpresa();
        idadeMediaDosProgramadores();
        qtdeMulheresAcima25AnosSalarioAcimaDe2000();
    }

    public void simulacaoLeituraDeDados() {
        prog = new Programador[4];
        secr = new Secretario[2];
        comerc = new Comercial[2];
        prog[0] = new Programador("Luis", "123.345", "Programador", "Pleno", "Java", 24, 'M', 1000);
        prog[1] = new Programador("Ana", "123.345", "Programador", "Pleno", "JavaScript", 20, 'F', 1950);
        prog[2] = new Programador("Caio", "123.345", "Programador", "Junior", "C#", 29, 'M', 3000);
        prog[3] = new Programador("Renata", "123.345", "Analista", "Pleno", "Visual Basic", 22, 'F', 5000);
        secr[0] = new Secretario("Lara", "123.345", "inglês russo", 52, 'F', 1900);
        secr[1] = new Secretario("Pedro", "123.345", "inglês alemão", 32, 'M', 2900);
        comerc[0] = new Comercial("Amilton", "123.345", 32, 'M', 4200);
        comerc[1] = new Comercial("Betty", "123.345", 32, 'F', 4300);
    }

    public void lerDadosDaEmpresa() {
        razaoSocial = JOptionPane.showInputDialog(null, "Digite a razão social da empresa: ", "");
        nomeFantasia = JOptionPane.showInputDialog(null, "Digite o nome de fantasia da empresa: ", "");
        CNPJ = JOptionPane.showInputDialog(null, "Digite o CNPJ da empresa: ", "");
        endereço = JOptionPane.showInputDialog(null, "Digite o endereço da empresa: ", "");
        int P, S, C; // quantidade de programadores, secretários e func. do Comercial
        P = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Quantos programadores? ", ""));
        S = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Quantos secretários? ", ""));
        C = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Quantos func. do Comercial? ", ""));
        //Alocar memória para os três vetores:
        prog = new Programador[P];
        secr = new Secretario[S];
        comerc = new Comercial[C];
        //Ler os dados dos programadores:
        for (int i = 0; i < P; i++) {
            //Outra forma de resolver isto seria efetuar a leitura de dados
            //aqui, dentro deste ciclo, criar os novos objetos aqui.
            prog[i] = Programador.lerDadosProgramador();
        }
        //Ler os dados dos Secretários:
        for (int i = 0; i < S; i++) {
            secr[i] = Secretario.lerDadosSecretario();
        }
        //Ler os dados dos funcionários do Comercial:
        for (int i = 0; i < C; i++) {
            comerc[i] = Comercial.lerDadosComercial();
        }
    }

    public void mostrarTodosOsFuncionarios() {
        //Mostrar os programadores:
        System.out.println("Programadores:");
        for (int i = 0; i < prog.length; i++) {
            System.out.println(prog[i]);
        }
        //Mostrar os Secretários:
        System.out.println("\nSecretários:");
        for (int i = 0; i < secr.length; i++) {
            System.out.println(secr[i]);
        }
        //Mostrar os funcionários do Comercial:
        System.out.println("\nFuncionários do Comercial:");
        for (int i = 0; i < comerc.length; i++) {
            System.out.println(comerc[i]);
        }
    }

    public void mediaSalariosMulheresDaEmpresa() {
        float S = 0.0f;
        int qm = 0;
        for (int i = 0; i < prog.length; i++) {
            if (prog[i].getSexo() == 'F') {
                S += prog[i].getSalario();
                qm++;
            }
        }
        for (int i = 0; i < secr.length; i++) {
            if (secr[i].getSexo() == 'F') {
                S += secr[i].getSalario();
                qm++;
            }
        }
        for (int i = 0; i < comerc.length; i++) {
            if (comerc[i].getSexo() == 'F') {
                S += comerc[i].getSalario();
                qm++;
            }
        }
        float mediaSalarioMulh = S / qm;
        System.out.println("\nA média dos salários das mulheres da empresa é "
                + "R$ " + mediaSalarioMulh);
    }

    public void idadeMediaDosProgramadores() {
        int S = 0;
        for (int i = 0; i < prog.length; i++) {
            S += prog[i].getIdade();
        }
        System.out.println("\nA idade média dos programadores da empresa é "
                + Math.round((float)S/(float)prog.length) );
    }

    public void qtdeMulheresAcima25AnosSalarioAcimaDe2000() {
        int qm = 0;
        for (int i = 0; i < prog.length; i++) {
            if (prog[i].getSexo() == 'F' && prog[i].getIdade() > 25
                    && prog[i].getSalario() > 2000) {
                qm++;
            }
        }
        for (int i = 0; i < secr.length; i++) {
            if (secr[i].getSexo() == 'F' && secr[i].getIdade() > 25
                    && secr[i].getSalario() > 2000) {
                qm++;
            }
        }
        for (int i = 0; i < comerc.length; i++) {
            if (comerc[i].getSexo() == 'F' && comerc[i].getIdade() > 25
                    && comerc[i].getSalario() > 2000) {
                qm++;
            }
        }
        System.out.println("\nA qtde. de mulheres da empresa que tem idade > 25 anos "
                + " e ganham acima de R$2.000,00 é " + qm);

    }

}
