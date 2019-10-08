
package com.example.demo.Board;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;




@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/board")

public class BoardController {

    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }
    //TODO test
    @GetMapping("/")
    public @ResponseBody List<BoardResponse> getAll() {
        List<String> errors = new ArrayList<>();
        List<Board> boards = boardService.getAll();
        List<BoardResponse> responses = new ArrayList<>();
        boards.stream().forEach(item -> {
            responses.add(BoardAdapter.toBoardResponse(item, errors));
        });
        return responses;
    }

  
    @GetMapping("/list")
    public Page<Board> list(@PageableDefault Pageable pageable) {
        
        return  boardService.findBoardList(pageable);
        
    }


}

