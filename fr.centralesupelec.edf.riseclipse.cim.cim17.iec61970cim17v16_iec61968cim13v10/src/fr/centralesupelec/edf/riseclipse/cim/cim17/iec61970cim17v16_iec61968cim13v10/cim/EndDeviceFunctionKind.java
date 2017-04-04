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
 * A representation of the literals of the enumeration '<em><b>End Device Function Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceFunctionKind()
 * @model
 * @generated
 */
public enum EndDeviceFunctionKind implements Enumerator {
    /**
     * The '<em><b>Reverse Flow</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REVERSE_FLOW_VALUE
     * @generated
     * @ordered
     */
    REVERSE_FLOW( 0, "reverseFlow", "reverseFlow" ),

    /**
     * The '<em><b>Demand Response</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEMAND_RESPONSE_VALUE
     * @generated
     * @ordered
     */
    DEMAND_RESPONSE( 1, "demandResponse", "demandResponse" ),

    /**
     * The '<em><b>Metrology</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #METROLOGY_VALUE
     * @generated
     * @ordered
     */
    METROLOGY( 2, "metrology", "metrology" ),

    /**
     * The '<em><b>Outage History</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OUTAGE_HISTORY_VALUE
     * @generated
     * @ordered
     */
    OUTAGE_HISTORY( 3, "outageHistory", "outageHistory" ),

    /**
     * The '<em><b>Relays Programming</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RELAYS_PROGRAMMING_VALUE
     * @generated
     * @ordered
     */
    RELAYS_PROGRAMMING( 4, "relaysProgramming", "relaysProgramming" ),

    /**
     * The '<em><b>On Request Read</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ON_REQUEST_READ_VALUE
     * @generated
     * @ordered
     */
    ON_REQUEST_READ( 5, "onRequestRead", "onRequestRead" ),

    /**
     * The '<em><b>Autonomous Dst</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AUTONOMOUS_DST_VALUE
     * @generated
     * @ordered
     */
    AUTONOMOUS_DST( 6, "autonomousDst", "autonomousDst" ),

    /**
     * The '<em><b>Electric Metering</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ELECTRIC_METERING_VALUE
     * @generated
     * @ordered
     */
    ELECTRIC_METERING( 7, "electricMetering", "electricMetering" ),

    /**
     * The '<em><b>Gas Metering</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GAS_METERING_VALUE
     * @generated
     * @ordered
     */
    GAS_METERING( 8, "gasMetering", "gasMetering" ),

    /**
     * The '<em><b>Water Metering</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WATER_METERING_VALUE
     * @generated
     * @ordered
     */
    WATER_METERING( 9, "waterMetering", "waterMetering" );

    /**
     * The '<em><b>Reverse Flow</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Reverse Flow</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REVERSE_FLOW
     * @model name="reverseFlow"
     * @generated
     * @ordered
     */
    public static final int REVERSE_FLOW_VALUE = 0;

    /**
     * The '<em><b>Demand Response</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Demand Response</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEMAND_RESPONSE
     * @model name="demandResponse"
     * @generated
     * @ordered
     */
    public static final int DEMAND_RESPONSE_VALUE = 1;

    /**
     * The '<em><b>Metrology</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Metrology</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #METROLOGY
     * @model name="metrology"
     * @generated
     * @ordered
     */
    public static final int METROLOGY_VALUE = 2;

    /**
     * The '<em><b>Outage History</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Outage History</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OUTAGE_HISTORY
     * @model name="outageHistory"
     * @generated
     * @ordered
     */
    public static final int OUTAGE_HISTORY_VALUE = 3;

    /**
     * The '<em><b>Relays Programming</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Relays Programming</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RELAYS_PROGRAMMING
     * @model name="relaysProgramming"
     * @generated
     * @ordered
     */
    public static final int RELAYS_PROGRAMMING_VALUE = 4;

    /**
     * The '<em><b>On Request Read</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>On Request Read</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ON_REQUEST_READ
     * @model name="onRequestRead"
     * @generated
     * @ordered
     */
    public static final int ON_REQUEST_READ_VALUE = 5;

    /**
     * The '<em><b>Autonomous Dst</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Autonomous Dst</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AUTONOMOUS_DST
     * @model name="autonomousDst"
     * @generated
     * @ordered
     */
    public static final int AUTONOMOUS_DST_VALUE = 6;

    /**
     * The '<em><b>Electric Metering</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Electric Metering</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ELECTRIC_METERING
     * @model name="electricMetering"
     * @generated
     * @ordered
     */
    public static final int ELECTRIC_METERING_VALUE = 7;

    /**
     * The '<em><b>Gas Metering</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Gas Metering</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GAS_METERING
     * @model name="gasMetering"
     * @generated
     * @ordered
     */
    public static final int GAS_METERING_VALUE = 8;

    /**
     * The '<em><b>Water Metering</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Water Metering</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WATER_METERING
     * @model name="waterMetering"
     * @generated
     * @ordered
     */
    public static final int WATER_METERING_VALUE = 9;

    /**
     * An array of all the '<em><b>End Device Function Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EndDeviceFunctionKind[] VALUES_ARRAY = new EndDeviceFunctionKind[] { REVERSE_FLOW,
            DEMAND_RESPONSE, METROLOGY, OUTAGE_HISTORY, RELAYS_PROGRAMMING, ON_REQUEST_READ, AUTONOMOUS_DST,
            ELECTRIC_METERING, GAS_METERING, WATER_METERING, };

    /**
     * A public read-only list of all the '<em><b>End Device Function Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< EndDeviceFunctionKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>End Device Function Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EndDeviceFunctionKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            EndDeviceFunctionKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>End Device Function Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EndDeviceFunctionKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            EndDeviceFunctionKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>End Device Function Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EndDeviceFunctionKind get( int value ) {
        switch( value ) {
        case REVERSE_FLOW_VALUE:
            return REVERSE_FLOW;
        case DEMAND_RESPONSE_VALUE:
            return DEMAND_RESPONSE;
        case METROLOGY_VALUE:
            return METROLOGY;
        case OUTAGE_HISTORY_VALUE:
            return OUTAGE_HISTORY;
        case RELAYS_PROGRAMMING_VALUE:
            return RELAYS_PROGRAMMING;
        case ON_REQUEST_READ_VALUE:
            return ON_REQUEST_READ;
        case AUTONOMOUS_DST_VALUE:
            return AUTONOMOUS_DST;
        case ELECTRIC_METERING_VALUE:
            return ELECTRIC_METERING;
        case GAS_METERING_VALUE:
            return GAS_METERING;
        case WATER_METERING_VALUE:
            return WATER_METERING;
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
    private EndDeviceFunctionKind( int value, String name, String literal ) {
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

} //EndDeviceFunctionKind
