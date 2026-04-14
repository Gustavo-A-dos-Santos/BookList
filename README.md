📚 Catálogo de Livros com Array (Java)
📌 Descrição

Este projeto implementa um Tipo Abstrato de Dados (TAD) para gerenciamento de um catálogo de livros, utilizando listas sequenciais (arrays).

Cada livro é representado por um ID inteiro, e todas as operações garantem que o array permaneça compactado, sem espaços vazios entre os elementos.

🎯 Objetivo

Simular o funcionamento de um catálogo de biblioteca, permitindo:

Inserção de livros
Remoção de livros
Busca por ID
Atualização de posições
Navegação e visualização do catálogo
⚙️ Estrutura do Projeto
📁 src/
 ├── CatalogoLivrosTAD.java
 ├── CatalogoLivros.java
 └── Main.java

📄 README.md
📄 logs.txt
🧠 Lógica de Funcionamento

Como arrays possuem tamanho fixo, foi necessário implementar:

➤ Inserção
No início ou posição específica → desloca elementos para a direita (shift right)
➤ Remoção
Remove elemento e desloca os seguintes para a esquerda (shift left)
➤ Redimensionamento
Quando o array enche, sua capacidade é dobrada automaticamente
📊 Complexidade das Operações
Operação	Complexidade
Adicionar no fim	O(1)
Adicionar no início	O(n)
Inserir em posição	O(n)
Remover	O(n)
Buscar	O(n)
Acessar por índice	O(1)
🧪 Testes

Os testes foram realizados através de um menu interativo no console (Main.java), validando:

Inserções em diferentes posições
Remoções variadas
Busca de elementos
Exibição do catálogo
Contagem de livros
📄 Logs de Execução

Os testes realizados estão documentados no arquivo logs.txt, contendo exemplos reais de uso do sistema.

▶️ Como Executar
Compile os arquivos Java:
javac *.java
Execute o programa:
java Main
🎥 Vídeo Explicativo

O vídeo apresenta:

Estrutura do código
Lógica dos deslocamentos no array
Testes realizados no menu
Análise de complexidade

👉 https://youtu.be/dFtEAufkRhc

🧾 Conclusão

A implementação demonstra, na prática, as limitações e o funcionamento interno de listas baseadas em arrays.

Cada inserção ou remoção carrega um custo —
porque manter ordem exige movimento.

E no fim…
estrutura é disciplina.
