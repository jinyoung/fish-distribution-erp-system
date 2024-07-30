package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/fishProductionStatuses")
@Transactional
public class FishProductionStatusController {

    @Autowired
    FishProductionStatusRepository fishProductionStatusRepository;

    @RequestMapping(
        value = "/fishProductionStatuses/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public FishProductionStatus updateFishProductionStatus(
        @PathVariable(value = "id") String id,
        @RequestBody UpdateFishProductionStatusCommand updateFishProductionStatusCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /fishProductionStatus/updateFishProductionStatus  called #####"
        );
        Optional<FishProductionStatus> optionalFishProductionStatus = fishProductionStatusRepository.findById(
            id
        );

        optionalFishProductionStatus.orElseThrow(() ->
            new Exception("No Entity Found")
        );
        FishProductionStatus fishProductionStatus = optionalFishProductionStatus.get();
        fishProductionStatus.updateFishProductionStatus(
            updateFishProductionStatusCommand
        );

        fishProductionStatusRepository.save(fishProductionStatus);
        return fishProductionStatus;
    }
}
//>>> Clean Arch / Inbound Adaptor
