package loose.oose.sef.documents;

import java.util.LinkedList;
import java.util.List;

public class XML extends Document {
    public XML() {
        super();
    }

    public List<String> analyze(){
        List<String> returnStrings = new LinkedList<>();
        returnStrings.add("XML");

        for (String s : wholeText) {
            if (!s.startsWith("<")) {
                returnStrings.add(s);
            }
        }

        return returnStrings;
    }
}
