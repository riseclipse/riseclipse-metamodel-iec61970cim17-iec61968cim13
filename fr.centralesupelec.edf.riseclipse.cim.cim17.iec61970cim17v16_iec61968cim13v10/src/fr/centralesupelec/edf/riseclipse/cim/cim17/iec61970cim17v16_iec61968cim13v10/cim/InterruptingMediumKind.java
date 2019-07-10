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
 * A representation of the literals of the enumeration '<em><b>Interrupting Medium Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInterruptingMediumKind()
 * @model
 * @generated
 */
public enum InterruptingMediumKind implements Enumerator {
    /**
     * The '<em><b>Air Blast</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AIR_BLAST_VALUE
     * @generated
     * @ordered
     */
    AIR_BLAST( 0, "airBlast", "airBlast" ),

    /**
     * The '<em><b>Air Magnetic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AIR_MAGNETIC_VALUE
     * @generated
     * @ordered
     */
    AIR_MAGNETIC( 1, "airMagnetic", "airMagnetic" ),

    /**
     * The '<em><b>Gas Two Pressure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GAS_TWO_PRESSURE_VALUE
     * @generated
     * @ordered
     */
    GAS_TWO_PRESSURE( 2, "gasTwoPressure", "gasTwoPressure" ),

    /**
     * The '<em><b>Gas Single Pressure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GAS_SINGLE_PRESSURE_VALUE
     * @generated
     * @ordered
     */
    GAS_SINGLE_PRESSURE( 3, "gasSinglePressure", "gasSinglePressure" ),

    /**
     * The '<em><b>Bulk Oil</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BULK_OIL_VALUE
     * @generated
     * @ordered
     */
    BULK_OIL( 4, "bulkOil", "bulkOil" ),

    /**
     * The '<em><b>Minimum Oil</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MINIMUM_OIL_VALUE
     * @generated
     * @ordered
     */
    MINIMUM_OIL( 5, "minimumOil", "minimumOil" ),

    /**
     * The '<em><b>Vacuum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VACUUM_VALUE
     * @generated
     * @ordered
     */
    VACUUM( 6, "vacuum", "vacuum" );

    /**
     * The '<em><b>Air Blast</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Air Blast</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AIR_BLAST
     * @model name="airBlast"
     * @generated
     * @ordered
     */
    public static final int AIR_BLAST_VALUE = 0;

    /**
     * The '<em><b>Air Magnetic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Air Magnetic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AIR_MAGNETIC
     * @model name="airMagnetic"
     * @generated
     * @ordered
     */
    public static final int AIR_MAGNETIC_VALUE = 1;

    /**
     * The '<em><b>Gas Two Pressure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Gas Two Pressure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GAS_TWO_PRESSURE
     * @model name="gasTwoPressure"
     * @generated
     * @ordered
     */
    public static final int GAS_TWO_PRESSURE_VALUE = 2;

    /**
     * The '<em><b>Gas Single Pressure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Gas Single Pressure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GAS_SINGLE_PRESSURE
     * @model name="gasSinglePressure"
     * @generated
     * @ordered
     */
    public static final int GAS_SINGLE_PRESSURE_VALUE = 3;

    /**
     * The '<em><b>Bulk Oil</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bulk Oil</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BULK_OIL
     * @model name="bulkOil"
     * @generated
     * @ordered
     */
    public static final int BULK_OIL_VALUE = 4;

    /**
     * The '<em><b>Minimum Oil</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Minimum Oil</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MINIMUM_OIL
     * @model name="minimumOil"
     * @generated
     * @ordered
     */
    public static final int MINIMUM_OIL_VALUE = 5;

    /**
     * The '<em><b>Vacuum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Vacuum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VACUUM
     * @model name="vacuum"
     * @generated
     * @ordered
     */
    public static final int VACUUM_VALUE = 6;

    /**
     * An array of all the '<em><b>Interrupting Medium Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final InterruptingMediumKind[] VALUES_ARRAY = new InterruptingMediumKind[] { AIR_BLAST, AIR_MAGNETIC,
            GAS_TWO_PRESSURE, GAS_SINGLE_PRESSURE, BULK_OIL, MINIMUM_OIL, VACUUM, };

    /**
     * A public read-only list of all the '<em><b>Interrupting Medium Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< InterruptingMediumKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Interrupting Medium Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InterruptingMediumKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            InterruptingMediumKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Interrupting Medium Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InterruptingMediumKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            InterruptingMediumKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Interrupting Medium Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InterruptingMediumKind get( int value ) {
        switch( value ) {
        case AIR_BLAST_VALUE:
            return AIR_BLAST;
        case AIR_MAGNETIC_VALUE:
            return AIR_MAGNETIC;
        case GAS_TWO_PRESSURE_VALUE:
            return GAS_TWO_PRESSURE;
        case GAS_SINGLE_PRESSURE_VALUE:
            return GAS_SINGLE_PRESSURE;
        case BULK_OIL_VALUE:
            return BULK_OIL;
        case MINIMUM_OIL_VALUE:
            return MINIMUM_OIL;
        case VACUUM_VALUE:
            return VACUUM;
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
    private InterruptingMediumKind( int value, String name, String literal ) {
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

} //InterruptingMediumKind
