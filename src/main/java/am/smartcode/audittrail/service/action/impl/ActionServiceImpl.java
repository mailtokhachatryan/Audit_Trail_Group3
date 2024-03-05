package am.smartcode.audittrail.service.action.impl;

import am.smartcode.audittrail.mapper.ActionMapper;
import am.smartcode.audittrail.model.dto.action.CreateActionDto;
import am.smartcode.audittrail.model.entity.ActionEntity;
import am.smartcode.audittrail.repository.ActionRepository;
import am.smartcode.audittrail.service.action.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ActionServiceImpl implements ActionService {

    private final ActionRepository actionRepository;
    private final ActionMapper actionMapper;

    @Override
    @Transactional
    public void create(CreateActionDto actionDto) {
        ActionEntity entity = actionMapper.toEntity(actionDto);
        actionRepository.save(entity);
    }

}
