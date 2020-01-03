package club.banyuan.myblog.module;

import java.io.Serializable;

public class Comment implements Serializable {
    private Integer id;
    private String createdTime;
    private Integer userId;
    private Integer blogId;
    private String content;

    public Comment() {
    }

    public Comment(String createdTime, Integer authorId, Integer blogId, String content) {
        this.createdTime = createdTime;
        this.userId = authorId;
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

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getAuthorId() {
        return userId;
    }

    public void setAuthorId(Integer authorId) {
        this.userId = authorId;
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
}
