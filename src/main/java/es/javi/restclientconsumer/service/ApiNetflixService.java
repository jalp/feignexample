package es.javi.restclientconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import es.javi.restclientconsumer.domain.Container;
import es.javi.restclientconsumer.web.IApiNetflix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;

@Service
public class ApiNetflixService {

    private static final Logger LOG = LoggerFactory.getLogger(ApiNetflixService.class);

    @Autowired
    private IApiNetflix IApiNetflix;

    @HystrixCommand(fallbackMethod = "fallbackPost")
    public LinkedHashMap<String, String> postContainer(int id, Container container) {
        LOG.info("POST Container data: " + container);
        return IApiNetflix.postAd(id, container);
    }

    public LinkedHashMap<String, String> fallbackPost(int id, Container container) {
        LOG.info("POST fallback post");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Error", "fallbackPost");
        return linkedHashMap;
    }
}
