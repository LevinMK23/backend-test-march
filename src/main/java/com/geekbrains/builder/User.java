package com.geekbrains.builder;

public class User {

    private final long id;
    private final int age;
    private final String name;
    private final String surname;
    private final String phone;
    private final String email;
    private final String homeAddress;

    private User(Builder builder) {
        id = builder.id;
        age = builder.age;
        name = builder.name;
        surname = builder.surname;
        phone = builder.phone;
        email = builder.email;
        homeAddress = builder.homeAddress;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private long id;
        private int age;
        private String name;
        private String surname;
        private String phone;
        private String email;
        private String homeAddress;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setHomeAddress(String homeAddress) {
            this.homeAddress = homeAddress;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
