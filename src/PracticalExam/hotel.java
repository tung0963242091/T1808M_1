package PracticalExam;

import javax.naming.Name;

public class hotel {
    public String name;
    public String location;
    public String ownername;

    public hotel (String name, String location, String ownerName) {
        this.setName(name);
        this.setLocation(location);
        this.setOwnerName(ownername);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownername;
    }

    public void setOwnerName(String ownerName) {
        this.ownername = ownerName;
    }

    public void setname (String name) {
        this.name = name;
    }

    public void setlocation(String location) {
        this.location = location;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public void ketqua(){
        System.out.println("Hotel:"+this.getName()+" ---- "+this.getLocation()+" of "+this.getOwnerName());
    }
}
