package multithreading;

public class Increaser extends Thread {
    private ResourceProcessor processor;
    private Resource resource;

    public Increaser(ResourceProcessor processor, Resource resource) {
        this.processor = processor;
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            processor.increase(resource);
        }
    }
}
