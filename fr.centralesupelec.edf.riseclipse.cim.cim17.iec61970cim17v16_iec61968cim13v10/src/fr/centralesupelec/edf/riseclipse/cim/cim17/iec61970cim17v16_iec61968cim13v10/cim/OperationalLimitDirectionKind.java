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
 * A representation of the literals of the enumeration '<em><b>Operational Limit Direction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperationalLimitDirectionKind()
 * @model
 * @generated
 */
public enum OperationalLimitDirectionKind implements Enumerator {
    /**
     * The '<em><b>High</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HIGH_VALUE
     * @generated
     * @ordered
     */
    HIGH( 0, "high", "high" ),

    /**
     * The '<em><b>Low</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOW_VALUE
     * @generated
     * @ordered
     */
    LOW( 1, "low", "low" ),

    /**
     * The '<em><b>Absolute Value</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ABSOLUTE_VALUE_VALUE
     * @generated
     * @ordered
     */
    ABSOLUTE_VALUE( 2, "absoluteValue", "absoluteValue" );

    /**
     * The '<em><b>High</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>High</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HIGH
     * @model name="high"
     * @generated
     * @ordered
     */
    public static final int HIGH_VALUE = 0;

    /**
     * The '<em><b>Low</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Low</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOW
     * @model name="low"
     * @generated
     * @ordered
     */
    public static final int LOW_VALUE = 1;

    /**
     * The '<em><b>Absolute Value</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Absolute Value</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ABSOLUTE_VALUE
     * @model name="absoluteValue"
     * @generated
     * @ordered
     */
    public static final int ABSOLUTE_VALUE_VALUE = 2;

    /**
     * An array of all the '<em><b>Operational Limit Direction Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OperationalLimitDirectionKind[] VALUES_ARRAY = new OperationalLimitDirectionKind[] { HIGH, LOW,
            ABSOLUTE_VALUE, };

    /**
     * A public read-only list of all the '<em><b>Operational Limit Direction Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< OperationalLimitDirectionKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Operational Limit Direction Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OperationalLimitDirectionKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OperationalLimitDirectionKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Operational Limit Direction Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OperationalLimitDirectionKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OperationalLimitDirectionKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Operational Limit Direction Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OperationalLimitDirectionKind get( int value ) {
        switch( value ) {
        case HIGH_VALUE:
            return HIGH;
        case LOW_VALUE:
            return LOW;
        case ABSOLUTE_VALUE_VALUE:
            return ABSOLUTE_VALUE;
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
    private OperationalLimitDirectionKind( int value, String name, String literal ) {
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

} //OperationalLimitDirectionKind
