package am.smartcode.audittrail.model.dto.action;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class CreateActionDto implements Serializable {

    private Integer userId;

    private String actionType;

    private String entityType;

    private LocalDateTime actionDate;

}
