package com.prologiccreations.traderssolution.model.config;

import com.prologiccreations.traderssolution.model.super_classes.AuditableEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Order extends AuditableEntity {
    private LocalDate OrderDate;
    private String Customer;
    private String Employee;
    private String PaymentMethod;
    private String PaymentDate;
    private String ShippingAddress;
    private String BillingAddress;
    private String OrderStatus;
    private String TotalAmount;
    private String TaxAmount;
    private String DiscountAmount;
    private String ShippingFee;
    private String InvoiceReceiptNumber;
    private String NotesComments;
    private String DeliveryDate;
    private String ReturnExchangeRequest;
    private String ReturnExchangeDate;
}
