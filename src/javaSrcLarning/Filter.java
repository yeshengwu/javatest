package javaSrcLarning;

public class Filter {

    private String type;
    private String order;
    private String year;
    private int page;

    private String templateUrl;

    /** 参数Map **/
    // Map<String, String> params = new LinkedHashMap<String, String>();

    public Filter(String type, String order, String year, int page) {
        this.type = type;
        this.order = order;
        this.year = year;
        this.page = page;
    }

    public void setTemplate(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String buildUrl() {
        return templateUrl + "/" + type + "/" + year + "/" + order + "/pages/" + page + ".json";
    }

}
