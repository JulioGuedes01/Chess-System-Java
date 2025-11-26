package BoardGaming;

public class Board {
    private Piece[][] pieces;
    private int linha;
    private int coluna;

    public Board(int linha, int coluna) {
        if (linha < 1 || coluna < 1) {
            throw new BoardException("Error Creating Board");
        }
        this.linha = linha;
        this.coluna = coluna;
        pieces = new Piece[linha][coluna];
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public Piece piece(int linha, int coluna) {
        if (!positionExists(linha, coluna)) {
            throw new BoardException("Position Not Found");
        }
        return pieces[linha][coluna];
    }
    public Piece piece(Position pos) {
        return pieces[pos.getLinha()][pos.getColuna()];
    }
    public void placePiece(Piece piece, Position pos) {
        if (thereIsAPiece(pos)){
            throw new BoardException("There is already a Piece on Position" + pos);
        }
        pieces[pos.getLinha()][pos.getColuna()] = piece;
        piece.pos = pos;
    }

    private boolean positionExists(int linha, int coluna) {
       return linha >= 0 && linha < getLinha() &&
                coluna >= 0 && coluna < getColuna();

    }

    public boolean positionExists(Position pos) {
        return positionExists(pos.getLinha(), pos.getColuna());
    }
    public boolean thereIsAPiece(Position pos) {
        if (!positionExists(linha, coluna)) {
            throw new BoardException("Position Not Found");
        }
        return piece(pos) != null;
    }
}
