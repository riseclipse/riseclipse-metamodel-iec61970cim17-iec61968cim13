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
 * A representation of the literals of the enumeration '<em><b>Facility Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFacilityKind()
 * @model
 * @generated
 */
public enum FacilityKind implements Enumerator {
    /**
     * The '<em><b>Substation Hydro Plant</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBSTATION_HYDRO_PLANT_VALUE
     * @generated
     * @ordered
     */
    SUBSTATION_HYDRO_PLANT( 0, "substationHydroPlant", "substationHydroPlant" ),

    /**
     * The '<em><b>Substation Fossil Plant</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBSTATION_FOSSIL_PLANT_VALUE
     * @generated
     * @ordered
     */
    SUBSTATION_FOSSIL_PLANT( 1, "substationFossilPlant", "substationFossilPlant" ),

    /**
     * The '<em><b>Substation Nuclear Plant</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBSTATION_NUCLEAR_PLANT_VALUE
     * @generated
     * @ordered
     */
    SUBSTATION_NUCLEAR_PLANT( 2, "substationNuclearPlant", "substationNuclearPlant" ),

    /**
     * The '<em><b>Substation Transmission</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBSTATION_TRANSMISSION_VALUE
     * @generated
     * @ordered
     */
    SUBSTATION_TRANSMISSION( 3, "substationTransmission", "substationTransmission" ),

    /**
     * The '<em><b>Substation Sub Transmission</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBSTATION_SUB_TRANSMISSION_VALUE
     * @generated
     * @ordered
     */
    SUBSTATION_SUB_TRANSMISSION( 4, "substationSubTransmission", "substationSubTransmission" ),

    /**
     * The '<em><b>Substation Distribution</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBSTATION_DISTRIBUTION_VALUE
     * @generated
     * @ordered
     */
    SUBSTATION_DISTRIBUTION( 5, "substationDistribution", "substationDistribution" ),

    /**
     * The '<em><b>Distribution Pole Top</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISTRIBUTION_POLE_TOP_VALUE
     * @generated
     * @ordered
     */
    DISTRIBUTION_POLE_TOP( 6, "distributionPoleTop", "distributionPoleTop" );

    /**
     * The '<em><b>Substation Hydro Plant</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Substation Hydro Plant</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBSTATION_HYDRO_PLANT
     * @model name="substationHydroPlant"
     * @generated
     * @ordered
     */
    public static final int SUBSTATION_HYDRO_PLANT_VALUE = 0;

    /**
     * The '<em><b>Substation Fossil Plant</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Substation Fossil Plant</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBSTATION_FOSSIL_PLANT
     * @model name="substationFossilPlant"
     * @generated
     * @ordered
     */
    public static final int SUBSTATION_FOSSIL_PLANT_VALUE = 1;

    /**
     * The '<em><b>Substation Nuclear Plant</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Substation Nuclear Plant</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBSTATION_NUCLEAR_PLANT
     * @model name="substationNuclearPlant"
     * @generated
     * @ordered
     */
    public static final int SUBSTATION_NUCLEAR_PLANT_VALUE = 2;

    /**
     * The '<em><b>Substation Transmission</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Substation Transmission</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBSTATION_TRANSMISSION
     * @model name="substationTransmission"
     * @generated
     * @ordered
     */
    public static final int SUBSTATION_TRANSMISSION_VALUE = 3;

    /**
     * The '<em><b>Substation Sub Transmission</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Substation Sub Transmission</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBSTATION_SUB_TRANSMISSION
     * @model name="substationSubTransmission"
     * @generated
     * @ordered
     */
    public static final int SUBSTATION_SUB_TRANSMISSION_VALUE = 4;

    /**
     * The '<em><b>Substation Distribution</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Substation Distribution</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBSTATION_DISTRIBUTION
     * @model name="substationDistribution"
     * @generated
     * @ordered
     */
    public static final int SUBSTATION_DISTRIBUTION_VALUE = 5;

    /**
     * The '<em><b>Distribution Pole Top</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Distribution Pole Top</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISTRIBUTION_POLE_TOP
     * @model name="distributionPoleTop"
     * @generated
     * @ordered
     */
    public static final int DISTRIBUTION_POLE_TOP_VALUE = 6;

    /**
     * An array of all the '<em><b>Facility Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final FacilityKind[] VALUES_ARRAY = new FacilityKind[] { SUBSTATION_HYDRO_PLANT,
            SUBSTATION_FOSSIL_PLANT, SUBSTATION_NUCLEAR_PLANT, SUBSTATION_TRANSMISSION, SUBSTATION_SUB_TRANSMISSION,
            SUBSTATION_DISTRIBUTION, DISTRIBUTION_POLE_TOP, };

    /**
     * A public read-only list of all the '<em><b>Facility Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< FacilityKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Facility Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FacilityKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            FacilityKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Facility Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FacilityKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            FacilityKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Facility Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FacilityKind get( int value ) {
        switch( value ) {
        case SUBSTATION_HYDRO_PLANT_VALUE:
            return SUBSTATION_HYDRO_PLANT;
        case SUBSTATION_FOSSIL_PLANT_VALUE:
            return SUBSTATION_FOSSIL_PLANT;
        case SUBSTATION_NUCLEAR_PLANT_VALUE:
            return SUBSTATION_NUCLEAR_PLANT;
        case SUBSTATION_TRANSMISSION_VALUE:
            return SUBSTATION_TRANSMISSION;
        case SUBSTATION_SUB_TRANSMISSION_VALUE:
            return SUBSTATION_SUB_TRANSMISSION;
        case SUBSTATION_DISTRIBUTION_VALUE:
            return SUBSTATION_DISTRIBUTION;
        case DISTRIBUTION_POLE_TOP_VALUE:
            return DISTRIBUTION_POLE_TOP;
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
    private FacilityKind( int value, String name, String literal ) {
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

} //FacilityKind
