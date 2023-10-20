public class k_static {
    class Student {
        String name;
        int roll;
        static String schoolName;

        void setName(String name) {
            this.name = name;
        }

        String getName() { // Corrected the method signature
            return this.name;
        }
    }

    public static void main(String[] args) {
        k_static outerObj = new k_static();
        Student s1 = outerObj.new Student();
        s1.schoolName = "jvm"; // Access the static variable using the class name
        Student s2 = outerObj.new Student();
        System.out.println(Student.schoolName); // Access the static variable using the class name
    }
}
