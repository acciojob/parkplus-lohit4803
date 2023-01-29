package com.driver.model;

//import com.sun.tools.javac.jvm.Gen;

import javax.persistence.*;

@Entity
@Table

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private boolean paymentCompleted;
    private PaymentMode paymentMode;

    @OneToOne
    @JoinColumn
    private Reservation reservation;

    public Payment(boolean paymentCompleted, PaymentMode paymentMode) {
        this.paymentCompleted = paymentCompleted;
        this.paymentMode = paymentMode;
    }

    public Payment(int paymentId, boolean paymentCompleted, PaymentMode paymentMode) {
        this.Id = paymentId;
        this.paymentCompleted = paymentCompleted;
        this.paymentMode = paymentMode;
    }

    public int getId() {
        return Id;
    }

    public Payment() {
    }

    public void setId(int paymentId) {
        this.Id = paymentId;
    }

    public boolean isPaymentCompleted() {
        return paymentCompleted;
    }

    public void setPaymentCompleted(boolean paymentCompleted) {
        this.paymentCompleted = paymentCompleted;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
