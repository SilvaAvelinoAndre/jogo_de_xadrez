package boardgame;// pacote tabuleiro de xadrez

public class Board {// Board - classe que representa o tabuleiro dentro do boardgame que 
					// o tabuleiro de xadrez.

	private int rows;// linhas do tabuleiro
	private int columns;// colunas do tabuleiro
	private Piece[][] pieces; // matriz para demarcar todas as posições no tabuleiro.
	
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // estanciada a matriz  no construtor, passando os valores de linhas e colunas
	}


	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}


	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
}
