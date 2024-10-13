package XMLParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;

public class DOMParser {
    public static void main(String[] args) {

        DOMReader("SampleFileNewDOM.xml");

        ArrayList<Friend> listFriend;
        listFriend = DOMReader("SampleFileNewDOM.xml");
        System.out.println(listFriend.get(0).toString());
    }

    public static ArrayList DOMReader(String fileName) {
        ArrayList listFriend = null;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        try {
            File file = new File(fileName);
            db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            Element root = doc.getDocumentElement();
            NodeList list = root.getElementsByTagName("friend");

            listFriend = new ArrayList<>();

            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                Element element = (Element) node;

                int id = Integer.parseInt(element.getAttribute("id"));
                String name = element.getElementsByTagName("name").item(0).getTextContent();
                int age = Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent());
                String description = element.getElementsByTagName("description").item(0).getTextContent();

                Friend friend = new Friend(id, name, age, description);
                String phoneNumber = element.getElementsByTagName("phoneNumber").item(0).getTextContent();
                friend.addPhoneNumber(phoneNumber);
                listFriend.add(friend);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        return listFriend;
    }

    public static void DOMWriter(String fileName) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            // root elements
            Document doc = docBuilder.newDocument();

            Element rootElement = (Element) doc.appendChild(doc.createElement("library"));
            rootElement.setAttribute("name", "Friend List");

            Element friend1 = (Element) rootElement.appendChild(doc.createElement("friend"));
            friend1.setAttribute("id", "001");

            Element name1 = (Element) friend1.appendChild(doc.createElement("name"));
            name1.setTextContent("Mr A");

            Element age1 = (Element) friend1.appendChild(doc.createElement("age"));
            age1.setTextContent("20");

            Element description1 = (Element) friend1.appendChild(doc.createElement("description"));
            description1.setTextContent("Studies in class M1");

            Element phoneNum1 = (Element) friend1.appendChild(doc.createElement("phoneNumber"));
            phoneNum1.setTextContent("Cellcard");

            Element number1 = (Element) phoneNum1.appendChild(doc.createElement("number"));
            number1.setTextContent("012-345-678");

            Element phoneNum1_2= (Element) friend1.appendChild(doc.createElement("phoneNumber"));
            phoneNum1_2.setTextContent("Smart");

            Element number1_2 = (Element) phoneNum1_2.appendChild(doc.createElement("number"));
            number1_2.setTextContent("010-122-123");



            Element friend2 = (Element) rootElement.appendChild(doc.createElement("friend"));
            friend2.setAttribute("id", "002");

            Element name2 = (Element) friend2.appendChild(doc.createElement("name"));
            name2.setTextContent("Mr B");

            Element age2 = (Element) friend2.appendChild(doc.createElement("age"));
            age2.setTextContent("20");

            Element description2 = (Element) friend2.appendChild(doc.createElement("description"));
            description2.setTextContent("Studies in class M1");

            Element phoneNum2 = (Element) friend2.appendChild(doc.createElement("phoneNumber"));
            phoneNum2.setTextContent("Cellcard");

            Element number2 = (Element) phoneNum2.appendChild(doc.createElement("number"));
            number2.setTextContent("012-345-555");

            FileOutputStream output = new FileOutputStream(fileName);
            writeXml(doc, output);

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeXml(Document doc, OutputStream output) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = null;
            transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(output);
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}


