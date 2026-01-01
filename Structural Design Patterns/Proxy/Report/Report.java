interface Report {
    void display(User user);
}

class LargeReport implements Report {
    private String content;

    public LargeReport() {
        System.out.println("Loading heavy report from database... (Please wait)");
        try { 
            Thread.sleep(10000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = "Annual Strategic Analysis Report: [Massive Data Content]";
        System.out.println("Report loaded successfully!");
    }

    @Override
    public void display(User user) {
        System.out.println(content);
    }
}

class LargeReportProxy implements Report {
    private static LargeReport cachedReport;

    @Override
    public void display(User user) {
        if (!user.isAdmin()) {
            System.out.println("Access Denied! Only Admin can view this report.");
            return;
        }

        if (cachedReport == null) {
            cachedReport = new LargeReport();
        }
        
        cachedReport.display(user);
    }
}

class User {
    private String name;
    private boolean isAdmin;

    public User(String name, boolean isAdmin) {
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
    
    public String getName() {
        return name;
    }
}