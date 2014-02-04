/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
@Document
public class Person implements Serializable, Comparable<Person> {

    @Id
    private String id;
    private String firstname;
    private String middlename;
    private String lastname;
    private String maritalStatus;
    private Date dateOfBirth;
    private String gender;
    @DBRef
    private Contact address;
    private boolean nationality;
    private String otherNationality;
    private boolean citizenship;
    private String otherCitizenship;
    private String religion;
    private String dinomination;
    @DBRef
    private EmergencyContact emergencyContact;
    @DBRef
    private DrugUse drugUse;
    @DBRef
    private LanguageProficiency languageProficiency;
    @DBRef
    private Set<PreviousEducation> previousEducation;
    @DBRef
    private ProposedStudy proposedStudy;
    @DBRef
    private AcademicResult academicResults;
    @DBRef
    private EmploymentHistory employmentHistory;
    private boolean staffMember;
    @DBRef
    private AccomodationRequired accomodationRequired;
    private String attendenceReason;
    private String remarks;
    @DBRef
    private Set<Spouse> spouses;
    @DBRef
    private Set<Disability> disabilities;
    @DBRef
    private Set<Referee> referees;
    @DBRef
    private Set<Statistic> statistics;
    private boolean agreedToConditions;
    private boolean swonTofInformation;
    private Date dateOfApplication;

    private Person() {
    }

    private Person(Builder builder) {
        this.id = builder.id;
        this.firstname = builder.id;
        this.middlename = builder.middlename;
        this.lastname = builder.lastname;
        this.maritalStatus = builder.maritalStatus;
        this.dateOfBirth = builder.dateOfBirth;
        this.gender = builder.gender;
        this.address = builder.address;
        this.nationality = builder.nationality;
        this.otherNationality = builder.otherNationality;
        this.citizenship = builder.citizenship;
        this.otherCitizenship = builder.otherCitizenship;
        this.religion = builder.religion;
        this.dinomination = builder.dinomination;
        this.emergencyContact = builder.emergencyContact;
        this.drugUse = builder.drugUse;
        this.languageProficiency = builder.languageProficiency;
        this.previousEducation = builder.previousEducation;
        this.proposedStudy = builder.proposedStudy;
        this.academicResults = builder.academicResults;
        this.employmentHistory = builder.employmentHistory;
        this.staffMember = builder.staffMember;
        this.accomodationRequired = builder.accomodationRequired;
        this.attendenceReason = builder.attendenceReason;
        this.remarks = builder.remarks;
        this.spouses = builder.spouses;
        this.disabilities = builder.disabilities;
        this.referees = builder.referees;
        this.statistics = builder.statistics;
        this.agreedToConditions = builder.agreedToConditions;
        this.swonTofInformation = builder.swonTofInformation;
        this.dateOfApplication = builder.dateOfApplication;
    }

    @Override
    public int compareTo(Person o) {
        return firstname.compareToIgnoreCase(o.firstname);
    }

    public static class Builder {

        private String id;
        private final String firstname;
        private String middlename;
        private String lastname;
        private String maritalStatus;
        private Date dateOfBirth;
        private String gender;
        private Contact address;
        private boolean nationality;
        private String otherNationality;
        private boolean citizenship;
        private String otherCitizenship;
        private String religion;
        private String dinomination;
        private EmergencyContact emergencyContact;
        private DrugUse drugUse;
        private LanguageProficiency languageProficiency;
        private Set<PreviousEducation> previousEducation;
        private ProposedStudy proposedStudy;
        private AcademicResult academicResults;
        private EmploymentHistory employmentHistory;
        private boolean staffMember;
        private AccomodationRequired accomodationRequired;
        private String attendenceReason;
        private String remarks;
        private Set<Spouse> spouses;
        private Set<Disability> disabilities;
        private Set<Referee> referees;
        private Set<Statistic> statistics;
        private boolean agreedToConditions;
        private boolean swonTofInformation;
        private Date dateOfApplication;

        public Builder(String value) {
            this.firstname = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder middlename(String value) {
            this.middlename = value;
            return this;
        }

        public Builder lastname(String value) {
            this.lastname = value;
            return this;
        }

        public Builder maritalStatus(String value) {
            this.maritalStatus = value;
            return this;
        }

        public Builder dateOfBirth(Date value) {
            this.dateOfBirth = value;
            return this;
        }

        public Builder gender(String value) {
            this.gender = value;
            return this;
        }

        public Builder address(Contact value) {
            this.address = value;
            return this;
        }

        public Builder nationality(boolean value) {
            this.nationality = value;
            return this;
        }

        public Builder otherNationality(String value) {
            this.otherNationality = value;
            return this;
        }

        public Builder citizenship(boolean value) {
            this.citizenship = value;
            return this;
        }

        public Builder otherCitizenship(String value) {
            this.otherCitizenship = value;
            return this;
        }

        public Builder religion(String value) {
            this.religion = value;
            return this;
        }

        public Builder dinomination(String value) {
            this.dinomination = value;
            return this;
        }

        public Builder emergencyContact(EmergencyContact value) {
            this.emergencyContact = value;
            return this;
        }

        public Builder drugUse(DrugUse value) {
            this.drugUse = value;
            return this;
        }

        public Builder languageProficiency(LanguageProficiency value) {
            this.languageProficiency = value;
            return this;
        }

        public Builder previousEducation(Set<PreviousEducation> value) {
            this.previousEducation = value;
            return this;
        }

        public Builder proposedStudy(ProposedStudy value) {
            this.proposedStudy = value;
            return this;
        }

        public Builder academicResults(AcademicResult value) {
            this.academicResults = value;
            return this;
        }

        public Builder employmentHistory(EmploymentHistory value) {
            this.employmentHistory = value;
            return this;
        }

        public Builder staffMember(boolean value) {
            this.staffMember = value;
            return this;
        }

        public Builder accomodationRequired(AccomodationRequired value) {
            this.accomodationRequired = value;
            return this;
        }

        public Builder attendenceReason(String value) {
            this.attendenceReason = value;
            return this;
        }

        public Builder remarks(String value) {
            this.remarks = value;
            return this;
        }

        public Builder spouses(Set<Spouse> value) {
            this.spouses = value;
            return this;
        }

        public Builder disabilities(Set<Disability> value) {
            this.disabilities = value;
            return this;
        }

        public Builder referees(Set<Referee> value) {
            this.referees = value;
            return this;
        }

        public Builder statistics(Set<Statistic> value) {
            this.statistics = value;
            return this;
        }

        public Builder agreedToConditions(boolean value) {
            this.agreedToConditions = value;
            return this;
        }

        public Builder swonTofInformation(boolean value) {
            this.swonTofInformation = value;
            return this;
        }

        public Builder dateOfApplication(Date value) {
            this.dateOfApplication = value;
            return this;
        }

        public Builder person(Person person) {
            this.id = person.getId();
            this.middlename = person.getMiddlename();
            this.lastname = person.getLastname();
            this.maritalStatus = person.getMaritalStatus();
            this.dateOfBirth = person.getDateOfBirth();
            this.gender = person.getGender();
            this.address = person.getAddress();
            this.nationality = person.isNationality();
            this.otherNationality = person.getOtherNationality();
            this.citizenship = person.isCitizenship();
            this.otherCitizenship = person.getOtherCitizenship();
            this.religion = person.getReligion();
            this.dinomination = person.getDinomination();
            this.emergencyContact = person.getEmergencyContact();
            this.drugUse = person.getDrugUse();
            this.languageProficiency = person.getLanguageProficiency();
            this.previousEducation = person.getPreviousEducation();
            this.proposedStudy = person.getProposedStudy();
            this.academicResults = person.getAcademicResults();
            this.employmentHistory = person.getEmploymentHistory();
            this.staffMember = person.isStaffMember();
            this.accomodationRequired = person.getAccomodationRequired();
            this.attendenceReason = person.getAttendenceReason();
            this.remarks = person.getRemarks();
            this.spouses = person.getSpouses();
            this.disabilities = person.getDisabilities();
            this.referees = person.getReferees();
            this.statistics = person.getStatistics();
            this.agreedToConditions = person.isAgreedToConditions();
            this.swonTofInformation = person.isSwonTofInformation();
            this.dateOfApplication = person.getDateOfApplication();


            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public Contact getAddress() {
        return address;
    }

    public boolean isNationality() {
        return nationality;
    }

    public String getOtherNationality() {
        return otherNationality;
    }

    public boolean isCitizenship() {
        return citizenship;
    }

    public String getOtherCitizenship() {
        return otherCitizenship;
    }

    public String getReligion() {
        return religion;
    }

    public String getDinomination() {
        return dinomination;
    }

    public EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    public DrugUse getDrugUse() {
        return drugUse;
    }

    public LanguageProficiency getLanguageProficiency() {
        return languageProficiency;
    }

    public Set<PreviousEducation> getPreviousEducation() {
        return previousEducation;
    }

    public ProposedStudy getProposedStudy() {
        return proposedStudy;
    }

    public AcademicResult getAcademicResults() {
        return academicResults;
    }

    public EmploymentHistory getEmploymentHistory() {
        return employmentHistory;
    }

    public boolean isStaffMember() {
        return staffMember;
    }

    public AccomodationRequired getAccomodationRequired() {
        return accomodationRequired;
    }

    public String getAttendenceReason() {
        return attendenceReason;
    }

    public String getRemarks() {
        return remarks;
    }

    public Set<Spouse> getSpouses() {
        return spouses;
    }

    public Set<Disability> getDisabilities() {
        return disabilities;
    }

    public Set<Referee> getReferees() {
        return referees;
    }

    public Set<Statistic> getStatistics() {
        return statistics;
    }

    public boolean isAgreedToConditions() {
        return agreedToConditions;
    }

    public boolean isSwonTofInformation() {
        return swonTofInformation;
    }

    public Date getDateOfApplication() {
        return dateOfApplication;
    }
}
