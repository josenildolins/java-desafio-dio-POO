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

        Curso angular = new Curso();
        javaScript.setTitulo("Angular");
        javaScript.setDescricao("descrição aqui");
        javaScript.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição aqui");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();

        bootCamp.setNome("Cloud Fullstack Bootcamp - Warburg Pincus");
        bootCamp.setDescricao("Chegaram 7 novas empresas na DIO juntamente com uma trilha super completa em Fullstack com cloud! Se você quer começar na carreira de Fullstack ou está em busca de novas oportunidades, inscreva-se no Cloud Fullstack Bootcamp - Warburg Pincus, com 151 horas de experiência educacionais que abrangem as principais tecnologias para se tornar um(a) profissional Fullstack. Ao gerar a sua certificação, o seu perfil terá visibilidade para 6 grandes empresas, são elas: Warburg Pincus, Sólides, TakeBlip, Eleva Educação, Superlógica, Americanet e Blu.");
        bootCamp.getConteudos().add(java);
        bootCamp.getConteudos().add(javaScript);
        bootCamp.getConteudos().add(angular);
        bootCamp.getConteudos().add(mentoria);

        Dev josenildo = new Dev();
        josenildo.setNome("Josenildo");
        josenildo.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos " + josenildo.getConteudosInscritos());
        josenildo.progredir();
        System.out.println("Conteudos Concluídos " + josenildo.getConteudosInscritos());


        Dev jacob = new Dev();
        jacob.setNome("Jacob");
        jacob.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos " + jacob.getConteudosInscritos());
        jacob.progredir();
        System.out.println("Conteudos Concluidos " + jacob.getConteudosConcluidos());

    }
}
