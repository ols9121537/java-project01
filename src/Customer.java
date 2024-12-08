
public class Customer {

    private String email;
    private String name;
    private String Phonenumber;

    // null  허용 생성자
    public Customer (String name, String Phonenumber, String email) {
        this.name = name;
        this.Phonenumber = Phonenumber;
        this.email = email;
    }

    @Override
    public String toString() {
        String prettyString = "";

        // 이름: 익명(null)
        // 전화번호: 비공개(null)
        // 이메일: 비공개(null)

        String[] strings = new String[5];

        strings[0] = "[고객: ";
        // 이름: 익명(null)
        //삼항연산자 사용 if 문
        //strings[1] = this.name != null ? "이름:" + this.name : "이름:익명";
        strings[1] = haveName() ? "이름:" + this.name : "이름:익명";
        

        /*if (this.name != null) {
            strings[1] = "이름:" + this.name;
        } else {
            strings[1] = "이름:익명";
        }
        */

        // 전화번호: 비공개(null)
        if (this.Phonenumber != null) {
            strings[2] = " 전화번호:" + this.Phonenumber;
        } else {
            strings[2] = " 전화번호:비공개";
        }
        // 이메일: 비공개(null)
        if (this.email != null) {
            strings[3] = " 이메일:" + this.email;
        } else {
            strings[3] = " 이메일:비공개";
        }

        strings[4] = "]";
        /* 
           1: "[고객: 
           2: 이름:" + customer.getName() + ", "
           3: + "전화번호: " + customer.getPhonenumber()
           4: + ", 이메일: " + customer.getEmail()
           5: + " ]
        */
        for (String string: strings) {
             prettyString += string;
        }

        return prettyString;
    }

    private boolean haveName() {
        return this.name != null;
    }

    public Object getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

}

