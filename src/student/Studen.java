package student;

import java.time.LocalDate;

public class Studen {
    public String name;
    public LocalDate date;
    public String mail;

    public Studen(String name, LocalDate date, String mail) {
        this.name = name;
        this.date = date;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void learn(String learn){
        System.out.println(learn);
    }
    public void info(){
        System.out.println(this.name);
        System.out.println(this.date);
        System.out.println(this.mail);
    }
}
