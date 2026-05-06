public class Task {
    private int id;
    private String description;
    private String status;
    private String createAt;
    private String updateAt;
    public Task(int id, String description, String status, String createAt, String updateAt) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }
    public int getId() {
        return id;
    }       
    public String getDescription() {
        return description;
    }
    public String getStatus() {
        return status;
    }
    public String getCreateAt() {
        return createAt;
    }
    public String getUpdateAt() {
        return updateAt;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

}
