package javaBeans;

import javaBeans.Authors;

import java.io.Serializable;
import java.util.ArrayList;

public class Quotes implements Serializable {

    private Authors authors;
    private String content;

    public Quotes() {}

    public Quotes(Authors authors, String content) {
        this.authors = authors;
        this.content = content;
    }

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
