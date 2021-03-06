package bitcamp.java106.pms.domain;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Board_bak implements Serializable {
    private static final long serialVersionUID = 1L;

    private int no;
    private String title;
    private String content;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createdDate;
    
    // κ°λ°?? ?? κ°μ²΄? ?΄?©? ??Έ?κΈ? ??΄? toString()? ?€λ²λΌ?΄?© ??€.
    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", createdDate=" + createdDate + "]";
    }
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    
}

//ver 31 - ??±? ? κ±? λ°? count λ³?? ? κ±?
//ver 27 - java.io.Serializable ?Έ?°??΄?€ κ΅¬ν
//ver 24 - setNo() λ³?κ²?
//ver 18 - κ²μλ¬? κ°μ²΄? κ³ μ  λ²νΈ(no)λ₯? static λ³??(count)λ₯? ?΄?©??¬ ?? ?€? ??€. 
// ver 16 - μΊ‘μ? ? ?©. κ²ν°, ??° μΆκ?.
// ver 13 - ?±λ‘μΌ? ?°?΄?° ???? String?? Date?Όλ‘? λ³?κ²?






