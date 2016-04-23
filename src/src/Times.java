// N�s (Aline, Jonatan, Gabriel), garantimos que:
//
// - N�o utilizamos c�digo fonte obtidos de outros estudantes,
// ou fonte n�o autorizada, seja modificado ou c�pia literal.
// - Todo c�digo usado em nosso trabalho � resultado do nosso
// trabalho original, ou foi derivado de um
// c�digo publicado nos livros texto desta disciplina.
// - Temos total ci�ncia das consequ�ncias em caso de violarmos estes termos.

package src;

public enum Times 
{
	Arsenal(0, "Arsenal"),
	AstonVilla(1, "Aston Villa"),
	Liverpool(2, "Liverpool"),
	Stoke(3, "Stoke"),
	Norwich(4, "Norwich"),
	Everton(5, "Everton"),
	Sunderland(6, "Sunderland"),
	Fulham(7, "Fulham"),
	Swansea(8, "Swansea"),
	ManUnited(9, "Man United"),
	WestBrom(10, "West Brom"),
	Southampton(11, "Southampton"),
	WestHam(12, "West Ham"),
	Cardiff(13, "Cardiff"),
	Chelsea(14, "Chelsea"),
	Hull(15, "Hull"),
	CrystalPalace(16, "Crystal Palace"),
	Tottenham(17, "Tottenham"),
	ManCity(18, "Man City"),
	Newcastle(19, "Newcastle");
	
	private String Nome;
	private int indice;
	
	Times(int indice, String nome) 
	{ 
		this.indice = indice; 
		this.Nome = nome; 
	}

    int indice() { return indice; }
    
	public static int buscaChave(String nome)
	{
		for (Times time: Times.values()) {
            if (nome.equalsIgnoreCase(time.Nome)) return time.indice;
        }
        throw new IllegalArgumentException("Time inv�lido");
	}
}
