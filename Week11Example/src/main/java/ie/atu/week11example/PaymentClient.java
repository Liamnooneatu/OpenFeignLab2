package ie.atu.week11example;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="payment-service", url = "http://localhost:8081/payments")
public interface PaymentClient {

    @PostMapping
    public String makePayment (@RequestBody Person person);

}
