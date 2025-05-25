package edu.eci.cvds.ecicredit.service;

import edu.eci.cvds.ecicredit.model.Payment;
import edu.eci.cvds.ecicredit.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Optional<Payment> getPaymentById(String id) {
        return paymentRepository.findById(id);
    }

}