package tests;
import java.util.Set;
public class WebContextView extends TestBase{

    public static void setContextView() {
        Set <String> availableContexts = driver.getContextHandles();
        availableContexts.stream()
                .filter(context -> context.toLowerCase().contains("webview"))
        .forEach(newcontext -> driver.context(newcontext));

    }

}
