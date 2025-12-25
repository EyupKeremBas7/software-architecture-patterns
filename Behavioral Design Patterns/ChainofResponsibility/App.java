public class App {
    public static void main(String[] args) {

        NetworkHandler chain = new LocalNetworkHandler(
                                new IntranetNetworkHandler(
                                    new InternetNetworkHandler(null)
                                )
                             );

        NetworkRequest req1 = new NetworkRequest("192.168.1.1", RequestType.GET);
        NetworkRequest req2 = new NetworkRequest("10.0.0.1", RequestType.POST);
        NetworkRequest req3 = new NetworkRequest("88.88.88.88", RequestType.DELETE);
        
        NetworkRequest req4 = new NetworkRequest("0.0.4 .4", null);

        chain.handleRequest(req1);

        chain.handleRequest(req2);

        chain.handleRequest(req3);

        chain.handleRequest(req4);
    }
}