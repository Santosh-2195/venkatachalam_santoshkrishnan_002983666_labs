/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Santo_20p5en3
 */
public class Feature {
    private Product owner;
    private String name;
    private Object value;
    
    public Feature(Product owner){
        this.owner=owner;
    }

    public Feature(Product owner, String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public Product getOwner() {
        return owner;
    }

    public void setOwner(Product owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
    return name;
}
}
