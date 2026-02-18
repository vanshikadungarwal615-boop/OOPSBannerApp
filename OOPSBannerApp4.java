public class OOPSBannerApp4 {
    
    /**
     * Main method - entry point of the application.
     * Prints the OOPS banner using asterisks and spaces.
     * Each character is represented in a 7-line format with 9-character width.
     * Uses a String array to store banner lines and a for-each loop to print them.
     * 
     * @param args Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        // Create a String array to store all seven lines of the OOPS banner
        String[] bannerLines = {
            String.join("", " ***   ", " ***   ", " ***** ", "  *****"),
            String.join("", "*   *  ", "*   *  ", "*     *", " *    "),
            String.join("", "*   *  ", "*   *  ", "*     *", " *    "),
            String.join("", "*   *  ", "*   *  ", "****** ", "  **** "),
            String.join("", "*   *  ", "*   *  ", "*      ", "      *"),
            String.join("", "*   *  ", "*   *  ", "*      ", "      *"),
            String.join("", " ***   ", " ***   ", "*      ", " ***** ")
        };
        
        // Use a for-each loop to iterate through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}