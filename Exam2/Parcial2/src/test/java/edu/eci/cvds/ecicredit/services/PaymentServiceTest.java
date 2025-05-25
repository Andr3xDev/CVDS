package edu.eci.cvds.ecicredit.services;

import edu.eci.cvds.ecicredit.model.Payment;
import edu.eci.cvds.ecicredit.repository.PaymentRepository;
import edu.eci.cvds.ecicredit.service.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class PaymentServiceTest {

    @Mock
    private PaymentRepository paymentRepository;

    @InjectMocks
    private PaymentService paymentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldCreatePayment() {
        Payment payment = new Payment();
        payment.setId("1");

        when(paymentRepository.save(payment)).thenReturn(payment);

        Payment newPayment = paymentService.createPayment(payment);

        assertNotNull(newPayment);
        assertEquals("1", newPayment.getId());
    }

    @Test
    void shouldGetPaymentById() {
        Payment payment = new Payment();
        payment.setId("1");

        when(paymentRepository.findById("1")).thenReturn(Optional.of(payment));
        Optional<Payment> newPayment = paymentService.getPaymentById("1");

        assertNotNull(newPayment);
    }

    @Test
    void shouldNotGetPaymentById() {
        when(paymentRepository.findById("2")).thenReturn(null);
        Optional<Payment> newPayment = paymentService.getPaymentById("2");

        assertNull(newPayment);
    }
}