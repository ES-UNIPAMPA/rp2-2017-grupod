package midias;


/**
 *
 * @author vagne
 */
public class AudioLivro extends Midia {
    private String genero;
    private String idioma;
    private String autores;
    private String local;
    private String editora;
    private int duracao;

    
    public AudioLivro(String caminho, String titulo, String descricao, int ano, String genero, String idioma,
            String autores, String local, String editora, int duracao) {
        super(caminho, titulo, descricao, ano);
        this.genero = genero;
        this.idioma = idioma;
        this.autores = autores;
        this.local = local;
        this.editora = editora;
        this.duracao = duracao;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    
    public String toString(){
        return "AudioLivro{" + "genero=" +genero +", idioma=" +idioma +", autores=" +autores +", local=" +local +", editora=" +editora +", duracao=" +duracao;
                }
    
    
    @Override
    public String toFile() {
        String dados = super.toFile() + genero +  "\r\n" + idioma +  "\r\n" + autores +  "\r\n" + local +  "\r\n" + editora +  "\r\n" + duracao +  "\r\n";
        return dados;
    }
    }

 