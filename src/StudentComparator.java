import java.util.*;

class StudentComparator{
    String firstName;
    String lastName;
    String ssn;

    String getFirstName(){
        return this.firstName;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    String getLastName(){
        return this.lastName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    String getSsn(){
        return this.ssn;
    }

    void setSsn(String ssn){
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return this.getFirstName() + "|" + this.lastName + "|" + this.ssn;
    }


    public static void main(String[] args){
        StudentComparator st1 = new StudentComparator();
        st1.setFirstName("def");
        st1.setLastName("def");
        st1.setSsn("123-12-3123");

        StudentComparator st2 = new StudentComparator();
        st2.setFirstName("def");
        st2.setLastName("abc");
        st2.setSsn("223-12-3123");

        List<StudentComparator> students = new ArrayList<StudentComparator>();
        students.add(st1);
        students.add(st2);

        System.out.println(students.toString());
        Collections.sort(students, Comparator.comparing(StudentComparator::getFirstName)
            .thenComparing(StudentComparator::getLastName)
            .thenComparing(StudentComparator::getSsn));

            System.out.println(students.toString());
    }
}