package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SupplierRegistrationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<SupplierRegistration>> {

    @Override
    public EntityModel<SupplierRegistration> process(
        EntityModel<SupplierRegistration> model
    ) {
        return model;
    }
}
