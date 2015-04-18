package es.javi.restclientconsumer.web;

import es.javi.restclientconsumer.domain.Container;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
public class ApiController {

    @Autowired
    private ApiNetflix apiNetflix;

    @RequestMapping(value = "/")
    public LinkedHashMap<String, String> index() {
        Container container = new Container();
        container.setBody("Lorem Ipsum");
        container.setSubject("This is a subject");
        container.setCompanyAd(true);
        container.setListId(100);

        return apiNetflix.postAd(10, container);
    }
}