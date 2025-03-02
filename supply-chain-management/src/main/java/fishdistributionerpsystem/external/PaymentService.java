package fishdistributionerpsystem.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
    name = "financial-management",
    url = "${api.url.financial-management}"
)
public interface PaymentService {
    @RequestMapping(method = RequestMethod.POST, path = "/payments")
    public void processPayment(@RequestBody Payment payment);
}
