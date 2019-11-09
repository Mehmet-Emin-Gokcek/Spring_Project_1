package com.assignment;

public class Grade {
   String subject;
   String letterGrade;

   public String getSubject() {
      return subject;
   }

   public void setSubject(String subject) {
      this.subject = subject;
   }

   public String getLetterGrade() {
      return letterGrade;
   }

   public void setLetterGrade(String letterGrade) {
      this.letterGrade = letterGrade;
   }

   @Override
   public String toString() {
      return "[Subject: " + subject + "], [Letter Grade: " + letterGrade + "]";
   }
}
