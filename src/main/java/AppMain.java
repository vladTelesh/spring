import com.project.tms.service.Service;
import com.project.tms.service.ServiceApp;

public class AppMain {
    public static void main(String[] args) {
        Service service = new ServiceApp();
        service.getBooksByNameAuthor("author");
    }
}
