public class Curso extends Conteudo{
    private int cargaHoraria;
   
    public Curso() {
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
                "titulo=' " + getTitulo() + '\'' +
                ",  descricao=' " + getDescricao() + '\'' +
                ",  cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double CalcularXp() {
        return XP_PADRAO * cargaHoraria;
    };
    
}