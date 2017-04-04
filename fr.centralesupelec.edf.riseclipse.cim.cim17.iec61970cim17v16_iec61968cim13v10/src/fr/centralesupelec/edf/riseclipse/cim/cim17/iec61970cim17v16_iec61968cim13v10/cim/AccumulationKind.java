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
 * A representation of the literals of the enumeration '<em><b>Accumulation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccumulationKind()
 * @model
 * @generated
 */
public enum AccumulationKind implements Enumerator {
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
     * The '<em><b>Bulk Quantity</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BULK_QUANTITY_VALUE
     * @generated
     * @ordered
     */
    BULK_QUANTITY( 1, "bulkQuantity", "bulkQuantity" ),

    /**
     * The '<em><b>Continuous Cumulative</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONTINUOUS_CUMULATIVE_VALUE
     * @generated
     * @ordered
     */
    CONTINUOUS_CUMULATIVE( 2, "continuousCumulative", "continuousCumulative" ),

    /**
     * The '<em><b>Cumulative</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CUMULATIVE_VALUE
     * @generated
     * @ordered
     */
    CUMULATIVE( 3, "cumulative", "cumulative" ),

    /**
     * The '<em><b>Delta Data</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DELTA_DATA_VALUE
     * @generated
     * @ordered
     */
    DELTA_DATA( 4, "deltaData", "deltaData" ),

    /**
     * The '<em><b>Indicating</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INDICATING_VALUE
     * @generated
     * @ordered
     */
    INDICATING( 5, "indicating", "indicating" ),

    /**
     * The '<em><b>Summation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUMMATION_VALUE
     * @generated
     * @ordered
     */
    SUMMATION( 6, "summation", "summation" ),

    /**
     * The '<em><b>Time Delay</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TIME_DELAY_VALUE
     * @generated
     * @ordered
     */
    TIME_DELAY( 7, "timeDelay", "timeDelay" ),

    /**
     * The '<em><b>Instantaneous</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSTANTANEOUS_VALUE
     * @generated
     * @ordered
     */
    INSTANTANEOUS( 8, "instantaneous", "instantaneous" ),

    /**
     * The '<em><b>Latching Quantity</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LATCHING_QUANTITY_VALUE
     * @generated
     * @ordered
     */
    LATCHING_QUANTITY( 9, "latchingQuantity", "latchingQuantity" ),

    /**
     * The '<em><b>Bounded Quantity</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOUNDED_QUANTITY_VALUE
     * @generated
     * @ordered
     */
    BOUNDED_QUANTITY( 10, "boundedQuantity", "boundedQuantity" );

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
     * The '<em><b>Bulk Quantity</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bulk Quantity</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BULK_QUANTITY
     * @model name="bulkQuantity"
     * @generated
     * @ordered
     */
    public static final int BULK_QUANTITY_VALUE = 1;

    /**
     * The '<em><b>Continuous Cumulative</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Continuous Cumulative</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONTINUOUS_CUMULATIVE
     * @model name="continuousCumulative"
     * @generated
     * @ordered
     */
    public static final int CONTINUOUS_CUMULATIVE_VALUE = 2;

    /**
     * The '<em><b>Cumulative</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Cumulative</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CUMULATIVE
     * @model name="cumulative"
     * @generated
     * @ordered
     */
    public static final int CUMULATIVE_VALUE = 3;

    /**
     * The '<em><b>Delta Data</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Delta Data</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DELTA_DATA
     * @model name="deltaData"
     * @generated
     * @ordered
     */
    public static final int DELTA_DATA_VALUE = 4;

    /**
     * The '<em><b>Indicating</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Indicating</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INDICATING
     * @model name="indicating"
     * @generated
     * @ordered
     */
    public static final int INDICATING_VALUE = 5;

    /**
     * The '<em><b>Summation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Summation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUMMATION
     * @model name="summation"
     * @generated
     * @ordered
     */
    public static final int SUMMATION_VALUE = 6;

    /**
     * The '<em><b>Time Delay</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Time Delay</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TIME_DELAY
     * @model name="timeDelay"
     * @generated
     * @ordered
     */
    public static final int TIME_DELAY_VALUE = 7;

    /**
     * The '<em><b>Instantaneous</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Instantaneous</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INSTANTANEOUS
     * @model name="instantaneous"
     * @generated
     * @ordered
     */
    public static final int INSTANTANEOUS_VALUE = 8;

    /**
     * The '<em><b>Latching Quantity</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Latching Quantity</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LATCHING_QUANTITY
     * @model name="latchingQuantity"
     * @generated
     * @ordered
     */
    public static final int LATCHING_QUANTITY_VALUE = 9;

    /**
     * The '<em><b>Bounded Quantity</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bounded Quantity</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BOUNDED_QUANTITY
     * @model name="boundedQuantity"
     * @generated
     * @ordered
     */
    public static final int BOUNDED_QUANTITY_VALUE = 10;

    /**
     * An array of all the '<em><b>Accumulation Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AccumulationKind[] VALUES_ARRAY = new AccumulationKind[] { NONE, BULK_QUANTITY,
            CONTINUOUS_CUMULATIVE, CUMULATIVE, DELTA_DATA, INDICATING, SUMMATION, TIME_DELAY, INSTANTANEOUS,
            LATCHING_QUANTITY, BOUNDED_QUANTITY, };

    /**
     * A public read-only list of all the '<em><b>Accumulation Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< AccumulationKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Accumulation Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AccumulationKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AccumulationKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Accumulation Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AccumulationKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AccumulationKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Accumulation Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AccumulationKind get( int value ) {
        switch( value ) {
        case NONE_VALUE:
            return NONE;
        case BULK_QUANTITY_VALUE:
            return BULK_QUANTITY;
        case CONTINUOUS_CUMULATIVE_VALUE:
            return CONTINUOUS_CUMULATIVE;
        case CUMULATIVE_VALUE:
            return CUMULATIVE;
        case DELTA_DATA_VALUE:
            return DELTA_DATA;
        case INDICATING_VALUE:
            return INDICATING;
        case SUMMATION_VALUE:
            return SUMMATION;
        case TIME_DELAY_VALUE:
            return TIME_DELAY;
        case INSTANTANEOUS_VALUE:
            return INSTANTANEOUS;
        case LATCHING_QUANTITY_VALUE:
            return LATCHING_QUANTITY;
        case BOUNDED_QUANTITY_VALUE:
            return BOUNDED_QUANTITY;
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
    private AccumulationKind( int value, String name, String literal ) {
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

} //AccumulationKind
