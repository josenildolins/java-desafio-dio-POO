import java.time.LocalDate;
public class Mentoria extends Conteudo{
    private LocalDate data;
    
    public Mentoria(String titulo, String descricao) {
       this.setTitulo(titulo);
        this.setDescricao(descricao);
        setData(LocalDate.now());
    }

    public LocalDate getData() {
        return data;
    }
    
    private void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" + 
                "titulo=' " + getTitulo() + '\'' +
                ",  descricao=' " + getDescricao() + '\'' +
                ",  data=" + data +
                '}';
    }

    @Override
    public double CalcularXp() {
        return  XP_PADRAO + 20d;
    }
}