public class Hello implements IHello {

    private String helloMessage;

    public Hello() {
        System.out.println("Hey!!! i'am a constructor");
    }

    public void createHello(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @Override
    public void sayHello() {
        System.out.println(this.helloMessage);
    }
}