package com.board;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Board {
    private String contentsId;
    private String title;
    private String contents;

}
