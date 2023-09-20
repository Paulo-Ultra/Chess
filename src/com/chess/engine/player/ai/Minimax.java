package com.chess.engine.player.ai;

import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

/* Minmax (sometimes Minimax) is a decision rule used in artificial intelligence,
decision theory, game theory, statistics, and philosophy for minimizing the possible loss
for a worst case (maximum loss) scenario. */

public class Minimax implements MoveStrategy {

    private final BoardEvaluator boardEvaluator;

    public Minimax(){
        this.boardEvaluator = null;
    }

    @Override
    public String toString(){
        return "MiniMax";
    }

    @Override
    public Move execute(Board board, int depth) {

        return null;
    }
}
