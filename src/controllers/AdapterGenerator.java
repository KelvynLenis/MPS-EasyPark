package controllers;

public class AdapterGenerator implements ClientGenerator {
    private ExportJSON exportJSON;
    private String name;

    AdapterGenerator(ExportJSON exportJSON, String name) {
        this.exportJSON = exportJSON;
        this.name = name;
    }

    @Override
    public String getReportInPdf() {
        System.out.println(this.name);
        exportJSON.exportUsers();
        // Get to external service to generate PDF
        return "ReportGenerated";
    }
}
