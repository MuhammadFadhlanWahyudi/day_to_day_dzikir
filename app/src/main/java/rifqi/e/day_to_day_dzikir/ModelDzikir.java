package rifqi.e.day_to_day_dzikir;

public class ModelDzikir {
    private String id;
    private String Arab;
    private String Indo;

    public ModelDzikir(String id, String arab, String indo) {
        this.id = id;
        Arab = arab;
        Indo = indo;
    }

    public String getId() {
        return id;
    }

    public String getArab() {
        return Arab;
    }

    public String getIndo() {
        return Indo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setArab(String arab) {
        Arab = arab;
    }

    public void setIndo(String indo) {
        Indo = indo;
    }
}
