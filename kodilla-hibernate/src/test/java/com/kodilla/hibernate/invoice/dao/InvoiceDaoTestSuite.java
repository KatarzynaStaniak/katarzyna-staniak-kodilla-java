package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    private static final BigDecimal APPLE_PRICE = BigDecimal.valueOf(8.25);

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product apples = new Product("apples");
        Invoice invoice = new Invoice("A287");
        Item item1 = new Item(APPLE_PRICE, 3);
        item1.setProduct(apples);
        item1.setInvoice(invoice);
        apples.getItems().add(item1);
        invoice.getItems().add(item1);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.deleteById(id);
    }
}
