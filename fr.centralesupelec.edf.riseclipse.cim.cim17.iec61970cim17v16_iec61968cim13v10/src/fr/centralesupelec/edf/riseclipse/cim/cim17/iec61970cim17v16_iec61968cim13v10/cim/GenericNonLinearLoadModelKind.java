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
 * A representation of the literals of the enumeration '<em><b>Generic Non Linear Load Model Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGenericNonLinearLoadModelKind()
 * @model
 * @generated
 */
public enum GenericNonLinearLoadModelKind implements Enumerator {
    /**
     * The '<em><b>Exponential Recovery</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXPONENTIAL_RECOVERY_VALUE
     * @generated
     * @ordered
     */
    EXPONENTIAL_RECOVERY( 0, "exponentialRecovery", "exponentialRecovery" ),

    /**
     * The '<em><b>Load Adaptive</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOAD_ADAPTIVE_VALUE
     * @generated
     * @ordered
     */
    LOAD_ADAPTIVE( 1, "loadAdaptive", "loadAdaptive" );

    /**
     * The '<em><b>Exponential Recovery</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Exponential Recovery</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXPONENTIAL_RECOVERY
     * @model name="exponentialRecovery"
     * @generated
     * @ordered
     */
    public static final int EXPONENTIAL_RECOVERY_VALUE = 0;

    /**
     * The '<em><b>Load Adaptive</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Load Adaptive</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOAD_ADAPTIVE
     * @model name="loadAdaptive"
     * @generated
     * @ordered
     */
    public static final int LOAD_ADAPTIVE_VALUE = 1;

    /**
     * An array of all the '<em><b>Generic Non Linear Load Model Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final GenericNonLinearLoadModelKind[] VALUES_ARRAY = new GenericNonLinearLoadModelKind[] {
            EXPONENTIAL_RECOVERY, LOAD_ADAPTIVE, };

    /**
     * A public read-only list of all the '<em><b>Generic Non Linear Load Model Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< GenericNonLinearLoadModelKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Generic Non Linear Load Model Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static GenericNonLinearLoadModelKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            GenericNonLinearLoadModelKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Generic Non Linear Load Model Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static GenericNonLinearLoadModelKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            GenericNonLinearLoadModelKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Generic Non Linear Load Model Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static GenericNonLinearLoadModelKind get( int value ) {
        switch( value ) {
        case EXPONENTIAL_RECOVERY_VALUE:
            return EXPONENTIAL_RECOVERY;
        case LOAD_ADAPTIVE_VALUE:
            return LOAD_ADAPTIVE;
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
    private GenericNonLinearLoadModelKind( int value, String name, String literal ) {
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

} //GenericNonLinearLoadModelKind
