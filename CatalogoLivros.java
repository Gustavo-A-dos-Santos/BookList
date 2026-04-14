import java.util.Arrays;

public class CatalogoLivros implements CatalogoLivrosTAD {

    private int[] livros;
    private int totalLivros;
    private int capacidade;

    public CatalogoLivros(int capacidade) {
        this.capacidade = capacidade;
        this.livros = new int[capacidade];
        this.totalLivros = 0;
    }

    private void expandirCatalogo() {
        capacidade *= 2;
        livros = Arrays.copyOf(livros, capacidade);
    }

    @Override
    public void adicionarLivro(int idLivro) {
        if (estaCheio()) expandirCatalogo();
        livros[totalLivros++] = idLivro;
    }

    @Override
    public void adicionarLivroNoInicio(int idLivro) {
        if (estaCheio()) expandirCatalogo();

        for (int i = totalLivros; i > 0; i--) {
            livros[i] = livros[i - 1];
        }

        livros[0] = idLivro;
        totalLivros++;
    }

    @Override
    public void adicionarLivroNoFim(int idLivro) {
        adicionarLivro(idLivro);
    }

    @Override
    public void inserirLivroNaPosicao(int idLivro, int posicao) {
        if (posicao < 0 || posicao > totalLivros) return;
        if (estaCheio()) expandirCatalogo();

        for (int i = totalLivros; i > posicao; i--) {
            livros[i] = livros[i - 1];
        }

        livros[posicao] = idLivro;
        totalLivros++;
    }

    @Override
    public void removerPrimeiroLivro() {
        if (estaVazio()) return;

        for (int i = 1; i < totalLivros; i++) {
            livros[i - 1] = livros[i];
        }

        totalLivros--;
    }

    @Override
    public void removerUltimoLivro() {
        if (estaVazio()) return;
        totalLivros--;
    }

    @Override
    public void removerLivroNaPosicao(int posicao) {
        if (posicao < 0 || posicao >= totalLivros) return;

        for (int i = posicao; i < totalLivros - 1; i++) {
            livros[i] = livros[i + 1];
        }

        totalLivros--;
    }

    @Override
    public void removerLivroPorId(int idLivro) {
        int pos = buscarLivro(idLivro);
        if (pos != -1) {
            removerLivroNaPosicao(pos);
        }
    }

    @Override
    public int buscarLivro(int idLivro) {
        for (int i = 0; i < totalLivros; i++) {
            if (livros[i] == idLivro) return i;
        }
        return -1;
    }

    @Override
    public int obterLivro(int posicao) {
        if (posicao < 0 || posicao >= totalLivros) return -1;
        return livros[posicao];
    }

    @Override
    public void atualizarLivro(int posicao, int idLivro) {
        if (posicao < 0 || posicao >= totalLivros) return;
        livros[posicao] = idLivro;
    }

    @Override
    public boolean estaVazio() {
        return totalLivros == 0;
    }

    @Override
    public boolean estaCheio() {
        return totalLivros == capacidade;
    }

    @Override
    public int totalLivros() {
        return totalLivros;
    }

    @Override
    public void limparCatalogo() {
        totalLivros = 0;
    }

    @Override
    public void exibirCatalogo() {
        System.out.print("Catálogo: ");
        for (int i = 0; i < totalLivros; i++) {
            System.out.print(livros[i] + " ");
        }
        System.out.println();
    }
}