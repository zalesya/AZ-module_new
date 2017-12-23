package by.nc.school.dev.beans.additionalClasses;

public class Curriculum {
    private String topicName;
    private int topicHours;

    public Curriculum() {
    }

    public Curriculum(String topicName, int topicHours) {
        this.topicName = topicName;
        this.topicHours = topicHours;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public int getTopicHours() {
        return topicHours;
    }

    public void setTopicHours(int topicHours) {
        this.topicHours = topicHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Curriculum that = (Curriculum) o;

        if (getTopicHours() != that.getTopicHours()) return false;
        return getTopicName().equals(that.getTopicName());
    }

    @Override
    public int hashCode() {
        int result = getTopicName().hashCode();
        result = 31 * result + getTopicHours();
        return result;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "topicName='" + topicName + '\'' +
                ", topicHours=" + topicHours +
                '}';
    }
}
