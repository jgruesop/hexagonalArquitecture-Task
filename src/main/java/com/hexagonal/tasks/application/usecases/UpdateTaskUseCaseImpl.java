package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.models.Task;
import com.hexagonal.tasks.domain.ports.in.UpdateTaskUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final UpdateTaskUseCase updateTaskUseCase;

    @Override
    public Optional<Task> updateTask(Long id, Task updatetask) {
        return updateTaskUseCase.updateTask(id, updatetask);
    }
}
