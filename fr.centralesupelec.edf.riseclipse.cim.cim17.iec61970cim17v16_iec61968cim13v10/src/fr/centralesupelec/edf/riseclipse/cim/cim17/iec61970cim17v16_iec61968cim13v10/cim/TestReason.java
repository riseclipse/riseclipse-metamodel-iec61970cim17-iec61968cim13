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
 * A representation of the literals of the enumeration '<em><b>Test Reason</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestReason()
 * @model
 * @generated
 */
public enum TestReason implements Enumerator {
    /**
     * The '<em><b>Post Operation Fault</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POST_OPERATION_FAULT_VALUE
     * @generated
     * @ordered
     */
    POST_OPERATION_FAULT( 0, "postOperationFault", "postOperationFault" ),

    /**
     * The '<em><b>Post Repair</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POST_REPAIR_VALUE
     * @generated
     * @ordered
     */
    POST_REPAIR( 1, "postRepair", "postRepair" ),

    /**
     * The '<em><b>Post Oil Treatment</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POST_OIL_TREATMENT_VALUE
     * @generated
     * @ordered
     */
    POST_OIL_TREATMENT( 2, "postOilTreatment", "postOilTreatment" ),

    /**
     * The '<em><b>Routine</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROUTINE_VALUE
     * @generated
     * @ordered
     */
    ROUTINE( 3, "routine", "routine" );

    /**
     * The '<em><b>Post Operation Fault</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Post Operation Fault</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POST_OPERATION_FAULT
     * @model name="postOperationFault"
     * @generated
     * @ordered
     */
    public static final int POST_OPERATION_FAULT_VALUE = 0;

    /**
     * The '<em><b>Post Repair</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Post Repair</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POST_REPAIR
     * @model name="postRepair"
     * @generated
     * @ordered
     */
    public static final int POST_REPAIR_VALUE = 1;

    /**
     * The '<em><b>Post Oil Treatment</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Post Oil Treatment</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POST_OIL_TREATMENT
     * @model name="postOilTreatment"
     * @generated
     * @ordered
     */
    public static final int POST_OIL_TREATMENT_VALUE = 2;

    /**
     * The '<em><b>Routine</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Routine</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROUTINE
     * @model name="routine"
     * @generated
     * @ordered
     */
    public static final int ROUTINE_VALUE = 3;

    /**
     * An array of all the '<em><b>Test Reason</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TestReason[] VALUES_ARRAY = new TestReason[] { POST_OPERATION_FAULT, POST_REPAIR,
            POST_OIL_TREATMENT, ROUTINE, };

    /**
     * A public read-only list of all the '<em><b>Test Reason</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< TestReason > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Test Reason</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TestReason get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            TestReason result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Test Reason</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TestReason getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            TestReason result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Test Reason</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TestReason get( int value ) {
        switch( value ) {
        case POST_OPERATION_FAULT_VALUE:
            return POST_OPERATION_FAULT;
        case POST_REPAIR_VALUE:
            return POST_REPAIR;
        case POST_OIL_TREATMENT_VALUE:
            return POST_OIL_TREATMENT;
        case ROUTINE_VALUE:
            return ROUTINE;
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
    private TestReason( int value, String name, String literal ) {
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

} //TestReason
