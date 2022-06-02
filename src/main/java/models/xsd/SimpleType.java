package models.xsd;

public class SimpleType {
    private String name = "";
    private Element element;

    public SimpleType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "SimpleType{" +
                "name='" + name + '\'' +
                '}';
    }
}
