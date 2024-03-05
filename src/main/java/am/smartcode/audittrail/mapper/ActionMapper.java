package am.smartcode.audittrail.mapper;

import am.smartcode.audittrail.model.dto.action.CreateActionDto;
import am.smartcode.audittrail.model.entity.ActionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActionMapper {

    ActionEntity toEntity(CreateActionDto cardDto);
}
