import java.util.Scanner;

public class v {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String studentName;
        int age;
        int year;
        float cgpa=0;
        int subCount;
        String str;
        System.out.println("Enter the name:");
        studentName = sc.nextLine();
        System.out.println("Enter the age:");
        age = sc.nextInt();
        System.out.println("str:");
        str=sc.nextLine();
        str=sc.nextLine();
        
        System.out.println("Énter the year of course:");
        year = sc.nextInt();
        System.out.println("Enter the  number of subject:");
        subCount = sc.nextInt();
        int marks[] = new int[subCount];
        sc.nextLine();
        for (int i = 0; i < subCount; i++) {
            System.out.println("Enter the mark of subject :" + i);
            marks[i] = sc.nextInt();
            cgpa=cgpa+marks[i];

        }
        System.out.println("--------Students Details-----------");
        System.out.println("Name:"+studentName);
        System.out.println("Age:"+age);
        System.out.println("Year:"+year);
        System.out.println("Cgpa:"+cgpa/subCount);
        System.out.println("-------------------------------------");

    

    }
}
