package A1;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.util.ArrayList;
import javax.xml.transform.dom.*;
import java.io.*;

/**
 * Created by User on 03/10/2016.
 */
public class Handle_File {

    public void ST_Read_File(ArrayList cards) {
        try {

            System.out.println("Importing data from: MstCards_151021.plist");
            DOMParser parser = new DOMParser();
            parser.parse("MstCards_151021.plist");
            Document doc = parser.getDocument();
            //printDocument(doc, System.out);
            // Get the document's root XML node
            NodeList root = doc.getChildNodes();
            //System.out.println(root.getLength());
            //System.out.println("NodeList: " + nodeListToString(root));
            // Navigate down the hierarchy to get to the CEO node
            Node card_dict_1_Node = root.item(0).getNextSibling();
            NodeList card_dict_1_List = card_dict_1_Node.getChildNodes();

            //System.out.println("NodeList1(" + card_dict_1_List.getLength() + "): ");// + nodeListToString(card_dict_1_List));

            Node card_array_1_Node = card_dict_1_List.item(0).getNextSibling();
            NodeList card_array_1_List = card_array_1_Node.getChildNodes();

            //System.out.println("NodeList2(" + card_array_1_List.getLength() + "): ");// + nodeListToString(card_array_1_List));

            Node card_dict_2_Node = getNode("array", card_array_1_List);
            NodeList card_array_2 = card_dict_2_Node.getChildNodes();

            //NodeList card_array_2 = card_nodes.getChildNodes();
            //System.out.println("NodeList3(" + card_array_2.getLength() + "): " + nodeListToString(card_array_2));

            int card_index = 0;
            Node this_card = card_array_2.item(card_index);
            boolean check_card = true;
            while (check_card) {
                //System.out.println("CardName: " + this_card.getNodeName());
                if (this_card.getNodeName() != "dict") {
                    // Dealing with a Faulty Card
                    this_card = card_array_2.item(card_index++);
                    if (this_card == null) {
                        check_card = false;
                    }
                    continue;
                }
                //System.out.println("Card: " + nodeToString(this_card));

                // We have a Correct Card
                ST_Card new_card = new ST_Card();
                int card_property_index = 0;
                NodeList card_properties_node_2 = this_card.getChildNodes();
                //System.out.println("NodeList3(" + card_properties_node_2.getLength() + "): " + nodeListToString(card_properties_node_2));
                Node card_properties_node = card_properties_node_2.item(card_property_index);
                //System.out.println("Card: " + nodeToString(card_properties_node));
                boolean check_card_property = true;
                while (check_card_property) {
                    //System.out.println("CardPropertyName: " + card_properties_node.getNodeName());
                    if (card_properties_node.getNodeName() != "key") {
                        // Dealing with a Faulty Card Property
                        card_properties_node = card_properties_node_2.item(card_property_index++);
                        if (card_properties_node == null) {
                            check_card_property = false;
                        }
                        continue;
                    }

                    boolean check_next_node = true;
                    Node card_property_node_sibling = card_properties_node.getNextSibling();

                    while (check_next_node)
                    {
                        String card_properties_node_sibling_node_value = card_property_node_sibling.getNodeName();
                        //System.out.println("CardPropertySiblingNodeValue: " + card_properties_node_sibling_node_value);
                        if (card_properties_node_sibling_node_value == null) {
                            card_property_node_sibling = card_properties_node_2.item(card_property_index++);
                        }
                        if (!(card_properties_node_sibling_node_value.equalsIgnoreCase("key")
                                || card_properties_node_sibling_node_value.equalsIgnoreCase("string")
                                || card_properties_node_sibling_node_value.equalsIgnoreCase("array"))) {
                            card_property_node_sibling = card_properties_node_2.item(card_property_index++);
                        }
                        else
                        {check_next_node = false;}
                    }

                //Node card_properties_node = card_array_2.item(card_index);
                //System.out.println("Card: " + nodeToString(card_array_2.item(card_index)));
                //NodeList card_properties_node_2 = this_card.getChildNodes();
                //System.out.println("Card Property Length: " + card_properties_node_2.getLength());
                //for (int j = 0; j < card_properties_node_2.getLength(); j += 2) {
                    //if (card_properties_node_2.item(j).getNodeName() != "key") { continue; }
                    if (card_property_node_sibling.getTextContent().equalsIgnoreCase("occurrence")) {
                        Node occurence_node = card_property_node_sibling;
                        NodeList occurrence_node_2 = occurence_node.getChildNodes();
                        String value = "";
                        for (int k = 0; k < occurrence_node_2.getLength(); k++) {
                            if (k < occurrence_node_2.getLength() - 1) {
                                value += occurrence_node_2.item(k).getTextContent() + ",";
                            } else {
                                value += occurrence_node_2.item(k).getTextContent();
                            }
                        }
                        new_card.set_var(card_properties_node.getTextContent(), value);

                    }
                    //System.out.println("Key: " + card_properties_node.getTextContent());
                    //System.out.println("Value: " + card_property_node_sibling.getTextContent());
                    new_card.set_var(card_properties_node.getTextContent(),
                            card_property_node_sibling.getTextContent());

                    card_properties_node = card_properties_node_2.item(card_property_index++);
                    if (card_properties_node == null) {
                        check_card_property = false;
                    }
                }
                System.out.println(new_card.toString());
                cards.add(new_card);

                this_card = card_array_2.item(card_index++);
                if (this_card == null) {
                    check_card = false;
                }
            }




        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Import Complete");
    }





            /*Node p_list = getNode("plist", root);
            System.out.println("Node: " + nodeToString(p_list));
            NodeList p_list_2 = p_list.getChildNodes();
            System.out.println("NodeList(" + p_list_2.getLength() + "): " + nodeListToString(p_list_2));
            Node card_dictionary = getNode("dict", p_list_2);

            //System.out.println("Node: " + nodeToString(card_dictionary));
            NodeList card_dictionary_2 = card_dictionary.getChildNodes();
            Node card_array = getNode("array", card_dictionary_2);
            NodeList card_array_2 = card_array.getChildNodes();*/

/*
            for (int i = 0; i < card_array_2.getLength(); i++){
                ST_Card new_card = new ST_Card();
                Node card_node = card_array_2.item(i);
                NodeList card_node_2 = card_node.getChildNodes();
                for (int j = 0; j < card_node_2.getLength(); j+=2){
                    if (card_node_2.item(j).getNodeValue().equalsIgnoreCase("occurrence")) {
                        Node occurence_node = card_node_2.item(j).getNextSibling();
                        NodeList occurrence_node_2 = occurence_node.getChildNodes();
                        String value = "";
                        for (int k = 0; k < occurrence_node_2.getLength(); k++){
                            if (k < occurrence_node_2.getLength() -1){
                                value += occurrence_node_2.item(k).getNodeValue() + ",";
                            }
                            else{
                                value += occurrence_node_2.item(k).getNodeValue();
                            }
                        }
                        new_card.set_var(card_node_2.item(j).getNodeValue(), value);

                    }
                    new_card.set_var(card_node_2.item(j).getNodeValue(), card_node_2.item(j).getNextSibling().getNodeValue());


                }
                cards.add(new_card);
            }


        }
        catch ( Exception e ) {
            e.printStackTrace();
        } */

    public static void printDocument(Document doc, OutputStream out) throws IOException, TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        transformer.transform(new DOMSource(doc),
                new StreamResult(new OutputStreamWriter(out, "UTF-8")));
    }


    private String nodeToString(Node node) {
        StringWriter sw = new StringWriter();
        try {
            Transformer t = TransformerFactory.newInstance().newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.transform(new DOMSource(node), new StreamResult(sw));
        } catch (TransformerException te) {
            System.out.println("nodeToString Transformer Exception");
        }
        return sw.toString();
    }
    private String nodeListToString(NodeList nodeList) {
        String fault="";
     for (int i=0; i < nodeList.getLength(); i++) {
         try {

             Node elem = nodeList.item(i);//Your Node
             StringWriter buf = new StringWriter();
             Transformer xform = TransformerFactory.newInstance().newTransformer();
             xform.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
             xform.setOutputProperty(OutputKeys.INDENT, "yes");
             xform.transform(new DOMSource(elem), new StreamResult(buf)) ;
             fault += buf.toString(); // your string
         }
         catch (Exception e)
         {}

     }
     return fault;
    }

    protected Node getNode(String nodeName, NodeList nodes) {
        for ( int x = 0; x < nodes.getLength(); x++ ) {
            Node node = nodes.item(x);
            //System.out.println("NodeName: " + node.getNodeName());
            if (node.getNodeName().equalsIgnoreCase(nodeName)) {
                return node;
            }
        }

        return null;
    }







}
