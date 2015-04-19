package es.javi.restclientconsumer.domain;

public class Container {
    private String subject;
    private String body;
    private Boolean companyContainer;
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
        return companyContainer;
    }

    public void setCompanyContainer(Boolean companyContainer) {
        this.companyContainer = companyContainer;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    @Override
    public String toString() {
        return "Container{" +
                "subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", companyContainer=" + companyContainer +
                ", listId=" + listId +
                '}';
    }
}
