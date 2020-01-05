package club.banyuan.myblog.module;

import java.io.Serializable;
import java.sql.Date;

public class Comment implements Serializable {
    private Integer id;
    private Date createdTime;
    private Integer userId;
    private Integer blogId;
    private String content;

    public Comment() {
    }

    public Comment(Date createdTime, Integer userId, Integer blogId, String content) {
        this.createdTime = createdTime;
        this.userId = userId;
        this.blogId = blogId;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", createdTime='" + createdTime + '\'' +
                ", userId=" + userId +
                ", blogId=" + blogId +
                ", content='" + content + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCommenter(User user) {

    }

    public void setBlog(Blog blog) {

    }
}
