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
 * A representation of the literals of the enumeration '<em><b>Exc REXS Feedback Signal Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcREXSFeedbackSignalKind()
 * @model
 * @generated
 */
public enum ExcREXSFeedbackSignalKind implements Enumerator {
    /**
     * The '<em><b>Field Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIELD_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    FIELD_VOLTAGE( 0, "fieldVoltage", "fieldVoltage" ),

    /**
     * The '<em><b>Field Current</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIELD_CURRENT_VALUE
     * @generated
     * @ordered
     */
    FIELD_CURRENT( 1, "fieldCurrent", "fieldCurrent" ),

    /**
     * The '<em><b>Output Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OUTPUT_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    OUTPUT_VOLTAGE( 2, "outputVoltage", "outputVoltage" );

    /**
     * The '<em><b>Field Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Field Voltage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIELD_VOLTAGE
     * @model name="fieldVoltage"
     * @generated
     * @ordered
     */
    public static final int FIELD_VOLTAGE_VALUE = 0;

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
    public static final int FIELD_CURRENT_VALUE = 1;

    /**
     * The '<em><b>Output Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Output Voltage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OUTPUT_VOLTAGE
     * @model name="outputVoltage"
     * @generated
     * @ordered
     */
    public static final int OUTPUT_VOLTAGE_VALUE = 2;

    /**
     * An array of all the '<em><b>Exc REXS Feedback Signal Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ExcREXSFeedbackSignalKind[] VALUES_ARRAY = new ExcREXSFeedbackSignalKind[] { FIELD_VOLTAGE,
            FIELD_CURRENT, OUTPUT_VOLTAGE, };

    /**
     * A public read-only list of all the '<em><b>Exc REXS Feedback Signal Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ExcREXSFeedbackSignalKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Exc REXS Feedback Signal Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcREXSFeedbackSignalKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ExcREXSFeedbackSignalKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Exc REXS Feedback Signal Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcREXSFeedbackSignalKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ExcREXSFeedbackSignalKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Exc REXS Feedback Signal Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcREXSFeedbackSignalKind get( int value ) {
        switch( value ) {
        case FIELD_VOLTAGE_VALUE:
            return FIELD_VOLTAGE;
        case FIELD_CURRENT_VALUE:
            return FIELD_CURRENT;
        case OUTPUT_VOLTAGE_VALUE:
            return OUTPUT_VOLTAGE;
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
    private ExcREXSFeedbackSignalKind( int value, String name, String literal ) {
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

} //ExcREXSFeedbackSignalKind
