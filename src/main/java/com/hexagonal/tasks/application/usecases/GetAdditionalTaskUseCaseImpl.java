package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;
import com.hexagonal.tasks.domain.ports.in.GetAdditionalTaskUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetAdditionalTaskUseCaseImpl implements GetAdditionalTaskUseCase {

    private final GetAdditionalTaskUseCase getAdditionalTaskUseCase;

    @Override
    public AdditionalTaskInfo getAdditionaltaskInfo(Long id) {
        return getAdditionalTaskUseCase.getAdditionaltaskInfo(id);
    }
}
