package com.LilGonzz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("hr-worker")
public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String name;
    private Double incomeInvoice;

    @Override
    public String toString(){
        return "id: " + id + "\nname: " +name+"\ninvoice: "+ incomeInvoice+"\n";
    }
}
