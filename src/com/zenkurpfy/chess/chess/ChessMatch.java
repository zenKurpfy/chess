package com.zenkurpfy.chess.chess;

import com.zenkurpfy.chess.board.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] chessPieces = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i < board.getRows(); i++) {
            for(int j = 0; j < board.getColumns(); j++){
                chessPieces[i][j] = (ChessPiece) board.pieceFromRowAndColumn(i,j);
            }
        }
        return chessPieces;
    }
}
