package models.xsd;

import java.util.ArrayList;

/**
 * <h1>&lt xs:complexType&gt</h1>
 * <p>Object representing a complex type</p>
 */
public class ComplexType {
    private String name = "";
    private String tagName = "";
    //Arraylist that stores <xs:element> objects
    private ArrayList<Element> childrenElements = new ArrayList<>(0);

    public ComplexType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public ArrayList<Element> getChildrenElements() {
        return childrenElements;
    }

    public void setChildrenElements(ArrayList<Element> childrenElements) {
        this.childrenElements = childrenElements;
    }

    public void addChildElementToArrayList(Element element) {
        childrenElements.add(element);
    }

    public Element getChildElementByName(String name) {
        for (Element element : childrenElements) {
            if (element.getName().equals(name)) {
                return element;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "ComplexType{" +
                "name='" + name + '\'' +
                ", tagName='" + tagName + '\'' +
                ", childrenElements=" + childrenElements +
                '}';
    }
}
