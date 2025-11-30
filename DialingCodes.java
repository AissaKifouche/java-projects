import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DialingCodes {

    private Map<Integer, String> dialingCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!dialingCodes.containsKey(code) && !dialingCodes.containsValue(country)){
            setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        if (dialingCodes.containsValue(country)){
            for (int i : dialingCodes.keySet()){
                if (Objects.equals(dialingCodes.get(i), country)) return i;
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (dialingCodes.containsValue(country) ){
            for (int i : dialingCodes.keySet()){
                if (Objects.equals(dialingCodes.get(i), country)) {
                    dialingCodes.remove(i);
                    break;
                }
            }
            setDialingCode(code, country);
        }
    }
}
