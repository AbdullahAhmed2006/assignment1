public class GrossSalaryCalculator {
    public static void main(String[] args) {
        double basicSalary = 105000;
        double dearnessAllowance = 0.40 * basicSalary;
        double houseRentAllowance = 0.20 * basicSalary;
        
        double grossSalary = basicSalary + dearnessAllowance + houseRentAllowance;
   
        System.out.println("Gross Salary: " + grossSalary);
    }
}
