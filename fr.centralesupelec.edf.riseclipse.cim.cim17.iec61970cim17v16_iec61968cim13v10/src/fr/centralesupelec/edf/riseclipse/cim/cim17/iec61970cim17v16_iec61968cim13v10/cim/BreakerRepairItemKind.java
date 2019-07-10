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
 * A representation of the literals of the enumeration '<em><b>Breaker Repair Item Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBreakerRepairItemKind()
 * @model
 * @generated
 */
public enum BreakerRepairItemKind implements Enumerator {
    /**
     * The '<em><b>Air Compressor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AIR_COMPRESSOR_VALUE
     * @generated
     * @ordered
     */
    AIR_COMPRESSOR( 0, "airCompressor", "airCompressor" ),

    /**
     * The '<em><b>Auxiliary Switch And Linkage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AUXILIARY_SWITCH_AND_LINKAGE_VALUE
     * @generated
     * @ordered
     */
    AUXILIARY_SWITCH_AND_LINKAGE( 1, "auxiliarySwitchAndLinkage", "auxiliarySwitchAndLinkage" ),

    /**
     * The '<em><b>Bus Connection</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUS_CONNECTION_VALUE
     * @generated
     * @ordered
     */
    BUS_CONNECTION( 2, "busConnection", "busConnection" ),

    /**
     * The '<em><b>Check Valve</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHECK_VALVE_VALUE
     * @generated
     * @ordered
     */
    CHECK_VALVE( 3, "checkValve", "checkValve" ),

    /**
     * The '<em><b>Close Coil</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CLOSE_COIL_VALUE
     * @generated
     * @ordered
     */
    CLOSE_COIL( 4, "closeCoil", "closeCoil" ),

    /**
     * The '<em><b>Contactor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONTACTOR_VALUE
     * @generated
     * @ordered
     */
    CONTACTOR( 5, "contactor", "contactor" ),

    /**
     * The '<em><b>Control Circuit</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONTROL_CIRCUIT_VALUE
     * @generated
     * @ordered
     */
    CONTROL_CIRCUIT( 6, "controlCircuit", "controlCircuit" ),

    /**
     * The '<em><b>Corrosion</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CORROSION_VALUE
     * @generated
     * @ordered
     */
    CORROSION( 7, "corrosion", "corrosion" ),

    /**
     * The '<em><b>Gas Density Supervision</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GAS_DENSITY_SUPERVISION_VALUE
     * @generated
     * @ordered
     */
    GAS_DENSITY_SUPERVISION( 8, "gasDensitySupervision", "gasDensitySupervision" ),

    /**
     * The '<em><b>Heater Or Thermostat</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HEATER_OR_THERMOSTAT_VALUE
     * @generated
     * @ordered
     */
    HEATER_OR_THERMOSTAT( 9, "heaterOrThermostat", "heaterOrThermostat" ),

    /**
     * The '<em><b>Hydraulic Fluid Leak</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HYDRAULIC_FLUID_LEAK_VALUE
     * @generated
     * @ordered
     */
    HYDRAULIC_FLUID_LEAK( 10, "hydraulicFluidLeak", "hydraulicFluidLeak" ),

    /**
     * The '<em><b>Interrupter Assembly</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERRUPTER_ASSEMBLY_VALUE
     * @generated
     * @ordered
     */
    INTERRUPTER_ASSEMBLY( 11, "interrupterAssembly", "interrupterAssembly" ),

    /**
     * The '<em><b>Position Indicator</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POSITION_INDICATOR_VALUE
     * @generated
     * @ordered
     */
    POSITION_INDICATOR( 12, "positionIndicator", "positionIndicator" ),

    /**
     * The '<em><b>Pressure Switch</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PRESSURE_SWITCH_VALUE
     * @generated
     * @ordered
     */
    PRESSURE_SWITCH( 13, "pressureSwitch", "pressureSwitch" ),

    /**
     * The '<em><b>Pump Or Motor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PUMP_OR_MOTOR_VALUE
     * @generated
     * @ordered
     */
    PUMP_OR_MOTOR( 14, "pumpOrMotor", "pumpOrMotor" ),

    /**
     * The '<em><b>Relay</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RELAY_VALUE
     * @generated
     * @ordered
     */
    RELAY( 15, "relay", "relay" ),

    /**
     * The '<em><b>SF6 Gas Leak</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SF6_GAS_LEAK_VALUE
     * @generated
     * @ordered
     */
    SF6_GAS_LEAK( 16, "SF6GasLeak", "SF6GasLeak" ),

    /**
     * The '<em><b>Stored Energy System</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STORED_ENERGY_SYSTEM_VALUE
     * @generated
     * @ordered
     */
    STORED_ENERGY_SYSTEM( 17, "storedEnergySystem", "storedEnergySystem" ),

    /**
     * The '<em><b>Trip Coil</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRIP_COIL_VALUE
     * @generated
     * @ordered
     */
    TRIP_COIL( 18, "tripCoil", "tripCoil" ),

    /**
     * The '<em><b>Trip Control Valve</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRIP_CONTROL_VALVE_VALUE
     * @generated
     * @ordered
     */
    TRIP_CONTROL_VALVE( 19, "tripControlValve", "tripControlValve" ),

    /**
     * The '<em><b>Wiring</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WIRING_VALUE
     * @generated
     * @ordered
     */
    WIRING( 20, "wiring", "wiring" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 21, "other", "other" );

    /**
     * The '<em><b>Air Compressor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Air Compressor</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AIR_COMPRESSOR
     * @model name="airCompressor"
     * @generated
     * @ordered
     */
    public static final int AIR_COMPRESSOR_VALUE = 0;

    /**
     * The '<em><b>Auxiliary Switch And Linkage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Auxiliary Switch And Linkage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AUXILIARY_SWITCH_AND_LINKAGE
     * @model name="auxiliarySwitchAndLinkage"
     * @generated
     * @ordered
     */
    public static final int AUXILIARY_SWITCH_AND_LINKAGE_VALUE = 1;

    /**
     * The '<em><b>Bus Connection</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bus Connection</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUS_CONNECTION
     * @model name="busConnection"
     * @generated
     * @ordered
     */
    public static final int BUS_CONNECTION_VALUE = 2;

    /**
     * The '<em><b>Check Valve</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Check Valve</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHECK_VALVE
     * @model name="checkValve"
     * @generated
     * @ordered
     */
    public static final int CHECK_VALVE_VALUE = 3;

    /**
     * The '<em><b>Close Coil</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Close Coil</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CLOSE_COIL
     * @model name="closeCoil"
     * @generated
     * @ordered
     */
    public static final int CLOSE_COIL_VALUE = 4;

    /**
     * The '<em><b>Contactor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Contactor</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONTACTOR
     * @model name="contactor"
     * @generated
     * @ordered
     */
    public static final int CONTACTOR_VALUE = 5;

    /**
     * The '<em><b>Control Circuit</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Control Circuit</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONTROL_CIRCUIT
     * @model name="controlCircuit"
     * @generated
     * @ordered
     */
    public static final int CONTROL_CIRCUIT_VALUE = 6;

    /**
     * The '<em><b>Corrosion</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Corrosion</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CORROSION
     * @model name="corrosion"
     * @generated
     * @ordered
     */
    public static final int CORROSION_VALUE = 7;

    /**
     * The '<em><b>Gas Density Supervision</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Gas Density Supervision</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GAS_DENSITY_SUPERVISION
     * @model name="gasDensitySupervision"
     * @generated
     * @ordered
     */
    public static final int GAS_DENSITY_SUPERVISION_VALUE = 8;

    /**
     * The '<em><b>Heater Or Thermostat</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Heater Or Thermostat</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HEATER_OR_THERMOSTAT
     * @model name="heaterOrThermostat"
     * @generated
     * @ordered
     */
    public static final int HEATER_OR_THERMOSTAT_VALUE = 9;

    /**
     * The '<em><b>Hydraulic Fluid Leak</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hydraulic Fluid Leak</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HYDRAULIC_FLUID_LEAK
     * @model name="hydraulicFluidLeak"
     * @generated
     * @ordered
     */
    public static final int HYDRAULIC_FLUID_LEAK_VALUE = 10;

    /**
     * The '<em><b>Interrupter Assembly</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Interrupter Assembly</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTERRUPTER_ASSEMBLY
     * @model name="interrupterAssembly"
     * @generated
     * @ordered
     */
    public static final int INTERRUPTER_ASSEMBLY_VALUE = 11;

    /**
     * The '<em><b>Position Indicator</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Position Indicator</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POSITION_INDICATOR
     * @model name="positionIndicator"
     * @generated
     * @ordered
     */
    public static final int POSITION_INDICATOR_VALUE = 12;

    /**
     * The '<em><b>Pressure Switch</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pressure Switch</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PRESSURE_SWITCH
     * @model name="pressureSwitch"
     * @generated
     * @ordered
     */
    public static final int PRESSURE_SWITCH_VALUE = 13;

    /**
     * The '<em><b>Pump Or Motor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pump Or Motor</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PUMP_OR_MOTOR
     * @model name="pumpOrMotor"
     * @generated
     * @ordered
     */
    public static final int PUMP_OR_MOTOR_VALUE = 14;

    /**
     * The '<em><b>Relay</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Relay</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RELAY
     * @model name="relay"
     * @generated
     * @ordered
     */
    public static final int RELAY_VALUE = 15;

    /**
     * The '<em><b>SF6 Gas Leak</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SF6 Gas Leak</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SF6_GAS_LEAK
     * @model name="SF6GasLeak"
     * @generated
     * @ordered
     */
    public static final int SF6_GAS_LEAK_VALUE = 16;

    /**
     * The '<em><b>Stored Energy System</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Stored Energy System</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STORED_ENERGY_SYSTEM
     * @model name="storedEnergySystem"
     * @generated
     * @ordered
     */
    public static final int STORED_ENERGY_SYSTEM_VALUE = 17;

    /**
     * The '<em><b>Trip Coil</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Trip Coil</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRIP_COIL
     * @model name="tripCoil"
     * @generated
     * @ordered
     */
    public static final int TRIP_COIL_VALUE = 18;

    /**
     * The '<em><b>Trip Control Valve</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Trip Control Valve</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRIP_CONTROL_VALVE
     * @model name="tripControlValve"
     * @generated
     * @ordered
     */
    public static final int TRIP_CONTROL_VALVE_VALUE = 19;

    /**
     * The '<em><b>Wiring</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Wiring</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WIRING
     * @model name="wiring"
     * @generated
     * @ordered
     */
    public static final int WIRING_VALUE = 20;

    /**
     * The '<em><b>Other</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OTHER
     * @model name="other"
     * @generated
     * @ordered
     */
    public static final int OTHER_VALUE = 21;

    /**
     * An array of all the '<em><b>Breaker Repair Item Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final BreakerRepairItemKind[] VALUES_ARRAY = new BreakerRepairItemKind[] { AIR_COMPRESSOR,
            AUXILIARY_SWITCH_AND_LINKAGE, BUS_CONNECTION, CHECK_VALVE, CLOSE_COIL, CONTACTOR, CONTROL_CIRCUIT,
            CORROSION, GAS_DENSITY_SUPERVISION, HEATER_OR_THERMOSTAT, HYDRAULIC_FLUID_LEAK, INTERRUPTER_ASSEMBLY,
            POSITION_INDICATOR, PRESSURE_SWITCH, PUMP_OR_MOTOR, RELAY, SF6_GAS_LEAK, STORED_ENERGY_SYSTEM, TRIP_COIL,
            TRIP_CONTROL_VALVE, WIRING, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Breaker Repair Item Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< BreakerRepairItemKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Breaker Repair Item Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerRepairItemKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BreakerRepairItemKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Breaker Repair Item Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerRepairItemKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BreakerRepairItemKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Breaker Repair Item Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerRepairItemKind get( int value ) {
        switch( value ) {
        case AIR_COMPRESSOR_VALUE:
            return AIR_COMPRESSOR;
        case AUXILIARY_SWITCH_AND_LINKAGE_VALUE:
            return AUXILIARY_SWITCH_AND_LINKAGE;
        case BUS_CONNECTION_VALUE:
            return BUS_CONNECTION;
        case CHECK_VALVE_VALUE:
            return CHECK_VALVE;
        case CLOSE_COIL_VALUE:
            return CLOSE_COIL;
        case CONTACTOR_VALUE:
            return CONTACTOR;
        case CONTROL_CIRCUIT_VALUE:
            return CONTROL_CIRCUIT;
        case CORROSION_VALUE:
            return CORROSION;
        case GAS_DENSITY_SUPERVISION_VALUE:
            return GAS_DENSITY_SUPERVISION;
        case HEATER_OR_THERMOSTAT_VALUE:
            return HEATER_OR_THERMOSTAT;
        case HYDRAULIC_FLUID_LEAK_VALUE:
            return HYDRAULIC_FLUID_LEAK;
        case INTERRUPTER_ASSEMBLY_VALUE:
            return INTERRUPTER_ASSEMBLY;
        case POSITION_INDICATOR_VALUE:
            return POSITION_INDICATOR;
        case PRESSURE_SWITCH_VALUE:
            return PRESSURE_SWITCH;
        case PUMP_OR_MOTOR_VALUE:
            return PUMP_OR_MOTOR;
        case RELAY_VALUE:
            return RELAY;
        case SF6_GAS_LEAK_VALUE:
            return SF6_GAS_LEAK;
        case STORED_ENERGY_SYSTEM_VALUE:
            return STORED_ENERGY_SYSTEM;
        case TRIP_COIL_VALUE:
            return TRIP_COIL;
        case TRIP_CONTROL_VALVE_VALUE:
            return TRIP_CONTROL_VALVE;
        case WIRING_VALUE:
            return WIRING;
        case OTHER_VALUE:
            return OTHER;
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
    private BreakerRepairItemKind( int value, String name, String literal ) {
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

} //BreakerRepairItemKind
