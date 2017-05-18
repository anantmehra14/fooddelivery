package com.example.anantmehra.eatfirst2;

public class product {
    String m_name;
    double m_value;

    product(String name, double value) {
        m_name = name;
        m_value = value;
    }

    String getName() {
        return m_name;
    }

    double getValue() {
        return m_value;
    }


    public class product1 {
        String m_name;
        double m_value;

        product1(String name, double value) {
            m_name = name;
            m_value = value;
        }

        String getName() {
            return m_name;
        }

        double getValue() {
            return m_value;
        }
    }
}

