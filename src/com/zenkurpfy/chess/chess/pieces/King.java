package com.zenkurpfy.chess.chess.pieces;

import com.zenkurpfy.chess.board.Board;
import com.zenkurpfy.chess.chess.ChessPiece;
import com.zenkurpfy.chess.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
