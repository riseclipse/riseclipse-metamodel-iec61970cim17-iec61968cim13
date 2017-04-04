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
 * A representation of the literals of the enumeration '<em><b>Short Circuit Rotor Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShortCircuitRotorKind()
 * @model
 * @generated
 */
public enum ShortCircuitRotorKind implements Enumerator {
    /**
     * The '<em><b>Salient Pole1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SALIENT_POLE1_VALUE
     * @generated
     * @ordered
     */
    SALIENT_POLE1( 0, "salientPole1", "salientPole1" ),

    /**
     * The '<em><b>Salient Pole2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SALIENT_POLE2_VALUE
     * @generated
     * @ordered
     */
    SALIENT_POLE2( 1, "salientPole2", "salientPole2" ),

    /**
     * The '<em><b>Turbo Series1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TURBO_SERIES1_VALUE
     * @generated
     * @ordered
     */
    TURBO_SERIES1( 2, "turboSeries1", "turboSeries1" ),

    /**
     * The '<em><b>Turbo Series2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TURBO_SERIES2_VALUE
     * @generated
     * @ordered
     */
    TURBO_SERIES2( 3, "turboSeries2", "turboSeries2" );

    /**
     * The '<em><b>Salient Pole1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Salient Pole1</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SALIENT_POLE1
     * @model name="salientPole1"
     * @generated
     * @ordered
     */
    public static final int SALIENT_POLE1_VALUE = 0;

    /**
     * The '<em><b>Salient Pole2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Salient Pole2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SALIENT_POLE2
     * @model name="salientPole2"
     * @generated
     * @ordered
     */
    public static final int SALIENT_POLE2_VALUE = 1;

    /**
     * The '<em><b>Turbo Series1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Turbo Series1</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TURBO_SERIES1
     * @model name="turboSeries1"
     * @generated
     * @ordered
     */
    public static final int TURBO_SERIES1_VALUE = 2;

    /**
     * The '<em><b>Turbo Series2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Turbo Series2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TURBO_SERIES2
     * @model name="turboSeries2"
     * @generated
     * @ordered
     */
    public static final int TURBO_SERIES2_VALUE = 3;

    /**
     * An array of all the '<em><b>Short Circuit Rotor Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ShortCircuitRotorKind[] VALUES_ARRAY = new ShortCircuitRotorKind[] { SALIENT_POLE1,
            SALIENT_POLE2, TURBO_SERIES1, TURBO_SERIES2, };

    /**
     * A public read-only list of all the '<em><b>Short Circuit Rotor Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ShortCircuitRotorKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Short Circuit Rotor Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ShortCircuitRotorKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ShortCircuitRotorKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Short Circuit Rotor Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ShortCircuitRotorKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ShortCircuitRotorKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Short Circuit Rotor Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ShortCircuitRotorKind get( int value ) {
        switch( value ) {
        case SALIENT_POLE1_VALUE:
            return SALIENT_POLE1;
        case SALIENT_POLE2_VALUE:
            return SALIENT_POLE2;
        case TURBO_SERIES1_VALUE:
            return TURBO_SERIES1;
        case TURBO_SERIES2_VALUE:
            return TURBO_SERIES2;
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
    private ShortCircuitRotorKind( int value, String name, String literal ) {
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

} //ShortCircuitRotorKind
