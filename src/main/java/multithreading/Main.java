package multithreading;

public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource(0);
        ResourceProcessor processor = new ResourceProcessor();

        Decreaser decreaser = new Decreaser(processor, resource);
        Thread decreaseThread = new Thread(decreaser);
        decreaseThread.start();

        Increaser increaser1 = new Increaser(processor, resource);

        increaser1.start();
    }
}
