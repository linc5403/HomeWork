package club.banyuan.bean;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private int id;
    private Date createdTime;
    private int userId;
    private int blogId;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", createdTime=" + createdTime +
                ", userId=" + userId +
                ", blogId=" + blogId +
                ", content='" + content + '\'' +
                '}';
    }

    public void setCommenter(User user) {

    }

    public void setBlog(Blog blog) {

    }

}
