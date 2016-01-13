package com.lijz.pattern.builder;

/**
 * Created by jianzhongli on 16/1/13.
 */
public class Contact {

    private String firstName;

    private String secondName;

    private String phone;

    private String organization;

    private String address;

    private String zcode;


    public static class Builder {

        private String firstName;

        private String secondName;

        private String phone;

        private String organization;

        private String address;

        private String zcode;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder organization(String organization) {
            this.organization = organization;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder zcode(String zcode) {
            this.zcode = zcode;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }

    private Contact(Builder builder) {
        this.address = builder.address;
        this.firstName = builder.firstName;
        this.organization = builder.organization;
        this.phone = builder.phone;
        this.secondName = builder.secondName;
        this.zcode = builder.zcode;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phone='" + phone + '\'' +
                ", organization='" + organization + '\'' +
                ", address='" + address + '\'' +
                ", zcode='" + zcode + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Contact contact = new Builder().address("北京市朝阳区望京东路").organization("美团网").firstName("李").
                secondName("建忠").phone("12345678").zcode("100080").build();

        System.out.println(contact);
    }
}
