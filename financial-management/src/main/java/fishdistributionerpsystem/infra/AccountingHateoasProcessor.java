package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AccountingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Accounting>> {

    @Override
    public EntityModel<Accounting> process(EntityModel<Accounting> model) {
        return model;
    }
}
