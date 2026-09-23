package loose.oose.sef.processors;

import loose.oose.sef.documents.Document;

public class ComposedProcessor implements Processor {
    private Processor[] processorSequence;

    public ComposedProcessor(Processor... processorSequence) {
        this.processorSequence = processorSequence;
    }

    public int process(Document[] doc) {
        int cntr = 0;

        for(Processor processor : processorSequence) {
            cntr += processor.process(doc);
        }

        return cntr;
    }
}
