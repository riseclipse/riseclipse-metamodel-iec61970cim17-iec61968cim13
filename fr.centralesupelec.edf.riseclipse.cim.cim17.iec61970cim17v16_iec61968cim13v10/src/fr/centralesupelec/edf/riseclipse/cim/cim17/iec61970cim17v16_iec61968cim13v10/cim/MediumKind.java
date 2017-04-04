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
 * A representation of the literals of the enumeration '<em><b>Medium Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMediumKind()
 * @model
 * @generated
 */
public enum MediumKind implements Enumerator {
    /**
     * The '<em><b>Air</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AIR_VALUE
     * @generated
     * @ordered
     */
    AIR( 0, "air", "air" ),

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
     * The '<em><b>Liquid</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LIQUID_VALUE
     * @generated
     * @ordered
     */
    LIQUID( 2, "liquid", "liquid" ),

    /**
     * The '<em><b>Mineral Oil</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MINERAL_OIL_VALUE
     * @generated
     * @ordered
     */
    MINERAL_OIL( 3, "mineralOil", "mineralOil" ),

    /**
     * The '<em><b>SF6</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SF6_VALUE
     * @generated
     * @ordered
     */
    SF6( 4, "SF6", "SF6" ),

    /**
     * The '<em><b>SF6CF4</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SF6CF4_VALUE
     * @generated
     * @ordered
     */
    SF6CF4( 5, "SF6CF4", "SF6CF4" ),

    /**
     * The '<em><b>SF6N2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SF6N2_VALUE
     * @generated
     * @ordered
     */
    SF6N2( 6, "SF6N2", "SF6N2" ),

    /**
     * The '<em><b>Solid</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOLID_VALUE
     * @generated
     * @ordered
     */
    SOLID( 7, "solid", "solid" );

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
    public static final int AIR_VALUE = 0;

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
     * The '<em><b>Liquid</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Liquid</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LIQUID
     * @model name="liquid"
     * @generated
     * @ordered
     */
    public static final int LIQUID_VALUE = 2;

    /**
     * The '<em><b>Mineral Oil</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mineral Oil</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MINERAL_OIL
     * @model name="mineralOil"
     * @generated
     * @ordered
     */
    public static final int MINERAL_OIL_VALUE = 3;

    /**
     * The '<em><b>SF6</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SF6</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SF6
     * @model
     * @generated
     * @ordered
     */
    public static final int SF6_VALUE = 4;

    /**
     * The '<em><b>SF6CF4</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SF6CF4</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SF6CF4
     * @model
     * @generated
     * @ordered
     */
    public static final int SF6CF4_VALUE = 5;

    /**
     * The '<em><b>SF6N2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SF6N2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SF6N2
     * @model
     * @generated
     * @ordered
     */
    public static final int SF6N2_VALUE = 6;

    /**
     * The '<em><b>Solid</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Solid</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SOLID
     * @model name="solid"
     * @generated
     * @ordered
     */
    public static final int SOLID_VALUE = 7;

    /**
     * An array of all the '<em><b>Medium Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final MediumKind[] VALUES_ARRAY = new MediumKind[] { AIR, GAS, LIQUID, MINERAL_OIL, SF6, SF6CF4,
            SF6N2, SOLID, };

    /**
     * A public read-only list of all the '<em><b>Medium Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< MediumKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Medium Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MediumKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            MediumKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Medium Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MediumKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            MediumKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Medium Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MediumKind get( int value ) {
        switch( value ) {
        case AIR_VALUE:
            return AIR;
        case GAS_VALUE:
            return GAS;
        case LIQUID_VALUE:
            return LIQUID;
        case MINERAL_OIL_VALUE:
            return MINERAL_OIL;
        case SF6_VALUE:
            return SF6;
        case SF6CF4_VALUE:
            return SF6CF4;
        case SF6N2_VALUE:
            return SF6N2;
        case SOLID_VALUE:
            return SOLID;
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
    private MediumKind( int value, String name, String literal ) {
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

} //MediumKind
