package org.brms.myproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AmInt implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer age;
   private java.lang.Integer dwellingCoverage;
   private java.lang.Integer otherStructureLimit;
   private java.lang.Integer acres;

   public AmInt()
   {
   }

   public java.lang.Integer getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.Integer age)
   {
      this.age = age;
   }

   public java.lang.Integer getDwellingCoverage()
   {
      return this.dwellingCoverage;
   }

   public void setDwellingCoverage(java.lang.Integer dwellingCoverage)
   {
      this.dwellingCoverage = dwellingCoverage;
   }

   public java.lang.Integer getOtherStructureLimit()
   {
      return this.otherStructureLimit;
   }

   public void setOtherStructureLimit(java.lang.Integer otherStructureLimit)
   {
      this.otherStructureLimit = otherStructureLimit;
   }

   public java.lang.Integer getAcres()
   {
      return this.acres;
   }

   public void setAcres(java.lang.Integer acres)
   {
      this.acres = acres;
   }

   public AmInt(java.lang.Integer age, java.lang.Integer dwellingCoverage,
         java.lang.Integer otherStructureLimit, java.lang.Integer acres)
   {
      this.age = age;
      this.dwellingCoverage = dwellingCoverage;
      this.otherStructureLimit = otherStructureLimit;
      this.acres = acres;
   }

}