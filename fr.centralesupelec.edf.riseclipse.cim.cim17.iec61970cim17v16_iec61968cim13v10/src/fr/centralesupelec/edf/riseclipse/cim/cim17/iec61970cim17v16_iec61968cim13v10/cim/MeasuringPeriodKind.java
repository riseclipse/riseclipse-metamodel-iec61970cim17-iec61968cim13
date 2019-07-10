/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Measuring Period Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeasuringPeriodKind()
 * @model
 * @generated
 */
public enum MeasuringPeriodKind implements Enumerator {
    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE( 0, "none", "none" ),

    /**
     * The '<em><b>Ten Minute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TEN_MINUTE_VALUE
     * @generated
     * @ordered
     */
    TEN_MINUTE( 1, "tenMinute", "tenMinute" ),

    /**
     * The '<em><b>Fifteen Minute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIFTEEN_MINUTE_VALUE
     * @generated
     * @ordered
     */
    FIFTEEN_MINUTE( 2, "fifteenMinute", "fifteenMinute" ),

    /**
     * The '<em><b>One Minute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ONE_MINUTE_VALUE
     * @generated
     * @ordered
     */
    ONE_MINUTE( 3, "oneMinute", "oneMinute" ),

    /**
     * The '<em><b>Twentyfour Hour</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TWENTYFOUR_HOUR_VALUE
     * @generated
     * @ordered
     */
    TWENTYFOUR_HOUR( 4, "twentyfourHour", "twentyfourHour" ),

    /**
     * The '<em><b>Thirty Minute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #THIRTY_MINUTE_VALUE
     * @generated
     * @ordered
     */
    THIRTY_MINUTE( 5, "thirtyMinute", "thirtyMinute" ),

    /**
     * The '<em><b>Five Minute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIVE_MINUTE_VALUE
     * @generated
     * @ordered
     */
    FIVE_MINUTE( 6, "fiveMinute", "fiveMinute" ),

    /**
     * The '<em><b>Sixty Minute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SIXTY_MINUTE_VALUE
     * @generated
     * @ordered
     */
    SIXTY_MINUTE( 7, "sixtyMinute", "sixtyMinute" ),

    /**
     * The '<em><b>Two Minute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TWO_MINUTE_VALUE
     * @generated
     * @ordered
     */
    TWO_MINUTE( 8, "twoMinute", "twoMinute" ),

    /**
     * The '<em><b>Three Minute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #THREE_MINUTE_VALUE
     * @generated
     * @ordered
     */
    THREE_MINUTE( 9, "threeMinute", "threeMinute" ),

    /**
     * The '<em><b>Present</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PRESENT_VALUE
     * @generated
     * @ordered
     */
    PRESENT( 10, "present", "present" ),

    /**
     * The '<em><b>Previous</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PREVIOUS_VALUE
     * @generated
     * @ordered
     */
    PREVIOUS( 11, "previous", "previous" ),

    /**
     * The '<em><b>Twenty Minute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TWENTY_MINUTE_VALUE
     * @generated
     * @ordered
     */
    TWENTY_MINUTE( 12, "twentyMinute", "twentyMinute" ),

    /**
     * The '<em><b>Fixed Block60 Min</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK60_MIN_VALUE
     * @generated
     * @ordered
     */
    FIXED_BLOCK60_MIN( 13, "fixedBlock60Min", "fixedBlock60Min" ),

    /**
     * The '<em><b>Fixed Block30 Min</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK30_MIN_VALUE
     * @generated
     * @ordered
     */
    FIXED_BLOCK30_MIN( 14, "fixedBlock30Min", "fixedBlock30Min" ),

    /**
     * The '<em><b>Fixed Block20 Min</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK20_MIN_VALUE
     * @generated
     * @ordered
     */
    FIXED_BLOCK20_MIN( 15, "fixedBlock20Min", "fixedBlock20Min" ),

    /**
     * The '<em><b>Fixed Block15 Min</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK15_MIN_VALUE
     * @generated
     * @ordered
     */
    FIXED_BLOCK15_MIN( 16, "fixedBlock15Min", "fixedBlock15Min" ),

    /**
     * The '<em><b>Fixed Block10 Min</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK10_MIN_VALUE
     * @generated
     * @ordered
     */
    FIXED_BLOCK10_MIN( 17, "fixedBlock10Min", "fixedBlock10Min" ),

    /**
     * The '<em><b>Fixed Block5 Min</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK5_MIN_VALUE
     * @generated
     * @ordered
     */
    FIXED_BLOCK5_MIN( 18, "fixedBlock5Min", "fixedBlock5Min" ),

    /**
     * The '<em><b>Fixed Block1 Min</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK1_MIN_VALUE
     * @generated
     * @ordered
     */
    FIXED_BLOCK1_MIN( 19, "fixedBlock1Min", "fixedBlock1Min" ),

    /**
     * The '<em><b>Rolling Block60 Min Intvl30 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL30_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK60_MIN_INTVL30_MIN_SUB_INTVL( 20, "rollingBlock60MinIntvl30MinSubIntvl",
            "rollingBlock60MinIntvl30MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block60 Min Intvl20 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL20_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK60_MIN_INTVL20_MIN_SUB_INTVL( 21, "rollingBlock60MinIntvl20MinSubIntvl",
            "rollingBlock60MinIntvl20MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block60 Min Intvl15 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL15_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK60_MIN_INTVL15_MIN_SUB_INTVL( 22, "rollingBlock60MinIntvl15MinSubIntvl",
            "rollingBlock60MinIntvl15MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block60 Min Intvl12 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL12_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK60_MIN_INTVL12_MIN_SUB_INTVL( 23, "rollingBlock60MinIntvl12MinSubIntvl",
            "rollingBlock60MinIntvl12MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block60 Min Intvl10 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL10_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK60_MIN_INTVL10_MIN_SUB_INTVL( 24, "rollingBlock60MinIntvl10MinSubIntvl",
            "rollingBlock60MinIntvl10MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block60 Min Intvl6 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL6_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK60_MIN_INTVL6_MIN_SUB_INTVL( 25, "rollingBlock60MinIntvl6MinSubIntvl",
            "rollingBlock60MinIntvl6MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block60 Min Intvl5 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL5_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK60_MIN_INTVL5_MIN_SUB_INTVL( 26, "rollingBlock60MinIntvl5MinSubIntvl",
            "rollingBlock60MinIntvl5MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block60 Min Intvl4 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL4_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK60_MIN_INTVL4_MIN_SUB_INTVL( 27, "rollingBlock60MinIntvl4MinSubIntvl",
            "rollingBlock60MinIntvl4MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block30 Min Intvl15 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK30_MIN_INTVL15_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK30_MIN_INTVL15_MIN_SUB_INTVL( 28, "rollingBlock30MinIntvl15MinSubIntvl",
            "rollingBlock30MinIntvl15MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block30 Min Intvl10 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK30_MIN_INTVL10_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK30_MIN_INTVL10_MIN_SUB_INTVL( 29, "rollingBlock30MinIntvl10MinSubIntvl",
            "rollingBlock30MinIntvl10MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block30 Min Intvl6 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK30_MIN_INTVL6_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK30_MIN_INTVL6_MIN_SUB_INTVL( 30, "rollingBlock30MinIntvl6MinSubIntvl",
            "rollingBlock30MinIntvl6MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block30 Min Intvl5 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK30_MIN_INTVL5_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK30_MIN_INTVL5_MIN_SUB_INTVL( 31, "rollingBlock30MinIntvl5MinSubIntvl",
            "rollingBlock30MinIntvl5MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block30 Min Intvl3 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK30_MIN_INTVL3_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK30_MIN_INTVL3_MIN_SUB_INTVL( 32, "rollingBlock30MinIntvl3MinSubIntvl",
            "rollingBlock30MinIntvl3MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block30 Min Intvl2 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK30_MIN_INTVL2_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK30_MIN_INTVL2_MIN_SUB_INTVL( 33, "rollingBlock30MinIntvl2MinSubIntvl",
            "rollingBlock30MinIntvl2MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block15 Min Intvl5 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK15_MIN_INTVL5_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK15_MIN_INTVL5_MIN_SUB_INTVL( 34, "rollingBlock15MinIntvl5MinSubIntvl",
            "rollingBlock15MinIntvl5MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block15 Min Intvl3 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK15_MIN_INTVL3_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK15_MIN_INTVL3_MIN_SUB_INTVL( 35, "rollingBlock15MinIntvl3MinSubIntvl",
            "rollingBlock15MinIntvl3MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block15 Min Intvl1 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK15_MIN_INTVL1_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK15_MIN_INTVL1_MIN_SUB_INTVL( 36, "rollingBlock15MinIntvl1MinSubIntvl",
            "rollingBlock15MinIntvl1MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block10 Min Intvl5 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK10_MIN_INTVL5_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK10_MIN_INTVL5_MIN_SUB_INTVL( 37, "rollingBlock10MinIntvl5MinSubIntvl",
            "rollingBlock10MinIntvl5MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block10 Min Intvl2 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK10_MIN_INTVL2_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK10_MIN_INTVL2_MIN_SUB_INTVL( 38, "rollingBlock10MinIntvl2MinSubIntvl",
            "rollingBlock10MinIntvl2MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block10 Min Intvl1 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK10_MIN_INTVL1_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK10_MIN_INTVL1_MIN_SUB_INTVL( 39, "rollingBlock10MinIntvl1MinSubIntvl",
            "rollingBlock10MinIntvl1MinSubIntvl" ),

    /**
     * The '<em><b>Rolling Block5 Min Intvl1 Min Sub Intvl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK5_MIN_INTVL1_MIN_SUB_INTVL_VALUE
     * @generated
     * @ordered
     */
    ROLLING_BLOCK5_MIN_INTVL1_MIN_SUB_INTVL( 40, "rollingBlock5MinIntvl1MinSubIntvl",
            "rollingBlock5MinIntvl1MinSubIntvl" );

    /**
     * The '<em><b>None</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NONE
     * @model name="none"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 0;

    /**
     * The '<em><b>Ten Minute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ten Minute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TEN_MINUTE
     * @model name="tenMinute"
     * @generated
     * @ordered
     */
    public static final int TEN_MINUTE_VALUE = 1;

    /**
     * The '<em><b>Fifteen Minute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fifteen Minute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIFTEEN_MINUTE
     * @model name="fifteenMinute"
     * @generated
     * @ordered
     */
    public static final int FIFTEEN_MINUTE_VALUE = 2;

    /**
     * The '<em><b>One Minute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>One Minute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ONE_MINUTE
     * @model name="oneMinute"
     * @generated
     * @ordered
     */
    public static final int ONE_MINUTE_VALUE = 3;

    /**
     * The '<em><b>Twentyfour Hour</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Twentyfour Hour</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TWENTYFOUR_HOUR
     * @model name="twentyfourHour"
     * @generated
     * @ordered
     */
    public static final int TWENTYFOUR_HOUR_VALUE = 4;

    /**
     * The '<em><b>Thirty Minute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Thirty Minute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #THIRTY_MINUTE
     * @model name="thirtyMinute"
     * @generated
     * @ordered
     */
    public static final int THIRTY_MINUTE_VALUE = 5;

    /**
     * The '<em><b>Five Minute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Five Minute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIVE_MINUTE
     * @model name="fiveMinute"
     * @generated
     * @ordered
     */
    public static final int FIVE_MINUTE_VALUE = 6;

    /**
     * The '<em><b>Sixty Minute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sixty Minute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SIXTY_MINUTE
     * @model name="sixtyMinute"
     * @generated
     * @ordered
     */
    public static final int SIXTY_MINUTE_VALUE = 7;

    /**
     * The '<em><b>Two Minute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Two Minute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TWO_MINUTE
     * @model name="twoMinute"
     * @generated
     * @ordered
     */
    public static final int TWO_MINUTE_VALUE = 8;

    /**
     * The '<em><b>Three Minute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Three Minute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #THREE_MINUTE
     * @model name="threeMinute"
     * @generated
     * @ordered
     */
    public static final int THREE_MINUTE_VALUE = 9;

    /**
     * The '<em><b>Present</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Present</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PRESENT
     * @model name="present"
     * @generated
     * @ordered
     */
    public static final int PRESENT_VALUE = 10;

    /**
     * The '<em><b>Previous</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Previous</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PREVIOUS
     * @model name="previous"
     * @generated
     * @ordered
     */
    public static final int PREVIOUS_VALUE = 11;

    /**
     * The '<em><b>Twenty Minute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Twenty Minute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TWENTY_MINUTE
     * @model name="twentyMinute"
     * @generated
     * @ordered
     */
    public static final int TWENTY_MINUTE_VALUE = 12;

    /**
     * The '<em><b>Fixed Block60 Min</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fixed Block60 Min</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK60_MIN
     * @model name="fixedBlock60Min"
     * @generated
     * @ordered
     */
    public static final int FIXED_BLOCK60_MIN_VALUE = 13;

    /**
     * The '<em><b>Fixed Block30 Min</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fixed Block30 Min</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK30_MIN
     * @model name="fixedBlock30Min"
     * @generated
     * @ordered
     */
    public static final int FIXED_BLOCK30_MIN_VALUE = 14;

    /**
     * The '<em><b>Fixed Block20 Min</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fixed Block20 Min</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK20_MIN
     * @model name="fixedBlock20Min"
     * @generated
     * @ordered
     */
    public static final int FIXED_BLOCK20_MIN_VALUE = 15;

    /**
     * The '<em><b>Fixed Block15 Min</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fixed Block15 Min</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK15_MIN
     * @model name="fixedBlock15Min"
     * @generated
     * @ordered
     */
    public static final int FIXED_BLOCK15_MIN_VALUE = 16;

    /**
     * The '<em><b>Fixed Block10 Min</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fixed Block10 Min</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK10_MIN
     * @model name="fixedBlock10Min"
     * @generated
     * @ordered
     */
    public static final int FIXED_BLOCK10_MIN_VALUE = 17;

    /**
     * The '<em><b>Fixed Block5 Min</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fixed Block5 Min</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK5_MIN
     * @model name="fixedBlock5Min"
     * @generated
     * @ordered
     */
    public static final int FIXED_BLOCK5_MIN_VALUE = 18;

    /**
     * The '<em><b>Fixed Block1 Min</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fixed Block1 Min</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIXED_BLOCK1_MIN
     * @model name="fixedBlock1Min"
     * @generated
     * @ordered
     */
    public static final int FIXED_BLOCK1_MIN_VALUE = 19;

    /**
     * The '<em><b>Rolling Block60 Min Intvl30 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block60 Min Intvl30 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL30_MIN_SUB_INTVL
     * @model name="rollingBlock60MinIntvl30MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK60_MIN_INTVL30_MIN_SUB_INTVL_VALUE = 20;

    /**
     * The '<em><b>Rolling Block60 Min Intvl20 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block60 Min Intvl20 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL20_MIN_SUB_INTVL
     * @model name="rollingBlock60MinIntvl20MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK60_MIN_INTVL20_MIN_SUB_INTVL_VALUE = 21;

    /**
     * The '<em><b>Rolling Block60 Min Intvl15 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block60 Min Intvl15 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL15_MIN_SUB_INTVL
     * @model name="rollingBlock60MinIntvl15MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK60_MIN_INTVL15_MIN_SUB_INTVL_VALUE = 22;

    /**
     * The '<em><b>Rolling Block60 Min Intvl12 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block60 Min Intvl12 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL12_MIN_SUB_INTVL
     * @model name="rollingBlock60MinIntvl12MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK60_MIN_INTVL12_MIN_SUB_INTVL_VALUE = 23;

    /**
     * The '<em><b>Rolling Block60 Min Intvl10 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block60 Min Intvl10 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL10_MIN_SUB_INTVL
     * @model name="rollingBlock60MinIntvl10MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK60_MIN_INTVL10_MIN_SUB_INTVL_VALUE = 24;

    /**
     * The '<em><b>Rolling Block60 Min Intvl6 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block60 Min Intvl6 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL6_MIN_SUB_INTVL
     * @model name="rollingBlock60MinIntvl6MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK60_MIN_INTVL6_MIN_SUB_INTVL_VALUE = 25;

    /**
     * The '<em><b>Rolling Block60 Min Intvl5 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block60 Min Intvl5 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL5_MIN_SUB_INTVL
     * @model name="rollingBlock60MinIntvl5MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK60_MIN_INTVL5_MIN_SUB_INTVL_VALUE = 26;

    /**
     * The '<em><b>Rolling Block60 Min Intvl4 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block60 Min Intvl4 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK60_MIN_INTVL4_MIN_SUB_INTVL
     * @model name="rollingBlock60MinIntvl4MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK60_MIN_INTVL4_MIN_SUB_INTVL_VALUE = 27;

    /**
     * The '<em><b>Rolling Block30 Min Intvl15 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block30 Min Intvl15 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK30_MIN_INTVL15_MIN_SUB_INTVL
     * @model name="rollingBlock30MinIntvl15MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK30_MIN_INTVL15_MIN_SUB_INTVL_VALUE = 28;

    /**
     * The '<em><b>Rolling Block30 Min Intvl10 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block30 Min Intvl10 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK30_MIN_INTVL10_MIN_SUB_INTVL
     * @model name="rollingBlock30MinIntvl10MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK30_MIN_INTVL10_MIN_SUB_INTVL_VALUE = 29;

    /**
     * The '<em><b>Rolling Block30 Min Intvl6 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block30 Min Intvl6 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK30_MIN_INTVL6_MIN_SUB_INTVL
     * @model name="rollingBlock30MinIntvl6MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK30_MIN_INTVL6_MIN_SUB_INTVL_VALUE = 30;

    /**
     * The '<em><b>Rolling Block30 Min Intvl5 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block30 Min Intvl5 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK30_MIN_INTVL5_MIN_SUB_INTVL
     * @model name="rollingBlock30MinIntvl5MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK30_MIN_INTVL5_MIN_SUB_INTVL_VALUE = 31;

    /**
     * The '<em><b>Rolling Block30 Min Intvl3 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block30 Min Intvl3 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK30_MIN_INTVL3_MIN_SUB_INTVL
     * @model name="rollingBlock30MinIntvl3MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK30_MIN_INTVL3_MIN_SUB_INTVL_VALUE = 32;

    /**
     * The '<em><b>Rolling Block30 Min Intvl2 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block30 Min Intvl2 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK30_MIN_INTVL2_MIN_SUB_INTVL
     * @model name="rollingBlock30MinIntvl2MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK30_MIN_INTVL2_MIN_SUB_INTVL_VALUE = 33;

    /**
     * The '<em><b>Rolling Block15 Min Intvl5 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block15 Min Intvl5 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK15_MIN_INTVL5_MIN_SUB_INTVL
     * @model name="rollingBlock15MinIntvl5MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK15_MIN_INTVL5_MIN_SUB_INTVL_VALUE = 34;

    /**
     * The '<em><b>Rolling Block15 Min Intvl3 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block15 Min Intvl3 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK15_MIN_INTVL3_MIN_SUB_INTVL
     * @model name="rollingBlock15MinIntvl3MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK15_MIN_INTVL3_MIN_SUB_INTVL_VALUE = 35;

    /**
     * The '<em><b>Rolling Block15 Min Intvl1 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block15 Min Intvl1 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK15_MIN_INTVL1_MIN_SUB_INTVL
     * @model name="rollingBlock15MinIntvl1MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK15_MIN_INTVL1_MIN_SUB_INTVL_VALUE = 36;

    /**
     * The '<em><b>Rolling Block10 Min Intvl5 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block10 Min Intvl5 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK10_MIN_INTVL5_MIN_SUB_INTVL
     * @model name="rollingBlock10MinIntvl5MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK10_MIN_INTVL5_MIN_SUB_INTVL_VALUE = 37;

    /**
     * The '<em><b>Rolling Block10 Min Intvl2 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block10 Min Intvl2 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK10_MIN_INTVL2_MIN_SUB_INTVL
     * @model name="rollingBlock10MinIntvl2MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK10_MIN_INTVL2_MIN_SUB_INTVL_VALUE = 38;

    /**
     * The '<em><b>Rolling Block10 Min Intvl1 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block10 Min Intvl1 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK10_MIN_INTVL1_MIN_SUB_INTVL
     * @model name="rollingBlock10MinIntvl1MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK10_MIN_INTVL1_MIN_SUB_INTVL_VALUE = 39;

    /**
     * The '<em><b>Rolling Block5 Min Intvl1 Min Sub Intvl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rolling Block5 Min Intvl1 Min Sub Intvl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROLLING_BLOCK5_MIN_INTVL1_MIN_SUB_INTVL
     * @model name="rollingBlock5MinIntvl1MinSubIntvl"
     * @generated
     * @ordered
     */
    public static final int ROLLING_BLOCK5_MIN_INTVL1_MIN_SUB_INTVL_VALUE = 40;

    /**
     * An array of all the '<em><b>Measuring Period Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final MeasuringPeriodKind[] VALUES_ARRAY = new MeasuringPeriodKind[] { NONE, TEN_MINUTE,
            FIFTEEN_MINUTE, ONE_MINUTE, TWENTYFOUR_HOUR, THIRTY_MINUTE, FIVE_MINUTE, SIXTY_MINUTE, TWO_MINUTE,
            THREE_MINUTE, PRESENT, PREVIOUS, TWENTY_MINUTE, FIXED_BLOCK60_MIN, FIXED_BLOCK30_MIN, FIXED_BLOCK20_MIN,
            FIXED_BLOCK15_MIN, FIXED_BLOCK10_MIN, FIXED_BLOCK5_MIN, FIXED_BLOCK1_MIN,
            ROLLING_BLOCK60_MIN_INTVL30_MIN_SUB_INTVL, ROLLING_BLOCK60_MIN_INTVL20_MIN_SUB_INTVL,
            ROLLING_BLOCK60_MIN_INTVL15_MIN_SUB_INTVL, ROLLING_BLOCK60_MIN_INTVL12_MIN_SUB_INTVL,
            ROLLING_BLOCK60_MIN_INTVL10_MIN_SUB_INTVL, ROLLING_BLOCK60_MIN_INTVL6_MIN_SUB_INTVL,
            ROLLING_BLOCK60_MIN_INTVL5_MIN_SUB_INTVL, ROLLING_BLOCK60_MIN_INTVL4_MIN_SUB_INTVL,
            ROLLING_BLOCK30_MIN_INTVL15_MIN_SUB_INTVL, ROLLING_BLOCK30_MIN_INTVL10_MIN_SUB_INTVL,
            ROLLING_BLOCK30_MIN_INTVL6_MIN_SUB_INTVL, ROLLING_BLOCK30_MIN_INTVL5_MIN_SUB_INTVL,
            ROLLING_BLOCK30_MIN_INTVL3_MIN_SUB_INTVL, ROLLING_BLOCK30_MIN_INTVL2_MIN_SUB_INTVL,
            ROLLING_BLOCK15_MIN_INTVL5_MIN_SUB_INTVL, ROLLING_BLOCK15_MIN_INTVL3_MIN_SUB_INTVL,
            ROLLING_BLOCK15_MIN_INTVL1_MIN_SUB_INTVL, ROLLING_BLOCK10_MIN_INTVL5_MIN_SUB_INTVL,
            ROLLING_BLOCK10_MIN_INTVL2_MIN_SUB_INTVL, ROLLING_BLOCK10_MIN_INTVL1_MIN_SUB_INTVL,
            ROLLING_BLOCK5_MIN_INTVL1_MIN_SUB_INTVL, };

    /**
     * A public read-only list of all the '<em><b>Measuring Period Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< MeasuringPeriodKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Measuring Period Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MeasuringPeriodKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            MeasuringPeriodKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Measuring Period Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MeasuringPeriodKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            MeasuringPeriodKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Measuring Period Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MeasuringPeriodKind get( int value ) {
        switch( value ) {
        case NONE_VALUE:
            return NONE;
        case TEN_MINUTE_VALUE:
            return TEN_MINUTE;
        case FIFTEEN_MINUTE_VALUE:
            return FIFTEEN_MINUTE;
        case ONE_MINUTE_VALUE:
            return ONE_MINUTE;
        case TWENTYFOUR_HOUR_VALUE:
            return TWENTYFOUR_HOUR;
        case THIRTY_MINUTE_VALUE:
            return THIRTY_MINUTE;
        case FIVE_MINUTE_VALUE:
            return FIVE_MINUTE;
        case SIXTY_MINUTE_VALUE:
            return SIXTY_MINUTE;
        case TWO_MINUTE_VALUE:
            return TWO_MINUTE;
        case THREE_MINUTE_VALUE:
            return THREE_MINUTE;
        case PRESENT_VALUE:
            return PRESENT;
        case PREVIOUS_VALUE:
            return PREVIOUS;
        case TWENTY_MINUTE_VALUE:
            return TWENTY_MINUTE;
        case FIXED_BLOCK60_MIN_VALUE:
            return FIXED_BLOCK60_MIN;
        case FIXED_BLOCK30_MIN_VALUE:
            return FIXED_BLOCK30_MIN;
        case FIXED_BLOCK20_MIN_VALUE:
            return FIXED_BLOCK20_MIN;
        case FIXED_BLOCK15_MIN_VALUE:
            return FIXED_BLOCK15_MIN;
        case FIXED_BLOCK10_MIN_VALUE:
            return FIXED_BLOCK10_MIN;
        case FIXED_BLOCK5_MIN_VALUE:
            return FIXED_BLOCK5_MIN;
        case FIXED_BLOCK1_MIN_VALUE:
            return FIXED_BLOCK1_MIN;
        case ROLLING_BLOCK60_MIN_INTVL30_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK60_MIN_INTVL30_MIN_SUB_INTVL;
        case ROLLING_BLOCK60_MIN_INTVL20_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK60_MIN_INTVL20_MIN_SUB_INTVL;
        case ROLLING_BLOCK60_MIN_INTVL15_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK60_MIN_INTVL15_MIN_SUB_INTVL;
        case ROLLING_BLOCK60_MIN_INTVL12_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK60_MIN_INTVL12_MIN_SUB_INTVL;
        case ROLLING_BLOCK60_MIN_INTVL10_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK60_MIN_INTVL10_MIN_SUB_INTVL;
        case ROLLING_BLOCK60_MIN_INTVL6_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK60_MIN_INTVL6_MIN_SUB_INTVL;
        case ROLLING_BLOCK60_MIN_INTVL5_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK60_MIN_INTVL5_MIN_SUB_INTVL;
        case ROLLING_BLOCK60_MIN_INTVL4_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK60_MIN_INTVL4_MIN_SUB_INTVL;
        case ROLLING_BLOCK30_MIN_INTVL15_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK30_MIN_INTVL15_MIN_SUB_INTVL;
        case ROLLING_BLOCK30_MIN_INTVL10_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK30_MIN_INTVL10_MIN_SUB_INTVL;
        case ROLLING_BLOCK30_MIN_INTVL6_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK30_MIN_INTVL6_MIN_SUB_INTVL;
        case ROLLING_BLOCK30_MIN_INTVL5_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK30_MIN_INTVL5_MIN_SUB_INTVL;
        case ROLLING_BLOCK30_MIN_INTVL3_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK30_MIN_INTVL3_MIN_SUB_INTVL;
        case ROLLING_BLOCK30_MIN_INTVL2_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK30_MIN_INTVL2_MIN_SUB_INTVL;
        case ROLLING_BLOCK15_MIN_INTVL5_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK15_MIN_INTVL5_MIN_SUB_INTVL;
        case ROLLING_BLOCK15_MIN_INTVL3_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK15_MIN_INTVL3_MIN_SUB_INTVL;
        case ROLLING_BLOCK15_MIN_INTVL1_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK15_MIN_INTVL1_MIN_SUB_INTVL;
        case ROLLING_BLOCK10_MIN_INTVL5_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK10_MIN_INTVL5_MIN_SUB_INTVL;
        case ROLLING_BLOCK10_MIN_INTVL2_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK10_MIN_INTVL2_MIN_SUB_INTVL;
        case ROLLING_BLOCK10_MIN_INTVL1_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK10_MIN_INTVL1_MIN_SUB_INTVL;
        case ROLLING_BLOCK5_MIN_INTVL1_MIN_SUB_INTVL_VALUE:
            return ROLLING_BLOCK5_MIN_INTVL1_MIN_SUB_INTVL;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private MeasuringPeriodKind( int value, String name, String literal ) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //MeasuringPeriodKind
