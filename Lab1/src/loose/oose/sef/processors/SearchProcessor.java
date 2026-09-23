package loose.oose.sef.processors;

import loose.oose.sef.documents.Document;

import java.util.LinkedList;
import java.util.List;

public class SearchProcessor implements Processor {
    private String newSearchedText;

    public SearchProcessor(String newSearchedText) {
        this.newSearchedText = newSearchedText;
    }

    public int process(Document[] doc) {
        List<String> analizedContent = new LinkedList<String>();
        int cntr = 0;

        for (int i = 0; i < doc.length; i++) {
            analizedContent = doc[i].analyze();
            for (String s : analizedContent) {
                if (s.equals(newSearchedText))
                    cntr++;
            }
        }

        return cntr;
    }
}
