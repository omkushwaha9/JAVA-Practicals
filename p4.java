public class p4 {
    public static void main(String[] args) 
    {
        long Enrollno;
        String Name, Branch;
        Enrollno = Long.parseLong(args[0]);
        Name = args[1];
        Branch = args[2];
        System.out.println("Enrollno : " +Enrollno +"\n" + "Name : "+Name + "\n" + "Branch : "+Branch );
    }
}
