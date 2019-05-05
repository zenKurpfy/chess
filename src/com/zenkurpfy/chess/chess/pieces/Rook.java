package com.zenkurpfy.chess.chess.pieces;

import com.zenkurpfy.chess.board.Board;
import com.zenkurpfy.chess.chess.ChessPiece;
import com.zenkurpfy.chess.chess.Color;

public class Rook extends ChessPiece {


    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }

}
