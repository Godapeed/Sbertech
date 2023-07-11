package multithreading;

public class Decreaser implements Runnable {
    private ResourceProcessor processor;
    private Resource resource;

    public Decreaser(ResourceProcessor processor, Resource resource) {
        this.processor = processor;
        this.resource = resource;
    }

    @Override
    public void run() {
        synchronized (resource) {

                try {
                    while (resource.getValue() < 5) {
                        resource.wait();
                    }
                    while (resource.getValue() !=0) {
                        processor.decrease(resource);
                        Thread.sleep(200); // Имитация работы
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }
}
