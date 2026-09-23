package loose.oose.sef.documents;

import java.util.LinkedList;
import java.util.List;

public class JSON extends Document {
    public JSON() {
        super();
    }

    public List<String> analyze() {
        List<String> returnStrings = new LinkedList<>();

        for (String s : wholeText) {
            if (!s.endsWith(":")) {
                returnStrings.add(s);
            }
        }

        return returnStrings;
    }
}
