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
 * A representation of the literals of the enumeration '<em><b>Fuel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFuelType()
 * @model
 * @generated
 */
public enum FuelType implements Enumerator {
    /**
     * The '<em><b>Coal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COAL_VALUE
     * @generated
     * @ordered
     */
    COAL( 0, "coal", "coal" ),

    /**
     * The '<em><b>Oil</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OIL_VALUE
     * @generated
     * @ordered
     */
    OIL( 1, "oil", "oil" ),

    /**
     * The '<em><b>Gas</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GAS_VALUE
     * @generated
     * @ordered
     */
    GAS( 2, "gas", "gas" ),

    /**
     * The '<em><b>Lignite</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LIGNITE_VALUE
     * @generated
     * @ordered
     */
    LIGNITE( 3, "lignite", "lignite" ),

    /**
     * The '<em><b>Hard Coal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HARD_COAL_VALUE
     * @generated
     * @ordered
     */
    HARD_COAL( 4, "hardCoal", "hardCoal" ),

    /**
     * The '<em><b>Oil Shale</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OIL_SHALE_VALUE
     * @generated
     * @ordered
     */
    OIL_SHALE( 5, "oilShale", "oilShale" );

    /**
     * The '<em><b>Coal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Coal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COAL
     * @model name="coal"
     * @generated
     * @ordered
     */
    public static final int COAL_VALUE = 0;

    /**
     * The '<em><b>Oil</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oil</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OIL
     * @model name="oil"
     * @generated
     * @ordered
     */
    public static final int OIL_VALUE = 1;

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
    public static final int GAS_VALUE = 2;

    /**
     * The '<em><b>Lignite</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Lignite</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LIGNITE
     * @model name="lignite"
     * @generated
     * @ordered
     */
    public static final int LIGNITE_VALUE = 3;

    /**
     * The '<em><b>Hard Coal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hard Coal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HARD_COAL
     * @model name="hardCoal"
     * @generated
     * @ordered
     */
    public static final int HARD_COAL_VALUE = 4;

    /**
     * The '<em><b>Oil Shale</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oil Shale</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OIL_SHALE
     * @model name="oilShale"
     * @generated
     * @ordered
     */
    public static final int OIL_SHALE_VALUE = 5;

    /**
     * An array of all the '<em><b>Fuel Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final FuelType[] VALUES_ARRAY = new FuelType[] { COAL, OIL, GAS, LIGNITE, HARD_COAL, OIL_SHALE, };

    /**
     * A public read-only list of all the '<em><b>Fuel Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< FuelType > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Fuel Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FuelType get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            FuelType result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Fuel Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FuelType getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            FuelType result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Fuel Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FuelType get( int value ) {
        switch( value ) {
        case COAL_VALUE:
            return COAL;
        case OIL_VALUE:
            return OIL;
        case GAS_VALUE:
            return GAS;
        case LIGNITE_VALUE:
            return LIGNITE;
        case HARD_COAL_VALUE:
            return HARD_COAL;
        case OIL_SHALE_VALUE:
            return OIL_SHALE;
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
    private FuelType( int value, String name, String literal ) {
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

} //FuelType
