public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        
        CadastrarCurso(titulo, descricao, cargaHoraria);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    private void CadastrarCurso(String titulo, String descricao, int cargaHoraria){
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + 
                "titulo=' " + getTitulo() + '\'' +
                ",  descricao=' " + getDescricao() + '\'' +
                ",  cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double CalcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}