package multithreading;

public class ResourceProcessor {
    public void increase(Resource resource) {
        synchronized (resource) {
            resource.setValue(resource.getValue() + 1);
            System.out.println(resource.getValue());
            resource.notifyAll();
        }
    }

    public void decrease(Resource resource) {
        synchronized (resource) {
            resource.setValue(resource.getValue() - 1);
            System.out.println(resource.getValue());
            resource.notifyAll();
        }
    }
}
