//Wrapper Classes Activity
//problem 1

class Student {
        public void calculateFeesStructure(long studentId, char studentGrade, double monthlyFees, boolean isScholarshipEligible) {
            if (studentId !=0 && studentGrade =='A' && isScholarshipEligible == true) {
                double fees = monthlyFees - monthlyFees*10/100;
                System.out.println("After exemption of 10%, new fees is :"+(int)fees);
            }
            else if (studentId !=0 && studentGrade =='B' && isScholarshipEligible == true) {
                double fees = monthlyFees - monthlyFees*8/100;
                System.out.println("After exemption of 8%, new fees is :"+(int)fees);
            }
            else if (studentId !=0 && studentGrade =='C' && isScholarshipEligible == true) {
                double fees = monthlyFees - monthlyFees*4/100;
                System.out.println("After exemption of 4%, new fees is :"+(int)fees);
            }
            else {
                System.out.println("Not Eligible for Exemption");
            }
    }

//problem 2

    public void compareMarks(long Maths, double English) {
        if ((int)English > (int)Maths) {
            System.out.println("English mark is higher than Maths");
        }
        else if ((int)Maths > (int)English) {
            System.out.println("Maths mark is higher than English");
        }
        else if ((int)Maths == (int)English) {
            System.out.println("Both Are Equal");
        }
    }

//problem 3

    public void validateFees(Double Fees) {
        if (Fees.isInfinite()) {
            System.out.println("Fees is infinite");
        }
        else {
            System.out.println("Fees is not infinite");
        }
        System.out.println(Fees.byteValue());
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.calculateFeesStructure(234, 'C', 600, true);
        s.calculateFeesStructure(115, 'B', 909, true);
        s.calculateFeesStructure(980, 'G', 1810, false);

        s.compareMarks(85, 65);
        s.compareMarks(56, 98);
        s.compareMarks(84, 84);

        s.validateFees(100d);
    }
}