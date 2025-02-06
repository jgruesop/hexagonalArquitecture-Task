package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;
import com.hexagonal.tasks.domain.ports.in.GetAdditionalTaskUseCase;
import com.hexagonal.tasks.domain.ports.out.ExternalServicePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetAdditionalTaskUseCaseImpl implements GetAdditionalTaskUseCase {

    private final ExternalServicePort externalServicePort;

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
