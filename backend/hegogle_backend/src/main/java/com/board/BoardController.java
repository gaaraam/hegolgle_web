package com.board;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.URI;

@Controller
public class BoardController {
    @PostMapping("/board/write")
    public ResponseEntity<Board> board(Board board){
        board.setTitle(board.getTitle());
        board.setContents(board.getContents());
        return new ResponseEntity<>;

    }
}
