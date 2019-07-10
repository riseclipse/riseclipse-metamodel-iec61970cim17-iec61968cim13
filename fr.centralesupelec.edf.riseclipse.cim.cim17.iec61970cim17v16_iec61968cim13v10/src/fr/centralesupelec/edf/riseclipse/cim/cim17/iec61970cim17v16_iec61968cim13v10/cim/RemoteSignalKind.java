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
 * A representation of the literals of the enumeration '<em><b>Remote Signal Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteSignalKind()
 * @model
 * @generated
 */
public enum RemoteSignalKind implements Enumerator {
    /**
     * The '<em><b>Remote Bus Voltage Frequency</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_VOLTAGE_FREQUENCY_VALUE
     * @generated
     * @ordered
     */
    REMOTE_BUS_VOLTAGE_FREQUENCY( 0, "remoteBusVoltageFrequency", "remoteBusVoltageFrequency" ),

    /**
     * The '<em><b>Remote Bus Voltage Frequency Deviation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_VOLTAGE_FREQUENCY_DEVIATION_VALUE
     * @generated
     * @ordered
     */
    REMOTE_BUS_VOLTAGE_FREQUENCY_DEVIATION( 1, "remoteBusVoltageFrequencyDeviation",
            "remoteBusVoltageFrequencyDeviation" ),

    /**
     * The '<em><b>Remote Bus Frequency</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_FREQUENCY_VALUE
     * @generated
     * @ordered
     */
    REMOTE_BUS_FREQUENCY( 2, "remoteBusFrequency", "remoteBusFrequency" ),

    /**
     * The '<em><b>Remote Bus Frequency Deviation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_FREQUENCY_DEVIATION_VALUE
     * @generated
     * @ordered
     */
    REMOTE_BUS_FREQUENCY_DEVIATION( 3, "remoteBusFrequencyDeviation", "remoteBusFrequencyDeviation" ),

    /**
     * The '<em><b>Remote Bus Voltage Amplitude</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_VOLTAGE_AMPLITUDE_VALUE
     * @generated
     * @ordered
     */
    REMOTE_BUS_VOLTAGE_AMPLITUDE( 4, "remoteBusVoltageAmplitude", "remoteBusVoltageAmplitude" ),

    /**
     * The '<em><b>Remote Bus Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    REMOTE_BUS_VOLTAGE( 5, "remoteBusVoltage", "remoteBusVoltage" ),

    /**
     * The '<em><b>Remote Branch Current Amplitude</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOTE_BRANCH_CURRENT_AMPLITUDE_VALUE
     * @generated
     * @ordered
     */
    REMOTE_BRANCH_CURRENT_AMPLITUDE( 6, "remoteBranchCurrentAmplitude", "remoteBranchCurrentAmplitude" ),

    /**
     * The '<em><b>Remote Bus Voltage Amplitude Derivative</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_VOLTAGE_AMPLITUDE_DERIVATIVE_VALUE
     * @generated
     * @ordered
     */
    REMOTE_BUS_VOLTAGE_AMPLITUDE_DERIVATIVE( 7, "remoteBusVoltageAmplitudeDerivative",
            "remoteBusVoltageAmplitudeDerivative" ),

    /**
     * The '<em><b>Remote Pu Bus Voltage Derivative</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOTE_PU_BUS_VOLTAGE_DERIVATIVE_VALUE
     * @generated
     * @ordered
     */
    REMOTE_PU_BUS_VOLTAGE_DERIVATIVE( 8, "remotePuBusVoltageDerivative", "remotePuBusVoltageDerivative" );

    /**
     * The '<em><b>Remote Bus Voltage Frequency</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Remote Bus Voltage Frequency</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_VOLTAGE_FREQUENCY
     * @model name="remoteBusVoltageFrequency"
     * @generated
     * @ordered
     */
    public static final int REMOTE_BUS_VOLTAGE_FREQUENCY_VALUE = 0;

    /**
     * The '<em><b>Remote Bus Voltage Frequency Deviation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Remote Bus Voltage Frequency Deviation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_VOLTAGE_FREQUENCY_DEVIATION
     * @model name="remoteBusVoltageFrequencyDeviation"
     * @generated
     * @ordered
     */
    public static final int REMOTE_BUS_VOLTAGE_FREQUENCY_DEVIATION_VALUE = 1;

    /**
     * The '<em><b>Remote Bus Frequency</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Remote Bus Frequency</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_FREQUENCY
     * @model name="remoteBusFrequency"
     * @generated
     * @ordered
     */
    public static final int REMOTE_BUS_FREQUENCY_VALUE = 2;

    /**
     * The '<em><b>Remote Bus Frequency Deviation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Remote Bus Frequency Deviation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_FREQUENCY_DEVIATION
     * @model name="remoteBusFrequencyDeviation"
     * @generated
     * @ordered
     */
    public static final int REMOTE_BUS_FREQUENCY_DEVIATION_VALUE = 3;

    /**
     * The '<em><b>Remote Bus Voltage Amplitude</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Remote Bus Voltage Amplitude</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_VOLTAGE_AMPLITUDE
     * @model name="remoteBusVoltageAmplitude"
     * @generated
     * @ordered
     */
    public static final int REMOTE_BUS_VOLTAGE_AMPLITUDE_VALUE = 4;

    /**
     * The '<em><b>Remote Bus Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Remote Bus Voltage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_VOLTAGE
     * @model name="remoteBusVoltage"
     * @generated
     * @ordered
     */
    public static final int REMOTE_BUS_VOLTAGE_VALUE = 5;

    /**
     * The '<em><b>Remote Branch Current Amplitude</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Remote Branch Current Amplitude</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOTE_BRANCH_CURRENT_AMPLITUDE
     * @model name="remoteBranchCurrentAmplitude"
     * @generated
     * @ordered
     */
    public static final int REMOTE_BRANCH_CURRENT_AMPLITUDE_VALUE = 6;

    /**
     * The '<em><b>Remote Bus Voltage Amplitude Derivative</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Remote Bus Voltage Amplitude Derivative</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOTE_BUS_VOLTAGE_AMPLITUDE_DERIVATIVE
     * @model name="remoteBusVoltageAmplitudeDerivative"
     * @generated
     * @ordered
     */
    public static final int REMOTE_BUS_VOLTAGE_AMPLITUDE_DERIVATIVE_VALUE = 7;

    /**
     * The '<em><b>Remote Pu Bus Voltage Derivative</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Remote Pu Bus Voltage Derivative</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOTE_PU_BUS_VOLTAGE_DERIVATIVE
     * @model name="remotePuBusVoltageDerivative"
     * @generated
     * @ordered
     */
    public static final int REMOTE_PU_BUS_VOLTAGE_DERIVATIVE_VALUE = 8;

    /**
     * An array of all the '<em><b>Remote Signal Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final RemoteSignalKind[] VALUES_ARRAY = new RemoteSignalKind[] { REMOTE_BUS_VOLTAGE_FREQUENCY,
            REMOTE_BUS_VOLTAGE_FREQUENCY_DEVIATION, REMOTE_BUS_FREQUENCY, REMOTE_BUS_FREQUENCY_DEVIATION,
            REMOTE_BUS_VOLTAGE_AMPLITUDE, REMOTE_BUS_VOLTAGE, REMOTE_BRANCH_CURRENT_AMPLITUDE,
            REMOTE_BUS_VOLTAGE_AMPLITUDE_DERIVATIVE, REMOTE_PU_BUS_VOLTAGE_DERIVATIVE, };

    /**
     * A public read-only list of all the '<em><b>Remote Signal Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< RemoteSignalKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Remote Signal Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RemoteSignalKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            RemoteSignalKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Remote Signal Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RemoteSignalKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            RemoteSignalKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Remote Signal Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RemoteSignalKind get( int value ) {
        switch( value ) {
        case REMOTE_BUS_VOLTAGE_FREQUENCY_VALUE:
            return REMOTE_BUS_VOLTAGE_FREQUENCY;
        case REMOTE_BUS_VOLTAGE_FREQUENCY_DEVIATION_VALUE:
            return REMOTE_BUS_VOLTAGE_FREQUENCY_DEVIATION;
        case REMOTE_BUS_FREQUENCY_VALUE:
            return REMOTE_BUS_FREQUENCY;
        case REMOTE_BUS_FREQUENCY_DEVIATION_VALUE:
            return REMOTE_BUS_FREQUENCY_DEVIATION;
        case REMOTE_BUS_VOLTAGE_AMPLITUDE_VALUE:
            return REMOTE_BUS_VOLTAGE_AMPLITUDE;
        case REMOTE_BUS_VOLTAGE_VALUE:
            return REMOTE_BUS_VOLTAGE;
        case REMOTE_BRANCH_CURRENT_AMPLITUDE_VALUE:
            return REMOTE_BRANCH_CURRENT_AMPLITUDE;
        case REMOTE_BUS_VOLTAGE_AMPLITUDE_DERIVATIVE_VALUE:
            return REMOTE_BUS_VOLTAGE_AMPLITUDE_DERIVATIVE;
        case REMOTE_PU_BUS_VOLTAGE_DERIVATIVE_VALUE:
            return REMOTE_PU_BUS_VOLTAGE_DERIVATIVE;
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
    private RemoteSignalKind( int value, String name, String literal ) {
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

} //RemoteSignalKind
