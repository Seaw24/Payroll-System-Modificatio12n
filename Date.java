
public  class  Date{
public  int month;
public  int date; 
private int year;
public Date (int month, int date,int year){
if ( (month > 12) || (month < 1) ){
    throw new IllegalArgumentException(
        "invalid month. Enter the month again.");
}
if ( (date > 31) || (date < 1)){
    throw new IllegalArgumentException(
        "invalid date. Enter the month date.");
}
this.month = month; 
this.date = date;
this.year = year;
} 
public int getMonth() {return month;}

   
   public void setMonth(int month) {
      if ((month < 1 ) || ( month > 12)) { 
         throw new IllegalArgumentException(
            "month must be > 1 and < 12");
      }

      this.month = month;
   } 


   public int getDate() {return date;}

   // set hours worked
   public void setDate(int date) {
      if ((date < 1 ) || (date > 31)) { // validate hours
         throw new IllegalArgumentException(
            "date must be > 1 and < 31");
      }

      this.date = date;
   } 
   public int getYear() {return year ;}
public String toString(){
    return String.format("%s : %d/%d/%d",     
    "birth day", getMonth(),getDate(),getYear());              
} 
}
