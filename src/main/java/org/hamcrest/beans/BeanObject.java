package org.hamcrest.beans;

public class BeanObject {

    private String property2;
    private boolean booleanProperty2;

    public BeanObject() {
    }

    public BeanObject(String property2, boolean booleanProperty2) {
        this.property2 = property2;
        this.booleanProperty2 = booleanProperty2;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    public boolean isBooleanProperty2() {
        return booleanProperty2;
    }

    public void setBooleanProperty2(boolean booleanProperty2) {
        this.booleanProperty2 = booleanProperty2;
    }
}
