package justpil.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;
    private Value value;

    public String getType() {
        return type;
    }

    public void setType(String t) {
        type = t;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value v) {
        value = v;
    }

    public String toString() {
        return "Quote{type='" + type + '\'' + ", value=" + value + '}';
    }
}
