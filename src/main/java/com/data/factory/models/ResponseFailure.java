package com.data.factory.models;

import lombok.*;
import org.json.JSONObject;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseFailure {
    //TODO
    private String error;
    private String classDescription;
    private String description;

    @Override
    public String toString(){
        JSONObject json = new JSONObject();
        json.put("error", this.error);
        json.put("classDescription", this.classDescription);
        json.put("description", this.description);
        return json.toString(4);
    }
}
