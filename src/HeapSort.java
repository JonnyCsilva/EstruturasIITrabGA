// N�s (Aline, Jonatan, Gabriel), garantimos que:
//
// - N�o utilizamos c�digo fonte obtidos de outros estudantes,
// ou fonte n�o autorizada, seja modificado ou c�pia literal.
// - Todo c�digo usado em nosso trabalho � resultado do nosso
// trabalho original, ou foi derivado de um
// c�digo publicado nos livros texto desta disciplina.
// - Temos total ci�ncia das consequ�ncias em caso de violarmos estes termos.

public class HeapSort {
	private Heap heapBase;
	private ObjetoOrdenado[] objHeap;
	
	public HeapSort(Heap objetoHeap){
		this.objHeap = null;
		this.heapBase = objetoHeap;
	}

	public ObjetoOrdenado[] getHeap() {
		return objHeap;
	}

	public void HeapSortOrdenacao(ObjetoOrdenado[] arranjo){
		this.objHeap = new ObjetoOrdenado[20];
		this.heapBase.buildHeap(arranjo);
		objHeap = this.heapBase.getHeap();
    	for(int i = 19; i > 0; i--){
    		ObjetoOrdenado t = objHeap[i];
    		objHeap[i] = objHeap[0];
    		objHeap[0] = t;
            this.heapBase.set_qtElementos(this.heapBase.get_qtElementos() - 1);
            this.heapBase.heapfy(0);
            this.objHeap = this.heapBase.getHeap();
    	}
    }
}
