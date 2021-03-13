package boardgame;

public class Piece {// classe que representa a pe�a do tbuleiro de xadrez
	
	protected Position position; // protegendo com o protected - atribuind a classe position para
	//poder fazer a associa��o da pe�a Piece com a posi��o Position.
	private Board board;// tamb�m para associar a pe�a ao tabuleiro Board
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; // como a classe foi chamada sem parametro inicie-a como nula.
	}


	protected Board getBoard() {// somente o metodo get foi mantido o set foi apagado.
		return board;
	}


	
	
	
}
