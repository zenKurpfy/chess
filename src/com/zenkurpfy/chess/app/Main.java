package com.zenkurpfy.chess.app;

import com.zenkurpfy.chess.board.Board;
import com.zenkurpfy.chess.chess.ChessMatch;
import com.zenkurpfy.chess.chess.ChessPiece;

public class Main {

    public static void main(String[] args) {
        ChessMatch match = new ChessMatch();
        UI ui = new UI();
        ui.printBoard(match);
    }
}
