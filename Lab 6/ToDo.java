public class ToDo {
    private int count = 0;
    private int itemNumber = 0;
    private int hours = 0;
    private int minutes = 0;
    private boolean completed;
    private String title;

    public void printItem(){
        String completed_words;
        String hours_special;
        String minutes_special;
        if (completed == true){
            completed_words = "Completed";
        }
        else{
            completed_words = "Not Completed";
        }

        if (hours < 10 && hours >= 0){
            hours_special = "0" + hours;
        }
        else {hours_special = Integer.toString(hours);}
        if (minutes < 10 && minutes >= 0){
            minutes_special = "0" + minutes;
        }
        else {minutes_special = Integer.toString(minutes);}
        if (completed == true){
            System.out.println("Item " + itemNumber + " : " + title + " | " + completed_words + " at " + hours_special + ":" + minutes_special);
        }
        else {
            System.out.println("Item " + itemNumber + " : " + title + " | " + completed_words);

        }
    }

    public void convertTime(String timeEnded){
        String hours_string = timeEnded.substring(0,2);
        String minutes_string = timeEnded.substring(3,5);
        int hours_num = Integer.parseInt(hours_string);
        int minutes_num = Integer.parseInt(minutes_string);
        if (timeEnded.length() == 5 && (hours_num <= 23 && hours_num >= 0) && (minutes_num <= 59 && minutes_num >= 0)){
                hours = hours_num;
        }
        else {
            hours= -1;
        }
        if (timeEnded.length() == 5 && (minutes_num <= 59 && minutes_num >= 0)){
            minutes = minutes_num;
        }
        else{
            minutes = -1;
        }
        if (hours != -1 && minutes != -1){
            completed = true;
        }
        else{
            completed = false;
        }
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public int getHours(){
        return hours;
    }

    public String getTitle(){
        return title;
    }

    public boolean getCompleted(){
        return completed;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }

    public boolean isCompleted() {
        if(completed == true){
            return true;
        }
        else{
            return false;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ToDo(String title, boolean completed){
        this.title = title;
        this.completed = completed;
        count += 1;
        itemNumber = count;
    }

    public ToDo() {
        title = "No Item";
        completed = false;
    }
}
