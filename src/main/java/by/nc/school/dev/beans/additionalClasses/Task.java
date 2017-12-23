package by.nc.school.dev.beans.additionalClasses;

import by.nc.school.dev.beans.enums.TaskType;

import java.util.Date;

/**
 * @author Admin
 * @version 1.0
 */
public class Task {
    private Date deadline;
    private String topicControlTask;
    private TaskType typeControlTask;

    public Task() {
    }

    public Task(Date deadline, String topicControlTask, TaskType typeControlTask) {
        this.deadline = deadline;
        this.topicControlTask = topicControlTask;
        this.typeControlTask = typeControlTask;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getTopicControlTask() {
        return topicControlTask;
    }

    public void setTopicControlTask(String topicControlTask) {
        this.topicControlTask = topicControlTask;
    }

    public TaskType getTypeControlTask() {
        return typeControlTask;
    }

    public void setTypeControlTask(TaskType typeControlTask) {
        this.typeControlTask = typeControlTask;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (!getDeadline().equals(task.getDeadline())) return false;
        if (!getTopicControlTask().equals(task.getTopicControlTask())) return false;
        return getTypeControlTask() == task.getTypeControlTask();
    }

    @Override
    public int hashCode() {
        int result = getDeadline().hashCode();
        result = 31 * result + getTopicControlTask().hashCode();
        result = 31 * result + (getTypeControlTask() != null ? getTypeControlTask().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "deadline=" + deadline +
                ", topicControlTask='" + topicControlTask + '\'' +
                ", typeControlTask=" + typeControlTask +
                '}';
    }
}