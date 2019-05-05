package com.zenkurpfy.chess.board;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
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

    public void setColumns(int colums) {
        this.columns = colums;
    }
    public Piece pieceFromPosition(Position position){
        return pieces[position.getRow()][position.getColumn()];

    }
    public Piece pieceFromRowAndColumn(int row, int column){
        Position position = new Position(row, column);
        return pieceFromPosition(position);
    }
    public void placePiece(Piece piece, Position position){
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
}
