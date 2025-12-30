// package com.ecommerce.ecommerce.entities;

// import lombok.AllArgsConstructor;
// import lombok.Getter;

// @Getter
// @AllArgsConstructor
// public class Message {
//     private String text;
// }





package com.ecommerce.ecommerce.entities;

public class Message {

    private String text;

    // ✅ ADD THIS CONSTRUCTOR
    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    
}
