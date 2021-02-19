package lk.chathurabuddi.sampath.paycorp.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {

    @GetMapping
    public String processHostedCheckout(@RequestParam("reqid") String reqId) throws IOException {
        log.info("payment process request received. [ method:GET ] [ type:HostedCheckout ] [ reqId:{} ]", reqId);
        return processPayment(reqId).toString();
    }

    @PostMapping
    public String processIframeCheckout(@RequestParam("reqid") String reqId) {
        log.info("payment process request received. [ method:POST ] [ type:IframeCheckout ] [ reqId:{} ]", reqId);
        return processPayment(reqId).toString();
    }

    private Map<String, String> processPayment(String reqId) {
        String authToken = "7c0c1c98-0f1e-4da9-9e93-1d4939d9282f";
        String urlNew = "https://sampath.paycorp.lk/webinterface/qw/confirm?csrfToken=" + reqId + "&authToken=" + authToken;

        RestTemplate restTemplate = new RestTemplate();
        String responseTxt = restTemplate.postForObject(urlNew, "", String.class);

        Map<String, String> formParams = new HashMap<>();
        Arrays.stream(responseTxt.split("&")).forEach(s -> {
            String[] paramParts = s.split("=");
            formParams.put(paramParts[0], paramParts[1]);
            log.info("response parameter decoded. [ {}:{} ]", paramParts[0], paramParts[1]);
        });
        return formParams;
    }

}
