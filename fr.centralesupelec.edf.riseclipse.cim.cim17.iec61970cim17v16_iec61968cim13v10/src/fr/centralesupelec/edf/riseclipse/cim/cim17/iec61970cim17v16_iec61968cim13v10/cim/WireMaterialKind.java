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
 * A representation of the literals of the enumeration '<em><b>Wire Material Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireMaterialKind()
 * @model
 * @generated
 */
public enum WireMaterialKind implements Enumerator {
    /**
     * The '<em><b>Copper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COPPER_VALUE
     * @generated
     * @ordered
     */
    COPPER( 0, "copper", "copper" ),

    /**
     * The '<em><b>Steel</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STEEL_VALUE
     * @generated
     * @ordered
     */
    STEEL( 1, "steel", "steel" ),

    /**
     * The '<em><b>Aluminum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ALUMINUM_VALUE
     * @generated
     * @ordered
     */
    ALUMINUM( 2, "aluminum", "aluminum" ),

    /**
     * The '<em><b>Aluminum Steel</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ALUMINUM_STEEL_VALUE
     * @generated
     * @ordered
     */
    ALUMINUM_STEEL( 3, "aluminumSteel", "aluminumSteel" ),

    /**
     * The '<em><b>Acsr</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ACSR_VALUE
     * @generated
     * @ordered
     */
    ACSR( 4, "acsr", "acsr" ),

    /**
     * The '<em><b>Aluminum Alloy</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ALUMINUM_ALLOY_VALUE
     * @generated
     * @ordered
     */
    ALUMINUM_ALLOY( 5, "aluminumAlloy", "aluminumAlloy" ),

    /**
     * The '<em><b>Aluminum Alloy Steel</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ALUMINUM_ALLOY_STEEL_VALUE
     * @generated
     * @ordered
     */
    ALUMINUM_ALLOY_STEEL( 6, "aluminumAlloySteel", "aluminumAlloySteel" ),

    /**
     * The '<em><b>Aaac</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AAAC_VALUE
     * @generated
     * @ordered
     */
    AAAC( 7, "aaac", "aaac" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 8, "other", "other" );

    /**
     * The '<em><b>Copper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Copper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COPPER
     * @model name="copper"
     * @generated
     * @ordered
     */
    public static final int COPPER_VALUE = 0;

    /**
     * The '<em><b>Steel</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Steel</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STEEL
     * @model name="steel"
     * @generated
     * @ordered
     */
    public static final int STEEL_VALUE = 1;

    /**
     * The '<em><b>Aluminum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Aluminum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ALUMINUM
     * @model name="aluminum"
     * @generated
     * @ordered
     */
    public static final int ALUMINUM_VALUE = 2;

    /**
     * The '<em><b>Aluminum Steel</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Aluminum Steel</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ALUMINUM_STEEL
     * @model name="aluminumSteel"
     * @generated
     * @ordered
     */
    public static final int ALUMINUM_STEEL_VALUE = 3;

    /**
     * The '<em><b>Acsr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Acsr</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ACSR
     * @model name="acsr"
     * @generated
     * @ordered
     */
    public static final int ACSR_VALUE = 4;

    /**
     * The '<em><b>Aluminum Alloy</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Aluminum Alloy</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ALUMINUM_ALLOY
     * @model name="aluminumAlloy"
     * @generated
     * @ordered
     */
    public static final int ALUMINUM_ALLOY_VALUE = 5;

    /**
     * The '<em><b>Aluminum Alloy Steel</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Aluminum Alloy Steel</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ALUMINUM_ALLOY_STEEL
     * @model name="aluminumAlloySteel"
     * @generated
     * @ordered
     */
    public static final int ALUMINUM_ALLOY_STEEL_VALUE = 6;

    /**
     * The '<em><b>Aaac</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Aaac</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AAAC
     * @model name="aaac"
     * @generated
     * @ordered
     */
    public static final int AAAC_VALUE = 7;

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
    public static final int OTHER_VALUE = 8;

    /**
     * An array of all the '<em><b>Wire Material Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WireMaterialKind[] VALUES_ARRAY = new WireMaterialKind[] { COPPER, STEEL, ALUMINUM,
            ALUMINUM_STEEL, ACSR, ALUMINUM_ALLOY, ALUMINUM_ALLOY_STEEL, AAAC, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Wire Material Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< WireMaterialKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Wire Material Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WireMaterialKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WireMaterialKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wire Material Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WireMaterialKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WireMaterialKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wire Material Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WireMaterialKind get( int value ) {
        switch( value ) {
        case COPPER_VALUE:
            return COPPER;
        case STEEL_VALUE:
            return STEEL;
        case ALUMINUM_VALUE:
            return ALUMINUM;
        case ALUMINUM_STEEL_VALUE:
            return ALUMINUM_STEEL;
        case ACSR_VALUE:
            return ACSR;
        case ALUMINUM_ALLOY_VALUE:
            return ALUMINUM_ALLOY;
        case ALUMINUM_ALLOY_STEEL_VALUE:
            return ALUMINUM_ALLOY_STEEL;
        case AAAC_VALUE:
            return AAAC;
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
    private WireMaterialKind( int value, String name, String literal ) {
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

} //WireMaterialKind
