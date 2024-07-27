package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        List<Car> cars = session.createQuery("select c from Car as c").getResultList();
        cars.forEach(System.out::println);

        System.out.println("************************");

        List<Students> students = session.createQuery("select s from Students as s").getResultList();
        students.forEach(System.out::println);

        System.out.println("************************");

        List<Instructors> instructors = session.createQuery("select i from Instructors as i").getResultList();
        instructors.forEach(System.out::println);

        session.close();
    }
}