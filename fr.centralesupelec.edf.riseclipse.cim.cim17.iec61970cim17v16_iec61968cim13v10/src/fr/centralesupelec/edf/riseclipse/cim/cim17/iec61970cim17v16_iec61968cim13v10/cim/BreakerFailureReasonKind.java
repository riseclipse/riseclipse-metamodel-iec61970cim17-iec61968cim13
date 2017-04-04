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
 * A representation of the literals of the enumeration '<em><b>Breaker Failure Reason Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBreakerFailureReasonKind()
 * @model
 * @generated
 */
public enum BreakerFailureReasonKind implements Enumerator {
    /**
     * The '<em><b>Blast Valve Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BLAST_VALVE_FAILURE_VALUE
     * @generated
     * @ordered
     */
    BLAST_VALVE_FAILURE( 0, "blastValveFailure", "blastValveFailure" ),

    /**
     * The '<em><b>Bushing Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUSHING_FAILURE_VALUE
     * @generated
     * @ordered
     */
    BUSHING_FAILURE( 1, "bushingFailure", "bushingFailure" ),

    /**
     * The '<em><b>Close Coil Open Shorted Failed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CLOSE_COIL_OPEN_SHORTED_FAILED_VALUE
     * @generated
     * @ordered
     */
    CLOSE_COIL_OPEN_SHORTED_FAILED( 2, "closeCoilOpenShortedFailed", "closeCoilOpenShortedFailed" ),

    /**
     * The '<em><b>Contaminated Air</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONTAMINATED_AIR_VALUE
     * @generated
     * @ordered
     */
    CONTAMINATED_AIR( 3, "contaminatedAir", "contaminatedAir" ),

    /**
     * The '<em><b>Contaminated Arc Chutes</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONTAMINATED_ARC_CHUTES_VALUE
     * @generated
     * @ordered
     */
    CONTAMINATED_ARC_CHUTES( 4, "contaminatedArcChutes", "contaminatedArcChutes" ),

    /**
     * The '<em><b>Contaminated Gas</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONTAMINATED_GAS_VALUE
     * @generated
     * @ordered
     */
    CONTAMINATED_GAS( 5, "contaminatedGas", "contaminatedGas" ),

    /**
     * The '<em><b>Contaminated Gas Air</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONTAMINATED_GAS_AIR_VALUE
     * @generated
     * @ordered
     */
    CONTAMINATED_GAS_AIR( 6, "contaminatedGasAir", "contaminatedGasAir" ),

    /**
     * The '<em><b>Control Circuit Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONTROL_CIRCUIT_FAILURE_VALUE
     * @generated
     * @ordered
     */
    CONTROL_CIRCUIT_FAILURE( 7, "controlCircuitFailure", "controlCircuitFailure" ),

    /**
     * The '<em><b>Degraded Lubrication</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEGRADED_LUBRICATION_VALUE
     * @generated
     * @ordered
     */
    DEGRADED_LUBRICATION( 8, "degradedLubrication", "degradedLubrication" ),

    /**
     * The '<em><b>External Or Internal Contamination</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXTERNAL_OR_INTERNAL_CONTAMINATION_VALUE
     * @generated
     * @ordered
     */
    EXTERNAL_OR_INTERNAL_CONTAMINATION( 9, "externalOrInternalContamination", "externalOrInternalContamination" ),

    /**
     * The '<em><b>High Pressure Air Plant</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HIGH_PRESSURE_AIR_PLANT_VALUE
     * @generated
     * @ordered
     */
    HIGH_PRESSURE_AIR_PLANT( 10, "highPressureAirPlant", "highPressureAirPlant" ),

    /**
     * The '<em><b>High Resistance Load Path</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HIGH_RESISTANCE_LOAD_PATH_VALUE
     * @generated
     * @ordered
     */
    HIGH_RESISTANCE_LOAD_PATH( 11, "highResistanceLoadPath", "highResistanceLoadPath" ),

    /**
     * The '<em><b>High Resistance Path</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HIGH_RESISTANCE_PATH_VALUE
     * @generated
     * @ordered
     */
    HIGH_RESISTANCE_PATH( 12, "highResistancePath", "highResistancePath" ),

    /**
     * The '<em><b>Interrupter Contact Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERRUPTER_CONTACT_FAILURE_VALUE
     * @generated
     * @ordered
     */
    INTERRUPTER_CONTACT_FAILURE( 13, "interrupterContactFailure", "interrupterContactFailure" ),

    /**
     * The '<em><b>Interrupter Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERRUPTER_FAILURE_VALUE
     * @generated
     * @ordered
     */
    INTERRUPTER_FAILURE( 14, "interrupterFailure", "interrupterFailure" ),

    /**
     * The '<em><b>Linkage Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LINKAGE_FAILURE_VALUE
     * @generated
     * @ordered
     */
    LINKAGE_FAILURE( 15, "linkageFailure", "linkageFailure" ),

    /**
     * The '<em><b>Loss Of Oil</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOSS_OF_OIL_VALUE
     * @generated
     * @ordered
     */
    LOSS_OF_OIL( 16, "lossOfOil", "lossOfOil" ),

    /**
     * The '<em><b>Loss Of Vacuum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOSS_OF_VACUUM_VALUE
     * @generated
     * @ordered
     */
    LOSS_OF_VACUUM( 17, "lossOfVacuum", "lossOfVacuum" ),

    /**
     * The '<em><b>Low Gas Pressure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOW_GAS_PRESSURE_VALUE
     * @generated
     * @ordered
     */
    LOW_GAS_PRESSURE( 18, "lowGasPressure", "lowGasPressure" ),

    /**
     * The '<em><b>Mechanism Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MECHANISM_FAILURE_VALUE
     * @generated
     * @ordered
     */
    MECHANISM_FAILURE( 19, "mechanismFailure", "mechanismFailure" ),

    /**
     * The '<em><b>Mechanism Or Linkage Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MECHANISM_OR_LINKAGE_FAILURE_VALUE
     * @generated
     * @ordered
     */
    MECHANISM_OR_LINKAGE_FAILURE( 20, "mechanismOrLinkageFailure", "mechanismOrLinkageFailure" ),

    /**
     * The '<em><b>Oil Related Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OIL_RELATED_FAILURE_VALUE
     * @generated
     * @ordered
     */
    OIL_RELATED_FAILURE( 21, "oilRelatedFailure", "oilRelatedFailure" ),

    /**
     * The '<em><b>Poor Oil Quality</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POOR_OIL_QUALITY_VALUE
     * @generated
     * @ordered
     */
    POOR_OIL_QUALITY( 22, "poorOilQuality", "poorOilQuality" ),

    /**
     * The '<em><b>Racking Mechanism Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RACKING_MECHANISM_FAILURE_VALUE
     * @generated
     * @ordered
     */
    RACKING_MECHANISM_FAILURE( 23, "rackingMechanismFailure", "rackingMechanismFailure" ),

    /**
     * The '<em><b>Resistor Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESISTOR_FAILURE_VALUE
     * @generated
     * @ordered
     */
    RESISTOR_FAILURE( 24, "resistorFailure", "resistorFailure" ),

    /**
     * The '<em><b>Resistor Grading Capacitor Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESISTOR_GRADING_CAPACITOR_FAILURE_VALUE
     * @generated
     * @ordered
     */
    RESISTOR_GRADING_CAPACITOR_FAILURE( 25, "resistorGradingCapacitorFailure", "resistorGradingCapacitorFailure" ),

    /**
     * The '<em><b>SF6 Blast Valve Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SF6_BLAST_VALVE_FAILURE_VALUE
     * @generated
     * @ordered
     */
    SF6_BLAST_VALVE_FAILURE( 26, "SF6BlastValveFailure", "SF6BlastValveFailure" ),

    /**
     * The '<em><b>SF6 Puffer Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SF6_PUFFER_FAILURE_VALUE
     * @generated
     * @ordered
     */
    SF6_PUFFER_FAILURE( 27, "SF6PufferFailure", "SF6PufferFailure" ),

    /**
     * The '<em><b>Solid Dielectric Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOLID_DIELECTRIC_FAILURE_VALUE
     * @generated
     * @ordered
     */
    SOLID_DIELECTRIC_FAILURE( 28, "solidDielectricFailure", "solidDielectricFailure" ),

    /**
     * The '<em><b>Stored Energy Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STORED_ENERGY_FAILURE_VALUE
     * @generated
     * @ordered
     */
    STORED_ENERGY_FAILURE( 29, "storedEnergyFailure", "storedEnergyFailure" ),

    /**
     * The '<em><b>Trip Coil Open Shorted Failed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRIP_COIL_OPEN_SHORTED_FAILED_VALUE
     * @generated
     * @ordered
     */
    TRIP_COIL_OPEN_SHORTED_FAILED( 30, "tripCoilOpenShortedFailed", "tripCoilOpenShortedFailed" );

    /**
     * The '<em><b>Blast Valve Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Blast Valve Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BLAST_VALVE_FAILURE
     * @model name="blastValveFailure"
     * @generated
     * @ordered
     */
    public static final int BLAST_VALVE_FAILURE_VALUE = 0;

    /**
     * The '<em><b>Bushing Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bushing Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUSHING_FAILURE
     * @model name="bushingFailure"
     * @generated
     * @ordered
     */
    public static final int BUSHING_FAILURE_VALUE = 1;

    /**
     * The '<em><b>Close Coil Open Shorted Failed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Close Coil Open Shorted Failed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CLOSE_COIL_OPEN_SHORTED_FAILED
     * @model name="closeCoilOpenShortedFailed"
     * @generated
     * @ordered
     */
    public static final int CLOSE_COIL_OPEN_SHORTED_FAILED_VALUE = 2;

    /**
     * The '<em><b>Contaminated Air</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Contaminated Air</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONTAMINATED_AIR
     * @model name="contaminatedAir"
     * @generated
     * @ordered
     */
    public static final int CONTAMINATED_AIR_VALUE = 3;

    /**
     * The '<em><b>Contaminated Arc Chutes</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Contaminated Arc Chutes</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONTAMINATED_ARC_CHUTES
     * @model name="contaminatedArcChutes"
     * @generated
     * @ordered
     */
    public static final int CONTAMINATED_ARC_CHUTES_VALUE = 4;

    /**
     * The '<em><b>Contaminated Gas</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Contaminated Gas</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONTAMINATED_GAS
     * @model name="contaminatedGas"
     * @generated
     * @ordered
     */
    public static final int CONTAMINATED_GAS_VALUE = 5;

    /**
     * The '<em><b>Contaminated Gas Air</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Contaminated Gas Air</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONTAMINATED_GAS_AIR
     * @model name="contaminatedGasAir"
     * @generated
     * @ordered
     */
    public static final int CONTAMINATED_GAS_AIR_VALUE = 6;

    /**
     * The '<em><b>Control Circuit Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Control Circuit Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONTROL_CIRCUIT_FAILURE
     * @model name="controlCircuitFailure"
     * @generated
     * @ordered
     */
    public static final int CONTROL_CIRCUIT_FAILURE_VALUE = 7;

    /**
     * The '<em><b>Degraded Lubrication</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Degraded Lubrication</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEGRADED_LUBRICATION
     * @model name="degradedLubrication"
     * @generated
     * @ordered
     */
    public static final int DEGRADED_LUBRICATION_VALUE = 8;

    /**
     * The '<em><b>External Or Internal Contamination</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>External Or Internal Contamination</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXTERNAL_OR_INTERNAL_CONTAMINATION
     * @model name="externalOrInternalContamination"
     * @generated
     * @ordered
     */
    public static final int EXTERNAL_OR_INTERNAL_CONTAMINATION_VALUE = 9;

    /**
     * The '<em><b>High Pressure Air Plant</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>High Pressure Air Plant</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HIGH_PRESSURE_AIR_PLANT
     * @model name="highPressureAirPlant"
     * @generated
     * @ordered
     */
    public static final int HIGH_PRESSURE_AIR_PLANT_VALUE = 10;

    /**
     * The '<em><b>High Resistance Load Path</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>High Resistance Load Path</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HIGH_RESISTANCE_LOAD_PATH
     * @model name="highResistanceLoadPath"
     * @generated
     * @ordered
     */
    public static final int HIGH_RESISTANCE_LOAD_PATH_VALUE = 11;

    /**
     * The '<em><b>High Resistance Path</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>High Resistance Path</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HIGH_RESISTANCE_PATH
     * @model name="highResistancePath"
     * @generated
     * @ordered
     */
    public static final int HIGH_RESISTANCE_PATH_VALUE = 12;

    /**
     * The '<em><b>Interrupter Contact Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Interrupter Contact Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTERRUPTER_CONTACT_FAILURE
     * @model name="interrupterContactFailure"
     * @generated
     * @ordered
     */
    public static final int INTERRUPTER_CONTACT_FAILURE_VALUE = 13;

    /**
     * The '<em><b>Interrupter Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Interrupter Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTERRUPTER_FAILURE
     * @model name="interrupterFailure"
     * @generated
     * @ordered
     */
    public static final int INTERRUPTER_FAILURE_VALUE = 14;

    /**
     * The '<em><b>Linkage Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Linkage Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LINKAGE_FAILURE
     * @model name="linkageFailure"
     * @generated
     * @ordered
     */
    public static final int LINKAGE_FAILURE_VALUE = 15;

    /**
     * The '<em><b>Loss Of Oil</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Loss Of Oil</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOSS_OF_OIL
     * @model name="lossOfOil"
     * @generated
     * @ordered
     */
    public static final int LOSS_OF_OIL_VALUE = 16;

    /**
     * The '<em><b>Loss Of Vacuum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Loss Of Vacuum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOSS_OF_VACUUM
     * @model name="lossOfVacuum"
     * @generated
     * @ordered
     */
    public static final int LOSS_OF_VACUUM_VALUE = 17;

    /**
     * The '<em><b>Low Gas Pressure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Low Gas Pressure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOW_GAS_PRESSURE
     * @model name="lowGasPressure"
     * @generated
     * @ordered
     */
    public static final int LOW_GAS_PRESSURE_VALUE = 18;

    /**
     * The '<em><b>Mechanism Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mechanism Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MECHANISM_FAILURE
     * @model name="mechanismFailure"
     * @generated
     * @ordered
     */
    public static final int MECHANISM_FAILURE_VALUE = 19;

    /**
     * The '<em><b>Mechanism Or Linkage Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mechanism Or Linkage Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MECHANISM_OR_LINKAGE_FAILURE
     * @model name="mechanismOrLinkageFailure"
     * @generated
     * @ordered
     */
    public static final int MECHANISM_OR_LINKAGE_FAILURE_VALUE = 20;

    /**
     * The '<em><b>Oil Related Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oil Related Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OIL_RELATED_FAILURE
     * @model name="oilRelatedFailure"
     * @generated
     * @ordered
     */
    public static final int OIL_RELATED_FAILURE_VALUE = 21;

    /**
     * The '<em><b>Poor Oil Quality</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Poor Oil Quality</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POOR_OIL_QUALITY
     * @model name="poorOilQuality"
     * @generated
     * @ordered
     */
    public static final int POOR_OIL_QUALITY_VALUE = 22;

    /**
     * The '<em><b>Racking Mechanism Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Racking Mechanism Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RACKING_MECHANISM_FAILURE
     * @model name="rackingMechanismFailure"
     * @generated
     * @ordered
     */
    public static final int RACKING_MECHANISM_FAILURE_VALUE = 23;

    /**
     * The '<em><b>Resistor Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Resistor Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RESISTOR_FAILURE
     * @model name="resistorFailure"
     * @generated
     * @ordered
     */
    public static final int RESISTOR_FAILURE_VALUE = 24;

    /**
     * The '<em><b>Resistor Grading Capacitor Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Resistor Grading Capacitor Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RESISTOR_GRADING_CAPACITOR_FAILURE
     * @model name="resistorGradingCapacitorFailure"
     * @generated
     * @ordered
     */
    public static final int RESISTOR_GRADING_CAPACITOR_FAILURE_VALUE = 25;

    /**
     * The '<em><b>SF6 Blast Valve Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SF6 Blast Valve Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SF6_BLAST_VALVE_FAILURE
     * @model name="SF6BlastValveFailure"
     * @generated
     * @ordered
     */
    public static final int SF6_BLAST_VALVE_FAILURE_VALUE = 26;

    /**
     * The '<em><b>SF6 Puffer Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SF6 Puffer Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SF6_PUFFER_FAILURE
     * @model name="SF6PufferFailure"
     * @generated
     * @ordered
     */
    public static final int SF6_PUFFER_FAILURE_VALUE = 27;

    /**
     * The '<em><b>Solid Dielectric Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Solid Dielectric Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SOLID_DIELECTRIC_FAILURE
     * @model name="solidDielectricFailure"
     * @generated
     * @ordered
     */
    public static final int SOLID_DIELECTRIC_FAILURE_VALUE = 28;

    /**
     * The '<em><b>Stored Energy Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Stored Energy Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STORED_ENERGY_FAILURE
     * @model name="storedEnergyFailure"
     * @generated
     * @ordered
     */
    public static final int STORED_ENERGY_FAILURE_VALUE = 29;

    /**
     * The '<em><b>Trip Coil Open Shorted Failed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Trip Coil Open Shorted Failed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRIP_COIL_OPEN_SHORTED_FAILED
     * @model name="tripCoilOpenShortedFailed"
     * @generated
     * @ordered
     */
    public static final int TRIP_COIL_OPEN_SHORTED_FAILED_VALUE = 30;

    /**
     * An array of all the '<em><b>Breaker Failure Reason Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final BreakerFailureReasonKind[] VALUES_ARRAY = new BreakerFailureReasonKind[] { BLAST_VALVE_FAILURE,
            BUSHING_FAILURE, CLOSE_COIL_OPEN_SHORTED_FAILED, CONTAMINATED_AIR, CONTAMINATED_ARC_CHUTES,
            CONTAMINATED_GAS, CONTAMINATED_GAS_AIR, CONTROL_CIRCUIT_FAILURE, DEGRADED_LUBRICATION,
            EXTERNAL_OR_INTERNAL_CONTAMINATION, HIGH_PRESSURE_AIR_PLANT, HIGH_RESISTANCE_LOAD_PATH,
            HIGH_RESISTANCE_PATH, INTERRUPTER_CONTACT_FAILURE, INTERRUPTER_FAILURE, LINKAGE_FAILURE, LOSS_OF_OIL,
            LOSS_OF_VACUUM, LOW_GAS_PRESSURE, MECHANISM_FAILURE, MECHANISM_OR_LINKAGE_FAILURE, OIL_RELATED_FAILURE,
            POOR_OIL_QUALITY, RACKING_MECHANISM_FAILURE, RESISTOR_FAILURE, RESISTOR_GRADING_CAPACITOR_FAILURE,
            SF6_BLAST_VALVE_FAILURE, SF6_PUFFER_FAILURE, SOLID_DIELECTRIC_FAILURE, STORED_ENERGY_FAILURE,
            TRIP_COIL_OPEN_SHORTED_FAILED, };

    /**
     * A public read-only list of all the '<em><b>Breaker Failure Reason Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< BreakerFailureReasonKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Breaker Failure Reason Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerFailureReasonKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BreakerFailureReasonKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Breaker Failure Reason Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerFailureReasonKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BreakerFailureReasonKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Breaker Failure Reason Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerFailureReasonKind get( int value ) {
        switch( value ) {
        case BLAST_VALVE_FAILURE_VALUE:
            return BLAST_VALVE_FAILURE;
        case BUSHING_FAILURE_VALUE:
            return BUSHING_FAILURE;
        case CLOSE_COIL_OPEN_SHORTED_FAILED_VALUE:
            return CLOSE_COIL_OPEN_SHORTED_FAILED;
        case CONTAMINATED_AIR_VALUE:
            return CONTAMINATED_AIR;
        case CONTAMINATED_ARC_CHUTES_VALUE:
            return CONTAMINATED_ARC_CHUTES;
        case CONTAMINATED_GAS_VALUE:
            return CONTAMINATED_GAS;
        case CONTAMINATED_GAS_AIR_VALUE:
            return CONTAMINATED_GAS_AIR;
        case CONTROL_CIRCUIT_FAILURE_VALUE:
            return CONTROL_CIRCUIT_FAILURE;
        case DEGRADED_LUBRICATION_VALUE:
            return DEGRADED_LUBRICATION;
        case EXTERNAL_OR_INTERNAL_CONTAMINATION_VALUE:
            return EXTERNAL_OR_INTERNAL_CONTAMINATION;
        case HIGH_PRESSURE_AIR_PLANT_VALUE:
            return HIGH_PRESSURE_AIR_PLANT;
        case HIGH_RESISTANCE_LOAD_PATH_VALUE:
            return HIGH_RESISTANCE_LOAD_PATH;
        case HIGH_RESISTANCE_PATH_VALUE:
            return HIGH_RESISTANCE_PATH;
        case INTERRUPTER_CONTACT_FAILURE_VALUE:
            return INTERRUPTER_CONTACT_FAILURE;
        case INTERRUPTER_FAILURE_VALUE:
            return INTERRUPTER_FAILURE;
        case LINKAGE_FAILURE_VALUE:
            return LINKAGE_FAILURE;
        case LOSS_OF_OIL_VALUE:
            return LOSS_OF_OIL;
        case LOSS_OF_VACUUM_VALUE:
            return LOSS_OF_VACUUM;
        case LOW_GAS_PRESSURE_VALUE:
            return LOW_GAS_PRESSURE;
        case MECHANISM_FAILURE_VALUE:
            return MECHANISM_FAILURE;
        case MECHANISM_OR_LINKAGE_FAILURE_VALUE:
            return MECHANISM_OR_LINKAGE_FAILURE;
        case OIL_RELATED_FAILURE_VALUE:
            return OIL_RELATED_FAILURE;
        case POOR_OIL_QUALITY_VALUE:
            return POOR_OIL_QUALITY;
        case RACKING_MECHANISM_FAILURE_VALUE:
            return RACKING_MECHANISM_FAILURE;
        case RESISTOR_FAILURE_VALUE:
            return RESISTOR_FAILURE;
        case RESISTOR_GRADING_CAPACITOR_FAILURE_VALUE:
            return RESISTOR_GRADING_CAPACITOR_FAILURE;
        case SF6_BLAST_VALVE_FAILURE_VALUE:
            return SF6_BLAST_VALVE_FAILURE;
        case SF6_PUFFER_FAILURE_VALUE:
            return SF6_PUFFER_FAILURE;
        case SOLID_DIELECTRIC_FAILURE_VALUE:
            return SOLID_DIELECTRIC_FAILURE;
        case STORED_ENERGY_FAILURE_VALUE:
            return STORED_ENERGY_FAILURE;
        case TRIP_COIL_OPEN_SHORTED_FAILED_VALUE:
            return TRIP_COIL_OPEN_SHORTED_FAILED;
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
    private BreakerFailureReasonKind( int value, String name, String literal ) {
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

} //BreakerFailureReasonKind
