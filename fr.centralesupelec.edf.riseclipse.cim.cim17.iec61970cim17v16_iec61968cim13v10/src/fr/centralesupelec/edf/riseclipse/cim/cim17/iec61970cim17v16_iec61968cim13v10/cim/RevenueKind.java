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
 * A representation of the literals of the enumeration '<em><b>Revenue Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRevenueKind()
 * @model
 * @generated
 */
public enum RevenueKind implements Enumerator {
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
     * The '<em><b>Non Residential</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NON_RESIDENTIAL_VALUE
     * @generated
     * @ordered
     */
    NON_RESIDENTIAL( 1, "nonResidential", "nonResidential" ),

    /**
     * The '<em><b>Commercial</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMMERCIAL_VALUE
     * @generated
     * @ordered
     */
    COMMERCIAL( 2, "commercial", "commercial" ),

    /**
     * The '<em><b>Industrial</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INDUSTRIAL_VALUE
     * @generated
     * @ordered
     */
    INDUSTRIAL( 3, "industrial", "industrial" ),

    /**
     * The '<em><b>Irrigation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IRRIGATION_VALUE
     * @generated
     * @ordered
     */
    IRRIGATION( 4, "irrigation", "irrigation" ),

    /**
     * The '<em><b>Street Light</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STREET_LIGHT_VALUE
     * @generated
     * @ordered
     */
    STREET_LIGHT( 5, "streetLight", "streetLight" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 6, "other", "other" );

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
     * The '<em><b>Non Residential</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Non Residential</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NON_RESIDENTIAL
     * @model name="nonResidential"
     * @generated
     * @ordered
     */
    public static final int NON_RESIDENTIAL_VALUE = 1;

    /**
     * The '<em><b>Commercial</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Commercial</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COMMERCIAL
     * @model name="commercial"
     * @generated
     * @ordered
     */
    public static final int COMMERCIAL_VALUE = 2;

    /**
     * The '<em><b>Industrial</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Industrial</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INDUSTRIAL
     * @model name="industrial"
     * @generated
     * @ordered
     */
    public static final int INDUSTRIAL_VALUE = 3;

    /**
     * The '<em><b>Irrigation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Irrigation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IRRIGATION
     * @model name="irrigation"
     * @generated
     * @ordered
     */
    public static final int IRRIGATION_VALUE = 4;

    /**
     * The '<em><b>Street Light</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Street Light</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STREET_LIGHT
     * @model name="streetLight"
     * @generated
     * @ordered
     */
    public static final int STREET_LIGHT_VALUE = 5;

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
    public static final int OTHER_VALUE = 6;

    /**
     * An array of all the '<em><b>Revenue Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final RevenueKind[] VALUES_ARRAY = new RevenueKind[] { RESIDENTIAL, NON_RESIDENTIAL, COMMERCIAL,
            INDUSTRIAL, IRRIGATION, STREET_LIGHT, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Revenue Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< RevenueKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Revenue Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RevenueKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            RevenueKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Revenue Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RevenueKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            RevenueKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Revenue Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RevenueKind get( int value ) {
        switch( value ) {
        case RESIDENTIAL_VALUE:
            return RESIDENTIAL;
        case NON_RESIDENTIAL_VALUE:
            return NON_RESIDENTIAL;
        case COMMERCIAL_VALUE:
            return COMMERCIAL;
        case INDUSTRIAL_VALUE:
            return INDUSTRIAL;
        case IRRIGATION_VALUE:
            return IRRIGATION;
        case STREET_LIGHT_VALUE:
            return STREET_LIGHT;
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
    private RevenueKind( int value, String name, String literal ) {
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

} //RevenueKind
