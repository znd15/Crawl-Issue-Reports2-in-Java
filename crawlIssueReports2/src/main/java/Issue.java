    import java.util.List;
    public class Issue {
    String type;
    String status;
    String priority;
    String resolution;
    String affectsVersions;
    String fixVersions;
    String components;
    String assignee;
    String reporter;
    String description;
    List<String> comments;

    public Issue(String type, String status, String priority, String resolution, String affectsVersions,
                     String fixVersions, String components, String assignee, String reporter,
                     String description, List<String> comments) {
        super();
        this.type = type;
        this.status = status;
        this.priority = priority;
        this.resolution = resolution;
        this.affectsVersions = affectsVersions;
        this.fixVersions = fixVersions;
        this.components = components;
        this.assignee = assignee;
        this.reporter = reporter;
        this.description = description;
        this.comments = comments;
    }
        public String getType() {
            return type.replace(",", ":");
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStatus() {
            return status.replace(",", ":");
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getPriority() {
            return priority.replace(",", ":");
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }

        public String getResolution() {
            return resolution.replace(",", ":");
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        public String getAffectsVersions() {
            return affectsVersions.replace(",", ":");
        }

        public void setAffectsVersions(String affectsVersions) {
            this.affectsVersions = affectsVersions;
        }

        public String getFixVersions() {
            return fixVersions.replace(",", ":");
        }

        public void setFixVersions(String fixVersions) {
            this.fixVersions = fixVersions;
        }

        public String getComponents() {
            return components.replace(",", ":");
        }

        public void setComponents(String components) {
            this.components = components;
        }

        public String getAssignee() {
            return assignee.replace(",", ":");
        }

        public void setAssignee(String assignee) {
            this.assignee = assignee;
        }

        public String getReporter() {
            return reporter.replace(",", ":");
        }

        public void setReporter(String reporter) {
            this.reporter = reporter;
        }

        public String getDescription() {
            return description.replace(",", ":");
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getComments() {
            String comment = "";
            for (String string : comments) {
                comment += string;
                comment += "------";
            }
            return comment.replace(",", ":");
        }


    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
