enum RequestType {
    GET, POST, DELETE;
}

class NetworkRequest {
    private int[] octets;
    private RequestType requestType;

    public NetworkRequest(String ip, RequestType requestType) {
        this.octets = new int[4];
        parseIP(ip);
        this.requestType = requestType;
    }

    public void parseIP(String ip) {
        if (ip == null || ip.isEmpty()) {
            for (int i = 0; i < 4; i++) this.octets[i] = 0;
            return;
        }
        String[] parts = ip.split("\\.");
        if (parts.length == 4) {
            for (int i = 0; i < 4; i++) {
                try {
                    int val = Integer.parseInt(parts[i]);
                    if (val >= 0 && val <= 255) {
                        this.octets[i] = val;
                    } else {
                        this.octets[i] = 0;
                    }
                } catch (NumberFormatException e) {
                    this.octets[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < 4; i++) this.octets[i] = 0;
        }
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public String getIp() {
        return octets[0] + "." + octets[1] + "." + octets[2] + "." + octets[3];
    }
}

abstract class NetworkHandler {
    protected NetworkHandler nextHandler;

    public NetworkHandler getNext() {
        return nextHandler;
    }

    public void setNext(NetworkHandler handler) {
        this.nextHandler = handler;
    }

    public NetworkHandler(NetworkHandler handler) {
        this.nextHandler = handler;
    }

    // The template method for handling the request
    public void handleRequest(NetworkRequest request) {
        if (canHandle(request)) {
            process(request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Request could not be processed: " + request.getIp() + " " + request.getRequestType());
        }
    }

    public abstract void process(NetworkRequest request);

    public abstract boolean canHandle(NetworkRequest request);
}

class LocalNetworkHandler extends NetworkHandler {
    public LocalNetworkHandler(NetworkHandler handler) {
        super(handler);
    }

    @Override
    public void process(NetworkRequest request) {
        System.out.println("Local Network (GET) is processing this request: IP=" + request.getIp());
    }

    @Override
    public boolean canHandle(NetworkRequest request) {
        return request.getRequestType() == RequestType.GET;
    }
}

class IntranetNetworkHandler extends NetworkHandler {
    public IntranetNetworkHandler(NetworkHandler handler) {
        super(handler);
    }

    @Override
    public void process(NetworkRequest request) {
        System.out.println("Intranet Network (POST) is processing this request: IP=" + request.getIp());
    }

    @Override
    public boolean canHandle(NetworkRequest request) {
        return request.getRequestType() == RequestType.POST;
    }
}

class InternetNetworkHandler extends NetworkHandler {
    public InternetNetworkHandler(NetworkHandler handler) {
        super(handler);
    }

    @Override
    public void process(NetworkRequest request) {
        System.out.println("Internet Network (DELETE) is processing this request: IP=" + request.getIp());
    }

    @Override
    public boolean canHandle(NetworkRequest request) {
        return request.getRequestType() == RequestType.DELETE;
    }
}