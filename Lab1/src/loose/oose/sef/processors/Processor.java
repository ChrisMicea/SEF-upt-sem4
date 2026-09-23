package loose.oose.sef.processors;

import loose.oose.sef.documents.Document;

public interface Processor {
    int process(Document[] doc);
}
