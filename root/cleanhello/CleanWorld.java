package cleanhello;

/** Here is a traditionnal message "Hello World" with call in main function
* @author: Clément DEFER
*/
public class CleanWorld {
    /** The software start here */
    public static void main(String[] args) {
        sayHelloTo("world");
    }

    /** Display the message "hello" to the recipient
    * @param recipient The recipient of the message
    */
    private static void sayHelloTo(String recipient) {
        System.out.println("Hello " + recipient);
    }
}