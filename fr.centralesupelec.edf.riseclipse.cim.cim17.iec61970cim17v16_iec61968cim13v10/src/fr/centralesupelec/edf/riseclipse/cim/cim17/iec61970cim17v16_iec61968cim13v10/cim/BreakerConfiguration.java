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
 * A representation of the literals of the enumeration '<em><b>Breaker Configuration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBreakerConfiguration()
 * @model
 * @generated
 */
public enum BreakerConfiguration implements Enumerator {
    /**
     * The '<em><b>Single Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SINGLE_BREAKER_VALUE
     * @generated
     * @ordered
     */
    SINGLE_BREAKER( 0, "singleBreaker", "singleBreaker" ),

    /**
     * The '<em><b>Breaker And AHalf</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BREAKER_AND_AHALF_VALUE
     * @generated
     * @ordered
     */
    BREAKER_AND_AHALF( 1, "breakerAndAHalf", "breakerAndAHalf" ),

    /**
     * The '<em><b>Double Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_BREAKER_VALUE
     * @generated
     * @ordered
     */
    DOUBLE_BREAKER( 2, "doubleBreaker", "doubleBreaker" ),

    /**
     * The '<em><b>No Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NO_BREAKER_VALUE
     * @generated
     * @ordered
     */
    NO_BREAKER( 3, "noBreaker", "noBreaker" );

    /**
     * The '<em><b>Single Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Single Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SINGLE_BREAKER
     * @model name="singleBreaker"
     * @generated
     * @ordered
     */
    public static final int SINGLE_BREAKER_VALUE = 0;

    /**
     * The '<em><b>Breaker And AHalf</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Breaker And AHalf</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BREAKER_AND_AHALF
     * @model name="breakerAndAHalf"
     * @generated
     * @ordered
     */
    public static final int BREAKER_AND_AHALF_VALUE = 1;

    /**
     * The '<em><b>Double Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Double Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DOUBLE_BREAKER
     * @model name="doubleBreaker"
     * @generated
     * @ordered
     */
    public static final int DOUBLE_BREAKER_VALUE = 2;

    /**
     * The '<em><b>No Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>No Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NO_BREAKER
     * @model name="noBreaker"
     * @generated
     * @ordered
     */
    public static final int NO_BREAKER_VALUE = 3;

    /**
     * An array of all the '<em><b>Breaker Configuration</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final BreakerConfiguration[] VALUES_ARRAY = new BreakerConfiguration[] { SINGLE_BREAKER,
            BREAKER_AND_AHALF, DOUBLE_BREAKER, NO_BREAKER, };

    /**
     * A public read-only list of all the '<em><b>Breaker Configuration</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< BreakerConfiguration > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Breaker Configuration</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerConfiguration get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BreakerConfiguration result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Breaker Configuration</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerConfiguration getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BreakerConfiguration result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Breaker Configuration</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerConfiguration get( int value ) {
        switch( value ) {
        case SINGLE_BREAKER_VALUE:
            return SINGLE_BREAKER;
        case BREAKER_AND_AHALF_VALUE:
            return BREAKER_AND_AHALF;
        case DOUBLE_BREAKER_VALUE:
            return DOUBLE_BREAKER;
        case NO_BREAKER_VALUE:
            return NO_BREAKER;
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
    private BreakerConfiguration( int value, String name, String literal ) {
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

} //BreakerConfiguration
