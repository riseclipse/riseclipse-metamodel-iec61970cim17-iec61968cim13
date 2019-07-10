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
 * A representation of the literals of the enumeration '<em><b>Failure Isolation Method Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFailureIsolationMethodKind()
 * @model
 * @generated
 */
public enum FailureIsolationMethodKind implements Enumerator {
    /**
     * The '<em><b>Breaker Operation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BREAKER_OPERATION_VALUE
     * @generated
     * @ordered
     */
    BREAKER_OPERATION( 0, "breakerOperation", "breakerOperation" ),

    /**
     * The '<em><b>Fuse</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FUSE_VALUE
     * @generated
     * @ordered
     */
    FUSE( 1, "fuse", "fuse" ),

    /**
     * The '<em><b>Burned In The Clear</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BURNED_IN_THE_CLEAR_VALUE
     * @generated
     * @ordered
     */
    BURNED_IN_THE_CLEAR( 2, "burnedInTheClear", "burnedInTheClear" ),

    /**
     * The '<em><b>Manually Isolated</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MANUALLY_ISOLATED_VALUE
     * @generated
     * @ordered
     */
    MANUALLY_ISOLATED( 3, "manuallyIsolated", "manuallyIsolated" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 4, "other", "other" );

    /**
     * The '<em><b>Breaker Operation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Breaker Operation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BREAKER_OPERATION
     * @model name="breakerOperation"
     * @generated
     * @ordered
     */
    public static final int BREAKER_OPERATION_VALUE = 0;

    /**
     * The '<em><b>Fuse</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fuse</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FUSE
     * @model name="fuse"
     * @generated
     * @ordered
     */
    public static final int FUSE_VALUE = 1;

    /**
     * The '<em><b>Burned In The Clear</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Burned In The Clear</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BURNED_IN_THE_CLEAR
     * @model name="burnedInTheClear"
     * @generated
     * @ordered
     */
    public static final int BURNED_IN_THE_CLEAR_VALUE = 2;

    /**
     * The '<em><b>Manually Isolated</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Manually Isolated</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MANUALLY_ISOLATED
     * @model name="manuallyIsolated"
     * @generated
     * @ordered
     */
    public static final int MANUALLY_ISOLATED_VALUE = 3;

    /**
     * The '<em><b>Other</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OTHER
     * @model name="other"
     * @generated
     * @ordered
     */
    public static final int OTHER_VALUE = 4;

    /**
     * An array of all the '<em><b>Failure Isolation Method Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final FailureIsolationMethodKind[] VALUES_ARRAY = new FailureIsolationMethodKind[] {
            BREAKER_OPERATION, FUSE, BURNED_IN_THE_CLEAR, MANUALLY_ISOLATED, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Failure Isolation Method Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< FailureIsolationMethodKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Failure Isolation Method Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FailureIsolationMethodKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            FailureIsolationMethodKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Failure Isolation Method Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FailureIsolationMethodKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            FailureIsolationMethodKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Failure Isolation Method Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FailureIsolationMethodKind get( int value ) {
        switch( value ) {
        case BREAKER_OPERATION_VALUE:
            return BREAKER_OPERATION;
        case FUSE_VALUE:
            return FUSE;
        case BURNED_IN_THE_CLEAR_VALUE:
            return BURNED_IN_THE_CLEAR;
        case MANUALLY_ISOLATED_VALUE:
            return MANUALLY_ISOLATED;
        case OTHER_VALUE:
            return OTHER;
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
    private FailureIsolationMethodKind( int value, String name, String literal ) {
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

} //FailureIsolationMethodKind
