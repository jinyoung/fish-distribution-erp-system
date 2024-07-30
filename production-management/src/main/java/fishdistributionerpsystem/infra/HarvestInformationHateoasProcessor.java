package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class HarvestInformationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<HarvestInformation>> {

    @Override
    public EntityModel<HarvestInformation> process(
        EntityModel<HarvestInformation> model
    ) {
        return model;
    }
}
