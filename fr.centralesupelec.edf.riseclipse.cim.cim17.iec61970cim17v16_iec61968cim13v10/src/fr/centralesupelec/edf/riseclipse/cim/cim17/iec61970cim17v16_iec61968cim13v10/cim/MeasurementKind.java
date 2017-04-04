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
 * A representation of the literals of the enumeration '<em><b>Measurement Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeasurementKind()
 * @model
 * @generated
 */
public enum MeasurementKind implements Enumerator {
    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE( 0, "none", "none" ),

    /**
     * The '<em><b>Apparent Power Factor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #APPARENT_POWER_FACTOR_VALUE
     * @generated
     * @ordered
     */
    APPARENT_POWER_FACTOR( 1, "apparentPowerFactor", "apparentPowerFactor" ),

    /**
     * The '<em><b>Currency</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CURRENCY_VALUE
     * @generated
     * @ordered
     */
    CURRENCY( 2, "currency", "currency" ),

    /**
     * The '<em><b>Current</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CURRENT_VALUE
     * @generated
     * @ordered
     */
    CURRENT( 3, "current", "current" ),

    /**
     * The '<em><b>Current Angle</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CURRENT_ANGLE_VALUE
     * @generated
     * @ordered
     */
    CURRENT_ANGLE( 4, "currentAngle", "currentAngle" ),

    /**
     * The '<em><b>Current Imbalance</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CURRENT_IMBALANCE_VALUE
     * @generated
     * @ordered
     */
    CURRENT_IMBALANCE( 5, "currentImbalance", "currentImbalance" ),

    /**
     * The '<em><b>Date</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATE_VALUE
     * @generated
     * @ordered
     */
    DATE( 6, "date", "date" ),

    /**
     * The '<em><b>Demand</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEMAND_VALUE
     * @generated
     * @ordered
     */
    DEMAND( 7, "demand", "demand" ),

    /**
     * The '<em><b>Distance</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISTANCE_VALUE
     * @generated
     * @ordered
     */
    DISTANCE( 8, "distance", "distance" ),

    /**
     * The '<em><b>Distortion Volt Amp</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISTORTION_VOLT_AMP_VALUE
     * @generated
     * @ordered
     */
    DISTORTION_VOLT_AMP( 9, "distortionVoltAmp", "distortionVoltAmp" ),

    /**
     * The '<em><b>Energization</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENERGIZATION_VALUE
     * @generated
     * @ordered
     */
    ENERGIZATION( 10, "energization", "energization" ),

    /**
     * The '<em><b>Energy</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENERGY_VALUE
     * @generated
     * @ordered
     */
    ENERGY( 11, "energy", "energy" ),

    /**
     * The '<em><b>Energization Load Side</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENERGIZATION_LOAD_SIDE_VALUE
     * @generated
     * @ordered
     */
    ENERGIZATION_LOAD_SIDE( 12, "energizationLoadSide", "energizationLoadSide" ),

    /**
     * The '<em><b>Fan</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FAN_VALUE
     * @generated
     * @ordered
     */
    FAN( 13, "fan", "fan" ),

    /**
     * The '<em><b>Frequency</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FREQUENCY_VALUE
     * @generated
     * @ordered
     */
    FREQUENCY( 14, "frequency", "frequency" ),

    /**
     * The '<em><b>Fund</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FUND_VALUE
     * @generated
     * @ordered
     */
    FUND( 15, "fund", "fund" ),

    /**
     * The '<em><b>Ieee1366 ASAI</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_ASAI_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_ASAI( 16, "ieee1366ASAI", "ieee1366ASAI" ),

    /**
     * The '<em><b>Ieee1366 ASIDI</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_ASIDI_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_ASIDI( 17, "ieee1366ASIDI", "ieee1366ASIDI" ),

    /**
     * The '<em><b>Ieee1366 ASIFI</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_ASIFI_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_ASIFI( 18, "ieee1366ASIFI", "ieee1366ASIFI" ),

    /**
     * The '<em><b>Ieee1366 CAIDI</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_CAIDI_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_CAIDI( 19, "ieee1366CAIDI", "ieee1366CAIDI" ),

    /**
     * The '<em><b>Ieee1366 CAIFI</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_CAIFI_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_CAIFI( 20, "ieee1366CAIFI", "ieee1366CAIFI" ),

    /**
     * The '<em><b>Ieee1366 CEM In</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_CEM_IN_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_CEM_IN( 21, "ieee1366CEMIn", "ieee1366CEMIn" ),

    /**
     * The '<em><b>Ieee1366 CEMSM In</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_CEMSM_IN_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_CEMSM_IN( 22, "ieee1366CEMSMIn", "ieee1366CEMSMIn" ),

    /**
     * The '<em><b>Ieee1366 CTAIDI</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_CTAIDI_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_CTAIDI( 23, "ieee1366CTAIDI", "ieee1366CTAIDI" ),

    /**
     * The '<em><b>Ieee1366 MAIFI</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_MAIFI_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_MAIFI( 24, "ieee1366MAIFI", "ieee1366MAIFI" ),

    /**
     * The '<em><b>Ieee1366 MAIF Ie</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_MAIF_IE_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_MAIF_IE( 25, "ieee1366MAIFIe", "ieee1366MAIFIe" ),

    /**
     * The '<em><b>Ieee1366 SAIDI</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_SAIDI_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_SAIDI( 26, "ieee1366SAIDI", "ieee1366SAIDI" ),

    /**
     * The '<em><b>Ieee1366 SAIFI</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_SAIFI_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_SAIFI( 27, "ieee1366SAIFI", "ieee1366SAIFI" ),

    /**
     * The '<em><b>Line Loss</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LINE_LOSS_VALUE
     * @generated
     * @ordered
     */
    LINE_LOSS( 28, "lineLoss", "lineLoss" ),

    /**
     * The '<em><b>Loss</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOSS_VALUE
     * @generated
     * @ordered
     */
    LOSS( 29, "loss", "loss" ),

    /**
     * The '<em><b>Negative Sequence</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NEGATIVE_SEQUENCE_VALUE
     * @generated
     * @ordered
     */
    NEGATIVE_SEQUENCE( 30, "negativeSequence", "negativeSequence" ),

    /**
     * The '<em><b>Phasor Power Factor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PHASOR_POWER_FACTOR_VALUE
     * @generated
     * @ordered
     */
    PHASOR_POWER_FACTOR( 31, "phasorPowerFactor", "phasorPowerFactor" ),

    /**
     * The '<em><b>Phasor Reactive Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PHASOR_REACTIVE_POWER_VALUE
     * @generated
     * @ordered
     */
    PHASOR_REACTIVE_POWER( 32, "phasorReactivePower", "phasorReactivePower" ),

    /**
     * The '<em><b>Positive Sequence</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POSITIVE_SEQUENCE_VALUE
     * @generated
     * @ordered
     */
    POSITIVE_SEQUENCE( 33, "positiveSequence", "positiveSequence" ),

    /**
     * The '<em><b>Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POWER_VALUE
     * @generated
     * @ordered
     */
    POWER( 34, "power", "power" ),

    /**
     * The '<em><b>Power Factor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POWER_FACTOR_VALUE
     * @generated
     * @ordered
     */
    POWER_FACTOR( 35, "powerFactor", "powerFactor" ),

    /**
     * The '<em><b>Quantity Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QUANTITY_POWER_VALUE
     * @generated
     * @ordered
     */
    QUANTITY_POWER( 36, "quantityPower", "quantityPower" ),

    /**
     * The '<em><b>Sag</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAG_VALUE
     * @generated
     * @ordered
     */
    SAG( 37, "sag", "sag" ),

    /**
     * The '<em><b>Swell</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SWELL_VALUE
     * @generated
     * @ordered
     */
    SWELL( 38, "swell", "swell" ),

    /**
     * The '<em><b>Switch Position</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SWITCH_POSITION_VALUE
     * @generated
     * @ordered
     */
    SWITCH_POSITION( 39, "switchPosition", "switchPosition" ),

    /**
     * The '<em><b>Tap Position</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TAP_POSITION_VALUE
     * @generated
     * @ordered
     */
    TAP_POSITION( 40, "tapPosition", "tapPosition" ),

    /**
     * The '<em><b>Tariff Rate</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TARIFF_RATE_VALUE
     * @generated
     * @ordered
     */
    TARIFF_RATE( 41, "tariffRate", "tariffRate" ),

    /**
     * The '<em><b>Temperature</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TEMPERATURE_VALUE
     * @generated
     * @ordered
     */
    TEMPERATURE( 42, "temperature", "temperature" ),

    /**
     * The '<em><b>Total Harmonic Distortion</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOTAL_HARMONIC_DISTORTION_VALUE
     * @generated
     * @ordered
     */
    TOTAL_HARMONIC_DISTORTION( 43, "totalHarmonicDistortion", "totalHarmonicDistortion" ),

    /**
     * The '<em><b>Transformer Loss</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRANSFORMER_LOSS_VALUE
     * @generated
     * @ordered
     */
    TRANSFORMER_LOSS( 44, "transformerLoss", "transformerLoss" ),

    /**
     * The '<em><b>Unipede Voltage Dip10to15</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNIPEDE_VOLTAGE_DIP10TO15_VALUE
     * @generated
     * @ordered
     */
    UNIPEDE_VOLTAGE_DIP10TO15( 45, "unipedeVoltageDip10to15", "unipedeVoltageDip10to15" ),

    /**
     * The '<em><b>Unipede Voltage Dip15to30</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNIPEDE_VOLTAGE_DIP15TO30_VALUE
     * @generated
     * @ordered
     */
    UNIPEDE_VOLTAGE_DIP15TO30( 46, "unipedeVoltageDip15to30", "unipedeVoltageDip15to30" ),

    /**
     * The '<em><b>Unipede Voltage Dip30to60</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNIPEDE_VOLTAGE_DIP30TO60_VALUE
     * @generated
     * @ordered
     */
    UNIPEDE_VOLTAGE_DIP30TO60( 47, "unipedeVoltageDip30to60", "unipedeVoltageDip30to60" ),

    /**
     * The '<em><b>Unipede Voltage Dip60to90</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNIPEDE_VOLTAGE_DIP60TO90_VALUE
     * @generated
     * @ordered
     */
    UNIPEDE_VOLTAGE_DIP60TO90( 48, "unipedeVoltageDip60to90", "unipedeVoltageDip60to90" ),

    /**
     * The '<em><b>Unipede Voltage Dip90to100</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNIPEDE_VOLTAGE_DIP90TO100_VALUE
     * @generated
     * @ordered
     */
    UNIPEDE_VOLTAGE_DIP90TO100( 49, "unipedeVoltageDip90to100", "unipedeVoltageDip90to100" ),

    /**
     * The '<em><b>Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    VOLTAGE( 50, "voltage", "voltage" ),

    /**
     * The '<em><b>Voltage Angle</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOLTAGE_ANGLE_VALUE
     * @generated
     * @ordered
     */
    VOLTAGE_ANGLE( 51, "voltageAngle", "voltageAngle" ),

    /**
     * The '<em><b>Voltage Excursion</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOLTAGE_EXCURSION_VALUE
     * @generated
     * @ordered
     */
    VOLTAGE_EXCURSION( 52, "voltageExcursion", "voltageExcursion" ),

    /**
     * The '<em><b>Voltage Imbalance</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOLTAGE_IMBALANCE_VALUE
     * @generated
     * @ordered
     */
    VOLTAGE_IMBALANCE( 53, "voltageImbalance", "voltageImbalance" ),

    /**
     * The '<em><b>Volume</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOLUME_VALUE
     * @generated
     * @ordered
     */
    VOLUME( 54, "volume", "volume" ),

    /**
     * The '<em><b>Zero Flow Duration</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ZERO_FLOW_DURATION_VALUE
     * @generated
     * @ordered
     */
    ZERO_FLOW_DURATION( 55, "zeroFlowDuration", "zeroFlowDuration" ),

    /**
     * The '<em><b>Zero Sequence</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ZERO_SEQUENCE_VALUE
     * @generated
     * @ordered
     */
    ZERO_SEQUENCE( 56, "zeroSequence", "zeroSequence" ),

    /**
     * The '<em><b>Distortion Power Factor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISTORTION_POWER_FACTOR_VALUE
     * @generated
     * @ordered
     */
    DISTORTION_POWER_FACTOR( 57, "distortionPowerFactor", "distortionPowerFactor" ),

    /**
     * The '<em><b>Frequency Excursion</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FREQUENCY_EXCURSION_VALUE
     * @generated
     * @ordered
     */
    FREQUENCY_EXCURSION( 58, "frequencyExcursion", "frequencyExcursion" ),

    /**
     * The '<em><b>Application Context</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #APPLICATION_CONTEXT_VALUE
     * @generated
     * @ordered
     */
    APPLICATION_CONTEXT( 59, "applicationContext", "applicationContext" ),

    /**
     * The '<em><b>Ap Title</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AP_TITLE_VALUE
     * @generated
     * @ordered
     */
    AP_TITLE( 60, "apTitle", "apTitle" ),

    /**
     * The '<em><b>Asset Number</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSET_NUMBER_VALUE
     * @generated
     * @ordered
     */
    ASSET_NUMBER( 61, "assetNumber", "assetNumber" ),

    /**
     * The '<em><b>Bandwidth</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BANDWIDTH_VALUE
     * @generated
     * @ordered
     */
    BANDWIDTH( 62, "bandwidth", "bandwidth" ),

    /**
     * The '<em><b>Battery Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BATTERY_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    BATTERY_VOLTAGE( 63, "batteryVoltage", "batteryVoltage" ),

    /**
     * The '<em><b>Broadcast Address</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BROADCAST_ADDRESS_VALUE
     * @generated
     * @ordered
     */
    BROADCAST_ADDRESS( 64, "broadcastAddress", "broadcastAddress" ),

    /**
     * The '<em><b>Device Address Type1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEVICE_ADDRESS_TYPE1_VALUE
     * @generated
     * @ordered
     */
    DEVICE_ADDRESS_TYPE1( 65, "deviceAddressType1", "deviceAddressType1" ),

    /**
     * The '<em><b>Device Address Type2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEVICE_ADDRESS_TYPE2_VALUE
     * @generated
     * @ordered
     */
    DEVICE_ADDRESS_TYPE2( 66, "deviceAddressType2", "deviceAddressType2" ),

    /**
     * The '<em><b>Device Address Type3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEVICE_ADDRESS_TYPE3_VALUE
     * @generated
     * @ordered
     */
    DEVICE_ADDRESS_TYPE3( 67, "deviceAddressType3", "deviceAddressType3" ),

    /**
     * The '<em><b>Device Address Type4</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEVICE_ADDRESS_TYPE4_VALUE
     * @generated
     * @ordered
     */
    DEVICE_ADDRESS_TYPE4( 68, "deviceAddressType4", "deviceAddressType4" ),

    /**
     * The '<em><b>Device Class</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEVICE_CLASS_VALUE
     * @generated
     * @ordered
     */
    DEVICE_CLASS( 69, "deviceClass", "deviceClass" ),

    /**
     * The '<em><b>Electronic Serial Number</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ELECTRONIC_SERIAL_NUMBER_VALUE
     * @generated
     * @ordered
     */
    ELECTRONIC_SERIAL_NUMBER( 70, "electronicSerialNumber", "electronicSerialNumber" ),

    /**
     * The '<em><b>End Device ID</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #END_DEVICE_ID_VALUE
     * @generated
     * @ordered
     */
    END_DEVICE_ID( 71, "endDeviceID", "endDeviceID" ),

    /**
     * The '<em><b>Group Address Type1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GROUP_ADDRESS_TYPE1_VALUE
     * @generated
     * @ordered
     */
    GROUP_ADDRESS_TYPE1( 72, "groupAddressType1", "groupAddressType1" ),

    /**
     * The '<em><b>Group Address Type2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GROUP_ADDRESS_TYPE2_VALUE
     * @generated
     * @ordered
     */
    GROUP_ADDRESS_TYPE2( 73, "groupAddressType2", "groupAddressType2" ),

    /**
     * The '<em><b>Group Address Type3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GROUP_ADDRESS_TYPE3_VALUE
     * @generated
     * @ordered
     */
    GROUP_ADDRESS_TYPE3( 74, "groupAddressType3", "groupAddressType3" ),

    /**
     * The '<em><b>Group Address Type4</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GROUP_ADDRESS_TYPE4_VALUE
     * @generated
     * @ordered
     */
    GROUP_ADDRESS_TYPE4( 75, "groupAddressType4", "groupAddressType4" ),

    /**
     * The '<em><b>Ip Address</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IP_ADDRESS_VALUE
     * @generated
     * @ordered
     */
    IP_ADDRESS( 76, "ipAddress", "ipAddress" ),

    /**
     * The '<em><b>Mac Address</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAC_ADDRESS_VALUE
     * @generated
     * @ordered
     */
    MAC_ADDRESS( 77, "macAddress", "macAddress" ),

    /**
     * The '<em><b>Mfg Assigned Configuration ID</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MFG_ASSIGNED_CONFIGURATION_ID_VALUE
     * @generated
     * @ordered
     */
    MFG_ASSIGNED_CONFIGURATION_ID( 78, "mfgAssignedConfigurationID", "mfgAssignedConfigurationID" ),

    /**
     * The '<em><b>Mfg Assigned Physical Serial Number</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MFG_ASSIGNED_PHYSICAL_SERIAL_NUMBER_VALUE
     * @generated
     * @ordered
     */
    MFG_ASSIGNED_PHYSICAL_SERIAL_NUMBER( 79, "mfgAssignedPhysicalSerialNumber", "mfgAssignedPhysicalSerialNumber" ),

    /**
     * The '<em><b>Mfg Assigned Product Number</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MFG_ASSIGNED_PRODUCT_NUMBER_VALUE
     * @generated
     * @ordered
     */
    MFG_ASSIGNED_PRODUCT_NUMBER( 80, "mfgAssignedProductNumber", "mfgAssignedProductNumber" ),

    /**
     * The '<em><b>Mfg Assigned Unique Communication Address</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MFG_ASSIGNED_UNIQUE_COMMUNICATION_ADDRESS_VALUE
     * @generated
     * @ordered
     */
    MFG_ASSIGNED_UNIQUE_COMMUNICATION_ADDRESS( 81, "mfgAssignedUniqueCommunicationAddress", "mfgAssignedUniqueCommunicationAddress" ),

    /**
     * The '<em><b>Multi Cast Address</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MULTI_CAST_ADDRESS_VALUE
     * @generated
     * @ordered
     */
    MULTI_CAST_ADDRESS( 82, "multiCastAddress", "multiCastAddress" ),

    /**
     * The '<em><b>One Way Address</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ONE_WAY_ADDRESS_VALUE
     * @generated
     * @ordered
     */
    ONE_WAY_ADDRESS( 83, "oneWayAddress", "oneWayAddress" ),

    /**
     * The '<em><b>Signal Strength</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SIGNAL_STRENGTH_VALUE
     * @generated
     * @ordered
     */
    SIGNAL_STRENGTH( 84, "signalStrength", "signalStrength" ),

    /**
     * The '<em><b>Two Way Address</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TWO_WAY_ADDRESS_VALUE
     * @generated
     * @ordered
     */
    TWO_WAY_ADDRESS( 85, "twoWayAddress", "twoWayAddress" ),

    /**
     * The '<em><b>Signalto Noise Ratio</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SIGNALTO_NOISE_RATIO_VALUE
     * @generated
     * @ordered
     */
    SIGNALTO_NOISE_RATIO( 86, "signaltoNoiseRatio", "signaltoNoiseRatio" ),

    /**
     * The '<em><b>Alarm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ALARM_VALUE
     * @generated
     * @ordered
     */
    ALARM( 87, "alarm", "alarm" ),

    /**
     * The '<em><b>Battery Carryover</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BATTERY_CARRYOVER_VALUE
     * @generated
     * @ordered
     */
    BATTERY_CARRYOVER( 88, "batteryCarryover", "batteryCarryover" ),

    /**
     * The '<em><b>Data Overflow Alarm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATA_OVERFLOW_ALARM_VALUE
     * @generated
     * @ordered
     */
    DATA_OVERFLOW_ALARM( 89, "dataOverflowAlarm", "dataOverflowAlarm" ),

    /**
     * The '<em><b>Demand Limit</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEMAND_LIMIT_VALUE
     * @generated
     * @ordered
     */
    DEMAND_LIMIT( 90, "demandLimit", "demandLimit" ),

    /**
     * The '<em><b>Demand Reset</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEMAND_RESET_VALUE
     * @generated
     * @ordered
     */
    DEMAND_RESET( 91, "demandReset", "demandReset" ),

    /**
     * The '<em><b>Diagnostic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DIAGNOSTIC_VALUE
     * @generated
     * @ordered
     */
    DIAGNOSTIC( 92, "diagnostic", "diagnostic" ),

    /**
     * The '<em><b>Emergency Limit</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EMERGENCY_LIMIT_VALUE
     * @generated
     * @ordered
     */
    EMERGENCY_LIMIT( 93, "emergencyLimit", "emergencyLimit" ),

    /**
     * The '<em><b>Encoder Tamper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENCODER_TAMPER_VALUE
     * @generated
     * @ordered
     */
    ENCODER_TAMPER( 94, "encoderTamper", "encoderTamper" ),

    /**
     * The '<em><b>Ieee1366 Momentary Interruption</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_MOMENTARY_INTERRUPTION_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_MOMENTARY_INTERRUPTION( 95, "ieee1366MomentaryInterruption", "ieee1366MomentaryInterruption" ),

    /**
     * The '<em><b>Ieee1366 Momentary Interruption Event</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_MOMENTARY_INTERRUPTION_EVENT_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_MOMENTARY_INTERRUPTION_EVENT( 96, "ieee1366MomentaryInterruptionEvent", "ieee1366MomentaryInterruptionEvent" ),

    /**
     * The '<em><b>Ieee1366 Sustained Interruption</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IEEE1366_SUSTAINED_INTERRUPTION_VALUE
     * @generated
     * @ordered
     */
    IEEE1366_SUSTAINED_INTERRUPTION( 97, "ieee1366SustainedInterruption", "ieee1366SustainedInterruption" ),

    /**
     * The '<em><b>Interruption Behaviour</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERRUPTION_BEHAVIOUR_VALUE
     * @generated
     * @ordered
     */
    INTERRUPTION_BEHAVIOUR( 98, "interruptionBehaviour", "interruptionBehaviour" ),

    /**
     * The '<em><b>Inversion Tamper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INVERSION_TAMPER_VALUE
     * @generated
     * @ordered
     */
    INVERSION_TAMPER( 99, "inversionTamper", "inversionTamper" ),

    /**
     * The '<em><b>Load Interrupt</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOAD_INTERRUPT_VALUE
     * @generated
     * @ordered
     */
    LOAD_INTERRUPT( 100, "loadInterrupt", "loadInterrupt" ),

    /**
     * The '<em><b>Load Shed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOAD_SHED_VALUE
     * @generated
     * @ordered
     */
    LOAD_SHED( 101, "loadShed", "loadShed" ),

    /**
     * The '<em><b>Maintenance</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAINTENANCE_VALUE
     * @generated
     * @ordered
     */
    MAINTENANCE( 102, "maintenance", "maintenance" ),

    /**
     * The '<em><b>Physical Tamper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PHYSICAL_TAMPER_VALUE
     * @generated
     * @ordered
     */
    PHYSICAL_TAMPER( 103, "physicalTamper", "physicalTamper" ),

    /**
     * The '<em><b>Power Loss Tamper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POWER_LOSS_TAMPER_VALUE
     * @generated
     * @ordered
     */
    POWER_LOSS_TAMPER( 104, "powerLossTamper", "powerLossTamper" ),

    /**
     * The '<em><b>Power Outage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POWER_OUTAGE_VALUE
     * @generated
     * @ordered
     */
    POWER_OUTAGE( 105, "powerOutage", "powerOutage" ),

    /**
     * The '<em><b>Power Quality</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POWER_QUALITY_VALUE
     * @generated
     * @ordered
     */
    POWER_QUALITY( 106, "powerQuality", "powerQuality" ),

    /**
     * The '<em><b>Power Restoration</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POWER_RESTORATION_VALUE
     * @generated
     * @ordered
     */
    POWER_RESTORATION( 107, "powerRestoration", "powerRestoration" ),

    /**
     * The '<em><b>Programmed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PROGRAMMED_VALUE
     * @generated
     * @ordered
     */
    PROGRAMMED( 108, "programmed", "programmed" ),

    /**
     * The '<em><b>Pushbutton</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PUSHBUTTON_VALUE
     * @generated
     * @ordered
     */
    PUSHBUTTON( 109, "pushbutton", "pushbutton" ),

    /**
     * The '<em><b>Relay Activation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RELAY_ACTIVATION_VALUE
     * @generated
     * @ordered
     */
    RELAY_ACTIVATION( 110, "relayActivation", "relayActivation" ),

    /**
     * The '<em><b>Relay Cycle</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RELAY_CYCLE_VALUE
     * @generated
     * @ordered
     */
    RELAY_CYCLE( 111, "relayCycle", "relayCycle" ),

    /**
     * The '<em><b>Removal Tamper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOVAL_TAMPER_VALUE
     * @generated
     * @ordered
     */
    REMOVAL_TAMPER( 112, "removalTamper", "removalTamper" ),

    /**
     * The '<em><b>Reprogramming Tamper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REPROGRAMMING_TAMPER_VALUE
     * @generated
     * @ordered
     */
    REPROGRAMMING_TAMPER( 113, "reprogrammingTamper", "reprogrammingTamper" ),

    /**
     * The '<em><b>Reverse Rotation Tamper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REVERSE_ROTATION_TAMPER_VALUE
     * @generated
     * @ordered
     */
    REVERSE_ROTATION_TAMPER( 114, "reverseRotationTamper", "reverseRotationTamper" ),

    /**
     * The '<em><b>Switch Armed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SWITCH_ARMED_VALUE
     * @generated
     * @ordered
     */
    SWITCH_ARMED( 115, "switchArmed", "switchArmed" ),

    /**
     * The '<em><b>Switch Disabled</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SWITCH_DISABLED_VALUE
     * @generated
     * @ordered
     */
    SWITCH_DISABLED( 116, "switchDisabled", "switchDisabled" ),

    /**
     * The '<em><b>Tamper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TAMPER_VALUE
     * @generated
     * @ordered
     */
    TAMPER( 117, "tamper", "tamper" ),

    /**
     * The '<em><b>Watchdog Timeout</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WATCHDOG_TIMEOUT_VALUE
     * @generated
     * @ordered
     */
    WATCHDOG_TIMEOUT( 118, "watchdogTimeout", "watchdogTimeout" ),

    /**
     * The '<em><b>Bill Last Period</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BILL_LAST_PERIOD_VALUE
     * @generated
     * @ordered
     */
    BILL_LAST_PERIOD( 119, "billLastPeriod", "billLastPeriod" ),

    /**
     * The '<em><b>Bill To Date</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BILL_TO_DATE_VALUE
     * @generated
     * @ordered
     */
    BILL_TO_DATE( 120, "billToDate", "billToDate" ),

    /**
     * The '<em><b>Bill Carryover</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BILL_CARRYOVER_VALUE
     * @generated
     * @ordered
     */
    BILL_CARRYOVER( 121, "billCarryover", "billCarryover" ),

    /**
     * The '<em><b>Connection Fee</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONNECTION_FEE_VALUE
     * @generated
     * @ordered
     */
    CONNECTION_FEE( 122, "connectionFee", "connectionFee" ),

    /**
     * The '<em><b>Audible Volume</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AUDIBLE_VOLUME_VALUE
     * @generated
     * @ordered
     */
    AUDIBLE_VOLUME( 123, "audibleVolume", "audibleVolume" ),

    /**
     * The '<em><b>Volumetric Flow</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOLUMETRIC_FLOW_VALUE
     * @generated
     * @ordered
     */
    VOLUMETRIC_FLOW( 124, "volumetricFlow", "volumetricFlow" );

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
    public static final int NONE_VALUE = 0;

    /**
     * The '<em><b>Apparent Power Factor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Apparent Power Factor</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #APPARENT_POWER_FACTOR
     * @model name="apparentPowerFactor"
     * @generated
     * @ordered
     */
    public static final int APPARENT_POWER_FACTOR_VALUE = 1;

    /**
     * The '<em><b>Currency</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Currency</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CURRENCY
     * @model name="currency"
     * @generated
     * @ordered
     */
    public static final int CURRENCY_VALUE = 2;

    /**
     * The '<em><b>Current</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Current</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CURRENT
     * @model name="current"
     * @generated
     * @ordered
     */
    public static final int CURRENT_VALUE = 3;

    /**
     * The '<em><b>Current Angle</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Current Angle</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CURRENT_ANGLE
     * @model name="currentAngle"
     * @generated
     * @ordered
     */
    public static final int CURRENT_ANGLE_VALUE = 4;

    /**
     * The '<em><b>Current Imbalance</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Current Imbalance</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CURRENT_IMBALANCE
     * @model name="currentImbalance"
     * @generated
     * @ordered
     */
    public static final int CURRENT_IMBALANCE_VALUE = 5;

    /**
     * The '<em><b>Date</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DATE
     * @model name="date"
     * @generated
     * @ordered
     */
    public static final int DATE_VALUE = 6;

    /**
     * The '<em><b>Demand</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Demand</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEMAND
     * @model name="demand"
     * @generated
     * @ordered
     */
    public static final int DEMAND_VALUE = 7;

    /**
     * The '<em><b>Distance</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Distance</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISTANCE
     * @model name="distance"
     * @generated
     * @ordered
     */
    public static final int DISTANCE_VALUE = 8;

    /**
     * The '<em><b>Distortion Volt Amp</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Distortion Volt Amp</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISTORTION_VOLT_AMP
     * @model name="distortionVoltAmp"
     * @generated
     * @ordered
     */
    public static final int DISTORTION_VOLT_AMP_VALUE = 9;

    /**
     * The '<em><b>Energization</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Energization</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENERGIZATION
     * @model name="energization"
     * @generated
     * @ordered
     */
    public static final int ENERGIZATION_VALUE = 10;

    /**
     * The '<em><b>Energy</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Energy</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENERGY
     * @model name="energy"
     * @generated
     * @ordered
     */
    public static final int ENERGY_VALUE = 11;

    /**
     * The '<em><b>Energization Load Side</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Energization Load Side</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENERGIZATION_LOAD_SIDE
     * @model name="energizationLoadSide"
     * @generated
     * @ordered
     */
    public static final int ENERGIZATION_LOAD_SIDE_VALUE = 12;

    /**
     * The '<em><b>Fan</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fan</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FAN
     * @model name="fan"
     * @generated
     * @ordered
     */
    public static final int FAN_VALUE = 13;

    /**
     * The '<em><b>Frequency</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Frequency</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FREQUENCY
     * @model name="frequency"
     * @generated
     * @ordered
     */
    public static final int FREQUENCY_VALUE = 14;

    /**
     * The '<em><b>Fund</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fund</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FUND
     * @model name="fund"
     * @generated
     * @ordered
     */
    public static final int FUND_VALUE = 15;

    /**
     * The '<em><b>Ieee1366 ASAI</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 ASAI</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_ASAI
     * @model name="ieee1366ASAI"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_ASAI_VALUE = 16;

    /**
     * The '<em><b>Ieee1366 ASIDI</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 ASIDI</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_ASIDI
     * @model name="ieee1366ASIDI"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_ASIDI_VALUE = 17;

    /**
     * The '<em><b>Ieee1366 ASIFI</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 ASIFI</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_ASIFI
     * @model name="ieee1366ASIFI"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_ASIFI_VALUE = 18;

    /**
     * The '<em><b>Ieee1366 CAIDI</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 CAIDI</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_CAIDI
     * @model name="ieee1366CAIDI"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_CAIDI_VALUE = 19;

    /**
     * The '<em><b>Ieee1366 CAIFI</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 CAIFI</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_CAIFI
     * @model name="ieee1366CAIFI"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_CAIFI_VALUE = 20;

    /**
     * The '<em><b>Ieee1366 CEM In</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 CEM In</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_CEM_IN
     * @model name="ieee1366CEMIn"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_CEM_IN_VALUE = 21;

    /**
     * The '<em><b>Ieee1366 CEMSM In</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 CEMSM In</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_CEMSM_IN
     * @model name="ieee1366CEMSMIn"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_CEMSM_IN_VALUE = 22;

    /**
     * The '<em><b>Ieee1366 CTAIDI</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 CTAIDI</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_CTAIDI
     * @model name="ieee1366CTAIDI"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_CTAIDI_VALUE = 23;

    /**
     * The '<em><b>Ieee1366 MAIFI</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 MAIFI</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_MAIFI
     * @model name="ieee1366MAIFI"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_MAIFI_VALUE = 24;

    /**
     * The '<em><b>Ieee1366 MAIF Ie</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 MAIF Ie</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_MAIF_IE
     * @model name="ieee1366MAIFIe"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_MAIF_IE_VALUE = 25;

    /**
     * The '<em><b>Ieee1366 SAIDI</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 SAIDI</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_SAIDI
     * @model name="ieee1366SAIDI"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_SAIDI_VALUE = 26;

    /**
     * The '<em><b>Ieee1366 SAIFI</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 SAIFI</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_SAIFI
     * @model name="ieee1366SAIFI"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_SAIFI_VALUE = 27;

    /**
     * The '<em><b>Line Loss</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Line Loss</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LINE_LOSS
     * @model name="lineLoss"
     * @generated
     * @ordered
     */
    public static final int LINE_LOSS_VALUE = 28;

    /**
     * The '<em><b>Loss</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Loss</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOSS
     * @model name="loss"
     * @generated
     * @ordered
     */
    public static final int LOSS_VALUE = 29;

    /**
     * The '<em><b>Negative Sequence</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Negative Sequence</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NEGATIVE_SEQUENCE
     * @model name="negativeSequence"
     * @generated
     * @ordered
     */
    public static final int NEGATIVE_SEQUENCE_VALUE = 30;

    /**
     * The '<em><b>Phasor Power Factor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Phasor Power Factor</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PHASOR_POWER_FACTOR
     * @model name="phasorPowerFactor"
     * @generated
     * @ordered
     */
    public static final int PHASOR_POWER_FACTOR_VALUE = 31;

    /**
     * The '<em><b>Phasor Reactive Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Phasor Reactive Power</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PHASOR_REACTIVE_POWER
     * @model name="phasorReactivePower"
     * @generated
     * @ordered
     */
    public static final int PHASOR_REACTIVE_POWER_VALUE = 32;

    /**
     * The '<em><b>Positive Sequence</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Positive Sequence</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POSITIVE_SEQUENCE
     * @model name="positiveSequence"
     * @generated
     * @ordered
     */
    public static final int POSITIVE_SEQUENCE_VALUE = 33;

    /**
     * The '<em><b>Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Power</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POWER
     * @model name="power"
     * @generated
     * @ordered
     */
    public static final int POWER_VALUE = 34;

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
    public static final int POWER_FACTOR_VALUE = 35;

    /**
     * The '<em><b>Quantity Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Quantity Power</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QUANTITY_POWER
     * @model name="quantityPower"
     * @generated
     * @ordered
     */
    public static final int QUANTITY_POWER_VALUE = 36;

    /**
     * The '<em><b>Sag</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sag</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAG
     * @model name="sag"
     * @generated
     * @ordered
     */
    public static final int SAG_VALUE = 37;

    /**
     * The '<em><b>Swell</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Swell</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SWELL
     * @model name="swell"
     * @generated
     * @ordered
     */
    public static final int SWELL_VALUE = 38;

    /**
     * The '<em><b>Switch Position</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Switch Position</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SWITCH_POSITION
     * @model name="switchPosition"
     * @generated
     * @ordered
     */
    public static final int SWITCH_POSITION_VALUE = 39;

    /**
     * The '<em><b>Tap Position</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tap Position</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TAP_POSITION
     * @model name="tapPosition"
     * @generated
     * @ordered
     */
    public static final int TAP_POSITION_VALUE = 40;

    /**
     * The '<em><b>Tariff Rate</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tariff Rate</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TARIFF_RATE
     * @model name="tariffRate"
     * @generated
     * @ordered
     */
    public static final int TARIFF_RATE_VALUE = 41;

    /**
     * The '<em><b>Temperature</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Temperature</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TEMPERATURE
     * @model name="temperature"
     * @generated
     * @ordered
     */
    public static final int TEMPERATURE_VALUE = 42;

    /**
     * The '<em><b>Total Harmonic Distortion</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Total Harmonic Distortion</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TOTAL_HARMONIC_DISTORTION
     * @model name="totalHarmonicDistortion"
     * @generated
     * @ordered
     */
    public static final int TOTAL_HARMONIC_DISTORTION_VALUE = 43;

    /**
     * The '<em><b>Transformer Loss</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Transformer Loss</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRANSFORMER_LOSS
     * @model name="transformerLoss"
     * @generated
     * @ordered
     */
    public static final int TRANSFORMER_LOSS_VALUE = 44;

    /**
     * The '<em><b>Unipede Voltage Dip10to15</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unipede Voltage Dip10to15</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNIPEDE_VOLTAGE_DIP10TO15
     * @model name="unipedeVoltageDip10to15"
     * @generated
     * @ordered
     */
    public static final int UNIPEDE_VOLTAGE_DIP10TO15_VALUE = 45;

    /**
     * The '<em><b>Unipede Voltage Dip15to30</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unipede Voltage Dip15to30</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNIPEDE_VOLTAGE_DIP15TO30
     * @model name="unipedeVoltageDip15to30"
     * @generated
     * @ordered
     */
    public static final int UNIPEDE_VOLTAGE_DIP15TO30_VALUE = 46;

    /**
     * The '<em><b>Unipede Voltage Dip30to60</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unipede Voltage Dip30to60</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNIPEDE_VOLTAGE_DIP30TO60
     * @model name="unipedeVoltageDip30to60"
     * @generated
     * @ordered
     */
    public static final int UNIPEDE_VOLTAGE_DIP30TO60_VALUE = 47;

    /**
     * The '<em><b>Unipede Voltage Dip60to90</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unipede Voltage Dip60to90</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNIPEDE_VOLTAGE_DIP60TO90
     * @model name="unipedeVoltageDip60to90"
     * @generated
     * @ordered
     */
    public static final int UNIPEDE_VOLTAGE_DIP60TO90_VALUE = 48;

    /**
     * The '<em><b>Unipede Voltage Dip90to100</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unipede Voltage Dip90to100</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNIPEDE_VOLTAGE_DIP90TO100
     * @model name="unipedeVoltageDip90to100"
     * @generated
     * @ordered
     */
    public static final int UNIPEDE_VOLTAGE_DIP90TO100_VALUE = 49;

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
    public static final int VOLTAGE_VALUE = 50;

    /**
     * The '<em><b>Voltage Angle</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Voltage Angle</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VOLTAGE_ANGLE
     * @model name="voltageAngle"
     * @generated
     * @ordered
     */
    public static final int VOLTAGE_ANGLE_VALUE = 51;

    /**
     * The '<em><b>Voltage Excursion</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Voltage Excursion</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VOLTAGE_EXCURSION
     * @model name="voltageExcursion"
     * @generated
     * @ordered
     */
    public static final int VOLTAGE_EXCURSION_VALUE = 52;

    /**
     * The '<em><b>Voltage Imbalance</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Voltage Imbalance</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VOLTAGE_IMBALANCE
     * @model name="voltageImbalance"
     * @generated
     * @ordered
     */
    public static final int VOLTAGE_IMBALANCE_VALUE = 53;

    /**
     * The '<em><b>Volume</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Volume</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VOLUME
     * @model name="volume"
     * @generated
     * @ordered
     */
    public static final int VOLUME_VALUE = 54;

    /**
     * The '<em><b>Zero Flow Duration</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Zero Flow Duration</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ZERO_FLOW_DURATION
     * @model name="zeroFlowDuration"
     * @generated
     * @ordered
     */
    public static final int ZERO_FLOW_DURATION_VALUE = 55;

    /**
     * The '<em><b>Zero Sequence</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Zero Sequence</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ZERO_SEQUENCE
     * @model name="zeroSequence"
     * @generated
     * @ordered
     */
    public static final int ZERO_SEQUENCE_VALUE = 56;

    /**
     * The '<em><b>Distortion Power Factor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Distortion Power Factor</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISTORTION_POWER_FACTOR
     * @model name="distortionPowerFactor"
     * @generated
     * @ordered
     */
    public static final int DISTORTION_POWER_FACTOR_VALUE = 57;

    /**
     * The '<em><b>Frequency Excursion</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Frequency Excursion</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FREQUENCY_EXCURSION
     * @model name="frequencyExcursion"
     * @generated
     * @ordered
     */
    public static final int FREQUENCY_EXCURSION_VALUE = 58;

    /**
     * The '<em><b>Application Context</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Application Context</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #APPLICATION_CONTEXT
     * @model name="applicationContext"
     * @generated
     * @ordered
     */
    public static final int APPLICATION_CONTEXT_VALUE = 59;

    /**
     * The '<em><b>Ap Title</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ap Title</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AP_TITLE
     * @model name="apTitle"
     * @generated
     * @ordered
     */
    public static final int AP_TITLE_VALUE = 60;

    /**
     * The '<em><b>Asset Number</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Asset Number</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSET_NUMBER
     * @model name="assetNumber"
     * @generated
     * @ordered
     */
    public static final int ASSET_NUMBER_VALUE = 61;

    /**
     * The '<em><b>Bandwidth</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bandwidth</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BANDWIDTH
     * @model name="bandwidth"
     * @generated
     * @ordered
     */
    public static final int BANDWIDTH_VALUE = 62;

    /**
     * The '<em><b>Battery Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Battery Voltage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BATTERY_VOLTAGE
     * @model name="batteryVoltage"
     * @generated
     * @ordered
     */
    public static final int BATTERY_VOLTAGE_VALUE = 63;

    /**
     * The '<em><b>Broadcast Address</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Broadcast Address</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BROADCAST_ADDRESS
     * @model name="broadcastAddress"
     * @generated
     * @ordered
     */
    public static final int BROADCAST_ADDRESS_VALUE = 64;

    /**
     * The '<em><b>Device Address Type1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Device Address Type1</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEVICE_ADDRESS_TYPE1
     * @model name="deviceAddressType1"
     * @generated
     * @ordered
     */
    public static final int DEVICE_ADDRESS_TYPE1_VALUE = 65;

    /**
     * The '<em><b>Device Address Type2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Device Address Type2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEVICE_ADDRESS_TYPE2
     * @model name="deviceAddressType2"
     * @generated
     * @ordered
     */
    public static final int DEVICE_ADDRESS_TYPE2_VALUE = 66;

    /**
     * The '<em><b>Device Address Type3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Device Address Type3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEVICE_ADDRESS_TYPE3
     * @model name="deviceAddressType3"
     * @generated
     * @ordered
     */
    public static final int DEVICE_ADDRESS_TYPE3_VALUE = 67;

    /**
     * The '<em><b>Device Address Type4</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Device Address Type4</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEVICE_ADDRESS_TYPE4
     * @model name="deviceAddressType4"
     * @generated
     * @ordered
     */
    public static final int DEVICE_ADDRESS_TYPE4_VALUE = 68;

    /**
     * The '<em><b>Device Class</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Device Class</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEVICE_CLASS
     * @model name="deviceClass"
     * @generated
     * @ordered
     */
    public static final int DEVICE_CLASS_VALUE = 69;

    /**
     * The '<em><b>Electronic Serial Number</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Electronic Serial Number</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ELECTRONIC_SERIAL_NUMBER
     * @model name="electronicSerialNumber"
     * @generated
     * @ordered
     */
    public static final int ELECTRONIC_SERIAL_NUMBER_VALUE = 70;

    /**
     * The '<em><b>End Device ID</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>End Device ID</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #END_DEVICE_ID
     * @model name="endDeviceID"
     * @generated
     * @ordered
     */
    public static final int END_DEVICE_ID_VALUE = 71;

    /**
     * The '<em><b>Group Address Type1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Group Address Type1</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GROUP_ADDRESS_TYPE1
     * @model name="groupAddressType1"
     * @generated
     * @ordered
     */
    public static final int GROUP_ADDRESS_TYPE1_VALUE = 72;

    /**
     * The '<em><b>Group Address Type2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Group Address Type2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GROUP_ADDRESS_TYPE2
     * @model name="groupAddressType2"
     * @generated
     * @ordered
     */
    public static final int GROUP_ADDRESS_TYPE2_VALUE = 73;

    /**
     * The '<em><b>Group Address Type3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Group Address Type3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GROUP_ADDRESS_TYPE3
     * @model name="groupAddressType3"
     * @generated
     * @ordered
     */
    public static final int GROUP_ADDRESS_TYPE3_VALUE = 74;

    /**
     * The '<em><b>Group Address Type4</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Group Address Type4</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GROUP_ADDRESS_TYPE4
     * @model name="groupAddressType4"
     * @generated
     * @ordered
     */
    public static final int GROUP_ADDRESS_TYPE4_VALUE = 75;

    /**
     * The '<em><b>Ip Address</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ip Address</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IP_ADDRESS
     * @model name="ipAddress"
     * @generated
     * @ordered
     */
    public static final int IP_ADDRESS_VALUE = 76;

    /**
     * The '<em><b>Mac Address</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mac Address</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAC_ADDRESS
     * @model name="macAddress"
     * @generated
     * @ordered
     */
    public static final int MAC_ADDRESS_VALUE = 77;

    /**
     * The '<em><b>Mfg Assigned Configuration ID</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mfg Assigned Configuration ID</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MFG_ASSIGNED_CONFIGURATION_ID
     * @model name="mfgAssignedConfigurationID"
     * @generated
     * @ordered
     */
    public static final int MFG_ASSIGNED_CONFIGURATION_ID_VALUE = 78;

    /**
     * The '<em><b>Mfg Assigned Physical Serial Number</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mfg Assigned Physical Serial Number</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MFG_ASSIGNED_PHYSICAL_SERIAL_NUMBER
     * @model name="mfgAssignedPhysicalSerialNumber"
     * @generated
     * @ordered
     */
    public static final int MFG_ASSIGNED_PHYSICAL_SERIAL_NUMBER_VALUE = 79;

    /**
     * The '<em><b>Mfg Assigned Product Number</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mfg Assigned Product Number</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MFG_ASSIGNED_PRODUCT_NUMBER
     * @model name="mfgAssignedProductNumber"
     * @generated
     * @ordered
     */
    public static final int MFG_ASSIGNED_PRODUCT_NUMBER_VALUE = 80;

    /**
     * The '<em><b>Mfg Assigned Unique Communication Address</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mfg Assigned Unique Communication Address</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MFG_ASSIGNED_UNIQUE_COMMUNICATION_ADDRESS
     * @model name="mfgAssignedUniqueCommunicationAddress"
     * @generated
     * @ordered
     */
    public static final int MFG_ASSIGNED_UNIQUE_COMMUNICATION_ADDRESS_VALUE = 81;

    /**
     * The '<em><b>Multi Cast Address</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Multi Cast Address</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MULTI_CAST_ADDRESS
     * @model name="multiCastAddress"
     * @generated
     * @ordered
     */
    public static final int MULTI_CAST_ADDRESS_VALUE = 82;

    /**
     * The '<em><b>One Way Address</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>One Way Address</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ONE_WAY_ADDRESS
     * @model name="oneWayAddress"
     * @generated
     * @ordered
     */
    public static final int ONE_WAY_ADDRESS_VALUE = 83;

    /**
     * The '<em><b>Signal Strength</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Signal Strength</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SIGNAL_STRENGTH
     * @model name="signalStrength"
     * @generated
     * @ordered
     */
    public static final int SIGNAL_STRENGTH_VALUE = 84;

    /**
     * The '<em><b>Two Way Address</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Two Way Address</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TWO_WAY_ADDRESS
     * @model name="twoWayAddress"
     * @generated
     * @ordered
     */
    public static final int TWO_WAY_ADDRESS_VALUE = 85;

    /**
     * The '<em><b>Signalto Noise Ratio</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Signalto Noise Ratio</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SIGNALTO_NOISE_RATIO
     * @model name="signaltoNoiseRatio"
     * @generated
     * @ordered
     */
    public static final int SIGNALTO_NOISE_RATIO_VALUE = 86;

    /**
     * The '<em><b>Alarm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Alarm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ALARM
     * @model name="alarm"
     * @generated
     * @ordered
     */
    public static final int ALARM_VALUE = 87;

    /**
     * The '<em><b>Battery Carryover</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Battery Carryover</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BATTERY_CARRYOVER
     * @model name="batteryCarryover"
     * @generated
     * @ordered
     */
    public static final int BATTERY_CARRYOVER_VALUE = 88;

    /**
     * The '<em><b>Data Overflow Alarm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Data Overflow Alarm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DATA_OVERFLOW_ALARM
     * @model name="dataOverflowAlarm"
     * @generated
     * @ordered
     */
    public static final int DATA_OVERFLOW_ALARM_VALUE = 89;

    /**
     * The '<em><b>Demand Limit</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Demand Limit</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEMAND_LIMIT
     * @model name="demandLimit"
     * @generated
     * @ordered
     */
    public static final int DEMAND_LIMIT_VALUE = 90;

    /**
     * The '<em><b>Demand Reset</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Demand Reset</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEMAND_RESET
     * @model name="demandReset"
     * @generated
     * @ordered
     */
    public static final int DEMAND_RESET_VALUE = 91;

    /**
     * The '<em><b>Diagnostic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Diagnostic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DIAGNOSTIC
     * @model name="diagnostic"
     * @generated
     * @ordered
     */
    public static final int DIAGNOSTIC_VALUE = 92;

    /**
     * The '<em><b>Emergency Limit</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Emergency Limit</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EMERGENCY_LIMIT
     * @model name="emergencyLimit"
     * @generated
     * @ordered
     */
    public static final int EMERGENCY_LIMIT_VALUE = 93;

    /**
     * The '<em><b>Encoder Tamper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Encoder Tamper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENCODER_TAMPER
     * @model name="encoderTamper"
     * @generated
     * @ordered
     */
    public static final int ENCODER_TAMPER_VALUE = 94;

    /**
     * The '<em><b>Ieee1366 Momentary Interruption</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 Momentary Interruption</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_MOMENTARY_INTERRUPTION
     * @model name="ieee1366MomentaryInterruption"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_MOMENTARY_INTERRUPTION_VALUE = 95;

    /**
     * The '<em><b>Ieee1366 Momentary Interruption Event</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 Momentary Interruption Event</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_MOMENTARY_INTERRUPTION_EVENT
     * @model name="ieee1366MomentaryInterruptionEvent"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_MOMENTARY_INTERRUPTION_EVENT_VALUE = 96;

    /**
     * The '<em><b>Ieee1366 Sustained Interruption</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ieee1366 Sustained Interruption</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IEEE1366_SUSTAINED_INTERRUPTION
     * @model name="ieee1366SustainedInterruption"
     * @generated
     * @ordered
     */
    public static final int IEEE1366_SUSTAINED_INTERRUPTION_VALUE = 97;

    /**
     * The '<em><b>Interruption Behaviour</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Interruption Behaviour</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTERRUPTION_BEHAVIOUR
     * @model name="interruptionBehaviour"
     * @generated
     * @ordered
     */
    public static final int INTERRUPTION_BEHAVIOUR_VALUE = 98;

    /**
     * The '<em><b>Inversion Tamper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Inversion Tamper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INVERSION_TAMPER
     * @model name="inversionTamper"
     * @generated
     * @ordered
     */
    public static final int INVERSION_TAMPER_VALUE = 99;

    /**
     * The '<em><b>Load Interrupt</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Load Interrupt</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOAD_INTERRUPT
     * @model name="loadInterrupt"
     * @generated
     * @ordered
     */
    public static final int LOAD_INTERRUPT_VALUE = 100;

    /**
     * The '<em><b>Load Shed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Load Shed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOAD_SHED
     * @model name="loadShed"
     * @generated
     * @ordered
     */
    public static final int LOAD_SHED_VALUE = 101;

    /**
     * The '<em><b>Maintenance</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Maintenance</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAINTENANCE
     * @model name="maintenance"
     * @generated
     * @ordered
     */
    public static final int MAINTENANCE_VALUE = 102;

    /**
     * The '<em><b>Physical Tamper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Physical Tamper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PHYSICAL_TAMPER
     * @model name="physicalTamper"
     * @generated
     * @ordered
     */
    public static final int PHYSICAL_TAMPER_VALUE = 103;

    /**
     * The '<em><b>Power Loss Tamper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Power Loss Tamper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POWER_LOSS_TAMPER
     * @model name="powerLossTamper"
     * @generated
     * @ordered
     */
    public static final int POWER_LOSS_TAMPER_VALUE = 104;

    /**
     * The '<em><b>Power Outage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Power Outage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POWER_OUTAGE
     * @model name="powerOutage"
     * @generated
     * @ordered
     */
    public static final int POWER_OUTAGE_VALUE = 105;

    /**
     * The '<em><b>Power Quality</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Power Quality</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POWER_QUALITY
     * @model name="powerQuality"
     * @generated
     * @ordered
     */
    public static final int POWER_QUALITY_VALUE = 106;

    /**
     * The '<em><b>Power Restoration</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Power Restoration</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POWER_RESTORATION
     * @model name="powerRestoration"
     * @generated
     * @ordered
     */
    public static final int POWER_RESTORATION_VALUE = 107;

    /**
     * The '<em><b>Programmed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Programmed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PROGRAMMED
     * @model name="programmed"
     * @generated
     * @ordered
     */
    public static final int PROGRAMMED_VALUE = 108;

    /**
     * The '<em><b>Pushbutton</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pushbutton</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PUSHBUTTON
     * @model name="pushbutton"
     * @generated
     * @ordered
     */
    public static final int PUSHBUTTON_VALUE = 109;

    /**
     * The '<em><b>Relay Activation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Relay Activation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RELAY_ACTIVATION
     * @model name="relayActivation"
     * @generated
     * @ordered
     */
    public static final int RELAY_ACTIVATION_VALUE = 110;

    /**
     * The '<em><b>Relay Cycle</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Relay Cycle</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RELAY_CYCLE
     * @model name="relayCycle"
     * @generated
     * @ordered
     */
    public static final int RELAY_CYCLE_VALUE = 111;

    /**
     * The '<em><b>Removal Tamper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Removal Tamper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOVAL_TAMPER
     * @model name="removalTamper"
     * @generated
     * @ordered
     */
    public static final int REMOVAL_TAMPER_VALUE = 112;

    /**
     * The '<em><b>Reprogramming Tamper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Reprogramming Tamper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REPROGRAMMING_TAMPER
     * @model name="reprogrammingTamper"
     * @generated
     * @ordered
     */
    public static final int REPROGRAMMING_TAMPER_VALUE = 113;

    /**
     * The '<em><b>Reverse Rotation Tamper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Reverse Rotation Tamper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REVERSE_ROTATION_TAMPER
     * @model name="reverseRotationTamper"
     * @generated
     * @ordered
     */
    public static final int REVERSE_ROTATION_TAMPER_VALUE = 114;

    /**
     * The '<em><b>Switch Armed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Switch Armed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SWITCH_ARMED
     * @model name="switchArmed"
     * @generated
     * @ordered
     */
    public static final int SWITCH_ARMED_VALUE = 115;

    /**
     * The '<em><b>Switch Disabled</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Switch Disabled</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SWITCH_DISABLED
     * @model name="switchDisabled"
     * @generated
     * @ordered
     */
    public static final int SWITCH_DISABLED_VALUE = 116;

    /**
     * The '<em><b>Tamper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tamper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TAMPER
     * @model name="tamper"
     * @generated
     * @ordered
     */
    public static final int TAMPER_VALUE = 117;

    /**
     * The '<em><b>Watchdog Timeout</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Watchdog Timeout</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WATCHDOG_TIMEOUT
     * @model name="watchdogTimeout"
     * @generated
     * @ordered
     */
    public static final int WATCHDOG_TIMEOUT_VALUE = 118;

    /**
     * The '<em><b>Bill Last Period</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bill Last Period</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BILL_LAST_PERIOD
     * @model name="billLastPeriod"
     * @generated
     * @ordered
     */
    public static final int BILL_LAST_PERIOD_VALUE = 119;

    /**
     * The '<em><b>Bill To Date</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bill To Date</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BILL_TO_DATE
     * @model name="billToDate"
     * @generated
     * @ordered
     */
    public static final int BILL_TO_DATE_VALUE = 120;

    /**
     * The '<em><b>Bill Carryover</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bill Carryover</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BILL_CARRYOVER
     * @model name="billCarryover"
     * @generated
     * @ordered
     */
    public static final int BILL_CARRYOVER_VALUE = 121;

    /**
     * The '<em><b>Connection Fee</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Connection Fee</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONNECTION_FEE
     * @model name="connectionFee"
     * @generated
     * @ordered
     */
    public static final int CONNECTION_FEE_VALUE = 122;

    /**
     * The '<em><b>Audible Volume</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Audible Volume</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AUDIBLE_VOLUME
     * @model name="audibleVolume"
     * @generated
     * @ordered
     */
    public static final int AUDIBLE_VOLUME_VALUE = 123;

    /**
     * The '<em><b>Volumetric Flow</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Volumetric Flow</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VOLUMETRIC_FLOW
     * @model name="volumetricFlow"
     * @generated
     * @ordered
     */
    public static final int VOLUMETRIC_FLOW_VALUE = 124;

    /**
     * An array of all the '<em><b>Measurement Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final MeasurementKind[] VALUES_ARRAY = new MeasurementKind[] { NONE, APPARENT_POWER_FACTOR, CURRENCY,
            CURRENT, CURRENT_ANGLE, CURRENT_IMBALANCE, DATE, DEMAND, DISTANCE, DISTORTION_VOLT_AMP, ENERGIZATION,
            ENERGY, ENERGIZATION_LOAD_SIDE, FAN, FREQUENCY, FUND, IEEE1366_ASAI, IEEE1366_ASIDI, IEEE1366_ASIFI,
            IEEE1366_CAIDI, IEEE1366_CAIFI, IEEE1366_CEM_IN, IEEE1366_CEMSM_IN, IEEE1366_CTAIDI, IEEE1366_MAIFI,
            IEEE1366_MAIF_IE, IEEE1366_SAIDI, IEEE1366_SAIFI, LINE_LOSS, LOSS, NEGATIVE_SEQUENCE, PHASOR_POWER_FACTOR,
            PHASOR_REACTIVE_POWER, POSITIVE_SEQUENCE, POWER, POWER_FACTOR, QUANTITY_POWER, SAG, SWELL, SWITCH_POSITION,
            TAP_POSITION, TARIFF_RATE, TEMPERATURE, TOTAL_HARMONIC_DISTORTION, TRANSFORMER_LOSS,
            UNIPEDE_VOLTAGE_DIP10TO15, UNIPEDE_VOLTAGE_DIP15TO30, UNIPEDE_VOLTAGE_DIP30TO60, UNIPEDE_VOLTAGE_DIP60TO90,
            UNIPEDE_VOLTAGE_DIP90TO100, VOLTAGE, VOLTAGE_ANGLE, VOLTAGE_EXCURSION, VOLTAGE_IMBALANCE, VOLUME,
            ZERO_FLOW_DURATION, ZERO_SEQUENCE, DISTORTION_POWER_FACTOR, FREQUENCY_EXCURSION, APPLICATION_CONTEXT,
            AP_TITLE, ASSET_NUMBER, BANDWIDTH, BATTERY_VOLTAGE, BROADCAST_ADDRESS, DEVICE_ADDRESS_TYPE1,
            DEVICE_ADDRESS_TYPE2, DEVICE_ADDRESS_TYPE3, DEVICE_ADDRESS_TYPE4, DEVICE_CLASS, ELECTRONIC_SERIAL_NUMBER,
            END_DEVICE_ID, GROUP_ADDRESS_TYPE1, GROUP_ADDRESS_TYPE2, GROUP_ADDRESS_TYPE3, GROUP_ADDRESS_TYPE4,
            IP_ADDRESS, MAC_ADDRESS, MFG_ASSIGNED_CONFIGURATION_ID, MFG_ASSIGNED_PHYSICAL_SERIAL_NUMBER,
            MFG_ASSIGNED_PRODUCT_NUMBER, MFG_ASSIGNED_UNIQUE_COMMUNICATION_ADDRESS, MULTI_CAST_ADDRESS, ONE_WAY_ADDRESS,
            SIGNAL_STRENGTH, TWO_WAY_ADDRESS, SIGNALTO_NOISE_RATIO, ALARM, BATTERY_CARRYOVER, DATA_OVERFLOW_ALARM,
            DEMAND_LIMIT, DEMAND_RESET, DIAGNOSTIC, EMERGENCY_LIMIT, ENCODER_TAMPER, IEEE1366_MOMENTARY_INTERRUPTION,
            IEEE1366_MOMENTARY_INTERRUPTION_EVENT, IEEE1366_SUSTAINED_INTERRUPTION, INTERRUPTION_BEHAVIOUR,
            INVERSION_TAMPER, LOAD_INTERRUPT, LOAD_SHED, MAINTENANCE, PHYSICAL_TAMPER, POWER_LOSS_TAMPER, POWER_OUTAGE,
            POWER_QUALITY, POWER_RESTORATION, PROGRAMMED, PUSHBUTTON, RELAY_ACTIVATION, RELAY_CYCLE, REMOVAL_TAMPER,
            REPROGRAMMING_TAMPER, REVERSE_ROTATION_TAMPER, SWITCH_ARMED, SWITCH_DISABLED, TAMPER, WATCHDOG_TIMEOUT,
            BILL_LAST_PERIOD, BILL_TO_DATE, BILL_CARRYOVER, CONNECTION_FEE, AUDIBLE_VOLUME, VOLUMETRIC_FLOW, };

    /**
     * A public read-only list of all the '<em><b>Measurement Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< MeasurementKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Measurement Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MeasurementKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            MeasurementKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Measurement Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MeasurementKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            MeasurementKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Measurement Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MeasurementKind get( int value ) {
        switch( value ) {
        case NONE_VALUE:
            return NONE;
        case APPARENT_POWER_FACTOR_VALUE:
            return APPARENT_POWER_FACTOR;
        case CURRENCY_VALUE:
            return CURRENCY;
        case CURRENT_VALUE:
            return CURRENT;
        case CURRENT_ANGLE_VALUE:
            return CURRENT_ANGLE;
        case CURRENT_IMBALANCE_VALUE:
            return CURRENT_IMBALANCE;
        case DATE_VALUE:
            return DATE;
        case DEMAND_VALUE:
            return DEMAND;
        case DISTANCE_VALUE:
            return DISTANCE;
        case DISTORTION_VOLT_AMP_VALUE:
            return DISTORTION_VOLT_AMP;
        case ENERGIZATION_VALUE:
            return ENERGIZATION;
        case ENERGY_VALUE:
            return ENERGY;
        case ENERGIZATION_LOAD_SIDE_VALUE:
            return ENERGIZATION_LOAD_SIDE;
        case FAN_VALUE:
            return FAN;
        case FREQUENCY_VALUE:
            return FREQUENCY;
        case FUND_VALUE:
            return FUND;
        case IEEE1366_ASAI_VALUE:
            return IEEE1366_ASAI;
        case IEEE1366_ASIDI_VALUE:
            return IEEE1366_ASIDI;
        case IEEE1366_ASIFI_VALUE:
            return IEEE1366_ASIFI;
        case IEEE1366_CAIDI_VALUE:
            return IEEE1366_CAIDI;
        case IEEE1366_CAIFI_VALUE:
            return IEEE1366_CAIFI;
        case IEEE1366_CEM_IN_VALUE:
            return IEEE1366_CEM_IN;
        case IEEE1366_CEMSM_IN_VALUE:
            return IEEE1366_CEMSM_IN;
        case IEEE1366_CTAIDI_VALUE:
            return IEEE1366_CTAIDI;
        case IEEE1366_MAIFI_VALUE:
            return IEEE1366_MAIFI;
        case IEEE1366_MAIF_IE_VALUE:
            return IEEE1366_MAIF_IE;
        case IEEE1366_SAIDI_VALUE:
            return IEEE1366_SAIDI;
        case IEEE1366_SAIFI_VALUE:
            return IEEE1366_SAIFI;
        case LINE_LOSS_VALUE:
            return LINE_LOSS;
        case LOSS_VALUE:
            return LOSS;
        case NEGATIVE_SEQUENCE_VALUE:
            return NEGATIVE_SEQUENCE;
        case PHASOR_POWER_FACTOR_VALUE:
            return PHASOR_POWER_FACTOR;
        case PHASOR_REACTIVE_POWER_VALUE:
            return PHASOR_REACTIVE_POWER;
        case POSITIVE_SEQUENCE_VALUE:
            return POSITIVE_SEQUENCE;
        case POWER_VALUE:
            return POWER;
        case POWER_FACTOR_VALUE:
            return POWER_FACTOR;
        case QUANTITY_POWER_VALUE:
            return QUANTITY_POWER;
        case SAG_VALUE:
            return SAG;
        case SWELL_VALUE:
            return SWELL;
        case SWITCH_POSITION_VALUE:
            return SWITCH_POSITION;
        case TAP_POSITION_VALUE:
            return TAP_POSITION;
        case TARIFF_RATE_VALUE:
            return TARIFF_RATE;
        case TEMPERATURE_VALUE:
            return TEMPERATURE;
        case TOTAL_HARMONIC_DISTORTION_VALUE:
            return TOTAL_HARMONIC_DISTORTION;
        case TRANSFORMER_LOSS_VALUE:
            return TRANSFORMER_LOSS;
        case UNIPEDE_VOLTAGE_DIP10TO15_VALUE:
            return UNIPEDE_VOLTAGE_DIP10TO15;
        case UNIPEDE_VOLTAGE_DIP15TO30_VALUE:
            return UNIPEDE_VOLTAGE_DIP15TO30;
        case UNIPEDE_VOLTAGE_DIP30TO60_VALUE:
            return UNIPEDE_VOLTAGE_DIP30TO60;
        case UNIPEDE_VOLTAGE_DIP60TO90_VALUE:
            return UNIPEDE_VOLTAGE_DIP60TO90;
        case UNIPEDE_VOLTAGE_DIP90TO100_VALUE:
            return UNIPEDE_VOLTAGE_DIP90TO100;
        case VOLTAGE_VALUE:
            return VOLTAGE;
        case VOLTAGE_ANGLE_VALUE:
            return VOLTAGE_ANGLE;
        case VOLTAGE_EXCURSION_VALUE:
            return VOLTAGE_EXCURSION;
        case VOLTAGE_IMBALANCE_VALUE:
            return VOLTAGE_IMBALANCE;
        case VOLUME_VALUE:
            return VOLUME;
        case ZERO_FLOW_DURATION_VALUE:
            return ZERO_FLOW_DURATION;
        case ZERO_SEQUENCE_VALUE:
            return ZERO_SEQUENCE;
        case DISTORTION_POWER_FACTOR_VALUE:
            return DISTORTION_POWER_FACTOR;
        case FREQUENCY_EXCURSION_VALUE:
            return FREQUENCY_EXCURSION;
        case APPLICATION_CONTEXT_VALUE:
            return APPLICATION_CONTEXT;
        case AP_TITLE_VALUE:
            return AP_TITLE;
        case ASSET_NUMBER_VALUE:
            return ASSET_NUMBER;
        case BANDWIDTH_VALUE:
            return BANDWIDTH;
        case BATTERY_VOLTAGE_VALUE:
            return BATTERY_VOLTAGE;
        case BROADCAST_ADDRESS_VALUE:
            return BROADCAST_ADDRESS;
        case DEVICE_ADDRESS_TYPE1_VALUE:
            return DEVICE_ADDRESS_TYPE1;
        case DEVICE_ADDRESS_TYPE2_VALUE:
            return DEVICE_ADDRESS_TYPE2;
        case DEVICE_ADDRESS_TYPE3_VALUE:
            return DEVICE_ADDRESS_TYPE3;
        case DEVICE_ADDRESS_TYPE4_VALUE:
            return DEVICE_ADDRESS_TYPE4;
        case DEVICE_CLASS_VALUE:
            return DEVICE_CLASS;
        case ELECTRONIC_SERIAL_NUMBER_VALUE:
            return ELECTRONIC_SERIAL_NUMBER;
        case END_DEVICE_ID_VALUE:
            return END_DEVICE_ID;
        case GROUP_ADDRESS_TYPE1_VALUE:
            return GROUP_ADDRESS_TYPE1;
        case GROUP_ADDRESS_TYPE2_VALUE:
            return GROUP_ADDRESS_TYPE2;
        case GROUP_ADDRESS_TYPE3_VALUE:
            return GROUP_ADDRESS_TYPE3;
        case GROUP_ADDRESS_TYPE4_VALUE:
            return GROUP_ADDRESS_TYPE4;
        case IP_ADDRESS_VALUE:
            return IP_ADDRESS;
        case MAC_ADDRESS_VALUE:
            return MAC_ADDRESS;
        case MFG_ASSIGNED_CONFIGURATION_ID_VALUE:
            return MFG_ASSIGNED_CONFIGURATION_ID;
        case MFG_ASSIGNED_PHYSICAL_SERIAL_NUMBER_VALUE:
            return MFG_ASSIGNED_PHYSICAL_SERIAL_NUMBER;
        case MFG_ASSIGNED_PRODUCT_NUMBER_VALUE:
            return MFG_ASSIGNED_PRODUCT_NUMBER;
        case MFG_ASSIGNED_UNIQUE_COMMUNICATION_ADDRESS_VALUE:
            return MFG_ASSIGNED_UNIQUE_COMMUNICATION_ADDRESS;
        case MULTI_CAST_ADDRESS_VALUE:
            return MULTI_CAST_ADDRESS;
        case ONE_WAY_ADDRESS_VALUE:
            return ONE_WAY_ADDRESS;
        case SIGNAL_STRENGTH_VALUE:
            return SIGNAL_STRENGTH;
        case TWO_WAY_ADDRESS_VALUE:
            return TWO_WAY_ADDRESS;
        case SIGNALTO_NOISE_RATIO_VALUE:
            return SIGNALTO_NOISE_RATIO;
        case ALARM_VALUE:
            return ALARM;
        case BATTERY_CARRYOVER_VALUE:
            return BATTERY_CARRYOVER;
        case DATA_OVERFLOW_ALARM_VALUE:
            return DATA_OVERFLOW_ALARM;
        case DEMAND_LIMIT_VALUE:
            return DEMAND_LIMIT;
        case DEMAND_RESET_VALUE:
            return DEMAND_RESET;
        case DIAGNOSTIC_VALUE:
            return DIAGNOSTIC;
        case EMERGENCY_LIMIT_VALUE:
            return EMERGENCY_LIMIT;
        case ENCODER_TAMPER_VALUE:
            return ENCODER_TAMPER;
        case IEEE1366_MOMENTARY_INTERRUPTION_VALUE:
            return IEEE1366_MOMENTARY_INTERRUPTION;
        case IEEE1366_MOMENTARY_INTERRUPTION_EVENT_VALUE:
            return IEEE1366_MOMENTARY_INTERRUPTION_EVENT;
        case IEEE1366_SUSTAINED_INTERRUPTION_VALUE:
            return IEEE1366_SUSTAINED_INTERRUPTION;
        case INTERRUPTION_BEHAVIOUR_VALUE:
            return INTERRUPTION_BEHAVIOUR;
        case INVERSION_TAMPER_VALUE:
            return INVERSION_TAMPER;
        case LOAD_INTERRUPT_VALUE:
            return LOAD_INTERRUPT;
        case LOAD_SHED_VALUE:
            return LOAD_SHED;
        case MAINTENANCE_VALUE:
            return MAINTENANCE;
        case PHYSICAL_TAMPER_VALUE:
            return PHYSICAL_TAMPER;
        case POWER_LOSS_TAMPER_VALUE:
            return POWER_LOSS_TAMPER;
        case POWER_OUTAGE_VALUE:
            return POWER_OUTAGE;
        case POWER_QUALITY_VALUE:
            return POWER_QUALITY;
        case POWER_RESTORATION_VALUE:
            return POWER_RESTORATION;
        case PROGRAMMED_VALUE:
            return PROGRAMMED;
        case PUSHBUTTON_VALUE:
            return PUSHBUTTON;
        case RELAY_ACTIVATION_VALUE:
            return RELAY_ACTIVATION;
        case RELAY_CYCLE_VALUE:
            return RELAY_CYCLE;
        case REMOVAL_TAMPER_VALUE:
            return REMOVAL_TAMPER;
        case REPROGRAMMING_TAMPER_VALUE:
            return REPROGRAMMING_TAMPER;
        case REVERSE_ROTATION_TAMPER_VALUE:
            return REVERSE_ROTATION_TAMPER;
        case SWITCH_ARMED_VALUE:
            return SWITCH_ARMED;
        case SWITCH_DISABLED_VALUE:
            return SWITCH_DISABLED;
        case TAMPER_VALUE:
            return TAMPER;
        case WATCHDOG_TIMEOUT_VALUE:
            return WATCHDOG_TIMEOUT;
        case BILL_LAST_PERIOD_VALUE:
            return BILL_LAST_PERIOD;
        case BILL_TO_DATE_VALUE:
            return BILL_TO_DATE;
        case BILL_CARRYOVER_VALUE:
            return BILL_CARRYOVER;
        case CONNECTION_FEE_VALUE:
            return CONNECTION_FEE;
        case AUDIBLE_VOLUME_VALUE:
            return AUDIBLE_VOLUME;
        case VOLUMETRIC_FLOW_VALUE:
            return VOLUMETRIC_FLOW;
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
    private MeasurementKind( int value, String name, String literal ) {
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

} //MeasurementKind
