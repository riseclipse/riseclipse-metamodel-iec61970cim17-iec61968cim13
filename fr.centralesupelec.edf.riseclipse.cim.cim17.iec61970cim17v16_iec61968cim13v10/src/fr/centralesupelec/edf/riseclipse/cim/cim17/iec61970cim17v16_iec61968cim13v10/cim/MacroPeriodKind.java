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
 * A representation of the literals of the enumeration '<em><b>Macro Period Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMacroPeriodKind()
 * @model
 * @generated
 */
public enum MacroPeriodKind implements Enumerator {
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
     * The '<em><b>Billing Period</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BILLING_PERIOD_VALUE
     * @generated
     * @ordered
     */
    BILLING_PERIOD( 1, "billingPeriod", "billingPeriod" ),

    /**
     * The '<em><b>Daily</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DAILY_VALUE
     * @generated
     * @ordered
     */
    DAILY( 2, "daily", "daily" ),

    /**
     * The '<em><b>Monthly</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MONTHLY_VALUE
     * @generated
     * @ordered
     */
    MONTHLY( 3, "monthly", "monthly" ),

    /**
     * The '<em><b>Seasonal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEASONAL_VALUE
     * @generated
     * @ordered
     */
    SEASONAL( 4, "seasonal", "seasonal" ),

    /**
     * The '<em><b>Weekly</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WEEKLY_VALUE
     * @generated
     * @ordered
     */
    WEEKLY( 5, "weekly", "weekly" ),

    /**
     * The '<em><b>Specified Period</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SPECIFIED_PERIOD_VALUE
     * @generated
     * @ordered
     */
    SPECIFIED_PERIOD( 6, "specifiedPeriod", "specifiedPeriod" );

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
     * The '<em><b>Billing Period</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Billing Period</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BILLING_PERIOD
     * @model name="billingPeriod"
     * @generated
     * @ordered
     */
    public static final int BILLING_PERIOD_VALUE = 1;

    /**
     * The '<em><b>Daily</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Daily</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DAILY
     * @model name="daily"
     * @generated
     * @ordered
     */
    public static final int DAILY_VALUE = 2;

    /**
     * The '<em><b>Monthly</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Monthly</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MONTHLY
     * @model name="monthly"
     * @generated
     * @ordered
     */
    public static final int MONTHLY_VALUE = 3;

    /**
     * The '<em><b>Seasonal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Seasonal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SEASONAL
     * @model name="seasonal"
     * @generated
     * @ordered
     */
    public static final int SEASONAL_VALUE = 4;

    /**
     * The '<em><b>Weekly</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Weekly</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WEEKLY
     * @model name="weekly"
     * @generated
     * @ordered
     */
    public static final int WEEKLY_VALUE = 5;

    /**
     * The '<em><b>Specified Period</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Specified Period</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SPECIFIED_PERIOD
     * @model name="specifiedPeriod"
     * @generated
     * @ordered
     */
    public static final int SPECIFIED_PERIOD_VALUE = 6;

    /**
     * An array of all the '<em><b>Macro Period Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final MacroPeriodKind[] VALUES_ARRAY = new MacroPeriodKind[] { NONE, BILLING_PERIOD, DAILY, MONTHLY,
            SEASONAL, WEEKLY, SPECIFIED_PERIOD, };

    /**
     * A public read-only list of all the '<em><b>Macro Period Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< MacroPeriodKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Macro Period Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MacroPeriodKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            MacroPeriodKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Macro Period Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MacroPeriodKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            MacroPeriodKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Macro Period Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MacroPeriodKind get( int value ) {
        switch( value ) {
        case NONE_VALUE:
            return NONE;
        case BILLING_PERIOD_VALUE:
            return BILLING_PERIOD;
        case DAILY_VALUE:
            return DAILY;
        case MONTHLY_VALUE:
            return MONTHLY;
        case SEASONAL_VALUE:
            return SEASONAL;
        case WEEKLY_VALUE:
            return WEEKLY;
        case SPECIFIED_PERIOD_VALUE:
            return SPECIFIED_PERIOD;
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
    private MacroPeriodKind( int value, String name, String literal ) {
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

} //MacroPeriodKind
