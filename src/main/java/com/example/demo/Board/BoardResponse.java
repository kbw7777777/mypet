package com.example.demo.Board;

import lombok.Builder;
import java.util.List;

import com.example.demo.ApiResponse.ApiResponse;

public class BoardResponse extends ApiResponse<Board> {

    @Builder
    public BoardResponse(final Board toBoard, final List<String> errors) {
        this.setData(toBoard);
        this.setErrors(errors);
    }
}