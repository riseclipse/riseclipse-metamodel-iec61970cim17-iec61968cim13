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
 * A representation of the literals of the enumeration '<em><b>Area Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAreaKind()
 * @model
 * @generated
 */
public enum AreaKind implements Enumerator {
    /**
     * The '<em><b>Borough</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOROUGH_VALUE
     * @generated
     * @ordered
     */
    BOROUGH( 0, "borough", "borough" ),

    /**
     * The '<em><b>County</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COUNTY_VALUE
     * @generated
     * @ordered
     */
    COUNTY( 1, "county", "county" ),

    /**
     * The '<em><b>Parish</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PARISH_VALUE
     * @generated
     * @ordered
     */
    PARISH( 2, "parish", "parish" ),

    /**
     * The '<em><b>Service Area</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SERVICE_AREA_VALUE
     * @generated
     * @ordered
     */
    SERVICE_AREA( 3, "serviceArea", "serviceArea" ),

    /**
     * The '<em><b>State</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STATE_VALUE
     * @generated
     * @ordered
     */
    STATE( 4, "state", "state" ),

    /**
     * The '<em><b>Township</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOWNSHIP_VALUE
     * @generated
     * @ordered
     */
    TOWNSHIP( 5, "township", "township" ),

    /**
     * The '<em><b>Ward</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WARD_VALUE
     * @generated
     * @ordered
     */
    WARD( 6, "ward", "ward" ),

    /**
     * The '<em><b>Zipcode</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ZIPCODE_VALUE
     * @generated
     * @ordered
     */
    ZIPCODE( 7, "zipcode", "zipcode" );

    /**
     * The '<em><b>Borough</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Borough</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BOROUGH
     * @model name="borough"
     * @generated
     * @ordered
     */
    public static final int BOROUGH_VALUE = 0;

    /**
     * The '<em><b>County</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>County</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COUNTY
     * @model name="county"
     * @generated
     * @ordered
     */
    public static final int COUNTY_VALUE = 1;

    /**
     * The '<em><b>Parish</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Parish</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PARISH
     * @model name="parish"
     * @generated
     * @ordered
     */
    public static final int PARISH_VALUE = 2;

    /**
     * The '<em><b>Service Area</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Service Area</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SERVICE_AREA
     * @model name="serviceArea"
     * @generated
     * @ordered
     */
    public static final int SERVICE_AREA_VALUE = 3;

    /**
     * The '<em><b>State</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>State</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STATE
     * @model name="state"
     * @generated
     * @ordered
     */
    public static final int STATE_VALUE = 4;

    /**
     * The '<em><b>Township</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Township</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TOWNSHIP
     * @model name="township"
     * @generated
     * @ordered
     */
    public static final int TOWNSHIP_VALUE = 5;

    /**
     * The '<em><b>Ward</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ward</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WARD
     * @model name="ward"
     * @generated
     * @ordered
     */
    public static final int WARD_VALUE = 6;

    /**
     * The '<em><b>Zipcode</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Zipcode</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ZIPCODE
     * @model name="zipcode"
     * @generated
     * @ordered
     */
    public static final int ZIPCODE_VALUE = 7;

    /**
     * An array of all the '<em><b>Area Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AreaKind[] VALUES_ARRAY = new AreaKind[] { BOROUGH, COUNTY, PARISH, SERVICE_AREA, STATE,
            TOWNSHIP, WARD, ZIPCODE, };

    /**
     * A public read-only list of all the '<em><b>Area Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< AreaKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Area Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AreaKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AreaKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Area Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AreaKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AreaKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Area Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AreaKind get( int value ) {
        switch( value ) {
        case BOROUGH_VALUE:
            return BOROUGH;
        case COUNTY_VALUE:
            return COUNTY;
        case PARISH_VALUE:
            return PARISH;
        case SERVICE_AREA_VALUE:
            return SERVICE_AREA;
        case STATE_VALUE:
            return STATE;
        case TOWNSHIP_VALUE:
            return TOWNSHIP;
        case WARD_VALUE:
            return WARD;
        case ZIPCODE_VALUE:
            return ZIPCODE;
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
    private AreaKind( int value, String name, String literal ) {
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

} //AreaKind
