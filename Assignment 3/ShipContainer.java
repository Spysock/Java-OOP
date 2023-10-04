/**
 * @author Abody Majeed 101227327
 * @version 1.00
 */
public abstract class ShipContainer {
    protected int containerID;

    /**
     * Default constructor for ShipContainer which sets the containerID to 0.
     */
    public ShipContainer() {
        containerID = 0;
    }

    /**
     * Getter method that takes NO parameters and returns the containerID.
     *
     * @return containerID.
     */
    public int getContainerID() {
        return containerID;
    }

    /**
     * Abstract setter method that sets the contents variable using a string.
     *
     * @param contents the contents of whatever the user inputs as a string.
     */
    public abstract void setContents(String contents);

    /**
     * Setter method that sets the containerID
     *
     * @param containerID an int that is automatically made and acts as the ID of the container.
     */
    public void setContainerID(int containerID) {
        this.containerID = containerID;
    }

    /**
     * Method that prints out the contents of the container.
     * This class has no contents.
     *
     * @return an empty string.
     */
    public String containerContentList() {
        return "";
    }

    /**
     * prints the contents of the container content list.
     * This will be outputted to the console.
     */
    public void printContent() {
        System.out.println(containerContentList());
    }
}
