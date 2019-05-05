package com.zenkurpfy.chess.chess;

import com.zenkurpfy.chess.board.Board;
import com.zenkurpfy.chess.board.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
