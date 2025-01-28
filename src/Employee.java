public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String email;
    private int telephone;
    private String age;
    private double salary;

    public Employee(int id, String firstName, String lastName, String jobTitle, String email, int telephone, String age, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
        this.salary = salary;

    }

    public void info() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee First Name: " + firstName);
        System.out.println("Employee Last Name: " + lastName);
        System.out.println("Employee Job Title: " + jobTitle);
        System.out.println("Employee Email: " + email);
        System.out.println("Employee Telephone: " + telephone);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);


    }

    private void setEmployee(int id, String firstName, String lastName, String jobTitle, String email, int telephone, String age, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
        this.salary = salary;
    }

    private void setId() {
        this.id = id;
        System.out.println("Employee ID: " + id);
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
        System.out.println("Employee First Name: " + firstName);
    }
    private void setLastName(String lastName) {
        this.lastName = lastName;
        System.out.println("Employee Last Name: " + lastName);
    }
    private void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        System.out.println("Employee Job Title: " + jobTitle);
    }
    private void setEmail(String email) {
        this.email = email;
        System.out.println("Employee Email: " + email);
    }
    private void setTelephone(int telephone) {
        this.telephone = telephone;
        System.out.println("Employee Telephone: " + telephone);
    }
    private void setAge(String age) {
        this.age = age;
        System.out.println("Employee Age: " + age);
    }
    private void setSalary(double salary) {
        this.salary = salary;
        System.out.println("Employee Salary: " + salary);
    }



}
