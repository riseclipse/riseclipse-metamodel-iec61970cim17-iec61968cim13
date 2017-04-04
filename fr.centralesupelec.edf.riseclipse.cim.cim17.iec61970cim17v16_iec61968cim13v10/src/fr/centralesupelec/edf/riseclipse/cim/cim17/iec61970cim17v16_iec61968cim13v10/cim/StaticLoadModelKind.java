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
 * A representation of the literals of the enumeration '<em><b>Static Load Model Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStaticLoadModelKind()
 * @model
 * @generated
 */
public enum StaticLoadModelKind implements Enumerator {
    /**
     * The '<em><b>Exponential</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXPONENTIAL_VALUE
     * @generated
     * @ordered
     */
    EXPONENTIAL( 0, "exponential", "exponential" ),

    /**
     * The '<em><b>ZIP1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ZIP1_VALUE
     * @generated
     * @ordered
     */
    ZIP1( 1, "zIP1", "zIP1" ),

    /**
     * The '<em><b>ZIP2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ZIP2_VALUE
     * @generated
     * @ordered
     */
    ZIP2( 2, "zIP2", "zIP2" ),

    /**
     * The '<em><b>Constant Z</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONSTANT_Z_VALUE
     * @generated
     * @ordered
     */
    CONSTANT_Z( 3, "constantZ", "constantZ" );

    /**
     * The '<em><b>Exponential</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Exponential</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXPONENTIAL
     * @model name="exponential"
     * @generated
     * @ordered
     */
    public static final int EXPONENTIAL_VALUE = 0;

    /**
     * The '<em><b>ZIP1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ZIP1</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ZIP1
     * @model name="zIP1"
     * @generated
     * @ordered
     */
    public static final int ZIP1_VALUE = 1;

    /**
     * The '<em><b>ZIP2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ZIP2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ZIP2
     * @model name="zIP2"
     * @generated
     * @ordered
     */
    public static final int ZIP2_VALUE = 2;

    /**
     * The '<em><b>Constant Z</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Constant Z</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONSTANT_Z
     * @model name="constantZ"
     * @generated
     * @ordered
     */
    public static final int CONSTANT_Z_VALUE = 3;

    /**
     * An array of all the '<em><b>Static Load Model Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final StaticLoadModelKind[] VALUES_ARRAY = new StaticLoadModelKind[] { EXPONENTIAL, ZIP1, ZIP2,
            CONSTANT_Z, };

    /**
     * A public read-only list of all the '<em><b>Static Load Model Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< StaticLoadModelKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Static Load Model Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static StaticLoadModelKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            StaticLoadModelKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Static Load Model Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static StaticLoadModelKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            StaticLoadModelKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Static Load Model Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static StaticLoadModelKind get( int value ) {
        switch( value ) {
        case EXPONENTIAL_VALUE:
            return EXPONENTIAL;
        case ZIP1_VALUE:
            return ZIP1;
        case ZIP2_VALUE:
            return ZIP2;
        case CONSTANT_Z_VALUE:
            return CONSTANT_Z;
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
    private StaticLoadModelKind( int value, String name, String literal ) {
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

} //StaticLoadModelKind
