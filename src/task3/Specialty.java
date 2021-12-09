package task3;

public enum Specialty {
    IT("Informational Technologies"),
    SE("Software Engineering"),
    CS("Computer Science"),
    AL("Applied Linguistics"),
    SA("System Analyze");

    private String description;

    Specialty(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
