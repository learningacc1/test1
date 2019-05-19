package nauka;

import java.util.Date;

public class BuilderImplementation {

    private String firstName;
    private String secondName;
    private int age;
    private Date dateOfBirth;
    private String adress;

    public BuilderImplementation(Builder builder) {
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.age = builder.age;
        this.dateOfBirth = builder.dateOfBirth;
        this.adress = builder.adress;
    }

    public static class Builder {

        //required
        private String firstName;
        private String secondName;

        //optional
        private int age;
        private Date dateOfBirth;
        private String adress;

        public Builder(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public Builder Age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder DateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder Adress(String adress) {
            this.adress = adress;
            return this;
        }

        public BuilderImplementation build(){
            return new BuilderImplementation(this);
        }
    }

}
