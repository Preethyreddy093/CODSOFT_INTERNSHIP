import java.util.*;
class StudentGradeCalculator{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of subjects:");
        int n=sc.nextInt();
        int[] sub=new int[n];
        for(int i=0;i<n;i++)
        {
            sub[i]=sc.nextInt();
        }
        int totalMarks=0;
        for(int i=0;i<n;i++)
        {
            totalMarks=totalMarks+sub[i];
        }
        double avg=totalMarks/n;
        if(avg>=90 && avg<=100)
        {
            System.out.println("You scored: "+totalMarks+" Marks and your average is: "+avg+" and you are awarded with 'O' grade");
        }
        else if(avg>=80 && avg<90)
        {
            System.out.println("You scored: "+totalMarks+" Marks and your average is: "+avg+" and you are awarded with 'A+' grade");
        }
        else if(avg>=70 && avg<80)
        {
            System.out.println("You scored: "+totalMarks+" Marks and your average is: "+avg+" and you are awarded with 'A' grade");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.println("You scored: "+totalMarks+" Marks and your average is: "+avg+" and you are awarded with 'B+' grade");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.println("You scored: "+totalMarks+" Marks and your average is: "+avg+" and you are awarded with 'B' grade");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.println("You scored: "+totalMarks+" Marks and your average is: "+avg+" and you are awarded with 'C' grade");
        }
        else
        {
            System.out.println("You scored: "+totalMarks+" Marks and your average is: "+avg+" and you failed in this exam");
        }
        sc.close();
    }
}