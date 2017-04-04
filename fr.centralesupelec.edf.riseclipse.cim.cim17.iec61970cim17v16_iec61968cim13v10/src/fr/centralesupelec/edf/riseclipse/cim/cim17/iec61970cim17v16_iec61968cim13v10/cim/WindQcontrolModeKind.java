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
 * A representation of the literals of the enumeration '<em><b>Wind Qcontrol Mode Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindQcontrolModeKind()
 * @model
 * @generated
 */
public enum WindQcontrolModeKind implements Enumerator {
    /**
     * The '<em><b>Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    VOLTAGE( 0, "voltage", "voltage" ),

    /**
     * The '<em><b>Reactive Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REACTIVE_POWER_VALUE
     * @generated
     * @ordered
     */
    REACTIVE_POWER( 1, "reactivePower", "reactivePower" ),

    /**
     * The '<em><b>Open Loop Reactive Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OPEN_LOOP_REACTIVE_POWER_VALUE
     * @generated
     * @ordered
     */
    OPEN_LOOP_REACTIVE_POWER( 2, "openLoopReactivePower", "openLoopReactivePower" ),

    /**
     * The '<em><b>Power Factor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POWER_FACTOR_VALUE
     * @generated
     * @ordered
     */
    POWER_FACTOR( 3, "powerFactor", "powerFactor" ),

    /**
     * The '<em><b>Open Looppower Factor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OPEN_LOOPPOWER_FACTOR_VALUE
     * @generated
     * @ordered
     */
    OPEN_LOOPPOWER_FACTOR( 4, "openLooppowerFactor", "openLooppowerFactor" );

    /**
     * The '<em><b>Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Voltage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VOLTAGE
     * @model name="voltage"
     * @generated
     * @ordered
     */
    public static final int VOLTAGE_VALUE = 0;

    /**
     * The '<em><b>Reactive Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Reactive Power</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REACTIVE_POWER
     * @model name="reactivePower"
     * @generated
     * @ordered
     */
    public static final int REACTIVE_POWER_VALUE = 1;

    /**
     * The '<em><b>Open Loop Reactive Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Open Loop Reactive Power</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OPEN_LOOP_REACTIVE_POWER
     * @model name="openLoopReactivePower"
     * @generated
     * @ordered
     */
    public static final int OPEN_LOOP_REACTIVE_POWER_VALUE = 2;

    /**
     * The '<em><b>Power Factor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Power Factor</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POWER_FACTOR
     * @model name="powerFactor"
     * @generated
     * @ordered
     */
    public static final int POWER_FACTOR_VALUE = 3;

    /**
     * The '<em><b>Open Looppower Factor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Open Looppower Factor</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OPEN_LOOPPOWER_FACTOR
     * @model name="openLooppowerFactor"
     * @generated
     * @ordered
     */
    public static final int OPEN_LOOPPOWER_FACTOR_VALUE = 4;

    /**
     * An array of all the '<em><b>Wind Qcontrol Mode Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WindQcontrolModeKind[] VALUES_ARRAY = new WindQcontrolModeKind[] { VOLTAGE, REACTIVE_POWER,
            OPEN_LOOP_REACTIVE_POWER, POWER_FACTOR, OPEN_LOOPPOWER_FACTOR, };

    /**
     * A public read-only list of all the '<em><b>Wind Qcontrol Mode Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< WindQcontrolModeKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Wind Qcontrol Mode Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindQcontrolModeKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WindQcontrolModeKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wind Qcontrol Mode Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindQcontrolModeKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WindQcontrolModeKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wind Qcontrol Mode Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindQcontrolModeKind get( int value ) {
        switch( value ) {
        case VOLTAGE_VALUE:
            return VOLTAGE;
        case REACTIVE_POWER_VALUE:
            return REACTIVE_POWER;
        case OPEN_LOOP_REACTIVE_POWER_VALUE:
            return OPEN_LOOP_REACTIVE_POWER;
        case POWER_FACTOR_VALUE:
            return POWER_FACTOR;
        case OPEN_LOOPPOWER_FACTOR_VALUE:
            return OPEN_LOOPPOWER_FACTOR;
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
    private WindQcontrolModeKind( int value, String name, String literal ) {
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

} //WindQcontrolModeKind
