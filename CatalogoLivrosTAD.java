public interface CatalogoLivrosTAD {

    void adicionarLivro(int idLivro);
    void adicionarLivroNoInicio(int idLivro);
    void adicionarLivroNoFim(int idLivro);
    void inserirLivroNaPosicao(int idLivro, int posicao);

    void removerPrimeiroLivro();
    void removerUltimoLivro();
    void removerLivroNaPosicao(int posicao);
    void removerLivroPorId(int idLivro);

    int buscarLivro(int idLivro);
    int obterLivro(int posicao);
    void atualizarLivro(int posicao, int idLivro);

    boolean estaVazio();
    boolean estaCheio();

    int totalLivros();
    void limparCatalogo();

    void exibirCatalogo();
}