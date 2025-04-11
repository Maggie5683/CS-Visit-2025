public class Hello {

    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    public String getNameFromUser() {
        System.out.print("Please enter your name: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.greet();
    }


