package com.zenkurpfy.chess.app;

import com.zenkurpfy.chess.chess.ChessMatch;
import com.zenkurpfy.chess.chess.ChessPiece;

public class UI {

    public void printBoard(ChessMatch match){
        ChessPiece[][] pieces = match.getPieces();
        for(int i = 0; i < pieces.length; i++){
            System.out.print((8 - i) + " ");
            for(int j = 0; j < pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");

    }
    private void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
