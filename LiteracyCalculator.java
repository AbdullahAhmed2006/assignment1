public class LiteracyCalculator {
    public static void main(String[] args) {
        int totalPopulation = 80000;
        
        // Given percentages
        double percentageMen = 52;
        double percentageTotalLiteracy = 48;
        double percentageLiterateMen = 35;
        
        // Calculating the number of men and women
        int totalMen = (int) ((percentageMen / 100) * totalPopulation);
        int totalWomen = totalPopulation - totalMen;
        
        // Calculating the number of literate men and women
        int literateMen = (int) ((percentageLiterateMen / 100) * totalPopulation);
        int totalLiteratePeople = (int) ((percentageTotalLiteracy / 100) * totalPopulation);
        int literateWomen = totalLiteratePeople - literateMen;
        
        // Calculating the number of illiterate men and women
        int illiterateMen = totalMen - literateMen;
        int illiterateWomen = totalWomen - literateWomen;
        
        // Displaying the results
        System.out.println("Total Population: " + totalPopulation);
        System.out.println("Total Men: " + totalMen);
        System.out.println("Total Women: " + totalWomen);
        System.out.println("Literate Men: " + literateMen);
        System.out.println("Literate Women: " + literateWomen);
        System.out.println("Illiterate Men: " + illiterateMen);
        System.out.println("Illiterate Women: " + illiterateWomen);
    }
}
