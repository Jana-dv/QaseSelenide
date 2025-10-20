package enums;

public enum SectionsNaming {
    PROJECTS("Projects");

    private final String displayName;

    SectionsNaming(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
