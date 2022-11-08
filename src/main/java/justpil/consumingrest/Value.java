package justpil.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private long id;
    private String quote;

    public long getId() {
        return id;
    }

    public void setId(long i) {
        id = i;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String q) {
        quote = q;
    }

    public String toString() {
        return "Value{id=" + id + ", quote='" + quote + '\'' + '}';
    }
}
