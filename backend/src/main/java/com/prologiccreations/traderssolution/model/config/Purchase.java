package com.prologiccreations.traderssolution.model.config;

import com.prologiccreations.traderssolution.model.super_classes.AuditableEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class Purchase extends AuditableEntity {
    @ManyToOne
    private Product product;
    private double costPrice;
    private double vat;
    private double discount;
    private int quantity;
    private double weight;
    private double total;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    private Supplier supplier;
    private LocalDate purchaseDate;
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Attachment> attachments;
}
