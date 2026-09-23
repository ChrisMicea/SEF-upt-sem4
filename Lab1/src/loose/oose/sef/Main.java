package loose.oose.sef;
import loose.oose.sef.documents.*;
import loose.oose.sef.processors.*;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Document xml = new XML();
        Document json = new JSON();

        LinkedList<String> xmlInput = new LinkedList<>();
        xmlInput.add("<tag1>");
        xmlInput.add("hello");
        xmlInput.add("there");
        xmlInput.add("</tag1>");
        xmlInput.add("<tag2>");
        xmlInput.add("hello");
        xmlInput.add("</tag2>");
        xmlInput.add("<tag3>");
        xmlInput.add("</tag3>");
        xml.setWholeText(xmlInput);

        json.addElement("name1:");
        json.addElement("hello1");
        json.addElement("name2:");
        json.addElement("hello2");
        json.addElement("name3:");

        System.out.println(xml);
        System.out.println(json);
        System.out.println(xml.analyze());
        System.out.println(json.analyze());

        Processor search1 = new SearchProcessor("hello");
        Processor search2 = new SearchProcessor("there");
        Processor search3 = new SearchProcessor("hello2");
        Processor composed1 = new ComposedProcessor(search1, search2);
        Processor composed2 = new ComposedProcessor(composed1, search3);

        Document[] docs = new Document[2];
        docs[0] = xml;
        docs[1] = json;
        System.out.println(composed2.process(docs));
    }
}
