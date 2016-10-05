/**
 * Created by Serg on 22.09.2016.
 */
public class Contact extends MyProfile
{
    private String number;
    private String name;
    private String lastName;
    private Object photo;

    public void Contact()
    {

    }

    public Object getPhoto() {
        return this.photo;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected static void setName(String name) {

    }

    protected void setNumber(String number) {
        this.number = number;
    }

    protected void setPhoto(Object photo) {
        this.photo = photo;
    }
}
