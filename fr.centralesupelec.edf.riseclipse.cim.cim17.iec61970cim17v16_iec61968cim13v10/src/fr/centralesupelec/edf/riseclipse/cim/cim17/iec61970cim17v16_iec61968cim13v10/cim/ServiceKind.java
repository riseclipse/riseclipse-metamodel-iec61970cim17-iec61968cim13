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
 * A representation of the literals of the enumeration '<em><b>Service Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getServiceKind()
 * @model
 * @generated
 */
public enum ServiceKind implements Enumerator {
    /**
     * The '<em><b>Electricity</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ELECTRICITY_VALUE
     * @generated
     * @ordered
     */
    ELECTRICITY( 0, "electricity", "electricity" ),

    /**
     * The '<em><b>Gas</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GAS_VALUE
     * @generated
     * @ordered
     */
    GAS( 1, "gas", "gas" ),

    /**
     * The '<em><b>Water</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WATER_VALUE
     * @generated
     * @ordered
     */
    WATER( 2, "water", "water" ),

    /**
     * The '<em><b>Time</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TIME_VALUE
     * @generated
     * @ordered
     */
    TIME( 3, "time", "time" ),

    /**
     * The '<em><b>Heat</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HEAT_VALUE
     * @generated
     * @ordered
     */
    HEAT( 4, "heat", "heat" ),

    /**
     * The '<em><b>Refuse</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REFUSE_VALUE
     * @generated
     * @ordered
     */
    REFUSE( 5, "refuse", "refuse" ),

    /**
     * The '<em><b>Sewerage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEWERAGE_VALUE
     * @generated
     * @ordered
     */
    SEWERAGE( 6, "sewerage", "sewerage" ),

    /**
     * The '<em><b>Rates</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RATES_VALUE
     * @generated
     * @ordered
     */
    RATES( 7, "rates", "rates" ),

    /**
     * The '<em><b>Tv Licence</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TV_LICENCE_VALUE
     * @generated
     * @ordered
     */
    TV_LICENCE( 8, "tvLicence", "tvLicence" ),

    /**
     * The '<em><b>Internet</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERNET_VALUE
     * @generated
     * @ordered
     */
    INTERNET( 9, "internet", "internet" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 10, "other", "other" ),

    /**
     * The '<em><b>Air</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AIR_VALUE
     * @generated
     * @ordered
     */
    AIR( 11, "air", "air" ),

    /**
     * The '<em><b>Natural Gas</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NATURAL_GAS_VALUE
     * @generated
     * @ordered
     */
    NATURAL_GAS( 12, "naturalGas", "naturalGas" ),

    /**
     * The '<em><b>Propane</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PROPANE_VALUE
     * @generated
     * @ordered
     */
    PROPANE( 13, "propane", "propane" ),

    /**
     * The '<em><b>Steam</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STEAM_VALUE
     * @generated
     * @ordered
     */
    STEAM( 14, "steam", "steam" ),

    /**
     * The '<em><b>Heating Fluid</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HEATING_FLUID_VALUE
     * @generated
     * @ordered
     */
    HEATING_FLUID( 15, "heatingFluid", "heatingFluid" );

    /**
     * The '<em><b>Electricity</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Electricity</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ELECTRICITY
     * @model name="electricity"
     * @generated
     * @ordered
     */
    public static final int ELECTRICITY_VALUE = 0;

    /**
     * The '<em><b>Gas</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Gas</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GAS
     * @model name="gas"
     * @generated
     * @ordered
     */
    public static final int GAS_VALUE = 1;

    /**
     * The '<em><b>Water</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Water</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WATER
     * @model name="water"
     * @generated
     * @ordered
     */
    public static final int WATER_VALUE = 2;

    /**
     * The '<em><b>Time</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TIME
     * @model name="time"
     * @generated
     * @ordered
     */
    public static final int TIME_VALUE = 3;

    /**
     * The '<em><b>Heat</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Heat</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HEAT
     * @model name="heat"
     * @generated
     * @ordered
     */
    public static final int HEAT_VALUE = 4;

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
    public static final int REFUSE_VALUE = 5;

    /**
     * The '<em><b>Sewerage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sewerage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SEWERAGE
     * @model name="sewerage"
     * @generated
     * @ordered
     */
    public static final int SEWERAGE_VALUE = 6;

    /**
     * The '<em><b>Rates</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rates</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RATES
     * @model name="rates"
     * @generated
     * @ordered
     */
    public static final int RATES_VALUE = 7;

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
    public static final int TV_LICENCE_VALUE = 8;

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
    public static final int INTERNET_VALUE = 9;

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
    public static final int OTHER_VALUE = 10;

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
    public static final int AIR_VALUE = 11;

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
    public static final int NATURAL_GAS_VALUE = 12;

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
    public static final int PROPANE_VALUE = 13;

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
    public static final int STEAM_VALUE = 14;

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
    public static final int HEATING_FLUID_VALUE = 15;

    /**
     * An array of all the '<em><b>Service Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ServiceKind[] VALUES_ARRAY = new ServiceKind[] { ELECTRICITY, GAS, WATER, TIME, HEAT, REFUSE,
            SEWERAGE, RATES, TV_LICENCE, INTERNET, OTHER, AIR, NATURAL_GAS, PROPANE, STEAM, HEATING_FLUID, };

    /**
     * A public read-only list of all the '<em><b>Service Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ServiceKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Service Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ServiceKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ServiceKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Service Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ServiceKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ServiceKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Service Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ServiceKind get( int value ) {
        switch( value ) {
        case ELECTRICITY_VALUE:
            return ELECTRICITY;
        case GAS_VALUE:
            return GAS;
        case WATER_VALUE:
            return WATER;
        case TIME_VALUE:
            return TIME;
        case HEAT_VALUE:
            return HEAT;
        case REFUSE_VALUE:
            return REFUSE;
        case SEWERAGE_VALUE:
            return SEWERAGE;
        case RATES_VALUE:
            return RATES;
        case TV_LICENCE_VALUE:
            return TV_LICENCE;
        case INTERNET_VALUE:
            return INTERNET;
        case OTHER_VALUE:
            return OTHER;
        case AIR_VALUE:
            return AIR;
        case NATURAL_GAS_VALUE:
            return NATURAL_GAS;
        case PROPANE_VALUE:
            return PROPANE;
        case STEAM_VALUE:
            return STEAM;
        case HEATING_FLUID_VALUE:
            return HEATING_FLUID;
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
    private ServiceKind( int value, String name, String literal ) {
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

} //ServiceKind
