// N�s (Aline, Jonatan, Gabriel), garantimos que:
//
// - N�o utilizamos c�digo fonte obtidos de outros estudantes,
// ou fonte n�o autorizada, seja modificado ou c�pia literal.
// - Todo c�digo usado em nosso trabalho � resultado do nosso
// trabalho original, ou foi derivado de um
// c�digo publicado nos livros texto desta disciplina.
// - Temos total ci�ncia das consequ�ncias em caso de violarmos estes termos.

package src;

public class Hash 
{
	private InfoTime[] tabelaHash = new InfoTime[20];
	
	
	public void Insere(InfoTime time)
	{
		int posicao = HashFunction(time.Nome);
		tabelaHash[posicao] = time;
	}
	
	public InfoTime Remove(String nomeTime)
	{
		int posicao = HashFunction(nomeTime);
		InfoTime timeExcluido = tabelaHash[posicao];
		tabelaHash[posicao] = null;
		return timeExcluido;
	}
	
	public InfoTime Busca(String nomeTime)
	{
		int posicao = HashFunction(nomeTime);
		return tabelaHash[posicao];
	}
	
	private int HashFunction(String nomeTime)
	{
		return Times.BuscaChave(nomeTime);
	}
}
