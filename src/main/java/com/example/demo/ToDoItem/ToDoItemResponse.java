package com.example.demo.ToDoItem;

import lombok.Builder;
import java.util.List;

import com.example.demo.ApiResponse.ApiResponse;

public class ToDoItemResponse extends ApiResponse<ToDoItem> {

    @Builder
    public ToDoItemResponse(final ToDoItem toDoItem, final List<String> errors) {
        this.setData(toDoItem);
        this.setErrors(errors);
    }
}