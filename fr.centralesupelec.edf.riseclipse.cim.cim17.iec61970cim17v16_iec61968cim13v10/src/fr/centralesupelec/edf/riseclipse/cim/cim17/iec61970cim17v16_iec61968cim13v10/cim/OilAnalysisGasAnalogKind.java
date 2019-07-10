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
 * A representation of the literals of the enumeration '<em><b>Oil Analysis Gas Analog Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOilAnalysisGasAnalogKind()
 * @model
 * @generated
 */
public enum OilAnalysisGasAnalogKind implements Enumerator {
    /**
     * The '<em><b>Hydrogen</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HYDROGEN_VALUE
     * @generated
     * @ordered
     */
    HYDROGEN( 0, "hydrogen", "hydrogen" ),

    /**
     * The '<em><b>Methane</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #METHANE_VALUE
     * @generated
     * @ordered
     */
    METHANE( 1, "methane", "methane" ),

    /**
     * The '<em><b>Ethane</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ETHANE_VALUE
     * @generated
     * @ordered
     */
    ETHANE( 2, "ethane", "ethane" ),

    /**
     * The '<em><b>Ethylene</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ETHYLENE_VALUE
     * @generated
     * @ordered
     */
    ETHYLENE( 3, "ethylene", "ethylene" ),

    /**
     * The '<em><b>Acetylene</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ACETYLENE_VALUE
     * @generated
     * @ordered
     */
    ACETYLENE( 4, "acetylene", "acetylene" ),

    /**
     * The '<em><b>Carbon Monoxide</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CARBON_MONOXIDE_VALUE
     * @generated
     * @ordered
     */
    CARBON_MONOXIDE( 5, "carbonMonoxide", "carbonMonoxide" ),

    /**
     * The '<em><b>Propane</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PROPANE_VALUE
     * @generated
     * @ordered
     */
    PROPANE( 6, "propane", "propane" ),

    /**
     * The '<em><b>Propene</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PROPENE_VALUE
     * @generated
     * @ordered
     */
    PROPENE( 7, "propene", "propene" ),

    /**
     * The '<em><b>Carbon Dioxide</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CARBON_DIOXIDE_VALUE
     * @generated
     * @ordered
     */
    CARBON_DIOXIDE( 8, "carbonDioxide", "carbonDioxide" ),

    /**
     * The '<em><b>Oxygen</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OXYGEN_VALUE
     * @generated
     * @ordered
     */
    OXYGEN( 9, "oxygen", "oxygen" ),

    /**
     * The '<em><b>Nitrogen</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NITROGEN_VALUE
     * @generated
     * @ordered
     */
    NITROGEN( 10, "nitrogen", "nitrogen" ),

    /**
     * The '<em><b>Total Dissolved Gas Percent</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOTAL_DISSOLVED_GAS_PERCENT_VALUE
     * @generated
     * @ordered
     */
    TOTAL_DISSOLVED_GAS_PERCENT( 11, "totalDissolvedGasPercent", "totalDissolvedGasPercent" ),

    /**
     * The '<em><b>Total Combustible Gas Percent</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOTAL_COMBUSTIBLE_GAS_PERCENT_VALUE
     * @generated
     * @ordered
     */
    TOTAL_COMBUSTIBLE_GAS_PERCENT( 12, "totalCombustibleGasPercent", "totalCombustibleGasPercent" ),

    /**
     * The '<em><b>Butane</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUTANE_VALUE
     * @generated
     * @ordered
     */
    BUTANE( 13, "butane", "butane" ),

    /**
     * The '<em><b>Carbon</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CARBON_VALUE
     * @generated
     * @ordered
     */
    CARBON( 14, "carbon", "carbon" ),

    /**
     * The '<em><b>Carbon3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CARBON3_VALUE
     * @generated
     * @ordered
     */
    CARBON3( 15, "carbon3", "carbon3" ),

    /**
     * The '<em><b>Carbon4</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CARBON4_VALUE
     * @generated
     * @ordered
     */
    CARBON4( 16, "carbon4", "carbon4" ),

    /**
     * The '<em><b>Isobutane</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ISOBUTANE_VALUE
     * @generated
     * @ordered
     */
    ISOBUTANE( 17, "isobutane", "isobutane" ),

    /**
     * The '<em><b>Equivalent TCG Percent</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EQUIVALENT_TCG_PERCENT_VALUE
     * @generated
     * @ordered
     */
    EQUIVALENT_TCG_PERCENT( 18, "equivalentTCGPercent", "equivalentTCGPercent" ),

    /**
     * The '<em><b>Total Heat Gas</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOTAL_HEAT_GAS_VALUE
     * @generated
     * @ordered
     */
    TOTAL_HEAT_GAS( 19, "totalHeatGas", "totalHeatGas" ),

    /**
     * The '<em><b>Total Dissolved Combustible Gas</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOTAL_DISSOLVED_COMBUSTIBLE_GAS_VALUE
     * @generated
     * @ordered
     */
    TOTAL_DISSOLVED_COMBUSTIBLE_GAS( 20, "totalDissolvedCombustibleGas", "totalDissolvedCombustibleGas" ),

    /**
     * The '<em><b>Total Partial Pressure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOTAL_PARTIAL_PRESSURE_VALUE
     * @generated
     * @ordered
     */
    TOTAL_PARTIAL_PRESSURE( 21, "totalPartialPressure", "totalPartialPressure" ),

    /**
     * The '<em><b>Estimated Safe Handling Limit</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ESTIMATED_SAFE_HANDLING_LIMIT_VALUE
     * @generated
     * @ordered
     */
    ESTIMATED_SAFE_HANDLING_LIMIT( 22, "estimatedSafeHandlingLimit", "estimatedSafeHandlingLimit" ),

    /**
     * The '<em><b>Hydran</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HYDRAN_VALUE
     * @generated
     * @ordered
     */
    HYDRAN( 23, "hydran", "hydran" ),

    /**
     * The '<em><b>Hydran Predicted</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HYDRAN_PREDICTED_VALUE
     * @generated
     * @ordered
     */
    HYDRAN_PREDICTED( 24, "hydranPredicted", "hydranPredicted" );

    /**
     * The '<em><b>Hydrogen</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hydrogen</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HYDROGEN
     * @model name="hydrogen"
     * @generated
     * @ordered
     */
    public static final int HYDROGEN_VALUE = 0;

    /**
     * The '<em><b>Methane</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Methane</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #METHANE
     * @model name="methane"
     * @generated
     * @ordered
     */
    public static final int METHANE_VALUE = 1;

    /**
     * The '<em><b>Ethane</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ethane</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ETHANE
     * @model name="ethane"
     * @generated
     * @ordered
     */
    public static final int ETHANE_VALUE = 2;

    /**
     * The '<em><b>Ethylene</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ethylene</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ETHYLENE
     * @model name="ethylene"
     * @generated
     * @ordered
     */
    public static final int ETHYLENE_VALUE = 3;

    /**
     * The '<em><b>Acetylene</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Acetylene</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ACETYLENE
     * @model name="acetylene"
     * @generated
     * @ordered
     */
    public static final int ACETYLENE_VALUE = 4;

    /**
     * The '<em><b>Carbon Monoxide</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Carbon Monoxide</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CARBON_MONOXIDE
     * @model name="carbonMonoxide"
     * @generated
     * @ordered
     */
    public static final int CARBON_MONOXIDE_VALUE = 5;

    /**
     * The '<em><b>Propane</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Propane</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PROPANE
     * @model name="propane"
     * @generated
     * @ordered
     */
    public static final int PROPANE_VALUE = 6;

    /**
     * The '<em><b>Propene</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Propene</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PROPENE
     * @model name="propene"
     * @generated
     * @ordered
     */
    public static final int PROPENE_VALUE = 7;

    /**
     * The '<em><b>Carbon Dioxide</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Carbon Dioxide</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CARBON_DIOXIDE
     * @model name="carbonDioxide"
     * @generated
     * @ordered
     */
    public static final int CARBON_DIOXIDE_VALUE = 8;

    /**
     * The '<em><b>Oxygen</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oxygen</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OXYGEN
     * @model name="oxygen"
     * @generated
     * @ordered
     */
    public static final int OXYGEN_VALUE = 9;

    /**
     * The '<em><b>Nitrogen</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Nitrogen</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NITROGEN
     * @model name="nitrogen"
     * @generated
     * @ordered
     */
    public static final int NITROGEN_VALUE = 10;

    /**
     * The '<em><b>Total Dissolved Gas Percent</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Total Dissolved Gas Percent</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TOTAL_DISSOLVED_GAS_PERCENT
     * @model name="totalDissolvedGasPercent"
     * @generated
     * @ordered
     */
    public static final int TOTAL_DISSOLVED_GAS_PERCENT_VALUE = 11;

    /**
     * The '<em><b>Total Combustible Gas Percent</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Total Combustible Gas Percent</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TOTAL_COMBUSTIBLE_GAS_PERCENT
     * @model name="totalCombustibleGasPercent"
     * @generated
     * @ordered
     */
    public static final int TOTAL_COMBUSTIBLE_GAS_PERCENT_VALUE = 12;

    /**
     * The '<em><b>Butane</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Butane</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUTANE
     * @model name="butane"
     * @generated
     * @ordered
     */
    public static final int BUTANE_VALUE = 13;

    /**
     * The '<em><b>Carbon</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Carbon</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CARBON
     * @model name="carbon"
     * @generated
     * @ordered
     */
    public static final int CARBON_VALUE = 14;

    /**
     * The '<em><b>Carbon3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Carbon3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CARBON3
     * @model name="carbon3"
     * @generated
     * @ordered
     */
    public static final int CARBON3_VALUE = 15;

    /**
     * The '<em><b>Carbon4</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Carbon4</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CARBON4
     * @model name="carbon4"
     * @generated
     * @ordered
     */
    public static final int CARBON4_VALUE = 16;

    /**
     * The '<em><b>Isobutane</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Isobutane</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ISOBUTANE
     * @model name="isobutane"
     * @generated
     * @ordered
     */
    public static final int ISOBUTANE_VALUE = 17;

    /**
     * The '<em><b>Equivalent TCG Percent</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Equivalent TCG Percent</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EQUIVALENT_TCG_PERCENT
     * @model name="equivalentTCGPercent"
     * @generated
     * @ordered
     */
    public static final int EQUIVALENT_TCG_PERCENT_VALUE = 18;

    /**
     * The '<em><b>Total Heat Gas</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Total Heat Gas</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TOTAL_HEAT_GAS
     * @model name="totalHeatGas"
     * @generated
     * @ordered
     */
    public static final int TOTAL_HEAT_GAS_VALUE = 19;

    /**
     * The '<em><b>Total Dissolved Combustible Gas</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Total Dissolved Combustible Gas</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TOTAL_DISSOLVED_COMBUSTIBLE_GAS
     * @model name="totalDissolvedCombustibleGas"
     * @generated
     * @ordered
     */
    public static final int TOTAL_DISSOLVED_COMBUSTIBLE_GAS_VALUE = 20;

    /**
     * The '<em><b>Total Partial Pressure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Total Partial Pressure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TOTAL_PARTIAL_PRESSURE
     * @model name="totalPartialPressure"
     * @generated
     * @ordered
     */
    public static final int TOTAL_PARTIAL_PRESSURE_VALUE = 21;

    /**
     * The '<em><b>Estimated Safe Handling Limit</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Estimated Safe Handling Limit</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ESTIMATED_SAFE_HANDLING_LIMIT
     * @model name="estimatedSafeHandlingLimit"
     * @generated
     * @ordered
     */
    public static final int ESTIMATED_SAFE_HANDLING_LIMIT_VALUE = 22;

    /**
     * The '<em><b>Hydran</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hydran</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HYDRAN
     * @model name="hydran"
     * @generated
     * @ordered
     */
    public static final int HYDRAN_VALUE = 23;

    /**
     * The '<em><b>Hydran Predicted</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hydran Predicted</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HYDRAN_PREDICTED
     * @model name="hydranPredicted"
     * @generated
     * @ordered
     */
    public static final int HYDRAN_PREDICTED_VALUE = 24;

    /**
     * An array of all the '<em><b>Oil Analysis Gas Analog Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OilAnalysisGasAnalogKind[] VALUES_ARRAY = new OilAnalysisGasAnalogKind[] { HYDROGEN, METHANE,
            ETHANE, ETHYLENE, ACETYLENE, CARBON_MONOXIDE, PROPANE, PROPENE, CARBON_DIOXIDE, OXYGEN, NITROGEN,
            TOTAL_DISSOLVED_GAS_PERCENT, TOTAL_COMBUSTIBLE_GAS_PERCENT, BUTANE, CARBON, CARBON3, CARBON4, ISOBUTANE,
            EQUIVALENT_TCG_PERCENT, TOTAL_HEAT_GAS, TOTAL_DISSOLVED_COMBUSTIBLE_GAS, TOTAL_PARTIAL_PRESSURE,
            ESTIMATED_SAFE_HANDLING_LIMIT, HYDRAN, HYDRAN_PREDICTED, };

    /**
     * A public read-only list of all the '<em><b>Oil Analysis Gas Analog Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< OilAnalysisGasAnalogKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Oil Analysis Gas Analog Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisGasAnalogKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OilAnalysisGasAnalogKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Oil Analysis Gas Analog Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisGasAnalogKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OilAnalysisGasAnalogKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Oil Analysis Gas Analog Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisGasAnalogKind get( int value ) {
        switch( value ) {
        case HYDROGEN_VALUE:
            return HYDROGEN;
        case METHANE_VALUE:
            return METHANE;
        case ETHANE_VALUE:
            return ETHANE;
        case ETHYLENE_VALUE:
            return ETHYLENE;
        case ACETYLENE_VALUE:
            return ACETYLENE;
        case CARBON_MONOXIDE_VALUE:
            return CARBON_MONOXIDE;
        case PROPANE_VALUE:
            return PROPANE;
        case PROPENE_VALUE:
            return PROPENE;
        case CARBON_DIOXIDE_VALUE:
            return CARBON_DIOXIDE;
        case OXYGEN_VALUE:
            return OXYGEN;
        case NITROGEN_VALUE:
            return NITROGEN;
        case TOTAL_DISSOLVED_GAS_PERCENT_VALUE:
            return TOTAL_DISSOLVED_GAS_PERCENT;
        case TOTAL_COMBUSTIBLE_GAS_PERCENT_VALUE:
            return TOTAL_COMBUSTIBLE_GAS_PERCENT;
        case BUTANE_VALUE:
            return BUTANE;
        case CARBON_VALUE:
            return CARBON;
        case CARBON3_VALUE:
            return CARBON3;
        case CARBON4_VALUE:
            return CARBON4;
        case ISOBUTANE_VALUE:
            return ISOBUTANE;
        case EQUIVALENT_TCG_PERCENT_VALUE:
            return EQUIVALENT_TCG_PERCENT;
        case TOTAL_HEAT_GAS_VALUE:
            return TOTAL_HEAT_GAS;
        case TOTAL_DISSOLVED_COMBUSTIBLE_GAS_VALUE:
            return TOTAL_DISSOLVED_COMBUSTIBLE_GAS;
        case TOTAL_PARTIAL_PRESSURE_VALUE:
            return TOTAL_PARTIAL_PRESSURE;
        case ESTIMATED_SAFE_HANDLING_LIMIT_VALUE:
            return ESTIMATED_SAFE_HANDLING_LIMIT;
        case HYDRAN_VALUE:
            return HYDRAN;
        case HYDRAN_PREDICTED_VALUE:
            return HYDRAN_PREDICTED;
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
    private OilAnalysisGasAnalogKind( int value, String name, String literal ) {
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

} //OilAnalysisGasAnalogKind
