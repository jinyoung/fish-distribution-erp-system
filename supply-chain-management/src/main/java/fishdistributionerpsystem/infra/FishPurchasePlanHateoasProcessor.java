package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FishPurchasePlanHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<FishPurchasePlan>> {

    @Override
    public EntityModel<FishPurchasePlan> process(
        EntityModel<FishPurchasePlan> model
    ) {
        return model;
    }
}
