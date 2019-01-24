package guru.springframework.springboot.controllers;

import guru.springframework.json.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jt on 2018-12-18.
 */
@RestController
public class ExampleController {

    @RequestMapping("/")
    public Map<String, Object> getIndex(){
        Map<String, Object> returnval = new HashMap<>();

        returnval.put("hello", "world");

        return returnval;
    }

    @RequestMapping("/shipAddress")
    public ShippingAddress getShippingAddress() {

        return new ShippingAddress();
    }

}
