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
 * A representation of the literals of the enumeration '<em><b>Droop Signal Feedback Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDroopSignalFeedbackKind()
 * @model
 * @generated
 */
public enum DroopSignalFeedbackKind implements Enumerator {
    /**
     * The '<em><b>Electrical Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ELECTRICAL_POWER_VALUE
     * @generated
     * @ordered
     */
    ELECTRICAL_POWER( 0, "electricalPower", "electricalPower" ),

    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE( 1, "none", "none" ),

    /**
     * The '<em><b>Fuel Valve Stroke</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FUEL_VALVE_STROKE_VALUE
     * @generated
     * @ordered
     */
    FUEL_VALVE_STROKE( 2, "fuelValveStroke", "fuelValveStroke" ),

    /**
     * The '<em><b>Governor Output</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GOVERNOR_OUTPUT_VALUE
     * @generated
     * @ordered
     */
    GOVERNOR_OUTPUT( 3, "governorOutput", "governorOutput" );

    /**
     * The '<em><b>Electrical Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Electrical Power</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ELECTRICAL_POWER
     * @model name="electricalPower"
     * @generated
     * @ordered
     */
    public static final int ELECTRICAL_POWER_VALUE = 0;

    /**
     * The '<em><b>None</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NONE
     * @model name="none"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 1;

    /**
     * The '<em><b>Fuel Valve Stroke</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fuel Valve Stroke</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FUEL_VALVE_STROKE
     * @model name="fuelValveStroke"
     * @generated
     * @ordered
     */
    public static final int FUEL_VALVE_STROKE_VALUE = 2;

    /**
     * The '<em><b>Governor Output</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Governor Output</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GOVERNOR_OUTPUT
     * @model name="governorOutput"
     * @generated
     * @ordered
     */
    public static final int GOVERNOR_OUTPUT_VALUE = 3;

    /**
     * An array of all the '<em><b>Droop Signal Feedback Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DroopSignalFeedbackKind[] VALUES_ARRAY = new DroopSignalFeedbackKind[] { ELECTRICAL_POWER,
            NONE, FUEL_VALVE_STROKE, GOVERNOR_OUTPUT, };

    /**
     * A public read-only list of all the '<em><b>Droop Signal Feedback Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< DroopSignalFeedbackKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Droop Signal Feedback Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DroopSignalFeedbackKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            DroopSignalFeedbackKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Droop Signal Feedback Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DroopSignalFeedbackKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            DroopSignalFeedbackKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Droop Signal Feedback Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DroopSignalFeedbackKind get( int value ) {
        switch( value ) {
        case ELECTRICAL_POWER_VALUE:
            return ELECTRICAL_POWER;
        case NONE_VALUE:
            return NONE;
        case FUEL_VALVE_STROKE_VALUE:
            return FUEL_VALVE_STROKE;
        case GOVERNOR_OUTPUT_VALUE:
            return GOVERNOR_OUTPUT;
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
    private DroopSignalFeedbackKind( int value, String name, String literal ) {
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

} //DroopSignalFeedbackKind
