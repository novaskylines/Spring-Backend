package org.zerock.springex3.controller.dto;

import lombok.*;

import java.time.LocalDate;

// Getter / Setter 메서드 생성
// Constructor 메서드 생성(No/AllArgs)
// ToString : DTO 내 모든 데이터를 확인 가능한 toString 메서드 생성
// Builder : TodoDTO 생성에 사용되는 메서드 생성
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class TodoDTO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
    private String writer;
    //alt+insert 단축키로 getter, setter, constructor 자동생성

    
}
