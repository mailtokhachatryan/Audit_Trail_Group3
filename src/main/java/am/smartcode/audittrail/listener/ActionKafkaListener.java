package am.smartcode.audittrail.listener;

import am.smartcode.audittrail.model.dto.action.CreateActionDto;
import am.smartcode.audittrail.service.action.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ActionKafkaListener {

    private final ActionService actionService;

    @KafkaListener(
            id = "actionListener",
            topics = "activity",
            containerFactory = "kafkaListenerContainerFactory")
    public void CreateListener(@Payload(required = false) CreateActionDto createActionDto) {
        System.out.println("hello");
        actionService.create(createActionDto);
    }
}
