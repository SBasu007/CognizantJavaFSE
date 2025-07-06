package CognizantJavaFSE.Week2_Ex2_Mockito.Week2_Ex2_Mockito.src.main.java;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void fetchData() {
        api.getData();
    }
}
