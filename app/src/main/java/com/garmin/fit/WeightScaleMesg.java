////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Garmin Canada Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2021 Garmin Canada Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 21.47Release
// Tag = production/akw/21.47.00-0-geec27411
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;
import java.math.BigInteger;


public class WeightScaleMesg extends Mesg {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int WeightFieldNum = 0;
    
    public static final int PercentFatFieldNum = 1;
    
    public static final int PercentHydrationFieldNum = 2;
    
    public static final int VisceralFatMassFieldNum = 3;
    
    public static final int BoneMassFieldNum = 4;
    
    public static final int MuscleMassFieldNum = 5;
    
    public static final int BasalMetFieldNum = 7;
    
    public static final int PhysiqueRatingFieldNum = 8;
    
    public static final int ActiveMetFieldNum = 9;
    
    public static final int MetabolicAgeFieldNum = 10;
    
    public static final int VisceralFatRatingFieldNum = 11;
    
    public static final int UserProfileIndexFieldNum = 12;
    

    protected static final  Mesg weightScaleMesg;
    static {
        // weight_scale
        weightScaleMesg = new Mesg("weight_scale", MesgNum.WEIGHT_SCALE);
        weightScaleMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "s", false, Profile.Type.DATE_TIME));
        
        weightScaleMesg.addField(new Field("weight", WeightFieldNum, 132, 100, 0, "kg", false, Profile.Type.WEIGHT));
        
        weightScaleMesg.addField(new Field("percent_fat", PercentFatFieldNum, 132, 100, 0, "%", false, Profile.Type.UINT16));
        
        weightScaleMesg.addField(new Field("percent_hydration", PercentHydrationFieldNum, 132, 100, 0, "%", false, Profile.Type.UINT16));
        
        weightScaleMesg.addField(new Field("visceral_fat_mass", VisceralFatMassFieldNum, 132, 100, 0, "kg", false, Profile.Type.UINT16));
        
        weightScaleMesg.addField(new Field("bone_mass", BoneMassFieldNum, 132, 100, 0, "kg", false, Profile.Type.UINT16));
        
        weightScaleMesg.addField(new Field("muscle_mass", MuscleMassFieldNum, 132, 100, 0, "kg", false, Profile.Type.UINT16));
        
        weightScaleMesg.addField(new Field("basal_met", BasalMetFieldNum, 132, 4, 0, "kcal/day", false, Profile.Type.UINT16));
        
        weightScaleMesg.addField(new Field("physique_rating", PhysiqueRatingFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        
        weightScaleMesg.addField(new Field("active_met", ActiveMetFieldNum, 132, 4, 0, "kcal/day", false, Profile.Type.UINT16));
        
        weightScaleMesg.addField(new Field("metabolic_age", MetabolicAgeFieldNum, 2, 1, 0, "years", false, Profile.Type.UINT8));
        
        weightScaleMesg.addField(new Field("visceral_fat_rating", VisceralFatRatingFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        
        weightScaleMesg.addField(new Field("user_profile_index", UserProfileIndexFieldNum, 132, 1, 0, "", false, Profile.Type.MESSAGE_INDEX));
        
    }

    public WeightScaleMesg() {
        super(Factory.createMesg(MesgNum.WEIGHT_SCALE));
    }

    public WeightScaleMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get timestamp field
     * Units: s
     *
     * @return timestamp
     */
    public DateTime getTimestamp() {
        return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set timestamp field
     * Units: s
     *
     * @param timestamp
     */
    public void setTimestamp(DateTime timestamp) {
        setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get weight field
     * Units: kg
     *
     * @return weight
     */
    public Float getWeight() {
        return getFieldFloatValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set weight field
     * Units: kg
     *
     * @param weight
     */
    public void setWeight(Float weight) {
        setFieldValue(0, 0, weight, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get percent_fat field
     * Units: %
     *
     * @return percent_fat
     */
    public Float getPercentFat() {
        return getFieldFloatValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set percent_fat field
     * Units: %
     *
     * @param percentFat
     */
    public void setPercentFat(Float percentFat) {
        setFieldValue(1, 0, percentFat, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get percent_hydration field
     * Units: %
     *
     * @return percent_hydration
     */
    public Float getPercentHydration() {
        return getFieldFloatValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set percent_hydration field
     * Units: %
     *
     * @param percentHydration
     */
    public void setPercentHydration(Float percentHydration) {
        setFieldValue(2, 0, percentHydration, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get visceral_fat_mass field
     * Units: kg
     *
     * @return visceral_fat_mass
     */
    public Float getVisceralFatMass() {
        return getFieldFloatValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set visceral_fat_mass field
     * Units: kg
     *
     * @param visceralFatMass
     */
    public void setVisceralFatMass(Float visceralFatMass) {
        setFieldValue(3, 0, visceralFatMass, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get bone_mass field
     * Units: kg
     *
     * @return bone_mass
     */
    public Float getBoneMass() {
        return getFieldFloatValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set bone_mass field
     * Units: kg
     *
     * @param boneMass
     */
    public void setBoneMass(Float boneMass) {
        setFieldValue(4, 0, boneMass, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get muscle_mass field
     * Units: kg
     *
     * @return muscle_mass
     */
    public Float getMuscleMass() {
        return getFieldFloatValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set muscle_mass field
     * Units: kg
     *
     * @param muscleMass
     */
    public void setMuscleMass(Float muscleMass) {
        setFieldValue(5, 0, muscleMass, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get basal_met field
     * Units: kcal/day
     *
     * @return basal_met
     */
    public Float getBasalMet() {
        return getFieldFloatValue(7, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set basal_met field
     * Units: kcal/day
     *
     * @param basalMet
     */
    public void setBasalMet(Float basalMet) {
        setFieldValue(7, 0, basalMet, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get physique_rating field
     *
     * @return physique_rating
     */
    public Short getPhysiqueRating() {
        return getFieldShortValue(8, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set physique_rating field
     *
     * @param physiqueRating
     */
    public void setPhysiqueRating(Short physiqueRating) {
        setFieldValue(8, 0, physiqueRating, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get active_met field
     * Units: kcal/day
     * Comment: ~4kJ per kcal, 0.25 allows max 16384 kcal
     *
     * @return active_met
     */
    public Float getActiveMet() {
        return getFieldFloatValue(9, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set active_met field
     * Units: kcal/day
     * Comment: ~4kJ per kcal, 0.25 allows max 16384 kcal
     *
     * @param activeMet
     */
    public void setActiveMet(Float activeMet) {
        setFieldValue(9, 0, activeMet, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get metabolic_age field
     * Units: years
     *
     * @return metabolic_age
     */
    public Short getMetabolicAge() {
        return getFieldShortValue(10, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set metabolic_age field
     * Units: years
     *
     * @param metabolicAge
     */
    public void setMetabolicAge(Short metabolicAge) {
        setFieldValue(10, 0, metabolicAge, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get visceral_fat_rating field
     *
     * @return visceral_fat_rating
     */
    public Short getVisceralFatRating() {
        return getFieldShortValue(11, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set visceral_fat_rating field
     *
     * @param visceralFatRating
     */
    public void setVisceralFatRating(Short visceralFatRating) {
        setFieldValue(11, 0, visceralFatRating, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get user_profile_index field
     * Comment: Associates this weight scale message to a user.  This corresponds to the index of the user profile message in the weight scale file.
     *
     * @return user_profile_index
     */
    public Integer getUserProfileIndex() {
        return getFieldIntegerValue(12, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set user_profile_index field
     * Comment: Associates this weight scale message to a user.  This corresponds to the index of the user profile message in the weight scale file.
     *
     * @param userProfileIndex
     */
    public void setUserProfileIndex(Integer userProfileIndex) {
        setFieldValue(12, 0, userProfileIndex, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
