public class JavaMultipleConditions {
    public static void main(String[ ] args) {
        int age = 14; 
        int height = 170;
        int health = 89;
        if (age < 17) {
            System.out.println("You're Young!");
        }
        if (age > 17) {
            System.out.println("You're an Adult");
        }
        if (height < 162) {
            System.out.println("You're Short!");
        }
        if (height > 162) {
            System.out.println("You're Tall");
        }
        if (health < 60) {
            System.out.println("You're Sick!");
        }
        if (health > 60) {
            System.out.println("You're Healthy");
        }
        else {
            System.out.println("You're Average");
        }
    }
}
