package es.javi.restclientconsumer.web;

import es.javi.restclientconsumer.domain.Container;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;

@FeignClient("apinetflix")
public interface IApiNetflix {
    @RequestMapping(value = "/account/{accountId}/container",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    LinkedHashMap<String, String> postAd(@PathVariable("accountId") int accountId,
                                         Container data);
}