public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }public void dancing(String dance){
        System.out.println("  My style dance "+dance);
    }

    @Override
    public String toString() {
        return "Dancer:"+
                "\n  Name: " + getName() +
                "\n  Designation: " + getDesignation() +
                "\n  Groupname: "+getGroupName();
    }
}
