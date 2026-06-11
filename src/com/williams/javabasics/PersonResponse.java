package com.williams.javabasics;

public class PersonResponse {

    private String name;
    private int age;
    private String type;
    private String detail;

    // Constructor privado — solo el Builder puede crear instancias
    private PersonResponse() {}

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getType() { return type; }
    public String getDetail() { return detail; }

    @Override
    public String toString() {
        return "PersonResponse {" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", detail='" + detail + '\'' +
                " }";
    }

    // Builder como clase interna estática
    public static class Builder {

        private String name;
        private int age;
        private String type;
        private String detail;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public PersonResponse build() {
            PersonResponse response = new PersonResponse();
            response.name = this.name;
            response.age = this.age;
            response.type = this.type;
            response.detail = this.detail;
            return response;
        }
    }
}