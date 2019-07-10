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
 * A representation of the literals of the enumeration '<em><b>ICCP Point Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPPointKind()
 * @model
 * @generated
 */
public enum ICCPPointKind implements Enumerator {
    /**
     * The '<em><b>Discrete</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISCRETE_VALUE
     * @generated
     * @ordered
     */
    DISCRETE( 0, "discrete", "discrete" ),

    /**
     * The '<em><b>Real</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REAL_VALUE
     * @generated
     * @ordered
     */
    REAL( 1, "real", "real" ),

    /**
     * The '<em><b>State</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STATE_VALUE
     * @generated
     * @ordered
     */
    STATE( 2, "state", "state" ),

    /**
     * The '<em><b>State Supplemental</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STATE_SUPPLEMENTAL_VALUE
     * @generated
     * @ordered
     */
    STATE_SUPPLEMENTAL( 3, "stateSupplemental", "stateSupplemental" ),

    /**
     * The '<em><b>Single Protection Event</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SINGLE_PROTECTION_EVENT_VALUE
     * @generated
     * @ordered
     */
    SINGLE_PROTECTION_EVENT( 4, "singleProtectionEvent", "singleProtectionEvent" ),

    /**
     * The '<em><b>Packed Protection Event</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PACKED_PROTECTION_EVENT_VALUE
     * @generated
     * @ordered
     */
    PACKED_PROTECTION_EVENT( 5, "packedProtectionEvent", "packedProtectionEvent" );

    /**
     * The '<em><b>Discrete</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Discrete</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISCRETE
     * @model name="discrete"
     * @generated
     * @ordered
     */
    public static final int DISCRETE_VALUE = 0;

    /**
     * The '<em><b>Real</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Real</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REAL
     * @model name="real"
     * @generated
     * @ordered
     */
    public static final int REAL_VALUE = 1;

    /**
     * The '<em><b>State</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>State</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STATE
     * @model name="state"
     * @generated
     * @ordered
     */
    public static final int STATE_VALUE = 2;

    /**
     * The '<em><b>State Supplemental</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>State Supplemental</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STATE_SUPPLEMENTAL
     * @model name="stateSupplemental"
     * @generated
     * @ordered
     */
    public static final int STATE_SUPPLEMENTAL_VALUE = 3;

    /**
     * The '<em><b>Single Protection Event</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Single Protection Event</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SINGLE_PROTECTION_EVENT
     * @model name="singleProtectionEvent"
     * @generated
     * @ordered
     */
    public static final int SINGLE_PROTECTION_EVENT_VALUE = 4;

    /**
     * The '<em><b>Packed Protection Event</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Packed Protection Event</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PACKED_PROTECTION_EVENT
     * @model name="packedProtectionEvent"
     * @generated
     * @ordered
     */
    public static final int PACKED_PROTECTION_EVENT_VALUE = 5;

    /**
     * An array of all the '<em><b>ICCP Point Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ICCPPointKind[] VALUES_ARRAY = new ICCPPointKind[] { DISCRETE, REAL, STATE, STATE_SUPPLEMENTAL,
            SINGLE_PROTECTION_EVENT, PACKED_PROTECTION_EVENT, };

    /**
     * A public read-only list of all the '<em><b>ICCP Point Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ICCPPointKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>ICCP Point Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ICCPPointKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ICCPPointKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ICCP Point Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ICCPPointKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ICCPPointKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ICCP Point Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ICCPPointKind get( int value ) {
        switch( value ) {
        case DISCRETE_VALUE:
            return DISCRETE;
        case REAL_VALUE:
            return REAL;
        case STATE_VALUE:
            return STATE;
        case STATE_SUPPLEMENTAL_VALUE:
            return STATE_SUPPLEMENTAL;
        case SINGLE_PROTECTION_EVENT_VALUE:
            return SINGLE_PROTECTION_EVENT;
        case PACKED_PROTECTION_EVENT_VALUE:
            return PACKED_PROTECTION_EVENT;
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
    private ICCPPointKind( int value, String name, String literal ) {
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

} //ICCPPointKind
