public class Main {
    public static void main(String[] args) throws InterruptedException {
        TimeTracker timeTracker = new TimeTracker();
        timeTracker.start("fileCopyOperation");
        Thread.sleep(324);
        timeTracker.update("fileCopyOperation");
        Thread.sleep(213);
        timeTracker.update("fileCopyOperation");
        Thread.sleep(400);
        // timeTracker.finish("fileCopyOperation");
        timeTracker.getReport();
    }
}
