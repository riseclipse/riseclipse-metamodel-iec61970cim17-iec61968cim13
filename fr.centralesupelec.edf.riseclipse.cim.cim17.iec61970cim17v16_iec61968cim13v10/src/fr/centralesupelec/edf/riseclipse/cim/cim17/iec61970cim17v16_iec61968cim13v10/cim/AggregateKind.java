/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aggregate Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAggregateKind()
 * @model
 * @generated
 */
public enum AggregateKind implements Enumerator {
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
     * The '<em><b>Average</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AVERAGE_VALUE
     * @generated
     * @ordered
     */
    AVERAGE( 1, "average", "average" ),

    /**
     * The '<em><b>Excess</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXCESS_VALUE
     * @generated
     * @ordered
     */
    EXCESS( 2, "excess", "excess" ),

    /**
     * The '<em><b>High Threshold</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HIGH_THRESHOLD_VALUE
     * @generated
     * @ordered
     */
    HIGH_THRESHOLD( 3, "highThreshold", "highThreshold" ),

    /**
     * The '<em><b>Low Threshold</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOW_THRESHOLD_VALUE
     * @generated
     * @ordered
     */
    LOW_THRESHOLD( 4, "lowThreshold", "lowThreshold" ),

    /**
     * The '<em><b>Maximum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAXIMUM_VALUE
     * @generated
     * @ordered
     */
    MAXIMUM( 5, "maximum", "maximum" ),

    /**
     * The '<em><b>Minimum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MINIMUM_VALUE
     * @generated
     * @ordered
     */
    MINIMUM( 6, "minimum", "minimum" ),

    /**
     * The '<em><b>Nominal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOMINAL_VALUE
     * @generated
     * @ordered
     */
    NOMINAL( 7, "nominal", "nominal" ),

    /**
     * The '<em><b>Normal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NORMAL_VALUE
     * @generated
     * @ordered
     */
    NORMAL( 8, "normal", "normal" ),

    /**
     * The '<em><b>Second Maximum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SECOND_MAXIMUM_VALUE
     * @generated
     * @ordered
     */
    SECOND_MAXIMUM( 9, "secondMaximum", "secondMaximum" ),

    /**
     * The '<em><b>Second Minimum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SECOND_MINIMUM_VALUE
     * @generated
     * @ordered
     */
    SECOND_MINIMUM( 10, "secondMinimum", "secondMinimum" ),

    /**
     * The '<em><b>Third Maximum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #THIRD_MAXIMUM_VALUE
     * @generated
     * @ordered
     */
    THIRD_MAXIMUM( 11, "thirdMaximum", "thirdMaximum" ),

    /**
     * The '<em><b>Fourth Maximum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FOURTH_MAXIMUM_VALUE
     * @generated
     * @ordered
     */
    FOURTH_MAXIMUM( 12, "fourthMaximum", "fourthMaximum" ),

    /**
     * The '<em><b>Fifth Maximum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIFTH_MAXIMUM_VALUE
     * @generated
     * @ordered
     */
    FIFTH_MAXIMUM( 13, "fifthMaximum", "fifthMaximum" ),

    /**
     * The '<em><b>Sum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUM_VALUE
     * @generated
     * @ordered
     */
    SUM( 14, "sum", "sum" );

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
     * The '<em><b>Average</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Average</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AVERAGE
     * @model name="average"
     * @generated
     * @ordered
     */
    public static final int AVERAGE_VALUE = 1;

    /**
     * The '<em><b>Excess</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Excess</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXCESS
     * @model name="excess"
     * @generated
     * @ordered
     */
    public static final int EXCESS_VALUE = 2;

    /**
     * The '<em><b>High Threshold</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>High Threshold</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HIGH_THRESHOLD
     * @model name="highThreshold"
     * @generated
     * @ordered
     */
    public static final int HIGH_THRESHOLD_VALUE = 3;

    /**
     * The '<em><b>Low Threshold</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Low Threshold</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOW_THRESHOLD
     * @model name="lowThreshold"
     * @generated
     * @ordered
     */
    public static final int LOW_THRESHOLD_VALUE = 4;

    /**
     * The '<em><b>Maximum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Maximum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAXIMUM
     * @model name="maximum"
     * @generated
     * @ordered
     */
    public static final int MAXIMUM_VALUE = 5;

    /**
     * The '<em><b>Minimum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Minimum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MINIMUM
     * @model name="minimum"
     * @generated
     * @ordered
     */
    public static final int MINIMUM_VALUE = 6;

    /**
     * The '<em><b>Nominal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Nominal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NOMINAL
     * @model name="nominal"
     * @generated
     * @ordered
     */
    public static final int NOMINAL_VALUE = 7;

    /**
     * The '<em><b>Normal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Normal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NORMAL
     * @model name="normal"
     * @generated
     * @ordered
     */
    public static final int NORMAL_VALUE = 8;

    /**
     * The '<em><b>Second Maximum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Second Maximum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SECOND_MAXIMUM
     * @model name="secondMaximum"
     * @generated
     * @ordered
     */
    public static final int SECOND_MAXIMUM_VALUE = 9;

    /**
     * The '<em><b>Second Minimum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Second Minimum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SECOND_MINIMUM
     * @model name="secondMinimum"
     * @generated
     * @ordered
     */
    public static final int SECOND_MINIMUM_VALUE = 10;

    /**
     * The '<em><b>Third Maximum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Third Maximum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #THIRD_MAXIMUM
     * @model name="thirdMaximum"
     * @generated
     * @ordered
     */
    public static final int THIRD_MAXIMUM_VALUE = 11;

    /**
     * The '<em><b>Fourth Maximum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fourth Maximum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FOURTH_MAXIMUM
     * @model name="fourthMaximum"
     * @generated
     * @ordered
     */
    public static final int FOURTH_MAXIMUM_VALUE = 12;

    /**
     * The '<em><b>Fifth Maximum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fifth Maximum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIFTH_MAXIMUM
     * @model name="fifthMaximum"
     * @generated
     * @ordered
     */
    public static final int FIFTH_MAXIMUM_VALUE = 13;

    /**
     * The '<em><b>Sum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUM
     * @model name="sum"
     * @generated
     * @ordered
     */
    public static final int SUM_VALUE = 14;

    /**
     * An array of all the '<em><b>Aggregate Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AggregateKind[] VALUES_ARRAY = new AggregateKind[] { NONE, AVERAGE, EXCESS, HIGH_THRESHOLD,
            LOW_THRESHOLD, MAXIMUM, MINIMUM, NOMINAL, NORMAL, SECOND_MAXIMUM, SECOND_MINIMUM, THIRD_MAXIMUM,
            FOURTH_MAXIMUM, FIFTH_MAXIMUM, SUM, };

    /**
     * A public read-only list of all the '<em><b>Aggregate Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< AggregateKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Aggregate Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AggregateKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AggregateKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Aggregate Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AggregateKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AggregateKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Aggregate Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AggregateKind get( int value ) {
        switch( value ) {
        case NONE_VALUE:
            return NONE;
        case AVERAGE_VALUE:
            return AVERAGE;
        case EXCESS_VALUE:
            return EXCESS;
        case HIGH_THRESHOLD_VALUE:
            return HIGH_THRESHOLD;
        case LOW_THRESHOLD_VALUE:
            return LOW_THRESHOLD;
        case MAXIMUM_VALUE:
            return MAXIMUM;
        case MINIMUM_VALUE:
            return MINIMUM;
        case NOMINAL_VALUE:
            return NOMINAL;
        case NORMAL_VALUE:
            return NORMAL;
        case SECOND_MAXIMUM_VALUE:
            return SECOND_MAXIMUM;
        case SECOND_MINIMUM_VALUE:
            return SECOND_MINIMUM;
        case THIRD_MAXIMUM_VALUE:
            return THIRD_MAXIMUM;
        case FOURTH_MAXIMUM_VALUE:
            return FOURTH_MAXIMUM;
        case FIFTH_MAXIMUM_VALUE:
            return FIFTH_MAXIMUM;
        case SUM_VALUE:
            return SUM;
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
    private AggregateKind( int value, String name, String literal ) {
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

} //AggregateKind
