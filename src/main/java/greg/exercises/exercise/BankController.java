package greg.exercises.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankController {

    private ExchangeRate exchangeRate;

    public BankController(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @RequestMapping("/")
    @ResponseBody
    public String getCuncurrencyTable(){
        exchangeRate.getDataFromTable();
        return "--- ---";
    }
}
