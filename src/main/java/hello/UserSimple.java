package hello;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserSimple {
    @Expose() // expose all
    private int id;
    @Expose(serialize = false, deserialize = true)
    private String name;
    private String email;
    private transient boolean isDeveloper;

    public UserSimple(int id, String name, String email,  boolean isDeveloper) {
        this.name= name;
        this.email= email;
        this.id= id;
        this.isDeveloper= isDeveloper;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getGmail(){
        return email;
    }
    public boolean getIsDeveloper(){
        return isDeveloper;
    }
}