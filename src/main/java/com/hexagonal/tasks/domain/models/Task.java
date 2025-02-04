package com.hexagonal.tasks.domain.models;

import lombok.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class Task {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private Boolean completed;

}
