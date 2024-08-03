public class MarksCalculator {
    public static void main(String[] args) {
        int subject1 = 80;
        int subject2 = 90;
        int subject3 = 75;
        int subject4 = 60;
        int subject5 = 100;

        int totalMarksObtained = subject1 + subject2 + subject3 + subject4 + subject5;
        int maximumMarks = 5 * 100; // 5 subjects, each with a maximum of 100 marks

        double percentage = (double) totalMarksObtained / maximumMarks * 100;

        System.out.println("Total Marks Obtained: " + totalMarksObtained);
        System.out.println("Percentage: " + percentage + "%");
    }
}
