package creation.prototype;
/*Prototype pattern refers to creating duplicate object while keeping performance in mind.
This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves implementing a prototype interface which tells to create a clone of the current object.
 This pattern is used when creation of object directly is costly.
 For example, an object is to be created after a costly database operation.
 We can cache the object, returns its clone on next request and update the database as
 and when needed thus reducing database calls.*/

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone(){
        Object clone = null;

        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }
}
