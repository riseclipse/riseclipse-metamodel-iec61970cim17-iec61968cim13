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
 * A representation of the literals of the enumeration '<em><b>Commodity Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCommodityKind()
 * @model
 * @generated
 */
public enum CommodityKind implements Enumerator {
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
     * The '<em><b>Electricity Secondary Metered</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ELECTRICITY_SECONDARY_METERED_VALUE
     * @generated
     * @ordered
     */
    ELECTRICITY_SECONDARY_METERED( 1, "electricitySecondaryMetered", "electricitySecondaryMetered" ),

    /**
     * The '<em><b>Electricity Primary Metered</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ELECTRICITY_PRIMARY_METERED_VALUE
     * @generated
     * @ordered
     */
    ELECTRICITY_PRIMARY_METERED( 2, "electricityPrimaryMetered", "electricityPrimaryMetered" ),

    /**
     * The '<em><b>Communication</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMMUNICATION_VALUE
     * @generated
     * @ordered
     */
    COMMUNICATION( 3, "communication", "communication" ),

    /**
     * The '<em><b>Air</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AIR_VALUE
     * @generated
     * @ordered
     */
    AIR( 4, "air", "air" ),

    /**
     * The '<em><b>Insulative Gas</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSULATIVE_GAS_VALUE
     * @generated
     * @ordered
     */
    INSULATIVE_GAS( 5, "insulativeGas", "insulativeGas" ),

    /**
     * The '<em><b>Insulative Oil</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSULATIVE_OIL_VALUE
     * @generated
     * @ordered
     */
    INSULATIVE_OIL( 6, "insulativeOil", "insulativeOil" ),

    /**
     * The '<em><b>Natural Gas</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NATURAL_GAS_VALUE
     * @generated
     * @ordered
     */
    NATURAL_GAS( 7, "naturalGas", "naturalGas" ),

    /**
     * The '<em><b>Propane</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PROPANE_VALUE
     * @generated
     * @ordered
     */
    PROPANE( 8, "propane", "propane" ),

    /**
     * The '<em><b>Potable Water</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POTABLE_WATER_VALUE
     * @generated
     * @ordered
     */
    POTABLE_WATER( 9, "potableWater", "potableWater" ),

    /**
     * The '<em><b>Steam</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STEAM_VALUE
     * @generated
     * @ordered
     */
    STEAM( 10, "steam", "steam" ),

    /**
     * The '<em><b>Waste Water</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WASTE_WATER_VALUE
     * @generated
     * @ordered
     */
    WASTE_WATER( 11, "wasteWater", "wasteWater" ),

    /**
     * The '<em><b>Heating Fluid</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HEATING_FLUID_VALUE
     * @generated
     * @ordered
     */
    HEATING_FLUID( 12, "heatingFluid", "heatingFluid" ),

    /**
     * The '<em><b>Cooling Fluid</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COOLING_FLUID_VALUE
     * @generated
     * @ordered
     */
    COOLING_FLUID( 13, "coolingFluid", "coolingFluid" ),

    /**
     * The '<em><b>Nonpotable Water</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONPOTABLE_WATER_VALUE
     * @generated
     * @ordered
     */
    NONPOTABLE_WATER( 14, "nonpotableWater", "nonpotableWater" ),

    /**
     * The '<em><b>Nox</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOX_VALUE
     * @generated
     * @ordered
     */
    NOX( 15, "nox", "nox" ),

    /**
     * The '<em><b>So2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SO2_VALUE
     * @generated
     * @ordered
     */
    SO2( 16, "so2", "so2" ),

    /**
     * The '<em><b>Ch4</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CH4_VALUE
     * @generated
     * @ordered
     */
    CH4( 17, "ch4", "ch4" ),

    /**
     * The '<em><b>Co2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CO2_VALUE
     * @generated
     * @ordered
     */
    CO2( 18, "co2", "co2" ),

    /**
     * The '<em><b>Carbon</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CARBON_VALUE
     * @generated
     * @ordered
     */
    CARBON( 19, "carbon", "carbon" ),

    /**
     * The '<em><b>Hch</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HCH_VALUE
     * @generated
     * @ordered
     */
    HCH( 20, "hch", "hch" ),

    /**
     * The '<em><b>Pfc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PFC_VALUE
     * @generated
     * @ordered
     */
    PFC( 21, "pfc", "pfc" ),

    /**
     * The '<em><b>Sf6</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SF6_VALUE
     * @generated
     * @ordered
     */
    SF6( 22, "sf6", "sf6" ),

    /**
     * The '<em><b>Tv Licence</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TV_LICENCE_VALUE
     * @generated
     * @ordered
     */
    TV_LICENCE( 23, "tvLicence", "tvLicence" ),

    /**
     * The '<em><b>Internet</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERNET_VALUE
     * @generated
     * @ordered
     */
    INTERNET( 24, "internet", "internet" ),

    /**
     * The '<em><b>Refuse</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REFUSE_VALUE
     * @generated
     * @ordered
     */
    REFUSE( 25, "refuse", "refuse" );

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
     * The '<em><b>Electricity Secondary Metered</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Electricity Secondary Metered</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ELECTRICITY_SECONDARY_METERED
     * @model name="electricitySecondaryMetered"
     * @generated
     * @ordered
     */
    public static final int ELECTRICITY_SECONDARY_METERED_VALUE = 1;

    /**
     * The '<em><b>Electricity Primary Metered</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Electricity Primary Metered</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ELECTRICITY_PRIMARY_METERED
     * @model name="electricityPrimaryMetered"
     * @generated
     * @ordered
     */
    public static final int ELECTRICITY_PRIMARY_METERED_VALUE = 2;

    /**
     * The '<em><b>Communication</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Communication</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COMMUNICATION
     * @model name="communication"
     * @generated
     * @ordered
     */
    public static final int COMMUNICATION_VALUE = 3;

    /**
     * The '<em><b>Air</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Air</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AIR
     * @model name="air"
     * @generated
     * @ordered
     */
    public static final int AIR_VALUE = 4;

    /**
     * The '<em><b>Insulative Gas</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Insulative Gas</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INSULATIVE_GAS
     * @model name="insulativeGas"
     * @generated
     * @ordered
     */
    public static final int INSULATIVE_GAS_VALUE = 5;

    /**
     * The '<em><b>Insulative Oil</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Insulative Oil</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INSULATIVE_OIL
     * @model name="insulativeOil"
     * @generated
     * @ordered
     */
    public static final int INSULATIVE_OIL_VALUE = 6;

    /**
     * The '<em><b>Natural Gas</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Natural Gas</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NATURAL_GAS
     * @model name="naturalGas"
     * @generated
     * @ordered
     */
    public static final int NATURAL_GAS_VALUE = 7;

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
    public static final int PROPANE_VALUE = 8;

    /**
     * The '<em><b>Potable Water</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Potable Water</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POTABLE_WATER
     * @model name="potableWater"
     * @generated
     * @ordered
     */
    public static final int POTABLE_WATER_VALUE = 9;

    /**
     * The '<em><b>Steam</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Steam</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STEAM
     * @model name="steam"
     * @generated
     * @ordered
     */
    public static final int STEAM_VALUE = 10;

    /**
     * The '<em><b>Waste Water</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Waste Water</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WASTE_WATER
     * @model name="wasteWater"
     * @generated
     * @ordered
     */
    public static final int WASTE_WATER_VALUE = 11;

    /**
     * The '<em><b>Heating Fluid</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Heating Fluid</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HEATING_FLUID
     * @model name="heatingFluid"
     * @generated
     * @ordered
     */
    public static final int HEATING_FLUID_VALUE = 12;

    /**
     * The '<em><b>Cooling Fluid</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Cooling Fluid</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COOLING_FLUID
     * @model name="coolingFluid"
     * @generated
     * @ordered
     */
    public static final int COOLING_FLUID_VALUE = 13;

    /**
     * The '<em><b>Nonpotable Water</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Nonpotable Water</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NONPOTABLE_WATER
     * @model name="nonpotableWater"
     * @generated
     * @ordered
     */
    public static final int NONPOTABLE_WATER_VALUE = 14;

    /**
     * The '<em><b>Nox</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Nox</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NOX
     * @model name="nox"
     * @generated
     * @ordered
     */
    public static final int NOX_VALUE = 15;

    /**
     * The '<em><b>So2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>So2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SO2
     * @model name="so2"
     * @generated
     * @ordered
     */
    public static final int SO2_VALUE = 16;

    /**
     * The '<em><b>Ch4</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ch4</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CH4
     * @model name="ch4"
     * @generated
     * @ordered
     */
    public static final int CH4_VALUE = 17;

    /**
     * The '<em><b>Co2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Co2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CO2
     * @model name="co2"
     * @generated
     * @ordered
     */
    public static final int CO2_VALUE = 18;

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
    public static final int CARBON_VALUE = 19;

    /**
     * The '<em><b>Hch</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hch</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HCH
     * @model name="hch"
     * @generated
     * @ordered
     */
    public static final int HCH_VALUE = 20;

    /**
     * The '<em><b>Pfc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pfc</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PFC
     * @model name="pfc"
     * @generated
     * @ordered
     */
    public static final int PFC_VALUE = 21;

    /**
     * The '<em><b>Sf6</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sf6</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SF6
     * @model name="sf6"
     * @generated
     * @ordered
     */
    public static final int SF6_VALUE = 22;

    /**
     * The '<em><b>Tv Licence</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tv Licence</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TV_LICENCE
     * @model name="tvLicence"
     * @generated
     * @ordered
     */
    public static final int TV_LICENCE_VALUE = 23;

    /**
     * The '<em><b>Internet</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Internet</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTERNET
     * @model name="internet"
     * @generated
     * @ordered
     */
    public static final int INTERNET_VALUE = 24;

    /**
     * The '<em><b>Refuse</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Refuse</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REFUSE
     * @model name="refuse"
     * @generated
     * @ordered
     */
    public static final int REFUSE_VALUE = 25;

    /**
     * An array of all the '<em><b>Commodity Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final CommodityKind[] VALUES_ARRAY = new CommodityKind[] { NONE, ELECTRICITY_SECONDARY_METERED,
            ELECTRICITY_PRIMARY_METERED, COMMUNICATION, AIR, INSULATIVE_GAS, INSULATIVE_OIL, NATURAL_GAS, PROPANE,
            POTABLE_WATER, STEAM, WASTE_WATER, HEATING_FLUID, COOLING_FLUID, NONPOTABLE_WATER, NOX, SO2, CH4, CO2,
            CARBON, HCH, PFC, SF6, TV_LICENCE, INTERNET, REFUSE, };

    /**
     * A public read-only list of all the '<em><b>Commodity Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< CommodityKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Commodity Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CommodityKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            CommodityKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Commodity Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CommodityKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            CommodityKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Commodity Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CommodityKind get( int value ) {
        switch( value ) {
        case NONE_VALUE:
            return NONE;
        case ELECTRICITY_SECONDARY_METERED_VALUE:
            return ELECTRICITY_SECONDARY_METERED;
        case ELECTRICITY_PRIMARY_METERED_VALUE:
            return ELECTRICITY_PRIMARY_METERED;
        case COMMUNICATION_VALUE:
            return COMMUNICATION;
        case AIR_VALUE:
            return AIR;
        case INSULATIVE_GAS_VALUE:
            return INSULATIVE_GAS;
        case INSULATIVE_OIL_VALUE:
            return INSULATIVE_OIL;
        case NATURAL_GAS_VALUE:
            return NATURAL_GAS;
        case PROPANE_VALUE:
            return PROPANE;
        case POTABLE_WATER_VALUE:
            return POTABLE_WATER;
        case STEAM_VALUE:
            return STEAM;
        case WASTE_WATER_VALUE:
            return WASTE_WATER;
        case HEATING_FLUID_VALUE:
            return HEATING_FLUID;
        case COOLING_FLUID_VALUE:
            return COOLING_FLUID;
        case NONPOTABLE_WATER_VALUE:
            return NONPOTABLE_WATER;
        case NOX_VALUE:
            return NOX;
        case SO2_VALUE:
            return SO2;
        case CH4_VALUE:
            return CH4;
        case CO2_VALUE:
            return CO2;
        case CARBON_VALUE:
            return CARBON;
        case HCH_VALUE:
            return HCH;
        case PFC_VALUE:
            return PFC;
        case SF6_VALUE:
            return SF6;
        case TV_LICENCE_VALUE:
            return TV_LICENCE;
        case INTERNET_VALUE:
            return INTERNET;
        case REFUSE_VALUE:
            return REFUSE;
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
    private CommodityKind( int value, String name, String literal ) {
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

} //CommodityKind
