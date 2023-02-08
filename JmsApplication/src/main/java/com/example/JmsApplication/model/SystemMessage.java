package com.example.JmsApplication.model;

import java.io.Serializable;

public class SystemMessage implements Serializable {
    public String source;
    public String message;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SystemMessage{" +
                "source='" + source + '\'' +
                "message='" + message + '\'' +
    '}';
    }
}
