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
 * A representation of the literals of the enumeration '<em><b>Usage Point Connected Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUsagePointConnectedKind()
 * @model
 * @generated
 */
public enum UsagePointConnectedKind implements Enumerator {
    /**
     * The '<em><b>Connected</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONNECTED_VALUE
     * @generated
     * @ordered
     */
    CONNECTED( 0, "connected", "connected" ),

    /**
     * The '<em><b>Physically Disconnected</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PHYSICALLY_DISCONNECTED_VALUE
     * @generated
     * @ordered
     */
    PHYSICALLY_DISCONNECTED( 1, "physicallyDisconnected", "physicallyDisconnected" ),

    /**
     * The '<em><b>Logically Disconnected</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOGICALLY_DISCONNECTED_VALUE
     * @generated
     * @ordered
     */
    LOGICALLY_DISCONNECTED( 2, "logicallyDisconnected", "logicallyDisconnected" );

    /**
     * The '<em><b>Connected</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Connected</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONNECTED
     * @model name="connected"
     * @generated
     * @ordered
     */
    public static final int CONNECTED_VALUE = 0;

    /**
     * The '<em><b>Physically Disconnected</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Physically Disconnected</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PHYSICALLY_DISCONNECTED
     * @model name="physicallyDisconnected"
     * @generated
     * @ordered
     */
    public static final int PHYSICALLY_DISCONNECTED_VALUE = 1;

    /**
     * The '<em><b>Logically Disconnected</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Logically Disconnected</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOGICALLY_DISCONNECTED
     * @model name="logicallyDisconnected"
     * @generated
     * @ordered
     */
    public static final int LOGICALLY_DISCONNECTED_VALUE = 2;

    /**
     * An array of all the '<em><b>Usage Point Connected Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final UsagePointConnectedKind[] VALUES_ARRAY = new UsagePointConnectedKind[] { CONNECTED,
            PHYSICALLY_DISCONNECTED, LOGICALLY_DISCONNECTED, };

    /**
     * A public read-only list of all the '<em><b>Usage Point Connected Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< UsagePointConnectedKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Usage Point Connected Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UsagePointConnectedKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            UsagePointConnectedKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Usage Point Connected Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UsagePointConnectedKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            UsagePointConnectedKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Usage Point Connected Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UsagePointConnectedKind get( int value ) {
        switch( value ) {
        case CONNECTED_VALUE:
            return CONNECTED;
        case PHYSICALLY_DISCONNECTED_VALUE:
            return PHYSICALLY_DISCONNECTED;
        case LOGICALLY_DISCONNECTED_VALUE:
            return LOGICALLY_DISCONNECTED;
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
    private UsagePointConnectedKind( int value, String name, String literal ) {
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

} //UsagePointConnectedKind
