package io.destreza.erp_dashboard.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserInfor {
    @SerializedName("success")
    @Expose
    private Integer success;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public static class Datum {

        @SerializedName("idUsers")
        @Expose
        private String idUsers;
        @SerializedName("dob")
        @Expose
        private String dob;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("joined")
        @Expose
        private String joined;
        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;
        @SerializedName("fullName")
        @Expose
        private String fullName;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("maritalStatus")
        @Expose
        private String maritalStatus;
        @SerializedName("nationalId")
        @Expose
        private String nationalId;
        @SerializedName("phoneNumber")
        @Expose
        private String phoneNumber;
        @SerializedName("userImage")
        @Expose
        private Object userImage;
        @SerializedName("countryName")
        @Expose
        private String countryName;
        @SerializedName("countryCde")
        @Expose
        private String countryCde;
        @SerializedName("currency")
        @Expose
        private String currency;

        public String getIdUsers() {
            return idUsers;
        }

        public void setIdUsers(String idUsers) {
            this.idUsers = idUsers;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getJoined() {
            return joined;
        }

        public void setJoined(String joined) {
            this.joined = joined;
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

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getMaritalStatus() {
            return maritalStatus;
        }

        public void setMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
        }

        public String getNationalId() {
            return nationalId;
        }

        public void setNationalId(String nationalId) {
            this.nationalId = nationalId;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Object getUserImage() {
            return userImage;
        }

        public void setUserImage(Object userImage) {
            this.userImage = userImage;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getCountryCde() {
            return countryCde;
        }

        public void setCountryCde(String countryCde) {
            this.countryCde = countryCde;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

    }
}
