package Model;

public class User {

    private String userName;
    private String passWord;
    private String status;
    private String password2;

    public User(String userName, String passWord, String status, String password2) {
        this.userName = userName;
        this.passWord = passWord;
        this.status = status;
        this.password2 = password2;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public User() {
    }

}
