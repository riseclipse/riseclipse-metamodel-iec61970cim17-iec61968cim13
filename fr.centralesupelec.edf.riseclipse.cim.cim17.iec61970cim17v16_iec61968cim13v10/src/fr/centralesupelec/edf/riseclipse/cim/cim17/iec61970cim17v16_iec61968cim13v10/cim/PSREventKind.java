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
 * A representation of the literals of the enumeration '<em><b>PSR Event Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPSREventKind()
 * @model
 * @generated
 */
public enum PSREventKind implements Enumerator {
    /**
     * The '<em><b>In Service</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IN_SERVICE_VALUE
     * @generated
     * @ordered
     */
    IN_SERVICE( 0, "inService", "inService" ),

    /**
     * The '<em><b>Out Of Service</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OUT_OF_SERVICE_VALUE
     * @generated
     * @ordered
     */
    OUT_OF_SERVICE( 1, "outOfService", "outOfService" ),

    /**
     * The '<em><b>Pending Add</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PENDING_ADD_VALUE
     * @generated
     * @ordered
     */
    PENDING_ADD( 2, "pendingAdd", "pendingAdd" ),

    /**
     * The '<em><b>Pending Remove</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PENDING_REMOVE_VALUE
     * @generated
     * @ordered
     */
    PENDING_REMOVE( 3, "pendingRemove", "pendingRemove" ),

    /**
     * The '<em><b>Pending Replace</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PENDING_REPLACE_VALUE
     * @generated
     * @ordered
     */
    PENDING_REPLACE( 4, "pendingReplace", "pendingReplace" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 5, "other", "other" ),

    /**
     * The '<em><b>Unknown</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNKNOWN_VALUE
     * @generated
     * @ordered
     */
    UNKNOWN( 6, "unknown", "unknown" );

    /**
     * The '<em><b>In Service</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>In Service</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IN_SERVICE
     * @model name="inService"
     * @generated
     * @ordered
     */
    public static final int IN_SERVICE_VALUE = 0;

    /**
     * The '<em><b>Out Of Service</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Out Of Service</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OUT_OF_SERVICE
     * @model name="outOfService"
     * @generated
     * @ordered
     */
    public static final int OUT_OF_SERVICE_VALUE = 1;

    /**
     * The '<em><b>Pending Add</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pending Add</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PENDING_ADD
     * @model name="pendingAdd"
     * @generated
     * @ordered
     */
    public static final int PENDING_ADD_VALUE = 2;

    /**
     * The '<em><b>Pending Remove</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pending Remove</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PENDING_REMOVE
     * @model name="pendingRemove"
     * @generated
     * @ordered
     */
    public static final int PENDING_REMOVE_VALUE = 3;

    /**
     * The '<em><b>Pending Replace</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pending Replace</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PENDING_REPLACE
     * @model name="pendingReplace"
     * @generated
     * @ordered
     */
    public static final int PENDING_REPLACE_VALUE = 4;

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
    public static final int OTHER_VALUE = 5;

    /**
     * The '<em><b>Unknown</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNKNOWN
     * @model name="unknown"
     * @generated
     * @ordered
     */
    public static final int UNKNOWN_VALUE = 6;

    /**
     * An array of all the '<em><b>PSR Event Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final PSREventKind[] VALUES_ARRAY = new PSREventKind[] { IN_SERVICE, OUT_OF_SERVICE, PENDING_ADD,
            PENDING_REMOVE, PENDING_REPLACE, OTHER, UNKNOWN, };

    /**
     * A public read-only list of all the '<em><b>PSR Event Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< PSREventKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>PSR Event Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PSREventKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            PSREventKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>PSR Event Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PSREventKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            PSREventKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>PSR Event Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PSREventKind get( int value ) {
        switch( value ) {
        case IN_SERVICE_VALUE:
            return IN_SERVICE;
        case OUT_OF_SERVICE_VALUE:
            return OUT_OF_SERVICE;
        case PENDING_ADD_VALUE:
            return PENDING_ADD;
        case PENDING_REMOVE_VALUE:
            return PENDING_REMOVE;
        case PENDING_REPLACE_VALUE:
            return PENDING_REPLACE;
        case OTHER_VALUE:
            return OTHER;
        case UNKNOWN_VALUE:
            return UNKNOWN;
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
    private PSREventKind( int value, String name, String literal ) {
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

} //PSREventKind
