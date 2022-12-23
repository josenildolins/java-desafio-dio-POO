import java.util.LinkedHashSet;
import java.util.Set;

//clearimport java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

      Curso cursoJava = new Curso("Java", "teste", 1002);
      Curso cursoJavaScript = new Curso("JavaScript", "teste", 1002);

      Curso cursoCsharp = new Curso("C#", "teste", 1002);
      Curso cursoEntityFrameWork = new Curso("Entity FrameWork", "teste", 1002);
      
      Set<Conteudo> conteudosWarburg = new LinkedHashSet<>();
      conteudosWarburg.add(cursoJava);
      conteudosWarburg.add(cursoJavaScript);

      Set<Conteudo> conteudosOrangeTech = new LinkedHashSet<>();
      conteudosOrangeTech.add(cursoCsharp);
      conteudosOrangeTech.add(cursoEntityFrameWork);

      Dev deve1 = new Dev("Josenildo", conteudosWarburg, null);
      Dev deve2 = new Dev("Jacob", conteudosOrangeTech, null);

      Set<Dev> devs = new LinkedHashSet<>();
      devs.add(deve1);
      devs.add(deve2);

      

      BootCamp Warburg = new BootCamp("Cloud Fullstack", "Warburg- Warburg Pincus");
      Warburg.setConteudos(conteudosWarburg);
      Warburg.setDevsInscritos(devs);

      BootCamp orangeTech = new BootCamp("OrangeTech ", "BackEnd");
      orangeTech.setConteudos(conteudosOrangeTech);
      orangeTech.setDevsInscritos(devs);

      System.out.println();
      System.out.println("-----------------------------------------------------------------------------------------------------------");

      System.out.println( "Bootcamp: " + Warburg.getNome() + "\n" + "Descrição: "
       + Warburg.getDescricao()
       + "\n" + "Data Início : " + Warburg.getDataInicial() + "\n" + "Data Final : " + Warburg.getDataFinal()
       + "\n" + "Conteúdos : " + Warburg.getConteudos()
       + "\n" + "Devs Cadastrados : " + Warburg.getDevsInscritos());

       System.out.println();
       System.out.println("-----------------------------------------------------------------------------------------------------------");

       System.out.println( "Bootcamp: " + orangeTech.getNome() + "\n" + "Descrição: "
       + orangeTech.getDescricao()
       + "\n" + "Data Início : " + orangeTech.getDataInicial() + "\n" + "Data Final : " + orangeTech.getDataFinal()
       + "\n" + "Conteúdos : " + orangeTech.getConteudos()
       + "\n" + "Devs Cadastrados : " + orangeTech.getDevsInscritos());
       System.out.println();
      System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
}