package gdgoc.calc_backend.controller;

import gdgoc.calc_backend.dto.CalcRequest;
import gdgoc.calc_backend.dto.CalcResponse;
import gdgoc.calc_backend.service.Calculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CalcController {

    private final Calculator calculator;

    public CalcController(Calculator calculator) {
        this.calculator = calculator;
    }

    @PostMapping("/calculate")
    public CalcResponse calculate(@RequestBody CalcRequest req) {
        double res = calculator.calculate(req);
        return new CalcResponse(res);
    }
}
