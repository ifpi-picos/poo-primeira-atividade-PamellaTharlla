import projeto.Aluno;
import projeto.Cursos;
import projeto.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Professor p1 = new Professor("Eric","Eric@gmail.com","Doutor");

        Cursos c1 = new Cursos("ADS",4000,"tecnologo","superior","01/02/2022",null,p1);

        Aluno a1 = new Aluno("pamella", 4567899, "@gail.com");

        c1.dadosDoCurso();
    }
}
