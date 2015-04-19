package es.javi.restclientconsumer.web;

import es.javi.restclientconsumer.domain.Container;
import es.javi.restclientconsumer.service.ApiNetflixService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
public class ApiController {

    private static final Logger LOG = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    private ApiNetflixService apiNetflixService;

    @RequestMapping(value = "/")
    public LinkedHashMap<String, String> index() {
        Container container = new Container();
        container.setBody("Lorem Ipsum");
        container.setSubject("This is a subject");
        container.setCompanyContainer(true);
        container.setListId(100);
        LOG.info("Calling service with data: " + container + " and id 10");

        return apiNetflixService.postContainer(10, container);
    }
}