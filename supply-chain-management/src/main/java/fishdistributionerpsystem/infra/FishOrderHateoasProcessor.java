package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FishOrderHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<FishOrder>> {

    @Override
    public EntityModel<FishOrder> process(EntityModel<FishOrder> model) {
        return model;
    }
}
