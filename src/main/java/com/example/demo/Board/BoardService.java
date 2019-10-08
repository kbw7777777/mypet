package com.example.demo.Board;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Board get(final Long id) {
        // do id validation
        return  boardRepository.findById(id).orElse(null);
    }

    public Board create(final Board board) {
         if(board == null) {
             throw new NullPointerException("board cannot be null.");
         }
         return boardRepository.save(board);
    }

    public List<Board> getAll() {
        return boardRepository.findAll();
    }

    public Page<Board> findBoardList(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1, pageable.getPageSize());
        return boardRepository.findAll(pageable);
    }
    
}











