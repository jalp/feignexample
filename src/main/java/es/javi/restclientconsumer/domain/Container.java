package es.javi.restclientconsumer.domain;

public class Container {
    private String subject;
    private String body;
    private Boolean companyAd;
    private int listId;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Boolean isCompanyAd() {
        return companyAd;
    }

    public void setCompanyAd(Boolean companyAd) {
        this.companyAd = companyAd;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }
}
