package loose.oose.sef.documents;

import java.util.LinkedList;
import java.util.List;

public abstract class Document {
    protected List<String> wholeText;

    public List<String> getWholeText() {
        return wholeText;
    }

    public void setWholeText(List<String> wholeText) {
        this.wholeText = wholeText;
    }

    public void addElement(String element) {
        wholeText.add(element);
    }

    @Override
    public String toString() {
        return "Document{" +
                "wholeText=" + wholeText +
                '}';
    }

    public Document() {
        wholeText = new LinkedList<>();
    }

    abstract public List<String> analyze();
}
