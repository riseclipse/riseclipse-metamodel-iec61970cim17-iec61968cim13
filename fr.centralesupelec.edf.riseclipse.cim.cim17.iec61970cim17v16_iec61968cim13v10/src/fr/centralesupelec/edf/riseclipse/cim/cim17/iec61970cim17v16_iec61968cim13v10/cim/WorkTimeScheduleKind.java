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
 * A representation of the literals of the enumeration '<em><b>Work Time Schedule Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWorkTimeScheduleKind()
 * @model
 * @generated
 */
public enum WorkTimeScheduleKind implements Enumerator {
    /**
     * The '<em><b>Estimate</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ESTIMATE_VALUE
     * @generated
     * @ordered
     */
    ESTIMATE( 0, "estimate", "estimate" ),

    /**
     * The '<em><b>Request</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REQUEST_VALUE
     * @generated
     * @ordered
     */
    REQUEST( 1, "request", "request" ),

    /**
     * The '<em><b>Actual</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ACTUAL_VALUE
     * @generated
     * @ordered
     */
    ACTUAL( 2, "actual", "actual" ),

    /**
     * The '<em><b>Earliest</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EARLIEST_VALUE
     * @generated
     * @ordered
     */
    EARLIEST( 3, "earliest", "earliest" ),

    /**
     * The '<em><b>Latest</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LATEST_VALUE
     * @generated
     * @ordered
     */
    LATEST( 4, "latest", "latest" ),

    /**
     * The '<em><b>Immediate</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMMEDIATE_VALUE
     * @generated
     * @ordered
     */
    IMMEDIATE( 5, "immediate", "immediate" );

    /**
     * The '<em><b>Estimate</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Estimate</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ESTIMATE
     * @model name="estimate"
     * @generated
     * @ordered
     */
    public static final int ESTIMATE_VALUE = 0;

    /**
     * The '<em><b>Request</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Request</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REQUEST
     * @model name="request"
     * @generated
     * @ordered
     */
    public static final int REQUEST_VALUE = 1;

    /**
     * The '<em><b>Actual</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Actual</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ACTUAL
     * @model name="actual"
     * @generated
     * @ordered
     */
    public static final int ACTUAL_VALUE = 2;

    /**
     * The '<em><b>Earliest</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Earliest</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EARLIEST
     * @model name="earliest"
     * @generated
     * @ordered
     */
    public static final int EARLIEST_VALUE = 3;

    /**
     * The '<em><b>Latest</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Latest</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LATEST
     * @model name="latest"
     * @generated
     * @ordered
     */
    public static final int LATEST_VALUE = 4;

    /**
     * The '<em><b>Immediate</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Immediate</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IMMEDIATE
     * @model name="immediate"
     * @generated
     * @ordered
     */
    public static final int IMMEDIATE_VALUE = 5;

    /**
     * An array of all the '<em><b>Work Time Schedule Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WorkTimeScheduleKind[] VALUES_ARRAY = new WorkTimeScheduleKind[] { ESTIMATE, REQUEST, ACTUAL,
            EARLIEST, LATEST, IMMEDIATE, };

    /**
     * A public read-only list of all the '<em><b>Work Time Schedule Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< WorkTimeScheduleKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Work Time Schedule Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WorkTimeScheduleKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WorkTimeScheduleKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Work Time Schedule Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WorkTimeScheduleKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WorkTimeScheduleKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Work Time Schedule Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WorkTimeScheduleKind get( int value ) {
        switch( value ) {
        case ESTIMATE_VALUE:
            return ESTIMATE;
        case REQUEST_VALUE:
            return REQUEST;
        case ACTUAL_VALUE:
            return ACTUAL;
        case EARLIEST_VALUE:
            return EARLIEST;
        case LATEST_VALUE:
            return LATEST;
        case IMMEDIATE_VALUE:
            return IMMEDIATE;
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
    private WorkTimeScheduleKind( int value, String name, String literal ) {
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

} //WorkTimeScheduleKind
