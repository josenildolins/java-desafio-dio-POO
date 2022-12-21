import java.util.LinkedHashSet;
import java.util.Set;

//clearimport java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso cursoJava = Curso.obterCurso("Java", "descrição aqui", 200);
        Curso cursoJavaScript = Curso.obterCurso("JavaScript", "JavaScript é", 120);
        Curso cursoAngular = Curso.obterCurso("Angular", "Angular é", 50);

        Mentoria mentoriaJava = new Mentoria("Mentoria Java", "isso foi um teste");
        Mentoria mentoriaJavaScript = new Mentoria("Mentoria JavaScript", "Esta Mentoria tem a finalidade");
        Mentoria mentoriaAngular = new Mentoria("Mentoria Angular", "Esta Mentoria tem a finalidade");

        Set<Conteudo> conteudos = new LinkedHashSet<>();
        conteudos.add(cursoJava);
        conteudos.add(cursoJavaScript);
        conteudos.add(cursoAngular);
        conteudos.add(mentoriaJava);
        conteudos.add(mentoriaJavaScript);
        conteudos.add(mentoriaAngular);
       
        BootCamp bootCamp = new BootCamp("fjhsdfcjsd", "hajsasd",conteudos);

        System.out.println(bootCamp.getConteudos());
        System.out.println(bootCamp.getDevsInscritos());

    }
}