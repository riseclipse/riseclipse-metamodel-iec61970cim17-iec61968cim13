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
 * A representation of the literals of the enumeration '<em><b>Inspection Analog Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInspectionAnalogKind()
 * @model
 * @generated
 */
public enum InspectionAnalogKind implements Enumerator {
    /**
     * The '<em><b>SF6 Pressure Reading</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SF6_PRESSURE_READING_VALUE
     * @generated
     * @ordered
     */
    SF6_PRESSURE_READING( 0, "SF6PressureReading", "SF6PressureReading" ),

    /**
     * The '<em><b>Air Pressure Reading</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AIR_PRESSURE_READING_VALUE
     * @generated
     * @ordered
     */
    AIR_PRESSURE_READING( 1, "AirPressureReading", "AirPressureReading" ),

    /**
     * The '<em><b>Air Pressure HP System Reading</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AIR_PRESSURE_HP_SYSTEM_READING_VALUE
     * @generated
     * @ordered
     */
    AIR_PRESSURE_HP_SYSTEM_READING( 2, "airPressureHPSystemReading", "airPressureHPSystemReading" ),

    /**
     * The '<em><b>Compressor Hour Meter Reading</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMPRESSOR_HOUR_METER_READING_VALUE
     * @generated
     * @ordered
     */
    COMPRESSOR_HOUR_METER_READING( 3, "compressorHourMeterReading", "compressorHourMeterReading" ),

    /**
     * The '<em><b>Air Pressure LP System Reading</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AIR_PRESSURE_LP_SYSTEM_READING_VALUE
     * @generated
     * @ordered
     */
    AIR_PRESSURE_LP_SYSTEM_READING( 4, "airPressureLPSystemReading", "airPressureLPSystemReading" );

    /**
     * The '<em><b>SF6 Pressure Reading</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SF6 Pressure Reading</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SF6_PRESSURE_READING
     * @model name="SF6PressureReading"
     * @generated
     * @ordered
     */
    public static final int SF6_PRESSURE_READING_VALUE = 0;

    /**
     * The '<em><b>Air Pressure Reading</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Air Pressure Reading</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AIR_PRESSURE_READING
     * @model name="AirPressureReading"
     * @generated
     * @ordered
     */
    public static final int AIR_PRESSURE_READING_VALUE = 1;

    /**
     * The '<em><b>Air Pressure HP System Reading</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Air Pressure HP System Reading</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AIR_PRESSURE_HP_SYSTEM_READING
     * @model name="airPressureHPSystemReading"
     * @generated
     * @ordered
     */
    public static final int AIR_PRESSURE_HP_SYSTEM_READING_VALUE = 2;

    /**
     * The '<em><b>Compressor Hour Meter Reading</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Compressor Hour Meter Reading</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COMPRESSOR_HOUR_METER_READING
     * @model name="compressorHourMeterReading"
     * @generated
     * @ordered
     */
    public static final int COMPRESSOR_HOUR_METER_READING_VALUE = 3;

    /**
     * The '<em><b>Air Pressure LP System Reading</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Air Pressure LP System Reading</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AIR_PRESSURE_LP_SYSTEM_READING
     * @model name="airPressureLPSystemReading"
     * @generated
     * @ordered
     */
    public static final int AIR_PRESSURE_LP_SYSTEM_READING_VALUE = 4;

    /**
     * An array of all the '<em><b>Inspection Analog Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final InspectionAnalogKind[] VALUES_ARRAY = new InspectionAnalogKind[] { SF6_PRESSURE_READING,
            AIR_PRESSURE_READING, AIR_PRESSURE_HP_SYSTEM_READING, COMPRESSOR_HOUR_METER_READING,
            AIR_PRESSURE_LP_SYSTEM_READING, };

    /**
     * A public read-only list of all the '<em><b>Inspection Analog Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< InspectionAnalogKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Inspection Analog Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InspectionAnalogKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            InspectionAnalogKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Inspection Analog Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InspectionAnalogKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            InspectionAnalogKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Inspection Analog Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InspectionAnalogKind get( int value ) {
        switch( value ) {
        case SF6_PRESSURE_READING_VALUE:
            return SF6_PRESSURE_READING;
        case AIR_PRESSURE_READING_VALUE:
            return AIR_PRESSURE_READING;
        case AIR_PRESSURE_HP_SYSTEM_READING_VALUE:
            return AIR_PRESSURE_HP_SYSTEM_READING;
        case COMPRESSOR_HOUR_METER_READING_VALUE:
            return COMPRESSOR_HOUR_METER_READING;
        case AIR_PRESSURE_LP_SYSTEM_READING_VALUE:
            return AIR_PRESSURE_LP_SYSTEM_READING;
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
    private InspectionAnalogKind( int value, String name, String literal ) {
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

} //InspectionAnalogKind
