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
 * A representation of the literals of the enumeration '<em><b>Inspection Discrete Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInspectionDiscreteKind()
 * @model
 * @generated
 */
public enum InspectionDiscreteKind implements Enumerator {
    /**
     * The '<em><b>Visible Damage Or Leaks</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VISIBLE_DAMAGE_OR_LEAKS_VALUE
     * @generated
     * @ordered
     */
    VISIBLE_DAMAGE_OR_LEAKS( 0, "visibleDamageOrLeaks", "visibleDamageOrLeaks" ),

    /**
     * The '<em><b>Control Cabinet Heater On</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONTROL_CABINET_HEATER_ON_VALUE
     * @generated
     * @ordered
     */
    CONTROL_CABINET_HEATER_ON( 1, "controlCabinetHeaterOn", "controlCabinetHeaterOn" ),

    /**
     * The '<em><b>Bushing Oil Levels OK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUSHING_OIL_LEVELS_OK_VALUE
     * @generated
     * @ordered
     */
    BUSHING_OIL_LEVELS_OK( 2, "bushingOilLevelsOK", "bushingOilLevelsOK" ),

    /**
     * The '<em><b>Oil Tank Levels OK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OIL_TANK_LEVELS_OK_VALUE
     * @generated
     * @ordered
     */
    OIL_TANK_LEVELS_OK( 3, "oilTankLevelsOK", "oilTankLevelsOK" ),

    /**
     * The '<em><b>Spring Pressure Reading OK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SPRING_PRESSURE_READING_OK_VALUE
     * @generated
     * @ordered
     */
    SPRING_PRESSURE_READING_OK( 4, "springPressureReadingOK", "springPressureReadingOK" ),

    /**
     * The '<em><b>Gas Indicator Normal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GAS_INDICATOR_NORMAL_VALUE
     * @generated
     * @ordered
     */
    GAS_INDICATOR_NORMAL( 5, "gasIndicatorNormal", "gasIndicatorNormal" ),

    /**
     * The '<em><b>Hydraulic Oil Level OK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HYDRAULIC_OIL_LEVEL_OK_VALUE
     * @generated
     * @ordered
     */
    HYDRAULIC_OIL_LEVEL_OK( 6, "hydraulicOilLevelOK", "hydraulicOilLevelOK" ),

    /**
     * The '<em><b>Hydraulic Fluid Level OK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HYDRAULIC_FLUID_LEVEL_OK_VALUE
     * @generated
     * @ordered
     */
    HYDRAULIC_FLUID_LEVEL_OK( 7, "hydraulicFluidLevelOK", "hydraulicFluidLevelOK" ),

    /**
     * The '<em><b>Check Oil Level OK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHECK_OIL_LEVEL_OK_VALUE
     * @generated
     * @ordered
     */
    CHECK_OIL_LEVEL_OK( 8, "checkOilLevelOK", "checkOilLevelOK" ),

    /**
     * The '<em><b>Operation Count</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OPERATION_COUNT_VALUE
     * @generated
     * @ordered
     */
    OPERATION_COUNT( 9, "operationCount", "operationCount" ),

    /**
     * The '<em><b>Motor Operations Count</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MOTOR_OPERATIONS_COUNT_VALUE
     * @generated
     * @ordered
     */
    MOTOR_OPERATIONS_COUNT( 10, "motorOperationsCount", "motorOperationsCount" ),

    /**
     * The '<em><b>Pump Motor Operation Count</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PUMP_MOTOR_OPERATION_COUNT_VALUE
     * @generated
     * @ordered
     */
    PUMP_MOTOR_OPERATION_COUNT( 11, "pumpMotorOperationCount", "pumpMotorOperationCount" ),

    /**
     * The '<em><b>Low To High Pressure Count</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOW_TO_HIGH_PRESSURE_COUNT_VALUE
     * @generated
     * @ordered
     */
    LOW_TO_HIGH_PRESSURE_COUNT( 12, "lowToHighPressureCount", "lowToHighPressureCount" );

    /**
     * The '<em><b>Visible Damage Or Leaks</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Visible Damage Or Leaks</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VISIBLE_DAMAGE_OR_LEAKS
     * @model name="visibleDamageOrLeaks"
     * @generated
     * @ordered
     */
    public static final int VISIBLE_DAMAGE_OR_LEAKS_VALUE = 0;

    /**
     * The '<em><b>Control Cabinet Heater On</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Control Cabinet Heater On</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONTROL_CABINET_HEATER_ON
     * @model name="controlCabinetHeaterOn"
     * @generated
     * @ordered
     */
    public static final int CONTROL_CABINET_HEATER_ON_VALUE = 1;

    /**
     * The '<em><b>Bushing Oil Levels OK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bushing Oil Levels OK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUSHING_OIL_LEVELS_OK
     * @model name="bushingOilLevelsOK"
     * @generated
     * @ordered
     */
    public static final int BUSHING_OIL_LEVELS_OK_VALUE = 2;

    /**
     * The '<em><b>Oil Tank Levels OK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oil Tank Levels OK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OIL_TANK_LEVELS_OK
     * @model name="oilTankLevelsOK"
     * @generated
     * @ordered
     */
    public static final int OIL_TANK_LEVELS_OK_VALUE = 3;

    /**
     * The '<em><b>Spring Pressure Reading OK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Spring Pressure Reading OK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SPRING_PRESSURE_READING_OK
     * @model name="springPressureReadingOK"
     * @generated
     * @ordered
     */
    public static final int SPRING_PRESSURE_READING_OK_VALUE = 4;

    /**
     * The '<em><b>Gas Indicator Normal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Gas Indicator Normal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GAS_INDICATOR_NORMAL
     * @model name="gasIndicatorNormal"
     * @generated
     * @ordered
     */
    public static final int GAS_INDICATOR_NORMAL_VALUE = 5;

    /**
     * The '<em><b>Hydraulic Oil Level OK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hydraulic Oil Level OK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HYDRAULIC_OIL_LEVEL_OK
     * @model name="hydraulicOilLevelOK"
     * @generated
     * @ordered
     */
    public static final int HYDRAULIC_OIL_LEVEL_OK_VALUE = 6;

    /**
     * The '<em><b>Hydraulic Fluid Level OK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hydraulic Fluid Level OK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HYDRAULIC_FLUID_LEVEL_OK
     * @model name="hydraulicFluidLevelOK"
     * @generated
     * @ordered
     */
    public static final int HYDRAULIC_FLUID_LEVEL_OK_VALUE = 7;

    /**
     * The '<em><b>Check Oil Level OK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Check Oil Level OK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHECK_OIL_LEVEL_OK
     * @model name="checkOilLevelOK"
     * @generated
     * @ordered
     */
    public static final int CHECK_OIL_LEVEL_OK_VALUE = 8;

    /**
     * The '<em><b>Operation Count</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Operation Count</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OPERATION_COUNT
     * @model name="operationCount"
     * @generated
     * @ordered
     */
    public static final int OPERATION_COUNT_VALUE = 9;

    /**
     * The '<em><b>Motor Operations Count</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Motor Operations Count</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MOTOR_OPERATIONS_COUNT
     * @model name="motorOperationsCount"
     * @generated
     * @ordered
     */
    public static final int MOTOR_OPERATIONS_COUNT_VALUE = 10;

    /**
     * The '<em><b>Pump Motor Operation Count</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pump Motor Operation Count</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PUMP_MOTOR_OPERATION_COUNT
     * @model name="pumpMotorOperationCount"
     * @generated
     * @ordered
     */
    public static final int PUMP_MOTOR_OPERATION_COUNT_VALUE = 11;

    /**
     * The '<em><b>Low To High Pressure Count</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Low To High Pressure Count</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOW_TO_HIGH_PRESSURE_COUNT
     * @model name="lowToHighPressureCount"
     * @generated
     * @ordered
     */
    public static final int LOW_TO_HIGH_PRESSURE_COUNT_VALUE = 12;

    /**
     * An array of all the '<em><b>Inspection Discrete Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final InspectionDiscreteKind[] VALUES_ARRAY = new InspectionDiscreteKind[] { VISIBLE_DAMAGE_OR_LEAKS,
            CONTROL_CABINET_HEATER_ON, BUSHING_OIL_LEVELS_OK, OIL_TANK_LEVELS_OK, SPRING_PRESSURE_READING_OK,
            GAS_INDICATOR_NORMAL, HYDRAULIC_OIL_LEVEL_OK, HYDRAULIC_FLUID_LEVEL_OK, CHECK_OIL_LEVEL_OK, OPERATION_COUNT,
            MOTOR_OPERATIONS_COUNT, PUMP_MOTOR_OPERATION_COUNT, LOW_TO_HIGH_PRESSURE_COUNT, };

    /**
     * A public read-only list of all the '<em><b>Inspection Discrete Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< InspectionDiscreteKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Inspection Discrete Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InspectionDiscreteKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            InspectionDiscreteKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Inspection Discrete Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InspectionDiscreteKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            InspectionDiscreteKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Inspection Discrete Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InspectionDiscreteKind get( int value ) {
        switch( value ) {
        case VISIBLE_DAMAGE_OR_LEAKS_VALUE:
            return VISIBLE_DAMAGE_OR_LEAKS;
        case CONTROL_CABINET_HEATER_ON_VALUE:
            return CONTROL_CABINET_HEATER_ON;
        case BUSHING_OIL_LEVELS_OK_VALUE:
            return BUSHING_OIL_LEVELS_OK;
        case OIL_TANK_LEVELS_OK_VALUE:
            return OIL_TANK_LEVELS_OK;
        case SPRING_PRESSURE_READING_OK_VALUE:
            return SPRING_PRESSURE_READING_OK;
        case GAS_INDICATOR_NORMAL_VALUE:
            return GAS_INDICATOR_NORMAL;
        case HYDRAULIC_OIL_LEVEL_OK_VALUE:
            return HYDRAULIC_OIL_LEVEL_OK;
        case HYDRAULIC_FLUID_LEVEL_OK_VALUE:
            return HYDRAULIC_FLUID_LEVEL_OK;
        case CHECK_OIL_LEVEL_OK_VALUE:
            return CHECK_OIL_LEVEL_OK;
        case OPERATION_COUNT_VALUE:
            return OPERATION_COUNT;
        case MOTOR_OPERATIONS_COUNT_VALUE:
            return MOTOR_OPERATIONS_COUNT;
        case PUMP_MOTOR_OPERATION_COUNT_VALUE:
            return PUMP_MOTOR_OPERATION_COUNT;
        case LOW_TO_HIGH_PRESSURE_COUNT_VALUE:
            return LOW_TO_HIGH_PRESSURE_COUNT;
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
    private InspectionDiscreteKind( int value, String name, String literal ) {
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

} //InspectionDiscreteKind
