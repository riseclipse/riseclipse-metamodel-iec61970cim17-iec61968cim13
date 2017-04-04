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
 * A representation of the literals of the enumeration '<em><b>Input Signal Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInputSignalKind()
 * @model
 * @generated
 */
public enum InputSignalKind implements Enumerator {
    /**
     * The '<em><b>Rotor Speed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROTOR_SPEED_VALUE
     * @generated
     * @ordered
     */
    ROTOR_SPEED( 0, "rotorSpeed", "rotorSpeed" ),

    /**
     * The '<em><b>Rotor Angular Frequency Deviation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROTOR_ANGULAR_FREQUENCY_DEVIATION_VALUE
     * @generated
     * @ordered
     */
    ROTOR_ANGULAR_FREQUENCY_DEVIATION( 1, "rotorAngularFrequencyDeviation", "rotorAngularFrequencyDeviation" ),

    /**
     * The '<em><b>Bus Frequency</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUS_FREQUENCY_VALUE
     * @generated
     * @ordered
     */
    BUS_FREQUENCY( 2, "busFrequency", "busFrequency" ),

    /**
     * The '<em><b>Bus Frequency Deviation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUS_FREQUENCY_DEVIATION_VALUE
     * @generated
     * @ordered
     */
    BUS_FREQUENCY_DEVIATION( 3, "busFrequencyDeviation", "busFrequencyDeviation" ),

    /**
     * The '<em><b>Generator Electrical Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GENERATOR_ELECTRICAL_POWER_VALUE
     * @generated
     * @ordered
     */
    GENERATOR_ELECTRICAL_POWER( 4, "generatorElectricalPower", "generatorElectricalPower" ),

    /**
     * The '<em><b>Generator Accelerating Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GENERATOR_ACCELERATING_POWER_VALUE
     * @generated
     * @ordered
     */
    GENERATOR_ACCELERATING_POWER( 5, "generatorAcceleratingPower", "generatorAcceleratingPower" ),

    /**
     * The '<em><b>Bus Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUS_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    BUS_VOLTAGE( 6, "busVoltage", "busVoltage" ),

    /**
     * The '<em><b>Bus Voltage Derivative</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUS_VOLTAGE_DERIVATIVE_VALUE
     * @generated
     * @ordered
     */
    BUS_VOLTAGE_DERIVATIVE( 7, "busVoltageDerivative", "busVoltageDerivative" ),

    /**
     * The '<em><b>Branch Current</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BRANCH_CURRENT_VALUE
     * @generated
     * @ordered
     */
    BRANCH_CURRENT( 8, "branchCurrent", "branchCurrent" ),

    /**
     * The '<em><b>Field Current</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIELD_CURRENT_VALUE
     * @generated
     * @ordered
     */
    FIELD_CURRENT( 9, "fieldCurrent", "fieldCurrent" );

    /**
     * The '<em><b>Rotor Speed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rotor Speed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROTOR_SPEED
     * @model name="rotorSpeed"
     * @generated
     * @ordered
     */
    public static final int ROTOR_SPEED_VALUE = 0;

    /**
     * The '<em><b>Rotor Angular Frequency Deviation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rotor Angular Frequency Deviation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROTOR_ANGULAR_FREQUENCY_DEVIATION
     * @model name="rotorAngularFrequencyDeviation"
     * @generated
     * @ordered
     */
    public static final int ROTOR_ANGULAR_FREQUENCY_DEVIATION_VALUE = 1;

    /**
     * The '<em><b>Bus Frequency</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bus Frequency</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUS_FREQUENCY
     * @model name="busFrequency"
     * @generated
     * @ordered
     */
    public static final int BUS_FREQUENCY_VALUE = 2;

    /**
     * The '<em><b>Bus Frequency Deviation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bus Frequency Deviation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUS_FREQUENCY_DEVIATION
     * @model name="busFrequencyDeviation"
     * @generated
     * @ordered
     */
    public static final int BUS_FREQUENCY_DEVIATION_VALUE = 3;

    /**
     * The '<em><b>Generator Electrical Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Generator Electrical Power</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GENERATOR_ELECTRICAL_POWER
     * @model name="generatorElectricalPower"
     * @generated
     * @ordered
     */
    public static final int GENERATOR_ELECTRICAL_POWER_VALUE = 4;

    /**
     * The '<em><b>Generator Accelerating Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Generator Accelerating Power</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GENERATOR_ACCELERATING_POWER
     * @model name="generatorAcceleratingPower"
     * @generated
     * @ordered
     */
    public static final int GENERATOR_ACCELERATING_POWER_VALUE = 5;

    /**
     * The '<em><b>Bus Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bus Voltage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUS_VOLTAGE
     * @model name="busVoltage"
     * @generated
     * @ordered
     */
    public static final int BUS_VOLTAGE_VALUE = 6;

    /**
     * The '<em><b>Bus Voltage Derivative</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bus Voltage Derivative</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUS_VOLTAGE_DERIVATIVE
     * @model name="busVoltageDerivative"
     * @generated
     * @ordered
     */
    public static final int BUS_VOLTAGE_DERIVATIVE_VALUE = 7;

    /**
     * The '<em><b>Branch Current</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Branch Current</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BRANCH_CURRENT
     * @model name="branchCurrent"
     * @generated
     * @ordered
     */
    public static final int BRANCH_CURRENT_VALUE = 8;

    /**
     * The '<em><b>Field Current</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Field Current</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIELD_CURRENT
     * @model name="fieldCurrent"
     * @generated
     * @ordered
     */
    public static final int FIELD_CURRENT_VALUE = 9;

    /**
     * An array of all the '<em><b>Input Signal Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final InputSignalKind[] VALUES_ARRAY = new InputSignalKind[] { ROTOR_SPEED,
            ROTOR_ANGULAR_FREQUENCY_DEVIATION, BUS_FREQUENCY, BUS_FREQUENCY_DEVIATION, GENERATOR_ELECTRICAL_POWER,
            GENERATOR_ACCELERATING_POWER, BUS_VOLTAGE, BUS_VOLTAGE_DERIVATIVE, BRANCH_CURRENT, FIELD_CURRENT, };

    /**
     * A public read-only list of all the '<em><b>Input Signal Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< InputSignalKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Input Signal Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InputSignalKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            InputSignalKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Input Signal Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InputSignalKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            InputSignalKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Input Signal Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InputSignalKind get( int value ) {
        switch( value ) {
        case ROTOR_SPEED_VALUE:
            return ROTOR_SPEED;
        case ROTOR_ANGULAR_FREQUENCY_DEVIATION_VALUE:
            return ROTOR_ANGULAR_FREQUENCY_DEVIATION;
        case BUS_FREQUENCY_VALUE:
            return BUS_FREQUENCY;
        case BUS_FREQUENCY_DEVIATION_VALUE:
            return BUS_FREQUENCY_DEVIATION;
        case GENERATOR_ELECTRICAL_POWER_VALUE:
            return GENERATOR_ELECTRICAL_POWER;
        case GENERATOR_ACCELERATING_POWER_VALUE:
            return GENERATOR_ACCELERATING_POWER;
        case BUS_VOLTAGE_VALUE:
            return BUS_VOLTAGE;
        case BUS_VOLTAGE_DERIVATIVE_VALUE:
            return BUS_VOLTAGE_DERIVATIVE;
        case BRANCH_CURRENT_VALUE:
            return BRANCH_CURRENT;
        case FIELD_CURRENT_VALUE:
            return FIELD_CURRENT;
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
    private InputSignalKind( int value, String name, String literal ) {
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

} //InputSignalKind
