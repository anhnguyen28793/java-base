package vn.com.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import vn.com.base.request.Customer;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseApplicationTests {

    @Test
    public void exchange() {
        String url = "http://localhost:8080/customers";

        // HttpHeaders
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        // Yêu cầu trả về định dạng JSON
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("my_other_key", "my_other_value");

        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Gửi yêu cầu với phương thức GET, và các thông tin Headers.
        ResponseEntity<String> response = restTemplate.exchange(url, //
                HttpMethod.GET, entity, String.class);

        String result = response.getBody();

        System.out.println(result);
    }

    @Test
    public void postForObject() {
        String url = "http://localhost:8080/customers/0001234";

        Customer customer = new Customer(1, "0001234", "Tom", "Male");

        RestTemplate restTemplate = new RestTemplate();

        // Dữ liệu đính kèm theo yêu cầu.
        HttpEntity<Customer> requestBody = new HttpEntity<>(customer);

        // Gửi yêu cầu với phương thức POST.
        ResponseEntity<Customer> result = restTemplate.postForEntity(url, requestBody, Customer.class);

        System.out.println("Status code:" + result.getStatusCode());

        // Code = 200.
        if (result.getStatusCode() == HttpStatus.OK) {
            Customer e = result.getBody();
            System.out.println("(Client Side) Employee Created: "+ e.getCustomerId());
        }

    }

}
