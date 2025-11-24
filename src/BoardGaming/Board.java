package BoardGaming;

public class Board {
    private Piece[][] pieces;
    private int linha;
    private int coluna;

    public Board(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        pieces = new Piece[linha][coluna];
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    public Piece piece(int linha, int coluna) {
        return pieces[linha][coluna];
    }
    public Piece piece(Position pos) {
        return pieces[pos.getLinha()][pos.getColuna()];
    }
    public void placePiece(Piece piece, Position pos) {
        pieces[pos.getLinha()][pos.getColuna()] = piece;
        piece.pos = pos;
    }
}
