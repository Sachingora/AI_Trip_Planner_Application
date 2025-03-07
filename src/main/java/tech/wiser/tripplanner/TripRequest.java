package tech.wiser.tripplanner;

import java.util.List;

public class TripRequest {

    private String Source;
    private String destination;
    private String startDate;
    private String endDate;
    private String budgetOptions;
    private List<String> interests;
//    private String tripType;
//    private String tripPurpose;
//    private String tripDuration;
//    private String tripActivities;
//    private String tripAccommodation;
//    private String tripTransportation;
//    private String tripFood;
//    private String tripShopping;
//    private String tripEntertainment;
//    private String tripHealth;
//    private String tripSafety;
//    private String tripWeather;
//    private String tripLanguage;
//    private String tripCurrency;
//    private String tripVisa;
//    private String tripInsurance;
//    private String tripEmergency;
//    private String tripContact;
//    private String tripNotes;
//    private String tripStatus;
//    private String tripRating;
//    private String tripReview;
//    private String tripFeedback;
//    private String tripRecommendation;
//    private String tripSuggestion;
//    private String tripImprovement;
//    private String tripConclusion;
//    private String tripSummary;
//    private String tripPlan;
//    private String tripItinerary;
//    private String tripSchedule;
//    private String tripCalendar;
//    private String tripReminder;
//    private String tripNotification;
//    private String tripAlert;
//    private String tripWarning;
//    private String tripError;
//    private String tripException;
//    private String tripMessage;
//    private String tripResponse;
//    private String tripRequest;
//    private String tripCommand;
//    private String tripAction;
//    private String tripActivity;
//    private String tripEvent;
//    private String tripTask;
//    private String tripJob;
//    private String tripWork;
//    private String tripCareer;
//    private String tripEducation;
//    private String tripSchool;
//    private String tripCollege;
//    private String tripUniversity;
//    private String tripDegree;
//    private String tripCourse;
//    private String tripSubject;
//    private String tripTopic;
//    private String tripChapter;
//    private String tripLesson;
//    private String tripTutorial;
//    private String tripGuide;
//    private String tripManual;
//    private String tripBook;
//    private String tripDocument;
//    private String tripFile;
//    private String tripFolder;
//    private String tripDirectory;
//    private String tripPath;
//    private String tripRoute;
//    private String tripMap;
//    private String tripLocation;
//    private String tripPlace;
//    private String tripArea;
//    private String tripCity;
//    private String tripTown;
//    private String tripVillage;
//    private String tripCountry;

    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getBudgetOptions() {
        return budgetOptions;
    }

    public void setBudgetOptions(String budgetOptions) {
        this.budgetOptions = budgetOptions;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "TripRequest{" + "Source=" + Source + ", destination=" + destination + ", startDate=" + startDate + ", endDate=" + endDate + ", budgetOptions=" + budgetOptions + ", interests=" + interests + '}';
    }
}
