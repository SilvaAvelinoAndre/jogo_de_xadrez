package boardgame;

public class Piece {// classe que representa a peça do tbuleiro de xadrez
	
	protected Position position; // protegendo com o protected - atribuind a classe position para
	//poder fazer a associação da peça Piece com a posição Position.
	private Board board;// também para associar a peça ao tabuleiro Board
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; // como a classe foi chamada sem parametro inicie-a como nula.
	}


	protected Board getBoard() {// somente o metodo get foi mantido o set foi apagado.
		return board;
	}


	
	
	
}
