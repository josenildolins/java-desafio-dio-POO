
public abstract class Conteudo {
    
    protected static final double XP_PADRAO = 10;

    protected String titulo;
    protected String descricao;
    
    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public abstract double CalcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}