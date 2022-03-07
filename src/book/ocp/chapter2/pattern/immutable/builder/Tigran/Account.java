package book.ocp.chapter2.pattern.immutable.builder.Tigran;

import java.time.LocalDate;

public class Account {
    private String firstName;
    private String lastName;
    private int age;
    private final LocalDate cratedDate;
    private Gender gender;
    private Address address;

    public Account(LocalDate cratedDate) {
        this.cratedDate = cratedDate;
    }

    public Account(LocalDate localDate, AccountBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.cratedDate = localDate;
        this.gender = builder.gender;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getCratedDate() {
        return cratedDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "firstName = " + firstName +
                ", lastName = " + lastName +
                ", age = " + age +
                ", cratedDate = " + cratedDate +
                ", gender = " + gender +
                ", address = " + address;
    }

    public static class AccountBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private final LocalDate cratedDate;
        private Gender gender;
        private Address address;

        public AccountBuilder(LocalDate cratedDate) {
            this.cratedDate = cratedDate;
        }

        public AccountBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public AccountBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public AccountBuilder age(int age) {
            this.age = age;
            return this;
        }

        public AccountBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public AccountBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public Account build() {
            return new Account(LocalDate.now(), this);
        }
    }


    public enum Gender {
        MALE, FEMALE
    }


    public static class Address {
        private String country;
        private String region;
        private String city;
        private String street;
        private int postalCode;


        public Address(AddressBuilder addressBuilder) {
            this.country = addressBuilder.country;
            this.region = addressBuilder.region;
            this.city = addressBuilder.city;
            this.street = addressBuilder.street;
            this.postalCode = addressBuilder.postalCode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(int postalCode) {
            this.postalCode = postalCode;
        }

        @Override
        public String toString() {
            return "country = " + country +
                    ", region = " + region +
                    ", city = " + city +
                    ", street = " + street +
                    ", postalCode = " + postalCode;
        }

        public static class AddressBuilder {
            private final String country;
            private String region;
            private final String city;
            private final String street;
            private int postalCode;

            public AddressBuilder(String country, String city, String street) {
                this.country = country;
                this.city = city;
                this.street = street;
            }

            public AddressBuilder region(String region) {
                this.region = region;
                return this;
            }

            public AddressBuilder postalCode(int postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            public Address build() {
                return new Address(this);
            }

        }
    }
}
