// Nós (Aline, Jonatan, Gabriel), garantimos que:
//
// - Não utilizamos código fonte obtidos de outros estudantes,
// ou fonte não autorizada, seja modificado ou cópia literal.
// - Todo código usado em nosso trabalho é resultado do nosso
// trabalho original, ou foi derivado de um
// código publicado nos livros texto desta disciplina.
// - Temos total ciência das consequências em caso de violarmos estes termos.

package src;

public interface Heap
{
    public int parent (int index);
    public int left (int index);
    public int right (int index);
    public void buildHeap (int[] arranjo);
    public void heapfy (int indexRoot);
    public void insert ();
    public int extract ();
    public void increase ();
    public void printHeap ();
}

