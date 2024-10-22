/**
 * InnerInheritance
 */
class parent {
    String name;
    String gender;

    void dis(String name, String gender) {
        System.out.println("parent name:" + name);
        System.out.println("parent gender::" + gender);
    }
}
<<<<<<< HEAD
=======
class son extends parent{
    int age ;
    String Sname;
    void dis(){
        System.out.println("the son name is:"+ Sname);
        System.out.println("son age is :"+ age);
    }

 // here i modified 
 void disp(){
  System.out.println(" here pull cmd"):
}


class son extends parent {
    int age;
    String Sname;

    void dis() {
        System.out.println("the son name is:" + Sname);
        System.out.println("son age is :" + age);
    }

 void disp(){
  System.out.println(" here pull cmd");
}

    public class Inheritance {
        public static void main(String[] args) {
            son s = new son();
            s.Sname = "krtika";
            s.age = 34;
            s.dis();
            s.dis("kanha", "male");
        }
    }
}
}
