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
 * A representation of the literals of the enumeration '<em><b>Customer Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerKind()
 * @model
 * @generated
 */
public enum CustomerKind implements Enumerator {
    /**
     * The '<em><b>Residential</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESIDENTIAL_VALUE
     * @generated
     * @ordered
     */
    RESIDENTIAL( 0, "residential", "residential" ),

    /**
     * The '<em><b>Residential And Commercial</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESIDENTIAL_AND_COMMERCIAL_VALUE
     * @generated
     * @ordered
     */
    RESIDENTIAL_AND_COMMERCIAL( 1, "residentialAndCommercial", "residentialAndCommercial" ),

    /**
     * The '<em><b>Residential And Streetlight</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESIDENTIAL_AND_STREETLIGHT_VALUE
     * @generated
     * @ordered
     */
    RESIDENTIAL_AND_STREETLIGHT( 2, "residentialAndStreetlight", "residentialAndStreetlight" ),

    /**
     * The '<em><b>Residential Streetlight Others</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESIDENTIAL_STREETLIGHT_OTHERS_VALUE
     * @generated
     * @ordered
     */
    RESIDENTIAL_STREETLIGHT_OTHERS( 3, "residentialStreetlightOthers", "residentialStreetlightOthers" ),

    /**
     * The '<em><b>Residential Farm Service</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESIDENTIAL_FARM_SERVICE_VALUE
     * @generated
     * @ordered
     */
    RESIDENTIAL_FARM_SERVICE( 4, "residentialFarmService", "residentialFarmService" ),

    /**
     * The '<em><b>Commercial Industrial</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMMERCIAL_INDUSTRIAL_VALUE
     * @generated
     * @ordered
     */
    COMMERCIAL_INDUSTRIAL( 5, "commercialIndustrial", "commercialIndustrial" ),

    /**
     * The '<em><b>Pumping Load</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PUMPING_LOAD_VALUE
     * @generated
     * @ordered
     */
    PUMPING_LOAD( 6, "pumpingLoad", "pumpingLoad" ),

    /**
     * The '<em><b>Wind Machine</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WIND_MACHINE_VALUE
     * @generated
     * @ordered
     */
    WIND_MACHINE( 7, "windMachine", "windMachine" ),

    /**
     * The '<em><b>Energy Service Supplier</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENERGY_SERVICE_SUPPLIER_VALUE
     * @generated
     * @ordered
     */
    ENERGY_SERVICE_SUPPLIER( 8, "energyServiceSupplier", "energyServiceSupplier" ),

    /**
     * The '<em><b>Energy Service Scheduler</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENERGY_SERVICE_SCHEDULER_VALUE
     * @generated
     * @ordered
     */
    ENERGY_SERVICE_SCHEDULER( 9, "energyServiceScheduler", "energyServiceScheduler" ),

    /**
     * The '<em><b>Internal Use</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERNAL_USE_VALUE
     * @generated
     * @ordered
     */
    INTERNAL_USE( 10, "internalUse", "internalUse" ),

    /**
     * The '<em><b>Enterprise</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENTERPRISE_VALUE
     * @generated
     * @ordered
     */
    ENTERPRISE( 11, "enterprise", "enterprise" ),

    /**
     * The '<em><b>Regional Operator</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REGIONAL_OPERATOR_VALUE
     * @generated
     * @ordered
     */
    REGIONAL_OPERATOR( 12, "regionalOperator", "regionalOperator" ),

    /**
     * The '<em><b>Subsidiary</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBSIDIARY_VALUE
     * @generated
     * @ordered
     */
    SUBSIDIARY( 13, "subsidiary", "subsidiary" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 14, "other", "other" );

    /**
     * The '<em><b>Residential</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Residential</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RESIDENTIAL
     * @model name="residential"
     * @generated
     * @ordered
     */
    public static final int RESIDENTIAL_VALUE = 0;

    /**
     * The '<em><b>Residential And Commercial</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Residential And Commercial</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RESIDENTIAL_AND_COMMERCIAL
     * @model name="residentialAndCommercial"
     * @generated
     * @ordered
     */
    public static final int RESIDENTIAL_AND_COMMERCIAL_VALUE = 1;

    /**
     * The '<em><b>Residential And Streetlight</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Residential And Streetlight</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RESIDENTIAL_AND_STREETLIGHT
     * @model name="residentialAndStreetlight"
     * @generated
     * @ordered
     */
    public static final int RESIDENTIAL_AND_STREETLIGHT_VALUE = 2;

    /**
     * The '<em><b>Residential Streetlight Others</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Residential Streetlight Others</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RESIDENTIAL_STREETLIGHT_OTHERS
     * @model name="residentialStreetlightOthers"
     * @generated
     * @ordered
     */
    public static final int RESIDENTIAL_STREETLIGHT_OTHERS_VALUE = 3;

    /**
     * The '<em><b>Residential Farm Service</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Residential Farm Service</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RESIDENTIAL_FARM_SERVICE
     * @model name="residentialFarmService"
     * @generated
     * @ordered
     */
    public static final int RESIDENTIAL_FARM_SERVICE_VALUE = 4;

    /**
     * The '<em><b>Commercial Industrial</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Commercial Industrial</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COMMERCIAL_INDUSTRIAL
     * @model name="commercialIndustrial"
     * @generated
     * @ordered
     */
    public static final int COMMERCIAL_INDUSTRIAL_VALUE = 5;

    /**
     * The '<em><b>Pumping Load</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pumping Load</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PUMPING_LOAD
     * @model name="pumpingLoad"
     * @generated
     * @ordered
     */
    public static final int PUMPING_LOAD_VALUE = 6;

    /**
     * The '<em><b>Wind Machine</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Wind Machine</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WIND_MACHINE
     * @model name="windMachine"
     * @generated
     * @ordered
     */
    public static final int WIND_MACHINE_VALUE = 7;

    /**
     * The '<em><b>Energy Service Supplier</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Energy Service Supplier</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENERGY_SERVICE_SUPPLIER
     * @model name="energyServiceSupplier"
     * @generated
     * @ordered
     */
    public static final int ENERGY_SERVICE_SUPPLIER_VALUE = 8;

    /**
     * The '<em><b>Energy Service Scheduler</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Energy Service Scheduler</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENERGY_SERVICE_SCHEDULER
     * @model name="energyServiceScheduler"
     * @generated
     * @ordered
     */
    public static final int ENERGY_SERVICE_SCHEDULER_VALUE = 9;

    /**
     * The '<em><b>Internal Use</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Internal Use</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTERNAL_USE
     * @model name="internalUse"
     * @generated
     * @ordered
     */
    public static final int INTERNAL_USE_VALUE = 10;

    /**
     * The '<em><b>Enterprise</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Enterprise</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENTERPRISE
     * @model name="enterprise"
     * @generated
     * @ordered
     */
    public static final int ENTERPRISE_VALUE = 11;

    /**
     * The '<em><b>Regional Operator</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Regional Operator</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REGIONAL_OPERATOR
     * @model name="regionalOperator"
     * @generated
     * @ordered
     */
    public static final int REGIONAL_OPERATOR_VALUE = 12;

    /**
     * The '<em><b>Subsidiary</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Subsidiary</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBSIDIARY
     * @model name="subsidiary"
     * @generated
     * @ordered
     */
    public static final int SUBSIDIARY_VALUE = 13;

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
    public static final int OTHER_VALUE = 14;

    /**
     * An array of all the '<em><b>Customer Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final CustomerKind[] VALUES_ARRAY = new CustomerKind[] { RESIDENTIAL, RESIDENTIAL_AND_COMMERCIAL,
            RESIDENTIAL_AND_STREETLIGHT, RESIDENTIAL_STREETLIGHT_OTHERS, RESIDENTIAL_FARM_SERVICE,
            COMMERCIAL_INDUSTRIAL, PUMPING_LOAD, WIND_MACHINE, ENERGY_SERVICE_SUPPLIER, ENERGY_SERVICE_SCHEDULER,
            INTERNAL_USE, ENTERPRISE, REGIONAL_OPERATOR, SUBSIDIARY, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Customer Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< CustomerKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Customer Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CustomerKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            CustomerKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Customer Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CustomerKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            CustomerKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Customer Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CustomerKind get( int value ) {
        switch( value ) {
        case RESIDENTIAL_VALUE:
            return RESIDENTIAL;
        case RESIDENTIAL_AND_COMMERCIAL_VALUE:
            return RESIDENTIAL_AND_COMMERCIAL;
        case RESIDENTIAL_AND_STREETLIGHT_VALUE:
            return RESIDENTIAL_AND_STREETLIGHT;
        case RESIDENTIAL_STREETLIGHT_OTHERS_VALUE:
            return RESIDENTIAL_STREETLIGHT_OTHERS;
        case RESIDENTIAL_FARM_SERVICE_VALUE:
            return RESIDENTIAL_FARM_SERVICE;
        case COMMERCIAL_INDUSTRIAL_VALUE:
            return COMMERCIAL_INDUSTRIAL;
        case PUMPING_LOAD_VALUE:
            return PUMPING_LOAD;
        case WIND_MACHINE_VALUE:
            return WIND_MACHINE;
        case ENERGY_SERVICE_SUPPLIER_VALUE:
            return ENERGY_SERVICE_SUPPLIER;
        case ENERGY_SERVICE_SCHEDULER_VALUE:
            return ENERGY_SERVICE_SCHEDULER;
        case INTERNAL_USE_VALUE:
            return INTERNAL_USE;
        case ENTERPRISE_VALUE:
            return ENTERPRISE;
        case REGIONAL_OPERATOR_VALUE:
            return REGIONAL_OPERATOR;
        case SUBSIDIARY_VALUE:
            return SUBSIDIARY;
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
    private CustomerKind( int value, String name, String literal ) {
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

} //CustomerKind
