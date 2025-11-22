package BoardGaming;

public class Board {
    private Piece[][] board;
    private int linha;
    private int coluna;

    public Board(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        board = new Piece[linha][coluna];
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
        return board[linha][coluna];
    }
    public Piece piece(Position pos) {
        return board[pos.getLinha()][pos.getColuna()];
    }
}
