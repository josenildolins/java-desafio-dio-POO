public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    
   
   
    public Curso() {
    }

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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int i) {
        this.cargaHoraria = i;
    }

    @Override
    public String toString() {
        return "Curso{" + 
                "titulo=' " + titulo + '\'' +
                ",  descricao=' " + descricao + '\'' +
                ",  cargaHoraria=" + cargaHoraria +
                '}';
    };
    
}
