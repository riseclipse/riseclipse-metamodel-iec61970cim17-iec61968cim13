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
 * A representation of the literals of the enumeration '<em><b>Transformer Application Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerApplicationKind()
 * @model
 * @generated
 */
public enum TransformerApplicationKind implements Enumerator {
    /**
     * The '<em><b>Transmission Bus To Bus</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRANSMISSION_BUS_TO_BUS_VALUE
     * @generated
     * @ordered
     */
    TRANSMISSION_BUS_TO_BUS( 0, "transmissionBusToBus", "transmissionBusToBus" ),

    /**
     * The '<em><b>Transmission Bus To Distribution</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRANSMISSION_BUS_TO_DISTRIBUTION_VALUE
     * @generated
     * @ordered
     */
    TRANSMISSION_BUS_TO_DISTRIBUTION( 1, "transmissionBusToDistribution", "transmissionBusToDistribution" ),

    /**
     * The '<em><b>Generator Step Up</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GENERATOR_STEP_UP_VALUE
     * @generated
     * @ordered
     */
    GENERATOR_STEP_UP( 2, "generatorStepUp", "generatorStepUp" ),

    /**
     * The '<em><b>Distribution</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISTRIBUTION_VALUE
     * @generated
     * @ordered
     */
    DISTRIBUTION( 3, "distribution", "distribution" );

    /**
     * The '<em><b>Transmission Bus To Bus</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Transmission Bus To Bus</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRANSMISSION_BUS_TO_BUS
     * @model name="transmissionBusToBus"
     * @generated
     * @ordered
     */
    public static final int TRANSMISSION_BUS_TO_BUS_VALUE = 0;

    /**
     * The '<em><b>Transmission Bus To Distribution</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Transmission Bus To Distribution</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRANSMISSION_BUS_TO_DISTRIBUTION
     * @model name="transmissionBusToDistribution"
     * @generated
     * @ordered
     */
    public static final int TRANSMISSION_BUS_TO_DISTRIBUTION_VALUE = 1;

    /**
     * The '<em><b>Generator Step Up</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Generator Step Up</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GENERATOR_STEP_UP
     * @model name="generatorStepUp"
     * @generated
     * @ordered
     */
    public static final int GENERATOR_STEP_UP_VALUE = 2;

    /**
     * The '<em><b>Distribution</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Distribution</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISTRIBUTION
     * @model name="distribution"
     * @generated
     * @ordered
     */
    public static final int DISTRIBUTION_VALUE = 3;

    /**
     * An array of all the '<em><b>Transformer Application Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TransformerApplicationKind[] VALUES_ARRAY = new TransformerApplicationKind[] {
            TRANSMISSION_BUS_TO_BUS, TRANSMISSION_BUS_TO_DISTRIBUTION, GENERATOR_STEP_UP, DISTRIBUTION, };

    /**
     * A public read-only list of all the '<em><b>Transformer Application Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< TransformerApplicationKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Transformer Application Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TransformerApplicationKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            TransformerApplicationKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Transformer Application Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TransformerApplicationKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            TransformerApplicationKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Transformer Application Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TransformerApplicationKind get( int value ) {
        switch( value ) {
        case TRANSMISSION_BUS_TO_BUS_VALUE:
            return TRANSMISSION_BUS_TO_BUS;
        case TRANSMISSION_BUS_TO_DISTRIBUTION_VALUE:
            return TRANSMISSION_BUS_TO_DISTRIBUTION;
        case GENERATOR_STEP_UP_VALUE:
            return GENERATOR_STEP_UP;
        case DISTRIBUTION_VALUE:
            return DISTRIBUTION;
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
    private TransformerApplicationKind( int value, String name, String literal ) {
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

} //TransformerApplicationKind
