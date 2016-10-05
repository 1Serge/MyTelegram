import java.sql.Time;
import java.util.Date;

/**
 * Created by Serg on 22.09.2016.
 */
public class Message extends MyProfile
{
    private String adress;
    private String txt;
    private Date date;
    private Time time;
    private boolean inOut;   // Входящее лил исходящее сообщение

    public Message()
    {

    }

    public Message (String adress, String txt, Date date, Time time, boolean inOut)
    {
        this.adress = adress;
        this.txt = txt;
        this.date = date;
        this.time = time;
        this.inOut = inOut;
    }

    public Date getDate() {
        return this.date;
    }

    public boolean isInOut() {
        return this.inOut;
    }

    public String getTxt() {
        return this.txt;
    }

    public Time getTime() {
        return this.time;
    }

    protected void setDate(Date date) {
        this.date = date;
    }

    protected void setInOut(boolean inOut) {
        this.inOut = inOut;
    }

    protected void setTxt(String txt) {
        this.txt = txt;
    }

    protected void setTime(Time time) {
        this.time = time;
    }

    public String getAdress() {
        return adress;
    }

    protected void setAdress(String adress) {
        this.adress = adress;
    }
}
