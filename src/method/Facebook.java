package method;

public class Facebook {
private String uname;
private int pwd;
int age;
private long mnum;
public Facebook(String uname, int pwd, int age, long mnum) {
    this.uname = uname;
    this.pwd = pwd;
    this.age = age;
    this.mnum = mnum;
}

// Method to indicate profile creation
public void Profile() {
    System.out.println("Profile Created");
}

// Getter for username
public String getuname() {
    return uname;
}

// Getter for password
public int getpwd() {
    return pwd;
}

// Getter for mobile number
public long getmnum() {
    return mnum;
}

// Setter for username
public void setuname(String uname) {
    this.uname = uname;
}

// Setter for password
public void setpwd(int pwd) {
    this.pwd = pwd;
}

// Setter for mobile number
public void setmnum(long mnum) {
    this.mnum = mnum;
}
}
