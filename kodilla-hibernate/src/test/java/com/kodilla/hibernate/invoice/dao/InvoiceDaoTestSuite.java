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
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    private static final BigDecimal APPLE_PRICE = BigDecimal.valueOf(8.25);
    private static final BigDecimal ONION_PRICE = BigDecimal.valueOf(2.51);

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product apples = new Product("apples");
        Product onions = new Product("onions");
        Invoice invoice = new Invoice("A287");
        Item item1 = new Item(APPLE_PRICE, 3);
        Item item2 = new Item(ONION_PRICE, 10);
        Item item3 = new Item(APPLE_PRICE, 6);
        Item item4 = new Item(ONION_PRICE, 4);

        apples.getItems().add(item1);
        apples.getItems().add(item3);
        onions.getItems().add(item2);
        onions.getItems().add(item4);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        item1.setProduct(apples);
        item1.setInvoice(invoice);
        item3.setProduct(apples);
        item3.setInvoice(invoice);
        item2.setProduct(onions);
        item2.setInvoice(invoice);
        item4.setProduct(onions);
        item4.setInvoice(invoice);


        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        productDao.save(apples);
        int productAppleId = apples.getId();
        productDao.save(onions);
        int productOnionsId = onions.getId();
        itemDao.save(item1);
        int item1Id = item1.getId();
        itemDao.save(item2);
        int item2Id = item2.getId();
        itemDao.save(item3);
        int item3Id = item3.getId();
        itemDao.save(item4);
        int item4Id = item4.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertNotEquals(0, productAppleId);
        Assert.assertNotEquals(0, productOnionsId);
        Assert.assertNotEquals(0, item1Id);
        Assert.assertNotEquals(0, item2Id);
        Assert.assertNotEquals(0, item3Id);
        Assert.assertNotEquals(0, item4Id);

        //CleanUp
//        try {
//        itemDao.deleteById(item1Id);
//        itemDao.deleteById(item2Id);
//        itemDao.deleteById(item3Id);
//        itemDao.deleteById(item4Id);
//        invoiceDao.deleteById(invoiceId);
//        productDao.deleteById(productAppleId);
//        productDao.deleteById(productOnionsId);
//        } catch (Exception e){
//            System.out.println("ERRORS!");
//        }
    }
}
