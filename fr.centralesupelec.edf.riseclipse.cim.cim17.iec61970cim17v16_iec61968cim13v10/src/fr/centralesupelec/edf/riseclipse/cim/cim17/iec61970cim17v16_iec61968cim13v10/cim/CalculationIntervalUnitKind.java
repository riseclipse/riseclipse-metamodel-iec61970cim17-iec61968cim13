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
 * A representation of the literals of the enumeration '<em><b>Calculation Interval Unit Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCalculationIntervalUnitKind()
 * @model
 * @generated
 */
public enum CalculationIntervalUnitKind implements Enumerator {
    /**
     * The '<em><b>Milli Second</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MILLI_SECOND_VALUE
     * @generated
     * @ordered
     */
    MILLI_SECOND( 0, "milliSecond", "milliSecond" ),

    /**
     * The '<em><b>Per Cycle</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PER_CYCLE_VALUE
     * @generated
     * @ordered
     */
    PER_CYCLE( 1, "perCycle", "perCycle" ),

    /**
     * The '<em><b>Cycle</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CYCLE_VALUE
     * @generated
     * @ordered
     */
    CYCLE( 2, "cycle", "cycle" ),

    /**
     * The '<em><b>Second</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SECOND_VALUE
     * @generated
     * @ordered
     */
    SECOND( 3, "second", "second" ),

    /**
     * The '<em><b>Minute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MINUTE_VALUE
     * @generated
     * @ordered
     */
    MINUTE( 4, "minute", "minute" ),

    /**
     * The '<em><b>Day</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DAY_VALUE
     * @generated
     * @ordered
     */
    DAY( 5, "day", "day" ),

    /**
     * The '<em><b>Hour</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HOUR_VALUE
     * @generated
     * @ordered
     */
    HOUR( 6, "hour", "hour" ),

    /**
     * The '<em><b>Week</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WEEK_VALUE
     * @generated
     * @ordered
     */
    WEEK( 7, "week", "week" ),

    /**
     * The '<em><b>Month</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MONTH_VALUE
     * @generated
     * @ordered
     */
    MONTH( 8, "month", "month" ),

    /**
     * The '<em><b>Year</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #YEAR_VALUE
     * @generated
     * @ordered
     */
    YEAR( 9, "year", "year" ),

    /**
     * The '<em><b>Season</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEASON_VALUE
     * @generated
     * @ordered
     */
    SEASON( 10, "season", "season" );

    /**
     * The '<em><b>Milli Second</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Milli Second</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MILLI_SECOND
     * @model name="milliSecond"
     * @generated
     * @ordered
     */
    public static final int MILLI_SECOND_VALUE = 0;

    /**
     * The '<em><b>Per Cycle</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Per Cycle</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PER_CYCLE
     * @model name="perCycle"
     * @generated
     * @ordered
     */
    public static final int PER_CYCLE_VALUE = 1;

    /**
     * The '<em><b>Cycle</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Cycle</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CYCLE
     * @model name="cycle"
     * @generated
     * @ordered
     */
    public static final int CYCLE_VALUE = 2;

    /**
     * The '<em><b>Second</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Second</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SECOND
     * @model name="second"
     * @generated
     * @ordered
     */
    public static final int SECOND_VALUE = 3;

    /**
     * The '<em><b>Minute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Minute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MINUTE
     * @model name="minute"
     * @generated
     * @ordered
     */
    public static final int MINUTE_VALUE = 4;

    /**
     * The '<em><b>Day</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Day</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DAY
     * @model name="day"
     * @generated
     * @ordered
     */
    public static final int DAY_VALUE = 5;

    /**
     * The '<em><b>Hour</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hour</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HOUR
     * @model name="hour"
     * @generated
     * @ordered
     */
    public static final int HOUR_VALUE = 6;

    /**
     * The '<em><b>Week</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Week</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WEEK
     * @model name="week"
     * @generated
     * @ordered
     */
    public static final int WEEK_VALUE = 7;

    /**
     * The '<em><b>Month</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Month</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MONTH
     * @model name="month"
     * @generated
     * @ordered
     */
    public static final int MONTH_VALUE = 8;

    /**
     * The '<em><b>Year</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Year</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #YEAR
     * @model name="year"
     * @generated
     * @ordered
     */
    public static final int YEAR_VALUE = 9;

    /**
     * The '<em><b>Season</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Season</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SEASON
     * @model name="season"
     * @generated
     * @ordered
     */
    public static final int SEASON_VALUE = 10;

    /**
     * An array of all the '<em><b>Calculation Interval Unit Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final CalculationIntervalUnitKind[] VALUES_ARRAY = new CalculationIntervalUnitKind[] { MILLI_SECOND,
            PER_CYCLE, CYCLE, SECOND, MINUTE, DAY, HOUR, WEEK, MONTH, YEAR, SEASON, };

    /**
     * A public read-only list of all the '<em><b>Calculation Interval Unit Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< CalculationIntervalUnitKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Calculation Interval Unit Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CalculationIntervalUnitKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            CalculationIntervalUnitKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Calculation Interval Unit Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CalculationIntervalUnitKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            CalculationIntervalUnitKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Calculation Interval Unit Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CalculationIntervalUnitKind get( int value ) {
        switch( value ) {
        case MILLI_SECOND_VALUE:
            return MILLI_SECOND;
        case PER_CYCLE_VALUE:
            return PER_CYCLE;
        case CYCLE_VALUE:
            return CYCLE;
        case SECOND_VALUE:
            return SECOND;
        case MINUTE_VALUE:
            return MINUTE;
        case DAY_VALUE:
            return DAY;
        case HOUR_VALUE:
            return HOUR;
        case WEEK_VALUE:
            return WEEK;
        case MONTH_VALUE:
            return MONTH;
        case YEAR_VALUE:
            return YEAR;
        case SEASON_VALUE:
            return SEASON;
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
    private CalculationIntervalUnitKind( int value, String name, String literal ) {
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

} //CalculationIntervalUnitKind
