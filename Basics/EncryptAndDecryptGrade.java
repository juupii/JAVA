public class EncryptAndDecryptGrade {
    public static void main(String[] args) {
        char grade = 'B';
        // encrypt grade
        grade = (char) (grade + 8);
        System.out.println((grade));
        //decyrpt grade
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
