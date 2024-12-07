package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        // Create Device Object
        Device device = new Device();
        device.setBrand("Generic Brand");
        device.setModel("Model A");
        device.setPrice(150.00);
        session.save(device);

        // Create Smartphone Object
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Apple");
        smartphone.setModel("iPhone 14");
        smartphone.setPrice(999.00);
        smartphone.setOperatingSystem("iOS");
        smartphone.setCameraResolution(12.0);
        session.save(smartphone);

        // Create Tablet Object
        Tablet tablet = new Tablet();
        tablet.setBrand("Samsung");
        tablet.setModel("Galaxy Tab S7");
        tablet.setPrice(650.00);
        tablet.setScreenSize(11.0);
        tablet.setBatteryLife(14.0);
        session.save(tablet);

        // Commit Transaction
        tx.commit();

        // Close the session
        session.close();
        sessionFactory.close();
    }
}
