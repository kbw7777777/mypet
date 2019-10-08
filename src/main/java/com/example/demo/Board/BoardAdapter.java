
package com.example.demo.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BoardAdapter {

    public static Board toBoard(final BoardRequest request) {
        if(request == null) {
            return null;
        }
        return Board.builder()
                .title(request.getTitle())
                .subTitle(request.getSubTitle())
                .content(request.getContent())
                .boardType(request.getBoardType())
                .createdDate(request.getCreatedDate())
                .updatedDate(request.getUpdatedDate())
                .build();
    }

    public static BoardResponse toBoardResponse(final Board toBoard, final List<String> errors) {
        return BoardResponse.builder()
                .toBoard(toBoard)
                .errors(Optional.ofNullable(errors).orElse(new ArrayList<>()))
                .build();
    }
}
