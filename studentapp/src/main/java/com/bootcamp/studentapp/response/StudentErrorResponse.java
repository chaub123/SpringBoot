package com.bootcamp.studentapp.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class StudentErrorResponse {
    private int status;
    private String message;
    private long timeStamp;


}
