package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.ports.in.DeleteTaskUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {

    private final DeleteTaskUseCase deleteTaskUseCase;

    @Override
    public boolean deleteTask(Long id) {
        return deleteTaskUseCase.deleteTask(id);
    }
}
