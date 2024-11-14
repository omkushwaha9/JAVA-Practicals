class Protection {
  protected String fname = "OM";
  protected String lname = "KUSHWAHA";
  protected String email = "OKUSHWAHA@992.com";
  protected int age = 24;
}

class Student extends Protection {
  private int graduationYear = 2018;

  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
  }
}
