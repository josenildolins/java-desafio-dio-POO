import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso java = new Curso();
        java.setTitulo("Java");
        java.setDescricao("descrição aqui");
        java.setCargaHoraria(8);

        Curso javaScript = new Curso();
        javaScript.setTitulo("Java");
        javaScript.setDescricao("descrição aqui");
        javaScript.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição aqui");
        mentoria.setData(LocalDate.now());


        
        double teste = Conteudo.XP_PADRAO;
        
        System.out.println(java);
        System.out.println(javaScript);
        System.out.println(mentoria);
        System.out.println("valor do xp_padrão " + teste);


    }
}
