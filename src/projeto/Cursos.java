package projeto;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class Cursos {
    private String nome;
    private int cargaHoraria;
    private String modalidade;
    private String nivel;
    private String dataDeInicio;
    private String dataDeFim;
    private boolean gratuito;
    private Professor professor;

    public Cursos(String nome, int cargaHoraria, String modalidade, String nivel, String dataDEInicio,
            String dataDeFim,Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.modalidade = modalidade;
        this.nivel = nivel;
        this.dataDeInicio = dataDEInicio;
        this.dataDeFim = dataDeFim;
        this.professor = professor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public String getModalidade() {
        return modalidade;
    }
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public String getDataDeInicio() {
        return dataDeInicio;
    }
    public void setDataDeInicio(String dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }
    public String getDataDeFim() {
        return dataDeFim;
    }
    public void setDataDeFim(String dataDeFim) {
        this.dataDeFim = dataDeFim;
    }
    public boolean isGratuito() {
        return gratuito;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }
    public void dadosDoCurso(){
        JOptionPane.showMessageDialog(null, "NOME DO CURSO:" +this.getNome()
        + "\nCARGA HÓRARIA: " +this.getCargaHoraria()
        + "\n MODADLIDADE: "  +this.getModalidade()
        + "\n NIVEL:" +this.getNivel()
        + "\n DATA DE INICIO: " +this.getDataDeInicio()
        + "\n FIM DO CURSO: " +this.getDataDeFim()
        + "\n NOME DO PROFESSOR; " +this.getProfessor().getNome(),"DODOS DO CURSO",JOptionPane.INFORMATION_MESSAGE);
        

    }

    
}
