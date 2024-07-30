package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FishProductionPlanHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<FishProductionPlan>> {

    @Override
    public EntityModel<FishProductionPlan> process(
        EntityModel<FishProductionPlan> model
    ) {
        return model;
    }
}
