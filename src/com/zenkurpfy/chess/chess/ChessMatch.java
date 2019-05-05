package com.zenkurpfy.chess.chess;

import com.zenkurpfy.chess.board.Board;
import com.zenkurpfy.chess.board.Position;
import com.zenkurpfy.chess.chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
        initialSetup();
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
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.BLACK), new Position(2,1));
        board.placePiece(new Rook(board, Color.BLACK), new Position(2,2));
    }
}
